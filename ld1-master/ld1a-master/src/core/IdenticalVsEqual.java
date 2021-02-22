package core;

public class IdenticalVsEqual {

   public static void main(String[] args) {
      String s1 = "Hello";
      String s2 = "Hello";
      String s3 = new String("Hello");
      String s4 = new String("Hello");
      System.out.println("Equal :  " + s1.equals(s2));
      System.out.println("Identical : " + (s1 == s2));

      System.out.println("Equal :  " + s1.equals(s3));
      System.out.println("Identical : " + (s1 == s3));

      System.out.println("Equal :  " + s3.equals(s4));
      System.out.println("Identical : " + (s3 == s4));

      String text1 = new String("apple");
      String text2 = new String("apple");

      // since two strings are different object result should be false
      boolean result = text1 == text2;
      System.out.println("Comparing two strings with == operator: " + result);

      // since strings contains same content , equals() should return true
      result = text1.equals(text2);
      System.out.println("Comparing two Strings with same content using equals method: " + result);

      text2 = text1;
      // since both text2 and text1d reference variable are pointing to same object
      // "==" should return true
      result = (text1 == text2);
      System.out.println("Comparing two reference pointing to same String with == operator: " + result);

   }
}