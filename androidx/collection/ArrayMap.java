package androidx.collection;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.datastore.preferences.protobuf.k3;
import java.util.Collection;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import r.b;
import r.d;

public class ArrayMap extends SimpleArrayMap implements Map {
    public k3 d;
    public b e;
    public d f;

    public ArrayMap() {
    }

    public ArrayMap(int v) {
        super(v);
    }

    public ArrayMap(@Nullable SimpleArrayMap simpleArrayMap0) {
        super(simpleArrayMap0);
    }

    public boolean containsAll(@NonNull Collection collection0) {
        for(Object object0: collection0) {
            if(!this.containsKey(object0)) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    @Override  // androidx.collection.SimpleArrayMap
    public boolean containsKey(@Nullable Object object0) {
        return super.containsKey(object0);
    }

    @Override  // androidx.collection.SimpleArrayMap
    public boolean containsValue(@Nullable Object object0) {
        return super.containsValue(object0);
    }

    @Override
    @NonNull
    public Set entrySet() {
        k3 k30 = this.d;
        if(k30 == null) {
            k30 = new k3(this, 3);
            this.d = k30;
        }
        return k30;
    }

    @Override  // androidx.collection.SimpleArrayMap
    public Object get(@Nullable Object object0) {
        return super.get(object0);
    }

    @Override
    @NonNull
    public Set keySet() {
        b b0 = this.e;
        if(b0 == null) {
            b0 = new b(this);
            this.e = b0;
        }
        return b0;
    }

    @Override
    public void putAll(@NonNull Map map0) {
        this.ensureCapacity(map0.size() + this.size());
        for(Object object0: map0.entrySet()) {
            this.put(((Map.Entry)object0).getKey(), ((Map.Entry)object0).getValue());
        }
    }

    @Override  // androidx.collection.SimpleArrayMap
    public Object remove(@Nullable Object object0) {
        return super.remove(object0);
    }

    public boolean removeAll(@NonNull Collection collection0) {
        int v = this.size();
        for(Object object0: collection0) {
            this.remove(object0);
        }
        return v != this.size();
    }

    public boolean retainAll(@NonNull Collection collection0) {
        int v = this.size();
        for(int v1 = this.size() - 1; v1 >= 0; --v1) {
            if(!collection0.contains(this.keyAt(v1))) {
                this.removeAt(v1);
            }
        }
        return v != this.size();
    }

    @Override
    @NonNull
    public Collection values() {
        d d0 = this.f;
        if(d0 == null) {
            d0 = new d(this);
            this.f = d0;
        }
        return d0;
    }
}

