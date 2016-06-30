package grade;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * @date : 2016. 6. 8.
 * @author: 배근홍
 * @file : Avg.java
 * @story :
 */
public class GradeController {
	/**
	 * 클라이언트에서 프로그램 개발 요청이 왔습니다. 이름과 국,영,수 세과목점수를 입력받아서 [홍길동 : 총점 ***점, 평균***점,
	 * 학점 : F] 을 출력하는 프로그램을 만들어 주세요. 단, 평균은 소수점이하는 절삭합니다. 평균점수가 90점 이상이면 A,
	 * 80이상이면 B, 70 이상이면 C 60점 이상이면 D, 50점 이상이면 E, 50점 미만이면 F 학점입니다 라고 출력되게
	 * 해주세요. [단] switch-case 문으로 해결하세요.
	 */
	public static void main(String[] args) {
		// ---------------------- 변수 선언부, 준비, 초기화(init) ------
		GradeService service = new GradeServiceImpl();
	
		// -------------------------- 연산부 (알고리즘)------------------------------
		while (true) {
			switch (JOptionPane.showInputDialog("1. 입력 2.조회 0.종료")) {
			case "1":
				String insert1 = JOptionPane.showInputDialog("이름,국어,영어,수학");
				String[] insert2 = insert1.split(",");
				service.regist(insert2[0], Integer.parseInt(insert2[1]), Integer.parseInt(insert2[2]), Integer.parseInt(insert2[3]));
				break;
			case "2":
				JOptionPane.showMessageDialog(null, service.Result());
				break;
			case "0":return;
			}
		}
	}
}
