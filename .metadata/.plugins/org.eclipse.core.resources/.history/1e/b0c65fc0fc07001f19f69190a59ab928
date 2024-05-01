package task10;
import java.util.*;
public class Account {
	
	private static int balance;
	static Scanner sc = new Scanner(System.in);
	
	public Account() {
		this.balance=sc.nextInt();
		System.out.println("Initial Amount :"+balance);
	}
	
	public static void deposit(int deposit) {
		
		balance = balance + deposit;
	}
	
	public static void withdraw(int withdraw) {
		
		balance = balance - withdraw;
	}
	public static void main(String args[]) {
		
		Account b = new Account();
		
		System.out.println("Choose to withdraw or deposit");
		
		String choice = sc.next();
		
		switch(choice) {
		
		case "withdraw":
			
			System.out.println("How much to withdraw?");
			
			int amount = sc.nextInt();
			withdraw(amount);
			System.out.println("The Amount after withdraw: "+ balance);
			
			break;
			
		case "deposit":
			
            int amount2 = sc.nextInt();
			
            deposit(amount2);
			System.out.println("The Amount After deposit: "+ balance);
			
			break;
			
		default:
			
			System.out.println("Invalid choice");
			
			return;
				
		}		
	}
}
