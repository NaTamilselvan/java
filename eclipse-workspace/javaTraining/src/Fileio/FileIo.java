package Fileio;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("/home/natamilme/Documents/tamil.txt");
		f.createNewFile();
		
		FileWriter writter=new FileWriter(f);
		
		writter.append("Tamilselvan");
		
		writter.append("manjuakka");
		
		writter.close();
		
		
		
		
		FileReader reader=new  FileReader (f);
		int i=reader.read();
		int count=0;
		while(i!=-1) {
			
			
			System.out.println((char)i);

			i=reader.read();
			count++;
		}
		System.out.println(count);
		

	}

}
