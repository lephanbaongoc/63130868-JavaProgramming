package Bai2;

import java.util.Scanner;

public class SanPham {
	String tenSp, hang;
	double donGia;
	
	public SanPham() {
	}
	
	public void setTenSp(String tenSp) {
		this.tenSp = tenSp;
	}
	public String getTenSp() {
		return tenSp;
	}
	
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	
	public double getDonGia() {
		return donGia;
	}
	
	public void setHang(String hang) {
		this.hang = hang;
	}
	public String getHang() {
		return hang;
	}
	
	public void nhap() {
		Scanner s = new Scanner(System.in);
		System.out.println("\nNhập thông tin sản phẩm: ");
		System.out.print("Nhập tên sp: ");
		tenSp = s.next();
		System.out.print("Nhập đơn giá sp: ");
		donGia = s.nextDouble();
		System.out.print("Nhập hãng sp: ");
		hang = s.next();
	}
	
	public void xuat() {
		System.out.println("Tên sp: " + tenSp + "\t" 
						+ "Đơn giá: " + donGia + "\t" 
						+ "Hãng: " + hang);
	}
}
