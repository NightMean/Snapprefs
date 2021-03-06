package com.marz.snapprefs;

/**
 * Model used to detect gestures. Methods and fields are pretty much self-explanatory.
 */
public class GestureModel {
    private final Object receivedSnap;
    private final int displayHeight;
    private float startX;
    private float startY;
    private float distance;
    private boolean isInitialized = false;
    private boolean isSaved = false;

    public GestureModel(Object receivedSnap, int displayHeight) {
        this.receivedSnap = receivedSnap;
        this.displayHeight = displayHeight;
    }

    public Object getReceivedSnap() {
        return receivedSnap;
    }

    public int getDisplayHeight() {
        return displayHeight;
    }

    public float getStartX() {
        return startX;
    }

    public float getStartY() {
        return startY;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public boolean isInitialized() {
        return isInitialized;
    }

    public void initialize(float startX, float startY) {
        this.startX = startX;
        this.startY = startY;
        this.isInitialized = true;
    }

    public boolean isSaved() {
        return isSaved;
    }

    public void setSaved() {
        isSaved = true;
    }
}
