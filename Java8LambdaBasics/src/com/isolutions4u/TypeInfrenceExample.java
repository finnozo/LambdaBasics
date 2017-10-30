package com.isolutions4u;

public class TypeInfrenceExample {

	public static void main(String[] args) {
		StringLengthLambda lambda = s -> s.length();
		System.out.println(lambda.getLength("Sushil Dangi"));
	}

	interface StringLengthLambda {
		int getLength(String s);
	}

}
