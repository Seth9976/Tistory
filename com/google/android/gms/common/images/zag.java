package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.Nullable;

public abstract class zag {
    public final c a;
    protected int zab;

    public zag(Uri uri0, int v) {
        this.a = new c(uri0);
        this.zab = v;
    }

    public final void a(Context context0, boolean z) {
        int v = this.zab;
        this.zaa((v == 0 ? null : context0.getResources().getDrawable(v)), z, false, false);
    }

    public abstract void zaa(@Nullable Drawable arg1, boolean arg2, boolean arg3, boolean arg4);
}

