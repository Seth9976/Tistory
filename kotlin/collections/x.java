package kotlin.collections;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.Pair;
import kotlin.SinceKotlin;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

public abstract class x extends w {
    @NotNull
    public static Map emptyMap() {
        Intrinsics.checkNotNull(r.a, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return r.a;
    }

    @NotNull
    public static final Map filter(@NotNull Map map0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(map0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        Map map1 = new LinkedHashMap();
        for(Object object0: map0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(((Boolean)function10.invoke(map$Entry0)).booleanValue()) {
                map1.put(map$Entry0.getKey(), map$Entry0.getValue());
            }
        }
        return map1;
    }

    @NotNull
    public static final Map filterKeys(@NotNull Map map0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(map0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        Map map1 = new LinkedHashMap();
        for(Object object0: map0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(((Boolean)function10.invoke(map$Entry0.getKey())).booleanValue()) {
                ((AbstractMap)map1).put(map$Entry0.getKey(), map$Entry0.getValue());
            }
        }
        return map1;
    }

    @NotNull
    public static final Map filterNot(@NotNull Map map0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(map0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        Map map1 = new LinkedHashMap();
        for(Object object0: map0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(!((Boolean)function10.invoke(map$Entry0)).booleanValue()) {
                map1.put(map$Entry0.getKey(), map$Entry0.getValue());
            }
        }
        return map1;
    }

    @NotNull
    public static final Map filterNotTo(@NotNull Map map0, @NotNull Map map1, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(map0, "<this>");
        Intrinsics.checkNotNullParameter(map1, "destination");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(Object object0: map0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(!((Boolean)function10.invoke(map$Entry0)).booleanValue()) {
                map1.put(map$Entry0.getKey(), map$Entry0.getValue());
            }
        }
        return map1;
    }

    @NotNull
    public static final Map filterTo(@NotNull Map map0, @NotNull Map map1, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(map0, "<this>");
        Intrinsics.checkNotNullParameter(map1, "destination");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(Object object0: map0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(((Boolean)function10.invoke(map$Entry0)).booleanValue()) {
                map1.put(map$Entry0.getKey(), map$Entry0.getValue());
            }
        }
        return map1;
    }

    @NotNull
    public static final Map filterValues(@NotNull Map map0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(map0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        Map map1 = new LinkedHashMap();
        for(Object object0: map0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(((Boolean)function10.invoke(map$Entry0.getValue())).booleanValue()) {
                ((AbstractMap)map1).put(map$Entry0.getKey(), map$Entry0.getValue());
            }
        }
        return map1;
    }

    public static final Object getOrElseNullable(@NotNull Map map0, Object object0, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(map0, "<this>");
        Intrinsics.checkNotNullParameter(function00, "defaultValue");
        Object object1 = map0.get(object0);
        return object1 != null || map0.containsKey(object0) ? object1 : function00.invoke();
    }

    public static final Object getOrPut(@NotNull Map map0, Object object0, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(map0, "<this>");
        Intrinsics.checkNotNullParameter(function00, "defaultValue");
        Object object1 = map0.get(object0);
        if(object1 == null) {
            object1 = function00.invoke();
            map0.put(object0, object1);
        }
        return object1;
    }

    @SinceKotlin(version = "1.1")
    public static Object getValue(@NotNull Map map0, Object object0) {
        Intrinsics.checkNotNullParameter(map0, "<this>");
        return v.getOrImplicitDefaultNullable(map0, object0);
    }

    @NotNull
    public static HashMap hashMapOf(@NotNull Pair[] arr_pair) {
        Intrinsics.checkNotNullParameter(arr_pair, "pairs");
        HashMap hashMap0 = new HashMap(w.mapCapacity(arr_pair.length));
        x.putAll(hashMap0, arr_pair);
        return hashMap0;
    }

    @NotNull
    public static final LinkedHashMap linkedMapOf(@NotNull Pair[] arr_pair) {
        Intrinsics.checkNotNullParameter(arr_pair, "pairs");
        return (LinkedHashMap)x.toMap(arr_pair, new LinkedHashMap(w.mapCapacity(arr_pair.length)));
    }

    @NotNull
    public static final Map mapKeys(@NotNull Map map0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(map0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "transform");
        Map map1 = new LinkedHashMap(w.mapCapacity(map0.size()));
        for(Object object0: map0.entrySet()) {
            map1.put(function10.invoke(object0), ((Map.Entry)object0).getValue());
        }
        return map1;
    }

    @NotNull
    public static final Map mapKeysTo(@NotNull Map map0, @NotNull Map map1, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(map0, "<this>");
        Intrinsics.checkNotNullParameter(map1, "destination");
        Intrinsics.checkNotNullParameter(function10, "transform");
        for(Object object0: map0.entrySet()) {
            map1.put(function10.invoke(object0), ((Map.Entry)object0).getValue());
        }
        return map1;
    }

    @NotNull
    public static Map mapOf(@NotNull Pair[] arr_pair) {
        Intrinsics.checkNotNullParameter(arr_pair, "pairs");
        return arr_pair.length <= 0 ? x.emptyMap() : x.toMap(arr_pair, new LinkedHashMap(w.mapCapacity(arr_pair.length)));
    }

    @NotNull
    public static final Map mapValues(@NotNull Map map0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(map0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "transform");
        Map map1 = new LinkedHashMap(w.mapCapacity(map0.size()));
        for(Object object0: map0.entrySet()) {
            map1.put(((Map.Entry)object0).getKey(), function10.invoke(object0));
        }
        return map1;
    }

    @NotNull
    public static final Map mapValuesTo(@NotNull Map map0, @NotNull Map map1, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(map0, "<this>");
        Intrinsics.checkNotNullParameter(map1, "destination");
        Intrinsics.checkNotNullParameter(function10, "transform");
        for(Object object0: map0.entrySet()) {
            map1.put(((Map.Entry)object0).getKey(), function10.invoke(object0));
        }
        return map1;
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final Map minus(@NotNull Map map0, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(map0, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "keys");
        Map map1 = x.toMutableMap(map0);
        o.removeAll(map1.keySet(), iterable0);
        return x.optimizeReadOnlyMap(map1);
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static Map minus(@NotNull Map map0, Object object0) {
        Intrinsics.checkNotNullParameter(map0, "<this>");
        Map map1 = x.toMutableMap(map0);
        map1.remove(object0);
        return x.optimizeReadOnlyMap(map1);
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final Map minus(@NotNull Map map0, @NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(map0, "<this>");
        Intrinsics.checkNotNullParameter(sequence0, "keys");
        Map map1 = x.toMutableMap(map0);
        o.removeAll(map1.keySet(), sequence0);
        return x.optimizeReadOnlyMap(map1);
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final Map minus(@NotNull Map map0, @NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(map0, "<this>");
        Intrinsics.checkNotNullParameter(arr_object, "keys");
        Map map1 = x.toMutableMap(map0);
        o.removeAll(map1.keySet(), arr_object);
        return x.optimizeReadOnlyMap(map1);
    }

    @NotNull
    public static Map mutableMapOf(@NotNull Pair[] arr_pair) {
        Intrinsics.checkNotNullParameter(arr_pair, "pairs");
        Map map0 = new LinkedHashMap(w.mapCapacity(arr_pair.length));
        x.putAll(map0, arr_pair);
        return map0;
    }

    @NotNull
    public static final Map optimizeReadOnlyMap(@NotNull Map map0) {
        Intrinsics.checkNotNullParameter(map0, "<this>");
        switch(map0.size()) {
            case 0: {
                return x.emptyMap();
            }
            case 1: {
                return w.toSingletonMap(map0);
            }
            default: {
                return map0;
            }
        }
    }

    @NotNull
    public static final Map plus(@NotNull Map map0, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(map0, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "pairs");
        if(map0.isEmpty()) {
            return x.toMap(iterable0);
        }
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(map0);
        x.putAll(linkedHashMap0, iterable0);
        return linkedHashMap0;
    }

    @NotNull
    public static Map plus(@NotNull Map map0, @NotNull Map map1) {
        Intrinsics.checkNotNullParameter(map0, "<this>");
        Intrinsics.checkNotNullParameter(map1, "map");
        Map map2 = new LinkedHashMap(map0);
        ((AbstractMap)map2).putAll(map1);
        return map2;
    }

    @NotNull
    public static Map plus(@NotNull Map map0, @NotNull Pair pair0) {
        Intrinsics.checkNotNullParameter(map0, "<this>");
        Intrinsics.checkNotNullParameter(pair0, "pair");
        if(map0.isEmpty()) {
            return w.mapOf(pair0);
        }
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(map0);
        linkedHashMap0.put(pair0.getFirst(), pair0.getSecond());
        return linkedHashMap0;
    }

    @NotNull
    public static final Map plus(@NotNull Map map0, @NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(map0, "<this>");
        Intrinsics.checkNotNullParameter(sequence0, "pairs");
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(map0);
        x.putAll(linkedHashMap0, sequence0);
        return x.optimizeReadOnlyMap(linkedHashMap0);
    }

    @NotNull
    public static final Map plus(@NotNull Map map0, @NotNull Pair[] arr_pair) {
        Intrinsics.checkNotNullParameter(map0, "<this>");
        Intrinsics.checkNotNullParameter(arr_pair, "pairs");
        if(map0.isEmpty()) {
            return x.toMap(arr_pair);
        }
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(map0);
        x.putAll(linkedHashMap0, arr_pair);
        return linkedHashMap0;
    }

    public static void putAll(@NotNull Map map0, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(map0, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "pairs");
        for(Object object0: iterable0) {
            map0.put(((Pair)object0).component1(), ((Pair)object0).component2());
        }
    }

    public static void putAll(@NotNull Map map0, @NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(map0, "<this>");
        Intrinsics.checkNotNullParameter(sequence0, "pairs");
        for(Object object0: sequence0) {
            map0.put(((Pair)object0).component1(), ((Pair)object0).component2());
        }
    }

    public static void putAll(@NotNull Map map0, @NotNull Pair[] arr_pair) {
        Intrinsics.checkNotNullParameter(map0, "<this>");
        Intrinsics.checkNotNullParameter(arr_pair, "pairs");
        for(int v = 0; v < arr_pair.length; ++v) {
            Pair pair0 = arr_pair[v];
            map0.put(pair0.component1(), pair0.component2());
        }
    }

    @NotNull
    public static Map toMap(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        if(iterable0 instanceof Collection) {
            switch(((Collection)iterable0).size()) {
                case 0: {
                    return x.emptyMap();
                }
                case 1: {
                    if(iterable0 instanceof List) {
                        return w.mapOf(((Pair)((List)iterable0).get(0)));
                    }
                    Object object0 = iterable0.iterator().next();
                    return w.mapOf(((Pair)object0));
                }
                default: {
                    return x.toMap(iterable0, new LinkedHashMap(w.mapCapacity(((Collection)iterable0).size())));
                }
            }
        }
        return x.optimizeReadOnlyMap(x.toMap(iterable0, new LinkedHashMap()));
    }

    @NotNull
    public static final Map toMap(@NotNull Iterable iterable0, @NotNull Map map0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        x.putAll(map0, iterable0);
        return map0;
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static Map toMap(@NotNull Map map0) {
        Intrinsics.checkNotNullParameter(map0, "<this>");
        switch(map0.size()) {
            case 0: {
                return x.emptyMap();
            }
            case 1: {
                return w.toSingletonMap(map0);
            }
            default: {
                return x.toMutableMap(map0);
            }
        }
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final Map toMap(@NotNull Map map0, @NotNull Map map1) {
        Intrinsics.checkNotNullParameter(map0, "<this>");
        Intrinsics.checkNotNullParameter(map1, "destination");
        map1.putAll(map0);
        return map1;
    }

    @NotNull
    public static final Map toMap(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        return x.optimizeReadOnlyMap(x.toMap(sequence0, new LinkedHashMap()));
    }

    @NotNull
    public static final Map toMap(@NotNull Sequence sequence0, @NotNull Map map0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        x.putAll(map0, sequence0);
        return map0;
    }

    @NotNull
    public static Map toMap(@NotNull Pair[] arr_pair) {
        Intrinsics.checkNotNullParameter(arr_pair, "<this>");
        switch(arr_pair.length) {
            case 0: {
                return x.emptyMap();
            }
            case 1: {
                return w.mapOf(arr_pair[0]);
            }
            default: {
                return x.toMap(arr_pair, new LinkedHashMap(w.mapCapacity(arr_pair.length)));
            }
        }
    }

    @NotNull
    public static final Map toMap(@NotNull Pair[] arr_pair, @NotNull Map map0) {
        Intrinsics.checkNotNullParameter(arr_pair, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        x.putAll(map0, arr_pair);
        return map0;
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static Map toMutableMap(@NotNull Map map0) {
        Intrinsics.checkNotNullParameter(map0, "<this>");
        return new LinkedHashMap(map0);
    }
}

