package jdbi;

import java.util.List;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;

// Data Access Object (DAO)
// Used by the app to get data from the backend.
public interface ProductDAO {

   @SqlQuery("SELECT * FROM PRODUCTS")
   @Mapper(ProductMapper.class)
   List<Product> productList();

   @SqlUpdate("INSERT INTO PRODUCTS(PRODUCT_ID, PRODUCT_NAME, PRICE) VALUES(:productId, :productName, :price)")
   int insertProduct(@Bind("productId") int productId, @Bind("productName") String productName,
         @Bind("price") int price);

   // Used to indicate that a method should execute a non-query sql statement
   @SqlUpdate(" UPDATE PRODUCTS SET PRODUCT_NAME = :productName WHERE PRODUCT_ID = :productId")
   int updateProduct(@Bind("productId") int productId, @Bind("productName") String productName);

   // Used to indicate that a method should execute a non-query sql statement
   @SqlUpdate("DELETE FROM PRODUCTS WHERE PRODUCT_ID = :productId")
   int deleteProduct(@Bind("productId") int productId);

}
