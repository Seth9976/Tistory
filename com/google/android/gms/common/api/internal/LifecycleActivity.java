package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

@KeepForSdk
public class LifecycleActivity {
    public final Activity a;

    public LifecycleActivity(@NonNull Activity activity0) {
        Preconditions.checkNotNull(activity0, "Activity must not be null");
        this.a = activity0;
    }

    @KeepForSdk
    public LifecycleActivity(@NonNull ContextWrapper contextWrapper0) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final Activity zza() {
        return this.a;
    }

    @NonNull
    public final FragmentActivity zzb() {
        return (FragmentActivity)this.a;
    }

    public final boolean zzc() {
        return Objects.nonNull(this.a);
    }

    public final boolean zzd() {
        return this.a instanceof FragmentActivity;
    }
}

