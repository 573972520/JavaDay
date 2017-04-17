package com.rupeng.game.oo;

import java.awt.Color;
import java.awt.Point;

import com.rupeng.game.GameCore;

public class RPText
{
	private int textNum;

	public RPText(String textContent)
	{
		this.textNum = NumberCreator.getCreator().createNumber();
		GameCore.createText(textNum, textContent);
	}
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
			GameCore.alert("ÇëÊäÈëÕýÊý");
		} 
		else
		{
			GameCore.setTextFontSize(this.textNum, fontSize);
		}
	}

}
