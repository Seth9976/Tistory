package androidx.arch.core.internal;

import java.util.Iterator;
import o.b;

public abstract class a extends SupportRemove implements Iterator {
    public b a;
    public b b;

    @Override  // androidx.arch.core.internal.SafeIterableMap$SupportRemove
    public final void a(b b0) {
        b b1 = null;
        if(this.a == b0 && b0 == this.b) {
            this.b = null;
            this.a = null;
        }
        b b2 = this.a;
        if(b2 == b0) {
            this.a = this.b(b2);
        }
        b b3 = this.b;
        if(b3 == b0) {
            if(b3 != this.a && this.a != null) {
                b1 = this.c(b3);
            }
            this.b = b1;
        }
    }

    public abstract b b(b arg1);

    public abstract b c(b arg1);

    @Override
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override
    public final Object next() {
        b b0 = this.b;
        this.b = b0 == this.a || this.a == null ? null : this.c(b0);
        return b0;
    }
}

