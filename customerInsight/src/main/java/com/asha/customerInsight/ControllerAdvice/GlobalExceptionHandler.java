package com.asha.customerInsight.ControllerAdvice;

import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.asha.customerInsight.Exception.CustomerAlreadyExistsException;
import com.asha.customerInsight.Exception.ErrorResponse;
import com.asha.customerInsight.Exception.NoSuchCustomerExistsException;

@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(value
            = NoSuchCustomerExistsException.class)
@ResponseStatus(HttpStatus.BAD_REQUEST)
public @ResponseBody ErrorResponse
handleException(NoSuchCustomerExistsException ex)
{
return new ErrorResponse(
  HttpStatus.BAD_REQUEST.value(), ex.getMessage());
}
	
@ExceptionHandler(value = CustomerAlreadyExistsException.class)
//@ResponseBody 
//@ResponseStatus(HttpStatus.CONFLICT)
//	public  ResponseEntity<ErrorResponse> handleCustomerAlreadyExistsException(CustomerAlreadyExistsException ex) {
////		return new ErrorResponse(HttpStatus.CONFLICT.value(), ex.getMessage());
//	return ResponseEntity.status(HttpStatus.CONFLICT).body(new ErrorResponse(HttpStatus.CONFLICT.value(), ex.getMessage()));
//	}
@ResponseStatus(HttpStatus.CONFLICT)
public @ResponseBody ErrorResponse
handleCustomerAlreadyExistsException(CustomerAlreadyExistsException ex)
{
return new ErrorResponse(
  HttpStatus.CONFLICT.value(), ex.getMessage());
}
}
