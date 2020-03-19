package ioStreams;

import java.io.*;

public class ReadDataFromFile {
	
	public static void main(String[] args) throws IOException,FileNotFoundException {
		// TODO Auto-generated method stub
	
	FileInputStream fis=new FileInputStream("abc.text");
	int data= fis.read();
	int data1= fis.read();
	int data2= fis.read();
	
	System.out.println(data);
	System.out.println(data1);
	System.out.println(data2);
	
	//System.out.println("data :"+(char)data);
	fis.close();
	}

}
