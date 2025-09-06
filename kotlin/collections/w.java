package kotlin.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public abstract class w extends v {
    @PublishedApi
    @SinceKotlin(version = "1.3")
    @NotNull
    public static Map build(@NotNull Map map0) {
        Intrinsics.checkNotNullParameter(map0, "builder");
        return ((MapBuilder)map0).build();
    }

    @PublishedApi
    @SinceKotlin(version = "1.3")
    @NotNull
    public static Map createMapBuilder() {
        return new MapBuilder();
    }

    @PublishedApi
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final Map createMapBuilder(int v) {
        return new MapBuilder(v);
    }

    public static final Object getOrPut(@NotNull ConcurrentMap concurrentMap0, Object object0, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(concurrentMap0, "<this>");
        Intrinsics.checkNotNullParameter(function00, "defaultValue");
        Object object1 = concurrentMap0.get(object0);
        if(object1 == null) {
            Object object2 = function00.invoke();
            Object object3 = concurrentMap0.putIfAbsent(object0, object2);
            return object3 == null ? object2 : object3;
        }
        return object1;
    }

    @PublishedApi
    public static int mapCapacity(int v) [...] // Inlined contents

    @NotNull
    public static Map mapOf(@NotNull Pair pair0) {
        Intrinsics.checkNotNullParameter(pair0, "pair");
        Map map0 = Collections.singletonMap(pair0.getFirst(), pair0.getSecond());
        Intrinsics.checkNotNullExpressionValue(map0, "singletonMap(...)");
        return map0;
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final SortedMap sortedMapOf(@NotNull Comparator comparator0, @NotNull Pair[] arr_pair) {
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        Intrinsics.checkNotNullParameter(arr_pair, "pairs");
        SortedMap sortedMap0 = new TreeMap(comparator0);
        x.putAll(sortedMap0, arr_pair);
        return sortedMap0;
    }

    @NotNull
    public static final SortedMap sortedMapOf(@NotNull Pair[] arr_pair) {
        Intrinsics.checkNotNullParameter(arr_pair, "pairs");
        SortedMap sortedMap0 = new TreeMap();
        x.putAll(sortedMap0, arr_pair);
        return sortedMap0;
    }

    @NotNull
    public static final Map toSingletonMap(@NotNull Map map0) {
        Intrinsics.checkNotNullParameter(map0, "<this>");
        Object object0 = map0.entrySet().iterator().next();
        Map map1 = Collections.singletonMap(((Map.Entry)object0).getKey(), ((Map.Entry)object0).getValue());
        Intrinsics.checkNotNullExpressionValue(map1, "with(...)");
        return map1;
    }

    @NotNull
    public static final SortedMap toSortedMap(@NotNull Map map0) {
        Intrinsics.checkNotNullParameter(map0, "<this>");
        return new TreeMap(map0);
    }

    @NotNull
    public static SortedMap toSortedMap(@NotNull Map map0, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(map0, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        SortedMap sortedMap0 = new TreeMap(comparator0);
        ((TreeMap)sortedMap0).putAll(map0);
        return sortedMap0;
    }
}

