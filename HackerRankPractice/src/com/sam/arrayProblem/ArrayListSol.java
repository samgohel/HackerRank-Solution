package com.sam.arrayProblem;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSol {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfArray = sc.nextInt();

		ArrayList<ArrayList<Integer>> lists = new ArrayList<>();

		for (int row = 0; row < numberOfArray; row++) {
			int d = sc.nextInt();

			ArrayList<Integer> listOfArray = new ArrayList<>();

			for (int col = 0; col < d; col++) {
				listOfArray.add(sc.nextInt());
			}

			lists.add(listOfArray);
		}

		int numberOfQuery = sc.nextInt();
		for (int i = 0; i < numberOfQuery; i++) {
			int lineNumber = sc.nextInt();
			int indexPosition = sc.nextInt();

			ArrayList<Integer> list = lists.get(lineNumber - 1);
			if (indexPosition <= list.size()) {
				System.out.println(list.get(indexPosition - 1));
			} else {
				System.out.println("ERROR!");
			}

		}

		sc.close();

	}

}
