package com.rupeng.test.static1;

public class StaticTest1
{
	private static long i = getIt(); //static��Ա�������ֶΣ�ֻ�ڵ�һ��ʹ�õ�ʱ���ʼ����������ÿ��ȡ����ֵ����ȥ��ʼ��
	private static long a = 0;
	public static void main(String[] args)
	{
		System.out.println(StaticTest1.i);
		System.out.println(StaticTest1.i);
		System.out.println(StaticTest1.i);
	}
	static long getIt()
	{
		System.out.println("ִ��getIt��"); //ִֻ��һ�����
		a++;
		return a;
//		return System.currentTimeMillis();
	}
}
