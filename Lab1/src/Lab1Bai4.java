import java.util.*;

public class Lab1Bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a,b,c;
		System.out.print("Nhập hệ số a: ");
		a = scanner.nextInt();
		System.out.print("Nhập hệ số b: ");
		b = scanner.nextInt();
		System.out.print("Nhập hệ số c: ");
		c = scanner.nextInt();
		
		int delta = (int) Math.pow(b,2) - 4*a*c;
		double canDelta = Math.sqrt(delta);
		System.out.printf("Căn của delta là: %.2f",canDelta);
	}

}
