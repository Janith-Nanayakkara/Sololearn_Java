import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int days = scanner.nextInt();
		
		days=days*86400;
		System.out.println(days);
		
	}
}