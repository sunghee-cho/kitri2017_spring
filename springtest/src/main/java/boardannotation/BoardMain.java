package boardannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BoardMain {
public static void main(String args[]){
	ApplicationContext factory = 
			new ClassPathXmlApplicationContext
			("boardannotation/board.xml");

	BoardVO vo = 
	factory.getBean("boardVO", boardannotation.BoardVO.class);
	
//	BoardDAO dao = 
//	factory.getBean("boardDAO", board.BoardDAO.class);	

	BoardService1 service = 
	factory.getBean("boardService",boardannotation.BoardService1.class);	
	
	service.insertBoard(vo);
	
}
}
