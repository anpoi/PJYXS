package day09.text006;
/**
 * 	java语言当中方法调用的时候涉及到参数传递的问题
 * 	参数传递实际上传递的是变量中保存的具体值
 * 	int i = 10;
 * 	add(i) 等同于 add(10)
 *
 */
public class Test01 {

	public static void main(String[] args) {
		
		int i = 10;//局部变量，变量本身占有内存空间，本身有内存地址
		
		add(i);//add方法调用的时候，给add传递了一个变量i，到底传的是什么？
		
		System.out.println("main -->" + i);//10
		
		
	}
	public static void add(int i) {//形参，局部变量
		i++;
		System.out.println("add --> " + i);//11
	
	}
}
