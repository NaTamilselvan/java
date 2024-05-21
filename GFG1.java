// JAVA Code to count number of
// digits in an integer
import java.util.*;

class GFG1 {

    static int countDigit(int n)
    {
        if(n==0)
         {
          return 1;
          }
           

       return 1+countDigit(--n);
    }

    /* Driver code */
    public static void main(String[] args)
    {
        int n = 5;

        System.out.println("THe last "+countDigit(n));

       
      }   
      
    }


// This code is contributed by Arnav Kr. Mandal.

