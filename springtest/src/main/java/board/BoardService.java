package board;

public interface BoardService {
	void insertBoard(BoardVO vo);
}

class BoardService1 implements BoardService{
	BoardDAO boardDAO;
	
	public void setBoardDAO(BoardDAO boardDAO) {
		this.boardDAO = boardDAO;
	}

	public void insertBoard(BoardVO vo){
		boardDAO.insertBoard(vo);
	}
}
