package com.teja.bank.dao;

import org.springframework.dao.DataAccessException;

import com.teja.bank.model.Customer;

public interface CustomerDao {
	public Customer authenticate(Customer customer)throws DataAccessException;
	public Customer updateProfile(Customer customer);
	public boolean updatePassword(Customer customer, String oldPassword, String newPassword);
}
