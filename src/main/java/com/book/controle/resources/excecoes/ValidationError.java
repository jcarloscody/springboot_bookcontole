package com.book.controle.resources.excecoes;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError {

	List<FieldMessage> errors = new ArrayList<FieldMessage>();

	public ValidationError() {
		super();
	}

	public ValidationError(Long timestamp, Integer status, String error) {
		super(timestamp, status, error);
	}

	public List<FieldMessage> getErrors() {
		return errors;
	}

	public void setErrors(String fieldName, String message) {
		this.errors.add(new FieldMessage(fieldName, message));
	}

}
