package com.java.decisionmaking;

import java.util.Scanner;

public class IfStatement {

	public static void main(String[] args) {
		//int i=100;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the any number");
		int number = sc.nextInt();
		System.out.println("Enter the any number");
		int number1 = sc.nextInt();
		System.out.println("Enter the any number");
		int number2 = sc.nextInt();
		if(number>number1)
			System.out.println(number + " is print");
		else if(number1>number2)
			System.out.println(number1 + " is print");
		else if(number2>number)
			System.out.println(number2 + " is print");
		else
			System.out.println("invalid number");
		sc.close();
	}



}
