
public class Person//������һ������
{
	//���ݡ�������ڱ���
	private int age;
	private String name;
	private double height;
	//��Ϊ��������ڷ���
	public void setAge(int value)
	{
		age = value; //����ǰ�����age����Ϊvalue
		//this.age = age;
	}
	public void setName(String value)
	{
		name = value;
	}
	public void setHeight(int value)
	{
		height = value;
	}
	public void sayHello()
	{
		System.out.println("��Һ�,����"+name+",�ҵ�������"+age+",�ҵ������"+height);
	}
}

//���ɡ����ݡ��͡���Ϊ����ɡ����ݣ���Ա������Field ���ֶΣ�����Ϊprivate.
//һ��java�ļ���ֻ�ܶ���һ��public��class����java�ļ�����public�������һ����
/*
public class T1 //�ᱨ����Ϊ����������public��class
{
	
}
*/

