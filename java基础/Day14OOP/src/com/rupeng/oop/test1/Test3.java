package com.rupeng.oop.test1;

public class Test3
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		/*
		Chinese c1 = new Chinese();
		earthMan d1 = c1;
		d1.speak();
		c1.baiNian();
//		d1.baiNian(); //����ִ�У���Ϊ��earthMan����
		*/
		Chinese c1 = new Chinese();
		earthMan d1 = c1;
		d1.speak();
//		��Chinese���͵ı���c2ָ��d1��ָ��Ķ���
//		Chinese c2 = d1;//���У���һ���d1ָ����������˵Ķ����أ����Ա��벻��ͨ��
//		c1.speak();
		
		Chinese c2 = (Chinese)d1; //ͨ����ʽת�������߱�����d1ָ��Ķ������Chinese���͵�
		c2.baiNian();
		c2.speak();
		
		
	}

}
