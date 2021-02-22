:beginner: **create database**  

```sql
-- CREATE AND USE DATABASE
CREATE DATABASE PROJECTV1;
DROP DATABASE PROJECTV1;
USE PROJECTV1;
SHOW TABLES;
-- Granting Permissions
-- Drop user 'PROJECT'@'localhost';
CREATE USER 'PROJECTV1'@'localhost' IDENTIFIED BY 'PROJECTV1';
GRANT ALL ON PROJECTV1.* TO 'PROJECTV1'@'localhost';
```

```sql
-- OFFERS MODULE
CREATE TABLE OFFERS(OFFER_ID INT UNIQUE,
 OFFER_NAME VARCHAR(30),
 OFFER_VALUE FLOAT);
 
 INSERT INTO OFFERS(OFFER_ID,OFFER_NAME,OFFER_VALUE) VALUES 
 (1, 'REPUBLIC DAY OFFER', 250),
 (2, 'FEB SALE OFFER', 350);
 
 SELECT * FROM OFFERS;
 DELETE FROM OFFERS WHERE OFFER_ID = 3;
 DROP TABLE OFFERS;
```

:beginner: **MODEL**  
```java
package com.PROJECT.model;

/**
 * Offer class used to display menu information.
 *
 * @author Trump
 */
public class Offer {
  private int offerId;
  private String offerName;
  private float offerValue;

  /**
   * Default Constructor.
   */
  public Offer() {
  }

  /**
   * @param argOfferId    to initialize offerId.
   * @param argOfferName  to initialize offerName.
   * @param argOfferValue to initialize offerValue. used to get details through
   *                      constructor.
   */
  public Offer(final int argOfferId, final String argOfferName, final float argOfferValue) {
    this.offerId = argOfferId;
    this.offerName = argOfferName;
    this.offerValue = argOfferValue;
  }

  /**
   * @return this offerId.
   */
  public final int getOfferId() {
    return offerId;
  }

  /**
   * @param argOfferId assigns the offerId.
   */
  public final void setOfferId(final int argOfferId) {
    this.offerId = argOfferId;
  }

  /**
   * @return this offerName.
   */
  public final String getOfferName() {
    return offerName;
  }

  /**
   * @param argOfferName assigns the offerName.
   */
  public final void setOfferName(final String argOfferName) {
    this.offerName = argOfferName;
  }

  /**
   * @return this offerValue.
   */
  public final float getOfferValue() {
    return offerValue;
  }

  /**
   * @param argOfferValue assigns the offerValue.
   */
  public final void setOfferValue(final float argOfferValue) {
    this.offerValue = argOfferValue;
  }

  @Override
  public final String toString() {
    return "Offer [offerId=" + offerId + ", offerName=" + offerName + ", offerValue=" + offerValue + "]";
  }

  @Override
  public final int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + offerId;
    int value = 0;
    if (offerName != null) {
      value = offerName.hashCode();
    }
    result = prime * result + value;
    result = prime * result + Float.floatToIntBits(offerValue);
    return result;
  }

  @Override
  public final boolean equals(final Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Offer other = (Offer) obj;
    if (offerId != other.offerId) {
      return false;
    }
    if (offerName == null) {
      if (other.offerName != null) {
        return false;
      }
    } else if (!offerName.equals(other.offerName)) {
      return false;
    }
    if (Float.floatToIntBits(offerValue) != Float.floatToIntBits(other.offerValue)) {
      return false;
    }
    return true;
  }

}

```

:beginner: **Mapper**  
```java
package com.PROJECT.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.PROJECT.model.Offer;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

/**
 * OfferMapper class used to fetch offer data from database.
 *
 * @author Trump
 */
public class OfferMapper implements ResultSetMapper<Offer> {
  /**
   * @param index     the index
   * @param resultSet the resultset
   * @param ctx       the context
   * @return the mapped customer object
   * @throws SQLException in case there is an error in fetching data from the
   *                      resultset
   */
  public final Offer map(final int index, final ResultSet resultSet, final StatementContext ctx) throws SQLException {

    // Populate the values from database table
    int offerId = resultSet.getInt("OFFER_ID");
    String offerName = resultSet.getString("OFFER_NAME");
    float offerValue = resultSet.getFloat("OFFER_Value");
    Offer offer = new Offer();
    offer.setOfferId(offerId);
    offer.setOfferName(offerName);
    offer.setOfferValue(offerValue);

    // retrun the offer instance
    return offer;
  }

}

```

