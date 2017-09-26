package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aoptest.AOPTarget1;


public class Main {
public static void main(String[] args) {
	ApplicationContext factory
	= new ClassPathXmlApplicationContext
	("aoptest/aoptest.xml");
	AOPTarget1 t = 
			(AOPTarget1)factory.getBean("target1");

	t.method(1, 1.0, "spring");

}
}
