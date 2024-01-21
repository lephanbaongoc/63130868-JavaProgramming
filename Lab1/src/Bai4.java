
import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Nhập hệ số của phương trình bậc 2
		Scanner s = new Scanner(System.in);
		System.out.println("Nhập hệ số của PTB2 ax^2 + bx + c = 0");
		System.out.print("Nhập a: ");
		float a = s.nextFloat();
		System.out.print("Nhập b: ");
		float b = s.nextFloat();
		System.out.print("Nhập c: ");
		float c = s.nextFloat();
		
		//Tính delta
		float Delta = (float) Math.pow(b, 2) - 4 * a * c;
		
		//Xuất căn Delta ra màn hình
		if(Delta>=0)
			System.out.printf("Căn Delta = %.3f",(float)Math.sqrt(Delta));
		else System.out.printf("Delta < 0 không thể tính căn bậc 2");
	}

}