:beginner: **DAO**  
```java
package com.PROJECT.persistence;

import java.util.List;

import com.PROJECT.model.Offer;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;

/**
 * OfferDAO class used to fetch data from data base.
 *
 * @author Trump
 */
public interface OfferDAO {
  /**
   * @return the all the offer record.
   */
  @SqlQuery("Select * from Offers")
  @Mapper(OfferMapper.class)
  List<Offer> show();

  /**
   * @return the specific offer record by offerId.
   * @param offerId to initisalize offerid
   */
  @SqlQuery("Select * from Offers where offer_id = :offerId")
  @Mapper(OfferMapper.class)
  Offer getOfferById(@Bind("offerId") int offerId);

  /**
   * @param offerId    to initialize offerId.
   * @param offerName  to initialize offerName.
   * @param offerValue to initialize offerValue.
   * @return the no of updated offer record. used to get details through
   *         constructor.
   */
  @SqlUpdate("insert into Offers (Offer_Id,Offer_Name,Offer_Value) values(:offerId,:offerName,:offerValue)")
  int insertOffer(@Bind("offerId") int offerId, @Bind("offerName") String offerName,
      @Bind("offerValue") float offerValue);

  /**
   * @param offerId    to initialize offerId.
   * @param offerName  to intitialize offerName
   * @param offerValue to intitialize offerValue
   * @return the no of offer record deleted. used to get details through
   *         constructor.
   */
  @SqlUpdate("Update offers set offer_Name = :offerName , Offer_value =:offerValue where offer_id= :offerId")
  int updateOffers(@Bind("offerId") int offerId, @Bind("offerName") String offerName,
      @Bind("offerValue") float offerValue);

  /**
   * @param offerId to initialize offerId.
   * @return the no of offer record deleted. used to get details through
   *         constructor.
   */
  @SqlUpdate(" DELETE FROM OFFERS WHERE OFFER_ID = :offerId")
  int deleteOffer(@Bind("offerId") int offerId);
}

```
:beginner: **DBConnection**  
```java
package com.PROJECT.persistence;

import org.skife.jdbi.v2.DBI;

/**
 */
public class DbConnection {
    /**
     * Connecting to MYSQL DB.
     * @return database Connection.
     */
  public final DBI getConnect() {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      String dbc = System.getenv("DB_CONNECTION");
      String queryString = "/PROJECTV1?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
      if (dbc == null || dbc.equals("")) {
        dbc = "localhost:3306";
      }
      DBI dbi = new DBI("jdbc:mysql://" + dbc + queryString, "PROJECTV1", "PROJECTV1");
      return dbi;
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
}

```


:beginner: **FACTORY**  
```java
package com.PROJECT.factory;

import java.util.List;

import com.PROJECT.model.Offer;
import com.PROJECT.persistence.DbConnection;
import com.PROJECT.persistence.OfferDAO;

/**
 * OfferFactory class used to fetch offer data from database.
 *
 * @author Trump
 */
public class OfferFactory {
  /**
   * Protected constructor.
   */
  protected OfferFactory() {

  }

  /**
   * Call the data base connection.
   *
   * @return the connection object.
   */
  private static OfferDAO dao() {
    DbConnection db = new DbConnection();
    return db.getConnect().onDemand(OfferDAO.class);
  }

  /**
   * Call the data base connection.
   *
   * @return the connection object.
   */
  public static List<Offer> showOffer() {
    OfferDAO offerDAO = dao();
    return offerDAO.show();
  }

  /**
   * Call the data base connection.
   *
   * @param offerId to initialize offer.
   * @return the offer object.
   */
  public static Offer getOfferById(final int offerId) {
    return dao().getOfferById(offerId);
  }

  /**
   * Call the data base connection.
   *
   * @param offer to initialize offer.
   * @return the connection object.
   */

  public static int insertOffer(final Offer offer) {
    OfferDAO offerDAO = dao();
    int offerId = offer.getOfferId();
    String offerName = offer.getOfferName();
    float offerValue = offer.getOfferValue();
    return offerDAO.insertOffer(offerId, offerName, offerValue);
  }
  /**
   * Call the data base connection.
   *
   * @param offer to initialize offer.
   * @return the connection object.
   */
  public static int updateOffer(final Offer offer) {
    OfferDAO offerDAO = dao();
    int offerId = offer.getOfferId();
    String offerName = offer.getOfferName();
    float offerValue = offer.getOfferValue();
    return offerDAO.updateOffers(offerId, offerName, offerValue);
  }

  /**
   * Call the data base connection.
   *
   * @param offerId to initialize offer.
   * @return the connection object.
   */

  public static int deleteOffer(final int offerId) {
    OfferDAO offerDAO = dao();
    return offerDAO.deleteOffer(offerId);
  }
}

```

