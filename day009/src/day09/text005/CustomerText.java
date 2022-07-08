package day09.text005;

/**
 *	快编辑：eclipse支持多行同时编辑：alt + shift + a 
 *
 */
public class CustomerText {

	public static void main(String[] args) {
		
		Customer c1 = new Customer();
		System.out.println(c1.getNo());
		System.out.println(c1.getName());
		System.out.println(c1.getBirth());
		
		Customer c2 = new Customer(1111,"xiaojaing","2000-1-1");
		System.out.println(c2.getNo());
		System.out.println(c2.getName());
		System.out.println(c2.getBirth());
	}

}
