import java.util.*;
public class Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ArrayList<Double> list =  new ArrayList();
		//Bai 1:
		while(true) {
			Double x = scanner.nextDouble();
			list.add(x);
			System.out.print("Nhập thêm (Y/N)? ");
			scanner.nextLine();
			if(scanner.nextLine().equals("N")) {
				break;
			}else {
				continue;
			}
		}
		// Hiển thị danh sách
		System.out.println("Hiển thị danh sách");
		for(double ds: list) {
			System.out.println(ds + " ");
		}
		
		Double sum = 0.0;
		System.out.println("Hiển thị tổng");
		for(double num: list) {
			sum+=num;
		}
		System.out.println("Tổng: "+sum);
	}

}
