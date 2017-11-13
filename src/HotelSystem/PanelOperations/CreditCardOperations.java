package HotelSystem.PanelOperations;

import GUI.PaymentUI.PaymentMenuUI;
import HotelSystem.Entities.CreditCard;
import HotelSystem.Validation.Validator;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
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

    public boolean LuhnAlgorithmValidator() {
        CreditCard creditcard = CreditCard.getCreditCardInstance();
        String CardNum = creditcard.getCreditCardNum();
        int[] CardNumber = new int[CardNum.length()];
        for (int i = 0; i < CardNum.length(); i++) {
            CardNumber[i] = Integer.parseInt(CardNum.substring(i, i + 1));
        }
        for (int i = CardNumber.length - 2; i >= 0; i = i - 2) {
            int j = CardNumber[i];
            j = j * 2;
            if (j > 9) {
                j = j % 10 + 1;
            }
            CardNumber[i] = j;
        }
        int sum = 0;
        for (int i = 0; i < CardNumber.length; i++) {
            sum += CardNumber[i];
        }
        if (sum % 10 == 0) {
            return true;
        } else {
            JOptionPane.showMessageDialog(
                    null, "Credit Card Not Valid!", "ErrorMsg!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean isCV2Valid() {
        CreditCard creditcard = CreditCard.getCreditCardInstance();
        String CVN = creditcard.getCVNum();
        if (CVN.matches("^[0-9]{3}$")) {
            return true;
        } else {
            return false;
        }
    }

    private boolean areEntriesValid() {
        CreditCard creditcard = CreditCard.getCreditCardInstance();
        Validator validator = new Validator();
        boolean isExpiryDateValid;
        boolean isCvValid;
        boolean isNameValid;
        isExpiryDateValid = (validator.isDateAfterToday(creditcard.getExpiryDate()));
        isCvValid = isCV2Valid();
        isNameValid = validator.isNotNull(creditcard.getNameOnCard());
        if (!isExpiryDateValid && isCvValid && isNameValid) {
            return true;
        } else {
            JOptionPane.showMessageDialog(
                    null, "Entries Not Valid!", "ErrorMsg!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean isCreditCardValid() {
        boolean isCardValidNumber;
        boolean areEntriesValid;
        isCardValidNumber = LuhnAlgorithmValidator();
        areEntriesValid = areEntriesValid();
        if (areEntriesValid && isCardValidNumber) {
            return true;
        } else {
            return false;
        }
    }
}
