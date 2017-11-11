package HotelSystem.PanelOperations;
 
 
 import GUI.PaymentUI.PaymentMenuUI;
 import HotelSystem.Entities.CreditCard;
 import java.io.UnsupportedEncodingException;
 import java.util.logging.Level;
 import java.util.logging.Logger;
 import javax.xml.bind.DatatypeConverter;
 
 /**
  *
  * @author Owner
  */
  public class CreditCardOperations {
  
         public static void CreditCard(PaymentMenuUI paymentUI) throws Exception {
             
         CreditCard creditcard = new CreditCard();
         creditcard.setCreditCardNum(paymentUI.getCardNumberField());
         creditcard.setCVNum(paymentUI.getCVVNumberField());
         creditcard.setExpiryDate(paymentUI.getExpDateField());
         creditcard.setNameOnCard(paymentUI.getFullNameField());
         creditcard.setCreditCardInstance(creditcard);
 }
 
 
   public String encryptCard(String StringtoEncrpyt) {
         try {
             byte[] EncodedString = StringtoEncrpyt.getBytes("UTF-8");
             String encrypt = DatatypeConverter.printBase64Binary(EncodedString);
             return encrypt;
         } catch (UnsupportedEncodingException ex) {
             Logger.getLogger(CreditCard.class.getName()).log(Level.SEVERE, null, ex);
         }
         return "Not encrypted";
     }
 
     public String decryptCard(String StringtoDecrpyt) {
         try {
             byte[] decrypt = DatatypeConverter.parseBase64Binary(StringtoDecrpyt);
             String decrypted = new String(decrypt, "UTF-8");
             return decrypted;
         } catch (UnsupportedEncodingException ex) {
             Logger.getLogger(CreditCard.class.getName()).log(Level.SEVERE, null, ex);
         }
         return "Not decrypted";
     }
     //Checks if credit card supplied has a legitimate card number
 
     public int[] CreateCardNumberArrayAndReverse() {
         //split string into int array in reverse order
         CreditCard creditcard = CreditCard.getCreditCardInstance();
         String CardNum = creditcard.getCreditCardNum();
         int length = CardNum.length();
         int[] CardNumber = new int[length];
         for (int i = 0; i < length; i++) {
             CardNumber[(length - 1) - i] = Integer.parseInt(String.valueOf(CardNum.charAt(i)));
         }
         return CardNumber;
     }
 
     public boolean LuhnAlgorithmValidator(int[] CardNumber) {
         
         int lastDidgit = 0, ModofNumber = 0, TotalOfNumbers = 0, TempDidgit = 0;
          CreditCard creditcard = CreditCard.getCreditCardInstance();
         //get the last didgit of cardnumber
         //get every odd number element in array * 2, if greater then 9 - 9 from 
         lastDidgit = CardNumber[0];
         for (int j = 1; j < creditcard.getCreditCardNum().length() - 1; j = 2) {
             TempDidgit = CardNumber[j];
             TempDidgit = TempDidgit * 2;
             if (TempDidgit > 10) {
                 TempDidgit = TempDidgit - 9;
             }
             TotalOfNumbers = TempDidgit;
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