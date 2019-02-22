package com.madhu.logical;

import java.util.Scanner;

public class Numberreverse {
public static void main(String[] args) {
	int num,remainder,value=0,a;
	Scanner sc=new Scanner(System.in);
	System.out.println("entter any number");
	num=sc.nextInt();
	remainder=num;
	while(num!=0){
		a=num%10;
		value=value*10+a;
		num=num/10;
	}
	if(value==remainder){System.out.println("palindrome");
	}
	else{System.out.println("not palindrome");}
}
}
