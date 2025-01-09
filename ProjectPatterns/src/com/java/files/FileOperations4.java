package com.java.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileOperations4 {

	public static void main(String[] args) throws IOException {
		File f= new File("./textfile3.txt");
		FileReader fr= new FileReader(f);
		
		int ascii;
		while((ascii= fr.read())!= -1)
			System.out.print((char)ascii);
		fr.close();
	}

}