:beginner: **CLIMain**
```java
private void offerModule() {
    System.out.println("******************************************************************");
    System.out.println("1: Show Offers");
    System.out.println("2: Update Offers");
    System.out.println("3: Add Offers");
    System.out.println("4: Delete Offers");
    System.out.println("******************************************************************");
    int offerOption = option.nextInt();
    switch (offerOption) {
      case 1:
        showOffers();
        break;
      case 2:
        updateOffer();
        break;
      case 3:
        addOffer();
        break;
      case 4:
        deleteOffer();
        break;
      default:
        System.out.println("Enter your Option");
    }
  }

```

:beginner: **JUNIT**  
```java
package com.PROJECT;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.List;

import com.PROJECT.factory.OfferFactory;
import com.PROJECT.model.Offer;
import com.PROJECT.persistence.OfferDAO;

import org.junit.Test;
import org.junit.runner.RunWith;

import mockit.Expectations;
import mockit.Mock;
import mockit.MockUp;
import mockit.Mocked;
import mockit.integration.junit4.JMockit;

/**
 * Test class for Offer.
 */
@RunWith(JMockit.class)
public class OfferTest {
  /**
   * Tests the equals/hashcode methods of the offer class.
   */
  @Test
  public final void testOffer() {
    // Create an Offer and test for nullability
    Offer offer1 = new Offer(100, "Aishwarya", 250.0f);
    assertNotEquals(offer1, null);
    // Two offers have equal values
    Offer offer2 = new Offer(100, "Aishwarya", 250.0f);
    assertEquals(offer1.hashCode(), offer2.hashCode());
    // Check for offer name
    Offer offer3 = new Offer(1001, "Aish", 500.0f);
    // Compare two offers for values.
    assertNotEquals(offer2.getOfferName(), offer3.getOfferName());
    assertEquals(offer1.getOfferName(), offer2.getOfferName());
    // offerId
    assertNotEquals(offer2.getOfferId(), offer3.getOfferId());
    assertEquals(offer1.getOfferId(), offer2.getOfferId());
    // offerValue
    assertNotEquals(offer2.getOfferValue(), offer3.getOfferValue());
    assertEquals(offer1.getOfferValue(), offer2.getOfferValue(), 0.0f);
    Offer offer4 = new Offer();
    offer4.setOfferId(1);
    offer4.setOfferName("Republic Day Offer");
    offer4.setOfferValue(500.50f);
    Offer offer5 = new Offer(1, "Republic Day Offer", 500.50f);
    assertEquals(offer4.getOfferId(), offer5.getOfferId());
    assertEquals(offer4.getOfferName(), offer5.getOfferName());
    assertEquals(offer4.getOfferValue(), offer5.getOfferValue(), 0.0f);
    assertNotEquals(offer4.toString(), offer1.toString());
  }

  /**
   * Tests the equals/hashcode methods of the offer class.
   */
  @Test
  public final void testOfferEquality() {
    // Create an Offer and test for nullability
    Offer offer1 = new Offer(100, "Aishwarya", 250.0f);
    Offer offer2 = new Offer(1001, "Aishwarya", 250.0f);
    Offer offer3 = new Offer(1001, "Aish", 250.0f);
    Offer offer4 = new Offer(1001, "Aish", 2500.0f);
    Offer offer5 = new Offer(1001, null, 2500.0f);
    Offer offer6 = new Offer(100, "Aishwarya", 250.0f);
    //Offer offer7 = new Offer(1001, "Aish", 250.0f);
    assertNotEquals(offer1, null);
    assertEquals(offer1, offer1);
    assertNotEquals(offer1, new Object());
    assertNotEquals(offer1, offer2);
    assertNotEquals(offer2, offer3);
    assertNotEquals(offer3, offer4);
    assertNotEquals(offer5, offer4);
    assertEquals(offer1, offer6);
  }

  /**
   * tests that empty room list is handled correctly.
   *
   * @param pDao mocking the dao class
   */
  @Test
  public final void testListAllEmpty(@Mocked final OfferDAO pDao) {
    new Expectations() {
      {
        // result = pDao.show();
        pDao.show();
        result = new ArrayList<Offer>();
      }
    };
    new MockUp<OfferFactory>() {
      @Mock
      OfferDAO dao() {
        return pDao;
      }

    };
    List<Offer> offersList = OfferFactory.showOffer();
    assertEquals(0, offersList.size());
  }

  /**
   * Tests that a list with some roomdetails are handled correctly.
   *
   * @param pDao mocking the dao class
   */
  @Test
  public final void testListAllSoSome(@Mocked final OfferDAO pDao) {
    final Offer offer1 = new Offer(100, "Aishwarya", 250.0f);
    final Offer offer2 = new Offer(101, "Aish", 500.0f);
    final List<Offer> offersList = new ArrayList<Offer>();
    new Expectations() {
      {
        offersList.add(offer1);
        offersList.add(offer2);
        pDao.show();
        result = offersList;
      }
    };
    new MockUp<OfferFactory>() {
      @Mock
      OfferDAO dao() {
        return pDao;
      }

    };

    List<Offer> offersListNew = OfferFactory.showOffer();
    final Offer offer3 = new Offer(100, "Aishwarya", 250.0f);
    assertEquals(2, offersListNew.size());
    assertEquals(offer3.getOfferValue(), offersListNew.get(0).getOfferValue(), 0.0F);
  }
}

```

