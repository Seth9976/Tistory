package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.measurement.t1;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map.Entry;
import kotlin.reflect.jvm.internal.impl.protobuf.l;

public final class j3 implements Iterator {
    public final int a;
    public int b;
    public boolean c;
    public Iterator d;
    public final AbstractMap e;

    public j3(AbstractMap abstractMap0, int v) {
        this.a = v;
        this.e = abstractMap0;
        this.b = -1;
        super();
    }

    public Iterator a() {
        if(this.a != 0) {
            if(this.d == null) {
                this.d = ((l)this.e).c.entrySet().iterator();
            }
            return this.d;
        }
        if(this.d == null) {
            this.d = ((d3)this.e).c.entrySet().iterator();
        }
        return this.d;
    }

    public Iterator b() {
        if(this.d == null) {
            this.d = ((t1)this.e).c.entrySet().iterator();
        }
        return this.d;
    }

    @Override
    public final boolean hasNext() {
        switch(this.a) {
            case 0: {
                int v = this.b + 1;
                d3 d30 = (d3)this.e;
                return v < d30.b.size() || !d30.c.isEmpty() && this.a().hasNext();
            }
            case 1: {
                int v1 = this.b + 1;
                t1 t10 = (t1)this.e;
                return v1 < t10.b.size() || !t10.c.isEmpty() && this.b().hasNext();
            }
            default: {
                return this.b + 1 < ((l)this.e).b.size() || this.a().hasNext();
            }
        }
    }

    @Override
    public final Object next() {
        switch(this.a) {
            case 0: {
                this.c = true;
                int v1 = this.b + 1;
                this.b = v1;
                d3 d30 = (d3)this.e;
                return v1 < d30.b.size() ? ((Map.Entry)d30.b.get(this.b)) : this.a().next();
            }
            case 1: {
                this.c = true;
                int v2 = this.b + 1;
                this.b = v2;
                t1 t10 = (t1)this.e;
                return v2 < t10.b.size() ? ((Map.Entry)t10.b.get(this.b)) : this.b().next();
            }
            default: {
                this.c = true;
                int v = this.b + 1;
                this.b = v;
                l l0 = (l)this.e;
                return v < l0.b.size() ? ((Map.Entry)l0.b.get(this.b)) : this.a().next();
            }
        }
    }

    @Override
    public final void remove() {
        AbstractMap abstractMap0 = this.e;
        switch(this.a) {
            case 0: {
                if(!this.c) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.c = false;
                ((d3)abstractMap0).b();
                if(this.b < ((d3)abstractMap0).b.size()) {
                    int v1 = this.b;
                    this.b = v1 - 1;
                    ((d3)abstractMap0).g(v1);
                    return;
                }
                this.a().remove();
                return;
            }
            case 1: {
                if(!this.c) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.c = false;
                ((t1)abstractMap0).e();
                if(this.b < ((t1)abstractMap0).b.size()) {
                    int v2 = this.b;
                    this.b = v2 - 1;
                    ((t1)abstractMap0).c(v2);
                    return;
                }
                this.b().remove();
                return;
            }
            default: {
                if(!this.c) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.c = false;
                ((l)abstractMap0).b();
                if(this.b < ((l)abstractMap0).b.size()) {
                    int v = this.b;
                    this.b = v - 1;
                    ((l)abstractMap0).f(v);
                    return;
                }
                this.a().remove();
            }
        }
    }
}

