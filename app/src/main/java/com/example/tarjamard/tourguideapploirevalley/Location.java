package com.example.tarjamard.tourguideapploirevalley;

/**
 * Created by tarjamard on 04/04/2017.
 */

/**
 * {@link Location} represents a location that a user wants to view.
 * It contains location's name, adress information and a photo of the location.
 */
public class Location {
    /**
     * Name of the location
     */
    private int mLocationName;

    /**
     * Contact information of the location
     */
    private int mLocationAddress;

    /**
     * Image resource ID for the location
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new location object.
     *
     * @param locationName    is the location's name.
     * @param locationAddress is the location's address.
     * @param imageResourceId is the drawable resource ID for the location.
     */

    public Location(int locationName, int locationAddress, int imageResourceId) {
        mLocationName = locationName;
        mLocationAddress = locationAddress;
        mImageResourceId = imageResourceId;
    }

    /**
     * Create a new location object without image.
     *
     * @param locationName    is the location's name.
     * @param locationAddress is the location's address.
     */

    public Location(int locationName, int locationAddress) {
        mLocationName = locationName;
        mLocationAddress = locationAddress;
    }

    /**
     * Get the Location name
     */
    public int getLocationName() {
        return mLocationName;
    }

    /**
     * Get the Location address
     */
    public int getLocationAddress() {
        return mLocationAddress;
    }

    /**
     * Return the image resource ID of the location.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this location.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}