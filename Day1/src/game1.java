import com.rupeng.game.GameCore;

public class game1 implements Runnable
{
	public static void main(String[] args)
	{
		GameCore.start(new game1());
	}

	public void run()
	{
		/*
		 * GameCore.setGameSize(300, 300); GameCore.pause(3000);
		 * GameCore.setGameTitle("�������ϵ�"); //�޸���Ϸ���� //GameCore.pause(1000);
		 * GameCore.setGameSize(400, 400); GameCore.pause(2000);//��ͣ2000����
		 * GameCore.setGameTitle("�ҹ�����������"); GameCore.pause(1000);
		 * GameCore.setGameSize(600, 600); GameCore.pause(2000);
		 */

		/*
		 * GameCore.setGameSize(400, 400); GameCore.pause(1000);
		 * GameCore.setGameSize(500, 400); GameCore.pause(1000);
		 * GameCore.setGameSize(600, 400);
		 * GameCore.setGameTitle("������");//�޸ĺ��������֮�󣬽������Ĵ��ڵı���ȫ��Ϊ������
		 * GameCore.pause(1000); GameCore.setGameSize(700, 400);
		 * GameCore.pause(1000); GameCore.setGameSize(800, 400);
		 * GameCore.pause(1000); GameCore.setGameSize(900, 400);
		 * GameCore.pause(1000);
		 */

		// GameCore.alert(12+21);
		// GameCore.alert("12+21");

		GameCore.setGameSize(1500, 900);
		GameCore.alert("�����һ��");
		GameCore.loadBgView("1.jpg");
		GameCore.playSound("1.mp3", true); // һֱ�ظ�����
		GameCore.closeSound("1.mp3");// ? �˴����ڸ�λ�û᲻ʹ���ֹر�
		GameCore.pause(3000);
		// GameCore.closeSound("1.mp3");//? �˴����ڸ�λ�û�ʹ���ֹر�
		GameCore.alert("����ڶ���");
		GameCore.playSound("HOT.mp3", false);// ֻ����һ��
		GameCore.pause(10000);

	}

}
