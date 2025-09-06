package com.google.gson.internal;

import com.google.gson.JsonIOException;

public final class e implements ObjectConstructor {
    public final int a;
    public final String b;

    public e(String s, int v) {
        this.a = v;
        this.b = s;
        super();
    }

    @Override  // com.google.gson.internal.ObjectConstructor
    public final Object construct() {
        switch(this.a) {
            case 0: {
                throw new JsonIOException(this.b);
            }
            case 1: {
                throw new JsonIOException(this.b);
            }
            default: {
                throw new JsonIOException(this.b);
            }
        }
    }
}

