package com.example.paco.tipcalk.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by paco on 13/10/2016.
 */
@Table(database = TipsDatabase.class)
public class TipRecord {
    @PrimaryKey(autoincrement = true)
    private int id;

    @Column
    private double bill;

    @Column
    private int tipPercentage;

    @Column
    private Date timestamp;

    public double getBill() {
        return bill;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }

    public int getTipPercentage() {
        return tipPercentage;
    }

    public void setTipPercentage(int tippercentage) {
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
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
