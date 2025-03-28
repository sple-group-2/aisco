package aisco.donation.creditcard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import aisco.donation.core.DonationComponent;
import aisco.donation.core.DonationDecorator;

public class DonationImpl extends DonationDecorator {
    // delta add attributes
    private String cardNumber;
    private String cvc;

    public DonationImpl(DonationComponent record, String cardNumber, String cvc) {
    	super(record);
    	this.cardNumber = cardNumber;
    	this.cvc = cvc;
    }
    
    public void getDonation() {
    	System.out.println("Donation via Credit Card Payment Gateway");
    }
    
    public String toString() {
        return "\n" + record + " with card number: " + cardNumber + " and cvc: " + cvc;
    }

}
