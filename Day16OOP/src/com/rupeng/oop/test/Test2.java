package com.rupeng.oop.test;

public class Test2
{
	public static void main(String[] args)
	{
		//earthMan d1 = new Test2&1();
		//����new�ĳ�����Ķ���new���ǳ����������Ķ���
		//������Ҫ�Ѹ�������� ���󷽷���ʵ�֣�������Ҳ����override�����е���ͨ����
		earthMan d1 = new earthMan()
		{
			private int age;
			public int getAge()
			{
				return this.age;
			}
			public void setAge(int age)
			{
				this.age = age;
			}
			//��Ϊʹ������������ʱ��������Ͷ��Ǹ�������ͣ������޷��������������Լ�����ķ���������һ�㲻���������������·���
			@Override
			public void speak()
			{
				// TODO Auto-generated method stub
				System.out.println("���ǵ����˵�һ�������ĺ���1");
			}
			@Override
			public void dance()
			{
				// TODO Auto-generated method stub
				System.out.println("ŷ��nice");
			
			}
		};
		d1.welcome();
	}
}
  