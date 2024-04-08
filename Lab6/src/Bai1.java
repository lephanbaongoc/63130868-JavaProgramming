import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Nhập họ tên từ bàn phím: ");
		String hovaten = s.nextLine();
		
		//Tìm vị trí khoảng trống đầu tiên trong chuỗi
		int x = hovaten.indexOf(" ");
		//Tìm vị trí khoảng trống cuối cùng trong chuỗi
		int y = hovaten.lastIndexOf(" ");
		
		//In hoa họ và tên
		String ho = hovaten.substring(0,x).toUpperCase();
		
		String ten = hovaten.substring(y,hovaten.length()).toUpperCase();
		
		String tendem = hovaten.substring(x,y);
		//In chuỗi
		System.out.println(ho + tendem + ten);
	}

}
