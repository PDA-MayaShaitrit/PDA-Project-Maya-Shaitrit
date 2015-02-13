package com.mrjaffesclass.apcs.mvc.template;
import com.mrjaffesclass.apcs.messenger.*;
/**
 * The model represents the data that the app uses.
 * @author Roger Jaffe
 * @version 1.0
 */
public class Model implements MessageHandler {
  // Messaging system for the MVC
  private final Messenger mvcMessaging;
  // Model's data variables
  private int lower;
  private int upper;
  private int difference;
  /**
   * Model constructor: Create the data representation of the program
   * @param messages Messaging class instantiated by the Controller for 
   *   local messages between Model, View, and controller
   */
  public Model(Messenger messages) {
    mvcMessaging = messages;
  }
  /**
   * Initialize the model here and subscribe to any required messages
   */
  public void init() {
    mvcMessaging.subscribe("view:ageInput:model", this);
  }
  @Override
  public void messageHandler(String messageName, Object messagePayload) {
    if (messagePayload != null) {
      System.out.println("RCV (model): "+messageName+" | "+messagePayload.toString());
    } else {
      System.out.println("RCV (model): "+messageName+" | No data sent");
    }
    MessagePayload payload = (MessagePayload)messagePayload;
    
    int field = payload.getField();
    int direction = payload.getDirection();
 
    if (direction == Constants.UP) {
      if (field == 1) {
        setVariable1(getVariable1()+Constants.UP);
      } else {
        setVariable2(getVariable2()+Constants.UP);
      }
    } else {
      if (field == 1) {
        setVariable1(getVariable1()+Constants.DOWN);
      } else {
        setVariable2(getVariable2()+Constants.DOWN);
      }      
    }
  }
  /**
   * Getter function for variable 1
   * @return Value of variable1
   */
  public int getVariable1() {
    return lower;
  }
  /**
   * Setter function for variable 1
   * @param age New value of variable1
   */
  public void setVariable1(int age) {
    lower = age/2 + 7;
    mvcMessaging.notify("model:lowerOfficial:view", lower, true);
  }
  /**
   * Getter function for variable 1
   * @return Value of variable2
   */
  public int getVariable2() {
    return upper;
  }
  /**
   * Setter function for variable 2
   * @param age New value of variable 2
   */
  public void setVariable2(int age) {
    difference = lower - age;
    upper = age + difference;
    mvcMessaging.notify("model:upperOfficial:view", upper, true);
  }
}