package com.prac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Streams {

	// count the number of names starts with alphabet A
	public static void stream() {
		// collection
		ArrayList<String> names = new ArrayList<String>();
		names.add("Joshua");
		names.add("Antony");
		names.add("Antony");
		names.add("Antony");
		names.add("Mercy");
		// Aggregate operation-->operations allow you to perform common aggregate
		// computations on a stream of
		// elements, such as summing, averaging, finding the maximum or minimum, and
		// more.
		// Convert the collection into steam
		// stream()--> Returns a sequential Stream with this collection as its source.
		// filter-->Returns a stream consisting of the elements of this stream that
		// match the given predicate.
		// It's a intermediate operation
		// lambda expression s instead for loop. This s parameter iterate all the
		// element in the collection, right side do the action
		// Count--> Terminal operation
		// Optimized the code without using the loop concept
		// There is no life for intermediate operation if there is no terminal op
		// terminal operation will only execute if the inter op (filter) returns true
		long l = names.stream().filter(s -> s.startsWith("A")).count();
		System.out.println("Stream method count:" + l);
		// to create stream without collection
		long l1 = Stream.of("Antony", "anto", "josh", "joshua").filter(s -> {
			s.startsWith("A");
			return false;
		}).count();
		System.out.println("Hello: " + l1);
		// print the name which is equal to 5
		names.stream().filter(s -> s.length() == 5).forEach(s -> System.out.println(s));
		// print the first three output. Setting limit for the output
		names.stream().filter(s -> s.length() > 5).limit(3).forEach(s -> System.out.println(s));

	}

	public static void map() {
		// print names which has last letter y and convert into upper case
		Stream.of("Joshua", "Antony", "mercy", "sam").filter(s -> s.endsWith("y")).map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));
//print name which starts with m and convert upper and sort 
		List<String> asList = Arrays.asList("Joshua", "Antony", "mercy", "megin", "mahima", "sam");
		asList.stream().filter(s -> s.startsWith("m")).sorted().map(s -> s.toUpperCase())
				.forEach(s -> System.out.println("Sorted and ended with m" + s));

		// Merge two different list and sort it
		List<String> asList1 = Arrays.asList("Moses", "Antony", "mercy", "megin", "sam");
		Stream<String> concat = Stream.concat(asList.stream(), asList1.stream());
		// once a stream is modified user cannot modify it again
		// concat.sorted().forEach(s->System.out.println(s));
		boolean anyMatch = concat.anyMatch(s -> s.equalsIgnoreCase("Mercy1"));
		Assert.assertTrue(anyMatch);
	}

	public static void collect() {
		// collect used to convert the stream into list,map or set to use the methods of
		// the list, map and set

		List<String> collect = Stream.of("Joshua", "Antony", "mercy", "sam").filter(s -> s.endsWith("y"))
				.map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println("First element:" + collect.get(1));

		// print unique value from the array
		// sort the array and get the third index
		ArrayList<Integer> li = new ArrayList<>();
		li.add(1);
		li.add(2);
		System.out.println(li);

		int[] a = { 7, 2, 3, 6, 5, 5, 1 };
		System.out.println(a[0]);
		List<Integer> collect3 = IntStream.of(a).boxed().collect(Collectors.toList());
		System.out.println(collect3);
		// List<int[]> asList = Arrays.asList(a);
		List<Integer> asList = Arrays.asList(1, 5, 7, 4, 2, 1, 3);
		System.out.println(asList);
		// Distinct eliminate the duplicate element
		asList.stream().distinct().forEach(s -> System.out.println(s));
		List<Integer> collect2 = asList.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(collect2);
		System.out.println(collect2.get(0));

	}

	public static void main(String[] args)

	{
		collect();
		map();
		stream();
		ArrayList<String> names = new ArrayList<String>();
		names.add("Joshua");
		names.add("Antony");
		names.add("Antony");
		names.add("Antony");
		names.add("Mercy");
		Collections.sort(names);
		int count = 0;
		System.out.println(names);
		for (String name : names) {
			if (name.startsWith("A")) {
				count++;
			}

		}
		System.out.println(count);

	}

}
