package com.rupeng.oop.Compare;

public class equalsTest
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		//�ַ��������
		//������String s1 = "abc"û��new��������ʵ��new��
		String s1 = "abc";//���ڴ��д���һ���ַ������������ǡ�abc��,��s1ָ������ַ�������
		String s2 = "abc";//�����Ѿ�����һ����abc���ַ��������ˣ���˰�s2ֱ��ָ��֮ǰ�ġ�abc��
		System.out.println(s1 == s2); //true
		System.out.println(s1.equals(s2));//true
		
		String s3 = "ab"+"c";//����������������Ż���ʹ֮��Ϊ��String s3 = "abc";
		System.out.println(s1 == s3);//true
		System.out.println(s1.equals(s3));//true
		
		String s4 = new String("abc");//ֻҪnew���Ǵ���һ���µĶ��󣬼�������һ����"abc"����һ�������ַ�������
		System.out.println(s1 == s4);//false
		System.out.println(s1.equals(s4));//true
		
		
		//==��Զ���������Ƚ������Ƿ�ָ��ͬһ������
		//equals���������������ݵıȽϵ�
	}

}
