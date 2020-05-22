package sdet_java.task1;

import java.util.Arrays;
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		Q3 prg=new Q3();
		int[] data,queries;
		
		System.out.println("**********Finding the Greatest Number with given criteria***************");
		System.out.println("1.Enter the number of Elements in array and queries");
		int arraySize=scan.nextInt();
			data=new int[arraySize];
		int querySize=scan.nextInt();
		queries=new int[querySize];
		
		System.out.println("2.Enter Array Elements");
		for(int i=0;i<arraySize;i++) {
			data[i]=scan.nextInt();
		}
		
		System.out.println("3.Enter Query Elements");
		for(int i=0;i<querySize;i++) {
			queries[i]=scan.nextInt();
		}
		
		System.out.println("\nResults:");
		Arrays.sort(data);
		for(int i=0;i<querySize;i++) {
			System.out.println(prg.findtheLargeNumberinArray(data,queries[i]));
		}
		
		scan.close();
	}

	private int findtheLargeNumberinArray(int[] data, int max) {
		for(int i=0;i<data.length;i++) {
			 if(data[i]>=max) {				
				 return data[i-1];
			 }
		}		 
		return data[data.length-1];
	}

}
