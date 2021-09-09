/**
 * @(#)ReadData_Demo.java
 *
 *
 * @author
 * @version 1.00 2021/5/17
 */

//Program for reading data from a file using FileReader and closing the stream with a finally block.

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadData_Demo {

    public static void main(String args[]) {
    	FileReader fr = null;
    	try{
    		File file = new File("example.txt"); //open the file
    		fr = new FileReader(file);           //read data from the file
    		char [] a = new char[53];            //create array to store characters form file
    		fr.read(a);                          //reads content into the created char array above.
    		for(char c : a)                      //for loop to loop thorugh all of the characters in the array
    			System.out.print(c);           //prints the characters one by one
    	} catch (IOException e) {
    		e.printStackTrace();
    	} finally {
    		try{
    			fr.close();                      //close stream to prevent memory leakage
    		} catch (IOException ex){
    			ex.printStackTrace();
    		}//end catch
    	}//end finally block

    }//end main


}//end class