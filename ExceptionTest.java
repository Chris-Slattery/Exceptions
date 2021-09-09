/**
 * @(#)ExceptionTest.java
 *
 *
 * @author
 * @version 1.00 2021/5/17
 */

//Program to handle exception with a try catch block. Put code which is prone to exceptions into the
//try block. If exception occurs it is handled by the catch block associated with the try block.
//Program will try to acces the third element of an array with two elements.

import java.io.*;
public class ExceptionTest {

    public static void main(String args[]) {
    	try{
    		int a[] = new int[2];
    		System.out.println("Access elemnt three : " + a[3]);
    	} catch (ArrayIndexOutOfBoundsException e) {
    		System.out.println("Exception thrown : " + e);

    	}//end catch
    	System.out.println("Out of the block");

    }//end main


}//end class