package board;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BoardMain {
public static void main(String args[]){
	ApplicationContext factory = 
			new ClassPathXmlApplicationContext
			("board/board.xml");

	BoardVO vo = 
	factory.getBean("boardVO", board.BoardVO.class);
	
//	BoardDAO dao = 
//	factory.getBean("boardDAO", board.BoardDAO.class);	

	BoardService1 service = 
	factory.getBean("boardService",board.BoardService1.class);	
	service.insertBoard(vo);
	
}
}
