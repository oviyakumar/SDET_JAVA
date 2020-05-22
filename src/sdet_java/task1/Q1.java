package sdet_java.task1;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		 
		
		Scanner scan=new Scanner(System.in);
		Q1 rev=new Q1();
		 
		System.out.println("Enter the String to Reverse:");
	 	String givenString=scan.nextLine();
 		System.out.println("Rversed String"+rev.reverseString(givenString));
		scan.close();
	}

	private String reverseString(String givenString) {
		
		char[] given= givenString.toCharArray();
		String str = "";
				 
		for (int i = given.length-1; i>=0; i--) {
			str+=given[i];
		}
				 
		return str;
	}

}
