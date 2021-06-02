package com.example.demo.exception;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class AppExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(value = { Exception.class })
	public ResponseEntity<Object> handleAnyException(Exception ex, WebRequest request) {
		String errorMessage = ex.getLocalizedMessage();
		if (errorMessage == null)
			errorMessage = ex.toString();
		ErrorMessage errMessage = new ErrorMessage(new Date(), errorMessage);
		return new ResponseEntity<>(errMessage, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(value = { NullPointerException.class })
	public ResponseEntity<Object> handleNullPointerException(Exception ex, WebRequest request) {
		String errorMessage = ex.getLocalizedMessage();
		if (errorMessage == null)
			errorMessage = ex.toString();
		ErrorMessage errMessage = new ErrorMessage(new Date(), errorMessage);
		return new ResponseEntity<>(errMessage, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
