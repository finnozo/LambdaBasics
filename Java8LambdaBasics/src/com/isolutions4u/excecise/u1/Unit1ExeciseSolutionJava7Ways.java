package com.isolutions4u.excecise.u1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExeciseSolutionJava7Ways {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("Sushil", "Dangi", 25), new Person("Test", "LastTest", 22),
				new Person("Test2", "PastTest2", 22), new Person("xest2", "LastTest2", 22),
				new Person("rest2", "RastTest2", 22), new Person("Test2", "ZNastTest2", 22),
				new Person("best2", "AastTest2", 22), new Person("Test2", "SastTest2", 22),
				new Person("New", "test", 20));

		// step 1 : sort list by last name
		Collections.sort(persons, new Comparator<Person>() {

			@Override
			public int compare(Person person1, Person person2) {

				return person1.getLastName().toLowerCase().compareTo(person2.getLastName().toLowerCase());

			}
		});

		// step 2 : create a method that prints all elements in the list

		printAll(persons);

		// step 3 : create a method that print all person that have last name beginning
		// T
		System.out.println("\n");
		printConditonally(persons, new Condition() {

			@Override
			public boolean test(Person p) {
				// TODO Auto-generated method stub
				return p.getFirstName().startsWith("T");
			}
		});

	}

	private static void printConditonally(List<Person> persons, Condition condition) {

		for (Person p : persons) {
			if (condition.test(p)) {
				System.out.println(p);
			}
		}

	}

	private static void printAll(List<Person> persons) {

		for (Person p : persons) {
			System.out.println(p);
		}

	}

}
