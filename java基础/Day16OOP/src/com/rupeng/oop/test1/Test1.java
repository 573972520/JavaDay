package com.rupeng.oop.test1;

public class Test1
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//�޷������ӿڵĶ���
		//Speakable s1 = new Speakable();//����
		earthMan d1 = new Chinese();
		d1.cry();
		d1.speak("carl");
		
		//�ӿ����͵ı���ָ��ʵ��������ӿڵ���Ķ���
		Speakable s1 = new Chinese();
		s1.speak("john"); //���Ե���Speakable�����ķ���
		s1.cry();//�ܹ�������Щ����ȡ���ڱ���������
		//s1.baiNian();//����ʵ���������
		Chinese c1 = (Chinese)s1; //��Ҫͨ�����ַ���������baiNian����
		c1.baiNian();
	}

}
