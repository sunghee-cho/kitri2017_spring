package emp.annotation;
import java.util.List;
//EmpTest 요청 가능 기능 2개
public interface EmpService {
	public void insertEmp(EmpVO empVO);
	public List selectAllEmp();
}
