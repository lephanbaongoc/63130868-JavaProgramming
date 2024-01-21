
import java.util.Scanner;

public class Bai1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Đọc dữ liệu từ bàn phím
		Scanner scanner = new Scanner(System.in);
		System.out.print("Họ và tên: ");
		String hoten = scanner.nextLine();
		System.out.print("Điểm TB: ");
		double diemTB = scanner.nextDouble();
		
		//In ra màn hình
		System.out.printf("%s %f điểm", hoten, diemTB);
	}

}
