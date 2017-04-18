package com.rupeng.test.oo2;

public class father
{
	public static int AA;
	private int age; //private连子类都不可以访问

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
		System.out.println("我的年龄"+this.age);
		AA++;
		System.out.println("father AA is"+AA);
	}
}
