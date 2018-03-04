package com.niit.ecommerce_backend.dao;

import java.util.List;

import com.niit.ecommerce_backend.dto.Category;

public interface Categorydao {
	
	
Category get(int id);
List<Category> list();
boolean add(Category category);
boolean update(Category category);
boolean delete(Category category);
}