```sh
mvn test
```

:beginner: **REST**  
```java
package com.PROJECT.util;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.PROJECT.factory.OfferFactory;
import com.PROJECT.model.Offer;
//import com.PROJECT.persistence.OfferDAO;

/**
 * This class provides a REST interface for the Offer entity.
 */
@Path("/offer")
public class OfferRest {
  /**
   * Returns Offer details.
   *
   * @return the Offer details
   */
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public final List<Offer> showOffers() {
    return OfferFactory.showOffer();
  }

  /**
   * Returns Offer details by offerId.
   *
   * @return the Offer details
   * @param offerId to initializze offerId
   */
  @GET
  @Path("/{offerId}")
  @Produces(MediaType.APPLICATION_JSON)
  public final Offer getOfferById(@PathParam("offerId") final int offerId) {
    final Offer offer = OfferFactory.getOfferById(offerId);
    if (offer == null) {
      throw new NotFoundException("Offer with offerId : " + offerId + " does not exist!");
    }
    return offer;
  }

  /**
   * Returns Offer details by offerId.
   *
   * @return the Offer details
   * @param offer to initializze offerId
   */
  @POST
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_JSON)
  public static final int insertOffer(final Offer offer) {
    return OfferFactory.insertOffer(offer);
  }

  /**
   * Returns Offer details by offerId.
   * @return the Offer details
   * @param offerId to initializze offerId
   */
  @DELETE
  @Path("/{offerId}")
  @Produces(MediaType.APPLICATION_JSON)
  public static final int deleteOffer(@PathParam("offerId") final int offerId) {
    return OfferFactory.deleteOffer(offerId);
  }

  /**
   * Returns Offer details by offerId.
   *
   * @return the Offer details
   * @param offer to initializze offerId
   */
  @PUT
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_JSON)
  public final int update(final Offer offer) {
    System.out.println(offer);
    return OfferFactory.updateOffer(offer);
  }

}

```

