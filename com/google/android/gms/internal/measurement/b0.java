package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

public final class b0 extends ContentObserver {
    public final int a;

    public b0(int v, Handler handler0) {
        this.a = v;
        super(handler0);
    }

    @Override  // android.database.ContentObserver
    public final void onChange(boolean z) {
        if(this.a != 0) {
            zzib.zzd();
            return;
        }
        zzha.a.set(true);
    }
}

