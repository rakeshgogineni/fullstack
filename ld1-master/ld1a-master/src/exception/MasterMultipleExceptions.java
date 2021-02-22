package exception;

public class MasterMultipleExceptions {
   public static void main(String[] args) {
      // multipeTry();
      // multipeExceptionsInSingleTry();
      // multipeExceptionsInSingleTry2();
      handleAllExceptions();
   }

   private static void multipeTry() {
      // Local variable
      // Test test;
      // The local variable test may not have been initialized
      // System.out.println(test.value);

      // Test test = new Test();
      // System.out.println(test.value);
      try {
         Test test = null;
         // test = new Test();
         System.out.println(test.value);
      } catch (NullPointerException e) {
         System.out.println("Test instance not created");
         System.out.println(e.getMessage());
         System.out.println(e);
      }
      try {
         int i = 200;
         int result = i / 0;
         System.out.println(result);
      } catch (ArithmeticException e) {
         System.out.println("Arithmetic problem");
      }
      System.out.println("Program resumes normal execution!");
      System.out.println("COMPLETE");
   }

   private static void multipeExceptionsInSingleTry() {
      // Local variable
      // Test test;
      // The local variable test may not have been initialized
      // System.out.println(test.value);
      // Test test = new Test();
      // System.out.println(test.value);
      try {
         Test test = null;
         test = new Test();
         // NullPointerException
         System.out.println(test.value);
         int i = 200;
         // ArithmeticException
         int result = i / 0;
         System.out.println(result);
      } catch (NullPointerException e) {
         System.out.println("Test instance not created");
         System.out.println(e.getMessage());
         System.out.println(e);
      } catch (ArithmeticException e) {
         System.out.println("Arithmetic problem");
      }
      System.out.println("Program resumes normal execution!");
      System.out.println("COMPLETE");
   }

   private static void multipeExceptionsInSingleTry1() {
      // Local variable
      // Test test;
      // The local variable test may not have been initialized
      // System.out.println(test.value);
      // Test test = new Test();
      // System.out.println(test.value);
      try {
         int i = 200;
         // ArithmeticException
         int result = i / 0;
         System.out.println(result);
         Test test = null;
         // NullPointerException
         System.out.println(test.value);
      } catch (NullPointerException e) {
         System.out.println("Test instance not created");
         System.out.println(e.getMessage());
         System.out.println(e);
      } catch (ArithmeticException e) {
         System.out.println("Arithmetic problem");
      }
      System.out.println("Program resumes normal execution!");
      System.out.println("COMPLETE");
   }

   private static void multipeExceptionsInSingleTry2() {
      // Local variable
      // Test test;
      // The local variable test may not have been initialized
      // System.out.println(test.value);
      // Test test = new Test();
      // System.out.println(test.value);
      try {
         int i = 200;
         // ArithmeticException
         int result = i / 0;
         System.out.println(result);
         Test test = null;
         // NullPointerException
         System.out.println(test.value);
      } catch (NullPointerException e) {
         System.out.println("Test instance not created");
         System.out.println(e.getMessage());
         System.out.println(e);
      }
      // catch (ArithmeticException e) {
      // System.out.println("Arithmetic problem");
      // }
      System.out.println("Program resumes normal execution!");
      System.out.println("COMPLETE");
   }

   private static void handleAllExceptions() {
      // Local variable
      // Test test;
      // The local variable test may not have been initialized
      // System.out.println(test.value);
      // Test test = new Test();
      // System.out.println(test.value);
      try {
         int num[] = { 10, 20 };
         System.out.println(num[0]);
         System.out.println(num[1]);
         System.out.println(num[2]);
         int i = 200;
         // ArithmeticException
         int result = i / 0;
         System.out.println(result);
         Test test = null;
         // NullPointerException
         System.out.println(test.value);
      } catch (NullPointerException e) {
         System.out.println("Test instance not created");
         System.out.println(e.getMessage());
      } catch (ArithmeticException e) {
         System.out.println("Arithmetic problem");
      } catch (Exception e) {
         System.out.println("OOPS, SOME OTHER EXCEPTIONS " + e);
      }
      System.out.println("COMPLETE");
   }

   private static void specificToGeneric() {
      // Local variable
      // Test test;
      // The local variable test may not have been initialized
      // System.out.println(test.value);
      // Test test = new Test();
      // System.out.println(test.value);
      try {
         int num[] = { 10, 20 };
         System.out.println(num[0]);
         System.out.println(num[1]);
         System.out.println(num[2]);
         int i = 200;
         // ArithmeticException
         int result = i / 0;
         System.out.println(result);
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

class Test {
   int value = 10;
}