package libdemo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		Date d = new Date();
		
		System.out.println(d.toString());
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(df.format(d));
		DateFormat tf = DateFormat.getTimeInstance(DateFormat.FULL);
		System.out.println(tf.format(d));
		
		SimpleDateFormat sdf = new SimpleDateFormat("d-MM-yyyy hh:mm:ss");
		System.out.println(sdf.format(d));
		
	}

}
