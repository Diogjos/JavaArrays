package account;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Account myaccount = new Account(" Diogo",100);
		
		System.out.println(" Account is :" + myaccount.getName() + " | " + 
		myaccount.getBalance());
		
		System.out.println(" Enter your deposit: ");
		double depositAmmount = input.nextDouble();
		System.out.println("adding to account balance :" + depositAmmount);
		myaccount.deposit(depositAmmount);
		System.out.println(myaccount.getName() + " your ammount is: " + 
		myaccount.getBalance() + " R$");
		
		System.out.println(" Enter your debit:  ");
		double withdrawAmmount = input.nextDouble();
		System.out.println("adding to account balance: " + withdrawAmmount);
		myaccount.withdraw(withdrawAmmount);
		System.out.println(myaccount.getName() + " your ammount is: " + 
		myaccount.getBalance() + " R$");
		
		
		
		
				
		//System.out.println("Initial name is: " + myaccount.getName() );
		
		//System.out.println("Please enter the name: ");
		//String theName = input.nextLine();
		//myaccount.setName(theName);
		//System.out.println("The account name is:  " + myaccount.getName());
		
		
	}

}
