package com.google.android.gms.measurement;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzfr;

@Deprecated
public class AppMeasurementContentProvider extends ContentProvider {
    @Override  // android.content.ContentProvider
    public void attachInfo(@NonNull Context context0, @NonNull ProviderInfo providerInfo0) {
        super.attachInfo(context0, providerInfo0);
        if("com.google.android.gms.measurement.google_measurement_service".equals(providerInfo0.authority)) {
            throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application\'s build.gradle.");
        }
    }

    @Override  // android.content.ContentProvider
    public int delete(@NonNull Uri uri0, @Nullable String s, @NonNull String[] arr_s) {
        return 0;
    }

    @Override  // android.content.ContentProvider
    @Nullable
    public String getType(@NonNull Uri uri0) {
        return null;
    }

    @Override  // android.content.ContentProvider
    @Nullable
    public Uri insert(@NonNull Uri uri0, @NonNull ContentValues contentValues0) {
        return null;
    }

    @Override  // android.content.ContentProvider
    public boolean onCreate() {
        Context context0 = this.getContext();
        Preconditions.checkNotNull(context0);
        zzfr.zzp(context0, null, null);
        return false;
    }

    @Override  // android.content.ContentProvider
    @Nullable
    public Cursor query(@NonNull Uri uri0, @NonNull String[] arr_s, @Nullable String s, @NonNull String[] arr_s1, @Nullable String s1) {
        return null;
    }

    @Override  // android.content.ContentProvider
    public int update(@NonNull Uri uri0, @Nullable ContentValues contentValues0, @Nullable String s, @NonNull String[] arr_s) {
        return 0;
    }
}

