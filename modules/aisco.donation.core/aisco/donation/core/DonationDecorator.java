package aisco.donation.core;

public abstract class DonationDecorator extends DonationComponent{
    public DonationComponent record;

    public DonationDecorator(DonationComponent record){
        this.record = record;
    }

    public void getDonation(){
        record.getDonation();
    }

    public void addDonation(){
        record.addDonation();
    }
}
