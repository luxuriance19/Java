package com.ready;

public class initializationBlock {
	String name; // ��������name
	String sex; // ��������sex
	static int age;// ������̬����age
	//ִ��˳�򣺾�̬��ʼ���飬��ʼ���飬���췽����
    
    // ���췽��
	public initializationBlock() { 
		System.out.println("ͨ�����췽����ʼ��name");
		name = "tom";
	}
    
    // ��ʼ����:�ڴ������ʵ����ʱ��ͻ�һ��ִ�г�ʼ���죬ֱ���ô����ű�ע�ľ��ǳ�ʼ��
	{ 
		System.out.println("ͨ����ʼ�����ʼ��sex");
		sex = "��";
	}
    
    // ��̬��ʼ���飬��̬��ʼ����ֻ�������ʱִ�У�ֻ��ִ��һ�Σ�ͬʱ��̬��ʼ�������ܸ���̬������ֵ�����ܳ�ʼ����ͨ�ĳ�Ա����
	static { 
		System.out.println("ͨ����̬��ʼ�����ʼ��age");
		age = 20;
	}
    
	public void show() {//��ķ���
		System.out.println("������" + name + "���Ա�" + sex + "�����䣺" + age);
	}
    
	public static void main(String[] args) {
        
        // ��������
		initializationBlock hello = new initializationBlock();
		// ���ö����show����
        hello.show();
        
	}

}
