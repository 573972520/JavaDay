import com.rupeng.game.GameCore;
import java.awt.Event;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.Dimension;

public class KeyBoom implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
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
		
		int tuoluoNum = 1;
		GameCore.createSprite(tuoluoNum, "tuoluo");
		GameCore.setSpritePosition(tuoluoNum, 100, 100);
		GameCore.playSpriteAnimate(tuoluoNum, "rotate", true);
		Point tuoluoPos = GameCore.getSpritePosition(tuoluoNum);
		//��ʼ��һ������״̬��һ��ը��
		//������Ҫ��ը��ʱ����ȥ����������飬���������ظ�����
		//��������洴��ը���Ĵ���ŵ��жϾ����Ƿ�С��20��if�����ʱ��ϵͳ�ᱨ����(���Ϊ2��sprite�Ѿ����ڣ������ظ�����)����Ϊ�����һֱ�ж�������룬ÿ�ж�һ�ξͻᴴ��һ��ը�������Ǳ��ȴһֱ��2�����Իᱨ��
		int bombNum = 2;
		GameCore.createSprite(bombNum, "bomb");
		GameCore.setSpritePosition(bombNum, 100, 100);
		GameCore.hideSprite(bombNum);
		
		
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
			//pow(a,b)��ʾa��b�η�������pow(4,0.5)��ʾ����4��pow(4,2)��ʾ4��2�η�
			double distion = Math.pow((tuoluoPos.x - pos.x)*(tuoluoPos.x - pos.x)+(tuoluoPos.y - pos.y)*(tuoluoPos.y - pos.y), 0.5);
			//��ʾ��X1-X2��*��X1-X2��+(Y1-Y2)*(Y1-Y2)��ƽ����
			//�Ӷ��������������ľ���
			if (distion < 20) {
//�������д��벻��д��if����У�����ԭ�򡪡����ظ��������Ϊ2��ը�����ᵼ�´���
//				int bombNum = 2;
//				GameCore.createSprite(bombNum, "bomb");
//				GameCore.setSpritePosition(bombNum, 100, 100);
				GameCore.hideSprite(tuoluoNum);//��������
				GameCore.showSprite(bombNum);//��ʾը��
				GameCore.playSpriteAnimate(bombNum, "fire", true);//����ը��Ч��
			}
			GameCore.pause(10);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameCore.start(new KeyBoom());
	}

}
