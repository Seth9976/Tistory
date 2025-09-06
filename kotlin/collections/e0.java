package kotlin.collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.collections.builders.SetBuilder;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public abstract class e0 {
    @PublishedApi
    @SinceKotlin(version = "1.3")
    @NotNull
    public static Set build(@NotNull Set set0) {
        Intrinsics.checkNotNullParameter(set0, "builder");
        return ((SetBuilder)set0).build();
    }

    @PublishedApi
    @SinceKotlin(version = "1.3")
    @NotNull
    public static Set createSetBuilder() {
        return new SetBuilder();
    }

    @PublishedApi
    @SinceKotlin(version = "1.3")
    @NotNull
    public static Set createSetBuilder(int v) {
        return new SetBuilder(v);
    }

    @NotNull
    public static Set setOf(Object object0) [...] // Inlined contents

    @NotNull
    public static final TreeSet sortedSetOf(@NotNull Comparator comparator0, @NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        Intrinsics.checkNotNullParameter(arr_object, "elements");
        return (TreeSet)ArraysKt___ArraysKt.toCollection(arr_object, new TreeSet(comparator0));
    }

    @NotNull
    public static TreeSet sortedSetOf(@NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "elements");
        return (TreeSet)ArraysKt___ArraysKt.toCollection(arr_object, new TreeSet());
    }
}

