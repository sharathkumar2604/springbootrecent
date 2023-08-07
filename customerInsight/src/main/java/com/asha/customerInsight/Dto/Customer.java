package com.asha.customerInsight.Dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.validator.constraints.UniqueElements;
import org.springframework.context.annotation.Primary;

@Entity
@Table(name="customerinsight")
public class Customer {
	@Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @PrimaryKeyJoinColumn
	private Long id;
//	@UniqueElements
    private String name;
//    @UniqueElements
	private String address;
	public Customer() {
System.out.println("i am default constructor");
}
	public Customer(Long id, String name, String address) {
System.out.println("i am parameter constructor");
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

    
    
}
