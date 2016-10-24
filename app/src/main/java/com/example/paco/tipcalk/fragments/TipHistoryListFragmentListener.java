package com.example.paco.tipcalk.fragments;

import com.example.paco.tipcalk.models.TipRecord;

/**
 * Created by paco on 10/10/2016.
 */
public interface TipHistoryListFragmentListener {
    void addToLit(TipRecord record);
    void clearList();
}
