public class Perfect{

public  static  void PerfectNumber(int num){


int perfect=0,i=1;

while(num/2>=i){

if(num%i==0){

perfect+=i;

System.out.println("perfect"+perfect);

}
i++;

}

System.out.println(perfect);

if(num==perfect){

System.out.println("Its perfect number");

}
else {

System.out.println("Its  not perfect number");

}



}


public static void main(String[] args){



PerfectNumber(28);

}





}
