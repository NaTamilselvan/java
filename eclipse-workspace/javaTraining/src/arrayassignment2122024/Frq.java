package arrayassignment2122024;

public class Frq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar = {10,20,30,40,10,20,50}; 
	      ///    0   1  2 3   4  5  6
	for(int j=0; j<ar.length; j++)
	{
	  int key = ar[j]; //10
	  int count = 0; 
	    for(int i=0; i<ar.length;i++)
	    {
	      if(key == ar[i])
	      {
	        if(i<j)
	        {
	          ar[i] = -1;
	          break;
	        }
	        count++;
	      }
	    }
	    if(count>1)
	    System.out.println(key + " is present " + count + " times");
	}


	}

}
