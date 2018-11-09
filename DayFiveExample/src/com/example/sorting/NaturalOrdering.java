package com.example.sorting;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NaturalOrdering {

	//Comparable(natural ordering)
	//interface allows to sort based on one element
	//ordering that is provided by the JVM (numbers - ascending, 
	//char - unicode values)
	
	public static void main(String[] args) {
		
	List<Student> students = new ArrayList<>();
	students.add(new Student(3, "John", 3.5, LocalDate.of(1970, 2, 12)));
	students.add(new Student(17, "Amy", 3.1, LocalDate.of(1989, 1, 15)));
	students.add(new Student(1, "Timothy", 3.4, LocalDate.of(1990, 5, 22)));
	students.add(new Student(2, "Katie", 3.2, LocalDate.of(1995, 6, 3)));
	students.add(new Student(4, "Alex", 2.8, LocalDate.of(1932, 8, 1)));
	
	printListPretty(students);
	
	Collections.sort(students);  //sort by id
	
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
