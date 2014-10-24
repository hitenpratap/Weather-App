package com.techsect.HWeather;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by hitenpratap on 21/10/14.
 */
public class CityPreference {

    SharedPreferences preferences;
    private static final String SHARED_PREF_CITY_KEY_NAME = "CITY";

    public CityPreference(Activity activity){
        preferences = activity.getPreferences(Context.MODE_PRIVATE);
    }

    String getCity(){
        return preferences.getString(SHARED_PREF_CITY_KEY_NAME,"New York,US");
    }

    void setCity(String city){
        preferences.edit().putString(SHARED_PREF_CITY_KEY_NAME,city).commit();
    }

}
