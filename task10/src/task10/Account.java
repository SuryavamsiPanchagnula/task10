package task10;
import java.util.*;
public class Account {
	
	private static int balance;
	static Scanner sc = new Scanner(System.in);
	private int intAmount;
	private final Scanner scanner;
	
	public Account(){
		this.scanner = null;
		this.balance=sc.nextInt();
		System.out.println("Initial Amount :"+balance);
	}
	
	public static void deposit(int deposit) {
		
		balance = balance + deposit;
	}
	
	public static void withdraw(int withdraw) {
		
		balance = balance - withdraw;
	}
	public Account(int intAmount,Scanner scanner) {
		this.scanner = scanner;
		this.intAmount=intAmount;
		System.out.println("Initial Amount: "+intAmount);
		
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
			
			System.out.println("How much to deposit?");
            int amount2 = sc.nextInt();
			
            deposit(amount2);
			System.out.println("The Amount After deposit: "+ balance);
			
			break;
			
		default:
			
			System.out.println("Invalid choice");
			
			return;
				
		}	
		
		System.out.println("Please give amount details of another account");
		
		int amount3= sc.nextInt();
		
		Account a = new Account(amount3, sc);
		
		System.out.println("Choose to withdraw or deposit");
		
		String choice2 = sc.next();
		
		switch (choice2) {
		
        case "withdraw":
        	
            System.out.print("Enter amount to withdraw: ");
            int amountToWithdraw = sc.nextInt();
            Account.withdraw(amountToWithdraw);
            System.out.println("The amount after withdraw: " + Account.balance);
            
            break;
        case "deposit":
        	
            System.out.print("Enter amount to deposit: ");
            int amountToDeposit = sc.nextInt();
            Account.deposit(amountToDeposit);
            System.out.println("The amount after deposit: " + Account.balance);
            
            break;
        default:
        	
            System.out.println("Invalid choice");
            
            break;

    }
		
	}
}
