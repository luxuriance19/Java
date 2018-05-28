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
			max_add[i] = max_add[i-1] > 0 ? max_add[i-1]+array[i]:array[i]; //��Ϊ����ĺ��������и������������Ϊ��������ô�϶�ǰһ�����ĸ���ֵ�ܴ�Ҳ���Ǵ���һ�������¿�ʼѰ���Ӽ������������и������������ȫ���еĳ���
			maxSubSum = Math.max(maxSubSum, max_add[i]);
		}
		System.out.println(maxSubSum);
	}

}
