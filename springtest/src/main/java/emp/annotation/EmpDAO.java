package emp.annotation;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;


public class EmpDAO {
	List<EmpVO> list ; 
 	public void setList(List<EmpVO> list){	
		this.list = list;
	}

	public void insertEmp(EmpVO empVO){
		System.out.println(empVO + " 를 저장 예정입니다");
		//jdbc emplolyees 테이블 저장
	}
	public List<EmpVO> selectAllEmp(){
		//jdbc emplolyees 테이블 select rs-->list 복사 
		return list;
	}
}
