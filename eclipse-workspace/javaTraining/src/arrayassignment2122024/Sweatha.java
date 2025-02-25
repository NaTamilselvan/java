package arrayassignment2122024;

public class Sweatha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="SwethA SubramanI";
		
		//to string convert char
		
		char[] na=name.toCharArray();
		
		for(int i=0;i<na.length;i++) {
			
                System.out.println(na[i]);
			
		}
		for(int i=0;i<na.length;i++) {
			
			char  key=na[i];
			int count=0;
			
			for(int j=0;j<na.length;j++) {
				
				if(key==na[j]) {
					if(i>j) {
						na[i]='1';
						break;
						
					}
					
					count++;
				}
			}
			if(count>1)
			System.out.println("The character is "+key+" is comes  "+count);
			
			
		}
		
		
		
		
		
	}

}
