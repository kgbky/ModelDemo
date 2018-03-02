package com.smile.modeldemo.factory;

import android.util.Log;

/**
 * Created by Administrator on 2018/2/8    19:22
 */

public class IDCard extends Product {

    private static final String TAG = "factory";

    private String owner;
    private long cardNumber;

    IDCard(String owner, long cardNumber) {
        this.owner = owner;
        this.cardNumber = cardNumber;
    }

    @Override
    public void use() {
        Log.d(TAG, "使用" + owner + "的Id卡");
    }

    public String getOwner() {
        return owner;
    }

    public long getCardNumber() {
        return cardNumber;
    }

}
