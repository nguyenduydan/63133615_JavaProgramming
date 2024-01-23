package Lab4Bai1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SanPham sp1 = new SanPham();
		SanPham sp2 = new SanPham();
		sp1.nhap();
		sp2.nhap();
		sp1.xuat();
		sp2.xuat();
		String tenSp = "Coca";
		double donGia = 10000;
		SanPham sp3 = new SanPham(tenSp,donGia);
		sp3.xuat();
	}

}