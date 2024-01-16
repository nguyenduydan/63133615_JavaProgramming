package DuyDan;
import java.util.Scanner;

public class ChuongTrinhChinh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int namSinh;
		String hoTen;
		Scanner banphim = new Scanner(System.in);
		
		System.out.print("Nhập họ và tên: ");
		hoTen = banphim.nextLine();
		System.out.print("Nhập năm sinh: ");
		namSinh = banphim.nextInt();
		
		int tuoi = 2024 - namSinh;
		
		System.out.println("Họ và tên: " + hoTen);
		System.out.println("Tuổi: "+ tuoi );
	}

}
