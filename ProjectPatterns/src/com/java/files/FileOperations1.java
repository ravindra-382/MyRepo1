package com.java.files;

import java.io.File;
import java.io.IOException;

public class FileOperations1 {

	public static void main(String[] args) throws IOException {
		File f= new File("E:\\files\\resumes\\textfile.txt");
		if(f.exists())
			f.delete();
		f.createNewFile();
		System.out.println(f.exists());
		System.out.println(f.delete());
		System.out.println(f.createNewFile());
		System.out.println(f.getPath());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getName());
		System.out.println(f.getParent());
		System.out.println(f.isAbsolute());
		System.out.println(f.isDirectory());
		System.out.println(f.isFile());
		
		System.out.println(f.canRead());
		
		System.out.println(f.isHidden());
		System.out.println(f.canWrite());
		System.out.println(f.setWritable(true));
		File f1= new File("E:\\files\\resumes\\testing\\manual\\functional\\db");
		f1.mkdirs();
		System.out.println(f1.mkdir());

	}

}
