package com.sam.stringProblem;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagMatchSol {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while (testCases-- > 0) {
			String line = in.nextLine();
			boolean matchFound = false;
			Pattern myPattern = Pattern.compile("<(.+)>([^<]+)</\\1>");
			Matcher myMatcher = myPattern.matcher(line);

			while (myMatcher.find()) {
				System.out.println(myMatcher.group(2));
				matchFound = true;
			}
			if (!matchFound) {
				System.out.println("None");
			}
		}
		in.close();
	}

}
