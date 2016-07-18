package com.udacity.firebase.shoppinglistplusplus.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.firebase.client.ServerValue;
import com.udacity.firebase.shoppinglistplusplus.utils.Constants;

import java.util.HashMap;

/**
 * @author Jaouhar M'barek
 * @version 1.0.0
 * @date today
 */
public class Restaurant {
    private String name;
    /**
     * freieTische
     */
    private String ft;
    private HashMap<String, Object> timestampLastChanged;
    private HashMap<String, Object> timestampCreated;


    /**
     * Required public constructor
     */
    public Restaurant() {
    }


    public Restaurant(String Name, String ft, HashMap<String, Object> timestampCreated) {
        this.name = Name;
        this.ft = ft;
        this.timestampCreated = timestampCreated;
        HashMap<String, Object> timestampNowObject = new HashMap<String, Object>();
        timestampNowObject.put(Constants.FIREBASE_PROPERTY_TIMESTAMP, ServerValue.TIMESTAMP);
        this.timestampLastChanged = timestampNowObject;
    }

    public String getName() {
        return name;
    }

    public String getFt() {
        return ft;
    }

    public HashMap<String, Object> getTimestampLastChanged() {
        return timestampLastChanged;
    }

    public HashMap<String, Object> getTimestampCreated() {
        return timestampCreated;
    }

    @JsonIgnore
    public long getTimestampLastChangedLong() {

        return (long) timestampLastChanged.get(Constants.FIREBASE_PROPERTY_TIMESTAMP);
    }

    @JsonIgnore
    public long getTimestampCreatedLong() {
        return (long) timestampLastChanged.get(Constants.FIREBASE_PROPERTY_TIMESTAMP);
    }

}
