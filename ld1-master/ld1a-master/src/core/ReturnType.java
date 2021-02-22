package core;

public class ReturnType {
   public static void main(String[] args) {
      int result;
      result = add(5, 10);
      System.out.println(result);
   }
   // public static void add(int i, int j){
   //    //void does not return anything.
   //    System.out.println(i+j);
   // }
   public static int add(int i, int j){
      int sum = i+j;
      return sum;
   }
}
