package kotlin.reflect.jvm.internal.impl.util;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class EmptyArrayMap extends ArrayMap {
    @NotNull
    public static final EmptyArrayMap INSTANCE;

    static {
        EmptyArrayMap.INSTANCE = new EmptyArrayMap(null);  // 初始化器: Lkotlin/reflect/jvm/internal/impl/util/ArrayMap;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    }

    @Override  // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public Object get(int v) {
        return null;
    }

    @Nullable
    public Void get(int v) [...] // Inlined contents

    @Override  // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public int getSize() {
        return 0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    @NotNull
    public Iterator iterator() {
        return new kotlin.reflect.jvm.internal.impl.util.EmptyArrayMap.iterator.1();  // 初始化器: Ljava/lang/Object;-><init>()V

        public final class kotlin.reflect.jvm.internal.impl.util.EmptyArrayMap.iterator.1 implements Iterator, KMappedMarker {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Object next() {
                return this.next();
            }

            @NotNull
            public Void next() {
                throw new NoSuchElementException();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

    }

    @Override  // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public void set(int v, Object object0) {
        this.set(v, ((Void)object0));
    }

    public void set(int v, @NotNull Void void0) {
        Intrinsics.checkNotNullParameter(void0, "value");
        throw new IllegalStateException();
    }
}

