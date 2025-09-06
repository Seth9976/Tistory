package ce;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.ULong;
import kotlin.jvm.internal.markers.KMappedMarker;

public final class g implements Iterator, KMappedMarker {
    public final long a;
    public boolean b;
    public final long c;
    public long d;

    public g(long v, long v1, long v2) {
        this.a = v1;
        boolean z = false;
        if(Long.compare(v2, 0L) <= 0) {
            if(Long.compareUnsigned(v, v1) >= 0) {
                z = true;
            }
        }
        else if(Long.compareUnsigned(v, v1) <= 0) {
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
        long v = this.d;
        if(v == this.a) {
            if(!this.b) {
                throw new NoSuchElementException();
            }
            this.b = false;
            return ULong.box-impl(v);
        }
        this.d = this.c + v;
        return ULong.box-impl(v);
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

