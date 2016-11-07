package com.example.paco.tipcalk.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by paco on 13/10/2016.
 */
@Table(database = TipsDatabase.class)
public class TipRecord extends BaseModel{
    @PrimaryKey(autoincrement = true)
    private int id;

    @Column
    private double bill;

    @Column
    private int tipPercentage;

    @Column
    private Date timestamp;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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



}
