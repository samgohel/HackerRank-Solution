package com.sam.arrayProblem;

import java.util.Scanner;

public class ArrayHourglassSol {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int maxVal = Integer.MIN_VALUE;

		int[][] arr = new int[6][6];

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (i > 3 || j > 3)
					continue;

				int glassSum = arr[j][i] + arr[j][i + 1] + arr[j][i + 2] + arr[j + 1][i + 1] + arr[j + 2][i]
						+ arr[j + 2][i + 1] + arr[j + 2][i + 2];

				if (glassSum > maxVal)
					maxVal = glassSum;
			}
		}

		System.out.print(maxVal);
		scanner.close();
	}
}
