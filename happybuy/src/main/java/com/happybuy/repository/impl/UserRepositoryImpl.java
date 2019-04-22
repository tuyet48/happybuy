package com.happybuy.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.happybuy.model.Review;
import com.happybuy.model.User;
import com.happybuy.repository.UserRepository;

@Repository
public class UserRepositoryImpl implements UserRepository{

	@Autowired
	EntityManager em;
	
	@Override
	public User findByUsername(String username) {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<User> cq = cb.createQuery(User.class);
		Root<User> root = cq.from(User.class);
		cq.select(root);
		cq.where(cb.equal(root.get("email"), username));
		Query query = em.createQuery(cq);	
		if (query.getResultList().size() != 0) {
			return (User) query.getResultList().get(0);
		}
		return new User();		
	}

	@Override
	public User findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	@Transactional
	public boolean save(User user) {
		em.persist(user);
		return true;
	}	

}
