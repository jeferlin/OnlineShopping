package com.niit.ecommerce_backend.dao;

import java.util.List;

import com.niit.ecommerce_backend.dto.Category;

public interface Categorydao {
List<Category> list();
Category get(int id);
}
