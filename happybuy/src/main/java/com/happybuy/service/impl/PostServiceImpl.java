package com.happybuy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.stereotype.Service;

import com.happybuy.model.Post;
import com.happybuy.repository.PostRepository;
import com.happybuy.service.PostService;

@Service
public class PostServiceImpl implements PostService{
	@Autowired
	private PostRepository postRepository;	

	@Override
	public List<Post> findAll() throws AccessDeniedException{
		List<Post> result = postRepository.findAll();		
		return result;
	}
}
