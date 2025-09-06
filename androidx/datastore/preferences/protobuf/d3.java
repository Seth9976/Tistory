package androidx.datastore.preferences.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public final class d3 extends AbstractMap {
    public final int a;
    public List b;
    public Map c;
    public boolean d;
    public volatile k3 e;
    public Map f;
    public volatile f3 g;
    public static final int h;

    public d3(int v) {
        this.a = v;
        this.b = Collections.emptyList();
        this.c = Collections.emptyMap();
        this.f = Collections.emptyMap();
    }

    public final int a(Comparable comparable0) {
        int v = this.b.size();
        int v1 = v - 1;
        if(v1 >= 0) {
            int v2 = comparable0.compareTo(((i3)this.b.get(v1)).a);
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
            int v5 = comparable0.compareTo(((i3)this.b.get(v4)).a);
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

    public final Map.Entry c(int v) {
        return (Map.Entry)this.b.get(v);
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

    public final Iterable d() {
        return this.c.isEmpty() ? e4.c : this.c.entrySet();
    }

    public final SortedMap e() {
        this.b();
        if(this.c.isEmpty() && !(this.c instanceof TreeMap)) {
            TreeMap treeMap0 = new TreeMap();
            this.c = treeMap0;
            this.f = treeMap0.descendingMap();
        }
        return (SortedMap)this.c;
    }

    @Override
    public final Set entrySet() {
        if(this.e == null) {
            this.e = new k3(this, 0);
        }
        return this.e;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof d3)) {
            return super.equals(object0);
        }
        int v = this.size();
        if(v != ((d3)object0).size()) {
            return false;
        }
        int v1 = this.b.size();
        if(v1 != ((d3)object0).b.size()) {
            return ((AbstractSet)this.entrySet()).equals(((d3)object0).entrySet());
        }
        for(int v2 = 0; v2 < v1; ++v2) {
            if(!this.c(v2).equals(((d3)object0).c(v2))) {
                return false;
            }
        }
        return v1 == v ? true : this.c.equals(((d3)object0).c);
    }

    public final Object f(Comparable comparable0, Object object0) {
        this.b();
        int v = this.a(comparable0);
        if(v >= 0) {
            return ((i3)this.b.get(v)).setValue(object0);
        }
        this.b();
        int v1 = this.a;
        if(this.b.isEmpty() && !(this.b instanceof ArrayList)) {
            this.b = new ArrayList(v1);
        }
        if(-(v + 1) >= v1) {
            return this.e().put(comparable0, object0);
        }
        if(this.b.size() == v1) {
            i3 i30 = (i3)this.b.remove(v1 - 1);
            this.e().put(i30.a, i30.b);
        }
        this.b.add(-(v + 1), new i3(this, comparable0, object0));
        return null;
    }

    public final Object g(int v) {
        this.b();
        Object object0 = ((i3)this.b.remove(v)).b;
        if(!this.c.isEmpty()) {
            Iterator iterator0 = this.e().entrySet().iterator();
            List list0 = this.b;
            Object object1 = iterator0.next();
            list0.add(new i3(this, ((Comparable)((Map.Entry)object1).getKey()), ((Map.Entry)object1).getValue()));
            iterator0.remove();
        }
        return object0;
    }

    @Override
    public final Object get(Object object0) {
        int v = this.a(((Comparable)object0));
        return v < 0 ? this.c.get(((Comparable)object0)) : ((i3)this.b.get(v)).b;
    }

    @Override
    public final int hashCode() {
        int v = this.b.size();
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            v2 += ((i3)this.b.get(v1)).hashCode();
        }
        return this.c.size() <= 0 ? v2 : v2 + this.c.hashCode();
    }

    @Override
    public final Object put(Object object0, Object object1) {
        return this.f(((Comparable)object0), object1);
    }

    @Override
    public final Object remove(Object object0) {
        this.b();
        int v = this.a(((Comparable)object0));
        if(v >= 0) {
            return this.g(v);
        }
        return this.c.isEmpty() ? null : this.c.remove(((Comparable)object0));
    }

    @Override
    public final int size() {
        return this.c.size() + this.b.size();
    }
}

