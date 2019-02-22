package com.madhu.logical;

import java.util.Arrays;

public class angramsprogram {
	public static boolean anagramscheck(String str1,String str2){
		char[]ch=str1.toCharArray();
		char[]ch1=str2.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);
		return Arrays.equals(ch, ch1);
		}

public static void main(String[] args) {
	String str1="madhu";
	String str2="uhdam";
	char[] ch2=str1.toCharArray();
	for(int i=str1.length()-1;i>=0;i--){
		System.out.print(str1.charAt(i));
	}
	System.out.println("both strings are anagrams="+anagramscheck(str1,str2));
}
}
