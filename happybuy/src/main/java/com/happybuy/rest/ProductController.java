package com.happybuy.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.happybuy.dto.ProductDTO;
import com.happybuy.dto.RequestDataDTO;
import com.happybuy.model.Product;
import com.happybuy.service.ProductService;

@RestController
@RequestMapping("/no-auth/product/")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping(value = "find-all", method = RequestMethod.GET)
	@ResponseBody
	public List<ProductDTO> findAll(){
		List<Product> products = productService.findAll();
		List<ProductDTO> productDtos = new ArrayList<ProductDTO>();
		for (Product prod: products) {
			ProductDTO prodDto = new ProductDTO();
			prodDto.copy(prod);
			productDtos.add(prodDto);
		}
		return productDtos;
	}
	
	@RequestMapping(value = "find-id", method = RequestMethod.GET)
	@ResponseBody	
	public Product findProduct (@RequestParam("id") int id) {
		Product product = productService.findById(id);			
		return product;
	}

	@RequestMapping(value = "find-color", method = RequestMethod.GET)
	@ResponseBody
	public List<Product> findProductByColor(@RequestParam("color") String color, @RequestParam("name") String name) {
		List<Product> products = productService.findByColor(color, name);
		return products;
	}
	
	@RequestMapping(value = "find-size", method = RequestMethod.GET)
	@ResponseBody
	public List<Product> findProduct(@RequestParam("size") String size) {
		List<Product> products = productService.findBySize(size);
		return products;
	}
	
	@RequestMapping(value = "find-latest", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<Product>> findLatest(){		
		return null;	
		
	}
	
	@RequestMapping(value = "find-by-category", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<List<Product>> findProdByCate(@RequestBody RequestDataDTO<Integer> requestData){
		List<Product> products = productService.findProdByCate(requestData);
		if (products == null) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}else {			
			return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
		}		
	}	
	
	
}
