package com.rupeng.oop.test2;

//final��������;
//final ������public static final int a = 8��  ���˳�ʼ����ʱ�򣬲����ٴ��޸�����ֵ
//final ������������������������б�override
//final �� �� ����಻�������ࡣ���Ӿ�� String��Integer�ȶ���final��


//public final class earthMan ���һ������Ϊfinal���������Ͳ���������
public class earthMan
{
	//public final void speak()����ѷ������Ϊfinal���������в���override���������
	public void speak()
	{
		
		System.out.println("��Һã����ǵ�����");
	}
	public void f1()
	{
		System.out.println("f1 begin");
		speak();//�����this.speak()  this����ǰ����Ҳ����Chinese
		//�������this��Chinese���󣬲���Chinese��override��speak���� �������Chinese��speak
		System.out.println("f1 end");
	}
}
