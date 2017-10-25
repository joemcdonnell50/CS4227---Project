package Payment;

import java.text.DecimalFormat;

/**
 *
 * @author Owner
 */
public class discountReceiptDecorator extends receiptDecorator {

    private double OriginalCost;
    private String DiscountedReceipt;

    public discountReceiptDecorator(Receipt decoratedReceipt) {
        super(decoratedReceipt);
    }

    @Override
    public String FormatReceipt() {
        decoratedReceipt.FormatReceipt();
        return DiscountedReceipt = setReceiptFormat(decoratedReceipt);
    }

    @Override
    public void setOriginalCost(double OriginalCost) {
        this.OriginalCost = OriginalCost;
    }

    private String setReceiptFormat(Receipt decoratedReceipt) {
        double IniatialCost, Savings;
        String IniatialCostString, SavingsString;
        DecimalFormat df = new DecimalFormat("#.00");
        
        IniatialCost = OriginalCost;
        Savings = IniatialCost - decoratedReceipt.getTotal();
        IniatialCostString = df.format(IniatialCost);
        SavingsString = df.format(Savings);
        String Receipt = String.format("Hello " + decoratedReceipt.getUsername() + "\n"
                + "Receipt for reservation number " + decoratedReceipt.getUniqueNumber() + "\n"
                + "Hotel : " + "\t" + decoratedReceipt.getHotel() + "\n"
                + "Roomtype : " + "\t" + decoratedReceipt.getRoomType() + "\n"
                + "Number of Guests : " + "\t" + decoratedReceipt.getNbOfGuests() + "\n"
                + "Date of Arrival : " + "\t" + decoratedReceipt.getDateArrival() + "\n"
                + "Number of Nights : " + "\t" + decoratedReceipt.getNbOfNights() + "\n"
                + "Your original cost was " + "\t" + IniatialCostString + "\n"
                + "Cost of Services :" + "\t" + decoratedReceipt.getServicePrice() + "\n"
                + "Your discounted price is :" + "\t" + decoratedReceipt.getTotal() + "\n"
                + "You save " + SavingsString + " euro!"
        );

        return Receipt;
    }
}
