package Maps;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

//import Hackrank.Set;

public class Treemapintro {

	public static void main(String[] args) {
		
		
		 HashMap <String,Integer> hm1=new HashMap<String,Integer>();

		 
		 TreeMap <String,Integer> hm=new TreeMap<String,Integer>();
		 
		 hm.put("Tomoto", 20);
		 hm.put("pototo", null);
		 hm.put("cabbage",null);
		 hm.put("califlower",null );
		 hm.put("brinjal",null );
		 hm.put("cucumber",null );
	     hm.put("cone", new Integer(40));
	     
	     System.out.println(hm);
	     
	     
	       Set < Entry<String,Integer>>entrys=hm.entrySet();
	       
	       for( Entry entry:entrys) {
	    	  // System.out.println(entry.getKey());
	    	   //System.out.println(entry.getValue());
	    	   System.out.println(entry);
	       }
		 
	       System.out.println();
	       System.out.println();
		 
		 System.out.println(hm.firstKey());
		 System.out.println(hm.firstEntry());
		 
		 System.out.println(hm.lastKey());
		 System.out.println(hm.lastEntry());
		 
	}

}
