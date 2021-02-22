package core;

public class AnonymousEx {
   public static void main(String[] args) {
      DebitCard debitCard = new BankAccount1();
      debitCard.withdraw();

      // anounymous instance of anonymous classs
      DebitCard debitCard2 = new DebitCard() {
         @Override
         public void withdraw() {
            System.out.println("Withdraw from Daddy's Account");
         }
      };
      debitCard2.withdraw();
   }
}

interface DebitCard1 {
   abstract void withdraw();
}

// Concrete Class
class BankAccount1 implements DebitCard {
   @Override
   public void withdraw() {
      System.out.println("Withdraw from ATM");
   }
}