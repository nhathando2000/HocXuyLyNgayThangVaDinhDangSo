package donguyennhathan.com;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class TestDinhDangSymbols {

	public static void main(String[] args) {
		int x= 1234567890;
		
		DecimalFormat dcf= new DecimalFormat("#,###");
		//Lấy symbols định dạng số mặc định của khu vực bạn đang sống
		DecimalFormatSymbols dcfs= new DecimalFormatSymbols(Locale.getDefault());
		
//		dcfs.setGroupingSeparator('.');     
		dcf.setDecimalFormatSymbols(dcfs);
		
		System.out.println("x= "+ x);
		System.out.println("x= "+ dcf.format(x));
	}

}
