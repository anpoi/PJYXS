package day09.text001;
/**
 * 学生测试类
 * @author 86185
 *
 */
public class StudentText {
	//main方法自动补全、
	//输入main,然后alt+/,回车
	public static void main(String[] args) {
		//创建学生对象
		Student s = new Student();
		
		//访问该学生的属性
		System.out.println(s.no);
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.addr);
		System.out.println(s.sex);
		
		//实例变量不能直接采用类名的方式访问
		//System.out.println(Student.no);
		
		s.no = 10;
		s.name = "张三";
		System.out.println("学号： " + s.no);
		System.out.println("学号： " + s.name);
		
		//创建学生对象
		Student lisi = new Student();
		lisi.name = "李四";
		System.out.println(lisi.name);
	}

}
