package user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserCollectionTest {
 public static void main(String args[]){
	 ApplicationContext factory
	 = new ClassPathXmlApplicationContext
	 ("user/usercollection.xml");
	//list 가져오는 메소드 추가
	//UserService상속:오버라이딩 : xxxGenaral, XXXSales
	UserService service = 
	(UserService)factory.getBean("userService");
	
	//저장 순서 그대로 출력
	ArrayList<UserVO> list = service.listUser();
	for(UserVO vo : list){
		System.out.println(vo.getName());
	}
System.out.println("==========================");
	//순서 랜덤 출력
	HashSet<UserVO> set = service.setUser();
	for(UserVO vo : set){
		System.out.println(vo.getName());
	}
System.out.println("==========================");	
	HashMap<String, UserVO> map = service.mapUser();
	Set<String> keys = map.keySet();
	for(String s : keys){
		System.out.println
		("키=" + s + " ,값=" + map.get(s).name);
	}
 }
}















