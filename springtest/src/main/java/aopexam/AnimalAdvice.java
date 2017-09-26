package aopexam;

import org.aspectj.lang.ProceedingJoinPoint;

public class AnimalAdvice {
    public void around(ProceedingJoinPoint jp){
    	try{//aopexam.Dog  Dog.eat
        System.out.println
        ("===식사를 시작할까요? 오늘은 뭐 먹어요?===");
        System.out.println
        (jp.getTarget().getClass().getName() + " 객체가 "
        + jp.getSignature().toShortString() 
        + " 메소드 수행하였습니다. ");
        System.out.println
        ("===" + jp.proceed() + " 동물이 식사를 마쳤어요===");
    	}catch(Throwable e){
    		System.out.println
    		(jp.getTarget().getClass().getName() + " 객체 : "
    		+ jp.getSignature().toShortString() + " 메소드 : 에러");
    	}
    }
}


