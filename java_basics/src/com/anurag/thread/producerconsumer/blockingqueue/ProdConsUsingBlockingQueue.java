package com.anurag.thread.producerconsumer.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProdConsUsingBlockingQueue {

	public static void main(String[] args) {
		BlockingQueue<Message> msg = new ArrayBlockingQueue<>(10);
		Producer p = new Producer(msg);
		Consumer c = new Consumer(msg);
		new Thread(p).start();
		new Thread(c).start();
	}
}
