import com.rupeng.game.GameCore;

public class Main2 implements Runnable
{
	public static void main(String[] args)
	{
		GameCore.start(new Main2());
	}

	public void run()
	{
		/*
		String s1 = "rupeng";
		String s2 = "baidu";
		s1 = s2; //��s1ָ��s2��ǰָ������ݣ���ֵ����
		System.out .println(s1);
		
		byte b = 5;
		int i = 9;
		i = b; //��ֵ�������������Ͳ�һ�£��ͻ�������ת��
		//�ѷ�ΧС�ĸ�ֵ����Χ��ı����ǿ��Եģ�����һ����ʽת��
		System.out.println(i);
		
		int t = 12;
		byte e = (byte)t; //���߱�����˵�����ܰɣ�û�µģ����ܳŵ��£���ʾ����ת����
		//��������̫��Ļ����������int t = 1233ʱ�������-47
		System.out.println(e);
		*/
		/*
		double d1 = 3.14D;
		double d2 = 3.14;
		double d3 = 3;
		//float f1 = 3.14; //С������Ĭ����double���ͣ����ܴ�doubleת����float
		float f2 = 3.14F;
		float f3 = f2;
		
		double d5 = f2;
		float f5 = (float)d5;
		int i2 = (int)d5;
		System.out.println(f3);
		System.out.println(d5);
		System.out.println(f5);
		System.out.println(i2);
		*/
		/*
		System.out.println(3.22*3.99);
		System.out.println(3/9);
		System.out.println(3/9.0);
		System.out.println(3/9F);
		System.out.println(3/9D);
		System.out.println(3.0/9);
		System.out.println(3F/9);
		System.out.println(3F/9F);
		System.out.println((6/4)*2.0);//int��int���㣬�������int
		System.out.println((6.0/4)*2.0);
		System.out.println((1/3)*3);
		System.out.println((1.0/3)*3);
		*/
		/*
		boolean b1 = true;
		boolean b2 = false;
		String s1 = "��\\\"Ҷ����\\\"����SB��";
		String s2 = "sfasd\nssada\ts";
		String s3 = "a\\\\na";
		System.out.println(s2.length());
		System.out.println(s2);
		System.out.println(s1.length());
		System.out.println(s1);
		System.out.println(s3.length());
		System.out.println(s3);
		*/
		/*
		int i = 5;
		//string s0 = (string)i; //���������У�ֻ���������͡�С������֮����ܽ�����ʾ������ʽ��ת��
		String s1 = String.valueOf(i); //int -> String
		String s2 = Integer.toString(i);//int -> String
		System.out.println(s1);
		System.out.println(s2);
		
		int i2 = Integer.parseInt(s1);
		System.out.println(i2);
		
		char c1 = 'a'; //�����ַ�
		char c2 = ' ';
		char c3 = '\n';
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		*/
		/*
		System.out.println("rupeng"+123);//�ַ������ַ�����ӣ������ַ���
		System.out.println(123+"rupeng"+123);
		System.out.println(123+321+"rupeg");//
		System.out.println("repeng"+123+321);
		System.out.println("repeng"+(123+321));
		System.out.println(3.3+4.66+"rep"+4.3+2.567);
		*/
		/*
		int i = 5; 
		i = i+5;  //�ȼ����ұߵ�ֵ���ٰѼ�������ֵ����ߵı���
		i++;
		System.out.println(i);
		
		int j = 4;
		int b = j; //��j��ǰ��ֵ����b
		j = 10;
		System.out.println(b);
		*/
		/*
		 * ��������������ֵ(����һ)
		int i = 3;
		int j = 5;
		System.out.println("i="+i+"    j="+j);
		int temp = i;
		i = j;
		j = temp;
		System.out.println("i="+i+"    j="+j);
		*/
		/*
		//��������������ֵ(������)
		int i = 3;
		int j = 5;
		System.out.println("i="+i+"    j="+j);
		i = i+j;
		j = i-j;
		i = i-j;
		System.out.println("i="+i+"    j="+j);
		*/
		
		/*
		 * ��ֵ���ʽ
		 int a = 5;
		 int b = (a=6);
		 System.out.println(b);
		 b = (a=a+3);
		 System.out.println(b);
		 
		 System.out.println(b=66);
		  */
		/*
		//i++,���������ֵ���ʽ��ֵ������֮ǰ��ֵ
		 int i = 6;
		 int j = i++;
		 System.out.println(j); //j��ֵΪ6
		 */
		
		/*
		//i++,���������ֵ���ʽ��ֵ������֮���ֵ
		 int i = 6;
		 int j = ++i;
		 System.out.println(j);//j��ֵΪ7
		 */
		/*
		int i = 5;
		//System.out.println(i++); //���Ϊ5
		//System.out.println(++i); //���Ϊ6
		//���������������һ��Ļ��Ľ���㲻һ����
		System.out.println(i++); //���Ϊ5
		System.out.println(++i); //���Ϊ7����Ϊi�Ѿ�����һ�ˣ�
		*/
		/*
		int i = 5;
		//System.out.println(i--); //���Ϊ5
		//System.out.println(--i); //���Ϊ4
		//���������������һ��Ļ��Ľ���㲻һ����
		System.out.println(i--); //���Ϊ5
		System.out.println(--i); //���Ϊ3����Ϊi�Ѿ�����һ�ˣ�
		*/
		
		 

	}
}
