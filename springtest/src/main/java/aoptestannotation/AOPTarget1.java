package aoptestannotation;

import org.springframework.stereotype.Component;

@Component("target1")
public class AOPTarget1 {
	public String method(int i, double d, String s){
		//System.out.println("메소드 실행 시각 표현");
		System.out.println
		("나는 핵심로직 구현 메소드입니다");
		return "핵심 로직 메소드의 리턴값";
	}
}
@Component("target2")
class AOPTarget2{
	public void login(String id){
		//System.out.println("메소드 실행 시각 표현");
		System.out.println
		(id + " 회원님 로그인하셨습니다.");
	}
	public void logout(String id, boolean session){
		//System.out.println("메소드 실행 시각 표현");
		if(session == true){
		System.out.println
		(id + " 회원님 로그아웃하셨습니다.");
		}
	}	
}





