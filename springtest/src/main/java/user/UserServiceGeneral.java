package user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class UserServiceGeneral implements UserService{
	UserDAO dao;
	
	public UserDAO getDao() {
		return dao;
	}
	public void setDao(UserDAO dao) {
		this.dao = dao;
	}

	public void shop() {
		System.out.println("정상 판매중입니다");
		dao.shop();
	}
	@Override
	public ArrayList<UserVO> listUser() {
		ArrayList<UserVO> list = dao.getList();
		return list;
	}
	@Override
	public HashSet<UserVO> setUser() {
		HashSet<UserVO> set = dao.getSet();
		return set;
	}
	@Override
	public HashMap<String, UserVO> mapUser() {
		HashMap<String , UserVO> map = dao.getMap();
		return map;
	}
	
	
	
}
