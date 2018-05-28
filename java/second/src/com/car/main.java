package com.car;
import java.util.Scanner;
public class main {
	public static final Car[] CARS = {
			new PassengerCar("奥迪A4", 500, 4), 
			new PassengerCar("马自达6", 400, 4), 
			new PickUp("皮卡雪6", 450, 4, 2), 
			new PassengerCar("金龙", 800, 20), 
			new Trunk("松花江", 400, 4), 
			new Trunk("依维柯", 1000, 20)
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("欢迎使用答答租车系统：%n您是否要租车：1是；0否%n");
		int tag = sc.nextInt();
		if(tag==1) {
			System.out.printf("%n您可租车的类型及其价目表：%n");
			System.out.println("序号\t汽车名称\t租金\t\t容量");
			for(int i = 0; i < CARS.length; i++) {
				System.out.printf("%d.\t%s\t\t%d元/天\t%s%n", 
						i+1,CARS[i].getName(),CARS[i].getPrice(),CARS[i].getCapacity());
			}
			
			System.out.println("请输入需要租车的数量");
			int count = sc.nextInt();
			
			int[] choices = new int[CARS.length];
			for(int i=0;i<count;i++) {
				System.out.printf("请输入第%d辆车的序号",i+1);
				int number = sc.nextInt() - 1;
				choices[number] ++;
			}
			System.out.printf("请输入租车的天数：");
			int days = sc.nextInt();
			
			System.out.printf("%n您的帐单：%n");
			System.out.println("***可裁人的车有：");
			int seatCountT = 0;
			for(int i =0; i<choices.length;i++) {
				if(choices[i] !=0 && CARS[i] instanceof ITranHuman) {
					System.out.printf("%s*%d",CARS[i].getName(),choices[i]);
					seatCountT += ((ITranHuman)CARS[i]).getSeatCount()*choices[i];
				}
			}
			System.out.printf("共载人：%d人%n", seatCountT); 
			System.out.println("***可裁货的车有：");
			int goodWeightTotal = 0; 
			for (int i = 0; i < choices.length; i++) { 
				if (choices[i] != 0 && CARS[i] instanceof ITranGood) { 
					System.out.printf("%s*%d ", CARS[i].getName(), choices[i]); 
					goodWeightTotal += ((ITranGood) CARS[i]).getGoodWeight() * choices[i]; 
				} 
			} 
			System.out.printf("共载货：%d吨%n", goodWeightTotal); 
			int priceTotal = 0; for (int i = 0; i < choices.length; i++) { 
				if (choices[i] != 0) { priceTotal += CARS[i].getPrice() * choices[i];
				} 
			} 
			System.out.printf("***租车总价格：%d元%n", priceTotal * days);
		}
		sc.close();

	}

}


