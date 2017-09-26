package emp.annotation;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("empService")
public class EmpServiceImpl {
	
	@Autowired
	private EmpDAO empDAO;
	@Autowired
	@Qualifier("empVO")
	private EmpVO empVO;

/*	public void setEmpDAO(EmpDAO empDAO) {
		this.empDAO = empDAO;
	}
	public void setEmpVO(EmpVO empVO) {
		this.empVO = empVO;
	}*/
	public void insertEmp(EmpVO empVO){
		empDAO.insertEmp(empVO);
	}
	public List selectAllEmp(){
		return empDAO.selectAllEmp();
	}
}
