package com.udacity.firebase.shoppinglistplusplus.model;

/**
 * @author Jaouhar M'barek
 * @version 1.0.0
 * @date today
 */
public class RestaurantItem {
    private String itemName;
    private String freiTische;

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
        this.itemName = itemName;
        /**
         * This is a default value until we can differentiate users.
         * Which will be soon, I promise.
         */
        this.freiTische = "44";
    }

    public String getItemName() { return itemName; }

    public String getFreiTische() {
        return freiTische;
    }
}
