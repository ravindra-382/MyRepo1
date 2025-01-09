package com.java.patterns;

public class AlphabetIncreasePattern {

	public static void main(String[] args) {
		int alphabet= 97;
		for(int i=0; i<=5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print((char)(alphabet)+ " ");
			}
			alphabet ++;
System.out.println();


	}

}
}