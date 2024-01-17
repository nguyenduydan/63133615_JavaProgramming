import java.util.Scanner;
public class Lab2Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int soDien;
		int tien=0;
		System.out.print("Nhập số điện: ");
		soDien = scanner.nextInt();
		if(soDien >= 0 && soDien <= 50) {
			tien = soDien*1000;
		}else {
			tien = 50*1000 + (soDien - 50)*1200;
		}
		System.out.printf("Tiền điện là: %d",tien);
	}

}
