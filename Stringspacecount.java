
public class Stringspacecount {

	public static int countSpace(String s) {
		
		System.out.println("hi");
		
		int count=0,i=0;
		
		char ch;
		
		while(i<s.length()) {
//			System.out.println("i am entered");
		   ch=s.charAt(i);
		   
		   if(ch==' ') {
			   count++;
		   }
		   i++;
		}
		
		System.out.println("hi");
		
		return count;
	}
	

	public static int countWord(String s) {
		System.out.println("hi");
		return countSpace(s)+1;
	}
	

	public static int wordOccurence(String s,String t) {
		
		System.out.println("hi");
		int count=0,i=0;
		
		
		
		char ch=t.charAt(0);
		
		while(i<s.length()) {
		  
		   
		   if(ch==s.charAt(i)) {
			   count++;
		   }
		   i++;
		}
		
		
		return count;
	}
	
	
	public static void main(String[] args) {
		
		
		
		System.out.println("hi");
		
		String s="How are you doing well";
		
		String k="o";
		
		countSpace(s);

		System.out.println("The number of space is "+countSpace(s));
		
		System.out.println("The number word is "+countWord(s));
		
		
		System.out.println("The number of occurence is "+wordOccurence(s,k));
		
		
	}

}

