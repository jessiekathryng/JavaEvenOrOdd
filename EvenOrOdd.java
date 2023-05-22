package com.bharath.javaprograms.simple;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		System.out.println("Enter a number");
//		we will use scanner to point to System.in so we can receive user input; We are assigning it to a local variable named Scanner
//		we are creating a 'try' block in order to test for errors while being executed; This also means we do not have to close the scanner 
		try (Scanner scanner = new Scanner(System.in);){
//		This is when the scanner will start reading the user inputs as integers;We are assigning this to an int variable called num
			int num = scanner.nextInt();
			if (num <= 0) {
				System.out.println("Invalid Number " + num);
			} else {
				if (num % 2 == 0) {
					System.out.println("Even");
				} else {
					System.out.println("odd");
				}
			}
		}
	}

}
