package com.rupeng.oop.game;

public class Test2
{
	private int age;
	public void f1()
	{
		Flyable f1 = new Flyable()
		{
			
			@Override
			public void fly()
			{
				// TODO Auto-generated method stub
				System.out.println(Test2.this.age);
			}
		};
		f1.fly();
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		/*
		earthMan d1 = new Chinese();
		d1.welcome();
		
		earthMan d2 = new earthMan()
		{
			
			@Override
			public void speak()
			{
				// TODO Auto-generated method stub
				System.out.println("����������");
			}
		};
		d2.welcome();
		*/
		
		//����һ��ʵ����Flyable�ӿڵ������࣬Ȼ�󴴽����Ķ���
		//��flyable���͵ı���f1ָ���������
		//������ֻ�ܼ̳���һ�����࣬����ʵ��һ���ӿ�
		
		int i = 5;
		Flyable f1 = new Flyable()
		{
			
			@Override
			public void fly()
			{
				// TODO Auto-generated method stub
				System.out.println("�����ķ�"+i);
			}
		};
		f1.fly();
	}

}

abstract class earthMan
{
	public abstract void speak();
	public void dance()
	{
		System.out.println("dance!!");
	}
	public void welcome()
	{
		speak();
		dance();
		speak();
	}
}

class Chinese extends earthMan
{
	@Override
	public void speak()
	{
		// TODO Auto-generated method stub
		System.out.println("�����й���");
	}
}