public class Lab3Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=2;i<= 9;i++) {
			System.out.println("+-----------------------------------+");
			System.out.printf("|         Bảng cửu chương %d         |\n",i);
			System.out.println("+-----------------------------------+");
			for(int j = 1; j<=10;j++) {
				System.out.printf("            %d x %d = %d         \n",i,j,i*j);
			}
			System.out.println();
		}
	}

}
