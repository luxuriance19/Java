package com.ready;

public class testStatic {
	static String hobby = "imooc";
	
	public static void main(String[] args) {
		System.out.println(testStatic.hobby);
		testStatic test = new testStatic();
		System.out.println(test.hobby);
		test.hobby = "°®Ä½¿Î";
		System.out.println(test.hobby);
	}

}
