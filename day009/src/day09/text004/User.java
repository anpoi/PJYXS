package day09.text004;
/**
 * 	��װ�Ĳ��裺
 * 		1����������˽�л���ʹ��private�ؼ��ֽ������Σ�private��ʾ˽�еģ����ε���������
 * 		ֻ���ڱ����з��ʡ�
 * 		
 * 		2�������ṩ�򵥵Ĳ�����ڣ�Ҳ����˵�Ժ��ⲿ������Ҫ����age���ԣ�����ͨ����Щ�򵥵���ڽ��з��ʣ�
 * 			- �����ṩ���������ķ������ֱ���set������get����
 * 			- ���޸�age���ԣ�����set����
 * 			- ���ȡage���ԣ�����get����
 * 
 * 		3��set�����������淶��
 * 			public void set+����������ĸ��д(�β�){
 * 			}
 * 
 * 			public void setAge(int a){
 * 				age = a;
 * 			}
 * 
 * 		4��get�����������淶��
 * 			public int get+����������ĸ��д(){
 * 			}
 * 
 * 			public int getAge(){
 * 				return age;
 * 			}
 * 
 * 		����һ�£�һ������ͨ�����ʵ�ʱ������ļ��ַ�����ʽ��
 * 			- ��һ�ַ�ʽ�����ȡ������Ե�ֵ����ȡget
 * 			- �ڶ��ַ��������޸�������Ե�ֵ���޸�set
 *		
 *		��Ҫ����ȱ����������ݣ�
 *			* setter and getter����û��static�ؼ���
 *			*   ��static�ؼ������η��ķ�����ô���ã�����.������(ʵ��);
 *			*   û��static�ؼ������η��ķ�����ô���ã�����.������(ʵ��);
 */
public class User {
	
	//����˽�л�
	private int age;
	
	//set����û�з���ֵ����Ϊset����ֻ�����޸�����
	/*
 	public void setAge(int age) {
		age = age;//java�оͽ�ԭ��������ʵ��û�и�age���Ը�ֵ�������age���Ǿֲ�����
	}
	*/
	//setter
	public void setAge(int a) {
		//��дҵ���߼�������а�ȫ����
		//age = a;
		if(a<0||a>150) {
			System.out.println("�Բ������ṩ�����䲻�Ϸ�");
			return ;
		}
		age = a;
	}
	//getter
	public int getAge() {
		return age;
	}
}











