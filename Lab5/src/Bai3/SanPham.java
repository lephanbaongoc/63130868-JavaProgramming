package Bai3;

public class SanPham {
	public String Name;
	public Double Price;
	
	public SanPham() {
		
	}
	public SanPham(String Name, double Price) {
		this.Name = Name;
		this.Price = Price;
	}
	public String getName() {
		return Name;
	}
	public Double getPrice() {
		return Price;
	}
	public void setName(String name) {
		Name = name;
	}
	public void setPrice(Double price) {
		Price = price;
	}

}
