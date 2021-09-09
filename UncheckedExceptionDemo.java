/**
 * @(#)UncheckedExceptionDemo.java
 *
 *
 * @author
 * @version 1.00 2021/5/17
 */

//Program to show an unchecked exception. These exceptions are also known as runtime exceptions.
//Runtime exceptions happen when the programmer tries to access an array index that is out of bounds. ArrayIndexOutOfBoundsException
//Other unchecked exceptions would be ClassCastException, IllegalThreadStateException.
public class UncheckedExceptionDemo {

    public static void main(String args[]) {
    	int num[] = {1,2,3,4};
    	System.out.println(num[4]);

    }//end main


}//end class