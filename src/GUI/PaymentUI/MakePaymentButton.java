package GUI.PaymentUI;

import GUI.Command;
import GUI.OptionMenu.OptionsMenuUI;
import GUI.ReservationMenu.ReservationMenuUI;
import HotelSystem.Entities.Reservation;
import HotelSystem.Entities.User;
import HotelSystem.PanelOperations.CreditCardOperations;
import HotelSystem.Receipt.DiscountedReceipt;
import HotelSystem.Receipt.StandardReceipt;
import HotelSystem.Receipt.ReceiptToDiscountReceiptAdapter;
import javax.swing.JButton;

/**
 *
 * @author Owner
 */
public class MakePaymentButton extends JButton implements Command {

    @Override

    public void execute() {
        try {
            //create new creditcard operation
            CreditCardOperations creditcard = new CreditCardOperations();
            //send UI instance
            creditcard.CreditCard(PaymentMenuUI.getPaymentMenuUIInstance());
            boolean ValidCard;
            ValidCard = creditcard.isCreditCardValid();
            if (ValidCard) {
                int LoyaltyLevel;
                User user = User.getLoggedUser();
                LoyaltyLevel = user.getLoyalty_level();
                Reservation reservation = Reservation.getReservationInstance();
                if (LoyaltyLevel > 0) {
                    ReceiptToDiscountReceiptAdapter adapter = new ReceiptToDiscountReceiptAdapter(new DiscountedReceipt());
                    adapter.PrintReceipt(reservation);
                } else {
                    StandardReceipt receipt = new StandardReceipt();
                    receipt.PrintReceipt(reservation);
                }
                PaymentMenuUI.makeNonVisible();
                ReservationMenuUI.makeNonVisible();
                OptionsMenuUI.makeVisible();
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

}
