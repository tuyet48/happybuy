package com.happybuy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.happybuy.model.Post;

public interface PostRepository extends JpaRepository<Post, Integer>{
	

}

//Controller(rest) -> Service(bus) -> Repository(dao)