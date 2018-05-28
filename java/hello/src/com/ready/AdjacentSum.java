package com.ready;
import java.util.Scanner;
/*
 * һ��Բ�����飬�ҵ��������ĺ͵����ֵ
 * totalSold����ǰ������ĺͣ�������鳤��Ϊ1Ҳ����ԭ�������ֵ
 * ������鳤�Ȳ�Ϊ1����������λ��i��ʱ�򣬿���ǰ���i-2�����۳���iλ�õĺͣ��Լ�ǰ��i-1�����۳���ֵ�Ĳ��ѡȡ���ֵ����ǰ��totalSold[i],Ҳ����ǰ��i-1��Ԫ�ص�����۳�
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
		for(int i=2; i < n+1; i++) {//������totalSold��index��Ϊָ�꣬����i��ʾ�����i��Ԫ�أ������indexΪi-1,���䲻���ڵ�Ԫ��ʽi-3,Ҳ����totalSold[i-3]ǰ�������
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
		
		if(!isUsed[n-1]) {//�鿴���һ��Ԫ����û��ʹ��
			return totalSold[n];
		}
		int i = n-1;
		boolean isFirstUsed = false;//��ʾ��һ��Ԫ���ǲ���ʹ����
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
