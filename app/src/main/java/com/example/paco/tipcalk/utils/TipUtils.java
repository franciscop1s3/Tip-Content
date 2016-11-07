package com.example.paco.tipcalk.utils;

import com.example.paco.tipcalk.entity.TipRecord;

import java.text.SimpleDateFormat;

/**
 * Created by paco on 03/11/2016.
 */
public class TipUtils {
    public static double getTip(TipRecord tipRecord){

        return tipRecord.getBill() * (tipRecord.getTipPercentage()/100d);
    }

    public static String getDateFormated(TipRecord tipRecord) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM dd, yyyy HH:mm");
        return simpleDateFormat.format(tipRecord.getTimestamp());

    }
}
