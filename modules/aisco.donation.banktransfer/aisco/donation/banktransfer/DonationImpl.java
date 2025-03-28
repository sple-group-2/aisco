package aisco.donation.banktransfer;
import aisco.donation.core.DonationComponent;
import payment.page.core.*;
import payment.page.PaymentPageFactory;

import aisco.donation.core.DonationDecorator;
import aisco.donation.core.DonationComponent;

public class DonationImpl extends DonationDecorator {
    
    private final String bankName;
    private final String accountNumber;

    public DonationImpl(DonationComponent record, String bankName, String accountNumber) {
    	super(record);
        this.bankName = bankName;
        this.accountNumber = accountNumber;
    }

    public void addDonation() {
        System.out.println("Donation via Bank Transfer");
        
    }
   
    public void getDonation() {
        System.out.println("Donasi dilakukan melalui Bank: " + bankName + ", Rekening: " + accountNumber);
    }
    
    public String toString() {
        return "\n" + record + " Nama Bank: " + bankName + ", Rekening: " + accountNumber;
    }
}
