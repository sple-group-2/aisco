package aisco.donation.creditcard;
import aisco.donation.core.DonationDecorator;
import aisco.donation.core.DonationComponent;
import java.util.*;

public class DonationImpl extends DonationDecorator {
	private List <HashMap<String, String>> donationList;
	
	public DonationImpl(DonationComponent record){
		super(record);
		System.out.println("\nDonation via Credit Card");
	}

    public void getDonation(){ 
    	int total = 0;
    	for (HashMap<String,String> donation: donationList) {
    		System.out.println(toString(donation));
    		total += Integer.valueOf(donation.get("amount")) - 10000;
    	}
    	System.out.println("Total Donasi Credit Card: " + String.valueOf(total) + "\n");
    }

    public void addDonation(){
    	donationList = new ArrayList<>();
    	
    	HashMap<String,String> donation = new HashMap<String,String>();
    	donation.put("name", "Supratman");
    	donation.put("amount", "1500000");
    	donation.put("paymentMethod", "Credit Card");
    	
    	donationList.add(donation);
    }
    
    public String toString(HashMap<String,String> donation) {
        return "- Donasi " + donation.get("name") + ": " + donation.get("amount") + " Payment Method: " + donation.get("paymentMethod") +" Credit Interest: 10000,00" + "\n";
    }

}
