
public class Main6 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int i1 = 1;
		int i2 = 2;
		int i3 = 3;
		System.out.println((i1>4)&&(i2<6));
		System.out.println(!(i1>4)||!(i2<6));
		*/
		
		/*
		{
		int i = 8;
		boolean b = (i>5)&&(i=i+5)>10; //true && true
		System.out.println(b);
		System.out.println(i); //i = 13
		}
		{
		int i = 8;
		boolean b = (i>15)&&(i=i+5)>10; //false && true
		//��·���� �������������ʽ����Ϊǰ��Ľ����false��Ȼ��Ϊ��ʡ�£��������ʽ�Ͳ������ˣ�
		System.out.println(b);
		System.out.println(i); //i = 8
		}
		{
		int i = 8;
		boolean b = (i=i+5)>10&&(i>15); //true && false 
		//��·���� �������������ʽ����Ϊǰ��Ľ����true��Ȼ�����������ʽ��
		System.out.println(b);
		System.out.println(i); //i = 13
		}
		//��·���㣺����&&��һ��������ߵ�Ϊfalse����ô���һ����false�� �����ԾͲ��ټ������ı��ʽ��
		 */
		
		/*
		{
		int i = 8;
		boolean b = (i>10||(i=i+6)>10); 
		System.out.println(b);//true 
		System.out.println(i); //i = 14
		}
		{
		int i = 8;
		boolean b = (i>1||(i=i+6)>10); 
		System.out.println(b);//true 
		System.out.println(i); //i = 8
		}
		//��·���㣬����||,һ��������ߵ�Ϊtrue����ô���һ����true����˾Ͳ������ұߵı��ʽ��
		*/
		
		/*
		int i = 1;
		int j = (i>3?555:3243);
		System.out.println(j);
		
		String k = (i>4)||(3!=5)?"2":"ddss"; //ע�������������String ��
		System.out.println(k);
		*/
		
		int i = 4;
		System.out.println(i%3 == 0); //֤���Ƿ��ܱ�3����
		int j = 9;
		boolean b = (j%3==0);
		System.out.println(b);
		String c = (j%3==0)?"yes":"no";
		System.out.println(c);
		
		
		
	}
}
