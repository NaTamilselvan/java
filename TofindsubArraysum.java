	int a[]= {2, 1, 30,30, 2,50,50};
		
        int b[]=new int[2];
        
        
        
	
        //System.out.println(b.length);
        
		int start=0,end =0,i=0,j=0;
		
		int sum=102,target=a[0]; 
		
	
		while(j<a.length) {
			
			if(sum==target) {
				b[0]=start;
				b[1]=end;
                break;
				
			}
			else if (target<sum) {
				
				j++;
				
				target+=a[j];
				end++;
				
			}
			else if(target>sum)
			
			{
				target-=a[i];
				i++;
				start++;
			}
			
		}
		
		
		
		for(int k=0;k<b.length;k++) {
			System.out.println(b[k]);
		}
		
