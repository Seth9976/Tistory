package com.bumptech.glide;

import androidx.tracing.Trace;
import com.bumptech.glide.module.AppGlideModule;
import com.bumptech.glide.util.GlideSuppliers.GlideSupplier;
import java.util.List;

public final class h implements GlideSupplier {
    public boolean a;
    public final Glide b;
    public final List c;
    public final AppGlideModule d;

    public h(Glide glide0, List list0, AppGlideModule appGlideModule0) {
        this.b = glide0;
        this.c = list0;
        this.d = appGlideModule0;
    }

    @Override  // com.bumptech.glide.util.GlideSuppliers$GlideSupplier
    public final Object get() {
        if(!this.a) {
            Trace.beginSection("Glide registry");
            this.a = true;
            try {
                return i.a(this.b, this.c, this.d);
            }
            finally {
                this.a = false;
                Trace.endSection();
            }
        }
        throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you\'re using the provided Registry rather calling glide.getRegistry()!");
    }
}

