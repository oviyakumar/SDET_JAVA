package sdet_java.task1;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		Q4 prg=new Q4();
		int[] digit1,digit2;
		
		System.out.println("**********Swaping two numbers***************");
		System.out.println("1.Enter the number of Test cases");
		int testcase=scan.nextInt();
		digit1=new int[testcase];digit2=new int[testcase];
		
		for(int i=0;i<testcase;i++) {
			System.out.println("Test case numbers "+(i+1));
			digit1[i]=scan.nextInt();
			digit2[i]=scan.nextInt();
		}
		
		 
		System.out.println("Results");
		
		for(int i=0;i<testcase;i++) {
			System.out.println(digit2[i]+" "+digit1[i]);
		}
		
		scan.close();
	}

}
