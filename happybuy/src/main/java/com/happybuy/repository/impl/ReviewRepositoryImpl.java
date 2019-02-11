package com.happybuy.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.happybuy.model.Review;
import com.happybuy.repository.ReviewRepository;

@Repository
public class ReviewRepositoryImpl implements ReviewRepository{
	@Autowired
	EntityManager em;
	
	@Override
	public List<Review> findAll() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Review> cq = cb.createQuery(Review.class);
		Root<Review> root = cq.from(Review.class);
		cq.select(root);
		Query query = em.createQuery(cq);
		return query.getResultList();
	}

	@Override
	public List<Review> findByProd(int id) {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Review> cq = cb.createQuery(Review.class);
		Root<Review> root = cq.from(Review.class);
		cq.select(root);
		cq.where(cb.equal(root.get("product").get("id"), id));
		Query query = em.createQuery(cq);
		List<Review> reviews = query.getResultList();
		return reviews;		
	}
	
}
