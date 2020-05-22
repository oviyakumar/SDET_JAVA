package sdet_java.task1;

import java.util.Arrays;
import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		 
		Scanner scan=new Scanner(System.in);
		int[] data;
		
		System.out.println("**********Checking Given N is multiple of 2***************");
		System.out.println("1.Enter the Number of Test Case follwed by Testing numbers");
		 
		int testCase=scan.nextInt();
		data=new int[testCase];
			 
		for(int i=0;i<testCase;i++) {
			data[i]=scan.nextInt();
		}
		
		 
		for(int i=0;i<testCase;i++) {
			System.out.println(checkThePowerOf2(data[i]));
		}
		
		
		scan.close();
	}

	private static String checkThePowerOf2(int n) {
		boolean status;
		
		if(n==0) 
			status=false;
		else		  
			status= (int)(Math.ceil((Math.log(n) / Math.log(2)))) ==  (int)(Math.floor(((Math.log(n) / Math.log(2)))));
		
		if(status)
			return "Yes";
		else
			return "No";
	}

	 

}
