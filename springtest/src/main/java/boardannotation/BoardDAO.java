package boardannotation;

import org.springframework.stereotype.Component;
//dao, vo 클래스 위 선언
@Component("boardDAO1")
public class BoardDAO {
	public void insertBoard(BoardVO vo){
		System.out.println
		(vo +" 를 db 에 저장했습니다.");
	}
}

