/**
 * 
 */
package com.promineotech.inventoryManagement.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.promineotech.inventoryManagement.service.ResourceNotFoundException;

/**
 * @author kimberlywatson
 *
 */

@RestControllerAdvice
public class GlobalErrorHandler {
	@ExceptionHandler(ResourceNotFoundException.class)
	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	public String handleResourceNotFoundException(ResourceNotFoundException e) {
		return "Uh, oh - resource " + e.getId() + " not found!";
	}
}
