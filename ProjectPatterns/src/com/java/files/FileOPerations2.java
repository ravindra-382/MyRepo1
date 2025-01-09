package com.java.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileOPerations2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		/*File f1= new File(System.getProperty("user.dir")+"/textfile5.txt");
		if(f1.exists())
			f1.delete();
		f1.createNewFile();
		f1.getAbsoluteFile();
		System.out.println(f1.getAbsoluteFile());*/
	
		File f= new File("./textfile3.txt");
		if(!f.exists())
			//f.delete();
		f.createNewFile();
		//System.out.println(f.createNewFile());
		FileInputStream fis= new FileInputStream(f);
		int ascii;
		while((ascii=fis.read())!=-1) {
		System.out.print((char)ascii);
		Thread.sleep(200);
		}
 fis.close();
	}
}


