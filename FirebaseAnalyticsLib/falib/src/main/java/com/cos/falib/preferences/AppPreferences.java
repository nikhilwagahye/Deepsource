package com.cos.falib.preferences;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.HashSet;
import java.util.Set;


 public final class AppPreferences {

    private static final String PREF_ROOT="COS_FIRENASE_ANALYTICS_LIB";

    public static String getPrefString(Context context, String key) {
        return getPrefString(context,key,"") ;
    }

    public static String getPrefString(Context context, String key, String defaultValue) {
        SharedPreferences pref = context.getSharedPreferences(
                PREF_ROOT, 0);
        return pref.getString(key,defaultValue);
    }


    public static void setPrefString(Context context, String key, String value) {
        SharedPreferences pref = context.getSharedPreferences(
                PREF_ROOT, 0);

        SharedPreferences.Editor editor = pref.edit();
        editor.putString(key, value);
        editor.apply();
    }

    public static void removePrefString (Context context, String key) {
        SharedPreferences pref = context.getSharedPreferences(
                PREF_ROOT, 0);
        SharedPreferences.Editor editor = pref.edit();
        editor.remove(key);
        editor.apply();

    }

    public static int getPrefInt(Context context, String key) {
        SharedPreferences pref = context.getSharedPreferences(
                PREF_ROOT, 0);
        return pref.getInt(key,-1);
    }
    public static int getPrefInt(Context context, String key, int defValue) {
        SharedPreferences pref = context.getSharedPreferences(
                PREF_ROOT, 0);
        return pref.getInt(key, defValue);
    }


    public static void setPrefInt(Context context, String key, int value) {
        SharedPreferences pref = context.getSharedPreferences(
                PREF_ROOT, 0);
        SharedPreferences.Editor editor = pref.edit();
        editor.putInt(key, value);
        editor.apply();
    }

    public static long getPrefLong(Context context, String key, long defaultValue) {
        SharedPreferences pref = context.getSharedPreferences(
                PREF_ROOT, 0);

        /*if(defaultValue == -1) {
           int value = (int) defaultValue;
           defaultValue = (long) value;
        }*/
        return pref.getLong(key,defaultValue);
    }

    public static long getPrefLong(Context context, String key) {
        return getPrefLong(context, key, -1);
    }

    public static void setPrefLong(Context context, String key, long value) {
        SharedPreferences pref = context.getSharedPreferences(
                PREF_ROOT, 0);
        SharedPreferences.Editor editor = pref.edit();
        editor.putLong(key, value);
        editor.apply();
    }

    public static boolean getPrefBoolean(Context context, String key) {
        SharedPreferences pref = context.getSharedPreferences(
                PREF_ROOT, 0);
        return pref.getBoolean(key,false);
    }

    public static boolean getPrefBoolean (Context context, String key, boolean defaultValue) {
        SharedPreferences pref = context.getSharedPreferences(
                PREF_ROOT, 0);
        return pref.getBoolean(key, defaultValue);
    }

    public static void setPrefBoolean(Context context, String key, boolean value) {
        if(context != null) {
            SharedPreferences pref = context.getSharedPreferences(
                    PREF_ROOT, 0);
            SharedPreferences.Editor editor = pref.edit();
            editor.putBoolean(key, value);
            editor.apply();
        }
    }

    public static void clearAllPrefs (Context context) {
        SharedPreferences pref = context.getSharedPreferences(
                PREF_ROOT, 0);
        SharedPreferences.Editor editor = pref.edit();
        editor.clear();
        editor.apply();

    }

    public static Set<String> getPrefStringSet(Context context, String key) {
        SharedPreferences pref = context.getSharedPreferences(
                PREF_ROOT, 0);
        return pref.getStringSet(key, new HashSet<>());
    }

    public static void setPrefStringSet(Context context, String key, Set<String> value) {
        if(context != null) {
            SharedPreferences pref = context.getSharedPreferences(
                    PREF_ROOT, 0);
            SharedPreferences.Editor editor = pref.edit();
            editor.putStringSet(key, value);
            editor.apply();
        }
    }


}
