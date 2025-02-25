package maytojob;

public class FirstString {

	public static void main(String[] args) {
		
		String s=new String("Hi i am String ");
		
		StringBuffer sb=new StringBuffer();
		
		System.out.println(sb);
		sb.append("trre");
		
		System.out.println(sb);
		
		 String sba=new String();
		 
		 System.out.println(sba);
		 
		String a="tamil";
		
		System.out.println(a);
		
		a="jikl";
		
	    System.out.println(a);
		
		System.out.println(s);
		
		System.out.println(s.hashCode());
		
		s=s.concat("I am adding");
		
		System.out.println(s);
		
		System.out.println(s.hashCode());
		
 }

}
