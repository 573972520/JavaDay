package com.rupeng.oop.Compare;

public class charCompareTest1
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String s1 = "123";
		String s2 = "456";
		String s3 = "12";
		String s4 = "abc";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		//Java���ַ�����С�ıȽ�ʹ��compareTo�����ж�
		char c1 = 'a';//char��ʵҲ��һ������
		System.out.println((int)c1);//��a���ڼ������ʹ������97��ʾ
		char c2 = '1';
		System.out.println((int)c2);//��1���ڼ������ʹ������49��ʾ
		
		int i1 = 33;
		char c3 = (char)i1;
		System.out.println(c3); //���Ϊ��!��
		
		//ASCII����ǹ涨�ַ���ʲô��������ʾ�ı�׼
		//char����Ҳ�����������Ƚϵģ�����˵char�Ĵ�С��ʵ����char�������Ĵ�С
		
		System.out.println('a' > 1);//true
		System.out.println('a' > 'b');//false
		System.out.println('a' > 'A');//true
	}

}
