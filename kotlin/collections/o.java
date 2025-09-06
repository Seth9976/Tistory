package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.ExperimentalStdlibApi;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class o extends n {
    public static boolean addAll(@NotNull Collection collection0, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(collection0, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "elements");
        if(iterable0 instanceof Collection) {
            return collection0.addAll(((Collection)iterable0));
        }
        boolean z = false;
        for(Object object0: iterable0) {
            if(collection0.add(object0)) {
                z = true;
            }
        }
        return z;
    }

    public static boolean addAll(@NotNull Collection collection0, @NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(collection0, "<this>");
        Intrinsics.checkNotNullParameter(sequence0, "elements");
        boolean z = false;
        for(Object object0: sequence0) {
            if(collection0.add(object0)) {
                z = true;
            }
        }
        return z;
    }

    public static boolean addAll(@NotNull Collection collection0, @NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(collection0, "<this>");
        Intrinsics.checkNotNullParameter(arr_object, "elements");
        return collection0.addAll(ArraysKt___ArraysJvmKt.asList(arr_object));
    }

    public static final boolean b(Iterable iterable0, Function1 function10, boolean z) {
        boolean z1 = false;
        Iterator iterator0 = iterable0.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            if(((Boolean)function10.invoke(object0)).booleanValue() == z) {
                iterator0.remove();
                z1 = true;
            }
        }
        return z1;
    }

    public static final boolean c(List list0, Function1 function10, boolean z) {
        if(!(list0 instanceof RandomAccess)) {
            Intrinsics.checkNotNull(list0, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            return o.b(TypeIntrinsics.asMutableIterable(list0), function10, z);
        }
        int v = 0;
        IntIterator intIterator0 = new IntRange(0, CollectionsKt__CollectionsKt.getLastIndex(list0)).iterator();
        while(intIterator0.hasNext()) {
            int v1 = intIterator0.nextInt();
            Object object0 = list0.get(v1);
            if(((Boolean)function10.invoke(object0)).booleanValue() != z) {
                if(v != v1) {
                    list0.set(v, object0);
                }
                ++v;
            }
        }
        if(v < list0.size()) {
            int v2 = CollectionsKt__CollectionsKt.getLastIndex(list0);
            if(v <= v2) {
                while(true) {
                    list0.remove(v2);
                    if(v2 == v) {
                        break;
                    }
                    --v2;
                }
            }
            return true;
        }
        return false;
    }

    @NotNull
    public static Collection convertToListIfNotCollection(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        return iterable0 instanceof Collection ? ((Collection)iterable0) : CollectionsKt___CollectionsKt.toList(iterable0);
    }

    public static boolean removeAll(@NotNull Iterable iterable0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        return o.b(iterable0, function10, true);
    }

    public static boolean removeAll(@NotNull Collection collection0, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(collection0, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "elements");
        return collection0.removeAll(o.convertToListIfNotCollection(iterable0));
    }

    public static boolean removeAll(@NotNull Collection collection0, @NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(collection0, "<this>");
        Intrinsics.checkNotNullParameter(sequence0, "elements");
        Collection collection1 = SequencesKt___SequencesKt.toList(sequence0);
        return !collection1.isEmpty() && collection0.removeAll(collection1);
    }

    public static boolean removeAll(@NotNull Collection collection0, @NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(collection0, "<this>");
        Intrinsics.checkNotNullParameter(arr_object, "elements");
        return arr_object.length != 0 && collection0.removeAll(ArraysKt___ArraysJvmKt.asList(arr_object));
    }

    public static boolean removeAll(@NotNull List list0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        return o.c(list0, function10, true);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static Object removeFirst(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        if(list0.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list0.remove(0);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static Object removeFirstOrNull(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        return list0.isEmpty() ? null : list0.remove(0);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static Object removeLast(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        if(list0.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list0.remove(CollectionsKt__CollectionsKt.getLastIndex(list0));
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static Object removeLastOrNull(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        return list0.isEmpty() ? null : list0.remove(CollectionsKt__CollectionsKt.getLastIndex(list0));
    }

    public static boolean retainAll(@NotNull Iterable iterable0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        return o.b(iterable0, function10, false);
    }

    public static boolean retainAll(@NotNull Collection collection0, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(collection0, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "elements");
        return collection0.retainAll(o.convertToListIfNotCollection(iterable0));
    }

    public static final boolean retainAll(@NotNull Collection collection0, @NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(collection0, "<this>");
        Intrinsics.checkNotNullParameter(sequence0, "elements");
        Collection collection1 = SequencesKt___SequencesKt.toList(sequence0);
        if(!collection1.isEmpty()) {
            return collection0.retainAll(collection1);
        }
        collection0.clear();
        return !collection0.isEmpty();
    }

    public static final boolean retainAll(@NotNull Collection collection0, @NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(collection0, "<this>");
        Intrinsics.checkNotNullParameter(arr_object, "elements");
        if(arr_object.length == 0) {
            collection0.clear();
            return !collection0.isEmpty();
        }
        return collection0.retainAll(ArraysKt___ArraysJvmKt.asList(arr_object));
    }

    public static final boolean retainAll(@NotNull List list0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        return o.c(list0, function10, false);
    }
}

