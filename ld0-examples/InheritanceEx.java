class Pizza {
   // Fields
   public String addOns = "Cheese";
   public String bread = "WheatBread";
   public String sauces[] = { "tomato", "chilli" };

   public void baking() {
      System.out.println("Bread baked directly inside oven");
   }

   public void packing() {
      System.out.println("Inside a cardboard carton!");
   }
}

class BurgerPizza extends Pizza {
   // Fields
   public String patty = "veg";
   public String fillings = "lettuce";

   // @Override
   public void baking() {
      System.out.println("Patty baked inside oven");
   }
   // @Override
   public void eating() {
      System.out.println("Eaten without cutting into pieces");
   }
}

public class InheritanceEx {
   public static void main(String[] args) {
      System.out.println("PIZZA");
      Pizza vegSupreme = new Pizza();
      System.out.println(vegSupreme.addOns);
      System.out.println(vegSupreme.sauces[0]);
      System.out.println(vegSupreme.sauces[1]);
      vegSupreme.baking();
      vegSupreme.packing();

      System.out.println("BURGERPIZZA");
      BurgerPizza vegBurgerPizza = new BurgerPizza();
      System.out.println(vegBurgerPizza.addOns);
      System.out.println(vegBurgerPizza.sauces[0]);
      System.out.println(vegBurgerPizza.sauces[1]);
      System.out.println(vegBurgerPizza.patty);
      System.out.println(vegBurgerPizza.fillings);
      vegBurgerPizza.baking();
      vegBurgerPizza.packing();
   }
}