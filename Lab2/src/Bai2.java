import java.util.Scanner;

public class Bai2 {

	public void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Nhập hệ số của phương trình bậc 2
		Scanner s = new Scanner(System.in);
		System.out.println("Nhập hệ số của PTB2 ax^2 + bx + c = 0");
		System.out.print("Nhập a: ");
		float a = s.nextFloat();
		System.out.print("Nhập b: ");
		float b = s.nextFloat();
		System.out.print("Nhập c: ");
		float c = s.nextFloat();
		
		if(a == 0){
			if(b == 0) System.out.print("Phương trình có vô số nghiệm");
			else System.out.print("Phương trình vô nghiệm");
		}
		else {//a != 0
			//Tính delta
			float Delta = (float) Math.pow(b, 2) - 4 * a * c;
			//Biện luận theo Delta
			if(Delta < 0) System.out.print("Phương trình vô nghiệm");
			else if(Delta == 0) System.out.printf("Phương trình có nghiệm kép x = %.3f", -b / (2*a));
			else {//Delta>0
				System.out.printf("Phương trình có 2 nghiệm\n x1 = %.3f\n x2 = %.3f", (float)(-b+Math.sqrt(Delta)/(2*a)), (float)(-b-Math.sqrt(Delta)/(2*a)));
			}
		}
	}

}
