package com.rupeng.test.oo3;

public class OverLoadTest3
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		f1((double)1);
		f1(1.0);
		f1(1); //û��f1(int i)������غ�������ô����ƥ��f1(double d)
		//һ������f1(int i)����ô����ƥ����ʺ��ҵ�f1(int i)
		//�����������ƥ��f1(double d)����ô����ʾת��f1((double)1)
		String s = "hello";
		f2(s); //String�̳���Object������s����ƥ��f2(String s)�����û��f2(String s)��ô����ƥ�䵽f2(Object obj)
		f2((Object)s);
	}
	
	static void f1(int i)
	{
		System.out.println("int i="+i);
	}
	
	static void f1(double d)
	{
		System.out.println("int d="+d);
	}
	
	static void f2(Object obj)
	{
		System.out.println("obj");
	}
	
	static void f2(String s)
	{
		System.out.println("string");
	}
	
}
