import java.util.Scanner;

class Nprime{

public static void Nprimenumbers(int num){

while(num>0){

   int fact;
   fact=num;

      while(fact>0){

         int numm=1;

        for(int i=1;i<fact;i++){
            numm=numm*fact;
            fact--;
                               }

        System.out.println(numm);

                   }
          num--;
         }
    

}

public static void primenumber(int num){



while(num>0){
 
int nfact=num;

 int fact=1;
    while(nfact>0){

       fact*=nfact;
       nfact--;
     }

       System.out.println(fact);
        num--;
}

}

public static void main(String[] args){


 Scanner scan=new Scanner(System.in);

 System.out.println("Enter the number");

  int n=scan.nextInt();

primenumber(n);

 // Nprimenumbers(n);  

}
}
