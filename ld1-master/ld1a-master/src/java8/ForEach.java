package java8;

import java.util.HashMap;

public class ForEach {
   public static void main(String[] args) {
      // java7Way();
      java8Way();
   }

   private static void java7Way() {
      // Store key value pairs.
      HashMap dictionary = new HashMap();
      // put(Object key, Object value)
      dictionary.put("gargantuan", "a mammoth task");
      dictionary.put("philatelist ", "a person who studies about stamps");
      dictionary.put("aeonian", "lasting for an immeasurably or indefinitely long period of time");

      // displaying the keys
      for (Object key : dictionary.keySet()) {
         System.out.println(key);
      }

      // displaying the values
      for (Object value : dictionary.values()) {
         System.out.println(value);
      }

   }

   private static void java8Way() {
      // Store key value pairs.
      HashMap dictionary = new HashMap();
      // put(Object key, Object value)
      dictionary.put("gargantuan", "a mammoth task");
      dictionary.put("philatelist ", "a person who studies about stamps");
      dictionary.put("aeonian", "lasting for an immeasurably or indefinitely long period of time");

      // displaying the keys
      // lambda expression () -> {}
      // lambda expression (key,value) ->
      // {System.out.println(key);System.out.println(value);}
      // The type of lambda expression is a functional interface.
      dictionary.forEach((key, value) -> {
         System.out.println(key);
         System.out.println(value);
      });
   }
}
