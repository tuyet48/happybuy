package com.happybuy.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.happybuy.model.PostComment;
import com.happybuy.service.PostCommentService;

@RestController
@RequestMapping(value = "/auth")
public class PostCommentController {
	
	@Autowired
	private PostCommentService postCommentService;
	
	@RequestMapping(value="comments", method=RequestMethod.GET)
	@ResponseBody
	public List<PostComment> getInfo() {
		return this.postCommentService.findAll();	
	}
}
