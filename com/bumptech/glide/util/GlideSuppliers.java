package com.bumptech.glide.util;

public final class GlideSuppliers {
    public interface GlideSupplier {
        Object get();
    }

    public static GlideSupplier memorize(GlideSupplier glideSuppliers$GlideSupplier0) {
        return new a(glideSuppliers$GlideSupplier0);
    }
}

