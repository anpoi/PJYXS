package day09.text004;

public class CustomerText {

	public static void main(String[] args) {
		
		//私有的属性不能再外部直接访问
		//c.id = 10;
		
		//操作入口变成了只能通过set和get方法进行访问
		//在set方法和get方法执行过程中可以进行安全过滤。
		Customer c = new Customer();
		Customer c2 = new Customer();
		//set方法
		c.setId(100);
		c.setName("小蒋");
		c.setAge(21);
		c.setAddr("浙江");
		
		c2.setId(1010);
		c2.setName("小飞");
		c2.setAge(22);
		c2.setAddr("杭州");
		
		//get方法
		System.out.println(c.getId());
		System.out.println(c.getName());
		System.out.println(c.getAge());
		System.out.println(c.getAddr());
		
		System.out.println(c2.getId());
		System.out.println(c2.getName());
		System.out.println(c2.getAge());
		System.out.println(c2.getAddr());
	}                      

}
