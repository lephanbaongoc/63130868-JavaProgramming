import java.util.ArrayList;
import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Double S = 0.0;
		Scanner s = new Scanner(System.in);
		ArrayList<Double> ls = new ArrayList<Double>();
		
		System.out.print("Nhập ds số thực từ bàn phím: \n");
		
		while(true) {
			System.out.print("\nNhập số thực: ");
			Double x = s.nextDouble();
			ls.add(x);
			
			System.out.print("Nhập thêm (Y/N)? ");
			if(s.next().equals("N")) {
				break;
			}
		}
		
		System.out.print("\nDANH SÁCH CÁC SỐ THỰC:\n");
		for(Double x : ls){
			System.out.println(x);
			S += x;
		}
		System.out.print("Tổng các số thực là: " + S);
	}

}
