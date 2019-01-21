package com.happybuy.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.happybuy.dto.MetaData;
import com.happybuy.dto.RequestDataDTO;
import com.happybuy.model.Product;
import com.happybuy.repository.ProductRepository;

@Repository
public class ProductRepositoryImpl implements ProductRepository{

	@Autowired
	EntityManager em;	
	
	@Override
	public List<Product> findAll() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Product> cq = cb.createQuery(Product.class);
		Root<Product> root = cq.from(Product.class);
		cq.select(root);
		Query query = em.createQuery(cq);
		return query.getResultList();
	}

	@Override
	public List<Product> findById(int id) {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Product> cq = cb.createQuery(Product.class);
		Root<Product> root = cq.from(Product.class);
		cq.select(root);
		cq.where(cb.equal(root.get("id"), id));		
		Query query = em.createQuery(cq);
		List<Product>prodList = query.getResultList();
		return prodList;
	}

	@Override
	public List<Product> findByColor(String color, String name) {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Product> cq = cb.createQuery(Product.class);
		Root<Product> root = cq.from(Product.class);
		Predicate prodByColor = cb.like(root.get("color"), "%" + color + "%");
		Predicate prodByName = cb.equal(root.get("name"), name);
		cq.select(root);
		cq.where(cb.and(prodByColor, prodByName));	
		Query query = em.createQuery(cq);
		return query.getResultList();
	}

	/* Limit Offet*/
	@Override
	public List<Product> findBySize(String size) {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Product> cq = cb.createQuery(Product.class);
		Root<Product> root = cq.from(Product.class);
		cq.select(root);
		cq.where(cb.equal(root.get("size"), size));
		Query query = em.createQuery(cq);	
		return query.setFirstResult(1).setMaxResults(2).getResultList();
	}

	@Override
	public List<Product> findByCate(String cate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findLatest() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<Product> findProdByCate(RequestDataDTO<Integer> requestData) {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Product> cq = cb.createQuery(Product.class);
		Root<Product> root = cq.from(Product.class);
		cq.select(root);		
		cq.where(cb.equal(root.get("category").get("id"), requestData.getData()));
		Query query = em.createQuery(cq);		
		query.setFirstResult((requestData.getMetadata().getPageNumber() -1) * requestData.getMetadata().getPageSize());
		query.setMaxResults(requestData.getMetadata().getPageSize());
		return query.getResultList();	
	}

	@Override
	public int countPage(int categoryId) {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Product> cq = cb.createQuery(Product.class);
		Root<Product> root = cq.from(Product.class);
		cq.select(root);
		cq.where(cb.equal(root.get("category").get("id"), categoryId));
		Query query = em.createQuery(cq);		
		return query.getResultList().size();
	}	
	
}
