package OOPTest3;

public class Person
{
	//javabean��̹淶�������ݣ���Ա����������Ϊprivate����ȡʹ��get***���������ò���set***����
	//getter(��ȡ)ָ�ľ���get������setter(����)ָ�ľ���set����
	
	//private��˽�У���Ա������ֻ���ڵ�ǰ���з��ʣ����ܱ����������
	private int age;
	private String name;
	
	//ʲô����д����default��ͬһ�����п��Է��ʣ�
	//int age;  
	//String name;
	
	//public��������������Ҳ���Է���
	//public int age;  
	//public String name;
	
	/**
	 * ���õ�ǰ�˵�����
	 * @param age ����
	 */
	public void setAge(int age)
	{
		if (age < 0)
		{
			System.out.println("���䲻��Ϊ����");
			return;
		}
		this.age = age;
	}
	/**
	 * ���õ�ǰ�˵�����
	 * @param name ����
	 */
	public void setName(String name)
	{
		if (name == null)
		{
			System.out.println("û�д����ַ�������");
			return;
		}
		if (name.length() > 5)
		{
			System.out.println("�������Ȳ��ܴ���5");
			return;
		}
		this.name = name;
	}
	/**
	 * ��õ�ǰ�˵�����
	 * @return ����
	 */
	public int getAge ()
	{
		return this.age;
	}
	/**
	 *  ��õ�ǰ�˵�����
	 * @return ����
	 */
	public String getName ()
	{
		return this.name;
	}
	
	public void sayHello()
	{
		System.out.println("��Һ�,����"+this.name+",�ҵ�������"+this.age);
	}
}
