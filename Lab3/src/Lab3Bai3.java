import java.util.*;
public class Lab3Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x;
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số phần tử: ");
		n = scanner.nextInt();
		x =  new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Nhập phần tử thứ " + i);
			x[i] = scanner.nextInt();
		}
		System.out.println("Mảng trước khi sắp xếp: "+Arrays.toString(x));
		//Sắp xếp
		Arrays.sort(x);
		System.out.println("Mảng sau khi sắp xếp: "+Arrays.toString(x));
		
		int tong=0,dem=0;
		for(int i : x) {
			if(i % 3 == 0) {
				tong +=i;
				dem++;
			}
		}
		double tbCong =(double)tong/dem;
		System.out.printf("Trung bình cộng %d/%d: %.2f",tong,dem,tbCong);
	}

}
