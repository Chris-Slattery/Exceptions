/**
 * @(#)FileNotFoundDemo.java
 *
 *
 * @author
 * @version 1.00 2021/5/17
 */

import java.io.File;
import java.io.FileReader;
//Program to show a checked exception.
//The program tries to read from a file that does not exist, throwing a FileNotFoundException.
//The compiler also handles an IOException here.
public class FileNotFoundDemo {

    public static void main(String args[]) {
    	File file = new File("E://file.txt");
    	FileReader fr = new FileReader(file);

    }//end main


}//end class