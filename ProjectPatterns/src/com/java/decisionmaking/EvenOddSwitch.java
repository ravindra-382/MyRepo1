package com.java.decisionmaking;

import java.util.Scanner;
public class EvenOddSwitch {

	public static void main(String[] args) {
		//int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		int number = sc.nextInt();
		switch (number% 2) {
		case 0:
			System.out.println(number+" is even number");
			break;
		case 1:
			System.out.println(number+" is odd number");
			break;

		default: 
			System.out.println("invalid number");
			break;

		}
		sc.close();
	}

}

