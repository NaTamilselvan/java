package maps;

import java.util.HashMap;
import java.util.Set;

public class First_map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  HashMap hash=new HashMap();
		  hash.put("Dosai", 25);
		  hash.put("parrota", 12);
		  hash.put("idely",8);
		  System.out.println(hash);
		  
		  System.out.println(hash.keySet());
		  
		  System.out.println(hash.values());
		  
		  System.out.println()
		  ;
		  System.out.println();
		    Set s=hash.entrySet();
		    
		    System.out.println(s);
		    
            for(Object o:s) {
            	System.out.println(o);
            }
		    
		    
	}

}
