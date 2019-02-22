package com.madhu.logical;

public class Stringreverse {
public static void main(String[] args) {
	String s ="madhujava";
	char[] ch=s.toCharArray();
	for(int i=ch.length-1;i>=0;i--){
		System.out.print(s.charAt(i));
	}
}
}
