/*
 *  * Created by MSSquare on 9/14/18 9:30 PM
 *  * Copyright (c) 2018 . All rights reserved.
 */

package DynamicRecyclerView;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import java.lang.reflect.InvocationTargetException;
import java.util.List;

import static android.content.Context.LAYOUT_INFLATER_SERVICE;

public class DynamicRecyclerViewAdapter extends RecyclerView.Adapter<DynamicRecyclerViewViewHolder> {

    List<DynamicRecyclerViewModel> viewHolderData;
    Context mParentContext ;

    public DynamicRecyclerViewAdapter(Context ctx , List<DynamicRecyclerViewModel> data ){
        mParentContext = ctx ;
        this.viewHolderData = data ;
    }
    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @NonNull
    @Override
    public DynamicRecyclerViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = (LayoutInflater) mParentContext.getSystemService(LAYOUT_INFLATER_SERVICE);
        View itemView = inflater.inflate(viewHolderData.get(viewType).viewID, parent , false);

        Object viewHolder = null;
        try {
            viewHolder = viewHolderData.get(viewType).className.getConstructor(View.class).newInstance(itemView);
        }  catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return (DynamicRecyclerViewViewHolder) viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull DynamicRecyclerViewViewHolder holder, int position) {
        holder.bindViewHolder(viewHolderData.get(position).data);
    }


    @Override
    public int getItemCount() {
        return viewHolderData.size();
    }
    
}
