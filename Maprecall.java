package com.tamil.package1;

import java.util.TreeMap;

public class Maprecall {

	public static void main(String[] args) {
		
		  TreeMap<Integer,Integer> t=new TreeMap<Integer,Integer>();

		  //to enter values in map there is a method is put and this method parameters are key and value pairs.key is doesnot duplicate and values is allowed duplicate.
		  
		  System.out.println(t.put(10, 1));//This treeset and put method is return some values is empty return null.
		  
		  
		  System.out.println(t.put(10, 2));
		  
		  System.out.println(t.put(12, 1));
		  
		  
		  System.out.println(t.put(10, 3));
		  
		  System.out.println(t.put(10, 3));
		  
		  System.out.println(t.put(13,3));
		  
		  System.out.println(t.size());
		  
		  System.out.println(t.containsKey(10));
		  
		  System.out.println(t.containsKey(21));
		  
		  
		  System.out.println(t.containsValue(3));
		  
		  
		  System.out.println(t.containsValue(21));
		  
		  
		  System.out.println(t.get(10));
		  
		  System.out.println(t.get(22));
		  
		  
		  
		  
		  System.out.println(t);
		  
		  
		  
	}

}

