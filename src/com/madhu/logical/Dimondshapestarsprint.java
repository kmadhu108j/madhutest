package com.madhu.logical;

public class Dimondshapestarsprint {
public static void main(String[] args) {
	for(int i=1;i<=5;i++){
		for(int j=i;j<=4;j++){
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++){
			System.out.print("*  ");
		}
		System.out.println();
	}
	/*for (int p = 1; p<=4; p++) {
		for (int m = 1; m <=p; m++) {
			System.out.print(" ");
		}
		for (int n = p; n <=4; n++) {
			System.out.print("*  ");
		}
		System.out.println();
	}*/
}
}
