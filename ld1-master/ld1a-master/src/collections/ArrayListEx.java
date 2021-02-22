package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx {
   public static void main(String[] args) {
      // useListWithStrings();
      useListWithDataTypes();
   }

   private static void useListWithStrings() {
      // List
      // allows duplicates
      // does not sort
      // preserves insertion order
      // allows null
      ArrayList cart = new ArrayList();
      cart.add("Ferroro");
      cart.add("Maggi");
      cart.add("Fox's");
      cart.add(null);
      cart.add("Ferroro");
      cart.add(null);
      System.out.println(cart);
      cart.remove(1);
      // cart.set(1,null);
      System.out.println(cart);
      cart.set(2, "Snickers");
      System.out.println(cart);
      // java.lang.IndexOutOfBoundsException:
      // cart.remove(5);
      // cart.remove(-1);
      cart.remove(4);
      System.out.println(cart);
      Collections.sort(cart);
      System.out.println(cart);
      System.out.println(cart.size());
      // for loop
      for (int i = 0; i < cart.size(); i++) {
         System.out.println(i + 1 + "." + cart.get(i));
      }
      // enhanced for loop
      System.out.println("enhanced for loop");
      for (Object item : cart) {
         System.out.println(item);
      }
      cart.clear();
      System.out.println(cart);
   }

   private static void useListWithDataTypes() {
      // List
      // allows duplicates
      // does not sort
      // preserves insertion order
      // allows null
      ArrayList cart = new ArrayList();
      // cart.add(true);
      // cart.add(false);
      // cart.add(true);
      // cart.add(5.5f);
      // cart.add(3.5f);
      // cart.add(5.4f);
      cart.add('c');
      cart.add('c');
      cart.add('a');
      // cart.add('cat');
      // cart.add('cattle');
      // cart.add('cattle');
      Collections.sort(cart);
      System.out.println(cart);
      System.out.println(cart.size());

      // enhanced for loop
      System.out.println("enhanced for loop");
      for (Object item : cart) {
         System.out.println(item);
      }
      cart.clear();
      System.out.println(cart);
   }
}
