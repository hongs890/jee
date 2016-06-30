package grade;

public class GradeServiceImpl implements GradeService{

	GradeBean bean;
	
	@Override
	public void regist(String name, int kor, int eng, int math) {
		// 이름, 국어, 영어, 수학 
		bean = new GradeBean(name, kor, eng, math);
		if (bean.getKor() >= 100 || bean.getEng() >= 100 || bean.getMath() >= 100 || bean.getKor() < 0 || bean.getEng() < 0 || bean.getMath() < 0) {
			String error = "점수는 100점까지만 입력해주세요";
		}
	}

	@Override
	public int outSum() {
		// 합계
		return  bean.getKor() + bean.getEng() + bean.getMath();
	}

	
	@Override
	public int outAver() {
		// 평균
		return (outSum() / 3);
	}

	
	@Override
	public String outGrade() {
		// 등급
		String grade ="";
		switch (outAver()/ 10) {
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		case 5:
			grade = "E";
			break;
		}
		return grade;
	}

	@Override
	public String Result() {
		// 총결과 
		return "총점 :"+outSum()+"평균 : "+outAver()+"학점 : "+outGrade();
	}
}
