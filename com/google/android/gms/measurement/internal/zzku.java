package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
public final class zzku {
    public final Context a;

    @VisibleForTesting
    public zzku(Context context0) {
        Preconditions.checkNotNull(context0);
        Context context1 = context0.getApplicationContext();
        Preconditions.checkNotNull(context1);
        this.a = context1;
    }
}

