package aopanimal;

import org.aspectj.lang.ProceedingJoinPoint;
/*
 * <bean id="advice" class="xxx.AnimalAdvice" />
 * <aop:config>
 *  <aop:pointcut id="pc" expresssion = "public String aopanimal.*.*(..)" 
 *  <aop:aspect id="ad1"  ref="advice" >
 *    <aop:around method="a" pointcut-ref="pc" 
 * </
 * */
public class AnimalAdvice {
 public void a(ProceedingJoinPoint joinPoint){
	 try{
	 System.out.println("======식사를 시작할까요? 오늘은 뭐 먹어요?======");
     String className = 
     joinPoint.getTarget().getClass().getName();
     String methodName = 
     joinPoint.getSignature().toShortString();
     System.out.println(className + " 객체가 "
    	+ methodName + " 수행했습니다.");
	 Object result = joinPoint.proceed();
	 System.out.println
	 ("======" + result + "동물이 식사를 종료했습니다======");
	 }catch(Throwable t){
		 System.out.println("오류");
	 }
 }
}
