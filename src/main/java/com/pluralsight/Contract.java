package com.pluralsight;

public abstract class Contract {
    protected String date, customerName, customerEmail;
    protected boolean vehicleSold;
    protected double totalPrice, monthlyPayment;

    public Contract(String date, String customerName, String customerEmail, boolean vehicleSold, double totalPrice, double monthlyPayment) {
        this.date = date;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.vehicleSold = vehicleSold;
        this.totalPrice = totalPrice;
        this.monthlyPayment = monthlyPayment;
    }

    public abstract double getTotalPrice();
    public abstract double getMonthlyPayment();

    public boolean isVehicleSold() {
        return vehicleSold;
    }

    public void setVehicleSold(boolean vehicleSold) {
        this.vehicleSold = vehicleSold;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
