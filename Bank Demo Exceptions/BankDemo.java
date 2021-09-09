/**
 * @(#)BankDemo.java
 *
 *
 * @author
 * @version 1.00 2021/5/17
 */

//This program creates a custom made exception . It is used in an ATM situation.
//Program has 3 files... This file, InsufficientFundsException.java and CheckingAccount.java

public class BankDemo {

    public static void main(String args[]) {
    	CheckingAccount c = new CheckingAccount(101);
    	System.out.println("Depostiting $500...");
    	c.deposit(500.00);

    	try{
    		System.out.println("\nWithdrawing $100...");
    		c.withdraw(100.00);
    		System.out.println("\nWithdrawing $600...");
    		c.withdraw(600.00);
    	} catch (InsufficientFundsException e) {
    		System.out.println("Sorry, but you are short $" + e.getAmount());
    		e.printStackTrace();
    	}//end catch


    }//end main


}//end class