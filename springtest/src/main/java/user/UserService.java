package user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public interface UserService {
	void shop();
	ArrayList<UserVO> listUser();
	HashSet<UserVO> setUser();
	HashMap<String , UserVO> mapUser();
	
	
}
