package androidx.arch.core.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.WeakHashMap;
import o.a;
import o.b;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
public class SafeIterableMap implements Iterable {
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public class IteratorWithAdditions extends SupportRemove implements Iterator {
        public b a;
        public boolean b;
        public final SafeIterableMap c;

        public IteratorWithAdditions() {
            this.b = true;
        }

        @Override  // androidx.arch.core.internal.SafeIterableMap$SupportRemove
        public final void a(b b0) {
            b b1 = this.a;
            if(b0 == b1) {
                this.a = b1.d;
                this.b = b1.d == null;
            }
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean hasNext() {
            return this.b ? SafeIterableMap.this.a != null : this.a != null && this.a.c != null;
        }

        @Override
        public Object next() {
            return this.next();
        }

        public Map.Entry next() {
            if(this.b) {
                this.b = false;
                this.a = SafeIterableMap.this.a;
                return this.a;
            }
            this.a = this.a == null ? null : this.a.c;
            return this.a;
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public static abstract class SupportRemove {
        public abstract void a(b arg1);
    }

    public b a;
    public b b;
    public final WeakHashMap c;
    public int d;

    public SafeIterableMap() {
        this.c = new WeakHashMap();
        this.d = 0;
    }

    @NonNull
    public Iterator descendingIterator() {
        Iterator iterator0 = new a(this.b, this.a, 1);
        this.c.put(iterator0, Boolean.FALSE);
        return iterator0;
    }

    @Nullable
    public Map.Entry eldest() {
        return this.a;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof SafeIterableMap)) {
            return false;
        }
        if(this.size() != ((SafeIterableMap)object0).size()) {
            return false;
        }
        Iterator iterator0 = this.iterator();
        Iterator iterator1 = ((SafeIterableMap)object0).iterator();
        while(iterator0.hasNext() && iterator1.hasNext()) {
            Object object1 = iterator0.next();
            Map.Entry map$Entry0 = (Map.Entry)object1;
            Object object2 = iterator1.next();
            if(map$Entry0 == null && object2 != null || map$Entry0 != null && !map$Entry0.equals(object2)) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return !iterator0.hasNext() && !iterator1.hasNext();
    }

    @Nullable
    public b get(Object object0) {
        b b0;
        for(b0 = this.a; b0 != null && !b0.a.equals(object0); b0 = b0.c) {
        }
        return b0;
    }

    @Override
    public int hashCode() {
        int v = 0;
        for(Object object0: this) {
            v += ((Map.Entry)object0).hashCode();
        }
        return v;
    }

    @Override
    @NonNull
    public Iterator iterator() {
        Iterator iterator0 = new a(this.a, this.b, 0);
        this.c.put(iterator0, Boolean.FALSE);
        return iterator0;
    }

    @NonNull
    public IteratorWithAdditions iteratorWithAdditions() {
        IteratorWithAdditions safeIterableMap$IteratorWithAdditions0 = new IteratorWithAdditions(this);
        this.c.put(safeIterableMap$IteratorWithAdditions0, Boolean.FALSE);
        return safeIterableMap$IteratorWithAdditions0;
    }

    @Nullable
    public Map.Entry newest() {
        return this.b;
    }

    public Object putIfAbsent(@NonNull Object object0, @NonNull Object object1) {
        b b0 = this.get(object0);
        if(b0 != null) {
            return b0.b;
        }
        b b1 = new b(object0, object1);
        ++this.d;
        b b2 = this.b;
        if(b2 == null) {
            this.a = b1;
            this.b = b1;
            return null;
        }
        b2.c = b1;
        b1.d = b2;
        this.b = b1;
        return null;
    }

    public Object remove(@NonNull Object object0) {
        b b0 = this.get(object0);
        if(b0 == null) {
            return null;
        }
        --this.d;
        WeakHashMap weakHashMap0 = this.c;
        if(!weakHashMap0.isEmpty()) {
            for(Object object1: weakHashMap0.keySet()) {
                ((SupportRemove)object1).a(b0);
            }
        }
        b b1 = b0.d;
        if(b1 == null) {
            this.a = b0.c;
        }
        else {
            b1.c = b0.c;
        }
        b b2 = b0.c;
        if(b2 == null) {
            this.b = b1;
        }
        else {
            b2.d = b1;
        }
        b0.c = null;
        b0.d = null;
        return b0.b;
    }

    public int size() {
        return this.d;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("[");
        Iterator iterator0 = this.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            stringBuilder0.append(((Map.Entry)object0).toString());
            if(iterator0.hasNext()) {
                stringBuilder0.append(", ");
            }
        }
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }
}

