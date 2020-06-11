package com.sam.interviewRelated.swapNumber;

import java.util.Scanner;

public class WithoutThirdNumber {

	public static void main(String[] args) {
		int x, y;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Value Of X And Y");
		x = scanner.nextInt();
		y = scanner.nextInt();
		scanner.close();
		System.out.println("Before Swapping\nx = " + x + "\ny = " + y);

		x = x + y;
		y = x - y;
		x = x - y;

		System.out.println("After Swapping\nx = " + x + "\ny = " + y);
	}

}
