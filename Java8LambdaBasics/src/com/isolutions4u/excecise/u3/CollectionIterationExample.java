package com.isolutions4u.excecise.u3;

import java.util.Arrays;
import java.util.List;

import com.isolutions4u.excecise.u1.Person;

public class CollectionIterationExample {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("Sushil", "Dangi", 25), new Person("Test", "LastTest", 22),
				new Person("Test2", "PastTest2", 22), new Person("xest2", "LastTest2", 22),
				new Person("rest2", "RastTest2", 22), new Person("Test2", "ZNastTest2", 22),
				new Person("best2", "AastTest2", 22), new Person("Test2", "SastTest2", 22),
				new Person("New", "test", 20));

		System.out.println("Using for Loop");
		for (int i = 0; i < persons.size(); i++) {
			System.out.println(persons.get(i));
		}

		System.out.println("Using forEach Loop");

		for (Person p : persons) {
			System.out.println(p);
		}

		System.out.println("-------------------------\n");
		persons.forEach(System.out::println); // p -> System.out.println(p)

	}

}
