package com.rupeng.oop.game;

public class Test1
{

	public static void main(String[] args)
	{
		/*
		// TODO Auto-generated method stub
		Flyable f1 = new AirPlane();
		f1.fly();
		//f1.zhuolu();//���ܵ��ã���Ϊ����������Flyable������ֻ�ܵ���fly�������
		AirPlane a1 = (AirPlane)f1;
		a1.zhuolu();
		*/
		
		//�����߿��Բ��ùܷ��صĵ������ĸ���Ķ���
		//ֻ��֪���㷵�ص�����������ʵ����Flyable�ӿھͿ�����
		//��Ȼʵ����Flyable�ӿڣ���ô�ҾͿ��Ե�������ӿڵķ���
		Flyable f1 = createAFlyable(1);
		f1.fly();
		Flyable f2 = createAFlyable(6);
		f2.fly();
		
		
	}
	
	//����ģʽ
	static Flyable createAFlyable(int i)
	{
		Flyable dest;
		
		if (i%2 == 0)
		{
			dest =  new Bird();
		}
		else {
			dest =  new AirPlane();
		}
		//return dest;
		return new FlayChecker(dest);//װ����ģʽ
	}

}
