package com.rupeng.oop.test3;

public abstract class earthMan
{
	//�շ���Ҳ��һ�ַ���
	//Ŀ�ģ� �ñ���֪�����Ҳ�֪����ôȥ˵�����ҵ�����ȥ˵�ɡ�
	/*
	public void sayHello()
	{
//		System.out.println("hello");
	}
	*/
	abstract public void sayHello(); //���󷽷��������з�����
	//abstract�ķ�����ʾ����������Ҳ�֪����ôȥʵ��
	public void dance()
	{
		System.out.println("����");
	}
	public void welcome()
	{
		sayHello();
		dance();
	}
}
