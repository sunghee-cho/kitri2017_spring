package aop.annotation;

import org.springframework.stereotype.Component;

/* 1.��Ű���� kitri.edu.aop
 * 2. 2�� �޼ҵ� public 
 * */
@Component
public class AOPTarget2 {
	public void login(String id){
		System.out.println
		(id + " ȸ���� �α����ϼ̽��ϴ�.");
	}
	public void logout(String id){
		System.out.println
		(id + " ȸ���� �α׾ƿ��ϼ̽��ϴ�.");
	}	
}
