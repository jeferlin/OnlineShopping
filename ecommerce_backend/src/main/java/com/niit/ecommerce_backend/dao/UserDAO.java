package com.niit.ecommerce_backend.dao;
import java.util.List;

import com.niit.ecommerce_backend.dto.Address;
import com.niit.ecommerce_backend.dto.User;

public interface UserDAO {
	// user related operation
		User getByEmail(String email);
		User get(int id);

		boolean add(User user);
		
		// adding and updating a new address
		Address getAddress(int addressId);
		boolean addAddress(Address address);
		boolean updateAddress(Address address);
		Address getBillingAddress(int userId);
		List<Address> listShippingAddresses(int userId);
		
}
