package com.madhu.logical;

import java.util.Scanner;

public class Findvowels {
public static void main(String[] args) {
	System.out.println("enter string==");
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	char[] ch=s.toCharArray();
	int count=0;
	for (char c : ch) {
		switch(c){
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			count++;
			break;

		}
	}
	System.out.println("vowels ="+count);
}

}
