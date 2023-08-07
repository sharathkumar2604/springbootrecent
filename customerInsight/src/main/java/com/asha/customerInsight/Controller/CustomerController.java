package com.asha.customerInsight.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.asha.customerInsight.Dto.Customer;
import com.asha.customerInsight.Service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	

	@PostMapping("/addCustomer")
	public String addcustomer(@RequestBody Customer customer) {
		String status = customerService.insert(customer);
		
		
		return "success";
		
	}

	@GetMapping("/getCustomerById/{id}")
	public ResponseEntity<Customer> getCustomerById(@PathVariable Long id) {
		Customer byId = customerService.getById(id);
		return new ResponseEntity<>(byId, HttpStatus.OK);
	}

	@GetMapping("/getAllCustomers")
	public ResponseEntity<List<Customer>> AllgetCustomers() {
	 List<Customer> all = customerService.getAll();
	   
	return new ResponseEntity<>(all,HttpStatus.OK);
	}

	@PutMapping("/updateCustomer")
	public ResponseEntity<String> updateCustomer(@RequestBody Customer customer) {
		String update = customerService.update(customer);
		return new ResponseEntity<String>(update,HttpStatus.OK);

	}

	@DeleteMapping("/deleteById/{id}")
	public ResponseEntity<String> deleteById(@PathVariable Long id) {
		String deleteById = customerService.deleteById(id);
		return new ResponseEntity<String>(deleteById,HttpStatus.OK);

	}

//	@ExceptionHandler(value = CustomerAlreadyExistsException.class)
//	@ResponseStatus(HttpStatus.CONFLICT)
//	public ErrorResponse handleCustomerAlreadyExistsException(CustomerAlreadyExistsException ex) {
//		return new ErrorResponse(HttpStatus.CONFLICT.value(), ex.getMessage());
//	}
}
