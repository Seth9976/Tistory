package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.PendingResult.StatusListener;
import com.google.android.gms.common.api.Status;

public final class c implements StatusListener {
    public final BasePendingResult a;
    public final zaad b;

    public c(zaad zaad0, BasePendingResult basePendingResult0) {
        this.b = zaad0;
        this.a = basePendingResult0;
    }

    @Override  // com.google.android.gms.common.api.PendingResult$StatusListener
    public final void onComplete(Status status0) {
        this.b.a.remove(this.a);
    }
}

