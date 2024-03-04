package com.cos.falib.bridge;

import android.content.Context;

import com.cos.falib.analytics.FAHelper;

public final class FABridge {

    public static void initLib(Context context) {
        FAHelper.generateId(context);
    }

    public static void logEvents(Context context, String screenName, String eventName, String eventValue) {
        FAHelper.logFirebaseAnalyticsEvent(context, screenName, eventName, eventValue);
    }
}
