package aop.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AOPMain {
public static void main(String args[]){
	ApplicationContext factory
	= new ClassPathXmlApplicationContext
	("aop/annotation/aop.xml");
	//�ٽɰ��ɻ簴ü ȣ�� (�ڵ� AOP ASPECT ���� ����)
	AOPTarget1 t = 
			(AOPTarget1)factory.getBean("AOPTarget1");
	AOPTarget2 t2 = 
			(AOPTarget2)factory.getBean("AOPTarget2");
	//���� AOPAspect : beforeMethod ���� �ڵ� ȣ��
	t.method(1, 1.0, "spring");
	//���� AOPAspect : afterMethod ���� �ڵ� ȣ��
	
	//���� AOPAspect : beforeMethod ���� �ڵ� ȣ��
	t2.login("spring");
	//���� AOPAspect : afterMethod ���� �ڵ� ȣ��
	
	//���� AOPAspect : beforeMethod ���� �ڵ� ȣ��
	t2.logout("spring");
	//���� AOPAspect : afterMethod ���� �ڵ� ȣ��
}
}





