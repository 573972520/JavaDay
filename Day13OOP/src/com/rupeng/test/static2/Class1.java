package com.rupeng.test.static2;

public class Class1
{
	public static int AA = 5;
	//��̬�����ִֻ��һ��
	//�����һ�α�ʹ�õ�ʱ��ִ�У�����ִֻ��һ��
	static
	{
		System.out.println("Class1�ľ�̬�����1");
	}
	public static void hello()
	{
		System.out.println("hello");
	}
	public  Class1()
	{
		System.out.println("Class1�Ĺ��캯��");
	}
	static
	{
		System.out.println("Class1�ľ�̬�����2");
	}
}
