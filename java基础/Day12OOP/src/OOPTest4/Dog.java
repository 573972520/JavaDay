package OOPTest4;

public class Dog
{
	//����������һ�����캯��
	public Dog (int age)
	{
		this.age = age;
	}
	//�����Լ������ṩһ���޲ι��캯�������û�и����޲ι��캯������ᱨ��
	public Dog ()
	{
		
	}
	
	private int age;
	private String name;
	
	public static void main(String[] args)
	{
		Dog d = new Dog();
	}
}
