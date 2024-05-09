import java.util.Scanner;

public class Fibo{


public static void main(String[] args){



 Scanner scan=new Scanner(System.in);

  System.out.println("Enter the number");

    int a=scan.nextInt();

   int first=0,secound=1;

    System.out.println(first);
   
for(int i=1;i<=a;i++){

   int third =first+secound;
   
   first=secound;
    secound=third;
      System.out.println(third);

}


}
}
