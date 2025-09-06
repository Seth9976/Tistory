package ce;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.UInt;
import kotlin.jvm.internal.markers.KMappedMarker;

public final class f implements Iterator, KMappedMarker {
    public final int a;
    public boolean b;
    public final int c;
    public int d;

    public f(int v, int v1, int v2) {
        this.a = v1;
        boolean z = false;
        int v3 = Integer.compareUnsigned(v, v1);
        if(v2 <= 0) {
            if(v3 >= 0) {
                z = true;
            }
        }
        else if(v3 <= 0) {
            z = true;
        }
        this.b = z;
        this.c = v2;
        if(!this.b) {
            v = v1;
        }
        this.d = v;
    }

    @Override
    public final boolean hasNext() {
        return this.b;
    }

    @Override
    public final Object next() {
        int v = this.d;
        if(v == this.a) {
            if(!this.b) {
                throw new NoSuchElementException();
            }
            this.b = false;
            return UInt.box-impl(v);
        }
        this.d = this.c + v;
        return UInt.box-impl(v);
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

