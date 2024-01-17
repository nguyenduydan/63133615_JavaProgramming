import java.util.Scanner;

public class Lab2Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a,b;
		System.out.print("Nhập a: ");
		a = scanner.nextInt();
		System.out.print("Nhập b: ");
		b = scanner.nextInt();
		
		if(a==0) {
			if(b==0) {
				System.out.println("Phương trình vô số nghiệm");
			}else {
				System.out.println("Phương trình vô nghiệm");
			}
		}else {
			double x = -b/a;
			System.out.printf("Phương trình có nghiệm là: %.2f",x);
		}
	}

}
