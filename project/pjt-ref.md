:one:   DBI
```java
      DBI dbi = new DBI("jdbc:mysql://localhost:3306/LIVEDB?allowPublicKeyRetrieval=true&useSSL=false", "root",
            "mysql");
```
```java
public class DbConnection {
    /**
     * Connecting to MYSQL DB.
     * @return database Connection.
     */
  public final DBI getConnect() {
    try {
      // Class.forName("com.mysql.cj.jdbc.Driver");
      // String dbc = System.getenv("DB_CONNECTION");
      // if (dbc == null || dbc.equals("")) {
        // dbc = "localhost:3306";
      // }
      // DBI dbi = new DBI("jdbc:mysql://" + dbc + "/MLP272?useSSL=false", "MLP272", "MLP272");
      DBI dbi = new DBI("jdbc:mysql://localhost:3306/MLP272?useSSL=false", "MLP272", "MLP272");
      return dbi;
    } catch (Exception e) {
      // throw new RuntimeException(e);
      System.out.println(e);
      return null;
    }
  }
```
:two: ProductDAO
```java
ProductDAO productDAO = dbi.onDemand(ProductDAO.class);
```
```java 
// class RoomFactory 
private static RoomDAO dao() {
    DbConnection db = new DbConnection();
    return db.getConnect().onDemand(RoomDAO.class);
  }
```
:three: ProductDAO
```java
public interface ProductDAO {

   @SqlQuery("SELECT * FROM PRODUCTS")
   @Mapper(ProductMapper.class)
   List<Product> productList();
```
```java
public interface RoomDAO {
    /**
     * @return the all the Room record.
     */
  @SqlQuery("Select * from Room")
    @Mapper(RoomMapper.class)
    List<Room> show();
}
```
:four: Model Product  
```java
public class Product {
      //Properties
      private int productId;
      private String productName;
      private int price;
```
```java
public class Room {
  private int roomNo;
```

:five: Mapper ProductMapper  
```java
public class ProductMapper implements ResultSetMapper<Product> {

   @Override
   public Product map(int index, ResultSet resultSet, StatementContext statementContext) throws SQLException {
       int productId = resultSet.getInt("PRODUCT_ID");
       String productName = resultSet.getString("PRODUCT_NAME");
       int price = resultSet.getInt("PRICE");
       Product product = new Product(productId, productName, price);
      return product;
   }
}
```
```java
public class RoomMapper implements ResultSetMapper<Room> {
  public final Room map(final int idx, final ResultSet rs, final StatementContext ctx) throws SQLException {
    return new Room(rs.getInt("ROOM_NO"));
  }
}
```
:six:   App
```java
List<Product> productList = productDAO.productList();
      System.out.println(productList);
```
```java
 Room[] room = RoomFactory.showRoom();
```
```java
// RoomFactory
  public static Room[] showRoom() {
    List<Room> room = dao().show();
    return room.toArray(new Room[room.size()]);
  }
```
