package OOPTest5;

public class Person
{

	private int age;
	private String name;
	private Dog petDog;
	private Person father;
	
	public Person getFather()
	{
		return father;
	}
	public void setFather(Person father)
	{
		this.father = father;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public Dog getPetDog()
	{
		return petDog;
	}
	public void setPetDog(Dog petDog)
	{
		this.petDog = petDog;
	}
	public void sayHello()
	{
		System.out.println("��Һã��ҽ�"+this.name+",��"+this.age+"����,"+"�ҵĳ��ﹷ��"+this.getPetDog().getName());
		//��������������д
//		System.out.println("��Һã��ҽ�"+this.name+",��"+this.age+"����,"+"�ҵĳ��ﹷ��"+this.petDog.getName());
		System.out.println(this.getPetDog().getName()+"������ʺã�");
		this.petDog.wangWang();
		
	}

}
