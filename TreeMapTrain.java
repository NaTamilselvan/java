public class TreeMapTrain{

public static void main(String[] args){


 TreeMap<String,String>  t=new TreeMap<String,String>();

   t.put("4:30","spicejet");

   t.put("9:00","indigo");

   t.put("11:00","spicejet");
  
   t.put("16:00","indigo");

   t.put("21:30","airindia");
  
   t.put("23:30","goair");


   System.out.println(t.ceilingKey("10:00"));
		   
   System.out.println(t.ceilingEntry("10:00"));

   System.out.println(t.floorKey("10:00"));
		 
   System.out.println(t.floorEntry("10:00"));
		 
		 
   System.out.println(t.higherKey("10:00"));
		 
   System.out.println(t.higherEntry("10:00"));
		    
		System.out.println(t.lowerKey("9:00"));
		
		System.out.println(t.lowerEntry("9:00"));
		   




}





} 
