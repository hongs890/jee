package bank;

import java.util.Comparator;

/**
 * @date  : 2016. 7. 8.
 * @author: 배근홍
 * @file  : NameAscSort.java
 * @story  :
 */
public class NameAscSort implements Comparator<AccountMemberBean>{

	@Override
	public int compare(AccountMemberBean first, AccountMemberBean second) {
		return first.getName().compareTo(second.getName());
		
	}

}
