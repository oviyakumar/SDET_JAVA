package sdet_java.task4;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Q1 {

	private static Map<Character, Integer> lib=new HashMap<>();
	
	public static void main(String[] args) {
		String str="Better Butter";
		
		extractCharactors(str);
		displayFrequency();
		
	}

	private static void displayFrequency() {
		for(Entry<Character, Integer> entry:lib.entrySet()) {
			if(entry.getValue()>1)
				System.out.println("Frequency of "+entry.getKey()+"  :"+entry.getValue());
		}
		
	}

	private static void extractCharactors(String str) {
		char[] strs=str.toCharArray();
		
		for(char chr:strs) {			
			if(chr==' ')
				continue;
			
			if(validate(chr))
				appendThisChar(chr);
			else
				addThisChar(chr);
		}
		
	}

	private static void appendThisChar(char chr) {
		lib.replace(chr, (lib.get(chr)+1));		
	}

	private static boolean validate(char chr) {
		return lib.containsKey(chr);
	}

	private static void addThisChar(char chr) {
		lib.put(chr, 1);		
	}
	
	
	

}
