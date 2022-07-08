package day09.text004;
/**
 * 	封装的步骤：
 * 		1、所有属性私有化，使用private关键字进行修饰，private表示私有的，修饰的所有数据
 * 		只能在本类中访问。
 * 		
 * 		2、对外提供简单的操作入口，也就是说以后外部程序想要访问age属性，必须通过这些简单的入口进行访问：
 * 			- 对外提供两个公开的方法，分别是set方法和get方法
 * 			- 想修改age属性，调用set方法
 * 			- 想读取age属性，调用get方法
 * 
 * 		3、set方法的命名规范：
 * 			public void set+属性名首字母大写(形参){
 * 			}
 * 
 * 			public void setAge(int a){
 * 				age = a;
 * 			}
 * 
 * 		4、get方法的命名规范：
 * 			public int get+属性名首字母大写(){
 * 			}
 * 
 * 			public int getAge(){
 * 				return age;
 * 			}
 * 
 * 		回想一下，一个属性通常访问的时候包括哪几种访问形式？
 * 			- 第一种方式：想读取这个属性的值，读取get
 * 			- 第二种方法：想修改这个属性的值，修改set
 *		
 *		需要大家先背会以下内容：
 *			* setter and getter方法没有static关键字
 *			*   有static关键字修饰符的方法怎么调用：类名.方法名(实参);
 *			*   没有static关键字修饰符的方法怎么调用：引用.方法名(实参);
 */
public class User {
	
	//属性私有化
	private int age;
	
	//set方法没有返回值，因为set方法只负责修改数据
	/*
 	public void setAge(int age) {
		age = age;//java有就近原则，这里其实并没有给age属性赋值，这里的age都是局部变量
	}
	*/
	//setter
	public void setAge(int a) {
		//编写业务逻辑代码进行安全控制
		//age = a;
		if(a<0||a>150) {
			System.out.println("对不起，您提供的年龄不合法");
			return ;
		}
		age = a;
	}
	//getter
	public int getAge() {
		return age;
	}
}











