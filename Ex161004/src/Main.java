import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hey!");
		
		System.out.println("Write Y:");

		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		
		
		
		if (input.equals("Y")) {
			System.out.println("You made it");
		}else{
			System.out.println("You failed!!!");
		}

	}

}
