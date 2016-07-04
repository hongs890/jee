/**
 * 
 */
package member;

import java.util.List;

/**
 * @date  : 2016. 6. 17.
 * @author: 배근홍
 * @file  : StudentService.java
 * @story :
 */
public interface MemberService {
	public String regist(MemberBean mem);
	public String show();
	public String update(MemberBean mem);
	public String delete(String id);
	public MemberBean findById(String id);
	public List<MemberBean> list();
	public List<MemberBean> findByName(String findName);
	public int count();
}
