package com.isolutions4u;

public class RunnableExample {

	public static void main(String[] args) {

		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10; i++)
					System.out.println("Printed inside Runnable");
			}
		});

		

		Thread thread2 = new Thread(() -> {
			for (int i = 0; i < 10; i++)
				System.out.println("Printed inside lambda Runnable");
		});
		thread2.start();
		thread.start();
		
	}

}
