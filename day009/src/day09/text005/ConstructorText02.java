package day09.text005;

/**
 *	���췽�������ã�
 *		1����������
 *		2�����������ͬʱ����ʼ��ʵ���������ڴ�ռ䡣����ʵ��������ֵ��
 *	 
 *	��Ա����֮ʵ�����������ڶ��󼶱�ı��������ֱ����������ж��������ʵ��������
 *	ʵ������û���ֶ���ֵ��ʱ��ϵͳĬ�ϸ�ֵ����ô���ϵͳĬ�ϸ�ֵ��ʲôʱ����ɵ��أ�
 *		��������ص�ʱ����
 *			���ǣ���Ϊ����ص�ʱ��ֻ�����˴���Ƭ�Σ���û�����ü������������Դ�ʱʵ��������û�г�ʼֵ��
 *			
 *		ʵ���ϣ� ʵ���������ڴ�ռ����ڹ��췽��ִ�й��̵�����ɿ��ٵġ���ɳ�ʼ���ġ�
 *		ϵͳĬ�ϸ�ֵ��ʱ��Ҳ���ڹ��췽��ִ�е�����ɸ�ֵ�ġ�
 *
 *	ʵ������Ĭ��ֵ��
 *		byte��short��int��long  0
 *		float��double          0.0
 *		boolean				   false
 *		������������			   null
 *
 *	ʵ�������Ǵ洢��JVM�Ķ��ڴ浱��
 */
public class ConstructorText02 {

	public static void main(String[] args) {
		
		//��eclipse�鿴���ʵ����ĸ����ԣ��鿴���ʵ����ĸ�������
		//��סctrl��������ƶ����鿴��Ԫ���ϣ������»��ߵ�ʱ��ʼ������
		//������һ���൱��Ԫ�ع��࣬����ٲ鿴���ڵ�ǰ����ʹ�á�ctrl + o����ݼ���Ȼ������Ҫ���ҵ�Ԫ������
		//��������
		Account act1 = new Account();
		System.out.println("�˺�" + act1.getActno());
		System.out.println("���" + act1.getBalance());
		
		//���������Ը�ֵ
		//act1.setActno("111");
		
		
		Account act2 = new Account("110");
		System.out.println("�˺�" + act2.getActno());//110
		System.out.println("���" + act2.getBalance());//0.0
		
		
		Account act3 = new Account(111.11);
		System.out.println("�˺�" + act3.getActno());//null
		System.out.println("���" + act3.getBalance());//111.11
		
		
		Account act4 = new Account("act4",11.1);
		System.out.println("�˺�" + act4.getActno());//act4
		System.out.println("���" + act4.getBalance());//11.1
	}
}
