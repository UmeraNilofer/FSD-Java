package com;
import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		System.out.println("Size is:"+hs.size());
		System.out.println("Empty "+hs.isEmpty());
		int a=10;
		Integer b=a;			//auto-boxing (converting primitive to object)
		hs.add(b);
		hs.add(a);
		hs.add(20);
		hs.add(20.20);
		hs.add(true);
		hs.add("Ravi");
		System.out.println("Size is "+hs.size());
	}

}
