package Automate;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Date_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Date d=new Date();
//		SimpleDateFormat sdf=new SimpleDateFormat("d/mm/yyyy HH:mm:ss");
//		System.out.println(sdf.format(d));	
//		System.out.println(d.toString());
//		
		
		//using calenderclass
		
		Calendar cal=Calendar.getInstance();
		SimpleDateFormat sd=new SimpleDateFormat("d/mm/yyyy HH:mm:ss");
		System.out.println(sd.format(cal.getTime()));
		System.out.println(sd.format(cal.get(Calendar.DAY_OF_WEEK)));
		System.out.println(sd.format(cal.get(Calendar.DAY_OF_MONTH)));
		System.out.println(sd.format(cal.DAY_OF_WEEK));
		
		
	}

}
