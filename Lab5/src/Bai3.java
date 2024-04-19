import java.util.*;
import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private static int Menu(Scanner scanner) {
		System.out.println("+-------------------------------------------------------------+");
        System.out.println("| 1. Nhập danh sách sản phẩm                                  |");
        System.out.println("| 2. Sắp xếp giảm dần theo giá và xuất ra màn hình            |");
        System.out.println("| 3. Tìm và xóa sản phẩm theo tên nhập từ bàn phím            |");
        System.out.println("| 4. Xuất giá trung bình của các sản phẩm                     |");
        System.out.println("+-------------------------------------------------------------+");
        System.out.print("Chọn chức năng (1-4): ");
        return scanner.nextInt();
	}
	
	private static int input(ArrayList<String> list, Scanner scanner) {
		scanner.nextLine();
		System.out.println("Nhập danh sách sản phẩm");
		while(true) {
			scanner = new Scanner(System.in);
			String tenSP = scanner.nextLine();
			int gia = scanner.nextInt();
			if(tenSP.equalsIgnoreCase("done")) {
				break;
			}
			list.add();
		}
		return scanner.nextInt();
	}
}
