import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.KeyEvent;
import com.rupeng.game.GameCore;

public class EatCoinGame implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		int SpritesNum = 500;//mario���
		int[] nums = {10,20,30,40,50,60,70,80}; //��ұ��
		int[] xData = {120,500,632,798,146,200,456,1000};
		int[] yData = {146,598,254,694,123,156,755,198};
		//����Ƿ����ˣ�ʹ��boolean����
		boolean[] coinIsData = new boolean[8];//boolean����ÿ��Ԫ�ص�Ĭ��ֵ��false
		
		GameCore.loadBgView("2.jpg");
		GameCore.setGameSize(1280, 800);
		GameCore.createSprite(SpritesNum, "mario");
		GameCore.setSpritePosition(SpritesNum, 10, 10);
		GameCore.playSpriteAnimate(SpritesNum, "walk", true);
		//��ȡ��Ϸ���ڴ�С
		Dimension gameSize = GameCore.getGameSize();
		int gameWidth = gameSize.width;
		int gameHeiht = gameSize.height;
		//��ȡmario�Ĵ�С
		Dimension spriteSize = GameCore.getSpriteSize(SpritesNum);
		int spriteWidth = spriteSize.width;
		int spriteHeight = spriteSize.height;
		
		int coinImgNum = 2;//����ͼƬ���
		GameCore.createImage(coinImgNum, "0.png");
		GameCore.setImagePosition(coinImgNum, 1100, 50);
		int scoreNum = 0;//�����ı����
		GameCore.createText(scoreNum, "X0");
		GameCore.setTextFontSize(scoreNum, 30);
		GameCore.setTextColor(scoreNum, Color.BLACK);
		GameCore.setTextPosition(scoreNum, 1150, 50);
		//8ö��ҵ�λ��
		for (int i = 0; i < nums.length; i++) {
			int coinNum = nums[i];
			GameCore.createSprite(coinNum, "coin");
			GameCore.setSpritePosition(coinNum, xData[i], yData[i]);
			GameCore.playSpriteAnimate(coinNum, "rotate", true);
		}
		
		//����mario�ƶ�
		for(;;){
			int kc = GameCore.getPressedKeyCode();
			Point pos = GameCore.getSpritePosition(SpritesNum);
			if (kc == KeyEvent.VK_RIGHT) {
				if (pos.x < gameWidth-spriteWidth) {
					GameCore.setSpriteFlipX(SpritesNum, true);
					GameCore.setSpritePosition(SpritesNum, pos.x+1, pos.y);
				}
			}
			else if (kc == KeyEvent.VK_LEFT) {
				if (pos.x > 0) {
					GameCore.setSpriteFlipX(SpritesNum, false);
					GameCore.setSpritePosition(SpritesNum, pos.x-1, pos.y);
				}
				
			}
			else if (kc == KeyEvent.VK_UP) {
				if (pos.y > 0) {
					GameCore.setSpritePosition(SpritesNum, pos.x, pos.y-1);
				}
			}
			else if (kc == KeyEvent.VK_DOWN) {
				if (pos.y < gameHeiht-spriteHeight-30) {
					GameCore.setSpritePosition(SpritesNum, pos.x, pos.y+1);
				}
			}
			
			for (int i = 0; i < nums.length; i++) {
				int coinNum = nums[i];   
				boolean coinIsDead = coinIsData[i];//������ж���ʲô���壬ɾ����δ�����Ϸ���ǻ��������У�
				if (coinIsDead) {                  //������ж���ʲô���壬ɾ����δ�����Ϸ���ǻ��������У�
					continue;//�������Ѿ����Ե��ˣ��������ж���       
				}                                      
				Dimension coinSize = GameCore.getSpriteSize(coinNum);
				int coinWidth = coinSize.width;
				int coinHeight = coinSize.height;
				int coinX = xData[i];
				int coinY = yData[i];
				//���������ĵ�����
				int coinCenterX = coinX+coinWidth/2;
				int coinCenterY = coinY+coinHeight/2;
				//������������ĵ�����
				int marioCenterX = pos.x+spriteWidth/2;
				int marioCenterY = pos.y+spriteHeight/2;
				double distanceCoinMario = Math.pow((marioCenterX-coinCenterX)*(marioCenterX-coinCenterX)+(marioCenterY-coinCenterY)*(marioCenterY-coinCenterY), 0.5);
				if (distanceCoinMario < 15) {
					GameCore.hideSprite(coinNum);
					coinIsData[i] = true;//����������������Ӧ�ı�Ϊtrue
					//��һ�£��Ѿ����˶��ٽ����
					int eatCoinCount = 0;//���Ե��Ľ�ҵļ�����
					for (int j = 0; j < coinIsData.length; j++) {
						//��һ���ж��ٽ�ұ�����
						if (coinIsData[j] == true) {
							eatCoinCount++;
						}
					}
					GameCore.setText(scoreNum, "X"+eatCoinCount);
				}
			}
			GameCore.pause(0);
		
			}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameCore.start(new EatCoinGame());
	}

}















