package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.GoogleApi;

public final class zabv extends zaag {
    public final GoogleApi c;

    public zabv(GoogleApi googleApi0) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.c = googleApi0;
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final ApiMethodImpl enqueue(@NonNull ApiMethodImpl baseImplementation$ApiMethodImpl0) {
        return this.c.doRead(baseImplementation$ApiMethodImpl0);
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final ApiMethodImpl execute(@NonNull ApiMethodImpl baseImplementation$ApiMethodImpl0) {
        return this.c.doWrite(baseImplementation$ApiMethodImpl0);
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final Context getContext() {
        return this.c.getApplicationContext();
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final Looper getLooper() {
        return this.c.getLooper();
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final void zao(zada zada0) {
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final void zap(zada zada0) {
    }
}

