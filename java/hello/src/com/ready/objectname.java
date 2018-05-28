package com.ready;
import java.util.Arrays;
import java.util.Scanner;
public class objectname {

	
	/*public static void main(String[] args){
		Scanner inputs = new Scanner(System.in);
		int N = inputs.nextInt();
		int[] nums = new int[N];
		/* int[] nums = int[]{2,3,4}; //后面这个方框当中不能够加数字
		* int[] nums = {2,3,4};
		* /
		int i = 0;
		while(i < N) {
			nums[i] = inputs.nextInt();
			i ++;
		}
		for(i=0;i < N; i++) {
			System.out.println(nums[i]);
		}
        int num = 999;
        int count = 0;
        while(num > 0){
            num = num/10;
            count ++;
        }
        System.out.println("它是个"+count+"位数");
        */
    	public static void main(String[] args) {
        
		// 定义一个字符串数组
		String[] hobbies = { "sports", "game", "movie" };
        
		// 使用Arrays类的sort()方法对数组进行排序
		Arrays.sort(hobbies);
        
		// 使用Arrays类的toString()方法将数组转换为字符串并输出
		System.out.println(Arrays.toString(hobbies));
		
		// 定义一个整型数组，保存成绩信息
		int[] scores = { 89, 72, 64, 58, 93 };
		        
		// 对Arrays类对数组进行排序
		Arrays.sort(scores);
		        
		// 使用foreach遍历输出数组中的元素
		for (int score:scores) {
			System.out.println(score);
		}	
		String[][] names={{"tom","jack","mike"},{"zhangsan","lisi","wangwu"}};
		// String[][] names = String[2][3];
		// String[][] names = String[2][];
		//names[0] = new int[2];
		//names[1] = new int[3];
		// 通过二重循环输出二维数组中元素的值
		for (int i = 0; i < names.length ; i++) {
            
			for (int j = 0; j < names[i].length; j++) {
                
				System.out.println(names[i][j]);
			}
            
			System.out.println();
		}
    }
}
