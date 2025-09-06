package com.squareup.moshi;

import java.util.Iterator;

public final class y implements Cloneable, Iterator {
    public final Token a;
    public final Object[] b;
    public int c;

    public y(Token jsonReader$Token0, Object[] arr_object, int v) {
        this.a = jsonReader$Token0;
        this.b = arr_object;
        this.c = v;
    }

    @Override
    public final Object clone() {
        return new y(this.a, this.b, this.c);
    }

    @Override
    public final boolean hasNext() {
        return this.c < this.b.length;
    }

    @Override
    public final Object next() {
        int v = this.c;
        this.c = v + 1;
        return this.b[v];
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

