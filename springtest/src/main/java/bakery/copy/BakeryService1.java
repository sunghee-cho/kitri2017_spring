package bakery.copy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("bakeryService")
public class BakeryService1 implements BakeryService {

	@Autowired
	BakeryDAO dao;
	public int order(String name, int amount) {
	//BakeryDAO 메소드 호출	
		return dao.order(name, amount);
	}

}
