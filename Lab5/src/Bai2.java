import java.util.*;
public class Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private static int Menu(Scanner scanner) {
		System.out.println("+---------------------------------------+");
        System.out.println("| 1. Nhập danh sách họ và tên           |");
        System.out.println("| 2. Xuất danh sách vừa nhập            |");
        System.out.println("| 3. Xuất danh sách ngẫu nhiên          |");
        System.out.println("| 4. Sắp xếp giảm dần và xuất danh sách |");
        System.out.println("| 5. Tìm và xóa họ tên                  |");
        System.out.println("| 6. Kết thúc                           |");
        System.out.println("+---------------------------------------+");
        System.out.print("Chọn chức năng (1-6): ");
        return scanner.nextInt();
	}
	
}
