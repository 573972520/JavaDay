

import com.rupeng.game.GameCore;

public class SpritesTogetherWalk implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
			//�����벽�ߺͰ���˳���߰���
		
			for (int num = 0; num < 6; num++) { //����6�����飨�տ�ʼ�Լ�����ǽ�Y����ΪԼ�������Ƿ��ֺ����в�ͨ��
					GameCore.createSprite(num, "mario");
					GameCore.setSpriteFlipX(num, true);
					GameCore.playSpriteAnimate(num, "walk", true);
					GameCore.setSpritePosition(num, 20, num*80);
			}
			 //�벽��
//			for (int moveX = 0; moveX < 600; moveX++) { //�ⲿ��forѭ����ʾX�������
//				for (int num = 0; num < 6; num++) { //�ڲ���forѭ���������Ϊ�����еľ��鶼ѡ�У�Ȼ��ͳһ����X���ֵ
//					GameCore.setSpritePosition(num, moveX, num*80);
//				}
//			}
			
			//����˳����
			for (int num = 0; num < 6; num++){ //�ⲿ��forѭ����ʾֻ����ѡ����Ϊ0�ľ���
				for (int moveX = 0; moveX < 600; moveX++) { //�ڲ���forѭ�����ⲿ��forѭ��һ��ϣ����Ա�ʾΪ�����Ϊ0�ľ����Ƚ���X������ӣ������ΰ��ձ��˳������X��ֵ
					GameCore.setSpritePosition(num, moveX, num*80);
				}
			}
		GameCore.pause(100000);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameCore.start(new SpritesTogetherWalk());
	}

}
