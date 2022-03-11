package com.project.food_donation.exception;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.sound.midi.Soundbank;

import org.springframework.dao.InvalidDataAccessApiUsageException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<?> handleResourceNotFoundException(ResourceNotFoundException exception, WebRequest request) {
		System.out.println("here");
		ErrorResponse errorResponse = new ErrorResponse(new Date(), exception.getMessage(),
				request.getDescription(false));
		return new ResponseEntity(errorResponse, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(ResourceNotAddedException.class)
	public ResponseEntity<?> handleResourceNotAddedException(ResourceNotAddedException exception, WebRequest request) {
		ErrorResponse errorResponse = new ErrorResponse(new Date(), exception.getMessage(),
				request.getDescription(false));
		return new ResponseEntity(errorResponse, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(BadCredentialException1.class)
	public ResponseEntity<?> handleBadCredentialException(BadCredentialException1 exception, WebRequest request) {
		ErrorResponse errorResponse = new ErrorResponse(new Date(), exception.getMessage(),
				request.getDescription(false));
		return new ResponseEntity(errorResponse, HttpStatus.UNAUTHORIZED);
	}

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<?> handleCustomValidationException(MethodArgumentNotValidException exception,
			WebRequest request) {
		ErrorResponse errorResponse = new ErrorResponse(new Date(), exception.getMessage(),
				exception.getBindingResult().getFieldError().getDefaultMessage());
		return new ResponseEntity(errorResponse, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> handleException(Exception exception, WebRequest request) {
		ErrorResponse errorResponse = new ErrorResponse(new Date(), exception.getMessage(),
				request.getDescription(false));
		return new ResponseEntity(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(HttpMessageNotReadableException.class)
	public ResponseEntity<String> handleHttpMessageNotReadableException(HttpMessageNotReadableException exception,
			HttpServletRequest request) {
		return new ResponseEntity("Incorrect Parameter has been requested", HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(MethodArgumentTypeMismatchException.class)
	public ResponseEntity<String> handleArgumentMismatchException(MethodArgumentTypeMismatchException exception,
			HttpServletRequest request) {
		return new ResponseEntity("Incorrect argument has been passed", HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(InvalidDataAccessApiUsageException.class)
	public ResponseEntity<String> handleArgumentMismatchException(InvalidDataAccessApiUsageException exception,
			HttpServletRequest request) {
		return new ResponseEntity("Some transient parameters has been missed", HttpStatus.BAD_REQUEST);
	}
}
