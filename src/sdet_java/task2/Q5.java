package sdet_java.task2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Q5 {
	public static void main(String[] args) throws Exception{
		String time1 = "12:00:00";
		String time2 = "13:01:10";
 
		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
		Date date1 = format.parse(time1);
		Date date2 = format.parse(time2);
		long difference = date2.getTime() - date1.getTime();
		 
		 
		 long diffSeconds = difference / 1000 % 60;
		 long diffMinutes = difference / (60 * 1000) % 60;
		 long diffHours = difference / (60 * 60 * 1000) % 24;
		 long diffDays = difference / (24 * 60 * 60 * 1000);
	
		 System.out.print(diffDays + " days, " +diffHours + " hours, "+diffMinutes + " minutes, "+diffSeconds + " seconds.");
	}
}