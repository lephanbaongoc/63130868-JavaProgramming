
import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Đọc dữ diệu 2 cạnh từ bàn phím
		Scanner s = new Scanner(System.in);
		System.out.print("Nhập chiều dài: ");
		float dai = s.nextFloat();
		System.out.print("Nhập chiều rong: ");
		float rong = s.nextFloat();
		
		//Tính toán
		float ChuVi = (dai + rong) * 2;
		float DienTich = dai * rong;
		float CanhNN = Math.min(dai,rong);
		
		//In ra Chu vi và Diện tích
		System.out.printf("Chu vi : %.3f\nDiện tích: %.3f",ChuVi,DienTich);
		System.out.printf("\nCạnh nhỏ nhất là : %f",CanhNN);
	}

}
