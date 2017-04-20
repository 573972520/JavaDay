package com.rupeng.oogame;

import java.awt.Dimension;

import com.rupeng.game.GameCore;;

public abstract class GameRect extends GameObject
{
	/**
	 * ����ĵ��Ĵ�С
	 * @return
	 */
	public abstract Dimension getSize();
	
	public boolean isIntersectWith(GameRect rect2)
	{
		//�Ƿ����ཻ��this�����Ե��x����>rect2���ұ�Ե��x����
		boolean isNotRectLeft = this.getPosition().x > rect2.getPosition().x+getSize().width;
		//�Ƿ��Ҳ��ཻ��this���ұ�Ե��x����<rect2�����Ե��x����
		boolean isNotRectRight = this.getPosition().x+this.getSize().width < rect2.getPosition().x;
		//�Ƿ��ϲ��ཻ��this���ϱ�Ե��y����>rect2���±�Ե��y����
		boolean isNotRectUp = this.getPosition().y  > rect2.getPosition().y+getSize().height;
		//�Ƿ��²��ཻ��this�ĵ��±�Ե��y����<rect2���ϱ�Ե��y����
		boolean isNotRectDown = this.getPosition().y+getSize().height < rect2.getPosition().y;
		//��ʦд���ж�
		return !isNotRectLeft&&!isNotRectRight&&!isNotRectUp&&!isNotRectDown;
		//�Լ�д���ж�
//		boolean isNotIntersect = isNotRectLeft||isNotRectRight||isNotRectUp||isNotRectDown;
//		return !isNotIntersect;
	}
	
//	/**
//	 * �жϵ�ǰ�����Ƿ���ײ����Ϸ���ڵı�Ե
//	 * @return
//	 */
//	public boolean isHitGameWindow()
//	{
//		if (this.getPosition().x <= 0)
//		{
//			return true;
//		}
//		if (this.getPosition().x+this.getSize().width >= GameCore.getGameSize().width)
//		{
//			return true;
//		}
//		if (this.getPosition().y <= 0)
//		{
//			return true;
//		}
//		if (this.getPosition().y+this.getSize().height >= GameCore.getGameSize().height)
//		{
//			return true;
//		}
//		return false;
//		
//	}
}
