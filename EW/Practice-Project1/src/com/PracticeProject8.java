package com;

public class PracticeProject8 {

	public static void main(String[] args) {
		
		String name="Rose";
			System.out.println(name);
		System.out.println(name+"Mary");
		System.out.println(name.toLowerCase());
			System.out.println(name);
			name=name+"Mary";
			System.out.println(name);
			System.out.println("------------------------");
		StringBuffer sbf=new StringBuffer("Rose");
		System.out.println(sbf);
		System.out.println(sbf.append("Mary"));
			System.out.println(sbf);
			System.out.println(sbf.delete(3,7));
			System.out.println(sbf);
			sbf.insert(2,"Pink ");
			System.out.println(sbf);
			sbf.reverse();
			System.out.println(sbf);
	}

}
