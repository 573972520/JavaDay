package OOPTest5;

public class Test1
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Dog d1 = new Dog();
		d1.setAge(5);
		d1.setType("̩��");
		d1.setName("����");
		Dog d2 = new Dog();
		d2.setAge(7);
		d2.setType("����");
		d2.setName("��˶");
		
		Person p1 = new Person();
		p1.setAge(8);
		p1.setName("carl");
		p1.setPetDog(d1);
		
		p1.sayHello();
		
		
		System.out.println("����Ʒ����"+p1.getPetDog().getType());
		//��������Ĵ�����p1.getPetDog().getType()����������������ļ���
		//Dog d2 = p1.getPetDog();
		//d2.getType();
		
		Person p2 = new Person();
		p2.setAge(80);
		p2.setName("FUCK");
		p2.setPetDog(d2);
		p2.sayHello(); 
		
	}

}
