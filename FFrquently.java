package GeeksForGeeksArray50problems;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FFrquently {

	public static void main(String[] args) {
		
		int[] a= { 10, 20, 30, 40, 50, 60, 10, 20, 30, 40, 50, 60, 10, 20, 30, 40, 40, 50};
		
		HashMap<Integer,Integer>  hm=new HashMap<Integer,Integer>();	
		
		
		for(int i = 0; i < a.length ; i++ ) {
			
			if(hm.containsKey(a[i])) 
			{
				hm.put(a[i], hm.get(a[i])+1);
				
			}
			else
			{
				hm.put(a[i], 1);
			}
		}
		
		
		  
		
		
		   //Map<String,String>    flight1=flight.headMap("11:00",true);


           for(Map.Entry e :hm.entrySet()) {
        	   
        	   System.out.println(e.getKey()+" "+e.getValue());
           }
		
		
		
	}


}
