package jdbi;

import java.util.List;

import org.skife.jdbi.v2.DBI;

public class SQLObjectAPI {
   public static void main(String[] args) {
      getProducts();
      // insertProduct();
      updateProduct();
      getProducts();
      deleteProduct();
      getProducts();
   }

   private static void getProducts() {
      // This class provides the access point for jDBI.
      // Use it to obtain Handle instances
      DBI dbi = new DBI("jdbc:mysql://localhost:3306/LIVEDB?allowPublicKeyRetrieval=true&useSSL=false", "root",
            "mysql");

      ProductDAO productDAO = dbi.onDemand(ProductDAO.class);
      List<Product> productList = productDAO.productList();
      System.out.println(productList);
      // for(Product product : productList){
      // System.out.println(product);
      // System.out.println(product.getProductId());
      // System.out.println(product.getProductName());
      // System.out.println(product.getPrice());
      // }
   }

   private static void insertProduct() {
      // This class provides the access point for jDBI.
      // Use it to obtain Handle instances
      DBI dbi = new DBI("jdbc:mysql://localhost:3306/LIVEDB?allowPublicKeyRetrieval=true&useSSL=false", "root",
            "mysql");

      ProductDAO productDAO = dbi.onDemand(ProductDAO.class);
      int rowsInserted = productDAO.insertProduct(106, "The Power Of Now", 700);
      System.out.println("No of Rows Inserted : " + rowsInserted);
   }

   private static void updateProduct() {
      // try {
      // Loading the driver
      // Class.forName("com.mysql.cj.jdbc.Driver");
      // Create a DBI which directly uses the DriverManager
      DBI dbi = new DBI("jdbc:mysql://localhost:3306/LIVEDB?allowPublicKeyRetrieval=true&useSSL=false", "root",
            "mysql");
      ProductDAO productDAO = dbi.onDemand(ProductDAO.class);
      int rowsUpdated = productDAO.updateProduct(100, "START WITH WHY NOT?");
      System.out.println("No of Rows Updated : " + rowsUpdated);
   }

   private static void deleteProduct() {
      // try {
      // Loading the driver
      // Class.forName("com.mysql.cj.jdbc.Driver");
      // Create a DBI which directly uses the DriverManager
      DBI dbi = new DBI("jdbc:mysql://localhost:3306/LIVEDB?allowPublicKeyRetrieval=true&useSSL=false", "root",
            "mysql");
      ProductDAO productDAO = dbi.onDemand(ProductDAO.class);
      int rowsDeleted = productDAO.deleteProduct(100);
      System.out.println("No of Rows Deleted : " + rowsDeleted);
   }
}
