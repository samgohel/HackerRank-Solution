package com.sam.arrayProblem;

import java.util.Scanner;

public class SubArraySol {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfElement = sc.nextInt();
		int[] myArry = new int[numberOfElement];
		for (int i = 0; i < numberOfElement; i++) {
			myArry[i] = sc.nextInt();
		}
		sc.close();
		System.out.println(findSubArray(myArry));

	}

	private static int findSubArray(int[] myArry) {

		int count = 0;

		for (int i = 0; i < myArry.length; i++) {
			int sum = 0;

			for (int j = i; j < myArry.length; j++) {
				sum += myArry[j];
				if (sum < 0) {
					count++;
				}
			}
		}
		return count;
	}

}
