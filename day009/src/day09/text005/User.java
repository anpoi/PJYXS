package day09.text005;

public class User {

	//无参数构造方法
	public User() {
		  System.out.println("User's Default Constructor Invoke!");
	
	  }
	 
	 //定义一个有参数的构造方法
	public User(int i) {
		System.out.println("带有int类型参数的构造器");
		
	}
	 //定义一个有参数的构造方法
	public User(String name) {
		System.out.println("带有String类型参数的构造器");
			
	}
	//定义一个有参数的构造方法
	public User(int i,String name) {
		System.out.println("带有int和String类型参数的构造器");
			
	}
}
