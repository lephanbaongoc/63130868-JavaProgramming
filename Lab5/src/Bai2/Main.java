package Bai2;

public class Main {
	public static void menu() {
		Menu m = new Menu();
		
		m.Nhap();
		System.out.print("\n\nDANH SÁCH HỌ VÀ TÊN: \n");
		m.Xuat();
		System.out.print("\n\nDANH SÁCH HỌ VÀ TÊN SAU KHI SẮP XẾP: \n");
		m.SapXep();
		m.Xuat();
		System.out.print("\n\nDANH SÁCH HỌ VÀ TÊN NGẪU NHIÊN: \n");
		m.NgauNhien();
		m.Xuat();
		//Xóa tên
		m.Xoa();
		m.Xuat();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();
	}

}
