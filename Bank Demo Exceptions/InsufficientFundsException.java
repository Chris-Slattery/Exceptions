/**
 * @(#)InsufficientFundsException.java
 *
 *
 * @author
 * @version 1.00 2021/5/17
 */

import java.io.*;

public class InsufficientFundsException extends Exception {
	private double amount;

    public InsufficientFundsException(double amount) {
    	this.amount = amount;
    }//end constructor


    public double getAmount() {
    	return amount;
    }//end getAmount

}//end class