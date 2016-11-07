package com.example.paco.tipcalk.fragments;

import com.example.paco.tipcalk.entity.TipRecord;

/**
 * Created by paco on 10/10/2016.
 */
public interface TipHistoryListFragmentListener {
    void initList();
    void addToList(TipRecord record);
    void clearList();
}

