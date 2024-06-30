public class migrations{


public static void migrations(int[] a){


      int[]  birds= new int [a.length];

   int max=-1, index=0;

     for(int i = 0 ; i < birds.length ; i++){

       birds [a[i]]++;

}
    for( int i = 1 ; i < birds.length ; i++ ){

      if( max < birds[i] ){
 
           max = birds[i];

               index=i;
       }

    } 

  System.out.println("max index"+ index);

  System.out.println("max is "+ max);

  


}

public static void main(String[] args){

int a[]={1,2,2,2,3,4};

migrations(a);




}

}
