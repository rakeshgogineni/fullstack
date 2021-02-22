:beginner: **JDBI**  



:lock: java.sql.SQLNonTransientConnectionException: Public Key Retrieval is not allowed
enter a valid value 

:key: 
```java
DBI dbi = new DBI("jdbc:mysql://localhost:3306/LIVEDB?allowPublicKeyRetrieval=true&useSSL=false", "root",
            "mysql");
```

:lock: checkstyle for querystring
:key: Break down query string  

```java
      String dbc = System.getenv("DB_CONNECTION");
      String queryString = "/MLP269?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
      if (dbc == null || dbc.equals("")) {
        dbc = "localhost:3306";

      }
      DBI dbi = new DBI("jdbc:mysql://" + dbc + queryString, "MLP269", "MLP269");
```
