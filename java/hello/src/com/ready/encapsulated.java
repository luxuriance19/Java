package com.ready;
//����һ�㶼��Сд��ͨ������������ͬ����
/*
 * private ����
 * Ĭ�� ���� ͬ����ͬ����������ͬһ��·����λ���£�Ҳ��������com.ready�����֮��
 * protected ���� ͬ�� ����
 * public ���� ͬ�� ���� ����
 */
/*
 * ��source������ѡ������Զ�����set��get�ķ���
 * thisָ���ǵ�ǰ�Ķ���
 * this������
 * this������
 */

public class encapsulated {
	public float getPhone() {
		return phone;
	}

	public void setPhone(float phone) {
		this.phone = phone; //��ǰ���������
		this.sendMessage();
	}

	/*
	 * ͨ���޸�������Եķ������η��Ž��з�װ
	 * ��������Բ��ܹ�ֱ���޸ģ�����ͨ���ض��ķ���
	 */
	private float phone = 3.5f;
	
	public void sendMessage() {
		System.out.println("Send Message!");
	}
	

}
