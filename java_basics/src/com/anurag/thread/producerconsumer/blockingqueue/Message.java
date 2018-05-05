package com.anurag.thread.producerconsumer.blockingqueue;

public class Message {

	private String message;

	Message(String msg) {
		this.message = msg;
	}

	public String getMessage() {
		return message;
	}

}
