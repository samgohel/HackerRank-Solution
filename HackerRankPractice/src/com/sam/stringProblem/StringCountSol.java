package com.sam.stringProblem;

import java.util.Arrays;
import java.util.Scanner;

public class StringCountSol {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine().trim();
		if (s.length() > 400000) {
			scan.close();
			return;
		} else {
			String[] tokens = s.split("[ !,?." + "\\\\_'@]+");
			System.out.println(s.isEmpty() ? "0" : tokens.length);
			Arrays.stream(tokens).forEach(e -> System.out.println(e));
			scan.close();
		}
	}
}
