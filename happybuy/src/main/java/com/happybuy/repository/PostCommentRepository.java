package com.happybuy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.happybuy.model.PostComment;

public interface PostCommentRepository extends JpaRepository<PostComment, Integer> {

}
