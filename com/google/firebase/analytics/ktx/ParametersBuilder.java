package com.google.firebase.analytics.ktx;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0006\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\u0004J!\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\n2\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00040\f¢\u0006\u0002\u0010\rJ\u0016\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\u000EJ\u0016\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\u000FJ\u0016\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\nR\u0011\u0010\u0003\u001A\u00020\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/google/firebase/analytics/ktx/ParametersBuilder;", "", "()V", "bundle", "Landroid/os/Bundle;", "getBundle", "()Landroid/os/Bundle;", "param", "", "key", "", "value", "", "(Ljava/lang/String;[Landroid/os/Bundle;)V", "", "", "java.com.google.android.libraries.firebase.firebase_analytics_ktx_granule"}, k = 1, mv = {1, 7, 1}, xi = 0x30)
public final class ParametersBuilder {
    public final Bundle a;

    public ParametersBuilder() {
        this.a = new Bundle();
    }

    @NotNull
    public final Bundle getBundle() {
        return this.a;
    }

    public final void param(@NotNull String s, double f) {
        Intrinsics.checkNotNullParameter(s, "key");
        this.a.putDouble(s, f);
    }

    public final void param(@NotNull String s, long v) {
        Intrinsics.checkNotNullParameter(s, "key");
        this.a.putLong(s, v);
    }

    public final void param(@NotNull String s, @NotNull Bundle bundle0) {
        Intrinsics.checkNotNullParameter(s, "key");
        Intrinsics.checkNotNullParameter(bundle0, "value");
        this.a.putBundle(s, bundle0);
    }

    public final void param(@NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "key");
        Intrinsics.checkNotNullParameter(s1, "value");
        this.a.putString(s, s1);
    }

    public final void param(@NotNull String s, @NotNull Bundle[] arr_bundle) {
        Intrinsics.checkNotNullParameter(s, "key");
        Intrinsics.checkNotNullParameter(arr_bundle, "value");
        this.a.putParcelableArray(s, arr_bundle);
    }
}

