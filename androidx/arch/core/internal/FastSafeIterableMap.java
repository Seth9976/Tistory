package androidx.arch.core.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.HashMap;
import java.util.Map.Entry;
import o.b;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
public class FastSafeIterableMap extends SafeIterableMap {
    public final HashMap e;

    public FastSafeIterableMap() {
        this.e = new HashMap();
    }

    @Nullable
    public Map.Entry ceil(Object object0) {
        return this.contains(object0) ? ((b)this.e.get(object0)).d : null;
    }

    public boolean contains(Object object0) {
        return this.e.containsKey(object0);
    }

    @Override  // androidx.arch.core.internal.SafeIterableMap
    @Nullable
    public b get(Object object0) {
        return (b)this.e.get(object0);
    }

    @Override  // androidx.arch.core.internal.SafeIterableMap
    public Object putIfAbsent(@NonNull Object object0, @NonNull Object object1) {
        b b0 = this.get(object0);
        if(b0 != null) {
            return b0.b;
        }
        HashMap hashMap0 = this.e;
        b b1 = new b(object0, object1);
        ++this.d;
        b b2 = this.b;
        if(b2 == null) {
            this.a = b1;
        }
        else {
            b2.c = b1;
            b1.d = b2;
        }
        this.b = b1;
        hashMap0.put(object0, b1);
        return null;
    }

    @Override  // androidx.arch.core.internal.SafeIterableMap
    public Object remove(@NonNull Object object0) {
        Object object1 = super.remove(object0);
        this.e.remove(object0);
        return object1;
    }
}

