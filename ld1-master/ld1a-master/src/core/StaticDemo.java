package core;

public class StaticDemo {
   public static void main(String[] args) {
      // Before first access the static blocks are executed.
      System.out.println(StaticDemoTest.message);
      StaticDemoTest.staticMethod();
      System.out.println(StaticDemoTest.message);
      StaticDemoTest.staticMethod();
      // staticBlockVar cannot be resolved or is not a field.
      // System.out.println(StaticDemoTest.staticBlockVar);
      System.out.println(StaticDemoTest.staticVar);
   }
}

class StaticDemoTest {
   // public String instanceVar;
   static String staticVar = "staticVar";
   static {
      String staticBlockVar = "StaticBlockVar";
      System.out.println(staticBlockVar);
      staticVar = "staticVarChanged";
      System.out.println("sb1");
   }
   static {
      System.out.println("sb2");
   }
   public static String message = "welcome";

   public static void staticMethod() {
      System.out.println("Inside staticMethod " + message);
      System.out.println("Inside staticMethod " + staticVar);
      // System.out.println(instanceVar);
   }
   // public void instanceMethod() {
   // System.out.println(message);
   // System.out.println(instanceVar);
   // }
}