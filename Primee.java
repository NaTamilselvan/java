public class Primee{

public  static void prime(int a){

     System.out.println(2);
    int count=1;

    int num=3;

    while(count<=a){

    boolean pri=true;

     int i=2;

        while(i<num){

        if(num%i==0){

        pri=false ;

              break;}

               i++;
               }

    if(pri==true){

        System.out.println("Prime number is "+num);

      count++;

       }

         num=num+1;

       System.out.println("num value"+num);

    }

}
public static void main(String[] args){

   prime(10);


}




}
