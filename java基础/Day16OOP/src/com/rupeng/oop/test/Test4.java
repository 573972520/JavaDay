package com.rupeng.oop.test;

public class Test4
{

	public static void main(String[] args)
	{
		Test4 t4 = new Test4();
		t4.setAge(88);
		t4.f1();
	}
	private int age;
	
	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	void f1()
	{
		earthMan d1 = new earthMan()
		{
			private int age = 77;
			@Override
			public void speak()
			{
				// TODO Auto-generated method stub
				int age = 999;
				System.out.println("�ҵ�������"+age);
				System.out.println("�ҵ�������"+this.age); //���û��private int age = 77;����Ĵ��룬��ô�ᱨ��    ��Ϊthisָ���������ڲ���Ķ���
				System.out.println("�ҵ�������"+Test4.this.age);//�������ڲ����У������ⲿ��ĵ�ǰ�����Ա��ʱ��ʹ�á��ⲿ�������.this�����з���
			}
		};
		d1.welcome();
	}
}
