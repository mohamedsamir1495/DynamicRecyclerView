/*
 *  * Created by MSSquare on 9/14/18 10:10 PM
 *  * Copyright (c) 2018 . All rights reserved.
 */

package ExampleViewHolders;

import android.view.View;
import android.widget.TextView;

import com.mssquare.dynamicrecyclerview.R;

import DynamicRecyclerView.DynamicRecyclerViewViewHolder;

public class ExampleViewHolder1 extends DynamicRecyclerViewViewHolder {

    TextView textView ;
    View viewHoldersView;

    public ExampleViewHolder1(View itemView) {
        super(itemView);
        viewHoldersView = itemView;
    }

    @Override
    public void bindViewHolder(Object data) {
        textView = viewHoldersView.findViewById(R.id.textView);

        String response = (String) data; // U need to cast the data that you are passing to the viewModel
        textView.setText(response);
    }

}