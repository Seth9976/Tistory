package com.google.gson.internal;

import com.squareup.moshi.f0;
import com.squareup.moshi.g0;
import java.util.AbstractMap;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NoSuchElementException;

public abstract class l implements Iterator {
    public final int a;
    public int b;
    public Map.Entry c;
    public Map.Entry d;
    public final AbstractMap e;

    public l(LinkedTreeMap linkedTreeMap0) {
        this.a = 0;
        super();
        this.e = linkedTreeMap0;
        this.c = linkedTreeMap0.f.d;
        this.d = null;
        this.b = linkedTreeMap0.e;
    }

    public l(g0 g00) {
        this.a = 1;
        super();
        this.e = g00;
        this.c = g00.c.d;
        this.d = null;
        this.b = g00.e;
    }

    public m a() {
        m m0 = (m)this.c;
        LinkedTreeMap linkedTreeMap0 = (LinkedTreeMap)this.e;
        if(m0 == linkedTreeMap0.f) {
            throw new NoSuchElementException();
        }
        if(linkedTreeMap0.e != this.b) {
            throw new ConcurrentModificationException();
        }
        this.c = m0.d;
        this.d = m0;
        return m0;
    }

    public f0 b() {
        f0 f00 = (f0)this.c;
        g0 g00 = (g0)this.e;
        if(f00 == g00.c) {
            throw new NoSuchElementException();
        }
        if(g00.e != this.b) {
            throw new ConcurrentModificationException();
        }
        this.c = f00.d;
        this.d = f00;
        return f00;
    }

    @Override
    public final boolean hasNext() {
        return this.a == 0 ? ((m)this.c) != ((LinkedTreeMap)this.e).f : ((f0)this.c) != ((g0)this.e).c;
    }

    @Override
    public Object next() {
        return this.a != 0 ? this.b() : this.a();
    }

    @Override
    public final void remove() {
        if(this.a != 0) {
            f0 f00 = (f0)this.d;
            if(f00 == null) {
                throw new IllegalStateException();
            }
            ((g0)this.e).c(f00, true);
            this.d = null;
            this.b = ((g0)this.e).e;
            return;
        }
        m m0 = (m)this.d;
        if(m0 == null) {
            throw new IllegalStateException();
        }
        ((LinkedTreeMap)this.e).c(m0, true);
        this.d = null;
        this.b = ((LinkedTreeMap)this.e).e;
    }
}

