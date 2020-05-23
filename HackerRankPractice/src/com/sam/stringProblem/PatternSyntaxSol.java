package com.sam.stringProblem;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxSol {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while (testCases > 0) {
			try {
				String pattern = in.nextLine();
				Pattern.compile(pattern);
				System.out.println("Valid");

			} catch (PatternSyntaxException e) {
				System.out.println("Invalid");
				testCases--;
			}
			in.close();

		}

	}

}
