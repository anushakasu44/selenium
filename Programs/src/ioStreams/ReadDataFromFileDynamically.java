package ioStreams;

import java.io.*;
public class ReadDataFromFileDynamically {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileInputStream fis = new FileInputStream("abc.text");
int data;
while((data=fis.read()) !=-1) {
	System.out.println("data :"+data+ " "+(char)data);
}
fis.close();

	}

}
