import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Nhập mảng họ tên và điểm của sinh viên
		Scanner s = new Scanner(System.in);
		//Nhập số lượng sinh viên
		System.out.print("Nhập số lượng sinh viên: ");
		int n = s.nextInt();
		
		//Nhập tên sinh viên và điểm
		String[] Name = new String[n];
		float[] Score = new float[n];
		for(int i=0;i<n;i++) {
			System.out.printf("Name[%d] = ",i);
			Name[i] = s.next();
			System.out.printf("Score[%d] = ",i);
			Score[i] = s.nextFloat();
		}
		
		//In ds sv và điểm
		System.out.println("\nDANH SÁCH SINH VIÊN:");
		for(int i=0;i<n;i++) {
			System.out.printf("%s: %.2f --> ",Name[i], Score[i]);
			//Xét học lực
			if(Score[i]<5) System.out.print("Học lực yếu\n");
			else if(Score[i]>=5 && Score[i]<6.5) System.out.print("Học lực trung bình\n");
			else if(Score[i]>=6.5 && Score[i]<7.5)System.out.print("Học lực khá\n");
			else if(Score[i]>=7.5 && Score[i]<9) System.out.print("Học lực giỏi\n");
			else System.out.print("Học lực xuất sắc\n");
		}
		
		//Sắp xếp ds tăng dần
		float temp;
		String temp_;
		
		for(int i=0;i<n-1;i++) {
			if(Score[i]>Score[i+1]) {
				temp = Score[i];		temp_ = Name[i];
				Score[i] = Score[i+1];	Name[i] = Name[i+1];
				Score[i+1] = temp;		Name[i+1] = temp_;
			}
		}
		

		//In ds sv và điểm
		System.out.println("\nDANH SÁCH SINH VIÊN SAU KHI SẮP XẾP THEO THỨ TỰ TĂNG DẦN:");
		for(int i=0;i<n;i++) {
			System.out.printf("%s: %.2f --> ",Name[i], Score[i]);
			//Xét học lực
			if(Score[i]<5) System.out.print("Học lực yếu\n");
			else if(Score[i]>=5 && Score[i]<6.5) System.out.print("Học lực trung bình\n");
			else if(Score[i]>=6.5 && Score[i]<7.5)System.out.print("Học lực khá\n");
			else if(Score[i]>=7.5 && Score[i]<9) System.out.print("Học lực giỏi\n");
			else System.out.print("Học lực xuất sắc\n");
		}

	}

}
