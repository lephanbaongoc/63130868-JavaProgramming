
public class SanPham {
	String TenSp;
	double donGia, giamGia;
	
	public SanPham(String TenSp, double donGia, double giamGia) {
		this.TenSp = TenSp;
		this.donGia = donGia;
		this.giamGia = giamGia;
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
		System.out.print("Nhập Tên sản phẩm: ");
		System.out.print("Nhập đơn giá sản phẩm: ");
		System.out.print("Nhập giảm giá sản phẩm: ");
	}
	
	public static void main(String[] args) {
		
	}
	
	public String getTenSp() {return TenSp;}
	public void setTenSp(String TenSp) {this.TenSp = TenSp;}
	
	public double getdonGia() {return donGia;}
	public void setdonGia(double donGia) {this.donGia = donGia;}
	
	public double getgiamGia() {return giamGia;}
	public void setgiamGia(double giamGia) {this.giamGia = giamGia;}
}