:beginner: **ANGULAR**  

:beginner: **Model**  
```ts
export class Offer {
    // constructor(offerId:number,offerName:string,offerValue:number){
    // }
    offerId:number;
    offerName:string;
    offerValue:number;
}

// export class Course
// {
//   courseId: number;
//   courseName: string;
//   courseAuthor: string;
//   courseDescription: string;
//   coursePrice: number;
// }
```


:beginner: **Offers Component**
```html
<br>
<body>
  <div>
    <h1>
  
      Offer details
      
    </h1>
  
  </div>
  <br>
  <br>
  <br>
  
  <div class="bg">
  
    <table align="center">
  
      <thead>
  
        <tr>
  
          <th size=4>OFFER ID</th>
  
          <th size=4>OFFER NAME</th>
  
          <th size=4>OFFER VALUE</th>
  
  
        </tr>
  
      </thead>
      <tbody>
        <tr *ngFor='let offer of offers'>
  
          <td size=4>
            <h5>{{offer.offerId}}</h5>
          </td>
          <td size=4>
            <h5>{{offer.offerName}}</h5>
          </td>
          <td size=4>
            <h5>{{offer.offerValue}}</h5>
          </td>
  
          <td>

            <button (click)="deleteOffer(offer.offerId)" class="btn btn-danger">Delete</button>
            <button (click)="updateOffer(offer.offerId)" class="btn btn-warning" style="margin-left: 10px">Update</button>
  
          </td>
  
        </tr>
        <tr *ngIf="!offers || offers.length==0">
          <td colspan="12">
            No Offers available
          </td>
        </tr>
      </tbody>
    </table>
  
  </div>  
</body>

```
```ts
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Offer } from './Offer';
import { OfferService } from './offer.service';

@Component({
  selector: 'app-offers',
  templateUrl: './offers.component.html',
  styleUrls: ['./offers.component.css']
})
export class OffersComponent implements OnInit {
errorMsg: any;
offers : Offer[];
  constructor(private offerService:OfferService,private router: Router) { }

  ngOnInit() {
    this.offerService.getOffers().subscribe(
    data => this.offers = data,
    error => this.errorMsg = error
    );
  }

  updateOffer(offerId: number) {
    this.router.navigate(['/updateOffer', offerId]);
  }

  deleteOffer(offerId: number) {
    this.offerService.deleteOffer(offerId).subscribe(
      (data) => {
        console.log(data);
        this.reloadData();
      },
      (error) => console.log(error)
    );
  }

  reloadData() {
    this.offerService.getOffers().subscribe(
      data => this.offers = data,
      error => this.errorMsg = error
      );
  }

  // OfferDetails(id: number) {
  //   console.log('id: ' + id);
  //   this.router.navigate(['/eGalaxy/Offers/details', id]);
  // }

  // updateOffer(offerId: number) {
   
  // }
}

```

:beginner: **Service**  
```ts
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Offer } from './Offer';

@Injectable({
  providedIn: 'root'
})
export class OfferService {

  private url = 'http://localhost:26910/PROJECT/api/offer';

  constructor(private httpClient: HttpClient) { }

  getOffers(): Observable<Offer[]> {
    return this.httpClient.get<Offer[]>(`${this.url}`);
  }

  getOffer(offerId : number): Observable<any>
  {
      return this.httpClient.get(`${this.url}/${offerId}`);
  }
  
  createOffer(offer: Object): Observable<Object> {
    return this.httpClient.post(`${this.url}`, offer);
  }

  updateOffer(offer: any): Observable<Object> {
    return this.httpClient.put(`${this.url}`, offer);
  }
  deleteOffer(offerId: number): Observable<any> {
    return this.httpClient.delete(`${this.url}/${offerId}`, { responseType: 'text' });
  }

}

```

