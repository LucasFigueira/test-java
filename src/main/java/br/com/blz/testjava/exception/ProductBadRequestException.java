package br.com.blz.testjava.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST) 
public class ProductBadRequestException extends RuntimeException{
	
		private static final long serialVersionUID = 1L;

	    public ProductBadRequestException() {
	        super();
	    }
} 
