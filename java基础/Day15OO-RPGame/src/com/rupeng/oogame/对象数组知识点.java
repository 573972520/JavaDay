package com.rupeng.oogame;

public class ��������֪ʶ��
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Person[] persons = new Person[5];//ֻ�Ǵ����˿���ʢ��5��Person���������
//		����û�з�Person����
//		����ÿ��Ԫ�ص�Ĭ��ֵ�ǣ�int��0��  String:null��  boolean��false�� �������ÿ��Ԫ�ص�Ĭ��ֵ���ǣ�null
		//persons[3] = new Person();
		/*
		for (int i = 0; i < persons.length; i++)
		{
			Person p = persons[i];
			System.out.println(p);
			//���Ϊ��
//			null //δ��ֵ��Ĭ��Ϊnull
//			null
//			null
//			com.rupeng.oogame.Person@15db9742 //�ֶ���ֵ
//			null
		}
		//�������forѭ��һ����Ч��
		for (Person p : persons) //��ǿforѭ��	 ����persons�����е�ÿ��Ԫ�أ�ÿ�α�����Ԫ����p���� 	
		{
			System.out.println(p);
		}
		*/
		
		
		
		for (int i = 0; i < persons.length; i++)
		{
			persons[i] = new Person();
		}
		for (Person p : persons) 
		{
			System.out.println(p);
//			���Ϊ��
//			com.rupeng.oogame.Person@15db9742
//			com.rupeng.oogame.Person@6d06d69c
//			com.rupeng.oogame.Person@7852e922
//			com.rupeng.oogame.Person@4e25154f
//			com.rupeng.oogame.Person@70dea4e
		}
		
		
		
		/*
		for (Person p : persons)
		{
			p = new Person();
		}
		//����Ĵ��������
		for (int i = 0; i < persons.length; i++)
		{
			Person p = persons[i];
			p = new Person(); //�ְ�pָ������ˣ����Բ���ĸı�persons[i]��ֵ
			
			��������ȷ��д������ı�persons[i]��ֵ��
			persons[i] = new Person();
		}
		for (Person p : persons) 
		{
			System.out.println(p);
//			���:
//			null
//			null
//			null
//			null
//			null
		}
		*/
		//��ǿforѭ��һ������ʹ������ÿ��Ԫ�أ����ʺϸ�����Ԫ�ظ�ֵ
	}

}

class Person
{
	
}