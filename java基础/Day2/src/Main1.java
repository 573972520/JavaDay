import com.rupeng.game.GameCore;

public class Main1 implements Runnable
{
	public static void main(String[] args)
	{
		GameCore.start(new Main1());
	}

	public void run()
	{
		/*
		 * GameCore.setGameTitle("��һ����ϰ"); GameCore.alert("��־��");
		 * GameCore.loadBgView("2.jpg"); GameCore.playSound("HOT.mp3", true);
		 * GameCore.pause(3000); GameCore.closeSound("HOT.mp3");
		 * GameCore.alert("����ӱ"); GameCore.loadBgView("1.jpg"); GameCore.alert(
		 * "Game over!");
		 */

		/*
		 * String myname = "������"; //myname���Ǳ��� GameCore.setGameTitle(myname);
		 * GameCore.alert(myname);
		 */

		/*
		 * String name = "jack"; //��������String ��������name�����Ұ���������jack�����������
		 * GameCore.alert(name); GameCore.alert("name"); name = "Tom";
		 * //δ������String�� ��name����������Tom�������� GameCore.alert(name);
		 * //��ȥ�ľ͹�ȥ�ˣ�����ָ���µ����ݣ�ֻ��Ӱ��֮��ָ���ִ�н�������ᡰ��ͷ���ˡ� int price = 21; String
		 * name1;
		 * 
		 * int age4;//������ age4 = 9;//�ڸ�ֵ
		 * 
		 * int age = 7;//��������ֵ
		 */
		
		/*
		//�����������򡪡�������{}��Χ֮�ڶ��岻������
		{
			// GameCore.alert(name);//���������ȶ�����ʹ��
			String name = "rupeng.com";
			int age = 8;
			GameCore.alert(name);
			GameCore.alert(age);
		} // ������������
		//�ֲ�������������������ڵ�{},����������Ͳ���ʶ��
		{// ����һ�������
			String name = "����";
			int age = 8;
			GameCore.alert(name);
			{
				//String name = "34"; //�ڲ������еı������ܺ����������еı����ظ�
			}
		}
		
		
		//String w1 = "12"; //������д��ǰ��
		{
			String w1 = "123";
		}
		String w1 = "12";
		*/
		
		
		/*
		//�ֲ�����ʹ��ǰ���븳ֵ��
		//String name;
		//GameCore.alert(name);
		//����ʱ��ֵ
		String name = "run";
		GameCore.alert(name);
		//ʹ��ǰ��ֵ
		String name1;
		name1 = "boy";
		GameCore.alert(name1);
		*/
		
		byte b1 = 127; //byte��ȡֵ��Χ��-2��7�η���2��7�η���1
		System.out.println(b1);
		
		short s2 = 22222;
		System.out.println(s2);
		
		long l2 = 2332325333513333355L;//�ǵú������L����long����
		System.out.println(l2);
		

	}
}
