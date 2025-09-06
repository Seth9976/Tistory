package com.bumptech.glide.load.engine;

import java.util.ArrayList;
import java.util.Iterator;

public final class w implements Iterable {
    public final int a;
    public final Iterable b;

    public w(Iterable iterable0, int v) {
        this.a = v;
        this.b = iterable0;
        super();
    }

    @Override
    public final Iterator iterator() {
        return this.a != 0 ? new gd.w(this.b.iterator()) : ((ArrayList)this.b).iterator();
    }
}

