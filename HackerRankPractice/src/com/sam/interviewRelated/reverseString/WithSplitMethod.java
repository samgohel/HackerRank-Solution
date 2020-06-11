package com.sam.interviewRelated.reverseString;

import java.util.Scanner;

public class WithSplitMethod {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String toReverse = scanner.nextLine();
		String[] tokens = toReverse.split("");
		for (int i = tokens.length - 1; i >= 0; i--) {
			System.out.print(tokens[i] + "");
		}
		scanner.close();
	}

}
