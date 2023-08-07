package com.asha.customerInsight.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asha.customerInsight.Dto.Customer;
import com.asha.customerInsight.Exception.CustomerAlreadyExistsException;
import com.asha.customerInsight.Exception.NoSuchCustomerExistsException;
import com.asha.customerInsight.Repo.CustomerRepo;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepo repo;

	@Override
	public String insert(Customer customer) {

		Customer existingCustomer = repo.findById(customer.getId()).orElse(null);
		if (existingCustomer == null) {
			repo.save(customer);
			return "Customer added successfully";
		} else
			throw new CustomerAlreadyExistsException("Customer already exists!!");
	}

	@Override
	public Customer getById(Long id) {
		return repo.findById(id)
				.orElseThrow(() -> new NoSuchCustomerExistsException("no such customer exist on this id no:" + id));
	}

	@Override
	public List<Customer> getAll() {
		return repo.findAll();
	}

	@Override
	public String update(Customer customer) {
		Customer existingCustomer = repo.findById(customer.getId()).orElse(null);
		if (existingCustomer == null)
			throw new NoSuchCustomerExistsException("No Such Customer exists!!");
		else {
			existingCustomer.setName(customer.getName());
			existingCustomer.setAddress(customer.getAddress());
			repo.save(existingCustomer);
			return "Record updated Successfully";

		}
	}

	@Override
	public String deleteById(Long id) {

		if (id != null) {
			repo.deleteById(id);

			return "deleted successfully";
		} else {
			throw new NoSuchCustomerExistsException("no customer is found:" + id);
		}

	}
}