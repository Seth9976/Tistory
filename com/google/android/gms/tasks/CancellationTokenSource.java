package com.google.android.gms.tasks;

import androidx.annotation.NonNull;

public class CancellationTokenSource {
    public final d a;

    public CancellationTokenSource() {
        this.a = new d();
    }

    public void cancel() {
        this.a.a.d(null);
    }

    @NonNull
    public CancellationToken getToken() {
        return this.a;
    }
}

