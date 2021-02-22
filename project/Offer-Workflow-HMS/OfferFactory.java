package com.domain.factory;

import java.util.List;

import com.domain.model.Offer;
import com.domain.persistence.DbConnection;
import com.domain.persistence.OfferDAO;

/**
 * OfferFactory class used to fetch offer data from database.
 *
 * @author hexware
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

  // public static Offer[] showOffer() {
  // OfferDAO offerDAO = dao();
  // List<Offer> offerList = offerDAO.show();
  // return offerList.toArray(new Offer[offerList.size()]);
  // }
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
   * @param offer to initialize offer.
   * @return the connection object.
   */

  public static int insertOffer(final Offer offer) {
    OfferDAO offerDAO = dao();
    int offerId = offer.getOfferId();
    String offerName = offer.getOfferName();
    float offerValue = offer.getOfferValue();
    int rowsInserted = offerDAO.insertOffer(offerId, offerName, offerValue);
    return rowsInserted;
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

  // ProductDAO productDAO = dbi.onDemand(ProductDAO.class);
  // int rowsUpdated = productDAO.updateProduct(100, "START WITH WHY NOT?");
  // System.out.println("No of Rows Updated : " + rowsUpdated);
}
