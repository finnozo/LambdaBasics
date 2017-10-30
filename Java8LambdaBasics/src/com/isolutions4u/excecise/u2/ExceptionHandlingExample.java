package com.isolutions4u.excecise.u2;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {

	public static void main(String[] args) {

		int[] someNumber = { 1, 2, 3, 4, 5, 6 };
		int key = 2;

		process(someNumber, key, wrapperLambda((v, k) -> System.out.println(v / k)));

	}

	private static void process(int[] someNumber, int key, BiConsumer<Integer, Integer> biConsumer) {

		for (int i : someNumber) {
			biConsumer.accept(i, key);
		}

	}

	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> biConsumer) {

		return (v, k) -> {
			try {
				biConsumer.accept(v, k);
			} catch (ArithmeticException e) {
				e.printStackTrace();
			}
		};

	}

}
