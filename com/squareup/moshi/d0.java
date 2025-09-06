package com.squareup.moshi;

import com.google.gson.internal.l;

public final class d0 extends l {
    public final int f;

    public d0(g0 g00, int v) {
        this.f = v;
        super(g00);
    }

    @Override  // com.google.gson.internal.l
    public Object next() {
        return this.f == 1 ? this.b().f : super.next();
    }
}

