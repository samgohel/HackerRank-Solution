package com.sam.interviewRelated;

public class PrintTablesSol {

	public static void main(String[] args) {

		for (int j = 1; j <= 20; j++) {
			int tableOf = j;
			for (int i = 1; i <= 10; i++) {
				String padded = String.format("%03d", tableOf * i);
				System.out.print(padded + " ");
			}
			System.out.println();
		}

	}

}
