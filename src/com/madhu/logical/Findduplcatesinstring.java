package com.madhu.logical;

import java.util.HashSet;
import java.util.Set;

public class Findduplcatesinstring {
public static void main(String[] args) {
	String[]duplicates=new String[] {"madhu","java","madhu","mahi","java"};
	Set nonduplicatesset=new HashSet();
	Set duplicatesset=new HashSet();
	for (String str : duplicates) {
		if(!nonduplicatesset.contains(str)){
			nonduplicatesset.add(str);
		}else {
			duplicatesset.add(str);
		}
	}
System.out.println(duplicatesset);
}
}
