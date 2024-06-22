package Hackranksolutions;

public class Hackranksolutions {

	public static int Strong(String s) {
		
		int count=0,lengthcount=0;
		
	    char ch;
	    boolean b;
	    
	    
	    for(int i=0;i<s.length();i++) {
	    	ch=s.charAt(i);
	    	
	    	if(ch>='a'&& ch<='z') {
	    		
	    	}
	    	else
	    		count++;break;
	    }
	    
	    for(int i=0;i<s.length();i++) {
	    	ch=s.charAt(i);
	    	
	    	if(ch>='A'&& ch<='Z'){
	    		
	    	}
	    	else
	    		count++;
	    	    break;
	        }
	    
	    
	    
	    for(int i=0;i<s.length();i++) {
	    	ch=s.charAt(i);
	    	
	    	if(ch>='0'&& ch<='9'){
	    		
	    	}
	    	else
	    		count++;
	    	
	    	    break;
	        }
	    
	
	    for(int i=0;i<s.length();i++) {
	    	ch=s.charAt(i);
	    	
	    	if(ch>= (char) 33 && ch<=(char) 47){
	    		
	    	}
	    	else
	    		count++;
	    	    break;
	        }
		
		
	    if(s.length()>=6) {
	    	
	    	 return count;
	    }
	    else {
	    	
	    	lengthcount=6-s.length();
	    	
	    	return lengthcount;
	    }
		
		
	}
	
	public static void main(String[] args) {
		
		
          System.out.println(Strong("#HackerRank"));
		

	}

}
