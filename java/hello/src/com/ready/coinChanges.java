
package com.ready;
import java.util.Scanner;
public class coinChanges {
	static int changeCounts(int[] coins, int n, int money) {//n式coins的长度，也就是coin的种类
		int[] dp = new int[money+1];
		for(int i=0;i<money+1;i++) {
			dp[i] = 0;
		}
		dp[0] = 1;
		for(int i=0; i<n; i++) {
			for(int j=coins[i];j<=money;j++) {
				dp[j] += dp[j-coins[i]];
			}
		}
		return dp[money];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();
		for(int i=0; i<times;i++) {
			int n = sc.nextInt();
			int money = sc.nextInt();
			int[] coins = new int[n];
			for(int j=0; j < n; j++) {
				coins[j] = sc.nextInt();
			}
			int counts = changeCounts(coins,n,money);
			System.out.println(counts);
		}
	}

}
