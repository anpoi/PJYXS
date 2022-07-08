package day09.text002;

public class Text {

	public static void main(String[] args) {
		
		//创建一个丈夫对象
		Husband xiaoJiang = new Husband();
		xiaoJiang.name = "小蒋";
		
		//创建一个妻子对象
		Wife feiFei = new Wife();
		feiFei.name = "飞飞";
		
		//结婚
		xiaoJiang.w = feiFei;
		
		feiFei.h = xiaoJiang;
		
		System.out.println(xiaoJiang.w.name);
		System.out.println(feiFei.h.name);
	}

}
