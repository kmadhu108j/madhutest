package com.madhu.logical;

public class Arraysecondhighestvalueprint {
public static void main(String[] args) {
	int arr[]={4,6,5,7,1};
	int temp;
	int size=arr.length;
	for(int i=0;i<size;i++){
		for(int j=i+1;j<size;j++){
			if(arr[i]>arr[j]){
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}

/*	int j=arr[0];
	int k=arr[0];
	for(int i=0;i<arr.length;i++){
		if(arr[i]>j){
			k=j;
			j=arr[i];
		}else if(arr[i]>k){
			k=arr[i];
		}
	}
	System.out.println(k);*/

}
}
