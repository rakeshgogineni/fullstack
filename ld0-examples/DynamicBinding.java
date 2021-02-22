public class DynamicBinding {
   public static void main(String[] args) {
      // createSolarLight();
      createSolarLightDynamicPolymorphism();
   }

   private static void createSolarLightDynamicPolymorphism() {
      // SIMPLE WAY OF CREATING OBJECTS
      // Creating the reference
      SolarLight solarLightObject = null;
      // creating the instance (object)
      // the solarLightObject is dynamically attached to an instance of Sun.
      solarLightObject = new Sun();
      String lighting = solarLightObject.ligthing();
      System.out.println(lighting);
      System.out.println(solarLightObject.heating());
      System.out.println(solarLightObject.energy());
   }

   private static void createSolarLight() {
      // SIMPLE WAY OF CREATING OBJECTS
      // Creating the reference
      SolarLight solarLightObject = null;
      // creating the instance (object)
      solarLightObject = new SolarLight();
      String lighting = solarLightObject.ligthing();
      System.out.println(lighting);
      System.out.println(solarLightObject.heating());
      System.out.println(solarLightObject.energy());
      // ERRORS
      // solarLightObject.gases();
      // solarLightObject.rays();
      // Sun sun = new SolarLight();
   }
}

class SolarLight {
   String ligthing() {
      return "light till 300 mts";
   }

   String heating() {
      return "heat till 50 mts";
   }

   public String energy() {
      return "traditional energy";
   }
}

class Sun extends SolarLight {
   // overriding the base class method
   public String energy() {
      return "solar energy";
   }

   public String[] gasses() {
      String gases[] = { "Carbon dioxide (CO2)", "Methane (CH4 )" };

      return gases;

   }

   public String rays() {
      String rays = "infrared ,ultraviolet rays";
      return rays;
   }
}