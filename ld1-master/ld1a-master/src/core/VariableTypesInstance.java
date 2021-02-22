package core;

public class VariableTypesInstance {
   public static void main(String[] args) {
      Mobile mobile1 = new Mobile();
      mobile1.owner = "Rupa";
      mobile1.display();
      Mobile mobile2 = new Mobile();
      mobile2.owner = "Vikalp";
      mobile2.display();
      mobile1.owner = "Aishwarya";
      mobile1.display();
   }
}
