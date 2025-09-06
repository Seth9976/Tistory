package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.core.content.ContextCompat;
import com.google.android.gms.tasks.Task;
import java.io.File;
import java.io.IOException;

public final class f implements WithinAppServiceBinder.IntentHandler {
    public final Object a;

    public f(Context context0) {
        SharedPreferences sharedPreferences0 = context0.getSharedPreferences("com.google.android.gms.appid", 0);
        this.a = sharedPreferences0;
        File file0 = new File(ContextCompat.getNoBackupFilesDir(context0), "com.google.android.gms.appid-no-backup");
        if(!file0.exists()) {
            try {
                if(file0.createNewFile()) {
                    synchronized(this) {
                        boolean z = sharedPreferences0.getAll().isEmpty();
                    }
                    if(!z) {
                        Log.i("FirebaseMessaging", "App restored, clearing state");
                        synchronized(this) {
                            sharedPreferences0.edit().clear().commit();
                        }
                    }
                }
            }
            catch(IOException iOException0) {
                if(Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + iOException0.getMessage());
                }
            }
        }
    }

    public f(EnhancedIntentService enhancedIntentService0) {
        this.a = enhancedIntentService0;
    }

    public static String a(String s, String s1) [...] // Inlined contents

    @Override  // com.google.firebase.messaging.WithinAppServiceBinder$IntentHandler
    public Task handle(Intent intent0) {
        return ((EnhancedIntentService)this.a).b(intent0);
    }
}

