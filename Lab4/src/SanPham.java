import java.util.Scanner;

public class SanPham {
	private String TenSp;
	private double donGia, giamGia;

	public SanPham() {

	}

	public SanPham(String TenSp, double donGia, double giamGia) {
		this.TenSp = TenSp;
		this.donGia = donGia;
		this.giamGia = giamGia;
	}

	public SanPham(String TenSp, double donGia){
		this(TenSp, donGia, 0);
	}

	public double getThueNhapKhau() {
		return donGia*0.1;
	}
	public void Xuat() {
		System.out.print("Tên sản phẩm: " + TenSp + "\n" +
				"Đơn giá: " + donGia + "\n" +
				"Giảm giá: " + giamGia + "\n" +
				"Thuế nhập khẩu: " + getThueNhapKhau());
	}
	public void Nhap() {
		Scanner s = new Scanner(System.in);
		System.out.print("Nhập Tên sản phẩm: ");
		TenSp = s.next();
		System.out.print("Nhập đơn giá sản phẩm: ");
		donGia = s.nextDouble();
		System.out.print("Nhập giảm giá sản phẩm: ");
		giamGia = s.nextDouble();
	}

	public String getTenSp() {
		return TenSp;
	}
	public double getDonGia() {
		return donGia;
	}
	public double getGiamGia() {
		return giamGia;
	}
	public void setTenSp(String tenSp) {
		TenSp = tenSp;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public void setGiamGia(double giamGia) {
		this.giamGia = giamGia;
	}
}

