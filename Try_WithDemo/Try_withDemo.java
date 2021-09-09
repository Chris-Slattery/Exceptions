/**
 * @(#)Try_withDemo.java
 *
 *
 * @author
 * @version 1.00 2021/5/17
 */

import java.io.FileReader;
import java.io.IOException;

public class Try_withDemo {

    public static void main(String args[]) {
    	try(FileReader fr = new FileReader("file.txt")) {
    		char [] a = new char[50];   //create array to store characters
    		fr.read(a);                 //read content into the array
    		for(char c : a)
    			System.out.print(c);  //print the characters one by one
    	} catch (IOException e) {
    		e.printStackTrace();
    	}//end catch

    }//end main


}//end class