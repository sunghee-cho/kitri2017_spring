package tv2.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

//사용자 구현 : command  패턴
interface TV {
	public void powerOn();
	public void powerOff();	
	public void volumeUp();	
	public void volumeDown();		
}

@Component("tv")
//<bean id="tv" class="tv2.annotation.SamsungTV" />
class SamsungTV implements TV{
	SamsungTV(){
		System.out.println("삼성TV생성자호출");
	}
	public void powerOn(){
		System.out.println("삼성tv:전원켜다");
	}
	public void powerOff(){
		System.out.println("삼성tv:전원끄다");
	}
	public void volumeUp(){
		System.out.println("삼성tv:볼륨올리다");
	}
	public void volumeDown(){
		System.out.println("삼성tv:볼륨내리다");
	}
}
class LgTV implements TV{
	LgTV(){
		System.out.println("LgTV생성자실행");
	}
	public void powerOn(){
		System.out.println("엘지tv:전원켜다");
	}
	public void powerOff(){
		System.out.println("엘지tv:전원끄다");
	}	
	public void volumeUp(){
		System.out.println("엘지tv:볼륨올리다");
	}
	public void volumeDown(){
		System.out.println("엘지tv:볼륨내리다");
	}	
}
/*class TVFactory{
	public static TV getTV(String brand){
		TV tv = null;
		if(brand.equalsIgnoreCase("samsung")){
			tv = new SamsungTV();
		}
		else if(brand.equalsIgnoreCase("lg")){
			tv = new LgTV();
		}
		return tv;
	}
}*/
// SamsungTV, LgTV 선택권 존재 경우 :
// TV변경시마다 자바소스 수정 불가피-커플링 최소화
// 1개 파일 변경 수정 - 다른 파일 변경 수정 최소화 
// MAIN - FACTORY 시켜서 결과 리턴
// spring : factory method 패턴
public class TVSpringUser {
public static void main(String[] args) {
	ApplicationContext factory
	= new ClassPathXmlApplicationContext
	("tv2/annotation/tv.xml");

	TV tv = (TV)factory.getBean("tv");
	TV tv2 = (TV)factory.getBean("tv");
	TV tv3 = (TV)factory.getBean("tv");
	
//	tv.powerOn();
//	tv.volumeUp();
//	tv.volumeDown();
//	tv.powerOff();
}
}