/*
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.KeyEvent;
 
import com.rupeng.game.GameCore;
 
public class EatCoin implements Runnable
{
 
    @Override
    public void run()
    {
        //��ҵĺ������������
        int[] coinXData={50,90,180,210,300,320,350,400,300,500};
        int[] coinYData={50,100,80,40,150,55,190,360,100,200};
        //����Ƿ����ˣ������ˣ�
        //boolean[] coinIsDeadData={false,false,false,false,false,false,false,false};
        boolean[] coinIsDeadData=new boolean[10];//boolean����ÿ��Ԫ�ص�Ĭ��ֵ����false
        //int����ÿ��Ԫ�ص�Ĭ��ֵ��0
        int[] coinNums={1,2,3,4,5,6,7,8,9,10};//������
        for(int i=0;i<coinNums.length;i++)
        {
            int coinNum = coinNums[i];
            GameCore.createSprite(coinNum, "coin");
            int x = coinXData[i];//��i��Ԫ�صĺ�����
            int y = coinYData[i];
            GameCore.setSpritePosition(coinNum, x, y);
            GameCore.playSpriteAnimate(coinNum, "rotate", true);
        }
        int marioNum=0;//����±��
        GameCore.createSprite(marioNum, "mario");
        GameCore.setSpritePosition(marioNum, 0, 0);
        GameCore.playSpriteAnimate(marioNum, "walk", true);
        GameCore.setSpriteFlipX(marioNum, true);
         
        Dimension gameSize = GameCore.getGameSize();
        int gameWidth = gameSize.width;
        int gameHeight = gameSize.height-20;
        Dimension marioSize = GameCore.getSpriteSize(marioNum);
        int marioWidth = marioSize.width;
        int marioHeight = marioSize.height;
         
        int bigCoinNum=0;//����ͼƬ�ı��
        int deadCountTextNum=0;//���˼�����ҵ��ı��ı��
        GameCore.createImage(bigCoinNum,"coin.png");
        GameCore.setImagePosition(bigCoinNum, 700, 0);
         
        //�Ե��Ľ�ҵļ���
        GameCore.createText(deadCountTextNum, "X0");
        GameCore.setTextFontSize(deadCountTextNum, 50);
        GameCore.setTextColor(deadCountTextNum, Color.yellow);
        GameCore.setTextPosition(deadCountTextNum, 750, 0);
         
        while(true)
        {
            int keyCode = GameCore.getPressedKeyCode();
            //�õ�����µ�ǰλ��
            Point marioPos = GameCore.getSpritePosition(marioNum);
            int marioX = marioPos.x;
            int marioY = marioPos.y;
            if(keyCode==KeyEvent.VK_LEFT||keyCode==KeyEvent.VK_A)
            {
                if(marioX>0)
                {
                    //todo:����bug��true���ǵģ�Ҫ��ת��false������ת��
                    GameCore.setSpriteFlipX(marioNum, false);
                    marioX--;
                    GameCore.setSpritePosition(marioNum, marioX, marioY);
                }          
                 
            }
            else if(keyCode==KeyEvent.VK_RIGHT||keyCode==KeyEvent.VK_D)
            {
                if(marioX<gameWidth-marioWidth)
                {
                    GameCore.setSpriteFlipX(marioNum, true);
                    marioX++;
                    GameCore.setSpritePosition(marioNum, marioX, marioY);
                }
            }
            else if(keyCode==KeyEvent.VK_UP||keyCode==KeyEvent.VK_W)
            {
                if(marioY>0)
                {
                    marioY--;
                    GameCore.setSpritePosition(marioNum, marioX, marioY);
                }
            }
            else if(keyCode==KeyEvent.VK_DOWN||keyCode==KeyEvent.VK_S)
            {
                if(marioY<gameHeight-marioHeight)
                {
                    marioY++;
                    GameCore.setSpritePosition(marioNum, marioX, marioY);
                }
            }
            //��while(true)֮ǰ��һ��Date���͵ı�����¼һ�µ�ǰʱ��
            //2�з�����System.currentTimeMillis() ��õ�ǰ�ĺ���ʱ��
            //��������ȡһ��System.currentTimeMillis() ��ǰʱ��
            //������ʱ������������������30000����=30�룬����û���Ե��Ľ�ң�����Ϊ������ʧ�ܡ�
             
             
            for(int i=0;i<coinNums.length;i++)
            {
                int coinNum = coinNums[i];
                boolean coinIsDead = coinIsDeadData[i];
                if(coinIsDead)
                {
                    continue;//�������Ѿ����Ե��ˣ��������ж���
                }
                int coinX = coinXData[i];
                int coinY = coinYData[i];
                //�õ���ҵĴ�С
                Dimension coinSize = GameCore.getSpriteSize(coinNum);
                int coinWidth = coinSize.width;
                int coinHeight = coinSize.height;
                 
                //�����ҵ����ĵ�����
                int coinCenterX = coinX+coinWidth/2;
                int coinCenterY = coinY+coinHeight/2;
                 
                //��������µ����ĵ�����
                int marioCenterX = marioX+marioWidth/2;
                int marioCenterY = marioY+marioHeight/2;
                //�����ҵ����ĵ��mario�����ĵ�ľ���
                double distanceCoinMario = Math.pow((coinCenterX-marioCenterX)*(coinCenterX-marioCenterX)
                        +(coinCenterY-marioCenterY)*(coinCenterY-marioCenterY), 0.5);
                if(distanceCoinMario<15)//�������ܽ�������Ϊ���Ե��ˡ�
                {
                    GameCore.hideSprite(coinNum);//���ر��Ե��Ľ��
                    coinIsDeadData[i]=true;//�ѡ�������¼���еĶ�Ӧλ����Ϊtrue
                     
                    //��һ���Ѿ��Ե����������
                    int eatCount=0;//���Ե��Ľ�ҵļ�����
                    for(int j=0;j<coinIsDeadData.length;j++)
                    {
                        //��һ���ж��ٽ�ұ�����
                        //if(coinIsDeadData[j]==true)
                        if(coinIsDeadData[j])
                        {
                            eatCount++;
                        }
                    }
                    //���½����ϡ����Ե��Ľ�ҡ��������ı�
                    GameCore.setText(deadCountTextNum, "X"+eatCount);
                }
            }
             
            GameCore.pause(20);
        }
    }
 
    public static void main(String[] args)
    {
        GameCore.start(new EatCoin());
    }
 
}

*/

