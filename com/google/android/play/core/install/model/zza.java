package com.google.android.play.core.install.model;

import java.util.HashMap;

public final class zza {
    public static final HashMap a;
    public static final HashMap b;

    static {
        HashMap hashMap0 = new HashMap();
        zza.a = hashMap0;
        HashMap hashMap1 = new HashMap();
        zza.b = hashMap1;
        hashMap0.put(-2, "An unknown error occurred.");
        hashMap0.put(-3, "The API is not available on this device.");
        hashMap0.put(-4, "The request that was sent by the app is malformed.");
        hashMap0.put(-5, "The install is unavailable to this user or device.");
        hashMap0.put(-6, "The download/install is not allowed, due to the current device state (e.g. low battery, low disk space, ...).");
        hashMap0.put(-7, "The install/update has not been (fully) downloaded yet.");
        hashMap0.put(-8, "The install is already in progress and there is no UI flow to resume.");
        hashMap0.put(-9, "The Play Store app is either not installed or not the official version.");
        hashMap0.put(-10, "The app is not owned by any user on this device. An app is \"owned\" if it has been acquired from Play.");
        hashMap0.put(-100, "An internal error happened in the Play Store.");
        hashMap1.put(-2, "ERROR_UNKNOWN");
        hashMap1.put(-3, "ERROR_API_NOT_AVAILABLE");
        hashMap1.put(-4, "ERROR_INVALID_REQUEST");
        hashMap1.put(-5, "ERROR_INSTALL_UNAVAILABLE");
        hashMap1.put(-6, "ERROR_INSTALL_NOT_ALLOWED");
        hashMap1.put(-7, "ERROR_DOWNLOAD_NOT_PRESENT");
        hashMap1.put(-8, "ERROR_INSTALL_IN_PROGRESS");
        hashMap1.put(-100, "ERROR_INTERNAL_ERROR");
        hashMap1.put(-9, "ERROR_PLAY_STORE_NOT_FOUND");
        hashMap1.put(-10, "ERROR_APP_NOT_OWNED");
        hashMap1.put(-100, "ERROR_INTERNAL_ERROR");
    }

    public static String zza(@InstallErrorCode int v) {
        HashMap hashMap0 = zza.a;
        Integer integer0 = v;
        if(hashMap0.containsKey(integer0)) {
            return zza.b.containsKey(integer0) ? ((String)hashMap0.get(integer0)) + " (https://developer.android.com/reference/com/google/android/play/core/install/model/InstallErrorCode#" + ((String)zza.b.get(integer0)) + ")" : "";
        }
        return "";
    }
}

