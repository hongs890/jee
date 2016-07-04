package grade;

public class GradeBean {
	private int kor, eng, math, seq;
	private String hakjum, name;
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getHakjum() {
		return hakjum;
	}
	public void setHakjum(String hakjum) {
		this.hakjum = hakjum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "GradeBean [kor=" + kor + ", eng=" + eng + ", math=" + math + ", seq=" + seq + ", hakjum=" + hakjum
				+ ", name=" + name + "]";
	}
	
	
	
}
