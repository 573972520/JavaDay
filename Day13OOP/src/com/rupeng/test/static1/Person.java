package com.rupeng.test.static1;


public class Person
{
	
	//����static���������еĶ�����ͬһ��
	public static int TotleCount = 0;
	
	public Person()
	{
		TotleCount++; //���Լ����ڲ����ó�Ա������ʱ����Ҫд����
	}
	private int age;

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		f1();//��static��Ա���Է���static��Ա
		this.age = age;
	}
	//static����
	public static void f1()
	{
		
	}
	public static void sayHello()
	{
		f1();//static��Ա���Ե���static��Ա
		//setAge(56);//static��Ա����ֱ�ӷ��ʷ�static��Ա
		
		//static��Ա��ӷ��ʷ�static��Ա��ͨ��һ��Person���������÷�����
		Person p1 = new Person();
		p1.setAge(55);
		
		System.out.println("���Ǻã����ǵ����ˣ�������"+TotleCount+"��");
		//System.out.println("���Ǻã����ǵ����ˣ�������"+TotleCount+"��,�ҵ�������"+this.age);//������Ϊthis����ǰ���󣬵������ڵĵ�ǰ������û�еĲ���static�Ƕ����ڶ�������ڵġ�
	}
	
	
}
