package com.fp;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class FPTest {

	@Test
	void test() {
//		fail("Not yet implemented");
		
		Integer[] intArray = {1, 2};
		
		List<String> stringList
		  = new ArrayList<>();
		stringList.add("1");
		stringList.add("2");
		
		List<Integer> intList
		  = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		
		
		assertArrayEquals(intArray, intList.toArray());
		
		List<Building> buildings = new ArrayList<>();
		buildings.add(new House());
		paintAllBuildings(buildings);
		
		//////////////////
//		Upper Bounded Wildcards
//		To write the method that works on lists of Number and the subtypes of Number, such as Integer, Double, and Float,
//		you would specify List<? extends Number>
		List<Double> listD = new ArrayList<>();
		listD.add(10.5);
		listD.add(20.5);
		printUpperBound(listD);
		
		List<Integer> listI = new ArrayList<>();
		listI.add(15);
		listI.add(16);
		printUpperBound(listI);
		
//		The Upper Bounded Wildcards section shows that an upper bounded wildcard restricts the unknown type to be a specific type
//		or a subtype of that type and is represented using the extends keyword. In a similar way, a lower bounded wildcard restricts
//		the unknown type to be a specific type or a super type of that type.
//		List<String> listS = new ArrayList<>();
//		listS.add("s");
//		listS.add("b");
//		printUpperBound(listS);
		
		
//		Unbounded Wildcards=>(List<?> list)
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		printList(list);
		
		//////////////////////////
//		Lower Bounded Wildcards ==> <? super A>	
		
//		Say you want to write a method that puts Integer objects into a list.
//		To maximize flexibility, you would like the method to work on List<Integer>, List<Number>, and List<Object>
//		— anything that can hold Integer values
		
//		example
		List<Number> listN = new ArrayList<>();
		listN.add(10);
		listN.add(20);
		printLowerBound(listN);
		
		List<Object> listo = new ArrayList<>();
		listo.add(10.5);
		listo.add(20.5);
		printLowerBound(listo);
		
	}
	
	//Unbounded Wildcards
	public static void paintAllBuildings(List<? extends Building> buildings) {
		buildings.forEach(Building::paint);
	}
	
	//	Upper Bounded Wildcards
	//	To write the method that works on lists of Number and its subclasses that extends Number (implement in case of inteface)
	public static void printUpperBound(List<? extends Number> listD) {
		
		listD.forEach(System.out::println);
	}	
	//	Upper Bounded Wildcards
	public static void printList(List<?> list) {
		
		list.forEach(System.out::println);
	}
	
	//	Lower Bounded Wildcards
	//	To write the method that works on lists of Integer and the supertypes of Integer
	public static void printLowerBound(List<? super Integer> list) {
		list.forEach(System.out::println);
	}
	
//	class A { /* ... */ }
//	class B extends A { /* ... */ }
//	B b = new B();
//	A a = b;
//	This example shows that inheritance of regular classes follows this rule of subtyping: class B is a subtype of class A if B extends A.
//	This rule does not apply to generic types:
//	List<B> lb = new ArrayList<>();
//	List<A> la = lb;   // compile-time error	
	
//	Although Integer is a subtype of Number, List<Integer> is not a subtype of List<Number> and, in fact,
//	these two types are not related. The common parent of List<Number> and List<Integer> is List<?>.
	
//	In order to create a relationship between these classes so that the code can access Number's methods through List<Integer>'s elements,
//	use an upper bounded wildcard:
	
//	List<? extends Integer> intList = new ArrayList<>();
	// This is OK because List<? extends Integer> is a subtype of List<? extends Number>
//	List<? extends Number>  numList = intList;  
	
//	https://dev.java/learn/generics/wildcards/
}
