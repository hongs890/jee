/**
 * 
 */
package member;

import java.util.List;

import global.CommonService;

/**
 * @date  : 2016. 6. 17.
 * @author: 배근홍
 * @file  : StudentService.java
 * @story :
 */
public interface MemberService extends CommonService{
	public String regist(MemberBean mem);
	public String update(MemberBean mem);
	public String delete(String id);
	public MemberBean findById(String id);
	public String login(MemberBean member);
}
