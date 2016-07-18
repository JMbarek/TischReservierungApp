package com.udacity.firebase.shoppinglistplusplus.model;

/**
 * @author Jaouhar M'barek
 * @version 1.0.0
 * @date today
 */
public class RestaurantItem {
    private String name;
    private String ft;

    public String getName() {
        return name;
    }

    public String getFt() {
        return ft;
    }



    /**
     * Required public constructor
     */
    public RestaurantItem() {
    }

    /**
     * Use this constructor to create new ShoppingListItem.
     *
     * @param itemName
     */
    public RestaurantItem(String itemName) {
        this.name = itemName;
        /**
         * This is a default value until we can differentiate users.
         * Which will be soon, I promise.
         */
        this.ft = "44";
    }


}
