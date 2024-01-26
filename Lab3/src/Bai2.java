import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Nhập số từ bàn phím
		Scanner s = new Scanner(System.in);
		System.out.print("Nhập n để in ra bảng cửu chương: ");
		int n = s.nextInt();
		
		//In bảng cửu chương
		for(int i = 1; i<=n; i++) {
			System.out.printf("BẢNG CỬU CHƯƠNG %d:\n",i);
			
			for(int j = 1; j<=10; j++) {
				System.out.printf("%d * %d = %d\n",i,j,i*j);
			}
			System.out.println();
		}
	}

}
