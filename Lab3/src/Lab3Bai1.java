import java.util.*;
public class Lab3Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập N: ");
		int N = scanner.nextInt();
		boolean ok=true;
		for(int i=2;i<N-1;i++) {
			if(N%i==0) {
				ok = false;
				break;
			}
			i++;
		}
		if(ok == true) {
			System.out.printf("Số %d là số nguyên tố",N);
		}else {
			System.out.printf("Số %d không phải là số nguyên tố",N);
		}
		
	}

}
