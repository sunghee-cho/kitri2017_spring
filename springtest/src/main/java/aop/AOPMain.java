package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop.test1.test2.AOPTarget3;


public class AOPMain {
public static void main(String args[]){
	ApplicationContext factory
	= new ClassPathXmlApplicationContext
	("aop/aop.xml");
	AOPTarget1 t = 
			(AOPTarget1)factory.getBean("aopTarget");

	t.method(1, 1.0, "spring");

	
	AOPTarget2 t2 = 
			(AOPTarget2)factory.getBean("aopTarget2");

	//���� AOPAspect : beforeMethod ���� �ڵ� ȣ��
	t2.login("spring");
	//���� AOPAspect : afterMethod ���� �ڵ� ȣ��
	
	//���� AOPAspect : beforeMethod ���� �ڵ� ȣ��
	t2.logout("spring");
	//���� AOPAspect : afterMethod ���� �ڵ� ȣ��
	
	AOPTarget3 t3 = 
			(AOPTarget3)factory.getBean("aopTarget3");

	//���� AOPAspect : beforeMethod ���� �ڵ� ȣ��
	t3.method(3, 3.0, "spring3");

}
}





