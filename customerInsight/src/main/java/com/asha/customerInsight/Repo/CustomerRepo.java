package com.asha.customerInsight.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asha.customerInsight.Dto.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Long>{
	
	 public static final String messsgae = "hi am from repo";
	public static String repo()
	{
		
		return messsgae;
	}

}
