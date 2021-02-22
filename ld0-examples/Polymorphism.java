public class Polymorphism {
   //  public static void main(String[] args)  will be detailed later.
   public static void main(String[] args) {
      boolean powerAvailable = false;

      Laptop dell = new Laptop();

      if (powerAvailable) {
         System.out.println("Power is available");
         dell.power("laptop adapter");
      }
      if (!powerAvailable) {
         System.out.println("Power is unavailable");
         dell.power();
      }
   }
}

class Laptop {
   // Polymorphism using function overloading.
   // function overloading is two functions with the same name
   // but different arguments.
   // By default laptop runs on battery power.
   // zero arguments
   public void power() {
      System.out.println("Running by default on battery!");
   }

   // one argument
   // Runs on UPS power when using the adapter.
   public void power(String adapter) {
      System.out.println("Running by power from UPS using " + adapter);
   }
}