package com.asha.customerInsight.Service;

import java.util.List;

import com.asha.customerInsight.Dto.Customer;

public interface CustomerService 

{
	
	public String insert(Customer customer);
	
	public Customer getById(Long id);
	
	public List<Customer> getAll();
	
	public String update(Customer customer);
	
	public String deleteById(Long id);
	
}
