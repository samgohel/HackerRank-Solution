package com.sam.interviewRelated.swapNumber;

import java.util.Scanner;

public class WithThirdNumber {

	public static void main(String[] args) {
		int x, y, temp;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Value Of X And Y");
		x = scanner.nextInt();
		y = scanner.nextInt();
		scanner.close();
		System.out.println("Before Swapping\nx = " + x + "\ny = " + y);

		temp = x;
		x = y;
		y = temp;

		System.out.println("After Swapping\nx = " + x + "\ny = " + y);
	}
}
