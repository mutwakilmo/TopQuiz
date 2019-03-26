package com.mutwakilmo.android.topquiz.model;

/**
 * Created by Mutwakil Mo on ${Date}
 */
public class User {

    private String mFirstName;

    public String getFirstName() {
        return mFirstName;
    }

    public void setFirstName(String firstName) {
        mFirstName = firstName;
    }

    @Override
    public String toString() {
        return "User{" +
                "mFirstname='" + mFirstName + '\'' +
                '}';
    }
}
