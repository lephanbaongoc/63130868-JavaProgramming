
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SanPham sp = new SanPham("Áo khoác",250000);
		SanPham sp1 = new SanPham();
		SanPham sp2 = new SanPham();
		
		System.out.print("Nhập thông tin sản phẩm 1: \n");
		sp1.Nhap();
		System.out.print("\nNhập thông tin sản phẩm 2: \n");
		sp2.Nhap();
		
		System.out.print("\n\nThông tin của sản phẩm ko có giảm giá: \n");
		sp.Xuat();
		System.out.print("\n\nThông tin của sản phẩm 1: \n");
		sp1.Xuat();
		System.out.print("\n\nThông tin của sản phẩm 2: \n");
		sp2.Xuat();
		
	}

}
