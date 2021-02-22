package jdbi;

import java.util.List;
import java.util.Map;

import org.skife.jdbi.v2.DBI;
import org.skife.jdbi.v2.Handle;
import org.skife.jdbi.v2.Query;

public class FluentAPIApp {
   public static void main(String[] args) {
      //Using JDBI API
      //JDBI Fluent ApI
      // This represents a connection to the database system.
      Handle connectionHandle = null;
      // This class provides the access point for jDBI. 
      // Use it to obtain Handle instances
      DBI dbi = new DBI("jdbc:mysql://localhost:3306/LIVEDB?allowPublicKeyRetrieval=true&useSSL=false", "root", "mysql");
      // Construct the SQL String
      String sql = "SELECT * FROM PRODUCTS";

      try{
         // Obtain a Handle to the data source wrapped by this DBI instance
         connectionHandle = dbi.open();
         // Return a default Query instance which can be executed later, as long as this handle remains open.
         Query<Map<String,Object>> selectQuery = connectionHandle.createQuery(sql);
         // Executes the select and Will eagerly load all results
         List<Map<String,Object>> productsListOfMaps = selectQuery.list();

         //Itearte the list and print the results
         for(Map<String,Object> productMap : productsListOfMaps ){
            System.out.print(productMap.get("PRODUCT_ID") + "\t");
            System.out.print(productMap.get("PRODUCT_NAME") + "\t");
            System.out.println(productMap.get("PRICE"));
         }
         
      } finally{
         // System.out.println("Perform cleanup operations, executes always");
         if(connectionHandle !=null){
            connectionHandle.close();
         }
      }
   }
}
