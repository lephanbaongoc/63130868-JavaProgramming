package Bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Menu {
	Scanner s = new Scanner(System.in);
	ArrayList<String> ls = new ArrayList<String>();
	
	public void Nhap() {
		System.out.print("Nhập danh sách họ và tên: ");
		
		while(true) {
			System.out.print("\nNhập họ và tên: ");
			String ten = s.next();
			ls.add(ten);
			
			System.out.print("\nNhập thêm (Y/N)? ");
			if(s.next().equals("N")) {
				break;
			}
		}
	}
	
	public void Xuat() {
		for(String ten : ls) {
			System.out.println(ten);
		}
	}
	
	public void SapXep() {
		Collections.sort(ls);//Sắp xếp tăng dần
		//Collections.reverse(ls);//Đảo ngược
	}
	
	public void NgauNhien() {
		Collections.shuffle(ls);
	}
	
	public void Xoa() {
		System.out.print("\nNhập tên cần xóa trong danh sách: ");
		String x = s.next();
		for(String ten : ls) {
			if(ten.equals(x)) {
				ls.remove(ten);
				break;
			}
		}
		System.out.printf("\n\nDANH SÁCH HỌ VÀ TÊN SAU KHI XÓA '%s': \n",x);
	}
}
