package com.google.android.gms.common.api.internal;

import android.os.Message;

public final class v implements BackgroundStateChangeListener {
    public final GoogleApiManager a;

    public v(GoogleApiManager googleApiManager0) {
        this.a = googleApiManager0;
    }

    @Override  // com.google.android.gms.common.api.internal.BackgroundDetector$BackgroundStateChangeListener
    public final void onBackgroundStateChanged(boolean z) {
        Message message0 = this.a.n.obtainMessage(1, Boolean.valueOf(z));
        this.a.n.sendMessage(message0);
    }
}

