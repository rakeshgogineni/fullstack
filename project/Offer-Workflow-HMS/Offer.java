package com.domain.model;

/**
 * Offer class used to display menu information.
 *
 * @author hexware
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

}
