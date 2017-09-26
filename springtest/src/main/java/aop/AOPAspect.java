package aop;

import org.aspectj.lang.ProceedingJoinPoint;
//Ⱦ��(�ٽɰ��ɳ��ΰ������)����Ŭ����
public class AOPAspect {
	long startTime = 
			System.currentTimeMillis();
	public void beforeMethod(){
		System.out.println
		("===나는 핵심 로직 메소드 호출 이전에 수행될 부분입니다.===");
		System.out.println
		("==="+startTime+" 에 호출되었습니다. ===");
	}
	//<aop:after method="afterMethod" ... >
	public void afterMethod(){
		//Ÿ�� �޼ҵ� ���� �Ŀ� �ڵ� ���� : 
		//Ÿ�� �޼ҵ�(public kitri.edu.aop��Ű�� )�̸�,....
		System.out.println
		("===나는 핵심 로직 메소드 호출 이후에 수행될 부분입니다.===");
		System.out.println
		("==="+ (System.currentTimeMillis()-startTime)
		+ " (1/1000초) 소요되었습니다.===");
	}

	//<aop:after-returning method="afterMethod" 
	// returning = "returnVal" ... >

	public void afterMethod(Object returnVal){
		//Ÿ�� �޼ҵ� ���� �Ŀ� �ڵ� ���� : ���ϰ� �̿�
		//???? ���� : 
		System.out.println
		("===실행결과= " + returnVal);
	}
	//<aop:around ...method="aroundMethod"
	public void aroundMethod
	(ProceedingJoinPoint joinpoint){//���ü(AOPTarget1/2)
		try{
		Object returnVal = null;
		System.out.println
		("=== 핵심 메소드 수행 이전입니다===");
		returnVal = joinpoint.proceed(); // ���޼ҵ� ������
		System.out.println
		("=== 핵심 메소드 수행 이후입니다 ===");
		System.out.println
		("대상객체이름 : " + joinpoint.getTarget());
		System.out.println
		("대상메소드이름 : " + joinpoint.toLongString());
		Object o[] = joinpoint.getArgs();
		for(int i = 0; i < o.length; i++){
			System.out.println("매개변수 : " + o[i]);
		}
		System.out.println("대상메소드리턴값 : " + returnVal);
		}catch(Throwable e){
			System.out.println
			("��� �޼ҵ� ���� �� ���ܰ� �߻��߽��ϴ�.");
		}
	}
	
	
}












