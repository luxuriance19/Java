package com.ready;
import java.util.Scanner;
public class maxSubArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for(int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		int[] max_add = new int[n];
		max_add[0] = array[0];
		int maxSubSum = array[0];
		for(int i = 1; i < n; i++) {
			max_add[i] = max_add[i-1] > 0 ? max_add[i-1]+array[i]:array[i]; //因为数组的和有正有有负，所以如果和为负数，那么肯定前一个数的负数值很大，也就是从下一个数重新开始寻找子集；必须有正有负数，否则就是全数列的长度
			maxSubSum = Math.max(maxSubSum, max_add[i]);
		}
		System.out.println(maxSubSum);
	}

}
