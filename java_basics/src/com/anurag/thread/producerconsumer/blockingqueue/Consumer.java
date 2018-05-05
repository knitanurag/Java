package com.anurag.thread.producerconsumer.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

	private BlockingQueue<Message> queue;

	public Consumer(BlockingQueue<Message> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		Message msg;
		try {
			while ((msg = queue.take()).getMessage() != "Exist") {
				Thread.sleep(10);
				System.out.println("Consumed :" + msg.getMessage());

			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
