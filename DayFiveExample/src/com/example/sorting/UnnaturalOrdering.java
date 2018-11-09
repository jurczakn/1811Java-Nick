package com.example.sorting;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnnaturalOrdering {

	/*
	 * Comparator(interface) - unnatural ordering, secondary All values can be
	 * compared to all other values Custom ordering
	 * 
	 * You have to specifically tell a sorting method. If you don't specify, then
	 * the sorting algorithm will use the natural ordering instead.
	 */

	public static void main(String[] args) {

		List<Student> students = new ArrayList<>();
		students.add(new Student(3, "John", 3.5, LocalDate.of(1970, 2, 12)));
		students.add(new Student(17, "Amy", 3.1, LocalDate.of(1989, 1, 15)));
		students.add(new Student(1, "Timothy", 3.4, LocalDate.of(1990, 5, 22)));
		students.add(new Student(2, "Katie", 3.2, LocalDate.of(1995, 6, 3)));
		students.add(new Student(4, "Alex", 2.8, LocalDate.of(1932, 8, 1)));
		
		System.out.println("Students sorted by descending Dob: ");
		Collections.sort(students, new StudentDobComparator());
		printListPretty(students);
		
		System.out.println("Students sorted by Name A->Z ");
		Collections.sort(students, new StudentNameComparator());
		printListPretty(students);

	}
	
	static void printListPretty(List<Student> list) {
		System.out.println("Students: ");
		for(Student stud: list) {
			System.out.println(stud);
		}
		System.out.println();
	}

}
