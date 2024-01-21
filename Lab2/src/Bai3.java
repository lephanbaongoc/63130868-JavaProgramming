import java.util.Scanner;

public class Bai3 {

	public void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.print("Nhập vào số điện sử dụng: ");
		int dien = s.nextInt();
		int Tien;
		if(dien > 0 && dien <= 50) {
			Tien = dien * 1000;
		}
		else {
			Tien = 50 * 1000 + (dien - 50) * 1200;
		}
		
		//In ra tiền điện
		System.out.printf("Tiền điện phải trả là: %d", Tien);
	}

}
