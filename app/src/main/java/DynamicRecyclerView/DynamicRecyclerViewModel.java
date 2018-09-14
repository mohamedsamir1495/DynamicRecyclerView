/*
 *  * Created by MSSquare on 9/14/18 9:31 PM
 *  * Copyright (c) 2018 . All rights reserved.
 */

package DynamicRecyclerView;



public class DynamicRecyclerViewModel {

    public Class className; //the class of the view holder u going to use
    public Object data; // the data that is sent to this viewholder
    public int viewID; //the view of the view holder u going to use

    public DynamicRecyclerViewModel(){

    }

    public DynamicRecyclerViewModel(Class className, Object data,int viewID) {
        this.className = className;
        this.data = data;
        this.viewID = viewID;
    }



}
