package TREEMap;

import java.util.TreeMap;

public class TreeMaptrain1 {

	public static void main(String[] args) {
		
		
		 TreeMap<String,Integer> t=new TreeMap<String,Integer>();
		 
		 t.put("Cat", 3);
		 t.put("Cow", 3);
		 t.put("sheep",1 );
		 t.put("Goat", 12);
		 t.put("pubby", 3);
		 t.put("Hourse",0 );
		 t.put("robbit",1);
		 t.put("dog", 3);
		 t.put("Buffalo",0);
		 t.put("Giraffe", 0);
		 
		 
		 System.out.println(t);
		 
		 System.out.println(t.firstKey());
     	 System.out.println(t.firstEntry());
		 
     	 System.out.println(t.lastEntry());
		 System.out.println(t.lastKey());
		 
		 System.out.println(t.ceilingKey("goat") );
		 

	}

}

