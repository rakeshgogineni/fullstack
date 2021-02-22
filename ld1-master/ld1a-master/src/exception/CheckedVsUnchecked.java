package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

class CheckedVsUnchecked {
 public static void main(String[] args) {

    try{
      int x = 100;
      int y = 0;
      int result = 0;
      if(y!= 0)
      result = x/0;
    //The compiler forces the programmer to handle.
    FileInputStream  fileInputStream = new FileInputStream("test.txt");
    }
    catch(ArithmeticException arithmeticException){
      System.out.println("Divide by Zero");
   }
    catch(FileNotFoundException fileNotFoundException){
       System.out.println("File Not Found");
    }
 }
}
