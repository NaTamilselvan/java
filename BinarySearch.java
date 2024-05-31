public class BinarySearch{


public static int  Binary(int[] a,int start ,int end,int val){

   int mid;

   if(start<=end){


  mid=(start+end)/2;

   if(a[mid]==val)

    return mid;

   else if (a[mid]<val){

    
    return  Binary( a,mid+1, end,val);
    }
   
   else if (a[mid]>val){

    return Binary( a, start , mid-1,val);
    }
}    
    return -1;

}


public   static   int[]  sortedArrayy(int [] a){


    for(int i=0;i<a.length-1;i++){

        if(a[i]>a[i+1])
         {
           int temp=a[i];
           a[i]=a[i+1];
           a[i+1]=temp;         
   
         }


         }

    for(int i=0;i<a.length;i++){

     System.out.println(a[i]);


       }

      return a;
}








public static void main(String[] args){


  int[] aa={10,02,403,504,2203,455};

   sortedArrayy(aa);             

}



}
