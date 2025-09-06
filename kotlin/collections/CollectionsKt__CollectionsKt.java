package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pd.c;

public abstract class CollectionsKt__CollectionsKt extends k {
    public static final void a(int v, int v1, int v2) {
        if(v1 > v2) {
            throw new IllegalArgumentException("fromIndex (" + v1 + ") is greater than toIndex (" + v2 + ").");
        }
        if(v1 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + v1 + ") is less than zero.");
        }
        if(v2 > v) {
            throw new IndexOutOfBoundsException("toIndex (" + v2 + ") is greater than size (" + v + ").");
        }
    }

    @NotNull
    public static ArrayList arrayListOf(@NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "elements");
        return arr_object.length == 0 ? new ArrayList() : new ArrayList(new d(arr_object, true));
    }

    @NotNull
    public static final Collection asCollection(@NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        return new d(arr_object, false);
    }

    public static int binarySearch(@NotNull List list0, int v, int v1, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "comparison");
        CollectionsKt__CollectionsKt.a(list0.size(), v, v1);
        int v2 = v1 - 1;
        while(v <= v2) {
            int v3 = v + v2 >>> 1;
            int v4 = ((Number)function10.invoke(list0.get(v3))).intValue();
            if(v4 < 0) {
                v = v3 + 1;
                continue;
            }
            if(v4 > 0) {
                v2 = v3 - 1;
                continue;
            }
            return v3;
        }
        return -(v + 1);
    }

    public static final int binarySearch(@NotNull List list0, @Nullable Comparable comparable0, int v, int v1) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        CollectionsKt__CollectionsKt.a(list0.size(), v, v1);
        int v2 = v1 - 1;
        while(v <= v2) {
            int v3 = v + v2 >>> 1;
            int v4 = c.compareValues(((Comparable)list0.get(v3)), comparable0);
            if(v4 < 0) {
                v = v3 + 1;
                continue;
            }
            if(v4 > 0) {
                v2 = v3 - 1;
                continue;
            }
            return v3;
        }
        return -(v + 1);
    }

    public static final int binarySearch(@NotNull List list0, Object object0, @NotNull Comparator comparator0, int v, int v1) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        CollectionsKt__CollectionsKt.a(list0.size(), v, v1);
        int v2 = v1 - 1;
        while(v <= v2) {
            int v3 = v + v2 >>> 1;
            int v4 = comparator0.compare(list0.get(v3), object0);
            if(v4 < 0) {
                v = v3 + 1;
                continue;
            }
            if(v4 > 0) {
                v2 = v3 - 1;
                continue;
            }
            return v3;
        }
        return -(v + 1);
    }

    public static int binarySearch$default(List list0, int v, int v1, Function1 function10, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = 0;
        }
        if((v2 & 2) != 0) {
            v1 = list0.size();
        }
        return CollectionsKt__CollectionsKt.binarySearch(list0, v, v1, function10);
    }

    public static int binarySearch$default(List list0, Comparable comparable0, int v, int v1, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v = 0;
        }
        if((v2 & 4) != 0) {
            v1 = list0.size();
        }
        return CollectionsKt__CollectionsKt.binarySearch(list0, comparable0, v, v1);
    }

    public static int binarySearch$default(List list0, Object object0, Comparator comparator0, int v, int v1, int v2, Object object1) {
        if((v2 & 4) != 0) {
            v = 0;
        }
        if((v2 & 8) != 0) {
            v1 = list0.size();
        }
        return CollectionsKt__CollectionsKt.binarySearch(list0, object0, comparator0, v, v1);
    }

    public static final int binarySearchBy(@NotNull List list0, @Nullable Comparable comparable0, int v, int v1, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        return CollectionsKt__CollectionsKt.binarySearch(list0, v, v1, new Function1(function10, comparable0) {
            public final Function1 w;
            public final Comparable x;

            {
                this.w = function10;
                this.x = comparable0;
                super(1);
            }

            @NotNull
            public final Integer invoke(Object object0) {
                return c.compareValues(((Comparable)this.w.invoke(object0)), this.x);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(object0);
            }
        });
    }

    public static int binarySearchBy$default(List list0, Comparable comparable0, int v, int v1, Function1 function10, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v = 0;
        }
        if((v2 & 4) != 0) {
            v1 = list0.size();
        }
        Intrinsics.checkNotNullParameter(list0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        return CollectionsKt__CollectionsKt.binarySearch(list0, v, v1, new kotlin.collections.CollectionsKt__CollectionsKt.binarySearchBy.1(function10, comparable0));
    }

    @NotNull
    public static final Object[] collectionToArrayCommonImpl(@NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "collection");
        int v = 0;
        if(collection0.isEmpty()) {
            return new Object[0];
        }
        Object[] arr_object = new Object[collection0.size()];
        for(Object object0: collection0) {
            arr_object[v] = object0;
            ++v;
        }
        return arr_object;
    }

    @NotNull
    public static final Object[] collectionToArrayCommonImpl(@NotNull Collection collection0, @NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(collection0, "collection");
        Intrinsics.checkNotNullParameter(arr_object, "array");
        int v = 0;
        if(collection0.isEmpty()) {
            return k.terminateCollectionToArray(0, arr_object);
        }
        if(arr_object.length < collection0.size()) {
            arr_object = e.arrayOfNulls(arr_object, collection0.size());
        }
        for(Object object0: collection0) {
            arr_object[v] = object0;
            ++v;
        }
        return k.terminateCollectionToArray(collection0.size(), arr_object);
    }

    @NotNull
    public static List emptyList() {
        return EmptyList.INSTANCE;
    }

    @NotNull
    public static IntRange getIndices(@NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "<this>");
        return new IntRange(0, collection0.size() - 1);
    }

    public static int getLastIndex(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        return list0.size() - 1;
    }

    @NotNull
    public static List listOf(@NotNull Object[] arr_object) [...] // Inlined contents

    @NotNull
    public static List listOfNotNull(@Nullable Object object0) {
        return object0 == null ? CollectionsKt__CollectionsKt.emptyList() : k.listOf(object0);
    }

    @NotNull
    public static List listOfNotNull(@NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "elements");
        return ArraysKt___ArraysKt.filterNotNull(arr_object);
    }

    @NotNull
    public static List mutableListOf(@NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "elements");
        return arr_object.length == 0 ? new ArrayList() : new ArrayList(new d(arr_object, true));
    }

    @NotNull
    public static final List optimizeReadOnlyList(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        switch(list0.size()) {
            case 0: {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            case 1: {
                return k.listOf(list0.get(0));
            }
            default: {
                return list0;
            }
        }
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final List shuffled(@NotNull Iterable iterable0, @NotNull Random random0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(random0, "random");
        List list0 = CollectionsKt___CollectionsKt.toMutableList(iterable0);
        CollectionsKt___CollectionsKt.shuffle(list0, random0);
        return list0;
    }

    @PublishedApi
    @SinceKotlin(version = "1.3")
    public static void throwCountOverflow() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    @PublishedApi
    @SinceKotlin(version = "1.3")
    public static void throwIndexOverflow() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}

