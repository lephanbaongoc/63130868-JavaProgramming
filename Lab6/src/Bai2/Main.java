package Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<SanPham> ls = new ArrayList<SanPham>();
		Scanner s = new Scanner(System.in);
		
		System.out.print("Nhập số lượng sản phẩm: ");
		int n = s.nextInt();
		for(int i = 0; i<n; i++) {
			SanPham sp = new SanPham();
			sp.nhap();
			ls.add(sp);
		}
		System.out.print("\nDanh sách sản phẩm:\n");
		for(var sp : ls) {
			sp.xuat();
		}
	}

}
