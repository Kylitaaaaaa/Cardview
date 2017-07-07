package com.thea.cardview;

import java.util.Date;

/**
 * Created by Thea on 07/07/2017.
 */

public class Reservation {
    private long mId;
    private long mLocationId;
    private String mCode;
    private String mStatus;
    private Date mDateExpired;

    //added this
    private String requester;
    private int duration; //hours

    public String getRequester() {
        return requester;
    }

    public void setRequester(String requester) {
        this.requester = requester;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Reservation(String requester, int duration){
        this.requester = requester;
        this.duration = duration;
    }

    //original

    public Reservation(long id, long locationId, String code, String status, Date dateExpired){
        mId = id;
        mLocationId = locationId;
        mCode = code;
        mStatus = status;
        mDateExpired = dateExpired;
    }

    public Reservation(long id, String status){
        mId = id;
        mStatus = status;
    }

    public long getId () {
        return mId;
    }

    public String getStatus() {
        return mStatus;
    }

    public String getCode() {
        return mCode;
    }

    public long getLocationId() {
        return mLocationId;
    }

    public Date getDateExpired() {
        return mDateExpired;
    }

    //just incase for ui

    public long getmId() {
        return mId;
    }

    public void setmId(long mId) {
        this.mId = mId;
    }

    public long getmLocationId() {
        return mLocationId;
    }

    public void setmLocationId(long mLocationId) {
        this.mLocationId = mLocationId;
    }

    public String getmCode() {
        return mCode;
    }

    public void setmCode(String mCode) {
        this.mCode = mCode;
    }

    public String getmStatus() {
        return mStatus;
    }

    public void setmStatus(String mStatus) {
        this.mStatus = mStatus;
    }

    public Date getmDateExpired() {
        return mDateExpired;
    }

    public void setmDateExpired(Date mDateExpired) {
        this.mDateExpired = mDateExpired;
    }
}