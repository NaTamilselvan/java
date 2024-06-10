
public class StringBui {

	public static void main(String[] args) {
		
		
		  StringBuffer s=new StringBuffer();
		  System.out.println(s.length());
		  System.out.println(s.capacity());
		  
		  
		 s.append("java");
		 
		 s.append(" jeems");
		 
		 System.out.println(s);
		 System.out.println(s.length());
		 
		 System.out.println(s.capacity());
		 
		 s.append("Tamilselvan");
		 
		 s.append("sss");
		  
		 
		 System.out.println(s.length());
		 System.out.println(s.capacity());
		 
		 s.trimToSize();

		 System.out.println(s.capacity());
		 
	}

}

