package jdbi;
//CREATING THE MODEL
//MODEL CLASS CONTAINS PROPERTIES
public class Product {
      //Properties
      private int productId;
      private String productName;
      private int price;

      //Parameterized Constructor
      public Product(int productId, String productName, int price) {
         this.productId = productId;
         this.productName = productName;
         this.price = price;
      }

      //Getters & Setters
      public int getProductId() {
         return productId;
      }
   
      public void setProductId(int productId) {
         this.productId = productId;
      }
   
      public String getProductName() {
         return productName;
      }
   
      public void setProductName(String productName) {
         this.productName = productName;
      }
   
      public int getPrice() {
         return price;
      }
   
      public void setPrice(int price) {
         this.price = price;
      }

      @Override
      public String toString() {
         return "Product [price=" + price + ", productId=" + productId + ", productName=" + productName + "]";
      }
}
