package com.viplove.controlleradvicedemo.exception;

import java.util.Date;

public class ErrorMessage {
	int status;
	Date date;
	String message;
	String description;

	public ErrorMessage(int status, Date date, String message, String description) {
		this.status = status;
		this.date = date;
		this.message = message;
		this.description = description;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
