package kotlin.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class f0 extends e0 {
    @NotNull
    public static Set emptySet() [...] // Inlined contents

    @NotNull
    public static final HashSet hashSetOf(@NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "elements");
        return (HashSet)ArraysKt___ArraysKt.toCollection(arr_object, new HashSet(w.mapCapacity(arr_object.length)));
    }

    @NotNull
    public static LinkedHashSet linkedSetOf(@NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "elements");
        return (LinkedHashSet)ArraysKt___ArraysKt.toCollection(arr_object, new LinkedHashSet(w.mapCapacity(arr_object.length)));
    }

    @NotNull
    public static Set mutableSetOf(@NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "elements");
        return (Set)ArraysKt___ArraysKt.toCollection(arr_object, new LinkedHashSet(w.mapCapacity(arr_object.length)));
    }

    @NotNull
    public static final Set optimizeReadOnlySet(@NotNull Set set0) {
        Intrinsics.checkNotNullParameter(set0, "<this>");
        switch(set0.size()) {
            case 0: {
                return f0.emptySet();
            }
            case 1: {
                Object object0 = set0.iterator().next();
                return e0.setOf(object0);
            }
            default: {
                return set0;
            }
        }
    }

    @NotNull
    public static Set setOf(@NotNull Object[] arr_object) [...] // Inlined contents

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final Set setOfNotNull(@Nullable Object object0) {
        return object0 == null ? f0.emptySet() : e0.setOf(object0);
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final Set setOfNotNull(@NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "elements");
        return (Set)ArraysKt___ArraysKt.filterNotNullTo(arr_object, new LinkedHashSet());
    }
}

