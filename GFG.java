// JAVA Code to count number of
// digits in an integer
import java.util.*;

class GFG {

    static int countDigit(long n)
    {
        if (n/10 == 0)
            return 1;
        return 1 + countDigit(n / 10);
    }

    /* Driver code */
    public static void main(String[] args)
    {
        long n = 345289467;
        System.out.print("Number of digits : "
                         + countDigit(n));
    }
}

// This code is contributed by Arnav Kr. Mandal.

