package com.rupeng.test.oo1;

public class animal
{
	//���û��ָ�����࣬��Ĭ�ϼ̳���Object
	//���࣬����
	//��Ӹ���(����)���������
	private int age;
	
	public animal()
	{
		System.out.println("����Ĺ��캯��");
	}
	
	//һ����Ĭ����һ���޲εĹ��캯��
	//����һ������һ�����캯������ôĬ�ϵ��޲ι��캯����û����
	public animal(int i)
	{
		System.out.println("����Ĺ��캯��2,i="+i);
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	public void ��ֳ()
	{
		System.out.println("��С��");
	}
	public void ��й()
	{
		System.out.println("�ղ�");
	}
	public void ��ʳ()
	{
		System.out.println("�ԳԳ�");
		System.out.println("age="+this.age);
	}
}
