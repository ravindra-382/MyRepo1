package com.java.files;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileOperations3 {

	public static void main(String[] args) throws IOException, InterruptedException {
		File f= new File("./textfile3.txt");
		if(!f.exists())
			//f.delete();
		f.createNewFile();
		Scanner sc= new Scanner(f);
		/*while(sc.hasNext()){
		System.out.println(sc.next());
		Thread.sleep(200);
	}*/
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
			Thread.sleep(500);
		}
sc.close();
	}

	
}
