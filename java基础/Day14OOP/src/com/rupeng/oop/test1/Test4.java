package com.rupeng.oop.test1;

import javax.swing.JPanel;

public class Test4
{
	public static void main(String[] args)
	{
		/*
		Japanese j1 = new Japanese();
		earthMan d1 = j1;
		d1.speak();
		Chinese c2 = (Chinese)d1; //ͨ����ʽת����֤d1һ��ָ�����Chinese���͵Ķ���
		//������Ȼ���������ᱨ���������л����ClassCastException����ת���쳣
		//���������ʽת������ô�����ᱨ�����������ʾʽת��������ͱ�֤�Ĳ�һ�£�����ʱ�ᱨ��ô
		c2.baiNian();
		c2.speak();
		
//		Dog d3 = (Dog)d1; //��ʽת��ֻ���ڸ������н��У�����ת��ֻ�����и��ӹ�ϵ�����н��У�
//		String s1 = "123";
//		int i = (String)s1;
		*/
		
		
		//super
		earthMan d1 = new Chinese();
		d1.speak();
		
		hello(new earthMan());
		hello(new Japanese());
		hello(new BeiJingMan());
		
		Chinese c1 = new Chinese();
		earthMan d2 = c1;
		
		Chinese c2 = (Chinese)d2;
		
//		Dog d1 = (Dog)c2;
		
	}
	
	public static void hello(earthMan d)
	{
		d.speak();
		d.eat();
	}
	
}
