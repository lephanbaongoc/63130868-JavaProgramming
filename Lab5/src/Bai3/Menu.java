package Bai3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Menu {
	Scanner s = new Scanner(System.in);
	ArrayList<SanPham> ls = new ArrayList<>();
	Comparator<SanPham> comp = new Comparator<SanPham>() {
		@Override
		public int compare(SanPham o1, SanPham o2) {
			return o1.Price.compareTo(o2.Price);
		}
	};
	
	public void Nhap() {
		System.out.print("NHẬP DANH SÁCH SẢN PHẨM: ");
		while(true) {
			System.out.print("\nNhập sản phẩm: ");
			String n = s.next();
			System.out.print("\nNhập giá sản phẩm: ");
			Double p = s.nextDouble();
			ls.add(new SanPham(n,p));
			
			System.out.print("\nNhập thêm SP (Y/N)?");
			if(s.next().equals("N"))
				break;
		}
	}
	
	public void Xuat() {
		for(SanPham sp : ls)
			System.out.println(sp.Name + "\t" + sp.Price);
	}
	
	public void SapXep() {
		Collections.sort(ls,comp);//Sắp xếp
		Collections.reverse(ls);//Đảo ngược
	}
	
	public void Xoa() {
		System.out.print("\nNhập tên sp cần xóa: ");
		String x = s.next();
		for(SanPham sp : ls) {
			if(sp.Name.equals(x)) {
				ls.remove(sp);
				break;
			}
		}
		System.out.printf("\n\nDANH SÁCH SẢN PHẨM SAU KHI XÓA '%s'\n: ",x);
	}
	
	public Double TrungBinh() {
		Double S = 0.0;
		for(SanPham sp : ls) {
			S += sp.Price;
		}
		return S/ls.size();
	}
}
