package collectionspractise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Collectionsss {

	public static void main(String[] args) {
		
		 ArrayList al=new ArrayList();
		 LinkedList ll=new LinkedList();
		 
		 HashMap hm=new HashMap();
		 
		 hm.put("Tamil", "java");
		 hm.put("selvan", "graphic");
		 hm.put("guru", "python");
		 hm.put("Vasu", "java");
		 
		 Set s=hm.keySet();
		 
		 Collection c=hm.values();
		 
		 Set e=hm.entrySet();
		 
		 
		 System.out.println(e);
		 
		 
		 
	}
}
