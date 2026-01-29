import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("length of one side:");
		int a = scanner.nextInt();
		double b = a;
		
		System.out.println("area: " + a*a);
		System.out.println("perimeter: " + 4*a);
		System.out.println("diagonal: " + Math.sqrt(2)*b);
		
	}

}