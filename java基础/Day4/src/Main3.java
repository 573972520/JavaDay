import java.awt.Color;

import com.rupeng.game.GameCore;

public class Main3 implements Runnable
{

	public static void main(String[] args)
	{
		// TODO �Զ����ɵķ������
		GameCore.start(new Main3());
	}

	public void run()
	{
		/*
		GameCore.alert("����");
		boolean b = GameCore.confirm("are you SB?");//ִ�з���confirm����confirm�ķ���ֵ��ֵ��boolean���͵ı���b
		System.out.println(b);
		GameCore.alert(b);
		String name = GameCore.input("", "���������ʲô" );
		GameCore.alert("����,"+name);
		*/
		/*
		 * ʵ��һ���򵥵ļ�����
		String firstNum = GameCore.input("", "�����һ����");
		String sendentNum = GameCore.input("", "����ڶ�����");
		GameCore.alert("������֮��="+(Integer.parseInt(firstNum)+Integer.parseInt(sendentNum)));
		*/
		/*
		//��ʾ�û������������֣�Ȼ���ٷֱ�������Ϸ�Ŀ�
		//�Ⱥ͸߶ȣ�Ȼ��ı���Ϸ�ı���Ϊ�� ĳĳĳ����Ϸ�� ����
		//�Ұ���Ϸ���ڵĳߴ��޸�Ϊ�û������
		String name = GameCore.input("", "�����������");
		String height = GameCore.input("", "����߶�");
		String weight = GameCore.input("", "������");
		GameCore.setGameTitle(name+"����Ϸ");
		GameCore.setGameSize((Integer.parseInt(weight)), (Integer.parseInt(height)));
		GameCore.pause(6000);
		*/
		
		GameCore.setGameSize(943, 939);
		GameCore.loadBgView("1.jpg");
		
		GameCore.createText(0, "��������");
		GameCore.createText(1, "����");
		GameCore.pause(3000);
		GameCore.setTextPosition(1, 300, 300);
		GameCore.setText(1,"rpeng");
		GameCore.setTextColor(1,Color.ORANGE);
		GameCore.setTextFontSize(1, 70);
		
		GameCore.pause(3000);

		 
		
	}

}
