package test;

import java.awt.Dimension;


import com.rupeng.game.GameCore;

public class SmallBall implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int ball = 0;
		double v = 0; //��ʼ�ٶ�
		double y = 0;//��ʼ������
		double t = 0.1;//��λʱ��
		GameCore.createSprite(ball, "ball1");
		GameCore.playSpriteAnimate(ball, "rotate", true);
		GameCore.setSpritePosition(ball, 100, 0);
		for(;;){
			v = (v+9.8*t); 
			y = y+v*t;
			if (y > 300) {
				v = -v; //�������棬���������ٶȷ���
			}
			GameCore.setSpritePosition(ball, 100, (int)y);
			GameCore.pause(10);
		}
		
		/*
		int ball = 0;
		double vX = 2; //��ʼX�ٶ�
		double vY = 1;//��ʼY�ٶ�
		double x = 0;//��ʼ������
		double y = 200;//��ʼ������
		double t = 1.5;//��λʱ��
		Dimension gameSize = GameCore.getGameSize();
		GameCore.createSprite(ball, "ball1");
		GameCore.playSpriteAnimate(ball, "rotate", true);
		GameCore.setSpritePosition(ball, 100, 0);
		for(;;){ 
			x = x+vX*t;
			y = y+vY*t;
			if (y <= 0||y >= gameSize.height-20) {
				vY = -vY; //�������棬���������ٶȷ���
			}
			if (x <= 0||x >= gameSize.width-20) {
				vX = -vX; //�������棬���������ٶȷ���
			}
			GameCore.setSpritePosition(ball, (int)x, (int)y);
			GameCore.pause(10);
		}
		*/
		 
		/*
		int ball = 0;
		double vx = 20;
		double vy = 0;
		double x = 0;
		double y = 20;
		double t = 0.5;
		GameCore.createSprite(ball, "ball1");
		GameCore.playSpriteAnimate(ball, "rotate", true);
		GameCore.setSpritePosition(ball, 0, 20);
		for(;;){
			vy = vy+9.8*t;
			x = x+vx*t;
			y = y+vy*t;
			if (y > 500) {
				vy = -vy;
			}
			GameCore.setSpritePosition(ball, (int)x, (int)y);
			GameCore.pause(100);
		}
		*/
		
		/*
		int ball = 0;
		double vx = 15;
		double vy = 45;
		double x = 0;
		double y = 0;
		double t = 0.5;
		GameCore.createSprite(ball, "ball1");
		GameCore.setGameSize(1400, 900);
		GameCore.playSpriteAnimate(ball, "rotate", true);
		GameCore.setSpritePosition(ball, 0, 200);
		for(;;){
			vy = vy-9.8*t; //�տ�ʼY����ٶȻ�Խ��ԽС
			x = x+vx*t;
			y = y+vy*t; //�����Y������Y������� ��Ϊ����Ĵ������У�200-y�� ���ٶȱ�ɸ�����ʱ��y����ֵ��ʼ��С
						//��y��ɸ�����ʱ�򣨼�С�������ذ壩�����ʱ����if�ж�С��0ʱ��ʹY����ٶ�ȡ�෴��
			if (y < 0) {
				vy = -vy;
			}
			GameCore.setSpritePosition(ball, (int)x, (int)(200-y));
			GameCore.pause(100);
		}*/
		
//		int ball = 0;
//		double vx = 100;
//		double vy = 45;
//		double x = 0;
//		double y = 200;
//		double t = 0.5;
//		GameCore.createSprite(ball, "ball1");
//		GameCore.setGameSize(1400, 900);
//		GameCore.playSpriteAnimate(ball, "rotate", true);
//		GameCore.setSpritePosition(ball, 0, 200);
//		for(;;){
//			vy = vy-9.8*t;
//			x = x+vx*t;
//			y = y-vy*t; 
//			GameCore.setSpritePosition(ball, (int)x, (int)y);
//			GameCore.pause(100);
//		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameCore.start(new SmallBall());
	}

}
