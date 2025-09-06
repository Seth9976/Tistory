package com.squareup.moshi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;

public final class p extends q {
    public final int c;

    public p(JsonAdapter jsonAdapter0, int v) {
        this.c = v;
        super(jsonAdapter0);
    }

    @Override  // com.squareup.moshi.q
    public final Collection b() {
        return this.c != 0 ? new LinkedHashSet() : new ArrayList();
    }
}

