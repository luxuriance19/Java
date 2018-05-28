package com.ready;
/*什么是内部类呢？
 * 答：内部类（ Inner Class ）就是定义在另外一个类里面的类。与之对应，包含内部类的类被称为外部类。
 * 
 * 问：那为什么要将一个类定义在另一个类里面呢？清清爽爽的独立的一个类多好啊！！
 * 答：内部类的主要作用如下：
 * 1. 内部类提供了更好的封装，可以把内部类隐藏在外部类之内，不允许同一个包中的其他类访问该类
 * 2. 内部类的方法可以直接访问外部类的所有数据，包括私有的数据
 * 3. 内部类所实现的功能使用外部类同样可以实现，只是有时使用内部类更方便
 * 
 * 问：内部类有几种呢？
 * 答：内部类可分为以下几种：
 * 成员内部类:普通哦内部类
 * 成员内部类的使用方法：
 * Inner类定义在Outer类的内部，相当于Outer类的一个成员变量的位置，Inner类可以使用任意访问控制符private, protected, public
 * Inner类种定义的方法可以直接访问Outer类当中的数据，不受访问控制符的影响，也就是说可以访问外部类的私有属性
 * 定义了成员内部类之后，必须使用外部类对象来创建内部类对象，而不能直接去new一个内部对象： 内部类 对象名 = 外部类。new 内部类()
 * 编译程序会产生两个编译文件：.class
 * 
 * 外部类不能直接使用内部类的成员和方法，先创建内部类的对象，然后通过内部类的对象访问其成员变量的方法
 * 内部类 对象名 = 外部类.new 内部类，然后通过内部类对象调用内部类的属性和方法。
 * 如果外部类和内部类有相同的成员变量或者方法，内部类默认访问子集的成员变量或方法，如果要访问外部类的成员变量，使用this关键字：如： 外部类.this.属性/方法
 * 
 * 静态内部类
 * 静态内部类不能直接访问外部类的非静态成员，但是可以通过 new 外部类().成员的方式访问
 * 如果外部类的静态成员与内部类的成员名称相同，可通过“类名.静态成员”访问外部类的静态成员；如果外部类的静态成员与内部类的成员名称不相同，则可通过“成员名”直接调用外部类的静态成员，这里不需要this关键字
 * 创建静态内部类的对象时，不需要外部类的对象，可以直接创建 内部类 对象名= new 内部类();
 * 
 * 方法内部类
 * 定义在外部类的方法当中，方法内部类芝在盖方法的内部可见，也就是智能在这个方法内可以使用
 * 一定要注意哦：由于方法内部类不能在外部类的方法以外的地方使用，因此方法内部类不能使用访问控制符和 static 修饰符。
 * 
 * 匿名内部类
 * 没有名字的内部类，多用于关注实现而不关注实现类的名称，一般用在接口使用的过程，示例在接口中间表示
 * 语法格式：
 * Interface i = new Interface(){
 * 	public void method(){
 * 		System.out.println("匿名内部类实现接口的方式”);
 * 	}
 * };
 * 
*/

public class InnerClass {
	private String name = "imooc";
	private static int score = 84;
	
	int age = 20;
	
	// 外部类中的show方法
    public void show() { 
		// 定义方法内部类
		class MInner {
			int score = 83;
			public int getScore() {
				return score + 10;
			}
		}
        
		// 创建方法内部类的对象
        MInner mi = new MInner();
        
        // 调用内部类的方法
        int newScore = mi.getScore();       
		System.out.println("姓名：" + name + "\n加分后的成绩：" + newScore);
	}
	
	// 内部类Inner，类Inner在类HelloWorld的内
	//成员内部类
    public class Inner {
        String name = "慕课";
		// 内部类的方法
		public void show() {
			System.out.println("welcome to imooc!");
			System.out.println("内部"+name);
			System.out.println("Outer"+InnerClass.this.name);
			System.out.println(age);
		}
	}
    
    // 创建静态内部类
    private static class sInner{
    	int score = 91;
    	
    	public void show() {
    		System.out.println("访问外部类中的score："+InnerClass.score);
    		System.out.println("访问内部类种的score："+score);
    	}
    }
	public static void main(String[] args) {
        
        // 创建外部类对象
		InnerClass hello = new InnerClass();
        // 创建内部类对象
		Inner i = hello.new Inner();
        // 调用内部类对象的方法
		i.show();
		//创建静态类对象
		sInner sobject = new sInner();
		sobject.show();
		
		InnerClass mo = new InnerClass();
		mo.show();
	}

}
