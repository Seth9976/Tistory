package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.R.string;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.internal.zzag;

@KeepForSdk
@Deprecated
public final class GoogleServices {
    public final String a;
    public final Status b;
    public final boolean c;
    public final boolean d;
    public static final Object e;
    public static GoogleServices f;

    static {
        GoogleServices.e = new Object();
    }

    public GoogleServices(Context context0) {
        Resources resources0 = context0.getResources();
        int v = resources0.getIdentifier("google_app_measurement_enable", "integer", resources0.getResourcePackageName(string.common_google_play_services_unknown_issue));
        boolean z = true;
        if(v == 0) {
            this.d = false;
        }
        else {
            int v1 = resources0.getInteger(v);
            if(v1 == 0) {
                z = false;
            }
            this.d = v1 == 0;
        }
        this.c = z;
        String s = zzag.zzb(context0);
        if(s == null) {
            s = new StringResourceValueReader(context0).getString("google_app_id");
        }
        if(TextUtils.isEmpty(s)) {
            this.b = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.a = null;
            return;
        }
        this.a = s;
        this.b = Status.RESULT_SUCCESS;
    }

    public GoogleServices(String s, boolean z) {
        this.a = s;
        this.b = Status.RESULT_SUCCESS;
        this.c = z;
        this.d = !z;
    }

    public static GoogleServices a(String s) {
        synchronized(GoogleServices.e) {
            GoogleServices googleServices0 = GoogleServices.f;
            if(googleServices0 != null) {
                return googleServices0;
            }
        }
        throw new IllegalStateException("Initialize must be called before " + s + ".");
    }

    @Nullable
    @KeepForSdk
    public static String getGoogleAppId() {
        return GoogleServices.a("getGoogleAppId").a;
    }

    @NonNull
    @KeepForSdk
    public static Status initialize(@NonNull Context context0) {
        Preconditions.checkNotNull(context0, "Context must not be null.");
        synchronized(GoogleServices.e) {
            if(GoogleServices.f == null) {
                GoogleServices.f = new GoogleServices(context0);
            }
            return GoogleServices.f.b;
        }
    }

    @NonNull
    @KeepForSdk
    public static Status initialize(@NonNull Context context0, @NonNull String s, boolean z) {
        Preconditions.checkNotNull(context0, "Context must not be null.");
        Preconditions.checkNotEmpty(s, "App ID must be nonempty.");
        synchronized(GoogleServices.e) {
            GoogleServices googleServices0 = GoogleServices.f;
            if(googleServices0 != null) {
                return googleServices0.a == null || googleServices0.a.equals(s) ? Status.RESULT_SUCCESS : new Status(10, "Initialize was called with two different Google App IDs.  Only the first app ID will be used: \'" + googleServices0.a + "\'.");
            }
            GoogleServices googleServices1 = new GoogleServices(s, z);
            GoogleServices.f = googleServices1;
            return googleServices1.b;
        }
    }

    @KeepForSdk
    public static boolean isMeasurementEnabled() {
        GoogleServices googleServices0 = GoogleServices.a("isMeasurementEnabled");
        return googleServices0.b.isSuccess() && googleServices0.c;
    }

    @KeepForSdk
    public static boolean isMeasurementExplicitlyDisabled() {
        return GoogleServices.a("isMeasurementExplicitlyDisabled").d;
    }
}

