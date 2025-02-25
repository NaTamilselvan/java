package soft;

public class First_String {

	public static void main(String[] args) {
		
		
		String s=new String("Tamil selvan");
		

		System.out.println(s.hashCode());

		String s1=new String("Tamil selvan");
		
		
		s=s.concat("q");
		
		
		System.out.println(s.hashCode());
		
		System.err.println(s);
		
		
		
		
		String q="Tamil selvan";
		   
		System.out.println(s==s1);
		
		
		//System.out.println(s.equalsIgnoreCase(q));
		
		
		StringBuffer sb=new StringBuffer("Tamil");
		
		StringBuffer sb1=new StringBuffer("Tamil");

		
		System.out.println(sb); 
		
		sb.append("jj");
		
		System.out.println(sb.equals(sb1));
		

	}

}
