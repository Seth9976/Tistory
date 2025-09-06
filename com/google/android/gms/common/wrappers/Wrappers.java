package com.google.android.gms.common.wrappers;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;

@KeepForSdk
public class Wrappers {
    public PackageManagerWrapper a;
    public static final Wrappers b;

    static {
        Wrappers.b = new Wrappers();
    }

    public Wrappers() {
        this.a = null;
    }

    @NonNull
    @KeepForSdk
    public static PackageManagerWrapper packageManager(@NonNull Context context0) {
        return Wrappers.b.zza(context0);
    }

    @NonNull
    @VisibleForTesting
    public final PackageManagerWrapper zza(@NonNull Context context0) {
        synchronized(this) {
            if(this.a == null) {
                if(context0.getApplicationContext() != null) {
                    context0 = context0.getApplicationContext();
                }
                this.a = new PackageManagerWrapper(context0);
            }
            return this.a;
        }
    }
}

