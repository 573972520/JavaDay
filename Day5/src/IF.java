import com.rupeng.game.GameCore;

public class IF implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		/*
		int age = Integer.parseInt(GameCore.input("", "��������"));
		if (age>=18) {
			GameCore.loadBgView("1.jpg");
			GameCore.pause(2000);
		}else {
			GameCore.alert("δ��18�겻�ܿ�");
		}
		*/
		
		
		/*
		int age = Integer.parseInt(GameCore.input("", "��������"));
		if (age<=0) {
			GameCore.alert("����������SB��,�������밡��");
			int j = Integer.parseInt(GameCore.input("", "��������"));
			if (j>=0) {
				GameCore.loadBgView("1.jpg");
				GameCore.pause(2000);
			}
		}else {
			GameCore.loadBgView("1.jpg");
			GameCore.pause(2000);
		}
		*/
		
		
		/*
		int i = 6;
		if (i=6) {//if����ı��ʽ����booleanֵ�����Գ���
			
		}
		*/
		
		
		
		boolean b = false;
		if (b=true) {  //�����if(true)  if����ı��ʽ��booleanֵ����
			System.out.println(b);
		}
		
		
		
		/*
		int i = 5;
		if (i) { //��C���������if��i�������if��i>0����������java�в���������
			
		}
		*/
		
		
		
		/*
		int i =3;
		if (i>5)  //���ifʡ�Դ����ţ���������Ὣ���������һ�д����Զ����ϴ�����
			System.out.println("1");
			System.out.println("2");
		//����ʹ��ifʱ������ֻ��һ�仰Ҳ����ʹ�ô�����
		*/
		
		/*
		int j = 2;
		if (j>5); //��if������Ϸֺŵ�ʱ�������if��j>5��{} ��ʹif��Ϊ��һ���յĴ�����
		{
			System.out.println("123");
		}
		*/
		
	
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameCore.start(new IF());
	}

}
