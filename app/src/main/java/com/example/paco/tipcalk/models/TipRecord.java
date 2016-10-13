package com.example.paco.tipcalk.models;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by paco on 13/10/2016.
 */
public class TipRecord {
    private double bill;
    private int tipPercentage;
    private Date timestamp;

    public double getBill() {
        return bill;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }

    public int getTippercentage() {
        return tipPercentage;
    }

    public void setTippercentage(int tippercentage) {
        this.tipPercentage = tippercentage;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public double getTip(){
        return bill * (tipPercentage/100d);
    }

    public String getDateFormated() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM dd, yyyy HH:mm");
        return simpleDateFormat.format(timestamp);
    }
}
