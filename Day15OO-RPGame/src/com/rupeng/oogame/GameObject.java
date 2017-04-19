package com.rupeng.oogame;

import java.awt.Point;

abstract public class GameObject
{
	public abstract void hide();
	public abstract void show();
	public abstract Point getPosition();
	public abstract void setPosition(int x,int y);
	
	public void moveRight()
	{
		//����getPosition()�����ˣ�����һ���������ӡ�ʵ���������
		
		Point pos = this.getPosition();  //this.getPosition ���õ�ǰ����ķ������������󲻻���GameObject����text��image��sprite����һ����
		int x = pos.x;
		x++;
		this.setPosition(x, pos.y);
	}
}
