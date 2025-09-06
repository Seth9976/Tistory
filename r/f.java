package r;

import java.util.Map.Entry;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableMap.Entry;

public final class f implements Map.Entry, Entry {
    public final Object[] a;
    public final Object[] b;
    public final int c;

    public f(int v, Object[] arr_object, Object[] arr_object1) {
        Intrinsics.checkNotNullParameter(arr_object, "keys");
        Intrinsics.checkNotNullParameter(arr_object1, "values");
        super();
        this.a = arr_object;
        this.b = arr_object1;
        this.c = v;
    }

    @Override
    public final Object getKey() {
        return this.a[this.c];
    }

    @Override
    public final Object getValue() {
        return this.b[this.c];
    }

    @Override
    public final Object setValue(Object object0) {
        Object object1 = this.b[this.c];
        this.b[this.c] = object0;
        return object1;
    }
}

