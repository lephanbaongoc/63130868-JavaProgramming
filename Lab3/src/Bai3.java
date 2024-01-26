import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Nhập mảng từ bàn phím
		Scanner s = new Scanner(System.in);
		System.out.print("Nhập số phần tử trong mảng: ");
		int n = s.nextInt();
		
		System.out.print("Nhập từng phần tử trong mảng:\n");
		int[] A = new int[n];
		for(int i=0; i<n;i++) {
			System.out.printf("A[%d] = ",i);
			A[i] = s.nextInt();
		}
		
		//In mảng
		System.out.print("\nIn mảng:\n");
		for(int i=0; i<n; i++) {
			System.out.printf("%d\t",A[i]);
		}
		
		//Sắp xếp mảng
		System.out.print("\nIn mảng sau khi sắp xếp:\n");
		Arrays.sort(A);
		for(int i=0; i<n; i++) {
			System.out.printf("%d\t",A[i]);
		}
		
		//Tìm số nhỏ nhất
		int m = A[0];
		for(int i=0; i<n; i++) {
			m = Math.min(m, A[i]);
		}
		System.out.printf("\nSố nhỏ nhất trong mảng là %d",m);
		
		//Tính trung bình cộng các số chia hết cho 3
		int T = 0;//Tổng
		int dem = 0;//biến đếm
		for(int i=0; i<n; i++) {
			if(A[i]%3==0) {
				T = T+A[i];
				dem = dem+1;
			}
		}
		System.out.printf("\nTrung bình cộng các số chia hết cho 3 là %.3f", (float)T/dem);
	}

}
