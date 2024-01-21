
import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Nhập cạnh của khối lập phương từ bàn phím
		Scanner s = new Scanner(System.in);
		System.out.print("Nhập cạnh của khối lập phương: ");
		float Canh = s.nextFloat();
		
		//Tính Thể tích
		float V = Canh * Canh * Canh;
		
		//In ra màn hình
		System.out.printf("Thể tích khối lập phương là: %.3f",V);
	}

}
