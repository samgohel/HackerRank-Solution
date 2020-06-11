package com.sam.interviewRelated.HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String stringForCountString;
		stringForCountString = scanner.nextLine();
		scanner.close();
		String[] stringArry = stringForCountString.split(" "); // Space Seprate The String
		HashMap<String, Integer> stringCountMap = new HashMap<>();
		for (int i = 0; i < stringArry.length; i++) {
			if (stringCountMap.containsKey(stringArry[i])) {
				int count = stringCountMap.get(stringArry[i]);
				stringCountMap.put(stringArry[i], count + 1);
			} else {
				stringCountMap.put(stringArry[i], 1);
			}
		}
		System.out.println(stringCountMap);
	}

}
