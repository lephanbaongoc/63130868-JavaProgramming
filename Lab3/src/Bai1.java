import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Nhập số từ bàn phím
		Scanner s = new Scanner(System.in);
		System.out.print("Nhập một số nguyên bất kì: ");
		int n = s.nextInt();
		
		//Kiểm tra số nguyên tố
		boolean ok = true;
		for(int i=2; i<n-1; i++) {
			if(n%i==0) {
				ok = false;
				break;
			}
		}
		
		//kiểm tra biến ok
		if(ok == false) System.out.printf("%d không phải là số nguyên tố",n);
		else System.out.printf("%d là số nguyên tố",n);
	}

}
