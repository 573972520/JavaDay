
public class MethodTest2
{
	static int getNine()
	{
		return 9;
	}

	static String str(String s)
	{
		return s;
	}
	static String strint(String s,int i){
		return s+i;
	}
	static int add(int i)
	{
		i++; // �����ڲ��޸Ĳ�����ֵ������Ӱ�쵽�����ߣ���Ϊ���ﴫ��������һ�ݡ���������ֵ
		return i;
	}
	//return֮�󷽷��ͽ����ˣ������Ĵ���Ͳ���ִ����
	static void hello(){   //void��ʾ������û�з���ֵ��
		System.out.println("hello��λ");
	}
	static void sayHello(String name){
		System.out.println("��Һ�,����"+name);
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int i = getNine();
		System.out.println(i);// 9
		int j = add(i);
		System.out.println(j);// 10
		System.out.println(i);// 9
		// ���ڷ������������õ�ʱ�򣬶�����ͨ��������int��boolean���ǿ���һ�ݴ��ݸ������ģ����������i��������
		int a = 5;
		String s = "h";
		System.out.println(str(s));
		System.out.println(strint(s, a));
		hello();
		String s1 = "����";
		sayHello(s1);
		sayHello("Carl");
 	}

}
