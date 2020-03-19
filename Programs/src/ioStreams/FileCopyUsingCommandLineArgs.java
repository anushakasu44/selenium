package ioStreams;
import java.io.*;
public class FileCopyUsingCommandLineArgs {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
FileInputStream fis=new FileInputStream(args[0]); //read.txt
FileOutputStream fos=new FileOutputStream(args[1]); //create any text document

int data;
while((data=fis.read())!=-1) {
	fos.write(data);
}
System.out.println("file copied");
	}

}
