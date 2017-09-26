package user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class UserVO {
	UserVO(){}
	UserVO(String name) {this.name = name;}
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
class UserDAO {
	UserVO uservo;
	ArrayList<UserVO> list;
	HashSet<UserVO> set;
	HashMap<String, UserVO> map;
	
	public HashMap<String, UserVO> getMap() {
		return map;
	}
	//usercollection.xml <prope....
	public void setMap(HashMap<String, UserVO> map) {
		this.map = map;
	}
	public HashSet<UserVO> getSet() {
		return set;
	}
	public void setSet(HashSet<UserVO> set) {
		this.set = set;
	}
	public ArrayList<UserVO> getList() {
		return list;
	}
	public void setList(ArrayList<UserVO> list) {
		this.list = list;
	}
	public UserVO getUservo() {
		return uservo;
	}
	public void setUservo(UserVO uservo) {
		this.uservo = uservo;
	}
	//dao.shop() | dao.shopSales()
	public void shop(){
		System.out.println
		(uservo.getName()+" 회원님");
		System.out.println
		("모든 제품 정상 판매중입니다.");
	}
	public void shopSales(){
		System.out.println
		(uservo.getName()+" 회원님에게만");
		System.out.println
		("컴퓨터, 노트북, 스마트폰을 50% 할인 판매중입니다.");
	}	
}

public class UserTest {
 public static void main(String args[]){
	 ApplicationContext factory
	 = new ClassPathXmlApplicationContext
	 ("user/user.xml");
	
	 //test3
//정상판매중 : UserServiceGeneral
//	 UserService service = 
//	 (UserService)factory.getBean("userservice");
//	 service.shop();

	 //test4
//할인판매중 : UserServiceSales
	 UserService service = 
	 (UserService)factory.getBean("userservice");
	 service.shop();


	 
	 //test2
//	 UserDAO dao = factory.getBean
//	 ("userdao", user.UserDAO.class);
//	 System.out.println(
//			 dao.getUservo().getName());

	 //test1
//	 UserVO vo = 
//			 (UserVO)factory.getBean("uservo");

//	 UserVO vo = 
//			 factory.getBean
//			 ("uservo", user.UserVO.class);
	 
//	 System.out.println(vo.getName());
	 
 }
}








