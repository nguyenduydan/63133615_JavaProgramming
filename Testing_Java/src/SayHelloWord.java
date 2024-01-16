import java.util.Scanner;

public class SayHelloWord {

	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		
		System.out.println("What's your name?");
		String name = scanner.nextLine(); 
		
		System.out.println("How old are you?");
		int age = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Hello "+name);
		System.out.println("Age: "+ age + " years");
		
	}
}
