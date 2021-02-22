package exception.qa;

class TryFinally {
   public static void main(String[] args) {
      System.out.println("** **");
      try {
         System.out.println("Try Alone Error");
      } finally {
         System.out.println("clean up operations like closing databases and files.");
      }
   }
}