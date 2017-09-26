package aopexam.annotation;

import org.springframework.stereotype.Component;

@Component("cat1")
public class Cat implements Animal{
	public String eat() {
		System.out.println("생선을 먹었습니다");
		return "고양이";
	}
}
