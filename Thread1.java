class Thread1 extends Thread{


public void run(){


for(int i=0;i<=5;i++){

System.out.println("The thread one "+i);

}

}


}


class Thread2 extends Thread{


public void run(){


for(int i=0;i<=5;i++){

System.out.println("The thread Two "+i);

}

}


}
