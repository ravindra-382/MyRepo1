package com.java.patterns;

public class HallowRightAnglrTriangle {

	public static void main(String[] args) {
		for(int i=0; i<=5; i++) {
			for(int j=0; j<=i; j++) {
				if(j==0||i== 5 || j==i)
				System.out.print("*");
			
			else
				System.out.print(" ");
			}
			
			System.out.println();
	}
	}

}
