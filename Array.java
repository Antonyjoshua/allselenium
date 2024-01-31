package com.pratice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Array {

	public static void main(String[] args) {
		// Declare and initialize an array with values
		int a[] = { 1, 2, 3, 4, 5 };
		System.out.println(a[0]);
		// Declare an array
		// In Java, when you declare an array, you can combine the declaration and
		// instantiation in one line using curly braces {} to initialize the array
		// elements. However, this syntax is allowed only at the point of declaration.
		// If you declare the array and then assign values to it on a separate line, you
		// need to use the new keyword. Here's the correct way to declare and initialize
		// an array:
		int[] b;
		b = new int[] { 1, 2, 3 };
		System.out.println(b[1]);
		// Declare and initialize an array of integers
		int c[] = new int[5];
		c[0] = 1;
		c[3] = 3;
		//c[5]=5;
		System.out.println(c[3]);
		//Indexoutofbound
		//System.out.println(c[5]);
		List<Integer> a1 = new ArrayList<Integer>();
		a1.add(1);
		System.out.println(a1);
		 List<Integer> asList = Arrays.stream(a).boxed().collect(Collectors.toList());
		System.out.println(asList);
		asList.add(6);
		System.out.println(asList.get(5));
		

	}

}
