
import java.util.Scanner;

public class Bai1 {

	public void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Nhập hệ số của PTB1
		Scanner s = new Scanner(System.in);
		System.out.println("Nhập hệ số của PTB1 ax + b = 0: ");
		System.out.print("Nhập a: ");
		float a = s.nextFloat();
		System.out.print("Nhập b: ");
		float b = s.nextFloat();
		
		//Xét giá trị của a và b
		if(a == 0){
			if(b == 0) System.out.print("Phương trình có vô số nghiệm");
			else System.out.print("Phương trình vô nghiệm");
		}
		else System.out.printf("Phương trình có nghiệm x = %.3f", -b/a);
	}
}
