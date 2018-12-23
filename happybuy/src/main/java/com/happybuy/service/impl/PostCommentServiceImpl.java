package com.happybuy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.stereotype.Service;

import com.happybuy.model.PostComment;
import com.happybuy.repository.PostCommentRepository;
import com.happybuy.service.PostCommentService;

@Service
public class PostCommentServiceImpl implements PostCommentService{

	@Autowired
	private PostCommentRepository postCommentRepository; 
	
	@Override
	public List<PostComment> findAll() throws AccessDeniedException {
		return postCommentRepository.findAll();
	}
	
}
