package com.sam.stringProblem;

import java.util.Scanner;

public class ValidateIpSol {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String IP = in.next();
			System.out.println(IP.matches(new MyRegex().pattern));
		}
		in.close();

	}

}

class MyRegex {
	public static final String IPADDRESS_255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
	public static final String pattern = IPADDRESS_255 + "\\." + IPADDRESS_255 + "\\." + IPADDRESS_255 + "\\."
			+ IPADDRESS_255;

}
