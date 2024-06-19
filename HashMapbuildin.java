package com.tamil.package1;

import java.util.HashMap;

import java.util.Scanner;

public class HashMapbuildin {
	
public static void main(String[] args) {
	
     HashMap<String,Integer> hm=new HashMap<String,Integer>();
     
     
     hm.put("Thirchengodu", 0);
     
     hm.put("SalemRoad", 5);
     
     hm.put("PAScholl", 7);
     
     hm.put("Velmurgan nagaer", 8);
     
     hm.put ("kaliasampalayam",10);

     hm.put("tippo", 12);
     
     hm.put("Sengunther collage ", 15);
     
     
     System.out.println(hm);
     
     
      Scanner scan=new Scanner(System.in);
     
      System.out.println("Enter the key value");
      
        String key=scan.next();
        
        System.out.println("Enter the  value");
        
        Integer value=scan.nextInt();
        
     /*if(hm.containsKey(key)==false)
     {
    	 hm.put(key, value);
     }*/
        
        hm.putIfAbsent(key, value);
     
     System.out.println(hm);
}
	

}

