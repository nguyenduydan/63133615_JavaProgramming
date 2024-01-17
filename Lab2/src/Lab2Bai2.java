import java.util.Scanner;
public class Lab2Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double a,b,c;
		double delta;
		double x;
		System.out.print("Nhập a: ");
		a = scanner.nextDouble();
		System.out.print("Nhập b: ");
		b = scanner.nextDouble();
		System.out.print("Nhập c: ");
		c = scanner.nextDouble();
		
		//Nếu a==0 => giải pt bậc nhất
		if(a!=0) {
			//tính delta
			delta = Math.pow(b,2)-4*a*c;
			if(delta<0) {
				System.out.println("Phương trình vô nghiệm");
			}
			if(delta == 0) {
				x = -b/(2*a);
				System.out.printf("Phương trình có nghiệm kép: X = %.2f",x);
			}
			if(delta > 0) {
				double X1 = (-b + Math.sqrt(delta))/(2+a);
				double X2 = (-b - Math.sqrt(delta))/(2+a);
				System.out.printf("Phương trình có 2 nghiệm: X1 = %.2f; X2 = %.2f",X1,X2);
			}
		}else {
			x = -c/b;
			System.out.printf("Nghiệm của phương trình là x = %.2f",x);
		}
	
	}

}

