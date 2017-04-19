package com.rupeng.oogame;

import java.awt.Dimension;
import java.awt.Point;

import com.rupeng.game.GameCore;

public class GameSprite extends GameObject
{
	private int number;
	public  GameSprite(String spriteName)
	{
		this.number = NumberCreator.getCreator().createNumber();
		GameCore.createSprite(this.number, spriteName);
	}
	public  GameSprite()
	{
		this("");
	}

	@Override
	public void hide()
	{
		// TODO Auto-generated method stub
		GameCore.hideSprite(this.number);
	}

	@Override
	public void show()
	{
		// TODO Auto-generated method stub
		GameCore.showSprite(this.number);
	}

	@Override
	public Point getPosition()
	{
		// TODO Auto-generated method stub
		return GameCore.getSpritePosition(this.number);
	}

	@Override
	public void setPosition(int x, int y)
	{
		// TODO Auto-generated method stub
		GameCore.setSpritePosition(this.number, x, y);
	}
	
	
	//  �����Լ����еķ���
	public void playAnimate(String spriteName,Boolean repeat)
	{
		GameCore.playSpriteAnimate(this.number, spriteName, repeat);
	}
	public void playAnimate(String spriteName)
	{
		GameCore.playSpriteAnimate(this.number, spriteName,true);
	}
	public void setFlipX(boolean isFlip)
	{
		GameCore.setSpriteFlipX(this.number, isFlip);
	}
	public void setFlipX()
	{
		GameCore.setSpriteFlipX(this.number, true);
	}
	public void setFlipY(boolean isFlip)
	{
		GameCore.setSpriteFlipY(this.number, isFlip);
	}
	public void setFlipY()
	{
		GameCore.setSpriteFlipY(this.number, true);
	}
	public Dimension getSize()
	{
		return GameCore.getSpriteSize(this.number);
	}
}
