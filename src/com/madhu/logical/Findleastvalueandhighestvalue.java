package com.madhu.logical;

import java.util.Arrays;

public class Findleastvalueandhighestvalue {
public static void main(String[] args) {
	int[] nums={7,3,6,9,2};
	Arrays.sort(nums);
	System.out.println(nums[0]);
	System.out.println(nums[nums.length-1]);
}
}
