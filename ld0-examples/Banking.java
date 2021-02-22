
class Banking {
   public static void main(String[] args) {
      ATM atmObject = new ATM();
      String transactionType = "withdraw";
      int tansactionAmount  = 5000;
      atmObject.transaction(transactionType, tansactionAmount);
      // atmObject.transaction("withdraw", 5000);
      String transactionType1 ="Print Statement";
      atmObject.transaction(transactionType1);
   }
}

class ATM{
   // Overloading is having multiple functions with same name
   // Different number of parameters
   // Overloading is compile-time polymorphism
   public void transaction(String type, int amount){
      System.out.println("transaction(String type, int amount)");
      System.out.println(type + " " + amount);
   }
   public void transaction(String type){
      System.out.println("transaction(String type)");
      System.out.println(type);
   }
}