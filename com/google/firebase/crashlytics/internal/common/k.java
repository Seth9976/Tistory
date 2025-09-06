package com.google.firebase.crashlytics.internal.common;

import android.os.Bundle;
import java.util.concurrent.Callable;

public final class k implements Callable {
    public final long a;
    public final l b;

    public k(l l0, long v) {
        this.b = l0;
        this.a = v;
    }

    @Override
    public final Object call() {
        Bundle bundle0 = new Bundle();
        bundle0.putInt("fatal", 1);
        bundle0.putLong("timestamp", this.a);
        this.b.k.logEvent("_ae", bundle0);
        return null;
    }
}

