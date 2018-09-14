/*
 *  * Created by MSSquare on 9/14/18 9:31 PM
 *  * Copyright (c) 2018 . All rights reserved.
 */

package DynamicRecyclerView;

import android.support.v7.widget.RecyclerView;
import android.view.View;


public abstract class DynamicRecyclerViewViewHolder extends RecyclerView.ViewHolder {

    public DynamicRecyclerViewViewHolder(View itemView) {
        super(itemView);
    }
    public abstract void bindViewHolder (Object data); // Implement this function to bind your view holder with its respective data
}
