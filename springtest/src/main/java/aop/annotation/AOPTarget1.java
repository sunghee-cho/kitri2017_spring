package aop.annotation;

import org.springframework.stereotype.Component;
//핵심관심 구현 클래스=target클래스

@Component
public class AOPTarget1 {
	public String method(int i, double d, String s){
		System.out.println
		("나는 핵심 로직을 구현한 메소드입니다.");
		return "핵심 로직의 리턴 결과";
	}
}
