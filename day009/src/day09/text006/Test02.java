package day09.text006;
/**
 * 	���ս��ۣ�
 * 	�������õ�ʱ���漰���������ݵ����⣬���ݵ�ʱ��javaֻ��ѭһ���﷨���ƣ�
 * 	���ǽ������б���ġ�ֵ������ȥ�ˣ�ֻ������ʱ�����ֵ��һ������ֵ10���е�ʱ��
 * 	���ֵ����һ��java������ڴ��ַ0x1234
 *
 */
public class Test02 {

	public static void main(String[] args) {
		
		User u = new User(20);
		//u = 0x1234;
		//����u��add������ʱ��ʵ���ϴ��ݵ���u�����б����ֵ��ֻ�������ֵ��java������ڴ��ַ
		add(u);//��ͬ��0x1234
		
		System.out.println("main-->"+u.age);//21 
		
	}

	public static void add(User u) {
		u.age++;
		System.out.println("add-->"+u.age);//21
	}

}
class User{
	//ʵ������
	int age;
	
	//���췽��
	public User(int i) {
		age = i;
	}
}



