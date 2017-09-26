package bakery;

import java.util.ArrayList;

public class BakeryDAO {
	ArrayList bakeryList; //bakery.xml 파일로부터 주입
	
	public void setBakeryList(ArrayList list){
		this.bakeryList = list;
	}

	public int order(String name, int amount){
		//name이 bakerylist에 존재하면
		//amount만큼 수량 가능한지 체크하고
		// 위의 2 조건 모두 만족시
		// 총 가격 xxxx 계산하여 리턴 
		return 0;
	}
}
