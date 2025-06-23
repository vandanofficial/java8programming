package com.java.practice;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Counting {
	public static void main(String[] args) {

		//Scanner scanner= new Scanner(System.in);
		//System.out.println("Enter the table number ");
		//int n= scanner.nextInt();
		//for(int i=1;i<=10;i++) {
			//System.out.println("table of " + n + " = " + n*i);
		//}
		//for(int i=1;i<=10;i++) {
		//System.out.println("table of "+ 5 + "  =  "+ 5 * i);
	//}
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the table number ");
		int n= scanner.nextInt();
		    IntStream.rangeClosed(1, 10)
		    .forEach(i -> System.out.println("6 x " + i + " = " + (6 * i)));
	}
}
