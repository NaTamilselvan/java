package Remove2622024;

public class Remove_space {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s="     Hi Hello world";
		
		
		char[]  space=s.toCharArray();
		
		for(int i=0;i<space.length;i++) {
			
			
			if(space[i]==' ') {
				continue;
			}
			else {
				for(int j=i;j<space.length;j++) {
					System.out.print(space[i]);
				}
				break;
			}
		}
		

	}

}
