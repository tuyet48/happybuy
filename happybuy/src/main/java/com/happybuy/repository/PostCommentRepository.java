package com.happybuy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.happybuy.model.Review;

public interface PostCommentRepository extends JpaRepository<Review, Integer> {

}
