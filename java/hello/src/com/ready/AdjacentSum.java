package com.ready;
import java.util.Scanner;
/*
 * 一个圆形数组，找到间隔数组的和的最大值
 * totalSold包含前面数组的和，如果数组长度为1也就是原来数组的值
 * 如果数组长度不为1，当在数组位置i的时候，考虑前面的i-2的总售出与i位置的和，以及前面i-1的总售出的值的差别，选取大的值赋给前面totalSold[i],也就是前面i-1个元素的最大售出
 */
public class AdjacentSum {
	static int circleSolution(int[] sells, int n){
		int[] totalSold = new int[n+1];
		boolean[] isUsed = new boolean[n];
		isUsed[0] = true;
		for(int i = 0; i < n; i++) {
			isUsed[i] = false;
		}
		totalSold[0] = 0;
		totalSold[1] = sells[0];
		for(int i=2; i < n+1; i++) {//这里以totalSold的index作为指标，所以i表示数组第i个元素，数组的index为i-1,与其不相邻的元素式i-3,也就是totalSold[i-3]前面的最大和
			int takei = totalSold[i-2] + sells[i-1];
			int skipi = totalSold[i-1];
			if(takei > skipi) {
				totalSold[i] = takei;
				isUsed[i-1] = true;
			}
			else {
				totalSold[i] = skipi;
				isUsed[i-1] = false;
			}
		}
		
		if(!isUsed[n-1]) {//查看最后一个元素有没有使用
			return totalSold[n];
		}
		int i = n-1;
		boolean isFirstUsed = false;//表示第一个元素是不是使用了
		while(i >= 0) {
			if(isUsed[i]) {
				if(i==0) {
					isFirstUsed = true;
				}
				i -= 2;
			}
			else {
				i--;
			}
		}
		return isFirstUsed ? totalSold[n-1] : totalSold[n];
	}
	static int[] shift(int[] sells,int steps,int n) {
		int[] newArray = new int[n];
		System.arraycopy(sells, steps, newArray, 0, n-steps);
		System.arraycopy(sells, 0, newArray, n-steps, steps);
		return newArray;
	}
	static int maxTotalSold(int[] sells, int n) {
		int sold1 = circleSolution(sells,n);
		sells = shift(sells,1,n);
		int sold2 = circleSolution(sells,n);
		sells = shift(sells,1,n);
		int sold3 = circleSolution(sells,n);
		int maxSold = Math.max(sold1, sold2);
		maxSold = Math.max(sold3, maxSold);
		return maxSold;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();
		for(int i=0; i<times; i++) {
			int n = sc.nextInt();
			int[] sells = new int[n];
			for(int j=0; j<n; j++) {
				sells[j] = sc.nextInt();
			}
			//for(int sell:sells) {
			//	System.out.println(sell);
			//}
			int maxSold = maxTotalSold(sells,n);
			System.out.println(maxSold);
		}
		
	}
}
