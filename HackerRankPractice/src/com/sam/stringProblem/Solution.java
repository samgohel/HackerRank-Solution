package com.sam.stringProblem;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();

		int stringLen = A.length() + B.length();
		System.out.println(stringLen);

		if (A.compareToIgnoreCase(B) > 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		// insted of if else block we can use "Ternary"
		// System.out.println(A.compareTo(B)>0?"Yes":"No");

		System.out.print(A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase()
				+ B.substring(1));

		sc.close();
	}
}