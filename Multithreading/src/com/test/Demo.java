package com.test;

public class Demo implements Runnable {

	@Override
	public void run() {
		System.out.println(1);
		try {
			for(int i=1;i<=5;i++) {
			System.out.println(i);
			}
			Thread.sleep(1000);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public static void main(String[] args) {
		
		Thread thread = new Thread();
		
		thread.start();
	}

}
