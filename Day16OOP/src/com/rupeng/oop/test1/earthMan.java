package com.rupeng.oop.test1;

//extends:�̳У���̳��Ը���

//�ӿ�Լ���������ʵ��ʲô����

//�̳п��Ժ�ʵ��һ����
public abstract class earthMan implements Speakable,Eatable // implements: ��earthManʵ��Speakable�ӿ�
{
	public void speak(String n)
	{
		System.out.println("�ҵ�������"+n);
	}
	
	//������ⲻȥʵ�ֽӿ��е�cry��������ô�͵ü���abstract������������������ȥʵ��cry����
	/*
	public void cry()
	{
		System.out.println("cry!!!");
	}
	*/
	
	public void eat()
	{
		
	}
}
