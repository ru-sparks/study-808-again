package com.sparkco;

import java.util.*;

public class Test {
	public static void main(String[] args) {

		testSort();
	}

	private static void testSort() {
		ArrayList<Student> myList;
		StudentIdComparator comparator;

		myList = new ArrayList<>();
		comparator = new StudentIdComparator();

		myList.add(new Student(4, "David"));
		myList.add(new Student(2, "Tom"));
		myList.add(new Student(5, "Rohit"));
		myList.add(new Student(1, "Paul"));
		myList.add(new Student(3, "Vishal"));

		System.out.println("Elements Before Sorting");
		System.out.println(myList);

		myList.sort(comparator);
		

		System.out.println("Elements After Sorting");
		System.out.println(myList);

		myList.sort((s1, s2) -> -Integer.compare(s1.getId(), s2.getId())); 
		System.out.println("Elements After Sorting By Id");
		System.out.println(myList);

	}
}
