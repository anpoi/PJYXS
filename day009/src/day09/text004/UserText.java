package day09.text004;

public class UserText {

	public static void main(String[] args) {
		
		//����User����
		User user = new User();
		
		//���뱨��age����˽�л������ⲿ�����в���ֱ�ӷ���
		//�Ӵ�֮��age���Էǳ��İ�ȫ�������е�̫��ȫ�ˡ�
		//����Ŀǰ�ĳ�����˵��age���Գ������ⲿ���ʲ����ˡ�
		//System.out.println(user.name);
		
		//�޸�
		user.setAge(-100);
		
		//��ȡ
		System.out.println(user.getAge());
	}

}
