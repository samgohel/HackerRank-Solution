package com.sam.interviewRelated.reverseString;

import java.util.Scanner;

public class WithStringBuilder {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String toReverse = scanner.nextLine();
		StringBuilder builder = new StringBuilder();
		builder.append(toReverse);
		System.out.println(builder.reverse());
		scanner.close();
	}

}
