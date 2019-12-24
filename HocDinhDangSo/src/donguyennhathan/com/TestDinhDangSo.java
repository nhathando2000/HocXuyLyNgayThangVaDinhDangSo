package donguyennhathan.com;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TestDinhDangSo {

	public static void main(String[] args) {
		//
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Mời bạn nhập điểm toán: ");
		double a= sc.nextDouble();
		System.out.println("Mời bạn nhập điểm lý ");
		double b= sc.nextDouble();
		System.out.println("Mời bạn nhập điểm hóa: ");
		double c= sc.nextDouble();
		System.out.println("Điểm trung bình của bạn là: ");
		double dtb= (a+b+c)/3;
		
		DecimalFormat dcf= new DecimalFormat("#.###");
		
		
		System.out.println("dtb= "+dtb);
		System.out.println("dtb= "+dcf.format(dtb));
	}

}
