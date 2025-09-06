package com.google.android.gms.internal.measurement;

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

public final class t1 extends AbstractMap {
    public final int a;
    public List b;
    public Map c;
    public boolean d;
    public volatile k3 e;
    public Map f;
    public static final int g;

    public t1(int v) {
        this.a = v;
        this.b = Collections.emptyList();
        this.c = Collections.emptyMap();
        this.f = Collections.emptyMap();
    }

    public final Object a(Comparable comparable0, Object object0) {
        this.e();
        int v = this.b(comparable0);
        if(v >= 0) {
            return ((w1)this.b.get(v)).setValue(object0);
        }
        this.e();
        int v1 = this.a;
        if(this.b.isEmpty() && !(this.b instanceof ArrayList)) {
            this.b = new ArrayList(v1);
        }
        if(-(v + 1) >= v1) {
            return this.d().put(comparable0, object0);
        }
        if(this.b.size() == v1) {
            w1 w10 = (w1)this.b.remove(v1 - 1);
            this.d().put(w10.a, w10.b);
        }
        this.b.add(-(v + 1), new w1(this, comparable0, object0));
        return null;
    }

    public final int b(Comparable comparable0) {
        int v = this.b.size();
        int v1 = v - 1;
        int v2 = 0;
        if(v1 >= 0) {
            int v3 = comparable0.compareTo(((w1)this.b.get(v1)).a);
            if(v3 > 0) {
                return -(v + 1);
            }
            if(v3 == 0) {
                return v1;
            }
        }
        while(v2 <= v1) {
            int v4 = (v2 + v1) / 2;
            int v5 = comparable0.compareTo(((w1)this.b.get(v4)).a);
            if(v5 < 0) {
                v1 = v4 - 1;
                continue;
            }
            if(v5 > 0) {
                v2 = v4 + 1;
                continue;
            }
            return v4;
        }
        return -(v2 + 1);
    }

    public final Object c(int v) {
        this.e();
        Object object0 = ((w1)this.b.remove(v)).b;
        if(!this.c.isEmpty()) {
            Iterator iterator0 = this.d().entrySet().iterator();
            List list0 = this.b;
            Object object1 = iterator0.next();
            list0.add(new w1(this, ((Comparable)((Map.Entry)object1).getKey()), ((Map.Entry)object1).getValue()));
            iterator0.remove();
        }
        return object0;
    }

    @Override
    public final void clear() {
        this.e();
        if(!this.b.isEmpty()) {
            this.b.clear();
        }
        if(!this.c.isEmpty()) {
            this.c.clear();
        }
    }

    @Override
    public final boolean containsKey(Object object0) {
        return this.b(((Comparable)object0)) >= 0 || this.c.containsKey(((Comparable)object0));
    }

    public final SortedMap d() {
        this.e();
        if(this.c.isEmpty() && !(this.c instanceof TreeMap)) {
            TreeMap treeMap0 = new TreeMap();
            this.c = treeMap0;
            this.f = treeMap0.descendingMap();
        }
        return (SortedMap)this.c;
    }

    public final void e() {
        if(this.d) {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public final Set entrySet() {
        if(this.e == null) {
            this.e = new k3(this, 1);
        }
        return this.e;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof t1)) {
            return super.equals(object0);
        }
        int v = this.size();
        if(v != ((t1)object0).size()) {
            return false;
        }
        int v1 = this.b.size();
        if(v1 == ((t1)object0).b.size()) {
            for(int v2 = 0; v2 < v1; ++v2) {
                if(!((Map.Entry)this.b.get(v2)).equals(((Map.Entry)((t1)object0).b.get(v2)))) {
                    return false;
                }
            }
            return v1 == v ? true : this.c.equals(((t1)object0).c);
        }
        return this.entrySet().equals(((t1)object0).entrySet());
    }

    @Override
    public final Object get(Object object0) {
        int v = this.b(((Comparable)object0));
        return v < 0 ? this.c.get(((Comparable)object0)) : ((w1)this.b.get(v)).b;
    }

    @Override
    public final int hashCode() {
        int v = this.b.size();
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            v2 += ((w1)this.b.get(v1)).hashCode();
        }
        return this.c.size() <= 0 ? v2 : this.c.hashCode() + v2;
    }

    @Override
    public final Object put(Object object0, Object object1) {
        return this.a(((Comparable)object0), object1);
    }

    @Override
    public final Object remove(Object object0) {
        this.e();
        int v = this.b(((Comparable)object0));
        if(v >= 0) {
            return this.c(v);
        }
        return this.c.isEmpty() ? null : this.c.remove(((Comparable)object0));
    }

    @Override
    public final int size() {
        return this.c.size() + this.b.size();
    }
}

