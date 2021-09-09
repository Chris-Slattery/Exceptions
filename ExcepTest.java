/**
 * @(#)ExcepTest.java
 *
 *
 * @author
 * @version 1.00 2021/5/17
 */

//Program to show that when a try block has a finally block after it, the finally block will ALWAYS execute.
//Finally block executes even if there is an exception in the try block beforehand.


import java.io.*;
public class ExcepTest {

    public static void main(String args[]) {
    	int a[] = new int[2];
    	try{
    		System.out.println("Access elemnt three : " + a[3]);
    	} catch (ArrayIndexOutOfBoundsException e) {
    		System.out.println("Exception thrown : " + e);
    	}finally {
    		a[0] = 6;
    		System.out.println("First element value: " + a[0]);
    		System.out.println("The finally statement is executed");

    	}//end finally block


    }//end main


}//end class