package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.Fragment;

public final class a extends zag {
    public final int a;
    public final Intent b;
    public final int c;
    public final Object d;

    public a(Intent intent0, Object object0, int v, int v1) {
        this.a = v1;
        this.b = intent0;
        this.d = object0;
        this.c = v;
        super();
    }

    @Override  // com.google.android.gms.common.internal.zag
    public final void zaa() {
        if(this.a != 0) {
            Intent intent0 = this.b;
            if(intent0 != null) {
                ((Fragment)this.d).startActivityForResult(intent0, this.c);
            }
            return;
        }
        Intent intent1 = this.b;
        if(intent1 != null) {
            ((Activity)this.d).startActivityForResult(intent1, this.c);
        }
    }
}

