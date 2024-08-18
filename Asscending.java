static void  minMax2(int[] lst) {
	    
	   int min=lst[0];
	   int max=lst[0];
	   
	   for(int i=1;i<lst.length;i++) {
		   if(lst[i]<min) {
			   min=lst[i];
			   
		   }
	   }
		   
	   for( int i=1;i<lst.length;i++) {
			   if(lst[i]>max) {
				   max=lst[i];
				   
			   }
			   
	                                  }

	   
	   System.out.println(min);
	   System.out.println(max);
	   
                               	}	    
	
        }
