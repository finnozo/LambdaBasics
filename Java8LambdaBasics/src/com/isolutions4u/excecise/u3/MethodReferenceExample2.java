package com.isolutions4u.excecise.u3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.isolutions4u.excecise.u1.Person;

public class MethodReferenceExample2 {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("Sushil", "Dangi", 25), new Person("Test", "LastTest", 22),
				new Person("Test2", "PastTest2", 22), new Person("xest2", "LastTest2", 22),
				new Person("rest2", "RastTest2", 22), new Person("Test2", "ZNastTest2", 22),
				new Person("best2", "AastTest2", 22), new Person("Test2", "SastTest2", 22),
				new Person("New", "test", 20));

		System.out.println("Printing All Person");
		performConditionally(persons, p -> true, System.out::println); // p -> method(p)

	}

	private static void performConditionally(List<Person> persons, Predicate<Person> predicate,
			Consumer<Person> consumer) {
		for (Person p : persons) {
			if (predicate.test(p)) {
				consumer.accept(p);
			}
		}

	}

}
