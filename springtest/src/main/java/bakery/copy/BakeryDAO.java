package bakery.copy;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BakeryDAO {
	
	ArrayList<BakeryVO> bakeryList; //bakery.xml 파일로부터 주입
	
	public void setBakeryList(ArrayList<BakeryVO> list){
		bakeryList = list;
	}
	
	public int order(String name, int amount){
		//name이 bakerylist에 존재하면
		//amount만큼 수량 가능한지 체크하고
		// 위의 2 조건 모두 만족시
		// 총 가격 xxxx 계산하여 리턴 
		for(BakeryVO vo:bakeryList){
			if(vo.getName().equals(name)
			&& vo.getBalance() >= amount){
				return vo.getPrice()*amount;
			}
		}
		return 0;
	}
}
