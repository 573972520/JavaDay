package com.rupeng.oop.test1;

public class Chinese extends earthMan
{
	/*
	@Override  //Annotation(��ע)�������ڼ���﷨����
			   //JDK1.5֮�������override���������ע@Override�����������ñ���������һЩ��Ӧ�ó��ֵĴ���
	public void speak()
	{
		System.out.println("�����й���");
	}
	*/
	
	public void baiNian()
	{
		System.out.println("�����");
	}
//	@Override
//	public void ett()  //�������Ķ����override�����븸��Ĳ�һ������ô@Override���⵽��������ұ���
//	{
//		
//	}
	
	@Override
	public void speak()
	{
		// TODO Auto-generated method stub
		super.speak(); //���ø����super����
//		this.speak();//���޵����Լ�
		System.out.println("�����й���");
	}
	
	
}
