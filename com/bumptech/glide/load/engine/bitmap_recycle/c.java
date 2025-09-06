package com.bumptech.glide.load.engine.bitmap_recycle;

public final class c implements Poolable {
    public final d a;
    public int b;
    public Class c;

    public c(d d0) {
        this.a = d0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof c && this.b == ((c)object0).b && this.c == ((c)object0).c;
    }

    @Override
    public final int hashCode() {
        int v = this.b * 0x1F;
        return this.c == null ? v : v + this.c.hashCode();
    }

    @Override  // com.bumptech.glide.load.engine.bitmap_recycle.Poolable
    public final void offer() {
        this.a.a(this);
    }

    @Override
    public final String toString() {
        return "Key{size=" + this.b + "array=" + this.c + '}';
    }
}

