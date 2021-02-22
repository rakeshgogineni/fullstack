package core;

public class VariableTypesLocal {

   public static void main(String[] args) {
      VariableTypesLocal variableTypes = new VariableTypesLocal();
      variableTypes.test();
      System.err.println("ERROR : ************");
      variableTypes.test1();
   }

   void test() {
      // Local Variable
      // declared inside methods or blocks
      String var = "localvarmethod";
      System.out.println(var);
      boolean testvar = false;
      if (testvar) {
         String var1 = "localvarblock true";
         System.out.println(var1);
      } else {
         String var1 = "localvarblock false";
         System.out.println(var1);
      }
   }

   void test1() {
      String var = "localvar1";
      System.out.println(var);
   }
}
