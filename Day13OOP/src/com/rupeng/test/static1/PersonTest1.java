package com.rupeng.test.static1;

public class PersonTest1
{
	public static void main(String[] args)
	{
		Person p1 = new Person();
		p1.setAge(6);
		System.out.println(Person.TotleCount);
		Person p2 = new Person();
		p2.setAge(6);
		System.out.println(Person.TotleCount);
		Person p3 = new Person();
		p3.setAge(6);
		System.out.println(Person.TotleCount);
		Dog d1 = new Dog();
		System.out.println(Person.TotleCount);
		
		//MathTest.PI = 0.001;//�޷��޸ģ���Ϊstatic����ǰ�������final����ֻ�ܶ�ȡ�����ܸ�ֵ
		double mj = MathTest.PI*3*3;
		System.out.println(mj);
		//static����
		Person.sayHello();
	}
}
