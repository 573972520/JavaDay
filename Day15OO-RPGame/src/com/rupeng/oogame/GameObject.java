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
		//调用getPosition()就是了，会有一个”龟孙子“实现这个方法
		
		Point pos = this.getPosition();  //this.getPosition 调用当前对象的方法（反正对象不会是GameObject而是text、image、sprite其中一个）
		int x = pos.x;
		x++;
		this.setPosition(x, pos.y);
	}
}
