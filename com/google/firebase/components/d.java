package com.google.firebase.components;

import com.google.firebase.inject.Provider;
import java.util.Collections;

public final class d implements Provider {
    public final int a;

    public d(int v) {
        this.a = v;
        super();
    }

    @Override  // com.google.firebase.inject.Provider
    public final Object get() {
        return this.a != 0 ? null : Collections.emptySet();
    }
}

