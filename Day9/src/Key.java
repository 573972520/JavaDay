import java.awt.Event;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.Dimension;

import com.rupeng.game.GameCore;

public class Key implements Runnable {


	//private static final int DOWN_Key = 40; //����һ������DOWN_Key���������°���
	public void run() {
		// TODO Auto-generated method stub
		
		/*
		//��������
		for(;;){
			int kc = GameCore.getPressedKeyCode();
			if (kc == 38) { //38��ʾ�����ϰ������ļ�����
				System.out.println("��");
			}
			if (kc == DOWN_Key) {
				System.out.println("��");
			}
			if (kc == KeyEvent.VK_LEFT) {
				System.out.println("��");
			}
			if (kc == KeyEvent.VK_RIGHT) {
				System.out.println("��");
			}
			//System.out.println(kc);
			*/
			
		    //���ƾ����߶�
			int marioNum = 0;
			GameCore.createSprite(marioNum, "mario");
			GameCore.setSpritePosition(marioNum, 100, 200);
			GameCore.setSpriteFlipX(marioNum, true);
			GameCore.playSpriteAnimate(marioNum, "walk", true);
			GameCore.setGameSize(300, 300);
			Dimension gameSize =  GameCore.getGameSize();  //�õ���Ϸ���ڵĴ�С
			int gameWidth = gameSize.width; //�õ���Ϸ���ڵĿ��
			int gameHeight = gameSize.height;//�õ���Ϸ���ڵĸ߶�
			Dimension spriteSize = GameCore.getSpriteSize(marioNum);//�õ�����ĳߴ�
			int spritesWidth = spriteSize.width;//�õ�����Ŀ��
			int spritesHeight = spriteSize.height;//�õ�����ĸ߶�
			for(;;){
				int kc = GameCore.getPressedKeyCode(); //�õ��û��İ���
				Point pos = GameCore.getSpritePosition(marioNum);//��ȡ���鵱ǰλ��
				if (kc == KeyEvent.VK_RIGHT||kc ==KeyEvent.VK_D) {
					if (pos.x < gameWidth-spritesWidth) { //���ܳ����ұ߽磬���Ϊ����Ϸ���ڿ��-����Ŀ�ȡ�
						GameCore.setSpriteFlipX(marioNum, true);
						GameCore.setSpritePosition(marioNum, pos.x+1, pos.y);
					}
				}
				else if (kc == KeyEvent.VK_LEFT||kc ==KeyEvent.VK_A){
					if (pos.x > 0) {//���ܳ�����߽�
						GameCore.setSpriteFlipX(marioNum, false);
						GameCore.setSpritePosition(marioNum, pos.x-1, pos.y);
					}
				}
				else if (kc == KeyEvent.VK_UP||kc ==KeyEvent.VK_W) {
					if (pos.y > 0) {//���ܳ����ϱ߽�
						GameCore.setSpritePosition(marioNum, pos.x, pos.y-1);
					}
				}
				else if (kc == KeyEvent.VK_DOWN||kc ==KeyEvent.VK_S) {
					if (pos.y < gameHeight-spritesHeight) {//���ܳ����±߽磬���Ϊ����Ϸ���ڸ߶ȶ�-����ĸ߶ȡ�
														  //��Ϸ���ڵĸ߶Ȱ��������������Ի����Լ�ȥһ��20 ������һ��(������û�м���20)
						GameCore.setSpritePosition(marioNum, pos.x, pos.y+1);
					}
				}
				GameCore.pause(10);
			}
			
			
			
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameCore.start(new Key());
	}

}
