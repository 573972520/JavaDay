package com.rupeng.test.oo2;

public class father
{
	public static int AA;
	private int age; //private�����඼�����Է���
	int count = 8;
	public int getAge()
	{
		return age;
	}
	protected void �����()
	{
		System.out.println("�����");
	}
	
	void Default����()
	{
		
	}
	public void setAge(int age)
	{
		if (age < 0||age > 150)
		{
			System.out.println("����Ƿ�");
		}
		this.age = age;
	}
	public void sayHello()
	{
		System.out.println("�ҵ�����"+this.age);
		AA++;
		System.out.println("father AA is"+AA);
	}
}
