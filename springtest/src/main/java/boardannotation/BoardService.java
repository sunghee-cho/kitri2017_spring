package boardannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

public interface BoardService {
	void insertBoard(BoardVO vo);
}

@Service("boardService")
//<beab id="boardService" class="xx.BoardService1" />
class BoardService1 implements BoardService{
	@Autowired
	@Qualifier("boardDAO1") //2개 이상 존재시 @Component 설정
	BoardDAO boardDAO;
	//<property name="boardDAO" REF=".." />

	
//	public void setBoardDAO(BoardDAO boardDAO) {
//		this.boardDAO = boardDAO;
//	}

	public void insertBoard(BoardVO vo){
		boardDAO.insertBoard(vo);
	}
}
