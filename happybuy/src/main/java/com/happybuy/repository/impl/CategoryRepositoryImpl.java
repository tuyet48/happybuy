package com.happybuy.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.happybuy.model.Category;
import com.happybuy.repository.CategoryRepository;

@Repository
public class CategoryRepositoryImpl implements CategoryRepository{
	
	/*em:
	 * select=>cq;
	 * from=>T
	 * where=>cb
	 */
	@Autowired
	EntityManager em; 
	
	@Override
	public List<Category> findAll() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Category> cq = cb.createQuery(Category.class);
		Root<Category> root = cq.from(Category.class);
		cq.select(root);
		Query query = em.createQuery(cq);
		return query.getResultList();
	}
}
