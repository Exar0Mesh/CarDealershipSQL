package com.pluralsight;

public class LeaseContract extends Contract{
    private double endingValue, leaseFee;

    public LeaseContract(String date, String customerName, String customerEmail, boolean vehicleSold, double totalPrice,
                         double monthlyPayment, double endingValue, double leaseFee) {
        super(date, customerName, customerEmail, vehicleSold, totalPrice, monthlyPayment);
        this.endingValue = endingValue;
        this.leaseFee = leaseFee;
    }


    @Override
    public double getTotalPrice() {
        return 0;
    }

    @Override
    public double getMonthlyPayment() {
        endingValue = totalPrice * 0.5;
        leaseFee = totalPrice * 0.93;
        if (true) { //Probably loop for a certain amount of months
            leaseFee = 0.04;
        }
        return 0;
    }

    public double getEndingValue() {
        return endingValue;
    }

    public void setEndingValue(double endingValue) {
        this.endingValue = endingValue;
    }

    public double getLeaseFee() {
        return leaseFee;
    }

    public void setLeaseFee(double leaseFee) {
        this.leaseFee = leaseFee;
    }
}
