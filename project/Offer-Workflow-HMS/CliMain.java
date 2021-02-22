package com.domain.util;

import java.util.List;
import java.util.Scanner;

import com.domain.factory.RoomFactory;
import com.domain.model.Room;
import com.hexaware.MLP269.factory.OfferFactory;
import com.hexaware.MLP269.model.Offer;

/**
 * CliMain used as Client interface for java coading.
 *
 * @author hexware
 */
public class CliMain {
  private Scanner option = new Scanner(System.in, "UTF-8");

  /**
   * mainRoom method used to display the option we had in the application.
   */
  private void mainRoom() {
    System.out.println("Hotel Management System");
    System.out.println("-----------------------");
    System.out.println("1. Show Room");
    System.out.println("2. Exit");
    System.out.println("3. Offers");
    System.out.println("4. Add Offer");
    System.out.println("5. Delete Offer");
    mainRoomDetails();
  }

  /**
   * mainRoomDetails method process the option selected from main menu.
   */
  private void mainRoomDetails() {
    try {
      System.out.println("Enter your choice:");
      int roomOption = option.nextInt();
      switch (roomOption) {
        case 1:
          showFullRoom();
          break;
        case 2:
          Runtime.getRuntime().halt(0);
          break;
        case 3:
          showOffers();
          break;
        case 4:
          addOffer();
          break;
        case 5:
          deleteOffer();
          break;
        default:
          System.out.println("Choose your choice");
      }
    } catch (Exception e) {
      System.out.println(e);
      System.out.println("enter a valid value");
    }
    option.nextLine();
    mainRoom();
  }

  /**
   * showFullRoom method display the room details stored in database.
   */
  private void showFullRoom() {
    Room[] room = RoomFactory.showRoom();
    System.out.println("Room_Id");
    for (Room m : room) {
      System.out.println(m.getRoomNo());
    }
  }

  /**
   * showOffers method display the room details stored in database.
   */
  private void showOffers() {
    List<Offer> offersList = OfferFactory.showOffer();
    System.out.println(offersList);
  }

  /**
   * addOffer method display the room details stored in database.
   */
  private void addOffer() {
    int offerId = 5;
    String offerName = "Wednesday Offer";
    float offerValue = 50.50f;
    Offer offer = new Offer(offerId, offerName, offerValue);
    int rowsInserted = OfferFactory.insertOffer(offer);
    if (rowsInserted > 0) {
      System.out.println("Offer inserted successfully!");
    }
  }
  /**
   *  method display the room details stored in database.
   */
  private void deleteOffer() {
    int rowsDeleted = OfferFactory.deleteOffer(5);
    if (rowsDeleted > 0) {
      System.out.println("Offer deleted successfully!");
    }
  }

  /**
   * /** main method is the basic entry point for the application.
   *
   * @param args used to get the user input.
   */
  public static void main(final String[] args) {
    final CliMain mainObj = new CliMain();
    mainObj.mainRoom();
  }
}
