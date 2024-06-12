package mysimpleprogram;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Mapwork {

	public static void main(String[] args) {
		
		
		 HashMap<String,Integer> hh=new HashMap<String,Integer>();//tight bounding 
		 
		 System.out.println(hh);
		 
		System.out.println( hh.put("idely",20));
		 
		 System.out.println(hh.put("idely",30));

		 
		System.out.println( hh.put("idely",20));
		 
		 System.out.println(hh.put("idly",20));
		 
		 hh.put("Dosai",20);
		 
		 hh.put("ponipori", 22);
		 
		 System.out.println(hh);
		 
		 
		 
		   Collection<Integer> values=hh.values();	
		   
		   
		   for(Integer i:values) {
			   System.out.println(i);
			  
			   
		   }
		   
		     Set<String> keys=hh.keySet();
		 
		     System.out.println(keys);

		     for(String s:keys) {
		    	 
		    	 System.out.println(s);
		     }
		     
	Set<Entry<String,Integer>> entrys=hh.entrySet();
		     
		     System.out.println("Entry is ");
		     
		     for(Entry o:entrys) {
		    	 System.out.println(o.getKey());
		    	 
		    	 System.out.println(o.getValue());
		     }
		     
		   //  System.out.println(entrys);
		     
		     
		     
		     
		     
		     
		     
	}

}
