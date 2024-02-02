package com;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		//Set ss1=new HashSet();
		//Set ss1=new LinkedHashSet();
		Set ss1=new TreeSet();
		System.out.println("Size "+ss1.size());
		ss1.add(10);
		ss1.add(30);
		ss1.add(10);
		ss1.add(20);
		ss1.add(60);
		ss1.add(50);
		System.out.println("Size "+ss1.size());
		System.out.println(ss1);
		System.out.println("Remove "+ss1.remove(30));
		System.out.println("Remove "+ss1.remove(300));
		System.out.println(ss1);
		System.out.println("Search "+ss1.contains(30));
		System.out.println("Search "+ss1.contains(10));
		ss1.clear();
		System.out.println("Size "+ss1.size());
		System.out.println(ss1);
		System.out.println("Empty "+ss1.isEmpty());
		}

}
