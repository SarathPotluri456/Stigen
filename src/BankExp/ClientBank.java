package BankExp;
import java.util.*;
public class ClientBank {

	public static void main(String[] args) throws CBank {
		CheckingTransactions ct=new CheckingTransactions();
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Please Enter How much amount you want to be deposit:");
		int d=sc.nextInt();
		System.out.println("The Deposited amount is:Rs."+ct.deposit(d));
		System.out.println("Please Enter how much amount you want to withdraw:");
		int w=sc.nextInt();
		System.out.println("The withdrawl amount is:Rs."+ct.withdraw(w));
		try {
			System.out.println("The Balence Amount is:Rs."+ct.balance(d, w));
		} catch (CBank e) {
			System.err.println("You have insufficiant funds");
		}
	}

}
