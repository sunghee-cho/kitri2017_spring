package aop.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class AOPAspect {
	long startTime = 
			System.currentTimeMillis();
	@Pointcut("execution (public * aop.annotation.*.*(..))")
	public void naming(){}
	
	@Before("naming()")
	public void beforeMethod(){
		System.out.println
		("===���� �޼ҵ� ȣ�� ���� ����� ������ɻ� �޼ҵ��Դϴ�.===");
		System.out.println
		("==="+startTime+" �� ȣ��Ǿ����ϴ�.===");
	}
	//<aop:after method="afterMethod" ... >
//	public void afterMethod(){
//		//Ÿ�� �޼ҵ� ���� �Ŀ� �ڵ� ���� : 
//		//Ÿ�� �޼ҵ�(public kitri.edu.aop��Ű�� )�̸�,....
//		System.out.println
//		("===���� �޼ҵ� ȣ�� �Ŀ� ����Ǵ� ������ɻ� �޼ҵ��Դϴ�.===");
//		System.out.println
//		("==="+ (System.currentTimeMillis()-startTime)
//		+ " ��ŭ ���࿡ �ҿ�Ǿ����ϴ�===");
//	}

	//<aop:after-returning method="afterMethod" 
	// returning = "returnVal" ... >

	@AfterReturning(pointcut="naming()", 
			returning = "returnVal")
	public void afterMethod(Object returnVal){
		//Ÿ�� �޼ҵ� ���� �Ŀ� �ڵ� ���� : ���ϰ� �̿�
		//???? ���� : 
		System.out.println
		("===���� �� ���� ����� " + returnVal);
	}

	//<aop:around ...method="aroundMethod"
	
/*	@Around("naming()")
	public void aroundMethod
	(ProceedingJoinPoint joinpoint){//���ü(AOPTarget1/2)
		try{
		Object returnVal = null;
		System.out.println
		("=== ��� �޼ҵ� ���� �����Դϴ� ===");
		returnVal = joinpoint.proceed(); // ���޼ҵ� ������
		System.out.println
		("=== ��� �޼ҵ� ���� �����Դϴ� ===");
		System.out.println
		("���ü�̸� : " + joinpoint.getTarget());
		System.out.println
		("���޼ҵ��̸� : " + joinpoint.toLongString());
		Object o[] = joinpoint.getArgs();
		for(int i = 0; i < o.length; i++){
			System.out.println("�Ű������� : " + o[i]);
		}
		System.out.println("���޼ҵ帮�ϰ�� : " + returnVal);
		}catch(Throwable e){
			System.out.println
			("��� �޼ҵ� ���� �� ���ܰ� �߻��߽��ϴ�.");
		}
	}
	*/
	
}












