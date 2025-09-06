package com.google.firebase.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.FirebaseApp;

public class FirebaseInitProvider extends ContentProvider {
    @Override  // android.content.ContentProvider
    public void attachInfo(@NonNull Context context0, @NonNull ProviderInfo providerInfo0) {
        Preconditions.checkNotNull(providerInfo0, "FirebaseInitProvider ProviderInfo cannot be null.");
        if("com.google.firebase.firebaseinitprovider".equals(providerInfo0.authority)) {
            throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application\'s build.gradle.");
        }
        super.attachInfo(context0, providerInfo0);
    }

    @Override  // android.content.ContentProvider
    public int delete(@NonNull Uri uri0, @Nullable String s, @Nullable String[] arr_s) {
        return 0;
    }

    @Override  // android.content.ContentProvider
    @Nullable
    public String getType(@NonNull Uri uri0) {
        return null;
    }

    @Override  // android.content.ContentProvider
    @Nullable
    public Uri insert(@NonNull Uri uri0, @Nullable ContentValues contentValues0) {
        return null;
    }

    @Override  // android.content.ContentProvider
    public boolean onCreate() {
        if(FirebaseApp.initializeApp(this.getContext()) == null) {
            Log.i("FirebaseInitProvider", "FirebaseApp initialization unsuccessful");
            return false;
        }
        Log.i("FirebaseInitProvider", "FirebaseApp initialization successful");
        return false;
    }

    @Override  // android.content.ContentProvider
    @Nullable
    public Cursor query(@NonNull Uri uri0, @Nullable String[] arr_s, @Nullable String s, @Nullable String[] arr_s1, @Nullable String s1) {
        return null;
    }

    @Override  // android.content.ContentProvider
    public int update(@NonNull Uri uri0, @Nullable ContentValues contentValues0, @Nullable String s, @Nullable String[] arr_s) {
        return 0;
    }
}

