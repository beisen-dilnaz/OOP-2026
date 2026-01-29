import java.util.Scanner;

public class task5 {

	public static void main(String[] args) {
		
		int balance = 0;
		System.out.println("Current balance: " + balance);
		System.out.println("Enter your money: ");
		
		Scanner scanner = new Scanner(System.in);
		
		int money = scanner.nextInt();
		balance += money;
		
		System.out.println("You inserted " + money + "$! Your current balance is " + balance);
		
	}

}
