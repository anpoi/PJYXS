package day09.text005;

/**
 *	����Java���еĹ��췽����
 *		1�����췽���ֱ���Ϊ���캯��/������/Constructor
 *		
 *		2�����췽���﷨�ṹ��
 *			[���η��б�]���췽����(��ʽ�����б���{
 *				���췽����;
 *			}
 *		
 *		3���ع���ͨ�������﷨�ṹ��
 *			[���η��б�]����ֵ���� ������(��ʽ�����б�){
 *				������;			
 *			}
 *		
 *		4�����ڹ��췽����˵��������ֵ���͡�����Ҫ�ƶ�������Ҳ����дvoid��
 *		ֻҪд��void����ô��������ͳ�Ϊ����ͨ������
 *		
 *		5�����ڹ��췽����˵�����췽���ķ������������������һ�¡�
 *
 *		6�����췽�������ã�
 *			���췽�����ڵ������ǣ�ͨ�����췽���ĵ��ã����Դ������			
 *
 *		7�����췽��Ӧ����ô���ã�	
 *			- ��ͨ�������������õģ��������η�����static��ʱ������.������(ʵ���б�)���������η��б���û��static��ʱ������.������(ʵ���б�)
 *			- new ���췽����(ʵ���б�)
 *
 *		8�����췽������ִ��֮���з���ֵ��
 *			ÿһ�����췽��ʵ����ִ�н���֮���з���ֵ�����������return ֵ;����������䲻��Ҫд�����췽��������ʱ��Java�����Զ�����ֵ��
 *			���ҷ���ֵ�����ǹ��췽������������͡����ڹ��췽���ķ���ֵ�����౾�������Է���ֵ���Ͳ���Ҫ��д��
 *
 *		9��ע�ͺ�ȡ��ע�ͣ�ctrl + /������ע�ͣ�ctrl + shift + /
 *
 *		10����һ������û�ж����κι��췽���Ļ���ϵͳĬ�ϸ������ṩһ���޲����Ĺ��췽����������췽������Ϊȱʡ��������
 *
 *		11����һ������ʾ�Ľ����췽����������ˣ���ôϵͳ����Ĭ����Ϊ������ṩȱʡ�����������鿪�����ֶ���Ϊ��ǰ���ṩ�޲������췽������Ϊ�޲������췽��̫�����ˡ�
 *
 *		12�����췽��֧�����ػ��ƣ���һ���൱�б�д������췽�����������췽����Ȼ�Ѿ����ɷ������ػ��ơ�
 */
public class ConstructorText01 {
	
	public static void main(String[] args) {
		
		//����User����
		//����User��Ĺ��췽������ɶ���Ĵ���
		//���³��򴴽���4������ֻҪ���캯�����þͻᴴ�����󣬲���һ�����ڡ����ڴ桱�п����ڴ�ռ䡣
		User u1 = new User();
		User u2 = new User(10);
		User u3 = new User("xiaojiang");
		User u4 = new User(20,"xiaojiang");
		
		System.out.println(u1);
		System.out.println(u2);
		System.out.println(u3);
		System.out.println(u4);
		
		//���ô���static�ķ���������.������(ʵ���б�)
		ConstructorText01.doSome();
		doSome();
		
		//���ò���static�ķ���������.������(ʵ���б�)
		//doOther������ConstructorText01�൱�У�������Ҫ����ConstructorText01����
		//����ConstructorText01���󣬵����޲������췽����
		ConstructorText01 t = new ConstructorText01();//һ������û���κι��췽���Ļ���ϵͳĬ���ṩһ���޲���������
		t.doOther();
		
		
	}
	//����������﷨�ǣ�new ����();
	
	/**
	 * 	����һ������static�ķ�������������doSome
	 */
	//��ͨ����static�ؼ������η�������.������(ʵ���б�)  55
	public static void doSome() {
		System.out.println("do some!");
	}
	
	//��ͨ��û��static�ؼ������η�������.������(ʵ���б�)  60 61
	public void doOther() {
		System.out.println("do other!");
	}
}
	

























