package exception;

public class NestedTryCatch {
   public static void main(String[] args) {
      try {
         int num[] = { 10, 20 };
         System.out.println(num[0]);
         System.out.println(num[1]);
         // System.out.println(num[2]);
         try {
            int i = 200;
            // ArithmeticException
            int result = i / 0;
            System.out.println(result);
         } catch (ArithmeticException e) {
            System.out.println("Arithmetic problem");
         }
         Test test = null;
         // NullPointerException
         System.out.println(test.value);
      } catch (Exception e) {
         System.out.println("OOPS, SOME OTHER EXCEPTIONS " + e);
         // } catch (NullPointerException e) {
         // System.out.println("Test instance not created");
         // System.out.println(e.getMessage());
         // } catch (ArithmeticException e) {
         // System.out.println("Arithmetic problem");
         // }
         System.out.println("COMPLETE");
      }
   }
}
