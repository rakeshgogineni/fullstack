package core;

public class ConstructorDemo {
   public static void main(String[] args) {
      Pizza basic;
      // new keyword creates an instance by calling the constructor
      basic = new Pizza();
      basic.eat();

      Pizza special;
      special = new Pizza("Veg Supreme which some extra cheeese and olives!");
      special.eat();
   }
}

class Pizza {
   // Constructor
   // same name as class
   // no return type
   // default Constructor has no parameters
   Pizza() {
      System.out.println("Defualt Pizza");
   }

   Pizza(String type) {
      System.out.println("Mummy thank you for the yummy " + type);
   }

   public void eat() {
      System.out.println("Mummy, the Pizza is Yummy!");
   }
}