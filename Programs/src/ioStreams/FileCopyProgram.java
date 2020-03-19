package ioStreams;
import java.io.*;
public class FileCopyProgram {

	public static void main(String[] args) throws IOException ,FileNotFoundException{
		// Copying text from ont file to other file
FileInputStream fis=new FileInputStream("read.text");
FileOutputStream fos=new FileOutputStream("writee.text");


int data;
while((data=fis.read())!=-1) {
	fos.write(data);
	
}
System.out.println("File Copied");

fis.close();
fos.close();
	}

	
}
