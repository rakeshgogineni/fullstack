package com.domain.persistence;

import java.util.List;

import com.hexaware.MLP269.model.Offer;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;

/**
 * OfferDAO class used to fetch data from data base.
 *
 * @author hexware
 */
public interface OfferDAO {
  /**
   * @return the all the offer record.
   */
  @SqlQuery("Select * from Offers")
  @Mapper(OfferMapper.class)
  List<Offer> show();

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
   * @param offerId to initialize offerId.
   * @return the no of offer record deleted. used to get details through
   *         constructor.
   */
  @SqlUpdate(" DELETE FROM OFFERS WHERE OFFER_ID = :offerId")
  int deleteOffer(@Bind("offerId") int offerId);

}
