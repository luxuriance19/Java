package com.ready;
import java.util.Arrays;
import java.util.Scanner;
public class objectname {

	
	/*public static void main(String[] args){
		Scanner inputs = new Scanner(System.in);
		int N = inputs.nextInt();
		int[] nums = new int[N];
		/* int[] nums = int[]{2,3,4}; //������������в��ܹ�������
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
        System.out.println("���Ǹ�"+count+"λ��");
        */
    	public static void main(String[] args) {
        
		// ����һ���ַ�������
		String[] hobbies = { "sports", "game", "movie" };
        
		// ʹ��Arrays���sort()�����������������
		Arrays.sort(hobbies);
        
		// ʹ��Arrays���toString()����������ת��Ϊ�ַ��������
		System.out.println(Arrays.toString(hobbies));
		
		// ����һ���������飬����ɼ���Ϣ
		int[] scores = { 89, 72, 64, 58, 93 };
		        
		// ��Arrays��������������
		Arrays.sort(scores);
		        
		// ʹ��foreach������������е�Ԫ��
		for (int score:scores) {
			System.out.println(score);
		}	
		String[][] names={{"tom","jack","mike"},{"zhangsan","lisi","wangwu"}};
		// String[][] names = String[2][3];
		// String[][] names = String[2][];
		//names[0] = new int[2];
		//names[1] = new int[3];
		// ͨ������ѭ�������ά������Ԫ�ص�ֵ
		for (int i = 0; i < names.length ; i++) {
            
			for (int j = 0; j < names[i].length; j++) {
                
				System.out.println(names[i][j]);
			}
            
			System.out.println();
		}
    }
}
