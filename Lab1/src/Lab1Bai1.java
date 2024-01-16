import java.util.Scanner;

public class Lab1Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner banphim = new Scanner(System.in);
		String hoTen;
		double diemTB;
		
		System.out.print("Nhập họ và tên: ");
		hoTen = banphim.nextLine();
		
		System.out.print("Nhập điểm trung bình: ");
		diemTB = banphim.nextDouble();
		
		System.out.printf("%s %.2f điểm",hoTen,diemTB);
	
	}

}
