package kotlin.reflect.jvm.internal.impl.util;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class ArrayMap implements Iterable, KMappedMarker {
    public ArrayMap(DefaultConstructorMarker defaultConstructorMarker0) {
    }

    @Nullable
    public abstract Object get(int arg1);

    public abstract int getSize();

    @Override
    public Iterator iterator() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public abstract void set(int arg1, @NotNull Object arg2);
}

