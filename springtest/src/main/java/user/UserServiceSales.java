package user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class UserServiceSales implements UserService{
	UserDAO dao;
	
	public UserDAO getDao() {
		return dao;
	}

	public void setDao(UserDAO dao) {
		this.dao = dao;
	}

	public void shop() {
	 System.out.println("할인 판매중입니다.");
	 dao.shopSales();
	}

	//추후 수정
	@Override
	public ArrayList<UserVO> listUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashSet<UserVO> setUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	//modifier 리턴타입 이름 매개변수 일치
	public HashMap<String, UserVO> mapUser() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
