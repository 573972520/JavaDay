package com.rupeng.oop.test1;

import org.w3c.dom.css.RGBColor;

public class test2
{

	
	public static void main(String[] args)
	{
		
		/*
		// TODO Auto-generated method stub
		Chinese man = new earthMan();
		//���Ե�����Щ�����ɱ��������;���
		man.speak();
		//���Chinese man = new earthMan();�ǿ��ԵĻ�
		//��ôman.baiNian();�ͻ����earthMan����ķ���
		//java������Ϊ�˷�ֹ���Ƿ�����ֹ��������һ������ı���ָ����Ķ������Ǵ���ģ�
		//����Chinese man = new earthMan();(����)
		man.baiNian();
		*/
		//����һ��Chinese�ԣ���earthMan���͵ı���ָ���������Եģ�
		earthMan man = new Chinese();//�������͵ı�������ָ���������͵Ķ���
		man.speak();//����manָ������speak����
		//��Ϊmanָ�����chinese�������Ե��õ�speak��chinese��speak
		//���Ե�����Щ�����ɱ��������;���
		//man.baiNian();
		
		//������ʵ����һ����ǩ��������ָ�򡱣�������ĳ��������
		
		earthMan d1 = new BeiJingMan();
		d1.speak();
		
		earthMan man2 = createMan(); //ֻ��new�Ż���������ڷ����ڲ��Ѿ�new��
		man2.speak();
		
		Chinese man3 = createMan1();
		man3.speak();
	}
	
	//����һ��earthMan���ͣ������������ͣ��Ķ���
	public static earthMan createMan()
	{
//		return new earthMan();
		return new Chinese();
//		return new BeiJingMan();
	}
	
	public static Chinese createMan1()
	{
		//return new earthMan();//���಻�ܷ��ظ������
//		return new Chinese();
		return new BeiJingMan();
	}
	
}
