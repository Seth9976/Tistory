package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map.Entry;

public final class e3 implements Iterator {
    public int a;
    public Iterator b;
    public final d3 c;

    public e3(d3 d30) {
        this.c = d30;
        this.a = d30.b.size();
    }

    public final Iterator a() {
        if(this.b == null) {
            this.b = this.c.f.entrySet().iterator();
        }
        return this.b;
    }

    // 去混淆评级： 低(30)
    @Override
    public final boolean hasNext() {
        return this.a > 0 && this.a <= this.c.b.size() || this.a().hasNext();
    }

    @Override
    public final Object next() {
        if(this.a().hasNext()) {
            return this.a().next();
        }
        int v = this.a - 1;
        this.a = v;
        return (Map.Entry)this.c.b.get(v);
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

