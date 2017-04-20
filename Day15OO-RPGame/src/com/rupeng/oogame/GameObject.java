package com.rupeng.oogame;
import java.awt.Point;



abstract public class GameObject
{
	public abstract void hide();
	public abstract void show();
	public abstract Point getPosition();
	public abstract void setPosition(int x,int y);
	
	public void moveRight(int stepCount)
	{
		Point pos = this.getPosition();  //this.getPosition ���õ�ǰ����ķ������������󲻻���GameObject����text��image��sprite����һ����
		int x = pos.x;
		x+=stepCount;
		this.setPosition(x, pos.y);
	}
	public void moveRight()
	{
		//����getPosition()�����ˣ�����һ���������ӡ�ʵ���������
		/*
		Point pos = this.getPosition();  //this.getPosition ���õ�ǰ����ķ������������󲻻���GameObject����text��image��sprite����һ����
		int x = pos.x;
		x+=8;
		this.setPosition(x, pos.y);
		*/
		moveRight(1);
	}
	public void moveLeft(int stepCount)
	{
		Point pos = this.getPosition();  //this.getPosition ���õ�ǰ����ķ������������󲻻���GameObject����text��image��sprite����һ����
		int x = pos.x;
		x-=stepCount;
		this.setPosition(x, pos.y);
	}
	public void moveLeft()
	{
		//����getPosition()�����ˣ�����һ���������ӡ�ʵ���������
		/*
		Point pos = this.getPosition();  //this.getPosition ���õ�ǰ����ķ������������󲻻���GameObject����text��image��sprite����һ����
		int x = pos.x;
		x-=8;
		this.setPosition(x, pos.y);
		*/
		moveLeft(1);
	}
	public void moveUp()
	{
		//����getPosition()�����ˣ�����һ���������ӡ�ʵ���������
		
		Point pos = this.getPosition();  //this.getPosition ���õ�ǰ����ķ������������󲻻���GameObject����text��image��sprite����һ����
		int y = pos.y;
		y-=4;
		this.setPosition(pos.x,y);
	}
	public void moveDown()
	{
		//����getPosition()�����ˣ�����һ���������ӡ�ʵ���������
		
		Point pos = this.getPosition();  //this.getPosition ���õ�ǰ����ķ������������󲻻���GameObject����text��image��sprite����һ����
		int y = pos.y;
		y+=4;
		this.setPosition(pos.x,y);
	}

}
