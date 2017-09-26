package emp;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpTest {
	public static void main(String args[]){
		
		ApplicationContext factory = 
				new ClassPathXmlApplicationContext
				("emp/emp.xml");
		EmpServiceImpl empService = (EmpServiceImpl)
				(factory.getBean("empService"));
		//empDAO(list:empVO1, empVO2), empVO
		EmpVO empVO = (EmpVO)(factory.getBean("empVO"));
		
		if(args[0].equals("insert")){
			empService.insertEmp(empVO);
			System.out.println("insert 완료");
		}
		else if(args[0].equals("list")){
			List all = empService.selectAllEmp();
			Iterator i = all.iterator();
			while(i.hasNext()){
				System.out.println(i.next());
			}
		}
	}
}
