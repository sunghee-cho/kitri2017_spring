package aopanimal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnimalMain {
public static void main(String[] args) {
	ApplicationContext factory
	= new ClassPathXmlApplicationContext
	("aopanimal/animal.xml");
	
	Animal [] animals = new Animal[3];
	animals[0] = (Animal)factory.getBean("dog1");
	animals[1] = (Animal)factory.getBean("cat1");
	animals[2] = (Animal)factory.getBean("rab1");
	
	for(Animal a : animals){
		a.eat();
		//System.out.println(animalName);
	}
			

}
}
