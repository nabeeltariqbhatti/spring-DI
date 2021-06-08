package com.exam.springmvcjohnthompson.service;

import java.util.List;

import com.exam.springmvcjohnthompson.model.Product;

public interface ProductService {

	List<Product> listAllProducts();

	Product getProductById(Integer id);

}
