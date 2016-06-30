package grade;

public interface GradeService {

	
	public abstract void regist(String name, int kor, int eng, int math);
	public int outSum();
	public int outAver();
	public String outGrade();
	public String Result();
	
}
