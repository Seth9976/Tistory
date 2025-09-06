package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public final class zabx extends BroadcastReceiver {
    public Context a;
    public final zabw b;

    public zabx(zabw zabw0) {
        this.b = zabw0;
    }

    @Override  // android.content.BroadcastReceiver
    public final void onReceive(Context context0, Intent intent0) {
        Uri uri0 = intent0.getData();
        if("com.google.android.gms".equals((uri0 == null ? null : uri0.getSchemeSpecificPart()))) {
            this.b.zaa();
            this.zab();
        }
    }

    public final void zaa(Context context0) {
        this.a = context0;
    }

    public final void zab() {
        synchronized(this) {
            Context context0 = this.a;
            if(context0 != null) {
                context0.unregisterReceiver(this);
            }
            this.a = null;
        }
    }
}

