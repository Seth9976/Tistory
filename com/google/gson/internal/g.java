package com.google.gson.internal;

import com.google.gson.JsonIOException;

public final class g implements ObjectConstructor {
    public final String a;

    public g(String s) {
        this.a = s;
    }

    @Override  // com.google.gson.internal.ObjectConstructor
    public final Object construct() {
        throw new JsonIOException(this.a);
    }
}

