package com.android.installreferrer.commons;

import android.util.Log;

public final class InstallReferrerCommons {
    public static void logVerbose(String s, String s1) {
        if(Log.isLoggable(s, 2)) {
            Log.v(s, s1);
        }
    }

    public static void logWarn(String s, String s1) {
        if(Log.isLoggable(s, 5)) {
            Log.w(s, s1);
        }
    }
}

