import java.util.Scanner;

public class Lab1Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhập cạnh của hình lập phương: ");
		int canh = scanner.nextInt();
		
		int dienTich = (int) Math.pow(canh, 3);
		
		System.out.printf("Diện tích của hình lập phương với cạnh %d là: %d",canh,dienTich);
		
	}

}
