package ioStreams;
import java.io.*;

public class WriteDataIntoFile {
	
	public void write() {
	}
	public void flush() {
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileOutputStream fos=new FileOutputStream("write.txt");

fos.write(5);
System.out.println("data is saved");


fos.flush();  

fos.close();
	}

	
	}

