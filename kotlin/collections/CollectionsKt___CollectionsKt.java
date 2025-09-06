package kotlin.collections;

import androidx.compose.material3.v6;
import androidx.room.a;
import j2.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.ExperimentalStdlibApi;
import kotlin.OverloadResolutionByLambdaReturnType;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.TuplesKt;
import kotlin.WasExperimental;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt.compareBy.2;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt.compareByDescending.1;
import kotlin.internal.HidesMembers;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class CollectionsKt___CollectionsKt extends q {
    public static boolean all(@NotNull Iterable iterable0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        if(iterable0 instanceof Collection && ((Collection)iterable0).isEmpty()) {
            return true;
        }
        for(Object object0: iterable0) {
            if(!((Boolean)function10.invoke(object0)).booleanValue()) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    public static final boolean any(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        return iterable0 instanceof Collection ? !((Collection)iterable0).isEmpty() : iterable0.iterator().hasNext();
    }

    public static final boolean any(@NotNull Iterable iterable0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        if(iterable0 instanceof Collection && ((Collection)iterable0).isEmpty()) {
            return false;
        }
        for(Object object0: iterable0) {
            if(((Boolean)function10.invoke(object0)).booleanValue()) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    @NotNull
    public static Sequence asSequence(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        return new Sequence() {
            @Override  // kotlin.sequences.Sequence
            @NotNull
            public Iterator iterator() {
                return iterable0.iterator();
            }
        };
    }

    @NotNull
    public static final Map associate(@NotNull Iterable iterable0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "transform");
        Map map0 = new LinkedHashMap(c.coerceAtLeast(w.mapCapacity(l.collectionSizeOrDefault(iterable0, 10)), 16));
        for(Object object0: iterable0) {
            Pair pair0 = (Pair)function10.invoke(object0);
            map0.put(pair0.getFirst(), pair0.getSecond());
        }
        return map0;
    }

    @NotNull
    public static final Map associateBy(@NotNull Iterable iterable0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Map map0 = new LinkedHashMap(c.coerceAtLeast(w.mapCapacity(l.collectionSizeOrDefault(iterable0, 10)), 16));
        for(Object object0: iterable0) {
            map0.put(function10.invoke(object0), object0);
        }
        return map0;
    }

    @NotNull
    public static final Map associateBy(@NotNull Iterable iterable0, @NotNull Function1 function10, @NotNull Function1 function11) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Intrinsics.checkNotNullParameter(function11, "valueTransform");
        Map map0 = new LinkedHashMap(c.coerceAtLeast(w.mapCapacity(l.collectionSizeOrDefault(iterable0, 10)), 16));
        for(Object object0: iterable0) {
            map0.put(function10.invoke(object0), function11.invoke(object0));
        }
        return map0;
    }

    @NotNull
    public static final Map associateByTo(@NotNull Iterable iterable0, @NotNull Map map0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        for(Object object0: iterable0) {
            map0.put(function10.invoke(object0), object0);
        }
        return map0;
    }

    @NotNull
    public static final Map associateByTo(@NotNull Iterable iterable0, @NotNull Map map0, @NotNull Function1 function10, @NotNull Function1 function11) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Intrinsics.checkNotNullParameter(function11, "valueTransform");
        for(Object object0: iterable0) {
            map0.put(function10.invoke(object0), function11.invoke(object0));
        }
        return map0;
    }

    @NotNull
    public static final Map associateTo(@NotNull Iterable iterable0, @NotNull Map map0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Intrinsics.checkNotNullParameter(function10, "transform");
        for(Object object0: iterable0) {
            Pair pair0 = (Pair)function10.invoke(object0);
            map0.put(pair0.getFirst(), pair0.getSecond());
        }
        return map0;
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final Map associateWith(@NotNull Iterable iterable0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "valueSelector");
        Map map0 = new LinkedHashMap(c.coerceAtLeast(w.mapCapacity(l.collectionSizeOrDefault(iterable0, 10)), 16));
        for(Object object0: iterable0) {
            map0.put(object0, function10.invoke(object0));
        }
        return map0;
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final Map associateWithTo(@NotNull Iterable iterable0, @NotNull Map map0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Intrinsics.checkNotNullParameter(function10, "valueSelector");
        for(Object object0: iterable0) {
            map0.put(object0, function10.invoke(object0));
        }
        return map0;
    }

    @JvmName(name = "averageOfByte")
    public static final double averageOfByte(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        double f = 0.0;
        int v = 0;
        for(Object object0: iterable0) {
            f += (double)((Number)object0).byteValue();
            ++v;
            if(v < 0) {
                CollectionsKt__CollectionsKt.throwCountOverflow();
            }
        }
        return v == 0 ? NaN : f / ((double)v);
    }

    @JvmName(name = "averageOfDouble")
    public static final double averageOfDouble(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        double f = 0.0;
        int v = 0;
        for(Object object0: iterable0) {
            f += ((Number)object0).doubleValue();
            ++v;
            if(v < 0) {
                CollectionsKt__CollectionsKt.throwCountOverflow();
            }
        }
        return v == 0 ? NaN : f / ((double)v);
    }

    @JvmName(name = "averageOfFloat")
    public static final double averageOfFloat(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        double f = 0.0;
        int v = 0;
        for(Object object0: iterable0) {
            f += (double)((Number)object0).floatValue();
            ++v;
            if(v < 0) {
                CollectionsKt__CollectionsKt.throwCountOverflow();
            }
        }
        return v == 0 ? NaN : f / ((double)v);
    }

    @JvmName(name = "averageOfInt")
    public static final double averageOfInt(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        double f = 0.0;
        int v = 0;
        for(Object object0: iterable0) {
            f += (double)((Number)object0).intValue();
            ++v;
            if(v < 0) {
                CollectionsKt__CollectionsKt.throwCountOverflow();
            }
        }
        return v == 0 ? NaN : f / ((double)v);
    }

    @JvmName(name = "averageOfLong")
    public static final double averageOfLong(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        double f = 0.0;
        int v = 0;
        for(Object object0: iterable0) {
            f += (double)((Number)object0).longValue();
            ++v;
            if(v < 0) {
                CollectionsKt__CollectionsKt.throwCountOverflow();
            }
        }
        return v == 0 ? NaN : f / ((double)v);
    }

    @JvmName(name = "averageOfShort")
    public static final double averageOfShort(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        double f = 0.0;
        int v = 0;
        for(Object object0: iterable0) {
            f += (double)((Number)object0).shortValue();
            ++v;
            if(v < 0) {
                CollectionsKt__CollectionsKt.throwCountOverflow();
            }
        }
        return v == 0 ? NaN : f / ((double)v);
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static List chunked(@NotNull Iterable iterable0, int v) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        return CollectionsKt___CollectionsKt.windowed(iterable0, v, v, true);
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final List chunked(@NotNull Iterable iterable0, int v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "transform");
        return CollectionsKt___CollectionsKt.windowed(iterable0, v, v, true, function10);
    }

    public static boolean contains(@NotNull Iterable iterable0, Object object0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        return iterable0 instanceof Collection ? ((Collection)iterable0).contains(object0) : CollectionsKt___CollectionsKt.indexOf(iterable0, object0) >= 0;
    }

    public static int count(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        if(iterable0 instanceof Collection) {
            return ((Collection)iterable0).size();
        }
        int v = 0;
        Iterator iterator0 = iterable0.iterator();
        while(iterator0.hasNext()) {
            iterator0.next();
            ++v;
            if(v < 0) {
                CollectionsKt__CollectionsKt.throwCountOverflow();
            }
        }
        return v;
    }

    public static final int count(@NotNull Iterable iterable0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        if(iterable0 instanceof Collection && ((Collection)iterable0).isEmpty()) {
            return 0;
        }
        int v = 0;
        for(Object object0: iterable0) {
            if(((Boolean)function10.invoke(object0)).booleanValue()) {
                ++v;
                if(v < 0) {
                    CollectionsKt__CollectionsKt.throwCountOverflow();
                }
            }
        }
        return v;
    }

    @NotNull
    public static List distinct(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        return CollectionsKt___CollectionsKt.toList(CollectionsKt___CollectionsKt.toMutableSet(iterable0));
    }

    @NotNull
    public static final List distinctBy(@NotNull Iterable iterable0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        HashSet hashSet0 = new HashSet();
        List list0 = new ArrayList();
        for(Object object0: iterable0) {
            if(hashSet0.add(function10.invoke(object0))) {
                ((ArrayList)list0).add(object0);
            }
        }
        return list0;
    }

    @NotNull
    public static List drop(@NotNull Iterable iterable0, int v) {
        List list0;
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        if(v == 0) {
            return CollectionsKt___CollectionsKt.toList(iterable0);
        }
        if(iterable0 instanceof Collection) {
            int v1 = ((Collection)iterable0).size() - v;
            if(v1 <= 0) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            if(v1 == 1) {
                return k.listOf(CollectionsKt___CollectionsKt.last(iterable0));
            }
            list0 = new ArrayList(v1);
            if(iterable0 instanceof List) {
                if(iterable0 instanceof RandomAccess) {
                    int v2 = ((Collection)iterable0).size();
                    while(v < v2) {
                        ((ArrayList)list0).add(((List)iterable0).get(v));
                        ++v;
                    }
                    return list0;
                }
                ListIterator listIterator0 = ((List)iterable0).listIterator(v);
                while(listIterator0.hasNext()) {
                    Object object0 = listIterator0.next();
                    ((ArrayList)list0).add(object0);
                }
                return list0;
            }
        }
        else {
            list0 = new ArrayList();
        }
        int v3 = 0;
        for(Object object1: iterable0) {
            if(v3 >= v) {
                ((ArrayList)list0).add(object1);
            }
            else {
                ++v3;
            }
        }
        return CollectionsKt__CollectionsKt.optimizeReadOnlyList(list0);
    }

    @NotNull
    public static List dropLast(@NotNull List list0, int v) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        return CollectionsKt___CollectionsKt.take(list0, c.coerceAtLeast(list0.size() - v, 0));
    }

    @NotNull
    public static final List dropLastWhile(@NotNull List list0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        if(!list0.isEmpty()) {
            ListIterator listIterator0 = list0.listIterator(list0.size());
            while(listIterator0.hasPrevious()) {
                if(!((Boolean)function10.invoke(listIterator0.previous())).booleanValue()) {
                    return CollectionsKt___CollectionsKt.take(list0, listIterator0.nextIndex() + 1);
                }
                if(false) {
                    break;
                }
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @NotNull
    public static final List dropWhile(@NotNull Iterable iterable0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        List list0 = new ArrayList();
        boolean z = false;
        for(Object object0: iterable0) {
            if(z) {
                ((ArrayList)list0).add(object0);
            }
            else if(!((Boolean)function10.invoke(object0)).booleanValue()) {
                ((ArrayList)list0).add(object0);
                z = true;
            }
        }
        return list0;
    }

    public static final Object elementAt(@NotNull Iterable iterable0, int v) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        return iterable0 instanceof List ? ((List)iterable0).get(v) : CollectionsKt___CollectionsKt.elementAtOrElse(iterable0, v, new v6(v, 8));
    }

    public static final Object elementAtOrElse(@NotNull Iterable iterable0, int v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "defaultValue");
        if(iterable0 instanceof List) {
            return v < 0 || v > CollectionsKt__CollectionsKt.getLastIndex(((List)iterable0)) ? function10.invoke(v) : ((List)iterable0).get(v);
        }
        if(v < 0) {
            return function10.invoke(v);
        }
        int v1 = 0;
        for(Object object0: iterable0) {
            if(v == v1) {
                return object0;
            }
            ++v1;
        }
        return function10.invoke(v);
    }

    @Nullable
    public static Object elementAtOrNull(@NotNull Iterable iterable0, int v) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        if(iterable0 instanceof List) {
            return CollectionsKt___CollectionsKt.getOrNull(((List)iterable0), v);
        }
        if(v < 0) {
            return null;
        }
        int v1 = 0;
        for(Object object0: iterable0) {
            if(v == v1) {
                return object0;
            }
            ++v1;
        }
        return null;
    }

    @NotNull
    public static List filter(@NotNull Iterable iterable0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        List list0 = new ArrayList();
        for(Object object0: iterable0) {
            if(((Boolean)function10.invoke(object0)).booleanValue()) {
                list0.add(object0);
            }
        }
        return list0;
    }

    @NotNull
    public static final List filterIndexed(@NotNull Iterable iterable0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(function20, "predicate");
        List list0 = new ArrayList();
        int v = 0;
        for(Object object0: iterable0) {
            if(v < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if(((Boolean)function20.invoke(v, object0)).booleanValue()) {
                list0.add(object0);
            }
            ++v;
        }
        return list0;
    }

    @NotNull
    public static final Collection filterIndexedTo(@NotNull Iterable iterable0, @NotNull Collection collection0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function20, "predicate");
        int v = 0;
        for(Object object0: iterable0) {
            if(v < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if(((Boolean)function20.invoke(v, object0)).booleanValue()) {
                collection0.add(object0);
            }
            ++v;
        }
        return collection0;
    }

    public static final List filterIsInstance(Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        List list0 = new ArrayList();
        for(Object object0: iterable0) {
            Intrinsics.reifiedOperationMarker(3, "R");
            if(object0 != null) {
                list0.add(object0);
            }
        }
        return list0;
    }

    public static final Collection filterIsInstanceTo(Iterable iterable0, Collection collection0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        for(Object object0: iterable0) {
            Intrinsics.reifiedOperationMarker(3, "R");
            if(object0 != null) {
                collection0.add(object0);
            }
        }
        return collection0;
    }

    @NotNull
    public static final List filterNot(@NotNull Iterable iterable0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        List list0 = new ArrayList();
        for(Object object0: iterable0) {
            if(!((Boolean)function10.invoke(object0)).booleanValue()) {
                list0.add(object0);
            }
        }
        return list0;
    }

    @NotNull
    public static List filterNotNull(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        return (List)CollectionsKt___CollectionsKt.filterNotNullTo(iterable0, new ArrayList());
    }

    @NotNull
    public static final Collection filterNotNullTo(@NotNull Iterable iterable0, @NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        for(Object object0: iterable0) {
            if(object0 != null) {
                collection0.add(object0);
            }
        }
        return collection0;
    }

    @NotNull
    public static final Collection filterNotTo(@NotNull Iterable iterable0, @NotNull Collection collection0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(Object object0: iterable0) {
            if(!((Boolean)function10.invoke(object0)).booleanValue()) {
                collection0.add(object0);
            }
        }
        return collection0;
    }

    @NotNull
    public static final Collection filterTo(@NotNull Iterable iterable0, @NotNull Collection collection0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(Object object0: iterable0) {
            if(((Boolean)function10.invoke(object0)).booleanValue()) {
                collection0.add(object0);
            }
        }
        return collection0;
    }

    public static Object first(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        if(iterable0 instanceof List) {
            return CollectionsKt___CollectionsKt.first(((List)iterable0));
        }
        Iterator iterator0 = iterable0.iterator();
        if(!iterator0.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        return iterator0.next();
    }

    public static final Object first(@NotNull Iterable iterable0, @NotNull Function1 function10) {
        Iterator iterator0 = a.n(iterable0, "<this>", function10, "predicate");
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            if(((Boolean)function10.invoke(object0)).booleanValue()) {
                return object0;
            }
            if(false) {
                break;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static Object first(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        if(list0.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list0.get(0);
    }

    @Nullable
    public static Object firstOrNull(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        if(iterable0 instanceof List) {
            return ((List)iterable0).isEmpty() ? null : ((List)iterable0).get(0);
        }
        Iterator iterator0 = iterable0.iterator();
        return !iterator0.hasNext() ? null : iterator0.next();
    }

    @Nullable
    public static final Object firstOrNull(@NotNull Iterable iterable0, @NotNull Function1 function10) {
        Iterator iterator0 = a.n(iterable0, "<this>", function10, "predicate");
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            if(((Boolean)function10.invoke(object0)).booleanValue()) {
                return object0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    @Nullable
    public static Object firstOrNull(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        return list0.isEmpty() ? null : list0.get(0);
    }

    @NotNull
    public static final List flatMap(@NotNull Iterable iterable0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "transform");
        List list0 = new ArrayList();
        for(Object object0: iterable0) {
            o.addAll(list0, ((Iterable)function10.invoke(object0)));
        }
        return list0;
    }

    @OverloadResolutionByLambdaReturnType
    @SinceKotlin(version = "1.4")
    @JvmName(name = "flatMapSequence")
    @NotNull
    public static final List flatMapSequence(@NotNull Iterable iterable0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "transform");
        List list0 = new ArrayList();
        for(Object object0: iterable0) {
            o.addAll(list0, ((Sequence)function10.invoke(object0)));
        }
        return list0;
    }

    @OverloadResolutionByLambdaReturnType
    @SinceKotlin(version = "1.4")
    @JvmName(name = "flatMapSequenceTo")
    @NotNull
    public static final Collection flatMapSequenceTo(@NotNull Iterable iterable0, @NotNull Collection collection0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function10, "transform");
        for(Object object0: iterable0) {
            o.addAll(collection0, ((Sequence)function10.invoke(object0)));
        }
        return collection0;
    }

    @NotNull
    public static final Collection flatMapTo(@NotNull Iterable iterable0, @NotNull Collection collection0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function10, "transform");
        for(Object object0: iterable0) {
            o.addAll(collection0, ((Iterable)function10.invoke(object0)));
        }
        return collection0;
    }

    public static final Object fold(@NotNull Iterable iterable0, Object object0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        for(Object object1: iterable0) {
            object0 = function20.invoke(object0, object1);
        }
        return object0;
    }

    public static final Object foldIndexed(@NotNull Iterable iterable0, Object object0, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        int v = 0;
        for(Object object1: iterable0) {
            if(v < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            object0 = function30.invoke(v, object0, object1);
            ++v;
        }
        return object0;
    }

    public static final Object foldRight(@NotNull List list0, Object object0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        if(!list0.isEmpty()) {
            ListIterator listIterator0 = list0.listIterator(list0.size());
            while(listIterator0.hasPrevious()) {
                object0 = function20.invoke(listIterator0.previous(), object0);
            }
        }
        return object0;
    }

    public static final Object foldRightIndexed(@NotNull List list0, Object object0, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        if(!list0.isEmpty()) {
            ListIterator listIterator0 = list0.listIterator(list0.size());
            while(listIterator0.hasPrevious()) {
                object0 = function30.invoke(listIterator0.previousIndex(), listIterator0.previous(), object0);
            }
        }
        return object0;
    }

    @HidesMembers
    public static final void forEach(@NotNull Iterable iterable0, @NotNull Function1 function10) {
        Iterator iterator0 = a.n(iterable0, "<this>", function10, "action");
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            function10.invoke(object0);
        }
    }

    public static final void forEachIndexed(@NotNull Iterable iterable0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(function20, "action");
        int v = 0;
        for(Object object0: iterable0) {
            if(v < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            function20.invoke(v, object0);
            ++v;
        }
    }

    @Nullable
    public static Object getOrNull(@NotNull List list0, int v) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        return v < 0 || v > CollectionsKt__CollectionsKt.getLastIndex(list0) ? null : list0.get(v);
    }

    @NotNull
    public static final Map groupBy(@NotNull Iterable iterable0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Map map0 = new LinkedHashMap();
        for(Object object0: iterable0) {
            Object object1 = function10.invoke(object0);
            ArrayList arrayList0 = map0.get(object1);
            if(arrayList0 == null) {
                arrayList0 = a.m(((LinkedHashMap)map0), object1);
            }
            arrayList0.add(object0);
        }
        return map0;
    }

    @NotNull
    public static final Map groupBy(@NotNull Iterable iterable0, @NotNull Function1 function10, @NotNull Function1 function11) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Intrinsics.checkNotNullParameter(function11, "valueTransform");
        Map map0 = new LinkedHashMap();
        for(Object object0: iterable0) {
            Object object1 = function10.invoke(object0);
            ArrayList arrayList0 = map0.get(object1);
            if(arrayList0 == null) {
                arrayList0 = a.m(((LinkedHashMap)map0), object1);
            }
            arrayList0.add(function11.invoke(object0));
        }
        return map0;
    }

    @NotNull
    public static final Map groupByTo(@NotNull Iterable iterable0, @NotNull Map map0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        for(Object object0: iterable0) {
            Object object1 = function10.invoke(object0);
            ArrayList arrayList0 = map0.get(object1);
            if(arrayList0 == null) {
                arrayList0 = wb.a.g(map0, object1);
            }
            arrayList0.add(object0);
        }
        return map0;
    }

    @NotNull
    public static final Map groupByTo(@NotNull Iterable iterable0, @NotNull Map map0, @NotNull Function1 function10, @NotNull Function1 function11) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Intrinsics.checkNotNullParameter(function11, "valueTransform");
        for(Object object0: iterable0) {
            Object object1 = function10.invoke(object0);
            ArrayList arrayList0 = map0.get(object1);
            if(arrayList0 == null) {
                arrayList0 = wb.a.g(map0, object1);
            }
            arrayList0.add(function11.invoke(object0));
        }
        return map0;
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final Grouping groupingBy(@NotNull Iterable iterable0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        return new Grouping() {
            @Override  // kotlin.collections.Grouping
            public Object keyOf(Object object0) {
                return function10.invoke(object0);
            }

            @Override  // kotlin.collections.Grouping
            @NotNull
            public Iterator sourceIterator() {
                return iterable0.iterator();
            }
        };
    }

    public static int indexOf(@NotNull Iterable iterable0, Object object0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        if(iterable0 instanceof List) {
            return ((List)iterable0).indexOf(object0);
        }
        int v = 0;
        for(Object object1: iterable0) {
            if(v < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if(Intrinsics.areEqual(object0, object1)) {
                return v;
            }
            ++v;
        }
        return -1;
    }

    public static int indexOf(@NotNull List list0, Object object0) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        return list0.indexOf(object0);
    }

    public static final int indexOfFirst(@NotNull Iterable iterable0, @NotNull Function1 function10) {
        Iterator iterator0 = a.n(iterable0, "<this>", function10, "predicate");
        for(int v = 0; iterator0.hasNext(); ++v) {
            Object object0 = iterator0.next();
            if(v < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if(((Boolean)function10.invoke(object0)).booleanValue()) {
                return v;
            }
        }
        return -1;
    }

    public static final int indexOfFirst(@NotNull List list0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v = 0;
        for(Object object0: list0) {
            if(((Boolean)function10.invoke(object0)).booleanValue()) {
                return v;
            }
            ++v;
        }
        return -1;
    }

    public static final int indexOfLast(@NotNull Iterable iterable0, @NotNull Function1 function10) {
        int v = -1;
        Iterator iterator0 = a.n(iterable0, "<this>", function10, "predicate");
        for(int v1 = 0; iterator0.hasNext(); ++v1) {
            Object object0 = iterator0.next();
            if(v1 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if(((Boolean)function10.invoke(object0)).booleanValue()) {
                v = v1;
            }
        }
        return v;
    }

    public static final int indexOfLast(@NotNull List list0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        ListIterator listIterator0 = list0.listIterator(list0.size());
        while(listIterator0.hasPrevious()) {
            if(((Boolean)function10.invoke(listIterator0.previous())).booleanValue()) {
                return listIterator0.nextIndex();
            }
            if(false) {
                break;
            }
        }
        return -1;
    }

    @NotNull
    public static Set intersect(@NotNull Iterable iterable0, @NotNull Iterable iterable1) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(iterable1, "other");
        Set set0 = CollectionsKt___CollectionsKt.toMutableSet(iterable0);
        o.retainAll(set0, iterable1);
        return set0;
    }

    @NotNull
    public static final Appendable joinTo(@NotNull Iterable iterable0, @NotNull Appendable appendable0, @NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, @NotNull CharSequence charSequence2, int v, @NotNull CharSequence charSequence3, @Nullable Function1 function10) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(appendable0, "buffer");
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        Intrinsics.checkNotNullParameter(charSequence2, "postfix");
        Intrinsics.checkNotNullParameter(charSequence3, "truncated");
        appendable0.append(charSequence1);
        int v1 = 0;
        for(Object object0: iterable0) {
            ++v1;
            if(v1 > 1) {
                appendable0.append(charSequence0);
            }
            if(v >= 0 && v1 > v) {
                break;
            }
            i.appendElement(appendable0, object0, function10);
        }
        if(v >= 0 && v1 > v) {
            appendable0.append(charSequence3);
        }
        appendable0.append(charSequence2);
        return appendable0;
    }

    public static Appendable joinTo$default(Iterable iterable0, Appendable appendable0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function1 function10, int v1, Object object0) {
        CharSequence charSequence4 = (v1 & 2) == 0 ? charSequence0 : ", ";
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (v1 & 4) == 0 ? charSequence1 : "";
        if((v1 & 8) == 0) {
            charSequence5 = charSequence2;
        }
        int v2 = (v1 & 16) == 0 ? v : -1;
        if((v1 & 0x20) != 0) {
            return (v1 & 0x40) == 0 ? CollectionsKt___CollectionsKt.joinTo(iterable0, appendable0, charSequence4, charSequence6, charSequence5, v2, "...", function10) : CollectionsKt___CollectionsKt.joinTo(iterable0, appendable0, charSequence4, charSequence6, charSequence5, v2, "...", null);
        }
        return (v1 & 0x40) == 0 ? CollectionsKt___CollectionsKt.joinTo(iterable0, appendable0, charSequence4, charSequence6, charSequence5, v2, charSequence3, function10) : CollectionsKt___CollectionsKt.joinTo(iterable0, appendable0, charSequence4, charSequence6, charSequence5, v2, charSequence3, null);
    }

    @NotNull
    public static final String joinToString(@NotNull Iterable iterable0, @NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, @NotNull CharSequence charSequence2, int v, @NotNull CharSequence charSequence3, @Nullable Function1 function10) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        Intrinsics.checkNotNullParameter(charSequence2, "postfix");
        Intrinsics.checkNotNullParameter(charSequence3, "truncated");
        String s = ((StringBuilder)CollectionsKt___CollectionsKt.joinTo(iterable0, new StringBuilder(), charSequence0, charSequence1, charSequence2, v, charSequence3, function10)).toString();
        Intrinsics.checkNotNullExpressionValue(s, "toString(...)");
        return s;
    }

    public static String joinToString$default(Iterable iterable0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function1 function10, int v1, Object object0) {
        if((v1 & 1) != 0) {
            charSequence0 = ", ";
        }
        CharSequence charSequence4 = "";
        CharSequence charSequence5 = (v1 & 2) == 0 ? charSequence1 : "";
        if((v1 & 4) == 0) {
            charSequence4 = charSequence2;
        }
        if((v1 & 8) != 0) {
            v = -1;
        }
        if((v1 & 16) != 0) {
            charSequence3 = "...";
        }
        if((v1 & 0x20) != 0) {
            function10 = null;
        }
        return CollectionsKt___CollectionsKt.joinToString(iterable0, charSequence0, charSequence5, charSequence4, v, charSequence3, function10);
    }

    public static Object last(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        if(iterable0 instanceof List) {
            return CollectionsKt___CollectionsKt.last(((List)iterable0));
        }
        Iterator iterator0 = iterable0.iterator();
        if(!iterator0.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object object0;
        for(object0 = iterator0.next(); iterator0.hasNext(); object0 = iterator0.next()) {
        }
        return object0;
    }

    public static final Object last(@NotNull Iterable iterable0, @NotNull Function1 function10) {
        Object object0 = null;
        boolean z = false;
        Iterator iterator0 = a.n(iterable0, "<this>", function10, "predicate");
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            if(((Boolean)function10.invoke(object1)).booleanValue()) {
                z = true;
                object0 = object1;
            }
        }
        if(!z) {
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        return object0;
    }

    public static Object last(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        if(list0.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list0.get(CollectionsKt__CollectionsKt.getLastIndex(list0));
    }

    public static final Object last(@NotNull List list0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        ListIterator listIterator0 = list0.listIterator(list0.size());
        while(listIterator0.hasPrevious()) {
            Object object0 = listIterator0.previous();
            if(((Boolean)function10.invoke(object0)).booleanValue()) {
                return object0;
            }
            if(false) {
                break;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    public static final int lastIndexOf(@NotNull Iterable iterable0, Object object0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        if(iterable0 instanceof List) {
            return ((List)iterable0).lastIndexOf(object0);
        }
        int v = -1;
        int v1 = 0;
        for(Object object1: iterable0) {
            if(v1 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if(Intrinsics.areEqual(object0, object1)) {
                v = v1;
            }
            ++v1;
        }
        return v;
    }

    public static final int lastIndexOf(@NotNull List list0, Object object0) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        return list0.lastIndexOf(object0);
    }

    @Nullable
    public static Object lastOrNull(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        if(iterable0 instanceof List) {
            return ((List)iterable0).isEmpty() ? null : ((List)iterable0).get(((List)iterable0).size() - 1);
        }
        Iterator iterator0 = iterable0.iterator();
        if(!iterator0.hasNext()) {
            return null;
        }
        Object object0;
        for(object0 = iterator0.next(); iterator0.hasNext(); object0 = iterator0.next()) {
        }
        return object0;
    }

    @Nullable
    public static final Object lastOrNull(@NotNull Iterable iterable0, @NotNull Function1 function10) {
        Object object0 = null;
        Iterator iterator0 = a.n(iterable0, "<this>", function10, "predicate");
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            if(((Boolean)function10.invoke(object1)).booleanValue()) {
                object0 = object1;
            }
        }
        return object0;
    }

    @Nullable
    public static Object lastOrNull(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        return list0.isEmpty() ? null : list0.get(list0.size() - 1);
    }

    @Nullable
    public static final Object lastOrNull(@NotNull List list0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        ListIterator listIterator0 = list0.listIterator(list0.size());
        while(listIterator0.hasPrevious()) {
            Object object0 = listIterator0.previous();
            if(((Boolean)function10.invoke(object0)).booleanValue()) {
                return object0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    @NotNull
    public static List map(@NotNull Iterable iterable0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "transform");
        List list0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
        for(Object object0: iterable0) {
            list0.add(function10.invoke(object0));
        }
        return list0;
    }

    @NotNull
    public static final List mapIndexed(@NotNull Iterable iterable0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(function20, "transform");
        List list0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
        int v = 0;
        for(Object object0: iterable0) {
            if(v < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            list0.add(function20.invoke(v, object0));
            ++v;
        }
        return list0;
    }

    @NotNull
    public static final List mapIndexedNotNull(@NotNull Iterable iterable0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(function20, "transform");
        List list0 = new ArrayList();
        int v = 0;
        for(Object object0: iterable0) {
            if(v < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            Object object1 = function20.invoke(v, object0);
            if(object1 != null) {
                list0.add(object1);
            }
            ++v;
        }
        return list0;
    }

    @NotNull
    public static final Collection mapIndexedNotNullTo(@NotNull Iterable iterable0, @NotNull Collection collection0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function20, "transform");
        int v = 0;
        for(Object object0: iterable0) {
            if(v < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            Object object1 = function20.invoke(v, object0);
            if(object1 != null) {
                collection0.add(object1);
            }
            ++v;
        }
        return collection0;
    }

    @NotNull
    public static final Collection mapIndexedTo(@NotNull Iterable iterable0, @NotNull Collection collection0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function20, "transform");
        int v = 0;
        for(Object object0: iterable0) {
            if(v < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            collection0.add(function20.invoke(v, object0));
            ++v;
        }
        return collection0;
    }

    @NotNull
    public static final List mapNotNull(@NotNull Iterable iterable0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "transform");
        List list0 = new ArrayList();
        for(Object object0: iterable0) {
            Object object1 = function10.invoke(object0);
            if(object1 != null) {
                list0.add(object1);
            }
        }
        return list0;
    }

    @NotNull
    public static final Collection mapNotNullTo(@NotNull Iterable iterable0, @NotNull Collection collection0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function10, "transform");
        for(Object object0: iterable0) {
            Object object1 = function10.invoke(object0);
            if(object1 != null) {
                collection0.add(object1);
            }
        }
        return collection0;
    }

    @NotNull
    public static final Collection mapTo(@NotNull Iterable iterable0, @NotNull Collection collection0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function10, "transform");
        for(Object object0: iterable0) {
            collection0.add(function10.invoke(object0));
        }
        return collection0;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Object maxByOrNull(@NotNull Iterable iterable0, @NotNull Function1 function10) {
        Iterator iterator0 = a.n(iterable0, "<this>", function10, "selector");
        if(!iterator0.hasNext()) {
            return null;
        }
        Object object0 = iterator0.next();
        if(!iterator0.hasNext()) {
            return object0;
        }
        Comparable comparable0 = (Comparable)function10.invoke(object0);
        do {
            Object object1 = iterator0.next();
            Comparable comparable1 = (Comparable)function10.invoke(object1);
            if(comparable0.compareTo(comparable1) < 0) {
                object0 = object1;
                comparable0 = comparable1;
            }
        }
        while(iterator0.hasNext());
        return object0;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxByOrThrow")
    public static final Object maxByOrThrow(@NotNull Iterable iterable0, @NotNull Function1 function10) {
        Iterator iterator0 = a.n(iterable0, "<this>", function10, "selector");
        if(!iterator0.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object0 = iterator0.next();
        if(!iterator0.hasNext()) {
            return object0;
        }
        Comparable comparable0 = (Comparable)function10.invoke(object0);
        do {
            Object object1 = iterator0.next();
            Comparable comparable1 = (Comparable)function10.invoke(object1);
            if(comparable0.compareTo(comparable1) < 0) {
                object0 = object1;
                comparable0 = comparable1;
            }
        }
        while(iterator0.hasNext());
        return object0;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static Comparable maxOrNull(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Iterator iterator0 = iterable0.iterator();
        if(!iterator0.hasNext()) {
            return null;
        }
        Object object0 = iterator0.next();
        Comparable comparable0 = (Comparable)object0;
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            Comparable comparable1 = (Comparable)object1;
            if(comparable0.compareTo(comparable1) < 0) {
                comparable0 = comparable1;
            }
        }
        return comparable0;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Double maxOrNull(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Iterator iterator0 = iterable0.iterator();
        if(!iterator0.hasNext()) {
            return null;
        }
        Object object0 = iterator0.next();
        double f;
        for(f = ((Number)object0).doubleValue(); iterator0.hasNext(); f = Math.max(f, ((Number)object1).doubleValue())) {
            Object object1 = iterator0.next();
        }
        return f;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static Float maxOrNull(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Iterator iterator0 = iterable0.iterator();
        if(!iterator0.hasNext()) {
            return null;
        }
        Object object0 = iterator0.next();
        float f;
        for(f = ((Number)object0).floatValue(); iterator0.hasNext(); f = Math.max(f, ((Number)object1).floatValue())) {
            Object object1 = iterator0.next();
        }
        return f;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxOrThrow")
    public static final double maxOrThrow(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Iterator iterator0 = iterable0.iterator();
        if(!iterator0.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object0 = iterator0.next();
        double f;
        for(f = ((Number)object0).doubleValue(); iterator0.hasNext(); f = Math.max(f, ((Number)object1).doubleValue())) {
            Object object1 = iterator0.next();
        }
        return f;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxOrThrow")
    public static final float maxOrThrow(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Iterator iterator0 = iterable0.iterator();
        if(!iterator0.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object0 = iterator0.next();
        float f;
        for(f = ((Number)object0).floatValue(); iterator0.hasNext(); f = Math.max(f, ((Number)object1).floatValue())) {
            Object object1 = iterator0.next();
        }
        return f;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxOrThrow")
    @NotNull
    public static final Comparable maxOrThrow(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Iterator iterator0 = iterable0.iterator();
        if(!iterator0.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object0 = iterator0.next();
        Comparable comparable0 = (Comparable)object0;
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            Comparable comparable1 = (Comparable)object1;
            if(comparable0.compareTo(comparable1) < 0) {
                comparable0 = comparable1;
            }
        }
        return comparable0;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Object maxWithOrNull(@NotNull Iterable iterable0, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        Iterator iterator0 = iterable0.iterator();
        if(!iterator0.hasNext()) {
            return null;
        }
        Object object0 = iterator0.next();
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            if(comparator0.compare(object0, object1) < 0) {
                object0 = object1;
            }
        }
        return object0;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxWithOrThrow")
    public static final Object maxWithOrThrow(@NotNull Iterable iterable0, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        Iterator iterator0 = iterable0.iterator();
        if(!iterator0.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object0 = iterator0.next();
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            if(comparator0.compare(object0, object1) < 0) {
                object0 = object1;
            }
        }
        return object0;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Object minByOrNull(@NotNull Iterable iterable0, @NotNull Function1 function10) {
        Iterator iterator0 = a.n(iterable0, "<this>", function10, "selector");
        if(!iterator0.hasNext()) {
            return null;
        }
        Object object0 = iterator0.next();
        if(!iterator0.hasNext()) {
            return object0;
        }
        Comparable comparable0 = (Comparable)function10.invoke(object0);
        do {
            Object object1 = iterator0.next();
            Comparable comparable1 = (Comparable)function10.invoke(object1);
            if(comparable0.compareTo(comparable1) > 0) {
                object0 = object1;
                comparable0 = comparable1;
            }
        }
        while(iterator0.hasNext());
        return object0;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minByOrThrow")
    public static final Object minByOrThrow(@NotNull Iterable iterable0, @NotNull Function1 function10) {
        Iterator iterator0 = a.n(iterable0, "<this>", function10, "selector");
        if(!iterator0.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object0 = iterator0.next();
        if(!iterator0.hasNext()) {
            return object0;
        }
        Comparable comparable0 = (Comparable)function10.invoke(object0);
        do {
            Object object1 = iterator0.next();
            Comparable comparable1 = (Comparable)function10.invoke(object1);
            if(comparable0.compareTo(comparable1) > 0) {
                object0 = object1;
                comparable0 = comparable1;
            }
        }
        while(iterator0.hasNext());
        return object0;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static Comparable minOrNull(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Iterator iterator0 = iterable0.iterator();
        if(!iterator0.hasNext()) {
            return null;
        }
        Object object0 = iterator0.next();
        Comparable comparable0 = (Comparable)object0;
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            Comparable comparable1 = (Comparable)object1;
            if(comparable0.compareTo(comparable1) > 0) {
                comparable0 = comparable1;
            }
        }
        return comparable0;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Double minOrNull(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Iterator iterator0 = iterable0.iterator();
        if(!iterator0.hasNext()) {
            return null;
        }
        Object object0 = iterator0.next();
        double f;
        for(f = ((Number)object0).doubleValue(); iterator0.hasNext(); f = Math.min(f, ((Number)object1).doubleValue())) {
            Object object1 = iterator0.next();
        }
        return f;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static Float minOrNull(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Iterator iterator0 = iterable0.iterator();
        if(!iterator0.hasNext()) {
            return null;
        }
        Object object0 = iterator0.next();
        float f;
        for(f = ((Number)object0).floatValue(); iterator0.hasNext(); f = Math.min(f, ((Number)object1).floatValue())) {
            Object object1 = iterator0.next();
        }
        return f;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minOrThrow")
    public static final double minOrThrow(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Iterator iterator0 = iterable0.iterator();
        if(!iterator0.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object0 = iterator0.next();
        double f;
        for(f = ((Number)object0).doubleValue(); iterator0.hasNext(); f = Math.min(f, ((Number)object1).doubleValue())) {
            Object object1 = iterator0.next();
        }
        return f;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minOrThrow")
    public static final float minOrThrow(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Iterator iterator0 = iterable0.iterator();
        if(!iterator0.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object0 = iterator0.next();
        float f;
        for(f = ((Number)object0).floatValue(); iterator0.hasNext(); f = Math.min(f, ((Number)object1).floatValue())) {
            Object object1 = iterator0.next();
        }
        return f;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minOrThrow")
    @NotNull
    public static final Comparable minOrThrow(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Iterator iterator0 = iterable0.iterator();
        if(!iterator0.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object0 = iterator0.next();
        Comparable comparable0 = (Comparable)object0;
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            Comparable comparable1 = (Comparable)object1;
            if(comparable0.compareTo(comparable1) > 0) {
                comparable0 = comparable1;
            }
        }
        return comparable0;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Object minWithOrNull(@NotNull Iterable iterable0, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        Iterator iterator0 = iterable0.iterator();
        if(!iterator0.hasNext()) {
            return null;
        }
        Object object0 = iterator0.next();
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            if(comparator0.compare(object0, object1) > 0) {
                object0 = object1;
            }
        }
        return object0;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minWithOrThrow")
    public static final Object minWithOrThrow(@NotNull Iterable iterable0, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        Iterator iterator0 = iterable0.iterator();
        if(!iterator0.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object0 = iterator0.next();
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            if(comparator0.compare(object0, object1) > 0) {
                object0 = object1;
            }
        }
        return object0;
    }

    @NotNull
    public static final List minus(@NotNull Iterable iterable0, @NotNull Iterable iterable1) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(iterable1, "elements");
        Collection collection0 = o.convertToListIfNotCollection(iterable1);
        if(collection0.isEmpty()) {
            return CollectionsKt___CollectionsKt.toList(iterable0);
        }
        List list0 = new ArrayList();
        for(Object object0: iterable0) {
            if(!collection0.contains(object0)) {
                list0.add(object0);
            }
        }
        return list0;
    }

    @NotNull
    public static List minus(@NotNull Iterable iterable0, Object object0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        List list0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
        boolean z = false;
        for(Object object1: iterable0) {
            boolean z1 = true;
            if(!z && Intrinsics.areEqual(object1, object0)) {
                z = true;
                z1 = false;
            }
            if(z1) {
                list0.add(object1);
            }
        }
        return list0;
    }

    @NotNull
    public static final List minus(@NotNull Iterable iterable0, @NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(sequence0, "elements");
        List list0 = SequencesKt___SequencesKt.toList(sequence0);
        if(list0.isEmpty()) {
            return CollectionsKt___CollectionsKt.toList(iterable0);
        }
        List list1 = new ArrayList();
        for(Object object0: iterable0) {
            if(!list0.contains(object0)) {
                list1.add(object0);
            }
        }
        return list1;
    }

    @NotNull
    public static final List minus(@NotNull Iterable iterable0, @NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(arr_object, "elements");
        if(arr_object.length == 0) {
            return CollectionsKt___CollectionsKt.toList(iterable0);
        }
        List list0 = new ArrayList();
        for(Object object0: iterable0) {
            if(!ArraysKt___ArraysKt.contains(arr_object, object0)) {
                list0.add(object0);
            }
        }
        return list0;
    }

    public static final boolean none(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        return iterable0 instanceof Collection ? ((Collection)iterable0).isEmpty() : !iterable0.iterator().hasNext();
    }

    public static final boolean none(@NotNull Iterable iterable0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        if(iterable0 instanceof Collection && ((Collection)iterable0).isEmpty()) {
            return true;
        }
        for(Object object0: iterable0) {
            if(((Boolean)function10.invoke(object0)).booleanValue()) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final Iterable onEach(@NotNull Iterable iterable0, @NotNull Function1 function10) {
        Iterator iterator0 = a.n(iterable0, "<this>", function10, "action");
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            function10.invoke(object0);
        }
        return iterable0;
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final Iterable onEachIndexed(@NotNull Iterable iterable0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(function20, "action");
        int v = 0;
        for(Object object0: iterable0) {
            if(v < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            function20.invoke(v, object0);
            ++v;
        }
        return iterable0;
    }

    @NotNull
    public static final Pair partition(@NotNull Iterable iterable0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        for(Object object0: iterable0) {
            if(((Boolean)function10.invoke(object0)).booleanValue()) {
                arrayList0.add(object0);
            }
            else {
                arrayList1.add(object0);
            }
        }
        return new Pair(arrayList0, arrayList1);
    }

    @NotNull
    public static List plus(@NotNull Iterable iterable0, @NotNull Iterable iterable1) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(iterable1, "elements");
        if(iterable0 instanceof Collection) {
            return CollectionsKt___CollectionsKt.plus(((Collection)iterable0), iterable1);
        }
        List list0 = new ArrayList();
        o.addAll(list0, iterable0);
        o.addAll(list0, iterable1);
        return list0;
    }

    @NotNull
    public static List plus(@NotNull Iterable iterable0, Object object0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        if(iterable0 instanceof Collection) {
            return CollectionsKt___CollectionsKt.plus(((Collection)iterable0), object0);
        }
        List list0 = new ArrayList();
        o.addAll(list0, iterable0);
        ((ArrayList)list0).add(object0);
        return list0;
    }

    @NotNull
    public static final List plus(@NotNull Iterable iterable0, @NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(sequence0, "elements");
        List list0 = new ArrayList();
        o.addAll(list0, iterable0);
        o.addAll(list0, sequence0);
        return list0;
    }

    @NotNull
    public static final List plus(@NotNull Iterable iterable0, @NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(arr_object, "elements");
        if(iterable0 instanceof Collection) {
            return CollectionsKt___CollectionsKt.plus(((Collection)iterable0), arr_object);
        }
        List list0 = new ArrayList();
        o.addAll(list0, iterable0);
        o.addAll(list0, arr_object);
        return list0;
    }

    @NotNull
    public static List plus(@NotNull Collection collection0, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(collection0, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "elements");
        if(iterable0 instanceof Collection) {
            List list0 = new ArrayList(((Collection)iterable0).size() + collection0.size());
            ((ArrayList)list0).addAll(collection0);
            ((ArrayList)list0).addAll(((Collection)iterable0));
            return list0;
        }
        List list1 = new ArrayList(collection0);
        o.addAll(list1, iterable0);
        return list1;
    }

    @NotNull
    public static List plus(@NotNull Collection collection0, Object object0) {
        Intrinsics.checkNotNullParameter(collection0, "<this>");
        List list0 = new ArrayList(collection0.size() + 1);
        ((ArrayList)list0).addAll(collection0);
        ((ArrayList)list0).add(object0);
        return list0;
    }

    @NotNull
    public static final List plus(@NotNull Collection collection0, @NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(collection0, "<this>");
        Intrinsics.checkNotNullParameter(sequence0, "elements");
        List list0 = new ArrayList(collection0.size() + 10);
        ((ArrayList)list0).addAll(collection0);
        o.addAll(list0, sequence0);
        return list0;
    }

    @NotNull
    public static final List plus(@NotNull Collection collection0, @NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(collection0, "<this>");
        Intrinsics.checkNotNullParameter(arr_object, "elements");
        List list0 = new ArrayList(collection0.size() + arr_object.length);
        ((ArrayList)list0).addAll(collection0);
        o.addAll(list0, arr_object);
        return list0;
    }

    @SinceKotlin(version = "1.3")
    public static final Object random(@NotNull Collection collection0, @NotNull Random random0) {
        Intrinsics.checkNotNullParameter(collection0, "<this>");
        Intrinsics.checkNotNullParameter(random0, "random");
        if(collection0.isEmpty()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        return CollectionsKt___CollectionsKt.elementAt(collection0, random0.nextInt(collection0.size()));
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Object randomOrNull(@NotNull Collection collection0, @NotNull Random random0) {
        Intrinsics.checkNotNullParameter(collection0, "<this>");
        Intrinsics.checkNotNullParameter(random0, "random");
        return collection0.isEmpty() ? null : CollectionsKt___CollectionsKt.elementAt(collection0, random0.nextInt(collection0.size()));
    }

    public static final Object reduce(@NotNull Iterable iterable0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        Iterator iterator0 = iterable0.iterator();
        if(!iterator0.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can\'t be reduced.");
        }
        Object object0;
        for(object0 = iterator0.next(); iterator0.hasNext(); object0 = function20.invoke(object0, object1)) {
            Object object1 = iterator0.next();
        }
        return object0;
    }

    public static final Object reduceIndexed(@NotNull Iterable iterable0, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        Iterator iterator0 = iterable0.iterator();
        if(!iterator0.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can\'t be reduced.");
        }
        Object object0 = iterator0.next();
        for(int v = 1; iterator0.hasNext(); ++v) {
            if(v < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            Object object1 = iterator0.next();
            object0 = function30.invoke(v, object0, object1);
        }
        return object0;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Object reduceIndexedOrNull(@NotNull Iterable iterable0, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        Iterator iterator0 = iterable0.iterator();
        if(!iterator0.hasNext()) {
            return null;
        }
        Object object0 = iterator0.next();
        for(int v = 1; iterator0.hasNext(); ++v) {
            if(v < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            Object object1 = iterator0.next();
            object0 = function30.invoke(v, object0, object1);
        }
        return object0;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Object reduceOrNull(@NotNull Iterable iterable0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        Iterator iterator0 = iterable0.iterator();
        if(!iterator0.hasNext()) {
            return null;
        }
        Object object0;
        for(object0 = iterator0.next(); iterator0.hasNext(); object0 = function20.invoke(object0, object1)) {
            Object object1 = iterator0.next();
        }
        return object0;
    }

    public static final Object reduceRight(@NotNull List list0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        ListIterator listIterator0 = list0.listIterator(list0.size());
        if(!listIterator0.hasPrevious()) {
            throw new UnsupportedOperationException("Empty list can\'t be reduced.");
        }
        Object object0;
        for(object0 = listIterator0.previous(); listIterator0.hasPrevious(); object0 = function20.invoke(listIterator0.previous(), object0)) {
        }
        return object0;
    }

    public static final Object reduceRightIndexed(@NotNull List list0, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        ListIterator listIterator0 = list0.listIterator(list0.size());
        if(!listIterator0.hasPrevious()) {
            throw new UnsupportedOperationException("Empty list can\'t be reduced.");
        }
        Object object0;
        for(object0 = listIterator0.previous(); listIterator0.hasPrevious(); object0 = function30.invoke(listIterator0.previousIndex(), listIterator0.previous(), object0)) {
        }
        return object0;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Object reduceRightIndexedOrNull(@NotNull List list0, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        ListIterator listIterator0 = list0.listIterator(list0.size());
        if(!listIterator0.hasPrevious()) {
            return null;
        }
        Object object0;
        for(object0 = listIterator0.previous(); listIterator0.hasPrevious(); object0 = function30.invoke(listIterator0.previousIndex(), listIterator0.previous(), object0)) {
        }
        return object0;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Object reduceRightOrNull(@NotNull List list0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        ListIterator listIterator0 = list0.listIterator(list0.size());
        if(!listIterator0.hasPrevious()) {
            return null;
        }
        Object object0;
        for(object0 = listIterator0.previous(); listIterator0.hasPrevious(); object0 = function20.invoke(listIterator0.previous(), object0)) {
        }
        return object0;
    }

    @NotNull
    public static final Iterable requireNoNulls(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        for(Object object0: iterable0) {
            if(object0 == null) {
                throw new IllegalArgumentException("null element found in " + iterable0 + '.');
            }
            if(false) {
                break;
            }
        }
        return iterable0;
    }

    @NotNull
    public static final List requireNoNulls(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        for(Object object0: list0) {
            if(object0 == null) {
                throw new IllegalArgumentException("null element found in " + list0 + '.');
            }
            if(false) {
                break;
            }
        }
        return list0;
    }

    @NotNull
    public static List reversed(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        if(iterable0 instanceof Collection && ((Collection)iterable0).size() <= 1) {
            return CollectionsKt___CollectionsKt.toList(iterable0);
        }
        List list0 = CollectionsKt___CollectionsKt.toMutableList(iterable0);
        q.reverse(list0);
        return list0;
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final List runningFold(@NotNull Iterable iterable0, Object object0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        int v = l.collectionSizeOrDefault(iterable0, 9);
        if(v == 0) {
            return k.listOf(object0);
        }
        List list0 = new ArrayList(v + 1);
        ((ArrayList)list0).add(object0);
        for(Object object1: iterable0) {
            object0 = function20.invoke(object0, object1);
            ((ArrayList)list0).add(object0);
        }
        return list0;
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final List runningFoldIndexed(@NotNull Iterable iterable0, Object object0, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        int v = l.collectionSizeOrDefault(iterable0, 9);
        if(v == 0) {
            return k.listOf(object0);
        }
        List list0 = new ArrayList(v + 1);
        ((ArrayList)list0).add(object0);
        int v1 = 0;
        for(Object object1: iterable0) {
            object0 = function30.invoke(v1, object0, object1);
            ((ArrayList)list0).add(object0);
            ++v1;
        }
        return list0;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static final List runningReduce(@NotNull Iterable iterable0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        Iterator iterator0 = iterable0.iterator();
        if(!iterator0.hasNext()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        Object object0 = iterator0.next();
        List list0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
        ((ArrayList)list0).add(object0);
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            object0 = function20.invoke(object0, object1);
            ((ArrayList)list0).add(object0);
        }
        return list0;
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final List runningReduceIndexed(@NotNull Iterable iterable0, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        Iterator iterator0 = iterable0.iterator();
        if(!iterator0.hasNext()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        Object object0 = iterator0.next();
        List list0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
        ((ArrayList)list0).add(object0);
        for(int v = 1; iterator0.hasNext(); ++v) {
            Object object1 = iterator0.next();
            object0 = function30.invoke(v, object0, object1);
            ((ArrayList)list0).add(object0);
        }
        return list0;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static final List scan(@NotNull Iterable iterable0, Object object0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        int v = l.collectionSizeOrDefault(iterable0, 9);
        if(v == 0) {
            return k.listOf(object0);
        }
        ArrayList arrayList0 = new ArrayList(v + 1);
        arrayList0.add(object0);
        for(Object object1: iterable0) {
            object0 = function20.invoke(object0, object1);
            arrayList0.add(object0);
        }
        return arrayList0;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static final List scanIndexed(@NotNull Iterable iterable0, Object object0, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        int v = l.collectionSizeOrDefault(iterable0, 9);
        if(v == 0) {
            return k.listOf(object0);
        }
        ArrayList arrayList0 = new ArrayList(v + 1);
        arrayList0.add(object0);
        int v1 = 0;
        for(Object object1: iterable0) {
            object0 = function30.invoke(v1, object0, object1);
            arrayList0.add(object0);
            ++v1;
        }
        return arrayList0;
    }

    @SinceKotlin(version = "1.3")
    public static final void shuffle(@NotNull List list0, @NotNull Random random0) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        Intrinsics.checkNotNullParameter(random0, "random");
        for(int v = CollectionsKt__CollectionsKt.getLastIndex(list0); v > 0; --v) {
            int v1 = random0.nextInt(v + 1);
            list0.set(v1, list0.set(v, list0.get(v1)));
        }
    }

    public static Object single(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        if(iterable0 instanceof List) {
            return CollectionsKt___CollectionsKt.single(((List)iterable0));
        }
        Iterator iterator0 = iterable0.iterator();
        if(!iterator0.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object object0 = iterator0.next();
        if(iterator0.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return object0;
    }

    public static final Object single(@NotNull Iterable iterable0, @NotNull Function1 function10) {
        Object object0 = null;
        boolean z = false;
        Iterator iterator0 = a.n(iterable0, "<this>", function10, "predicate");
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            if(((Boolean)function10.invoke(object1)).booleanValue()) {
                if(z) {
                    throw new IllegalArgumentException("Collection contains more than one matching element.");
                }
                z = true;
                object0 = object1;
            }
        }
        if(!z) {
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        return object0;
    }

    public static Object single(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        switch(list0.size()) {
            case 0: {
                throw new NoSuchElementException("List is empty.");
            }
            case 1: {
                return list0.get(0);
            }
            default: {
                throw new IllegalArgumentException("List has more than one element.");
            }
        }
    }

    @Nullable
    public static Object singleOrNull(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        if(iterable0 instanceof List) {
            return ((List)iterable0).size() == 1 ? ((List)iterable0).get(0) : null;
        }
        Iterator iterator0 = iterable0.iterator();
        if(!iterator0.hasNext()) {
            return null;
        }
        Object object0 = iterator0.next();
        return iterator0.hasNext() ? null : object0;
    }

    @Nullable
    public static final Object singleOrNull(@NotNull Iterable iterable0, @NotNull Function1 function10) {
        boolean z = false;
        Object object0 = null;
        Iterator iterator0 = a.n(iterable0, "<this>", function10, "predicate");
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            if(((Boolean)function10.invoke(object1)).booleanValue()) {
                if(z) {
                    return null;
                }
                z = true;
                object0 = object1;
            }
        }
        return z ? object0 : null;
    }

    @Nullable
    public static Object singleOrNull(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        return list0.size() == 1 ? list0.get(0) : null;
    }

    @NotNull
    public static final List slice(@NotNull List list0, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "indices");
        int v = l.collectionSizeOrDefault(iterable0, 10);
        if(v == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List list1 = new ArrayList(v);
        for(Object object0: iterable0) {
            ((ArrayList)list1).add(list0.get(((Number)object0).intValue()));
        }
        return list1;
    }

    @NotNull
    public static final List slice(@NotNull List list0, @NotNull IntRange intRange0) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        Intrinsics.checkNotNullParameter(intRange0, "indices");
        return intRange0.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : CollectionsKt___CollectionsKt.toList(list0.subList(((int)intRange0.getStart()), ((int)intRange0.getEndInclusive()) + 1));
    }

    public static final void sortBy(@NotNull List list0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        if(list0.size() > 1) {
            n.sortWith(list0, new ComparisonsKt__ComparisonsKt.compareBy.2(function10));
        }
    }

    public static final void sortByDescending(@NotNull List list0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        if(list0.size() > 1) {
            n.sortWith(list0, new ComparisonsKt__ComparisonsKt.compareByDescending.1(function10));
        }
    }

    public static final void sortDescending(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        n.sortWith(list0, pd.c.reverseOrder());
    }

    @NotNull
    public static List sorted(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        if(iterable0 instanceof Collection) {
            if(((Collection)iterable0).size() <= 1) {
                return CollectionsKt___CollectionsKt.toList(iterable0);
            }
            Object[] arr_object = ((Collection)iterable0).toArray(new Comparable[0]);
            ArraysKt___ArraysJvmKt.sort(((Comparable[])arr_object));
            return ArraysKt___ArraysJvmKt.asList(arr_object);
        }
        List list0 = CollectionsKt___CollectionsKt.toMutableList(iterable0);
        n.sort(list0);
        return list0;
    }

    @NotNull
    public static final List sortedBy(@NotNull Iterable iterable0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        return CollectionsKt___CollectionsKt.sortedWith(iterable0, new ComparisonsKt__ComparisonsKt.compareBy.2(function10));
    }

    @NotNull
    public static final List sortedByDescending(@NotNull Iterable iterable0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        return CollectionsKt___CollectionsKt.sortedWith(iterable0, new ComparisonsKt__ComparisonsKt.compareByDescending.1(function10));
    }

    @NotNull
    public static final List sortedDescending(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        return CollectionsKt___CollectionsKt.sortedWith(iterable0, pd.c.reverseOrder());
    }

    @NotNull
    public static List sortedWith(@NotNull Iterable iterable0, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        if(iterable0 instanceof Collection) {
            if(((Collection)iterable0).size() <= 1) {
                return CollectionsKt___CollectionsKt.toList(iterable0);
            }
            Object[] arr_object = ((Collection)iterable0).toArray(new Object[0]);
            ArraysKt___ArraysJvmKt.sortWith(arr_object, comparator0);
            return ArraysKt___ArraysJvmKt.asList(arr_object);
        }
        List list0 = CollectionsKt___CollectionsKt.toMutableList(iterable0);
        n.sortWith(list0, comparator0);
        return list0;
    }

    @NotNull
    public static final Set subtract(@NotNull Iterable iterable0, @NotNull Iterable iterable1) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(iterable1, "other");
        Set set0 = CollectionsKt___CollectionsKt.toMutableSet(iterable0);
        o.removeAll(set0, iterable1);
        return set0;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final int sumBy(@NotNull Iterable iterable0, @NotNull Function1 function10) {
        int v = 0;
        Iterator iterator0 = a.n(iterable0, "<this>", function10, "selector");
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            v += ((Number)function10.invoke(object0)).intValue();
        }
        return v;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final double sumByDouble(@NotNull Iterable iterable0, @NotNull Function1 function10) {
        double f = 0.0;
        Iterator iterator0 = a.n(iterable0, "<this>", function10, "selector");
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            f += ((Number)function10.invoke(object0)).doubleValue();
        }
        return f;
    }

    @JvmName(name = "sumOfByte")
    public static final int sumOfByte(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        int v = 0;
        for(Object object0: iterable0) {
            v += ((Number)object0).byteValue();
        }
        return v;
    }

    @JvmName(name = "sumOfDouble")
    public static double sumOfDouble(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        double f = 0.0;
        for(Object object0: iterable0) {
            f += ((Number)object0).doubleValue();
        }
        return f;
    }

    @JvmName(name = "sumOfFloat")
    public static final float sumOfFloat(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        float f = 0.0f;
        for(Object object0: iterable0) {
            f += ((Number)object0).floatValue();
        }
        return f;
    }

    @JvmName(name = "sumOfInt")
    public static int sumOfInt(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        int v = 0;
        for(Object object0: iterable0) {
            v += ((Number)object0).intValue();
        }
        return v;
    }

    @JvmName(name = "sumOfLong")
    public static final long sumOfLong(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        long v = 0L;
        for(Object object0: iterable0) {
            v += ((Number)object0).longValue();
        }
        return v;
    }

    @JvmName(name = "sumOfShort")
    public static final int sumOfShort(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        int v = 0;
        for(Object object0: iterable0) {
            v += ((Number)object0).shortValue();
        }
        return v;
    }

    @NotNull
    public static List take(@NotNull Iterable iterable0, int v) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        if(v == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if(iterable0 instanceof Collection) {
            if(v >= ((Collection)iterable0).size()) {
                return CollectionsKt___CollectionsKt.toList(iterable0);
            }
            if(v == 1) {
                return k.listOf(CollectionsKt___CollectionsKt.first(iterable0));
            }
        }
        ArrayList arrayList0 = new ArrayList(v);
        int v1 = 0;
        for(Object object0: iterable0) {
            arrayList0.add(object0);
            ++v1;
            if(v1 == v) {
                break;
            }
        }
        return CollectionsKt__CollectionsKt.optimizeReadOnlyList(arrayList0);
    }

    @NotNull
    public static List takeLast(@NotNull List list0, int v) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        if(v == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int v1 = list0.size();
        if(v >= v1) {
            return CollectionsKt___CollectionsKt.toList(list0);
        }
        if(v == 1) {
            return k.listOf(CollectionsKt___CollectionsKt.last(list0));
        }
        List list1 = new ArrayList(v);
        if(list0 instanceof RandomAccess) {
            for(int v2 = v1 - v; v2 < v1; ++v2) {
                ((ArrayList)list1).add(list0.get(v2));
            }
            return list1;
        }
        ListIterator listIterator0 = list0.listIterator(v1 - v);
        while(listIterator0.hasNext()) {
            Object object0 = listIterator0.next();
            ((ArrayList)list1).add(object0);
        }
        return list1;
    }

    @NotNull
    public static final List takeLastWhile(@NotNull List list0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        if(list0.isEmpty()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ListIterator listIterator0 = list0.listIterator(list0.size());
        while(listIterator0.hasPrevious()) {
            if(!((Boolean)function10.invoke(listIterator0.previous())).booleanValue()) {
                listIterator0.next();
                int v = list0.size() - listIterator0.nextIndex();
                if(v == 0) {
                    return CollectionsKt__CollectionsKt.emptyList();
                }
                List list1 = new ArrayList(v);
                while(listIterator0.hasNext()) {
                    ((ArrayList)list1).add(listIterator0.next());
                }
                return list1;
            }
            if(false) {
                break;
            }
        }
        return CollectionsKt___CollectionsKt.toList(list0);
    }

    @NotNull
    public static final List takeWhile(@NotNull Iterable iterable0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        List list0 = new ArrayList();
        for(Object object0: iterable0) {
            if(!((Boolean)function10.invoke(object0)).booleanValue()) {
                break;
            }
            ((ArrayList)list0).add(object0);
        }
        return list0;
    }

    @NotNull
    public static boolean[] toBooleanArray(@NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "<this>");
        boolean[] arr_z = new boolean[collection0.size()];
        int v = 0;
        for(Object object0: collection0) {
            arr_z[v] = ((Boolean)object0).booleanValue();
            ++v;
        }
        return arr_z;
    }

    @NotNull
    public static final byte[] toByteArray(@NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "<this>");
        byte[] arr_b = new byte[collection0.size()];
        int v = 0;
        for(Object object0: collection0) {
            arr_b[v] = ((Number)object0).byteValue();
            ++v;
        }
        return arr_b;
    }

    @NotNull
    public static final char[] toCharArray(@NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "<this>");
        char[] arr_c = new char[collection0.size()];
        int v = 0;
        for(Object object0: collection0) {
            arr_c[v] = ((Character)object0).charValue();
            ++v;
        }
        return arr_c;
    }

    @NotNull
    public static final Collection toCollection(@NotNull Iterable iterable0, @NotNull Collection collection0) [...] // Inlined contents

    @NotNull
    public static final double[] toDoubleArray(@NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "<this>");
        double[] arr_f = new double[collection0.size()];
        int v = 0;
        for(Object object0: collection0) {
            arr_f[v] = ((Number)object0).doubleValue();
            ++v;
        }
        return arr_f;
    }

    @NotNull
    public static float[] toFloatArray(@NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "<this>");
        float[] arr_f = new float[collection0.size()];
        int v = 0;
        for(Object object0: collection0) {
            arr_f[v] = ((Number)object0).floatValue();
            ++v;
        }
        return arr_f;
    }

    @NotNull
    public static HashSet toHashSet(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        return (HashSet)CollectionsKt___CollectionsKt.toCollection(iterable0, new HashSet(w.mapCapacity(l.collectionSizeOrDefault(iterable0, 12))));
    }

    @NotNull
    public static int[] toIntArray(@NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "<this>");
        int[] arr_v = new int[collection0.size()];
        int v = 0;
        for(Object object0: collection0) {
            arr_v[v] = ((Number)object0).intValue();
            ++v;
        }
        return arr_v;
    }

    @NotNull
    public static List toList(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        if(iterable0 instanceof Collection) {
            switch(((Collection)iterable0).size()) {
                case 0: {
                    return CollectionsKt__CollectionsKt.emptyList();
                }
                case 1: {
                    if(iterable0 instanceof List) {
                        return k.listOf(((List)iterable0).get(0));
                    }
                    Object object0 = iterable0.iterator().next();
                    return k.listOf(object0);
                }
                default: {
                    return CollectionsKt___CollectionsKt.toMutableList(((Collection)iterable0));
                }
            }
        }
        return CollectionsKt__CollectionsKt.optimizeReadOnlyList(CollectionsKt___CollectionsKt.toMutableList(iterable0));
    }

    @NotNull
    public static long[] toLongArray(@NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "<this>");
        long[] arr_v = new long[collection0.size()];
        int v = 0;
        for(Object object0: collection0) {
            arr_v[v] = ((Number)object0).longValue();
            ++v;
        }
        return arr_v;
    }

    @NotNull
    public static final List toMutableList(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        return iterable0 instanceof Collection ? CollectionsKt___CollectionsKt.toMutableList(((Collection)iterable0)) : ((List)CollectionsKt___CollectionsKt.toCollection(iterable0, new ArrayList()));
    }

    @NotNull
    public static List toMutableList(@NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "<this>");
        return new ArrayList(collection0);
    }

    @NotNull
    public static Set toMutableSet(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        return iterable0 instanceof Collection ? new LinkedHashSet(((Collection)iterable0)) : ((Set)CollectionsKt___CollectionsKt.toCollection(iterable0, new LinkedHashSet()));
    }

    @NotNull
    public static Set toSet(@NotNull Iterable iterable0) [...] // Inlined contents

    @NotNull
    public static final short[] toShortArray(@NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "<this>");
        short[] arr_v = new short[collection0.size()];
        int v = 0;
        for(Object object0: collection0) {
            arr_v[v] = ((Number)object0).shortValue();
            ++v;
        }
        return arr_v;
    }

    @NotNull
    public static Set union(@NotNull Iterable iterable0, @NotNull Iterable iterable1) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(iterable1, "other");
        Set set0 = CollectionsKt___CollectionsKt.toMutableSet(iterable0);
        o.addAll(set0, iterable1);
        return set0;
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final List windowed(@NotNull Iterable iterable0, int v, int v1, boolean z) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        SlidingWindowKt.checkWindowSizeStep(v, v1);
        if(iterable0 instanceof RandomAccess && iterable0 instanceof List) {
            int v2 = ((List)iterable0).size();
            List list0 = new ArrayList(v2 / v1 + (v2 % v1 == 0 ? 0 : 1));
            for(int v3 = 0; v3 >= 0 && v3 < v2; v3 += v1) {
                int v4 = c.coerceAtMost(v, v2 - v3);
                if(v4 < v && !z) {
                    break;
                }
                ArrayList arrayList0 = new ArrayList(v4);
                for(int v5 = 0; v5 < v4; ++v5) {
                    arrayList0.add(((List)iterable0).get(v5 + v3));
                }
                ((ArrayList)list0).add(arrayList0);
            }
            return list0;
        }
        List list1 = new ArrayList();
        Iterator iterator0 = SlidingWindowKt.windowedIterator(iterable0.iterator(), v, v1, z, false);
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            ((ArrayList)list1).add(((List)object0));
        }
        return list1;
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final List windowed(@NotNull Iterable iterable0, int v, int v1, boolean z, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "transform");
        SlidingWindowKt.checkWindowSizeStep(v, v1);
        int v2 = 1;
        if(iterable0 instanceof RandomAccess && iterable0 instanceof List) {
            int v3 = ((List)iterable0).size();
            if(v3 % v1 == 0) {
                v2 = 0;
            }
            List list0 = new ArrayList(v3 / v1 + v2);
            MovingSubList movingSubList0 = new MovingSubList(((List)iterable0));
            for(int v4 = 0; v4 >= 0 && v4 < v3; v4 += v1) {
                int v5 = c.coerceAtMost(v, v3 - v4);
                if(!z && v5 < v) {
                    break;
                }
                movingSubList0.move(v4, v5 + v4);
                ((ArrayList)list0).add(function10.invoke(movingSubList0));
            }
            return list0;
        }
        List list1 = new ArrayList();
        Iterator iterator0 = SlidingWindowKt.windowedIterator(iterable0.iterator(), v, v1, z, true);
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            ((ArrayList)list1).add(function10.invoke(((List)object0)));
        }
        return list1;
    }

    public static List windowed$default(Iterable iterable0, int v, int v1, boolean z, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v1 = 1;
        }
        if((v2 & 4) != 0) {
            z = false;
        }
        return CollectionsKt___CollectionsKt.windowed(iterable0, v, v1, z);
    }

    public static List windowed$default(Iterable iterable0, int v, int v1, boolean z, Function1 function10, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v1 = 1;
        }
        if((v2 & 4) != 0) {
            z = false;
        }
        return CollectionsKt___CollectionsKt.windowed(iterable0, v, v1, z, function10);
    }

    @NotNull
    public static Iterable withIndex(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        return new IndexingIterable(new j(iterable0, 12));
    }

    @NotNull
    public static List zip(@NotNull Iterable iterable0, @NotNull Iterable iterable1) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(iterable1, "other");
        Iterator iterator0 = iterable0.iterator();
        Iterator iterator1 = iterable1.iterator();
        List list0 = new ArrayList(Math.min(l.collectionSizeOrDefault(iterable0, 10), l.collectionSizeOrDefault(iterable1, 10)));
        while(iterator0.hasNext() && iterator1.hasNext()) {
            Object object0 = iterator0.next();
            Object object1 = iterator1.next();
            ((ArrayList)list0).add(TuplesKt.to(object0, object1));
        }
        return list0;
    }

    @NotNull
    public static final List zip(@NotNull Iterable iterable0, @NotNull Iterable iterable1, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(iterable1, "other");
        Intrinsics.checkNotNullParameter(function20, "transform");
        Iterator iterator0 = iterable0.iterator();
        Iterator iterator1 = iterable1.iterator();
        List list0 = new ArrayList(Math.min(l.collectionSizeOrDefault(iterable0, 10), l.collectionSizeOrDefault(iterable1, 10)));
        while(iterator0.hasNext() && iterator1.hasNext()) {
            Object object0 = iterator0.next();
            Object object1 = iterator1.next();
            ((ArrayList)list0).add(function20.invoke(object0, object1));
        }
        return list0;
    }

    @NotNull
    public static final List zip(@NotNull Iterable iterable0, @NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(arr_object, "other");
        List list0 = new ArrayList(Math.min(l.collectionSizeOrDefault(iterable0, 10), arr_object.length));
        int v = 0;
        for(Object object0: iterable0) {
            if(v >= arr_object.length) {
                break;
            }
            ((ArrayList)list0).add(TuplesKt.to(object0, arr_object[v]));
            ++v;
        }
        return list0;
    }

    @NotNull
    public static final List zip(@NotNull Iterable iterable0, @NotNull Object[] arr_object, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(arr_object, "other");
        Intrinsics.checkNotNullParameter(function20, "transform");
        List list0 = new ArrayList(Math.min(l.collectionSizeOrDefault(iterable0, 10), arr_object.length));
        int v = 0;
        for(Object object0: iterable0) {
            if(v >= arr_object.length) {
                break;
            }
            ((ArrayList)list0).add(function20.invoke(object0, arr_object[v]));
            ++v;
        }
        return list0;
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final List zipWithNext(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Iterator iterator0 = iterable0.iterator();
        if(!iterator0.hasNext()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object0 = iterator0.next(); iterator0.hasNext(); object0 = object1) {
            Object object1 = iterator0.next();
            arrayList0.add(TuplesKt.to(object0, object1));
        }
        return arrayList0;
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final List zipWithNext(@NotNull Iterable iterable0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(function20, "transform");
        Iterator iterator0 = iterable0.iterator();
        if(!iterator0.hasNext()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List list0 = new ArrayList();
        for(Object object0 = iterator0.next(); iterator0.hasNext(); object0 = object1) {
            Object object1 = iterator0.next();
            list0.add(function20.invoke(object0, object1));
        }
        return list0;
    }
}

