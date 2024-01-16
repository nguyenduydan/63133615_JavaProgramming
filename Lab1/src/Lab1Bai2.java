import java.util.Scanner;

public class Lab1Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int dai,rong;
		
		System.out.print("Nhập chiều dài: ");
		dai = scanner.nextInt();
		
		System.out.print("Nhập chiều rộng: ");
		rong = scanner.nextInt();
		
		int chuvi = (dai+rong)*2;
		int dientich = dai*rong;
		int canhNhoNhat = Math.min(dai, rong);
		
		System.out.printf("Chu vi: %d; Diện tích: %d; Cạnh nhỏ nhất: %d",chuvi,dientich,canhNhoNhat);
		
	}

}
