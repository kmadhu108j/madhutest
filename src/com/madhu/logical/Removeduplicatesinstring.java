package com.madhu.logical;

import java.util.HashSet;
import java.util.Set;


public class Removeduplicatesinstring {

public static void main(String[] args) {
String s="madhureddy";
char[]ch=s.toCharArray();
Set<Character> se=new HashSet<Character>();
for (Character c : ch) {
	se.add(c);
}
System.out.println(se);
/*StringBuilder sb=new StringBuilder();
for (Character character : se) {
	sb.append(character);
}
System.out.println(sb.toString());*/
}
}
