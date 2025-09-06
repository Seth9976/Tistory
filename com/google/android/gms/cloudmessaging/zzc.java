package com.google.android.gms.cloudmessaging;

import android.util.Log;

public final class zzc extends ClassLoader {
    @Override
    public final Class loadClass(String s, boolean z) throws ClassNotFoundException {
        if("com.google.android.gms.iid.MessengerCompat".equals(s)) {
            if(Log.isLoggable("CloudMessengerCompat", 3)) {
                Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
            }
            return zzd.class;
        }
        return super.loadClass(s, z);
    }
}

