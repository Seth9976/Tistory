package kotlin.reflect.jvm.internal.impl.util;

import fg.c;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

public abstract class TypeRegistry {
    public final ConcurrentHashMap a;
    public final AtomicInteger b;

    public TypeRegistry() {
        this.a = new ConcurrentHashMap();
        this.b = new AtomicInteger(0);
    }

    public static final AtomicInteger access$getIdCounter$p(TypeRegistry typeRegistry0) {
        return typeRegistry0.b;
    }

    public abstract int customComputeIfAbsent(@NotNull ConcurrentHashMap arg1, @NotNull String arg2, @NotNull Function1 arg3);

    @NotNull
    public final NullableArrayMapAccessor generateNullableAccessor(@NotNull KClass kClass0) {
        Intrinsics.checkNotNullParameter(kClass0, "kClass");
        return new NullableArrayMapAccessor(kClass0, this.getId(kClass0));
    }

    public final int getId(@NotNull KClass kClass0) {
        Intrinsics.checkNotNullParameter(kClass0, "kClass");
        String s = kClass0.getQualifiedName();
        Intrinsics.checkNotNull(s);
        c c0 = new c(this, 13);
        return this.customComputeIfAbsent(this.a, s, c0);
    }

    @NotNull
    public final Collection getIndices() {
        Collection collection0 = this.a.values();
        Intrinsics.checkNotNullExpressionValue(collection0, "idPerType.values");
        return collection0;
    }
}

