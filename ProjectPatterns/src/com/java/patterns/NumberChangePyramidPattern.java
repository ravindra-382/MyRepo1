package com.java.patterns;

public class NumberChangePyramidPattern {

	public static void main(String[] args) {
		int number=1;
		for(int i=0; i<=5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print((number+j)+" ");
			}
			System.out.println();
		}
		
	}

}