:beginner: **Create Offer Component**  
```html

<body>
    <div>
        <form (ngSubmit)="onSubmit()" style="width: 400px; padding-left: 50px;">
            <div class="form-group">
                <label for="offerId">Offer Id</label>
                <input type="text" id="offerId" name="offerId" class="form-control" required [(ngModel)]="offer.offerId">
            </div>
            <div class="form-group">
                <label for="offerName">Offer Name</label>
                <input type="text" id="offerName" name="offerName" class="form-control" required [(ngModel)]="offer.offerName">
            </div>
            <div class="form-group">
                <label for="offerValue">Offer Value</label>
                <input type="text" id="offerValue" name="offerValue" class="form-control" required [(ngModel)]="offer.offerValue">
            </div>
            <button type="submit" class="btn btn-success">Submit</button>
        </form>
    </div>
</body>
```
```ts
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Offer } from '../offers/Offer';
import { OfferService } from '../offers/offer.service';


@Component({
  selector: 'app-create-offer',
  templateUrl: './create-offer.component.html',
  styleUrls: ['./create-offer.component.css']
})
export class CreateOfferComponent implements OnInit {

offer: Offer = new Offer();
  constructor(private offerService:OfferService,
    private router: Router) { }

  ngOnInit() {
  }

  // newOffer(): void
  // {
  //   this.offer = new  Offer();
  // }

  save()
  {
    this.offerService.createOffer(this.offer)
    .subscribe(data => console.log(data), error => console.log(error));
    this.offer = new Offer();
    this.goToList();
  }
  
  onSubmit()
  {
    // this.submitted = true;
    this.save();  
  }

  goToList(){
    this.router.navigate(['/offers']);
  }
}

```

:beginner: **Update Offer Component**  
```html
<body>
  <h3>Update Offer</h3>
  <div [hidden]="submitted" style="width: 400px;">
    <form (ngSubmit)="onSubmit()">
      <div class="form-group">
        <label for="offerId">Offer Id</label>
        <input type="text" class="form-control" id="offerId" required [(ngModel)]="offer.offerId" name="offerId" />
      </div>

      <div class="form-group">
        <label for="offerValue">Offer Value</label>
        <input type="text" class="form-control" id="offerValue" required [(ngModel)]="offer.offerValue"
          name="offerValue" />
      </div>

      <button type="submit" class="btn btn-info">Update</button>
    </form>
  </div>

</body>
```
```ts
import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Offer } from '../offers/Offer';
import { OfferService } from '../offers/offer.service';

@Component({
  selector: 'app-update-offer',
  templateUrl: './update-offer.component.html',
  styleUrls: ['./update-offer.component.css']
})
export class UpdateOfferComponent implements OnInit {
  offer: Offer;
  offerId: number;
  constructor(private offerService:OfferService,private router: Router,private route: ActivatedRoute) { }

  ngOnInit() {
    this.offer = new Offer();
      this.offerId = this.route.snapshot.params['offerId'];
      this.offerService.getOffer(this.offerId)
        .subscribe(data => {
          console.log(data)
          this.offer = data;
        }, error => console.log(error));
  }
  updateOffer()
    {
      this.offerService.updateOffer(this.offer)
      .subscribe(data => console.log(data), error => console.log(error))
      this.offer = new Offer();
      this.gotoList();
    }

    onSubmit() {
      this.updateOffer();    
    }

    gotoList()
    {
      this.router.navigate(['/offers']);
    }

}
```

:beginner: **AppModule**  
```ts
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { OffersComponent } from './offers/offers.component';
import { CreateOfferComponent } from './create-offer/create-offer.component';
import { UpdateOfferComponent } from './update-offer/update-offer.component';


@NgModule({ 
  declarations: [
    AppComponent,
    OffersComponent,
    CreateOfferComponent,
    UpdateOfferComponent,
  ],
  imports: [
    BrowserModule, HttpClientModule,
    RouterModule.forRoot([
      { path: 'offers', component:OffersComponent },
      {path: 'insertOffer', component:CreateOfferComponent},
      {path: 'updateOffer/:offerId', component:UpdateOfferComponent},
  
    ]),
    FormsModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

```



:beginner: **bootstrap library**  
```html
// styles.css
@import url('https://unpkg.com/bootstrap@3.3.7/dist/css/bootstrap.min.css');
```


  




  




