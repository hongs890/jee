package grade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import global.Constants;

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
		
		private static GradeDAO instance = new GradeDAO();
		private GradeDAO() {}
		
		public static GradeDAO getInstance() {
			return instance;
		}
	// 생성
	public int insert(GradeBean grade) {
		String sql = "insert into grade(seq, grade, java, sql, html, javascript, id, exam_date)"
	+ "values(seq.nextval,'"+grade.getGrade()+"',"+ grade.getJava()+","
				+grade.getSql()+","+ grade.getHtml() + "," 
				+ grade.getJavascript() + ", '" + grade.getId() +"','"
				+grade.getExamDate()+"')";
		return this.exeUpdate(sql);
	}
	// 수정
	public int update(GradeBean grade){
		String sql = "update grade set "+grade.getType()+" = "+Integer.parseInt(grade.getScore())+" where seq = "+Integer.parseInt(grade.getSeq())+"";
		String sql2 = "update grade set grade = "+null+" where seq = "+grade.getSeq()+"";
		this.exeUpdate(sql2);
		return this.exeUpdate(sql);
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
										Constants.ORACLE_ID, 
										Constants.ORACLE_PW);
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
			con = DriverManager.getConnection(Constants.ORACLE_URL, Constants.ORACLE_ID,
					Constants.ORACLE_PW);
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
					Constants.ORACLE_ID, Constants.ORACLE_PW);
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
					Constants.ORACLE_ID, Constants.ORACLE_PW);
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
						Constants.ORACLE_ID, Constants.ORACLE_PW);
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
