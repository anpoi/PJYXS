package day09.text001;
/**
 * ѧ��������
 * @author 86185
 *
 */
public class StudentText {
	//main�����Զ���ȫ��
	//����main,Ȼ��alt+/,�س�
	public static void main(String[] args) {
		//����ѧ������
		Student s = new Student();
		
		//���ʸ�ѧ��������
		System.out.println(s.no);
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.addr);
		System.out.println(s.sex);
		
		//ʵ����������ֱ�Ӳ��������ķ�ʽ����
		//System.out.println(Student.no);
		
		s.no = 10;
		s.name = "����";
		System.out.println("ѧ�ţ� " + s.no);
		System.out.println("ѧ�ţ� " + s.name);
		
		//����ѧ������
		Student lisi = new Student();
		lisi.name = "����";
		System.out.println(lisi.name);
	}

}
