/**
 * 
 */

/**
 * @author vishw
 *
 */
import java.util.Scanner;
import java.util.Random;
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		BankAccount bank = new BankAccount(212, " ",545);
		System.out.println("Enter Account Number: ");
		Scanner userinput = new Scanner(System.in);
		bank.set_accountNum(userinput.nextInt());
		
		System.out.println("Enter Account holder's name: ");
		Scanner userinput2 = new Scanner(System.in);
		bank.set_ownerName(userinput2.next());
		
		System.out.println("Enter balance you have ");
		Scanner userinput3 = new Scanner(System.in);
		bank.set_balance(userinput3.nextInt());
		
		bank.getAccountInfo();
	
		
		// TODO Auto-generated method stub
	/*	Patient display = new Patient();
		
		System.out.println("Please Enter Patient ID: ");
		Scanner scannerObj = new Scanner(System.in);
		display.set_patientID(scannerObj.nextDouble()); 
		
		
		System.out.println("Please Enter First name: ");
		Scanner scannerObj1 = new Scanner(System.in);
		display.set_firstname(scannerObj1.nextLine()); 
		
		
		System.out.println("Please Enter last name: ");
		Scanner scannerObj2 = new Scanner(System.in);
		display.set_lastname(scannerObj2.nextLine());
		
		System.out.println("Please Enter Address: ");
		Scanner scannerObj3 = new Scanner(System.in);
		display.set_address(scannerObj3.nextLine());
		
		System.out.println("Please Enter City: ");
		Scanner scannerObj4 = new Scanner(System.in);
		display.set_city(scannerObj4.nextLine()); 
		
		
		System.out.println("Please Enter Province: ");
		Scanner scannerObj5 = new Scanner(System.in);
		display.set_province(scannerObj5.nextLine()); 
		
		System.out.println("Please Enter Postal Code: ");
		Scanner scannerObj6 = new Scanner(System.in);
		display.set_postalcode(scannerObj6.nextLine()); 
		
		System.out.println("---------------------------------");
	
		display.Retrieve();
		
		Random numberGen = new Random();
				int randomint = numberGen.nextInt(100);
		System.out.println("Random Generated number is: "+ randomint);
		
		
		int[], String[], float[] <-- All of these are the Array classes in Java... When
		
		it comes to create an array we are creating an object where object will be array name...
		Such as integer array can be made as a int[] ArrayName = new int[]; Make a note 
		we have to assign a length or a size of the array in that line of code so, it will be eventually written as
		int[] ArrayName = new int[3] where 3 is the size of the array we are creating...
		
		
		
		*/
		
		
		
	}

}
