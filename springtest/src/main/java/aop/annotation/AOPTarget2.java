package aop.annotation;

import org.springframework.stereotype.Component;

/* 1.패키지명 kitri.edu.aop
 * 2. 2개 메소드 public 
 * */
@Component
public class AOPTarget2 {
	public void login(String id){
		System.out.println
		(id + " 회원님 로그인하셨습니다.");
	}
	public void logout(String id){
		System.out.println
		(id + " 회원님 로그아웃하셨습니다.");
	}	
}
