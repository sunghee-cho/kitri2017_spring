package aoptest;

import org.aspectj.lang.ProceedingJoinPoint;

public class AOPAdvice {
	long startTime = 0;
	//2개 타켓 클래스 정의 메소드 호출 이전 시각 표현
	public void beforeMethod(){
		System.out.println
		("=== 나는 핵심관심 이전에 호출되는 메소드입니다===");
		startTime = System.currentTimeMillis();
		System.out.println
		("=== " + startTime + "(1/1000초)에 호출되었습니다.");
	}
	
	public void afterMethod(){
		//타겟 클래스 선정 메소드 실행 소요 시각 출력
		System.out.println
		("=== 나는 핵심관심 이후에 호출되는 메소드입니다===");
		long endTime = System.currentTimeMillis();
		long time = endTime - startTime;
		System.out.println
		("=== 타겟 메소드 수행에 " + time 
				+ "(1/1000초) 소요되었습니다. ===");
	}
	
	//타겟 메소드 리턴값 조회하는 aop:after
	public void afterMethod(Object returnValue){
		System.out.println
		("=== 나는 핵심관심 이후에 호출되는 메소드입니다 ===");
		System.out.println
		("타겟 메소드의 리턴값은 <<" 
		+ returnValue + ">> 입니다.");
	}
	
	// aroundMethod일부 -타겟메소드-aroundMethod나머지
	public void aroundMethod
	(ProceedingJoinPoint target){//타겟메소드정보객체
		try{
		System.out.println
		("=== 타겟 수행이전입니다===");
		Object r = target.proceed();//타겟메소드실행명령
		if(r != null){
		System.out.println("타겟 메소드 리턴값=" + r);
		}
		//타겟객체명
		System.out.println
		("타겟객체이름=" + target.getTarget());
		//타겟메소드정보
		System.out.println
		("타겟메소드선언=" + target.toLongString());
		//타겟매개변수정보
		Object [] args = target.getArgs();
		for(Object s : args){
			System.out.print(s+" : ");
		}
		System.out.println();
		
		System.out.println("타겟 수행이후입니다.");	
		
		}catch(Throwable w){
			System.out.println("타겟 메소드 예외 발생");
		}
	}
	
}



