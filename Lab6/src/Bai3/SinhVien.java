package Bai3;

import java.util.Scanner;

public class SinhVien {
	String ten,email,sdt,cmnd;
	public SinhVien() {
		// TODO Auto-generated constructor stub
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public String getCmnd() {
		return cmnd;
	}
	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}
	public void nhap() {
		Scanner s = new Scanner(System.in);
		System.out.println("Nhập thông tin sinh viên: ");
		System.out.print("Nhập tên SV: ");
		ten = s.next();
		System.out.print("Nhập email SV: ");
		email = s.next();
		System.out.print("Nhập sdt SV: ");
		sdt = s.next();
		System.out.print("Nhập cmnd SV: ");
		cmnd = s.next();
	}
	public void xuat() {
		System.out.println("Tên: " + ten + "\t"
				+ "Email" + email + "\t"
				+ "Sđt: " + sdt + "\t"
				+ "Cmnd: " + cmnd);
	}
}
