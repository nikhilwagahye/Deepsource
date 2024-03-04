package com.cos.falib.analytics;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;

import com.cos.falib.common.AnalyticsConstants;
import com.cos.falib.preferences.AppPreferenceManager;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.installations.FirebaseInstallations;

import java.util.UUID;

public class FAHelper {

    private static final String TAG = FAHelper.class.getName();
    private static FirebaseAnalytics mFirebaseAnalytics;

    public static FirebaseAnalytics getFirebaseAnalyticsInstance(Context context) {
        if (mFirebaseAnalytics == null) {
            mFirebaseAnalytics = FirebaseAnalytics.getInstance(context);
        }
        return mFirebaseAnalytics;
    }

    public static void logFirebaseAnalyticsEvent(Context context, String screenName, String eventName, String eventValue) {
        getFirebaseAnalyticsInstance(context);
        String deviceId = AppPreferenceManager.getDeviceId(context);
        Bundle bundle = new Bundle();
        bundle.putString(AnalyticsConstants.SCREEN_NAME, screenName.replaceAll(" ", "_"));
        bundle.putString(eventName.replaceAll(" ", "_"), eventValue.replaceAll(" ", "_"));

        mFirebaseAnalytics.logEvent(deviceId.replaceAll("-",""), bundle);

        Log.e(TAG, "Event captured" + bundle.toString());
    }

    public static void generateId(Context context) {
        FirebaseInstallations.getInstance().getId()
                .addOnCompleteListener(new OnCompleteListener<String>() {
                    @Override
                    public void onComplete(@NonNull Task<String> task) {
                        if (task.isSuccessful()) {
                            String id = task.getResult();
                            Log.e(TAG, "Firebase Id - " + task.getResult());
                            AppPreferenceManager.setDeviceId(context, id);
                            return;
                        }
                    }
                });
    }
}
