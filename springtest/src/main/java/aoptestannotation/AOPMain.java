package aoptestannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPMain {
public static void main(String[] args) {
	ApplicationContext factory = 
			new ClassPathXmlApplicationContext
			("aoptestannotation/aoptest.xml");
	//3개객체생성, AOPAdvice:aspect선언
	//2개객체메소드 수행 직전 
	AOPTarget1 t1 = (AOPTarget1)factory.getBean("target1");
	t1.method(0, 0.0, "spring");//종단관심=핵심관심
	
	AOPTarget2 t2 = (AOPTarget2)factory.getBean("target2");
	t2.login("hr");//종단관심=핵심관심
	
	t2.logout("hr", true);//종단관심=핵심관심

}
}



