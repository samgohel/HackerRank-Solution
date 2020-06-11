package com.sam.interviewRelated.reverseString;

import java.util.Scanner;

public class WithCharArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String toReverse = scanner.nextLine();
		char[] stringToArray = toReverse.toCharArray();
		for (int i = stringToArray.length - 1; i >= 0; i--) {
			System.out.print(stringToArray[i]);
		}
		scanner.close();
	}

}
