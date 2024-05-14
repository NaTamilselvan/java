import java.util.Scanner;

class userPinWrongexception extends Exception{

public String getMessage(){
  
   return "Invalid pin try again";
}




}


class Atm{

//declare a filed or datamember or instance variable 

private int pin=1234;

private int  p;

void getPin(){

 Scanner scan=new Scanner(System.in);

   p=scan.nextInt();

}

void validate() throws  userPinWrongexception
{

if(pin==p){

System.out.println("sucessfully entered");

}

else{
//System.out.println("you enter pin is wrong try again");
    userPinWrongexception u=new   userPinWrongexception();
     
     System.out.println(u.getMessage());
     
     throw u;
    
}

}
}

class Bank{

    void initiate (){

     Atm a=new Atm();

   try{
     a.getPin();
     a.validate();
    }catch( userPinWrongexception ue){
     
     try{   
     a.getPin();
     a.validate();}
     catch(Exception e){
             try{
             a.getPin();
             a.validate();
             }
             catch(Exception f){
                    System.out.println("Card is blocked");
                    System.exit(0);
                     }
            }
      }

}

}


public class Try{


public static void main(String[] args){


      Bank b=new Bank();

     b.initiate();


}


}



