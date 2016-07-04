package grade;

import java.util.List;

public interface GradeService {
	// 총 7개의 기본 패턴이 존재
	// exeU
	
	public int insert(GradeBean grade);
	public int update(GradeBean grade);
	public int delete(GradeBean grade); // 아이디와 비밀번호가 일치해야 삭제됨
	// exeQ
	public List<GradeBean> list();
	public List<GradeBean> findByHakjum(String hakjum);
	public GradeBean findBySeq(int seq);
	public int count ();
}
