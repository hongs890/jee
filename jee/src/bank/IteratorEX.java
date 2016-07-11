package bank;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @date  : 2016. 7. 8.
 * @author: 배근홍
 * @file  : IteratorEX.java
 * @story  :
 */
public class IteratorEX {
	public static void main(String[] args) {
		Map<?,?> map = new HashMap<String,AccountMemberBean>();
		AccountDAO dao = AccountDAO.getDao();
		map = dao.selectMap();
		Set<?> keyset = map.keySet();
		Iterator<?> it = keyset.iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			System.out.println(map.get(key));
		}
		
		Collection<?> accounts = map.values();
		it = accounts.iterator();
		List<AccountMemberBean> list = new ArrayList<AccountMemberBean>();
		while (it.hasNext()) {
			AccountMemberBean obj = (AccountMemberBean) it.next();
				list.add(obj);
		}
		/*System.out.println(list);*/
		Collections.sort(list, new NameAscSort());
		System.out.println(list);
		System.out.println();
		Collections.sort(list, new AccountNumberSort());
		System.out.println(list);
	}
		
}
