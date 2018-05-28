package com.ready;
//包名一般都是小写，通过包名来访问同名类
/*
 * private 本类
 * 默认 本类 同包；同包表明的是同一个路径的位置下，也就是现在com.ready这个包之下
 * protected 本类 同包 子类
 * public 本类 同包 子类 其他
 */
/*
 * 在source下面有选择可以自动生成set和get的方法
 * this指的是当前的对象
 * this。属性
 * this。方法
 */

public class encapsulated {
	public float getPhone() {
		return phone;
	}

	public void setPhone(float phone) {
		this.phone = phone; //当前对象的属性
		this.sendMessage();
	}

	/*
	 * 通过修改类的属性的访问修饰符号进行封装
	 * 让类的属性不能够直接修改，必须通过特定的方法
	 */
	private float phone = 3.5f;
	
	public void sendMessage() {
		System.out.println("Send Message!");
	}
	

}
