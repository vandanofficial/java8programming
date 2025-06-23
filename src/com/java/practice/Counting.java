package com.java.practice;

import java.util.Scanner;

public class Counting {
	public static void main(String[] args) {

		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the table number ");
		int n= scanner.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println("table of " + n + " = " + n*i);
		}
	}
}
