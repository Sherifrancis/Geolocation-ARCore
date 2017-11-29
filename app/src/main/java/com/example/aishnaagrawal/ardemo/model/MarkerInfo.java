package com.example.aishnaagrawal.ardemo.model;

import android.location.Location;

import com.google.ar.core.Anchor;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by aishnaagrawal on 11/16/17.
 */

public class MarkerInfo {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("time")
    @Expose
    private LocationTime time;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("location")
    @Expose
    private MarkerLocation markerLocation;

    //Additional variables
    private float distance;
    private boolean inRange;
    private Anchor anchor;
    private float[] zeroMatrix = new float[16];

    public MarkerInfo(String name, String category, MarkerLocation markerLocation) {
        this.name = name;
        this.category = category;
        this.markerLocation = markerLocation;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(Float distance) {
        this.distance = distance;
    }

    public boolean getInRange() {
        return inRange;
    }

    public void setInRange(Boolean inRange) {
        this.inRange = inRange;
    }

    public String getName() {
        return name;
    }

    public LocationTime getTime() {
        return time;
    }

    public String getCategory() {
        return category;
    }

    public Location getLocation() {
        Location location = new Location(name);
        location.setLatitude(markerLocation.getLat());
        location.setLongitude(markerLocation.getLng());
        return location;
    }

    public Anchor getAnchor() {
        return anchor;
    }

    public void setAnchor(Anchor anchor) {
        this.anchor = anchor;
    }

    public float[] getZeroMatrix() {
        return zeroMatrix;
    }

    public void setZeroMatrix(float[] zeroMatrix) {
        this.zeroMatrix = zeroMatrix;
    }


}

