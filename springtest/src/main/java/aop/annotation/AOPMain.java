package aop.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AOPMain {
public static void main(String args[]){
	ApplicationContext factory
	= new ClassPathXmlApplicationContext
	("aop/annotation/aop.xml");
	//핵심관심사객체 호출 (자동 AOP ASPECT 같이 실행)
	AOPTarget1 t = 
			(AOPTarget1)factory.getBean("AOPTarget1");
	AOPTarget2 t2 = 
			(AOPTarget2)factory.getBean("AOPTarget2");
	//이전 AOPAspect : beforeMethod 먼저 자동 호출
	t.method(1, 1.0, "spring");
	//이후 AOPAspect : afterMethod 나중 자동 호출
	
	//이전 AOPAspect : beforeMethod 먼저 자동 호출
	t2.login("spring");
	//이후 AOPAspect : afterMethod 나중 자동 호출
	
	//이전 AOPAspect : beforeMethod 먼저 자동 호출
	t2.logout("spring");
	//이후 AOPAspect : afterMethod 나중 자동 호출
}
}





