package com.happybuy.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.happybuy.dto.ResponseDTO;
import com.happybuy.dto.UserDTO;
import com.happybuy.model.Review;
import com.happybuy.model.User;
import com.happybuy.reference.ErrorMessage;
import com.happybuy.service.UserService;

import java.security.Principal;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by fan.jin on 2016-10-15.
 */

@RestController
@RequestMapping(value = "/rest", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(method = GET, value = "/user/{userId}")
	@PreAuthorize("hasRole('ADMIN')")
	public User loadById(@PathVariable Long userId) {
		return this.userService.findById(userId);
	}

	@RequestMapping(method = GET, value = "/user/all")
	@PreAuthorize("hasRole('ADMIN')")
	public List<User> loadAll() {
		return this.userService.findAll();
	}

	/*
	 * We are not using userService.findByUsername here(we could), so it is good
	 * that we are making sure that the user has role "ROLE_USER" to access this
	 * endpoint.
	 */
	@RequestMapping("/whoami")
	@PreAuthorize("hasRole('USER')")
	public User user(Principal user) {
		return this.userService.findByUsername(user.getName());
	}

	private ResponseDTO<Boolean> validate(UserDTO userDTO) {
		ResponseDTO<Boolean> responseDTO = new ResponseDTO<Boolean>();
		responseDTO.setData(false);
		if (userDTO.getEmail().length() == 0 || userDTO.getEmail().isEmpty()) {
			responseDTO.setErrorMessage(ErrorMessage.ERROR_EMAIL_EMPTY);
		} else if (userDTO.getPassword().length() == 0 || userDTO.getPassword().isEmpty()) {
			responseDTO.setErrorMessage(ErrorMessage.ERROR_PASSWORD_EMPTY);
		} else if (userDTO.getPassword().length() < 8) {
			responseDTO.setErrorMessage(ErrorMessage.ERROR_PASSWORD_INVALID);
		} else {
			responseDTO.setData(true);
		}
		return responseDTO;
	}

	@RequestMapping(value = "/no-auth/register", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<ResponseDTO<Boolean>> save(@RequestBody UserDTO userDTO) {
		ResponseDTO<Boolean> responseDTO = validate(userDTO);
		if (!responseDTO.getData()) {
			return new ResponseEntity<ResponseDTO<Boolean>>(responseDTO, HttpStatus.BAD_REQUEST);
		} else {
			User user = userDTO.copyTo();
			userService.save(user);
			if (!responseDTO.getData()) {
				return new ResponseEntity<ResponseDTO<Boolean>>(responseDTO, HttpStatus.BAD_REQUEST);
			}
			return new ResponseEntity<ResponseDTO<Boolean>>(responseDTO, HttpStatus.OK);
		}
	}
}
