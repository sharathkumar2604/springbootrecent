package com.asha.customerInsight.Exception;

public class CustomerAlreadyExistsException extends RuntimeException{

	private String message;
	 
    public CustomerAlreadyExistsException() {}
 
    public CustomerAlreadyExistsException(String msg)
    {
        super(msg);
        this.message = msg;
        System.out.println("Customer Already Exit Class");
    }
}
