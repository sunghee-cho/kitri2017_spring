package emp;
import java.util.List;

public class EmpServiceImpl {
	private EmpDAO empDAO;
	private EmpVO empVO;

	public void setEmpDAO(EmpDAO empDAO) {
		this.empDAO = empDAO;
	}
	public void setEmpVO(EmpVO empVO) {
		this.empVO = empVO;
	}
	public void insertEmp(EmpVO empVO){
		empDAO.insertEmp(empVO);
	}
	public List selectAllEmp(){
		return empDAO.selectAllEmp();
	}
}
