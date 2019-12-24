package donguyennhathan.com;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestNgayThangNam {

	public static void main(String[] args) {
		Calendar cal= Calendar.getInstance();
		int year= cal.get(Calendar.YEAR);
		System.out.println("year= "+year);
		//Vì tháng trong java đi từ 0-11
		int month= cal.get(Calendar.MONTH)+1;
		System.out.println("month= "+month);
		int day= cal.get(Calendar.DAY_OF_MONTH);
		System.out.println("day= "+day);
		
		Date t= cal.getTime();
		//SimpleDateFormat thuộc thư viên java.text
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Date: "+sdf.format(t));
		
		//HH là định dạng 24h
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println("Date: "+sdf2.format(t));

		// hh là định dạng 12h
		SimpleDateFormat sdf3= new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		System.out.println("Date3: "+sdf3.format(t));
		
		//aaa là AM và PM
		SimpleDateFormat sdf4= new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aaa");
		System.out.println("Date3: "+sdf4.format(t));
	}

}
