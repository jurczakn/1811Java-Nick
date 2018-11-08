package com.example.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListExample {

	public static void main(String[] args) {

		// ArrayList

		ArrayList<Integer> aList = new ArrayList<>();
		List<Integer> arrayList = new ArrayList<>();

		arrayList.add(2);
		arrayList.add(42);
		arrayList.add(2);
		arrayList.add(33);
		arrayList.add(8);
		arrayList.add(170);

		// print out the whole arraylist
		// System.out.println(arrayList);
		// print out a specific index, 3rd element
		// System.out.println(arrayList.get(2));

		// System.out.println(arrayList.get(10)); //IndexOutOfBounds exception

		// Iterators
		ListIterator<Integer> listIterator = arrayList.listIterator(arrayList.size());

		while (listIterator.hasNext()) { // .hasPrevious prints it backwards
			System.out.println(listIterator.previous() + " "); // .hasNext prints out in the right order
		}
		System.out.println("done");
	}
	
	//Linked List
	//used the same as ArrayLists
	List<Integer> lList = new LinkedList<>();

}
