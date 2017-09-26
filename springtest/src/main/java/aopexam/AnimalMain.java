package aopexam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnimalMain {
	public static void main(String[] args) {
		ApplicationContext factory = 
				new ClassPathXmlApplicationContext
				("aopexam/animal.xml");
	
		Animal [] animals = new Animal[3];
		animals[0] = factory.getBean("dog1", Animal.class);
		animals[1] = factory.getBean("cat1", Animal.class);
		animals[2] = factory.getBean("rab1", Animal.class);
			
		for(Animal a : animals){
			a.eat();
		}
	}
}
/*
 * 1. aopexam/animal.xml 정의
 * 2. AnimalAdvice 클래스 정의 

aop 적용시 인터페이스 하위객체 aop적용 라이브러리와
클래스객체 aop적용 라이브러리 다르다
인터페이스 하위객체 aop적용시에는 해당 bean을 인터페이스타입으로 취급한다.

===식사를 시작할까요? 오늘은 뭐 먹어요?===
aopexam.Dog 객체가 Animal.eat() 메소드 수행하였습니다. 
치킨을 먹었습니다
===강아지 동물이 식사를 마쳤어요===
===식사를 시작할까요? 오늘은 뭐 먹어요?===
aopexam.Cat 객체가 Animal.eat() 메소드 수행하였습니다. 
생선을 먹었습니다
===고양이 동물이 식사를 마쳤어요===
===식사를 시작할까요? 오늘은 뭐 먹어요?===
aopexam.Rabbit 객체가 Animal.eat() 메소드 수행하였습니다. 
풀떼기를 먹었습니다
===토끼 동물이 식사를 마쳤어요===


 */