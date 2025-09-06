package kotlin.reflect.jvm.internal.impl.protobuf;

import androidx.datastore.preferences.protobuf.k3;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public final class l extends AbstractMap {
    public final int a;
    public List b;
    public Map c;
    public boolean d;
    public volatile k3 e;
    public static final int f;

    public l(int v) {
        this.a = v;
        this.b = Collections.emptyList();
        this.c = Collections.emptyMap();
    }

    public final int a(Comparable comparable0) {
        int v = this.b.size();
        int v1 = v - 1;
        if(v1 >= 0) {
            int v2 = comparable0.compareTo(((p)this.b.get(v1)).a);
            if(v2 > 0) {
                return -(v + 1);
            }
            if(v2 == 0) {
                return v1;
            }
        }
        int v3 = 0;
        while(v3 <= v1) {
            int v4 = (v3 + v1) / 2;
            int v5 = comparable0.compareTo(((p)this.b.get(v4)).a);
            if(v5 < 0) {
                v1 = v4 - 1;
                continue;
            }
            if(v5 > 0) {
                v3 = v4 + 1;
                continue;
            }
            return v4;
        }
        return -(v3 + 1);
    }

    public final void b() {
        if(this.d) {
            throw new UnsupportedOperationException();
        }
    }

    public final Iterable c() {
        return this.c.isEmpty() ? o.b : this.c.entrySet();
    }

    @Override
    public final void clear() {
        this.b();
        if(!this.b.isEmpty()) {
            this.b.clear();
        }
        if(!this.c.isEmpty()) {
            this.c.clear();
        }
    }

    @Override
    public final boolean containsKey(Object object0) {
        return this.a(((Comparable)object0)) >= 0 || this.c.containsKey(((Comparable)object0));
    }

    public final SortedMap d() {
        this.b();
        if(this.c.isEmpty() && !(this.c instanceof TreeMap)) {
            this.c = new TreeMap();
        }
        return (SortedMap)this.c;
    }

    public final Object e(Comparable comparable0, Object object0) {
        this.b();
        int v = this.a(comparable0);
        if(v >= 0) {
            return ((p)this.b.get(v)).setValue(object0);
        }
        this.b();
        int v1 = this.a;
        if(this.b.isEmpty() && !(this.b instanceof ArrayList)) {
            this.b = new ArrayList(v1);
        }
        if(-(v + 1) >= v1) {
            return this.d().put(comparable0, object0);
        }
        if(this.b.size() == v1) {
            p p0 = (p)this.b.remove(v1 - 1);
            this.d().put(p0.a, p0.b);
        }
        this.b.add(-(v + 1), new p(this, comparable0, object0));
        return null;
    }

    @Override
    public final Set entrySet() {
        if(this.e == null) {
            this.e = new k3(this, 2);
        }
        return this.e;
    }

    public final Object f(int v) {
        this.b();
        Object object0 = ((p)this.b.remove(v)).b;
        if(!this.c.isEmpty()) {
            Iterator iterator0 = this.d().entrySet().iterator();
            List list0 = this.b;
            Object object1 = iterator0.next();
            list0.add(new p(this, ((Comparable)((Map.Entry)object1).getKey()), ((Map.Entry)object1).getValue()));
            iterator0.remove();
        }
        return object0;
    }

    @Override
    public final Object get(Object object0) {
        int v = this.a(((Comparable)object0));
        return v < 0 ? this.c.get(((Comparable)object0)) : ((p)this.b.get(v)).b;
    }

    @Override
    public final Object put(Object object0, Object object1) {
        return this.e(((FieldSet.FieldDescriptorLite)object0), object1);
    }

    @Override
    public final Object remove(Object object0) {
        this.b();
        int v = this.a(((Comparable)object0));
        if(v >= 0) {
            return this.f(v);
        }
        return this.c.isEmpty() ? null : this.c.remove(((Comparable)object0));
    }

    @Override
    public final int size() {
        return this.c.size() + this.b.size();
    }
}

