package day09.text002;

public class Text {

	public static void main(String[] args) {
		
		//����һ���ɷ����
		Husband xiaoJiang = new Husband();
		xiaoJiang.name = "С��";
		
		//����һ�����Ӷ���
		Wife feiFei = new Wife();
		feiFei.name = "�ɷ�";
		
		//���
		xiaoJiang.w = feiFei;
		
		feiFei.h = xiaoJiang;
		
		System.out.println(xiaoJiang.w.name);
		System.out.println(feiFei.h.name);
	}

}
