package day09.text004;

public class CustomerText {

	public static void main(String[] args) {
		
		//˽�е����Բ������ⲿֱ�ӷ���
		//c.id = 10;
		
		//������ڱ����ֻ��ͨ��set��get�������з���
		//��set������get����ִ�й����п��Խ��а�ȫ���ˡ�
		Customer c = new Customer();
		Customer c2 = new Customer();
		//set����
		c.setId(100);
		c.setName("С��");
		c.setAge(21);
		c.setAddr("�㽭");
		
		c2.setId(1010);
		c2.setName("С��");
		c2.setAge(22);
		c2.setAddr("����");
		
		//get����
		System.out.println(c.getId());
		System.out.println(c.getName());
		System.out.println(c.getAge());
		System.out.println(c.getAddr());
		
		System.out.println(c2.getId());
		System.out.println(c2.getName());
		System.out.println(c2.getAge());
		System.out.println(c2.getAddr());
	}                      

}
