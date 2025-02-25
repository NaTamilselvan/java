package pattern;

public class patternckass {

	public static void main(String[] args) {
		
		for(int row=1; row<=7; row++)
		{
			for(int star=1; star<=7; star++)
			{
			if(row==1 || row==4 || row==7|| star==1 || star==7)
			    System.out.print("* ");
			else
				System.out.print("  "); 
			}
			System.out.println(); 
		}

		

	}

}
