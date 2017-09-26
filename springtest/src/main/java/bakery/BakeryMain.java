package bakery;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BakeryMain {
	public static void main(String args[]){
		String name = args[0];
		int price = Integer.parseInt(args[1]);
		// bakery/bakery.xml 파일  스프링설정 적용
		//명령행 매개변수 : 
		//	아메리카노 5
		
		//출력
		//	아메리카노 5잔 주문
		//	총 xxx 원입니다.
		ApplicationContext factory = 
				new ClassPathXmlApplicationContext
				("bakery/bakery.xml");
		BakeryService bakeryService =
	(BakeryService) (factory.getBean("bakeryService"));

	int totalPrice = bakeryService.order(name, price);
			
		System.out.println
		(name + " ; " + price + ":" + totalPrice);

	}
}
