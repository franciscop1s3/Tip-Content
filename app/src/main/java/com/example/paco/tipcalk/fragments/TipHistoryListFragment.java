package com.example.paco.tipcalk.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Toast;

import com.example.paco.tipcalk.R;
import com.example.paco.tipcalk.activities.TipDetailActivity;
import com.example.paco.tipcalk.adapters.OnItemClickListener;
import com.example.paco.tipcalk.adapters.TipAdapter;
import com.example.paco.tipcalk.models.TipRecord;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class TipHistoryListFragment extends Fragment implements TipHistoryListFragmentListener{
    @Bind(R.id.recyclerView);
    RecyclerView recyclerView;

    TipAdapter adapter;

    public TipHistoryListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tip_history_list, container, false);
        ButterKnife.bind(this, view);
        initAdapter();
        initRecyclerView();
        return view;
    }

    private void initRecyclerView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);
    }

    private void initAdapter() {
        if(adapter == null) {
            adapter = new TipAdapter(getActivity().getApplicationContext(), this));
        }
    }


    @Override
    public void addToList(TipRecord record) {
        adapter.add(record);


    }

    @Override
    public void clearList() {
        adapter.clear();

    }

    @Override
    public void OnItemClick(TipRecord tipRecord){
        //
        Intent intent = new Intent(getActivity(), TipDetailActivity.class);
        intent.putExtra(TipDetailActivity.TIP_KEY, tipRecord.getTip());
        intent.putExtra(TipDetailActivity.BILL_TOTAL_KEY, tipRecord.getBill());
        intent.putExtra(TipDetailActivity.DATE_KEY, tipRecord.getDateFormated());
        startActivity(intent);
    }
}
