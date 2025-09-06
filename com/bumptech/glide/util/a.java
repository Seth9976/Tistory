package com.bumptech.glide.util;

public final class a implements GlideSupplier {
    public volatile Object a;
    public final GlideSupplier b;

    public a(GlideSupplier glideSuppliers$GlideSupplier0) {
        this.b = glideSuppliers$GlideSupplier0;
    }

    @Override  // com.bumptech.glide.util.GlideSuppliers$GlideSupplier
    public final Object get() {
        if(this.a == null) {
            synchronized(this) {
                if(this.a == null) {
                    this.a = Preconditions.checkNotNull(this.b.get());
                }
            }
        }
        return this.a;
    }
}

