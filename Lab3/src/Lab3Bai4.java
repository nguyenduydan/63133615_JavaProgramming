import java.util.*;
public class Lab3Bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Nhập số lượng sinh viên: ");
		n = sc.nextInt();
		String[] hoTen = new String[n];
		double[] diem = new double[n];
		//Nhập từng sinh viên
		for (int i = 0; i < n; i++) {
            System.out.print("Nhập họ tên của sinh viên thứ " + (i + 1) + ": ");
            hoTen[i] = sc.next();

            System.out.print("Nhập điểm của sinh viên thứ " + (i + 1) + ": ");
            diem[i] = sc.nextDouble();
        }
		insertionSort(diem,hoTen);
		
		// Xuất thông tin sinh viên và học lực
		System.out.println("+-----------------------------------+");
		System.out.println("|        Danh sách sinh viên        |");
		System.out.println("+-----------------------------------+");
		for(int i =0;i<n;i++) {
			System.out.println("Sinh viên thứ " + (i+1));
			System.out.println("Họ và tên: "+ hoTen[i]);
			System.out.println("Điểm: "+diem[i]);
			System.out.println("Học lực: "+tinhHocLuc(diem[i]));
			System.out.println("------------------------------");
		}
	}
	
	public static void insertionSort(double[] arr, String[] hoTen) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            double keyDiem = arr[i];
            String keyHoTen = hoTen[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > keyDiem) {
                arr[j + 1] = arr[j];
                hoTen[j + 1] = hoTen[j];
                j = j - 1;
            }

            arr[j + 1] = keyDiem;
            hoTen[j + 1] = keyHoTen;
        }
    }
	
	public static String tinhHocLuc(double diem) {
		if(diem < 5) {
			return "Yếu";
		}else if(diem < 6.5) {
			return "Trung bình";
		}else if(diem < 7.5) {
			return "Khá";
		}else if(diem < 9) {
			return "Giỏi";
		}else {
			return "Xuất sắc";
		}
	}

}
