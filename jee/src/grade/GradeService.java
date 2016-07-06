package grade;

import java.sql.SQLException;
import java.util.List;

public interface GradeService {
	// 총 7개의 기본 패턴이 존재
	// exeU
	
	public String insert(GradeBean grade);
	public String update(GradeBean grade);
	public String delete(String delete); 
	public List<GradeBean> list();
	public List<GradeBean> findByID(String id);
	public GradeBean findBySeq(int seq);
	public int count (String findByDate);
	public String GradeCal(GradeBean grade);
}
