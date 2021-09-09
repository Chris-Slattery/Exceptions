/**
 * @(#)CheckingAccount.java
 *
 *
 * @author
 * @version 1.00 2021/5/17
 */

import java.io.*;
public class CheckingAccount {
	private double balance;
	private int number;


    public CheckingAccount(int number) {
    	this.number = number;
    }//end constructor

    public void deposit(double amount){
    	balance += amount;

    }//end deposit method

    public void withdraw(double amount) throws InsufficientFundsException{
    	if(amount <= balance){
    		balance -= amount;
    	}else{
    		double needs = amount - balance;
    		throw new InsufficientFundsException(needs);
    	}//end else

    }//end withdraw method



    public double getBalance(){
    	return balance;
    }//end getBalance


    public int getNumber(int number) {
    	return number;
    }//end getNumber


}