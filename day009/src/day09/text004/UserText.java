package day09.text004;

public class UserText {

	public static void main(String[] args) {
		
		//创建User对象
		User user = new User();
		
		//编译报错，age属性私有化，在外部程序中不能直接访问
		//从此之后age属性非常的安全，但是有点太安全了。
		//对于目前的程序来说，age属性彻底在外部访问不到了。
		//System.out.println(user.name);
		
		//修改
		user.setAge(-100);
		
		//读取
		System.out.println(user.getAge());
	}

}
