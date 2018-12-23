package com.happybuy.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.happybuy.model.Post;
import com.happybuy.service.PostService;

@RestController
@RequestMapping("/auth/")
public class PostController {
	
	@Autowired
	private PostService postService;
	
	@RequestMapping(value="list", method=RequestMethod.GET)
	@ResponseBody
	public List<Post> getInfo() {
		return this.postService.findAll();	
	}	
	
}
	
	


