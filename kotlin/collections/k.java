package kotlin.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public abstract class k {
    @PublishedApi
    @SinceKotlin(version = "1.3")
    @NotNull
    public static List build(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "builder");
        return ((ListBuilder)list0).build();
    }

    @NotNull
    public static final Object[] copyToArrayOfAny(@NotNull Object[] arr_object, boolean z) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Class class0 = Object[].class;
        if(!z || !Intrinsics.areEqual(arr_object.getClass(), class0)) {
            arr_object = Arrays.copyOf(arr_object, arr_object.length, class0);
            Intrinsics.checkNotNullExpressionValue(arr_object, "copyOf(...)");
        }
        return arr_object;
    }

    @PublishedApi
    @SinceKotlin(version = "1.3")
    @NotNull
    public static List createListBuilder() {
        return new ListBuilder();
    }

    @PublishedApi
    @SinceKotlin(version = "1.3")
    @NotNull
    public static List createListBuilder(int v) {
        return new ListBuilder(v);
    }

    @NotNull
    public static List listOf(Object object0) {
        List list0 = Collections.singletonList(object0);
        Intrinsics.checkNotNullExpressionValue(list0, "singletonList(...)");
        return list0;
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final List shuffled(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        List list0 = CollectionsKt___CollectionsKt.toMutableList(iterable0);
        Collections.shuffle(list0);
        return list0;
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final List shuffled(@NotNull Iterable iterable0, @NotNull Random random0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(random0, "random");
        List list0 = CollectionsKt___CollectionsKt.toMutableList(iterable0);
        Collections.shuffle(list0, random0);
        return list0;
    }

    @NotNull
    public static Object[] terminateCollectionToArray(int v, @NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "array");
        if(v < arr_object.length) {
            arr_object[v] = null;
        }
        return arr_object;
    }
}

