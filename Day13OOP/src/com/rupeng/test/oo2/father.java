package com.rupeng.test.oo2;

public class father
{
	public static int AA;
	private int age; //private�����඼�����Է���

	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public void sayHello()
	{
		System.out.println("�ҵ�����"+this.age);
		AA++;
		System.out.println("father AA is"+AA);
	}
}
