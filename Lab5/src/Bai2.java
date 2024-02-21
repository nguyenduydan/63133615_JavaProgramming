import java.util.*;
public class Bai2 {

	public static void main(String[] args) {
		ArrayList<String>ds = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		 while (true) {
	            int choice = Menu(scanner);
	
	            switch (choice) {
	                case 1:
	                    nhap(ds, scanner);
	                    break;
	                case 2:
	                    xuat(ds);
	                    break;
	                case 3:
	                    ngaunhien(ds);
	                    break;
	                case 4:
	                    sapxep(ds);
	                    break;
	                case 5:
	                	xoa(ds, scanner);
	                	break;
	                case 6:
	                	ketthuc();
	                	return;
	                default:
	                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
	            }
	        }

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
	
	private static void nhap(ArrayList<String> list, Scanner scanner) {
		scanner.nextLine(); 
        System.out.println("Nhập danh sách họ và tên (nhập 'done' để kết thúc):");
		while(true) {
			scanner = new Scanner(System.in);
			String hoTen = scanner.nextLine();
			if(hoTen.equalsIgnoreCase("done")) {
				break;
			}
			list.add(hoTen);
		}
	}
	
	private static void xuat(ArrayList<String> list) {
		System.out.println("Danh sách họ và tên");
		for(String ds: list) {
			System.out.println(ds);
		}
	}
	private static void sapxep(ArrayList<String> list){
		Collections.sort(list);
		System.out.println("Danh sách tăng dần:");
		xuat(list);
		Collections.reverse(list);
		System.out.println("Danh sách giảm dần:");
		xuat(list); 
	}
	private static void ngaunhien(ArrayList<String> list) {
		Collections.shuffle(list);
		System.out.println("Danh sách ngẫu nhiên:");
		xuat(list);
	}
	private static void xoa(ArrayList<String> list, Scanner scanner) {
        scanner.nextLine();
        System.out.print("Nhập họ tên cần xóa: ");
        String hoTen = scanner.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equalsIgnoreCase(hoTen)) {
                list.remove(i);
                System.out.println("Đã xóa: " + hoTen);
                break;
            }
        }
    }
 	private static void ketthuc() {
        System.out.println("Chương trình kết thúc.");
    }
}
