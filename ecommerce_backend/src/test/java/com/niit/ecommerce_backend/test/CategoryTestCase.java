package com.niit.ecommerce_backend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.ecommerce_backend.dao.Categorydao;
import com.niit.ecommerce_backend.dto.Category;

public class CategoryTestCase {
private static AnnotationConfigApplicationContext context;
private static Categorydao categorydao;
private Category category;

@BeforeClass
public static void init(){
	context=new AnnotationConfigApplicationContext();
	context.scan("com.niit.ecommerce_backend");
	context.refresh();
	categorydao=(Categorydao)context.getBean("categorydao");
	
}

/*@Test
public void testAddCategory(){
	category=new Category();
	category.setName("Television");
	category.setDescription("This is some description for television");
	category.setImageURL("CAT_1.png");
	assertEquals("Successfully added a category inside the table!",true,categorydao.add(category));
	
	
	
	
}

*/
/*
@Test
public void testGetCategory(){
category=categorydao.get(4);
assertEquals("Successfully fetched a single category from the table!","Television",category.getName());		
	
}*/

/*@Test
public void testUpdateCategory(){
category=categorydao.get(4);
category.setName("TV");
assertEquals("Successfully fetched a single category in the table!",true,categorydao.update(category));		
	
}*/

/*@Test
public void testDeleteCategory(){
category=categorydao.get(4);

assertEquals("Successfully deleted a single category inside the table!",true,categorydao.delete(category));		
	
}*/


/*@Test
public void testListCategory(){
category=categorydao.get(4);

assertEquals("Successfully fetched the list of categories from the table!",3,categorydao.list().size());		
	
}*/

@Test

public void testCRUDCategory(){
	category=new Category();
	category.setName("LapTop");
	category.setDescription("This is some description for LapTop");
	category.setImageURL("CAT_1.png");
	assertEquals("Successfully added a category inside the table!",true,categorydao.add(category));
	category=new Category();
	category.setName("Television");
	category.setDescription("This is some description for television");
	category.setImageURL("CAT_2.png");
	assertEquals("Successfully added a category inside the table!",true,categorydao.add(category));
	category=categorydao.get(1);
	category.setName("Lap");
	assertEquals("Successfully fetched a single category in the table!",true,categorydao.update(category));		
	assertEquals("Successfully deleted a single category inside the table!",true,categorydao.delete(category));		
	assertEquals("Successfully fetched the list of categories from the table!",1,categorydao.list().size());		
	



}

}
