package ioStreams;

import java.util.Scanner;
import java.io.*;

public class UsingScannerObj {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in) ;//to read the values from keyboard

		System.out.print("Enter source file :" );
		String srcFile= scn.nextLine();

		System.out.print("Enter dest file :");
		String destFile=scn.nextLine();
		
		FileOutputStream fos=new FileOutputStream(srcFile);
		FileInputStream fis=new FileInputStream(destFile);

int data;
while((data=fis.read())!=-1) {
	fos.write(data);
}
System.out.println("File Copied");
fis.close();
fos.close();
	}

}
