package com.udacity.firebase.shoppinglistplusplus.ui.activeLists;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;

import com.firebase.client.Query;
import com.firebase.ui.FirebaseListAdapter;
import com.udacity.firebase.shoppinglistplusplus.R;
import com.udacity.firebase.shoppinglistplusplus.model.Restaurant;
//import com.udacity.firebase.shoppinglistplusplus.model.ShoppingList;

/**
 * Populates the list_view_active_lists inside ShoppingListsFragment
 */
public class ActiveListAdapter extends FirebaseListAdapter<Restaurant> {

    /**
     * Public constructor that initializes private instance variables when adapter is created
     */
    public ActiveListAdapter(Activity activity, Class<Restaurant> modelClass, int modelLayout,
                             Query ref) {
        super(activity, modelClass, modelLayout, ref);
        this.mActivity = activity;
    }

    /**
     * Protected method that populates the view attached to the adapter (list_view_active_lists)
     * with items inflated from single_active_list.xml
     * populateView also handles data changes and updates the listView accordingly
     */
    @Override
    protected void populateView(View view, Restaurant list) {

        /**
         * Grab the needed Textivews and strings
         */
        TextView textViewListName = (TextView) view.findViewById(R.id.text_view_list_name);
//        TextView textViewCreatedByUser = (TextView) view.findViewById(R.id.text_view_created_by_user);
        TextView textViewTische = (TextView) view.findViewById(R.id.text_view_zahl_freie_tische);


        /* Set the list name and owner */
        textViewListName.setText(list.getName());
        textViewTische.setText(list.getFt());
    }
}
