package sd;

import java.io.Serializable;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;

public final class a extends AbstractList implements Serializable, EnumEntries {
    public final Enum[] a;

    public a(Enum[] arr_enum) {
        Intrinsics.checkNotNullParameter(arr_enum, "entries");
        super();
        this.a = arr_enum;
    }

    @Override  // kotlin.collections.AbstractCollection
    public final boolean contains(Object object0) {
        if(!(object0 instanceof Enum)) {
            return false;
        }
        Intrinsics.checkNotNullParameter(((Enum)object0), "element");
        return ((Enum)ArraysKt___ArraysKt.getOrNull(this.a, ((Enum)object0).ordinal())) == ((Enum)object0);
    }

    @Override  // kotlin.collections.AbstractList
    public final Object get(int v) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(v, this.a.length);
        return this.a[v];
    }

    @Override  // kotlin.collections.AbstractList
    public final int getSize() {
        return this.a.length;
    }

    @Override  // kotlin.collections.AbstractList
    public final int indexOf(Object object0) {
        if(!(object0 instanceof Enum)) {
            return -1;
        }
        Intrinsics.checkNotNullParameter(((Enum)object0), "element");
        int v = ((Enum)object0).ordinal();
        return ((Enum)ArraysKt___ArraysKt.getOrNull(this.a, v)) == ((Enum)object0) ? v : -1;
    }

    @Override  // kotlin.collections.AbstractList
    public final int lastIndexOf(Object object0) {
        if(!(object0 instanceof Enum)) {
            return -1;
        }
        Intrinsics.checkNotNullParameter(((Enum)object0), "element");
        return this.indexOf(((Enum)object0));
    }
}

