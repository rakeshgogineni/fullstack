public class OverloadingMain {
   // You can overload the main method.
   public static void main(String[] args) {
      System.out.println("JVM looks for this method signature as an entry point");
      System.out.println("******************");
      // main();
      // int array[] = { 1, 2 };
      // main(array);
   }

   public static void main() {
      System.out.println("Custom main() method");
   }

   public static void main(int[] args) {
      System.out.println("JVM does not look for this method signature as an entry point");
      System.out.println(args[0]);
      System.out.println(args[1]);
   }
}
