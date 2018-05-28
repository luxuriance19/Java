package com.ready;

public class Initial {
	public static void main(String[] args) {
		Animal animal = new Animal();
		System.out.println(animal.age);
		Dog dog = new Dog();
		dog.eat();
		dog.age = 10;
		//继承的堕胎。
		//父类的引用
		Animal obj1 = new Animal();
		Animal obj2 = new Dog(); //父类的引用指向子类的对象,但是子类的引用不能指向父类
		Animal obj3 = new Cats();
		//方法的堕胎
		obj1.eat();//父类本身的方法
		obj2.eat();//子类重写的方法
		obj3.eat();//子类继承的方法
		// obj2.watchDog();父类的引用不能调用子类独有的方法
		
		Dog dog1 = new Dog();//子类的引用指向对象
		Animal animal1 = dog1;//自动类型提升 向上类型转化 （将父类的引用指向对象）
		
		Dog dog2 = (Dog)animal1;//向下类型转换，强制转换（将父类的引用转换为子类的引用，向下必须强制转换）
		//Cats cat = (Cats)animal1;//此时编译虽然不会报错，但是执行的时候Dog无法强转为Cats类型。
		//用instance of 关键字来判断
		if(animal1 instanceof Cats) {
			Cats cat = (Cats)animal1;
		}
		else {
			System.out.println("无法进行强制类型转换");
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
				System.out.println("匿名内部类实现");
			}
			
		};
		ip3.playGame();
		new IPlayGame() {

			@Override
			public void playGame() {
				// TODO Auto-generated method stub
				System.out.println("匿名内部类实现,不赋值");
			}
			
		}.playGame();
	}

}
