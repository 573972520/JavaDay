
public class MethodTest3
{
	static int f1(int i)
	{
		if (i > 0)
		{
			System.out.println("i > 0");
			return 2;// ����ִ�н���֮�󣬺���Ĵ���Ͳ�ִ����
			// ���Ұ�return�����ֵ��Ϊ���η������õķ���ֵ����������
		}
		System.out.println("233333");
		return 8;
	}

	static int f2(int n)
	{
		for (int i = 0; i < n; i++)
		{
			System.out.println("i="+i);
			if (i==3)
			{
				return 9;
			}
		}
		return 8;
	}
	static void f3(int n)//���û�з���ֵ��������Ҫִ�н����ĵط�return
	{
		for (int j = 0; j < n; j++)
		{
			System.out.println(j);
			if (j == 2)
			{
				return;
				//return;  //���������û��дreturn����ô�ڸ÷��������һ���б��������Զ�����return
			}
		}
	}
	static String f4(int i1,int i2){
		if (i1 > i2)
		{
			return "i1 is biger";
		}
		else if (i1 < i2) {
			return "i1 is smaller";
		}
//		else {
//			return "i1 and i2";
//		}
		return "i1 and i2";  //������Ĵ���һ����Ч�������Ǹ��Ӽ�
		//�������еĿ��ܵ������£��������з���ֵ!!(�������п��ܵ����)
	}
	static int f5(int n)
	{
		for (int i = 0; i < n; i++)
		{
			return i;
		}
		return 100;
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
//		int i = f1(5);
//		System.out.println(i);// �Ὣ���ص�ֵ��i
//		f1(5);// ���Ὣֵ���أ���Ϊû�е����ߣ�
//		int j = f1(-5);
//		System.out.println(j);
//		
//		int b = f2(6);//����f2��ʱ��ͽ�����f2�����ڲ�ִ�У�һֱ��returnΪ֮����return��ֵ��Ϊ����ֵ��ֵ��������
//		System.out.println(b);
		
		f3(5); //��return�Ľ����012��û��return�Ľ����01234
		System.out.println(f4(5, 5));
		System.out.println(f5(5));
	}

}
