/**
 * 
 */

/**
 * @author vishw
 *
 */
import java.util.Scanner;

public class BankAccount {
	
	private int _accountNum;
	private String _ownerName;
	private int _balance;
	/**
	 * 
	 */
	public BankAccount(int _accountNum, String _ownerName, int _balance) {
		
		this._accountNum = _accountNum;
		this._ownerName = _ownerName;
		this._balance = _balance;
		// TODO Auto-generated constructor stub
	}
	public int get_accountNum() {
		return _accountNum;
	}
	public void set_accountNum(int _accountNum) {
		this._accountNum = _accountNum;
	}
	public String get_ownerName() {
		return _ownerName;
	}
	public void set_ownerName(String _ownerName) {
		this._ownerName = _ownerName;
	}
	public int get_balance() {
		return _balance;
	}
	public void set_balance(int _balance) {
		this._balance = _balance;
		
	}
	
	public void getAccountInfo() {
		System.out.println("-----------------------------");
		System.out.println("Account Number: " + get_accountNum());
		System.out.println("Holder's name: "+get_ownerName());
		System.out.println("Balance: "+ get_balance());
		System.out.println("Press 1 to Withdraw or Press 2 to deposit: ");
		Scanner reply = new Scanner(System.in);
		int input1 = reply.nextInt();
		if (input1 == 1) {
			System.out.println("Please enter amount you want to withdraw: ");
			int withdrawAmount = reply.nextInt();
			set_balance(_balance - withdrawAmount);
			System.out.println("New balance is: " + get_balance());
		}
		
		if (input1 ==2) {
			System.out.println("Please enter the amount you want to deposit: ");
			int depositAmount = reply.nextInt();
			set_balance(_balance + depositAmount);
			System.out.println("New balance is: " + get_balance());
		}
			
			
		
		
		}

}
