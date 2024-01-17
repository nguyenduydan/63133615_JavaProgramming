import java.util.*;
public class Lab2Bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =  new Scanner(System.in);
		
		System.out.println(">>+----------MENU----------+<<");
		System.out.println("+----------------------------+");
		System.out.println("|     1.Giải PT bậc nhất     |");
		System.out.println("|     2.Giải PT bậc hai      |");
		System.out.println("|     3.Tính tiền điện       |");
		System.out.println("|     4.Kết thúc             |");
		System.out.println("+----------------------------+");
		
		System.out.print("\tNhập chức năng: ");
		int chucNang = scanner.nextInt();
		switch(chucNang) {
		case 1:
			giaiPT1();
			break;
		case 2:
			giaiPT2();
			break;
		case 3:
			tinhTienDien();
			break;
		case 4:
			break;
		default:
			break;
		}
	}
	public static void giaiPT1() {
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
	public static void giaiPT2() {
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
	public static void tinhTienDien() {
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
