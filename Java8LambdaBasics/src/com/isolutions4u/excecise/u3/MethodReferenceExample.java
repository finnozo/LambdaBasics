package com.isolutions4u.excecise.u3;

public class MethodReferenceExample {

	public static void main(String[] args) {
		Thread thread = new Thread(MethodReferenceExample::printMessage);//() -> printMessage()
		thread.start();

	}

	public static void printMessage() {
		System.out.println("Hello");
	}

}
