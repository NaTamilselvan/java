package Fileio;
import java.io.File;
public class Folder {

	public static void main(String[] args) {
		// TODO Auto-generated method stubile 
		
		File file=new File("/home/natamilme/Documents/");
				 
		//file.mkdir();
		//file.mkdirs();
		//System.out.println();
		
		
		
	    System.out.println(file.getAbsolutePath()); 
	    String[] st = file.list(); 
	    for(int i=0; i<st.length; i++)
	    {
	      System.out.println(st[i]);
	    }
	    
	    System.out.println("between");
	    File[] str=file.listFiles();
	    
	    for(int i=0;i<st.length;i++) {
	    	if(str[i].isFile())
	    	System.out.println(str[i]);
	    }
		

	}

}
