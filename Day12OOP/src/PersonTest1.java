
public class PersonTest1
{

	public static void main(String[] args)
	{
		
		/*
		//����Person���һ������ʵ��Instance��,��Person��ı���p1ָ���������
		Person p1 = new Person(); //������һ������Ķ���ʵ����
		p1.setAge(1); //����p1��ǰ��ָ�����setAge����
		p1.setHeight(180);
		p1.setName("carl");
		p1.sayHello();
		
		Person p2 = new Person();// �ִ���һ������Ķ���ʵ����
		p2.setAge(18); //����p2��ǰ��ָ�����setAge����
		p2.setHeight(150);
		p2.setName("john");
		p2.sayHello();
		//ÿnewһ�ξʹ���һ���µĶ��󣬶������ͨ�����ǡ�ÿһ������һ�ݡ������������
		//��������֮�������ͨ�������޸�ֻ��Ӱ���Լ����������һ��
		p1.sayHello();//�����ӡ��carl
		*/
		
		
		/*
		int i = 20;
		int j = i;//��i�ĵ�ǰֵ��ֵ��j
		i = 30;
		System.out.println(j); //�����20
		
		//�����������ֵ�İ�������������ֵ������
		
		Person p1 = new Person();
		p1.setAge(1); 
		p1.setHeight(180);
		p1.setName("��ɽ");
		p1.sayHello();
		
		Person famousMan = p1;//��p1��ǰ��ָ��Ķ���ֵ��famousMan
		famousMan.sayHello();
		
		//һ������ֻ��ָ��һ������
		p1 = new Person();//����һ��Person��Ķ��󣬰�����ֵ��p1
		p1.setAge(100); 
		p1.setHeight(80);
		p1.setName("carl");
		
		famousMan.sayHello(); //�������
		*/
		
		/*
		Person p1 = new Person();
		p1.setName("��ɽ");
		p1.sayHello(); //��ɽ
		
		Person p2 = p1;
		p2.setName("carl");
		
		p1.sayHello();//carl
		p2.sayHello();//carl
		*/
		
		
		/*
		Person p1 = new Person(); //ֻ��new�Ż��������
		p1.setAge(55);
		p1.setHeight(552);
		p1.setName("��ɽ");
		p1.sayHello(); //��Һ�,���ǻ�ɽ,�ҵ�������55,�ҵ������552.0
		
		f1(p1);
		p1.sayHello();//��Һ�,���ǻ�ɽ,�ҵ�������50,�ҵ������552.0
		*/
		
		
		
		Person p1 = createPerson();
		p1.setHeight(552);
		p1.setName("��ɽ");
		p1.sayHello(); //��Һ�,���ǻ�ɽ,�ҵ�������666,�ҵ������552.0
		
		f1(p1);
		p1.sayHello();//��Һ�,���ǻ�ɽ,�ҵ�������666,�ҵ������552.0
		
		
	}
	//��������ڷ����ڲ��ľֲ�����
	static Person createPerson()
	{
		Person p1 = new Person();
		p1.setAge(666);
		return p1;
	}
	static void f1 (Person p)
	{
//		p.setAge(50);
		p = new Person();
		p.setName("wokao");
	}
}
