import java.util.Scanner;

public class ScannerDemo {
  public static void main(String[] args) {
    String transactionType;;
    int transactionAmount;

   //create a new scanner
   Scanner keyboard = new Scanner(System.in);
   // using the scanner
   transactionType = keyboard.nextLine();
   transactionAmount = keyboard.nextInt();
   System.out.println("Type > " + transactionType);
   System.out.println("Amount > " + transactionAmount);
   // closing the scanner
   keyboard.close();
  }
}
