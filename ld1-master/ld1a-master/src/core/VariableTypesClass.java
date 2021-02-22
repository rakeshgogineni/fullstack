package core;

public class VariableTypesClass {
   public static void main(String[] args) {
      Mobile mobile1 = new Mobile();
      // static variables can be accessed using class name
      Mobile.owner = "Rupa";
      Mobile mobile2 = new Mobile();
      Mobile.owner = "Vikalp";
      // static variables can be accessed using reference name
      mobile2.owner = "Reshma";
      mobile1.display();
      mobile2.display();
   }
}
