package com.sam.stringProblem;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class SubStringProblemSol {

	public static String gretestAndSmallestString(String str, int k) {
		SortedSet<String> sets = new TreeSet<String>();

		for (int i = 0; i <= str.length() - k; i++) {
			sets.add(str.substring(i, i + k));
		}

		String smallest = sets.last();
		String largest = sets.first();

		return smallest + "\n" + largest;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int k = sc.nextInt();
		System.out.println(gretestAndSmallestString(str, k));
		sc.close();
	}
}
