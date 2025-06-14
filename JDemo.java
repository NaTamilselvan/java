public class JDemo {

            public static void main(String[] args) {
		
		
		    String[] s= {"$s1","$s4","$s6","$s1","$s6","$s7"};
		
		    String s2="";
		
		    for(int i=0;i<s.length;i++) {
		
			          for(int j=i+1;j<=s.length-1;j++) {
				   
                                    
			        	      int number1=Character.getNumericValue(s[i].charAt(s[i].length()-1));
			        	      
                              
		        	          int number2=Character.getNumericValue(s[j].charAt(s[j].length()-1));
				   
				                if(number1>number2) {
					   
		                             s2=s[i];
		                             s[i]=s[j];
		                             s[j]=s2;
				               }
				   
			              }
			   
		}
		    
		    
		    for(int i=0;i<s.length;i++) {
		    	System.out.println(s[i]);
		    }
		
		
		    
		    
	}

}
