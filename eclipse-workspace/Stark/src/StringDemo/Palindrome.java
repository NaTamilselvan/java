package StringDemo;


class ASD{
	
	
	
	
	public   Object add() {
		
		return null;
	}
}


 abstract public class Palindrome  extends ASD {
	
	
	//co-verient return type
	
	
	 abstract public  Object   add();
	
	public static boolean isPalindrome( String s ) {
		
		
//		int i=0,j=s.length()-1;
		

		 /*  for(int i=0, j=s.length()-1;i<=j;i++,j--) {
			
			if (i==j) {
				System.out.println("Palindrome");
			}
			else {
				System.out.println("This not palimdrome");
			   }
		} */
		
		
		int k=0,l=s.length()-1;
		
		
		while(k<=l) {
			
			System.out.println(k+" "+l +"l value");
			
			if(s.charAt(k)==s.charAt(l)) {
				k++;
				l--;
			}
			else {
				System.out.println("Not a palindrome");
				return false;
			}
			
		}
		return true;
		
	}
	

	public static void main(String[] args) {
		
	String	s="ammna";
		
	
   System.out.println(isPalindrome(s));
	
	}

}
