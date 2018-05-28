package com.car;
import java.util.Scanner;
public class main {
	public static final Car[] CARS = {
			new PassengerCar("�µ�A4", 500, 4), 
			new PassengerCar("���Դ�6", 400, 4), 
			new PickUp("Ƥ��ѩ6", 450, 4, 2), 
			new PassengerCar("����", 800, 20), 
			new Trunk("�ɻ���", 400, 4), 
			new Trunk("��ά��", 1000, 20)
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("��ӭʹ�ô���⳵ϵͳ��%n���Ƿ�Ҫ�⳵��1�ǣ�0��%n");
		int tag = sc.nextInt();
		if(tag==1) {
			System.out.printf("%n�����⳵�����ͼ����Ŀ��%n");
			System.out.println("���\t��������\t���\t\t����");
			for(int i = 0; i < CARS.length; i++) {
				System.out.printf("%d.\t%s\t\t%dԪ/��\t%s%n", 
						i+1,CARS[i].getName(),CARS[i].getPrice(),CARS[i].getCapacity());
			}
			
			System.out.println("��������Ҫ�⳵������");
			int count = sc.nextInt();
			
			int[] choices = new int[CARS.length];
			for(int i=0;i<count;i++) {
				System.out.printf("�������%d���������",i+1);
				int number = sc.nextInt() - 1;
				choices[number] ++;
			}
			System.out.printf("�������⳵��������");
			int days = sc.nextInt();
			
			System.out.printf("%n�����ʵ���%n");
			System.out.println("***�ɲ��˵ĳ��У�");
			int seatCountT = 0;
			for(int i =0; i<choices.length;i++) {
				if(choices[i] !=0 && CARS[i] instanceof ITranHuman) {
					System.out.printf("%s*%d",CARS[i].getName(),choices[i]);
					seatCountT += ((ITranHuman)CARS[i]).getSeatCount()*choices[i];
				}
			}
			System.out.printf("�����ˣ�%d��%n", seatCountT); 
			System.out.println("***�ɲû��ĳ��У�");
			int goodWeightTotal = 0; 
			for (int i = 0; i < choices.length; i++) { 
				if (choices[i] != 0 && CARS[i] instanceof ITranGood) { 
					System.out.printf("%s*%d ", CARS[i].getName(), choices[i]); 
					goodWeightTotal += ((ITranGood) CARS[i]).getGoodWeight() * choices[i]; 
				} 
			} 
			System.out.printf("���ػ���%d��%n", goodWeightTotal); 
			int priceTotal = 0; for (int i = 0; i < choices.length; i++) { 
				if (choices[i] != 0) { priceTotal += CARS[i].getPrice() * choices[i];
				} 
			} 
			System.out.printf("***�⳵�ܼ۸�%dԪ%n", priceTotal * days);
		}
		sc.close();

	}

}


