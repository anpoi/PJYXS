package day09.text006;
/**
 * 	java���Ե��з������õ�ʱ���漰���������ݵ�����
 * 	��������ʵ���ϴ��ݵ��Ǳ����б���ľ���ֵ
 * 	int i = 10;
 * 	add(i) ��ͬ�� add(10)
 *
 */
public class Test01 {

	public static void main(String[] args) {
		
		int i = 10;//�ֲ���������������ռ���ڴ�ռ䣬�������ڴ��ַ
		
		add(i);//add�������õ�ʱ�򣬸�add������һ������i�����״�����ʲô��
		
		System.out.println("main -->" + i);//10
		
		
	}
	public static void add(int i) {//�βΣ��ֲ�����
		i++;
		System.out.println("add --> " + i);//11
	
	}
}
