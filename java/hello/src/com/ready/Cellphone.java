package com.ready;

public class Cellphone extends Telphone {

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("通过键盘打电话");
	}

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("通过键盘发短信");
	}

}
