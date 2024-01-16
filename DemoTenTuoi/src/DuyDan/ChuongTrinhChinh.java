package DuyDan;
import java.util.Scanner;

public class ChuongTrinhChinh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int namSinh;
		String hoTen;
		Scanner banphim = new Scanner(System.in);
		
		System.out.print("Họ và tên: ");
		hoTen = banphim.nextLine(); 
		
		System.out.print("Năm sinh: ");
		namSinh = banphim.nextInt(); 
		
		int tuoi = 2024 - namSinh + 1;
		
		System.out.printf("Tuổi: %d",tuoi);
	}

}
