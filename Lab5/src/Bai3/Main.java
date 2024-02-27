package Bai3;

public class Main {
	public static void menu() {
Menu m = new Menu();
		
		m.Nhap();
		System.out.print("\n\nDANH SÁCH SẢN PHẨM: \n");
		m.Xuat();
		System.out.print("\n\nDANH SÁCH SẢN PHẨM SAU KHI SẮP XẾP: \n");
		m.SapXep();
		m.Xuat();
		
		//Xóa tên
		m.Xoa();
		m.Xuat();
		
		System.out.printf("\n\nGIÁ TRUNG BÌNH CỦA CÁC SẢN PHẨM = %.3f",m.TrungBinh());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		menu();
	}

}
