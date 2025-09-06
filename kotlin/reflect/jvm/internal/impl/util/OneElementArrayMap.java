package kotlin.reflect.jvm.internal.impl.util;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class OneElementArrayMap extends ArrayMap {
    public final Object a;
    public final int b;

    public OneElementArrayMap(@NotNull Object object0, int v) {
        Intrinsics.checkNotNullParameter(object0, "value");
        super(null);
        this.a = object0;
        this.b = v;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    @Nullable
    public Object get(int v) {
        return v == this.b ? this.a : null;
    }

    public final int getIndex() {
        return this.b;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public int getSize() {
        return 1;
    }

    @NotNull
    public final Object getValue() {
        return this.a;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    @NotNull
    public Iterator iterator() {
        return new Object() {
            public boolean a;
            public final OneElementArrayMap b;

            {
                this.b = oneElementArrayMap0;
                this.a = true;
            }

            @Override
            public boolean hasNext() {
                return this.a;
            }

            @Override
            @NotNull
            public Object next() {
                if(!this.a) {
                    throw new NoSuchElementException();
                }
                this.a = false;
                return this.b.getValue();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        };
    }

    @Override  // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public void set(int v, @NotNull Object object0) {
        Intrinsics.checkNotNullParameter(object0, "value");
        throw new IllegalStateException();
    }
}

