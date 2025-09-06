package androidx.core.service.quicksettings;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.PendingIntentCompat;

public class PendingIntentActivityWrapper {
    public final Context a;
    public final int b;
    public final Intent c;
    public final int d;
    public final Bundle e;
    public final PendingIntent f;
    public final boolean g;

    public PendingIntentActivityWrapper(@NonNull Context context0, int v, @NonNull Intent intent0, int v1, @Nullable Bundle bundle0, boolean z) {
        this.a = context0;
        this.b = v;
        this.c = intent0;
        this.d = v1;
        this.e = bundle0;
        this.g = z;
        this.f = bundle0 == null ? PendingIntentCompat.getActivity(context0, v, intent0, v1, z) : PendingIntentCompat.getActivity(context0, v, intent0, v1, bundle0, z);
    }

    public PendingIntentActivityWrapper(@NonNull Context context0, int v, @NonNull Intent intent0, int v1, boolean z) {
        this(context0, v, intent0, v1, null, z);
    }

    @NonNull
    public Context getContext() {
        return this.a;
    }

    public int getFlags() {
        return this.d;
    }

    @NonNull
    public Intent getIntent() {
        return this.c;
    }

    @NonNull
    public Bundle getOptions() {
        return this.e;
    }

    @Nullable
    public PendingIntent getPendingIntent() {
        return this.f;
    }

    public int getRequestCode() {
        return this.b;
    }

    public boolean isMutable() {
        return this.g;
    }
}

