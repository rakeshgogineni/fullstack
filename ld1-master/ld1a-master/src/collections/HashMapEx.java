package collections;

import java.util.HashMap;

public class HashMapEx {
   public static void main(String[] args) {
      // Store key value pairs.
      HashMap dictionary = new HashMap();
      // put(Object key, Object value)
      dictionary.put("gargantuan", "a mammoth task");
      dictionary.put("philatelist ", "a person who studies about stamps");
      dictionary.put("aeonian", "lasting for an immeasurably or indefinitely long period of time");
      dictionary.put("gargantuan", "a mammoth task");
      dictionary.put(null, "having no legal or binding force");
      dictionary.put(null, "mounting to nothing");
      dictionary.put("danchikdan", null);
      dictionary.put("jings", null);
      System.out.println(dictionary);
      dictionary.put("hakuna-matata", "No worries");
      String aeonian = (String) dictionary.get("aeonian");
      System.out.println(aeonian);
      // Returns true if this map contains a mapping for the specified key.
      boolean wordExists = dictionary.containsKey("hakuna-potata");
      System.out.println("Word " + wordExists);

      boolean meaningExists = dictionary.containsValue("No worries");
      System.out.println("Meaning: " + meaningExists);

   }
}
