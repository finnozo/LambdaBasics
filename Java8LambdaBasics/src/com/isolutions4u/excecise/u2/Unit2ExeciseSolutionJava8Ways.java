package com.isolutions4u.excecise.u2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.isolutions4u.excecise.u1.Person;

public class Unit2ExeciseSolutionJava8Ways {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("Sushil", "Dangi", 25), new Person("Test", "LastTest", 22),
				new Person("Test2", "PastTest2", 22), new Person("xest2", "LastTest2", 22),
				new Person("rest2", "RastTest2", 22), new Person("Test2", "ZNastTest2", 22),
				new Person("best2", "AastTest2", 22), new Person("Test2", "SastTest2", 22),
				new Person("New", "test", 20));

		// step 1 : sort list by last name

		Collections.sort(persons, (p1, p2) -> p1.getLastName().toLowerCase().compareTo(p2.getLastName().toLowerCase()));

		// step 2 : create a method that prints all elements in the list
		performConditionally(persons, p -> true, p -> System.out.println(p.getFirstName()));

		// step 3 : create a method that print all person that have last name beginning
		// T

		System.out.println("\nPerson Last Name start with S\n");

		performConditionally(persons, p -> p.getLastName().startsWith("S"),p -> System.out.println(p));

	}

	private static void performConditionally(List<Person> persons, Predicate<Person> predicate,Consumer<Person> consumer) {
		for (Person p : persons) {
			if (predicate.test(p)) {
				consumer.accept(p);
			}
		}

	}

}
