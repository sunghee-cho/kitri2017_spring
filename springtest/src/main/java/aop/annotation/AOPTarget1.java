package aop.annotation;

import org.springframework.stereotype.Component;
//�ٽɰ��� ���� Ŭ����=targetŬ����

@Component
public class AOPTarget1 {
	public String method(int i, double d, String s){
		System.out.println
		("���� �ٽ� ������ ������ �޼ҵ��Դϴ�.");
		return "�ٽ� ������ ���� ���";
	}
}
