package Lab4Bai1;
import java.util.*;

public class SanPham {
	private String tenSp;
	private double donGia;
	private double giamGia;
	
	public SanPham() {
		tenSp = "Coca";
		donGia = 10000.0;
		giamGia = 2000.0;
	}
	public SanPham (String tenSp, double donGia, double giamGia) {
		this.tenSp = tenSp;
		this.donGia = donGia;
		this.giamGia = giamGia;
	}
	
	public SanPham(String tenSp, double donGia) {
		this(tenSp,donGia,0);
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập tên sản phẩm: ");
		tenSp = sc.nextLine();
		System.out.print("Nhập đơn giá sản phẩm: ");
		donGia = sc.nextDouble();
		System.out.print("Nhập giảm giá sản phẩm: ");
		giamGia = sc.nextDouble();
	}
	public void xuat() {
		System.out.println("Tên sản phẩm: "+tenSp);
		System.out.println("Đơn giá: "+donGia);
		System.out.println("Giảm giá: "+giamGia);
		System.out.println("Thuế nhập khẩu: "+getThueNhapKhau());
	}
	
	private double getThueNhapKhau() {
		return 0.1 * donGia;
	}
	public String getTenSp() {
		return tenSp;
	}
	public void setTenSp(String tenSp) {
		this.tenSp = tenSp;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public double getGiamGia() {
		return giamGia;
	}
	public void setGiamGia(double giamGia) {
		this.giamGia = giamGia;
	}
	
}
