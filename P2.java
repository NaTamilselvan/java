package pattern;

import java.util.StringTokenizer;

public class P2 {

	public static void main(String[] args) {

		String name = "Tamilselvan has had tamil";

		
		String word="";
		
		String  result="";
		
		
		for(int i=0;i<name.length();i++) {
			
			char ch =name.charAt(i);
			
			
			if(ch!=' ') {
				word+=ch;
				
			}
			else{
				
				result=word+" "+result;
				word=" ";
			}
			
			
		}
		
		
		System.out.println(result
				);
		
		//System.out.println(word);
		
		result=word+" "+result;
		

		System.out.println(result
				);
		
		
		/*
		 * StringTokenizer staf=new StringTokenizer(name);
		 * 
		 * StringTokenizer staf1=new StringTokenizer("abc,adf,kdf",",");
		 * 
		 * while(staf.hasMoreTokens()){
		 * 
		 * System.out.println(staf.nextToken()); }
		 * 
		 * System.out.println(staf1.nextToken());
		 * 
		 * 
		 * String name="tamilselvan";
		 * 
		 * String name2=""; for(int i=0;i<name.length();i++) {
		 * 
		 * char ch=name.charAt(i);
		 * 
		 * ch=(char) (ch-32);
		 * 
		 * name2+=ch;
		 * 
		 * }
		 * 
		 * //System.out.println(name2);
		 * 
		 * //System.out.println(name2.contains("SELVAN"));
		 * //System.out.println(name2.startsWith("T"));
		 * //System.out.println(name2.endsWith("NA"));
		 * 
		 * System.out.println(10+5+"Helloworld"+10+5);
		 */

		/*
		 * int n=5;
		 * 
		 * for(int i=0;i<n;i++) {
		 * 
		 * for(int j=0;j<n-i;j++) {
		 * 
		 * System.out.print(" "); }
		 * 
		 * for(int k=0;k<=i;k++) { System.out.print("* "); }
		 * 
		 * 
		 * 
		 * 
		 * System.out.println(); }
		 */

	}

}
