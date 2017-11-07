
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HotelSystem.Entities;


/**
 *
 * @author Owner
 */
public class CreditCard {

    private String NameOnCard;
    private String creditCardNum;
    private String expiryDate;
    private String CVNum;
   
     private static CreditCard currentCreditCard;
 
    
    public static CreditCard getCurrentCreditCard() {
        return currentCreditCard;
    }

    public static void setCurrentCreditCard(CreditCard currentCreditCard) {
        CreditCard.currentCreditCard = currentCreditCard;
    }

    public String getNameOnCard() {
        return NameOnCard;
    }

    public void setNameOnCard(String NameOnCard) {
        this.NameOnCard = NameOnCard;
    }

    public String getCreditCardNum() {
        return creditCardNum;
    }

    public void setCreditCardNum(String creditCardNum) {
        this.creditCardNum = creditCardNum;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getCVNum() {
        return CVNum;
    }

    public void setCVNum(String CVNum) {
        this.CVNum = CVNum;
    }
  
 public static void setCreditCardInstance(CreditCard currentCreditCard){
        CreditCard.currentCreditCard = currentCreditCard;
    }
    
    public static CreditCard getCreditCardInstance(){
        return currentCreditCard;
    }
}

