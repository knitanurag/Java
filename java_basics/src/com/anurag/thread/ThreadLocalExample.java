package com.anurag.thread;

public class ThreadLocalExample {

	public static void main(String[] args) {
		Thread t1 = new Thread(new MyRunnable());
		Thread t2 = new Thread(new MyRunnable());
		t1.start();
		t2.start();
	}

	public static class MyRunnable implements Runnable {

		ThreadLocal<Integer> local = new ThreadLocal<Integer>();

		@Override
		public void run() {
			local.set((int) (Math.random() * 100D));
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(local.get());
		}

	}

}
