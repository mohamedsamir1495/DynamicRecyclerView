package com.mssquare.dynamicrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import DynamicRecyclerView.DynamicRecyclerViewAdapter;
import DynamicRecyclerView.DynamicRecyclerViewModel;
import ExampleViewHolders.ExampleViewHolder1;
import ExampleViewHolders.ExampleViewHolder2;

public class MainActivity extends AppCompatActivity {

    private ArrayList<DynamicRecyclerViewModel> initmodel(){
        ArrayList <DynamicRecyclerViewModel> modellist = new ArrayList<>();
        modellist.add(new DynamicRecyclerViewModel(ExampleViewHolder2.class,null,R.layout.example_view_holder_2_layout));
        modellist.add(new DynamicRecyclerViewModel(ExampleViewHolder1.class,"(MS)^2 Team",R.layout.example_view_holder_1_layout));
        modellist.add(new DynamicRecyclerViewModel(ExampleViewHolder2.class,null,R.layout.example_view_holder_2_layout));

        return modellist;
    }
    private RecyclerView modelExample;
    private RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<DynamicRecyclerViewModel> mmodel = initmodel();

        modelExample = findViewById(R.id.modeltest);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        modelExample.setLayoutManager(layoutManager);

        adapter = new DynamicRecyclerViewAdapter(this , mmodel);
        modelExample.setAdapter(adapter);
    }
}
