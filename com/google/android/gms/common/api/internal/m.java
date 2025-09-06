package com.google.android.gms.common.api.internal;

import android.os.Message;
import com.google.android.gms.signin.internal.zac;
import com.google.android.gms.signin.internal.zak;
import java.lang.ref.WeakReference;

public final class m extends zac {
    public final WeakReference a;

    public m(zaaw zaaw0) {
        this.a = new WeakReference(zaaw0);
    }

    @Override  // com.google.android.gms.signin.internal.zac
    public final void zab(zak zak0) {
        zaaw zaaw0 = (zaaw)this.a.get();
        if(zaaw0 == null) {
            return;
        }
        i i0 = new i(zaaw0, zaaw0, zak0);
        Message message0 = zaaw0.a.e.obtainMessage(1, i0);
        zaaw0.a.e.sendMessage(message0);
    }
}

