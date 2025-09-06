package com.google.firebase.crashlytics.internal;

import a7.b;
import android.content.Context;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.common.CommonUtils;

public class DevelopmentPlatformProvider {
    public final Context a;
    public b b;

    public DevelopmentPlatformProvider(Context context0) {
        this.a = context0;
        this.b = null;
    }

    @Nullable
    public String getDevelopmentPlatform() {
        if(this.b == null) {
            this.b = new b(this);
        }
        return (String)this.b.b;
    }

    @Nullable
    public String getDevelopmentPlatformVersion() {
        if(this.b == null) {
            this.b = new b(this);
        }
        return (String)this.b.c;
    }

    public static boolean isUnity(Context context0) {
        return CommonUtils.getResourcesIdentifier(context0, "com.google.firebase.crashlytics.unity_version", "string") != 0;
    }
}

