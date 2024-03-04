package com.cos.falib.preferences;

import android.content.Context;

public class AppPreferenceManager {

    private static final String PREF_DEVICE_ID = "PREF_DEVICE_ID";


    public static void resetSharedPrefs(Context mContext) {
       AppPreferences.clearAllPrefs(mContext);
    }

    public static void setDeviceId(Context context, String value) {
       AppPreferences.setPrefString(context, PREF_DEVICE_ID, value);
    }


    public static String getDeviceId(Context context) {
        return AppPreferences.getPrefString(context, PREF_DEVICE_ID);
    }


}
