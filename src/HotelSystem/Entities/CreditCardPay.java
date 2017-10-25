/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Payment;

import javax.xml.bind.DatatypeConverter;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Owner
 */
public class CreditCardPay {

    //Factory method one for CreditCardPay
    public static CreditCardPay create() {
        return new CreditCardPay();
    }

    //Factory method two for CreditCardPay
    public static CreditCardPay create(String NameOnCard, String expiryDate, String creditCardNum, String CVNum) {
        return new CreditCardPay(NameOnCard, expiryDate, creditCardNum, CVNum);
    }

    private String NameOnCard;
    private String creditCardNum;
    private String expiryDate;
    private String CVNum;

    public CreditCardPay() {
        this.NameOnCard = "No card name";
        this.creditCardNum = "No Card Number";
        this.expiryDate = "No expire date";
        this.CVNum = "No cv number";
    }

    private CreditCardPay(String NameOnCard, String expiryDate, String creditCardNum, String CVNum) {
        this.NameOnCard = NameOnCard;
        this.expiryDate = expiryDate;
        this.creditCardNum = creditCardNum;
        this.CVNum = CVNum;
    }

    public void setcardName(String NameOnCard) {
        this.NameOnCard = NameOnCard;
    }

    public void setexpireDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public void setcreditCardNum(String creditCardNum) {
        this.creditCardNum = creditCardNum;
    }

    public void setCVNum(String CVNum) {
        this.CVNum = CVNum;
    }

    public String getCardName() {
        return NameOnCard;
    }

    public String encryptCard(String StringtoEncrpyt) {
        try {
            byte[] EncodedString = StringtoEncrpyt.getBytes("UTF-8");
            String encrypt = DatatypeConverter.printBase64Binary(EncodedString);
            return encrypt;
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(CreditCardPay.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Not encrypted";
    }

    public String decryptCard(String StringtoDecrpyt) {
        try {
            byte[] decrypt = DatatypeConverter.parseBase64Binary(StringtoDecrpyt);
            String decrypted = new String(decrypt, "UTF-8");
            return decrypted;
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(CreditCardPay.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Not decrypted";
    }
    //Checks if credit card supplied has a legitimate card number

    public int[] CreateCardNumberArrayAndReverse() {
        //split string into int array in reverse order
        int length = creditCardNum.length();
        int[] CardNumber = new int[length];
        for (int i = 0; i < length; i++) {
            CardNumber[(length - 1) - i] = Integer.parseInt(String.valueOf(creditCardNum.charAt(i)));
        }
        return CardNumber;
    }

    public boolean LuhnAlgorithmValidator(int[] CardNumber) {
        int lastDidgit = 0, ModofNumber = 0, TotalOfNumbers = 0, TempDidgit = 0;
        //get the last didgit of cardnumber
        //get every odd number element in array * 2, if greater then 9 - 9 from 
        lastDidgit = CardNumber[0];
        for (int j = 1; j < creditCardNum.length() - 1; j += 2) {
            TempDidgit = CardNumber[j];
            TempDidgit = TempDidgit * 2;
            if (TempDidgit > 10) {
                TempDidgit = TempDidgit - 9;
            }
            TotalOfNumbers += TempDidgit;
        }
        //modules by 10 total numbers and check if eqauls last number
        ModofNumber = TotalOfNumbers % 10;
        return ModofNumber == lastDidgit;
    }

    public boolean isCreditCardValid() {
        boolean isCardValidNumber;
        int[] CreditCardNumber = CreateCardNumberArrayAndReverse();
        isCardValidNumber = LuhnAlgorithmValidator(CreditCardNumber);
        return isCardValidNumber;

    }
}
