package core;

class Mobile {
   // Class variable are called static variable
   // directly declared inside the class
   // only one copy for each class
   // all instances will share the same copy.
   static String owner;

   void display() {
      System.out.println(owner);
   }
}