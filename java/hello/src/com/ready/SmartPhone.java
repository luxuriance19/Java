package com.ready;

public class SmartPhone extends Telphone implements IPlayGame{

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("ͨ��������绰");
	}

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("ͨ��������绰");
	}
	@Override
	public void playGame() {
		System.out.println("����������Ϸ�Ĺ���");
	}

}
