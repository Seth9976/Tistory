package kotlin.reflect.jvm.internal.impl.util;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class AbstractArrayMapOwner implements Iterable, KMappedMarker {
    public static abstract class AbstractArrayMapAccessor {
        public final KClass a;
        public final int b;

        public AbstractArrayMapAccessor(@NotNull KClass kClass0, int v) {
            Intrinsics.checkNotNullParameter(kClass0, "key");
            super();
            this.a = kClass0;
            this.b = v;
        }

        @Nullable
        public final Object extractValue(@NotNull AbstractArrayMapOwner abstractArrayMapOwner0) {
            Intrinsics.checkNotNullParameter(abstractArrayMapOwner0, "thisRef");
            return abstractArrayMapOwner0.getArrayMap().get(this.b);
        }
    }

    @NotNull
    public abstract ArrayMap getArrayMap();

    @NotNull
    public abstract TypeRegistry getTypeRegistry();

    public final boolean isEmpty() {
        return this.getArrayMap().getSize() == 0;
    }

    @Override
    @NotNull
    public final Iterator iterator() {
        return this.getArrayMap().iterator();
    }

    public abstract void registerComponent(@NotNull KClass arg1, @NotNull Object arg2);
}

