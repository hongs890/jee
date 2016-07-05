package grade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import global.Constants;
import global.Database;
import global.DatabaseFactory;
import global.Vendor;

/**
 * @date  : 2016. 7. 1.
 * @author: 배근홍
 * @file  : GradeDAO.java
 * @story  :
 */

/*
 * 	public GradeBean(String name, int kor, int eng, int math) {
	this.name = name;
	this.kor = kor;
	this.eng = eng;
	this.math = math;
 * */
public class GradeDAO {
		Connection con;
		Statement stmt;
		ResultSet rs;
		PreparedStatement pstmt;
		private static GradeDAO instance = new GradeDAO();
		private GradeDAO() {
			con = DatabaseFactory.createDatabase(Vendor.ORACLE, 
					Constants.USER_ID, 
					Constants.USER_PW).getConnection();
		}
		
		public static GradeDAO getInstance() {
			return instance;
		}
	// 생성
	public int insert(GradeBean grade) {
		int result = 0;
		String sql = "insert into grade(seq, grade, java, sql, html, javascript, id, exam_date)"
	+ "values(seq.nextval,?,?,?,?,?,?,?)";
		try {
			Class.forName(Constants.ORACLE_DRIVER);
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, grade.getGrade());
			pstmt.setInt(2, grade.getJava());
			pstmt.setInt(3, grade.getSql());
			pstmt.setInt(4, grade.getHtml());
			pstmt.setInt(5, grade.getJavascript());
			pstmt.setString(6, grade.getId());
			pstmt.setString(7, grade.getExamDate());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	// 수정
	public int update(GradeBean grade){
		String sql = "update grade set "+grade.getType()+" = "+Integer.parseInt(grade.getScore())+" where seq = "+Integer.parseInt(grade.getSeq())+"";
		this.exeUpdate(sql);
		grade = findBySeq(Integer.parseInt(grade.getSeq()));
		int sum = grade.getHtml() + grade.getJava() + grade.getJavascript() + grade.getSql();
		int ave = sum / 4;
		String gradeRank="";
		switch (ave/10) {
		case 9:	gradeRank = "A";break;
		case 8:	gradeRank = "B";break;
		case 7:	gradeRank = "C";break;
		case 6:	gradeRank = "D";break;
		case 5:	gradeRank = "F";break;
		}
		grade.setGrade(gradeRank);
		String sql2 = "update grade set grade = '"+grade.getGrade()+"' where seq = "+grade.getSeq()+"";
		return this.exeUpdate(sql2);
	}
	
	
	// 삭제
	public int delete(String delete) {
		String sql = "delete from grade where seq = '"+delete+"'";
		return this.exeUpdate(sql);
	}
	public int exeUpdate(String sql){
		int result = 0;
		try {
			Class.forName(Constants.ORACLE_DRIVER);
			con = DriverManager.getConnection(Constants.ORACLE_URL, 
										Constants.USER_ID, 
										Constants.USER_PW);
			stmt = con.createStatement();
			result = stmt.executeUpdate(sql);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (result == 0) {
			System.out.println("성공");
		} else {
			System.out.println("실패");
		}
		return result;
	}
	//목록
	public List<GradeBean> list() {
		String sql = "select * from grade";
		List<GradeBean> list = new ArrayList<GradeBean>();
		try {
			Class.forName(Constants.ORACLE_DRIVER);
			con = DriverManager.getConnection(Constants.ORACLE_URL, Constants.USER_ID,
					Constants.USER_PW);
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()){
				GradeBean bean = new GradeBean(rs.getString("SEQ"), rs.getString("GRADE"), rs.getInt("JAVA"),
						rs.getInt("SQL"), rs.getInt("HTML"), rs.getInt("JAVASCRIPT"), rs.getString("ID"), rs.getString("EXAM_DATE"));
				list.add(bean);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	//seq로 검색
	public GradeBean findBySeq(int seq) {
		String sql = "select * from grade where seq ="+seq+"";
		GradeBean temp = null;
		try {
			Class.forName(Constants.ORACLE_DRIVER);
			con = DriverManager.getConnection(Constants.ORACLE_URL,
					Constants.USER_ID, Constants.USER_PW);
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
				if (rs.next()) {
					temp = new GradeBean(rs.getString("SEQ"), rs.getString("GRADE"), rs.getInt("JAVA"),
						rs.getInt("SQL"), rs.getInt("HTML"), rs.getInt("JAVASCRIPT"), rs.getString("ID"), rs.getString("EXAM_DATE"));
				}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}
	
	public List<GradeBean> findByID(String id) {
		String sql = "select * from grade where id = '"+id+"'";
		List<GradeBean> list = new ArrayList<GradeBean>();
		try {
			Class.forName(Constants.ORACLE_DRIVER);
			con = DriverManager.getConnection(Constants.ORACLE_URL,
					Constants.USER_ID, Constants.USER_PW);
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()){
				GradeBean bean2 = new GradeBean(rs.getString("SEQ"), rs.getString("GRADE"), rs.getInt("JAVA"),
						rs.getInt("SQL"), rs.getInt("HTML"), rs.getInt("JAVASCRIPT"), rs.getString("ID"), rs.getString("EXAM_DATE"));
				list.add(bean2);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
	public int count(String findByDate){
		int count = 0;
		String sql ="select count(*) as count from grade where exam_date='"+findByDate+"'";
			try {
				Class.forName(Constants.ORACLE_DRIVER);
				con = DriverManager.getConnection(Constants.ORACLE_URL,
						Constants.USER_ID, Constants.USER_PW);
				stmt = con.createStatement();
				rs = stmt.executeQuery(sql);
				if (rs.next()) {
					count = rs.getInt("count");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		return count;
	}
}
