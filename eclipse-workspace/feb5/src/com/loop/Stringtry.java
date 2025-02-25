package com.loop;

public class Stringtry {

	public static void main(String[] args) {
		
		
		
		String s="Tamil";
		
		System.out.println(s.hashCode());
		
		String s2=s+"selvan";

		System.out.println(s2.hashCode());
		
		s=s.concat("selvan");
		
		System.out.println(s.hashCode());

		s=s.concat("y");
		
		System.out.println(s.hashCode());
		
		String s3="Tamilselvany";
		
		System.out.println(s3.hashCode());

	}

}
