//Class encapsulates member variables and functions
class Mobile {
   // member variables
   // private members are accessible only in the class they are declared.
   // private String model = "Galaxy";
   // private double cost = 5.5d;
   // private int pixels = 1080;

   /// public members are accessible by other classes.
   public String model = "Galaxy";
   public double cost = 5.5d;

   // By default, the variables and methods of a class are accessible to members of
   // the class itself and to other classes in the same package.
   // default member
   int pixels = 1080;

   // member functions
   // private void displayDetails() {
   public void displayDetails() {
      System.out.println(model);
      System.out.println(cost);
      System.out.println(pixels);
   }

   // public static void main(String[] args) {
   // // Create an object
   // Mobile samsung = new Mobile();
   // System.out.println(samsung.model);
   // System.out.println(samsung.cost);
   // System.out.println(samsung.pixels);
   // }
}

class AndroidPhone extends Mobile {
   public String software = "Android 11";

   public void getOS() {
      System.out.println(software);
   }
}

class MobileUser {
   public static void main(String[] args) {
      // Create an object
      // Reference AndroidPhone samsung;
      // Instance new AndroidPhone();
      AndroidPhone samsung = new AndroidPhone();
      System.out.println(samsung.model);
      System.out.println(samsung.cost);
      System.out.println(samsung.pixels);
      System.out.println(samsung.software);
      System.out.println("**********************");
      samsung.displayDetails();
      samsung.getOS();
   }
}