package day09.text005;

public class User {

	//�޲������췽��
	public User() {
		  System.out.println("User's Default Constructor Invoke!");
	
	  }
	 
	 //����һ���в����Ĺ��췽��
	public User(int i) {
		System.out.println("����int���Ͳ����Ĺ�����");
		
	}
	 //����һ���в����Ĺ��췽��
	public User(String name) {
		System.out.println("����String���Ͳ����Ĺ�����");
			
	}
	//����һ���в����Ĺ��췽��
	public User(int i,String name) {
		System.out.println("����int��String���Ͳ����Ĺ�����");
			
	}
}
