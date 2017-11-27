package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by nchenari on 11/27/17.
 */

public class BitcoinDataModel {

    // Member Variables
    private String mPrice;

    // Return a BitcoinDataModel object from a JSON
    public static BitcoinDataModel fromJson(JSONObject jsonObject) {

        try {
            BitcoinDataModel bitcoinData = new BitcoinDataModel();

            bitcoinData.mPrice = jsonObject.getString("ask");

            return bitcoinData;

        } catch (JSONException e) {
            e.printStackTrace();
            return null;

            // Handle exception, ask user to make decision etc.
        }

    }

    // Getter method for Bitcoin price


    public String getPrice() {
        return mPrice;
    }
}
