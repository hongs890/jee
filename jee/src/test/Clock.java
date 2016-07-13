package test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @date  : 2016. 7. 13.
 * @author: 배근홍
 * @file  : Clock.java
 * @story  :
 */
public class Clock {
	
	public String now(){
	
		return new SimpleDateFormat("HH시 mm분 ss초").format(new Date());
	}

}
