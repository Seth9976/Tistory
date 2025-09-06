package com.google.gson.internal;

public final class u extends UnsafeAllocator {
    @Override  // com.google.gson.internal.UnsafeAllocator
    public final Object newInstance(Class class0) {
        throw new UnsupportedOperationException("Cannot allocate " + class0 + ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
    }
}

