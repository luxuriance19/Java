package com.ready;
/*ʲô���ڲ����أ�
 * ���ڲ��ࣨ Inner Class �����Ƕ���������һ����������ࡣ��֮��Ӧ�������ڲ�����౻��Ϊ�ⲿ�ࡣ
 * 
 * �ʣ���ΪʲôҪ��һ���ඨ������һ���������أ�����ˬˬ�Ķ�����һ�����ð�����
 * ���ڲ������Ҫ�������£�
 * 1. �ڲ����ṩ�˸��õķ�װ�����԰��ڲ����������ⲿ��֮�ڣ�������ͬһ�����е���������ʸ���
 * 2. �ڲ���ķ�������ֱ�ӷ����ⲿ����������ݣ�����˽�е�����
 * 3. �ڲ�����ʵ�ֵĹ���ʹ���ⲿ��ͬ������ʵ�֣�ֻ����ʱʹ���ڲ��������
 * 
 * �ʣ��ڲ����м����أ�
 * ���ڲ���ɷ�Ϊ���¼��֣�
 * ��Ա�ڲ���:��ͨŶ�ڲ���
 * ��Ա�ڲ����ʹ�÷�����
 * Inner�ඨ����Outer����ڲ����൱��Outer���һ����Ա������λ�ã�Inner�����ʹ��������ʿ��Ʒ�private, protected, public
 * Inner���ֶ���ķ�������ֱ�ӷ���Outer�൱�е����ݣ����ܷ��ʿ��Ʒ���Ӱ�죬Ҳ����˵���Է����ⲿ���˽������
 * �����˳�Ա�ڲ���֮�󣬱���ʹ���ⲿ������������ڲ�����󣬶�����ֱ��ȥnewһ���ڲ����� �ڲ��� ������ = �ⲿ�ࡣnew �ڲ���()
 * ��������������������ļ���.class
 * 
 * �ⲿ�಻��ֱ��ʹ���ڲ���ĳ�Ա�ͷ������ȴ����ڲ���Ķ���Ȼ��ͨ���ڲ���Ķ���������Ա�����ķ���
 * �ڲ��� ������ = �ⲿ��.new �ڲ��࣬Ȼ��ͨ���ڲ����������ڲ�������Ժͷ�����
 * ����ⲿ����ڲ�������ͬ�ĳ�Ա�������߷������ڲ���Ĭ�Ϸ����Ӽ��ĳ�Ա�����򷽷������Ҫ�����ⲿ��ĳ�Ա������ʹ��this�ؼ��֣��磺 �ⲿ��.this.����/����
 * 
 * ��̬�ڲ���
 * ��̬�ڲ��಻��ֱ�ӷ����ⲿ��ķǾ�̬��Ա�����ǿ���ͨ�� new �ⲿ��().��Ա�ķ�ʽ����
 * ����ⲿ��ľ�̬��Ա���ڲ���ĳ�Ա������ͬ����ͨ��������.��̬��Ա�������ⲿ��ľ�̬��Ա������ⲿ��ľ�̬��Ա���ڲ���ĳ�Ա���Ʋ���ͬ�����ͨ������Ա����ֱ�ӵ����ⲿ��ľ�̬��Ա�����ﲻ��Ҫthis�ؼ���
 * ������̬�ڲ���Ķ���ʱ������Ҫ�ⲿ��Ķ��󣬿���ֱ�Ӵ��� �ڲ��� ������= new �ڲ���();
 * 
 * �����ڲ���
 * �������ⲿ��ķ������У������ڲ���֥�ڸǷ������ڲ��ɼ���Ҳ������������������ڿ���ʹ��
 * һ��Ҫע��Ŷ�����ڷ����ڲ��಻�����ⲿ��ķ�������ĵط�ʹ�ã���˷����ڲ��಻��ʹ�÷��ʿ��Ʒ��� static ���η���
 * 
 * �����ڲ���
 * û�����ֵ��ڲ��࣬�����ڹ�עʵ�ֶ�����עʵ��������ƣ�һ�����ڽӿ�ʹ�õĹ��̣�ʾ���ڽӿ��м��ʾ
 * �﷨��ʽ��
 * Interface i = new Interface(){
 * 	public void method(){
 * 		System.out.println("�����ڲ���ʵ�ֽӿڵķ�ʽ��);
 * 	}
 * };
 * 
*/

public class InnerClass {
	private String name = "imooc";
	private static int score = 84;
	
	int age = 20;
	
	// �ⲿ���е�show����
    public void show() { 
		// ���巽���ڲ���
		class MInner {
			int score = 83;
			public int getScore() {
				return score + 10;
			}
		}
        
		// ���������ڲ���Ķ���
        MInner mi = new MInner();
        
        // �����ڲ���ķ���
        int newScore = mi.getScore();       
		System.out.println("������" + name + "\n�ӷֺ�ĳɼ���" + newScore);
	}
	
	// �ڲ���Inner����Inner����HelloWorld����
	//��Ա�ڲ���
    public class Inner {
        String name = "Ľ��";
		// �ڲ���ķ���
		public void show() {
			System.out.println("welcome to imooc!");
			System.out.println("�ڲ�"+name);
			System.out.println("Outer"+InnerClass.this.name);
			System.out.println(age);
		}
	}
    
    // ������̬�ڲ���
    private static class sInner{
    	int score = 91;
    	
    	public void show() {
    		System.out.println("�����ⲿ���е�score��"+InnerClass.score);
    		System.out.println("�����ڲ����ֵ�score��"+score);
    	}
    }
	public static void main(String[] args) {
        
        // �����ⲿ�����
		InnerClass hello = new InnerClass();
        // �����ڲ������
		Inner i = hello.new Inner();
        // �����ڲ������ķ���
		i.show();
		//������̬�����
		sInner sobject = new sInner();
		sobject.show();
		
		InnerClass mo = new InnerClass();
		mo.show();
	}

}
