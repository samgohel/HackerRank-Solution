package com.sam.arrayProblem;

import java.util.Scanner;

public class OneDimensionArraySol {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
