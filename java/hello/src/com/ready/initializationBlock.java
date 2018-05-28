package com.ready;

public class initializationBlock {
	String name; // 声明变量name
	String sex; // 声明变量sex
	static int age;// 声明静态变量age
	//执行顺序：静态初始化块，初始化块，构造方法。
    
    // 构造方法
	public initializationBlock() { 
		System.out.println("通过构造方法初始化name");
		name = "tom";
	}
    
    // 初始化块:在创建类的实例的时候就会一次执行初始化快，直接用大括号标注的就是初始化
	{ 
		System.out.println("通过初始化块初始化sex");
		sex = "男";
	}
    
    // 静态初始化块，静态初始化块只在类加载时执行，只会执行一次，同时静态初始化块智能给静态变量赋值，不能初始化普通的成员变量
	static { 
		System.out.println("通过静态初始化块初始化age");
		age = 20;
	}
    
	public void show() {//类的方法
		System.out.println("姓名：" + name + "，性别：" + sex + "，年龄：" + age);
	}
    
	public static void main(String[] args) {
        
        // 创建对象
		initializationBlock hello = new initializationBlock();
		// 调用对象的show方法
        hello.show();
        
	}

}
