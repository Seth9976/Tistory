package com.bumptech.glide.manager;

import android.content.Context;
import android.net.ConnectivityManager;
import com.bumptech.glide.util.GlideSuppliers.GlideSupplier;

public final class j implements GlideSupplier {
    public final Context a;

    public j(Context context0) {
        this.a = context0;
    }

    @Override  // com.bumptech.glide.util.GlideSuppliers$GlideSupplier
    public final Object get() {
        return (ConnectivityManager)this.a.getSystemService("connectivity");
    }
}

