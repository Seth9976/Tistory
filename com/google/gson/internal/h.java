package com.google.gson.internal;

import com.google.gson.JsonIOException;

public final class h implements ObjectConstructor {
    public final String a;

    public h(String s) {
        this.a = s;
    }

    @Override  // com.google.gson.internal.ObjectConstructor
    public final Object construct() {
        throw new JsonIOException(this.a);
    }
}

