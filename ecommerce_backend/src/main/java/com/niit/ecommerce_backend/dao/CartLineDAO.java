package com.niit.ecommerce_backend.dao;
import java.util.List;

import com.niit.ecommerce_backend.dto.Cart;
import com.niit.ecommerce_backend.dto.CartLine;
import com.niit.ecommerce_backend.dto.OrderDetail;

public interface CartLineDAO {
	public List<CartLine> list(int cartId);
	public CartLine get(int id);	
	public boolean add(CartLine cartLine);
	public boolean update(CartLine cartLine);
	public boolean remove(CartLine cartLine);
	
	// fetch the CartLine based on cartId and productId
	public CartLine getByCartAndProduct(int cartId, int productId);		
		
	// updating the cart
	boolean updateCart(Cart cart);
	
	// list of available cartLine
	public List<CartLine> listAvailable(int cartId);
	
	// adding order details
	boolean addOrderDetail(OrderDetail orderDetail);

	
}


