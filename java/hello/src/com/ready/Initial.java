package com.ready;

public class Initial {
	public static void main(String[] args) {
		Animal animal = new Animal();
		System.out.println(animal.age);
		Dog dog = new Dog();
		dog.eat();
		dog.age = 10;
		//�̳еĶ�̥��
		//���������
		Animal obj1 = new Animal();
		Animal obj2 = new Dog(); //���������ָ������Ķ���,������������ò���ָ����
		Animal obj3 = new Cats();
		//�����Ķ�̥
		obj1.eat();//���౾��ķ���
		obj2.eat();//������д�ķ���
		obj3.eat();//����̳еķ���
		// obj2.watchDog();��������ò��ܵ���������еķ���
		
		Dog dog1 = new Dog();//���������ָ�����
		Animal animal1 = dog1;//�Զ��������� ��������ת�� �������������ָ�����
		
		Dog dog2 = (Dog)animal1;//��������ת����ǿ��ת���������������ת��Ϊ��������ã����±���ǿ��ת����
		//Cats cat = (Cats)animal1;//��ʱ������Ȼ���ᱨ������ִ�е�ʱ��Dog�޷�ǿתΪCats���͡�
		//��instance of �ؼ������ж�
		if(animal1 instanceof Cats) {
			Cats cat = (Cats)animal1;
		}
		else {
			System.out.println("�޷�����ǿ������ת��");
		}
		
		Telphone tel1 = new Cellphone();
		tel1.call();
		tel1.message();
		Telphone tel2 = new SmartPhone();
		tel2.call();
		tel2.message();
		CalPeriAndArea rec = new Rectangle();
		rec.length=3.2;
		rec.width=2.8;
		rec.perimeter();
		rec.area();
		CalPeriAndArea circle = new Circle();
		circle.radius = 1;
		circle.perimeter();
		circle.area();
		
		IPlayGame ip1 = new SmartPhone();
		ip1.playGame();
		IPlayGame ip2 = new Psp();
		ip2.playGame();
		
		IPlayGame ip3 = new IPlayGame() {

			@Override
			public void playGame() {
				// TODO Auto-generated method stub
				System.out.println("�����ڲ���ʵ��");
			}
			
		};
		ip3.playGame();
		new IPlayGame() {

			@Override
			public void playGame() {
				// TODO Auto-generated method stub
				System.out.println("�����ڲ���ʵ��,����ֵ");
			}
			
		}.playGame();
	}

}
