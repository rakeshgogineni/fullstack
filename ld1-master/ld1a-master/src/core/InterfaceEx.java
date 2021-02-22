package core;

public class InterfaceEx {
   public static void main(String[] args) {
      // DebitCard hdfcCard = new DeibitCard();
		DebitCard hdfcCard = null;
		hdfcCard = new BankAccount();
		hdfcCard.withdraw();
   }
}

interface DebitCard{
   abstract void withdraw();
}

class BankAccount implements DebitCard{

   @Override
   public void withdraw() {
      System.out.println("Withdraw from ATM");
   }
   
}