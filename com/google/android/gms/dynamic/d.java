package com.google.android.gms.dynamic;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public final class d implements zah {
    public final FrameLayout a;
    public final LayoutInflater b;
    public final ViewGroup c;
    public final Bundle d;
    public final DeferredLifecycleHelper e;

    public d(DeferredLifecycleHelper deferredLifecycleHelper0, FrameLayout frameLayout0, LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        this.e = deferredLifecycleHelper0;
        this.a = frameLayout0;
        this.b = layoutInflater0;
        this.c = viewGroup0;
        this.d = bundle0;
    }

    @Override  // com.google.android.gms.dynamic.zah
    public final int zaa() {
        return 2;
    }

    @Override  // com.google.android.gms.dynamic.zah
    public final void zab(LifecycleDelegate lifecycleDelegate0) {
        this.a.removeAllViews();
        View view0 = this.e.a.onCreateView(this.b, this.c, this.d);
        this.a.addView(view0);
    }
}

