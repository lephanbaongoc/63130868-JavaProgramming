import java.util.Scanner;

public class Bai4 {

	public static int Menu() {
		//In menu
		System.out.println("+---------------------------------------------------+");
		System.out.println("1. Giải phương trình bậc nhất");
		System.out.println("2. Giải phương trình bậc 2");
		System.out.println("3. Tính tiền điện");
		System.out.println("4. Kết thúc");
		System.out.println("+---------------------------------------------------+");
		
		int x;
		Scanner s = new Scanner(System.in);
		do {
			System.out.print("Chọn chức năng (1-4): ");
		x = s.nextInt();
		}while(x < 1 || x > 4);
		
		return x;
	}
	public static void GiaiPTB1() {
		Bai1 b1 = new Bai1();
		b1.main(null);
	}
	public static void GiaiPTB2() {
		Bai2 b2 = new Bai2();
		b2.main(null);
	}
	public static void tinhTienDien() {
		Bai3 b3 = new Bai3();
		b3.main(null);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		switch (Menu()) {
			case 1:
				Bai4.GiaiPTB1();
				break;
			case 2:
				Bai4.GiaiPTB2();
				break;
			case 3:
				Bai4.tinhTienDien();
				break;
			case 4:
				System.out.print("Kết thúc chương trình");
		}
		
	}

}
