package OOPTest2;

public class Person
{
	//���������ڲ��������ڷ������棩�ı����У���Ա�������߽��ֶΣ�Field��
	//��Ա�������Ŷ���Ĵ���������������������Ա��������
	//��Ա��������Ҫ��ʼ��.Ĭ��ֵ��int��double��Ĭ��ֵ��0������String����Ķ�������null������boolean��false
	int age = 999;
	String name;
	
	//�����ڷ����ڲ��ı����У��ֲ�����
	//�ֲ��������������ڣ����÷�����ʱ�����
	public void setAge(int value)
	{
//		int i; //�ֲ�����ʹ��֮ǰ�����ʼ��
		int i = 5;
		System.out.println(i);
		age = value; 
	}
	
	public void setName(String name) //���Ա��������
	{
//		name = name;(ǰ���name�ͺ����name����ʾ�ֲ�����)
		//����ֲ��������Ա������������ô������Ĭ�ϱ�ʾ�ֲ�����
		this.name = name;//this.age��ʾ��ǰ�����age��Ա������û��дthis�ͻ���Ĭ�ϵľֲ�����
		//int age ;//ȥ����һ�д��룬û�ж���һ���ֲ�����������������д�����ô���Ƕ�����һ���ֲ�������
		age = 88;
		//����û�ж���һ���ֲ����������������age������ǳ�Ա����
	}
	/*
	public void setName(String value)
	{
		name = value;
	}
	*/
	public void sayHello()
	{
		System.out.println("��Һ�,����"+this.name+",�ҵ�������"+age);
	}
	public static void  main(String[] args)
	{	
	
		Person p1 = new Person();//new Person()����һ��Person��Ķ���Person p1 = ��ʾ��p1ָ���������
		p1.setName("carl");
		p1.sayHello();
	
		
		p1 = null;//null�������κζ���p1 = null ���ǿ���p1�͵�ǰ��ָ�����֮��Ĺ�ϵ
		p1.sayHello();//����p1��ָ������sayHello��������������p1û��ָ��Ķ������Գ��򱨴�
		//�Ժ����г����ʱ�򣬳���NullPointerException
		//��ȷ������������ĸ�����Ϊnull�Լ�ΪʲôΪnull
		
		
		/*
		f2();
		Person p1 = f3();
		p1 = null;
		*/
		new Person().sayHello();//����һ��Person����Ȼ���������sayHello()����������Ǵ�Һ�,����null,�ҵ�������999��
		System.gc();//���飨�ǽ��鲻��һ����GC����������ȥ����
		
	}
	
	static void f2()
	{
		Person p1 = new Person();
		Person p2 = p1;
		Person p3 = p2;
		p3 = null;
		p2 = new Person();
		p1 = p2;//�������ߵ����ʱ��Person p1 = new Person()�е�new Person()����ͱ������ˣ���Ϊ�Ѿ�û�б���ָ������
	}
	
	static Person f3()
	{
		Person p1 = new Person();
		Person p2 = p1;
		Person p3 = p2;
		p3 = null;
		p2 = new Person();
		p1 = p2;
		return p2;
	}
}
