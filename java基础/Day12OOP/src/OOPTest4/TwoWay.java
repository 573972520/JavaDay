package OOPTest4;

public class TwoWay
{
	//��Ա������ʼ���ĵڶ��ַ�ʽ�����췽���г�ʼ��
	private int age;    //1.�ȶ���
	private String name;
	
	
	/*
	//��Ա������ʼ���ĵ�һ�ַ�ʽ������ʱ��ʼ��
	
	//����ʱ��ʼ��ʱ������ʹ��Ĭ��ֵ
	//private int age;
	//private String name;
		
	//����ʱ��ʼ��ʱ��Ҳ���Ըı�Ĭ��ֵ�������Լ���Ҫ��ֵ
	private int age = 5;
	private String name = "carl";
	*/
		
	public int getAge()
	{
		return this.age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public String getName()
	{
		return this.name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public TwoWay ()
	{
		this.age = 15;   //2.Ȼ���ڹ��췽����ֵ
		this.name = "john";
	}
	public static void main(String[] args)
	{
		TwoWay p1 = new TwoWay();
		System.out.println("age="+p1.getAge());
		System.out.println("name="+p1.getName());
	}

}
