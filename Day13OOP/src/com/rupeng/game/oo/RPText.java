package com.rupeng.game.oo;

import java.awt.Color;
import java.awt.Point;

import com.rupeng.game.GameCore;

public class RPText
{
	private int textNum;
	//�Լ�д��
//	public RPText(String textContent)
//	{
//		this.textNum = NumberCreator.getCreator().createNumber();
//		GameCore.createText(this.textNum, textContent);
//	}
	
	
	//��ʦд��
	public  RPText()
	{
		//System.out.println("1");
		//���캯�������ͨ��this�����������캯����������ǵ�һ�д��� 
		this(""); //��������һ�����صĹ��캯�������ô���
		//java�п����ڹ��캯���е���this()�������������صĹ��캯��
	}
	public RPText(String text)
	{
		this.textNum = NumberCreator.getCreator().createNumber();
		GameCore.createText(this.textNum, text);
	}
	/*
	//����ͨ�����в��ܵ��ù��캯��
	public void sayHello()
	{
		this("");
	}
	*/
	

	
	
	public void textPosition(int x, int y)
	{
		GameCore.setTextPosition(this.textNum, x, y);
	}
	public void textColor(Color setColor)
	{
		GameCore.setTextColor(this.textNum, setColor);
	}
	public void textFontSize(int fontSize)
	{
		if (fontSize <= 0)
		{
			GameCore.alert("����������");
		} 
		else
		{
			GameCore.setTextFontSize(this.textNum, fontSize);
		}
	}

}
