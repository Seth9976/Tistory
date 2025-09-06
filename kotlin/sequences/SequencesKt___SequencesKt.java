package kotlin.sequences;

import androidx.compose.material3.h8;
import androidx.compose.material3.ni;
import androidx.compose.material3.ti;
import androidx.compose.material3.v6;
import androidx.compose.ui.platform.k1;
import androidx.room.a;
import fg.c;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import kf.g;
import kf.j;
import kf.k;
import kf.l;
import kf.m;
import kf.n;
import kf.p;
import kf.q;
import kf.r;
import kf.s;
import kf.t;
import kf.u;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.OverloadResolutionByLambdaReturnType;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.Grouping;
import kotlin.collections.SlidingWindowKt;
import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.collections.o;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt.compareBy.2;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt.compareByDescending.1;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.BooleanRef;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class SequencesKt___SequencesKt extends j {
    public static final boolean all(@NotNull Sequence sequence0, @NotNull Function1 function10) {
        Iterator iterator0 = a.o(sequence0, "<this>", function10, "predicate");
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            if(!((Boolean)function10.invoke(object0)).booleanValue()) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    public static final boolean any(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        return sequence0.iterator().hasNext();
    }

    public static final boolean any(@NotNull Sequence sequence0, @NotNull Function1 function10) {
        Iterator iterator0 = a.o(sequence0, "<this>", function10, "predicate");
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
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
    public static Iterable asIterable(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        return new Object() {
            @Override
            @NotNull
            public Iterator iterator() {
                return sequence0.iterator();
            }
        };
    }

    @NotNull
    public static final Map associate(@NotNull Sequence sequence0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "transform");
        Map map0 = new LinkedHashMap();
        for(Object object0: sequence0) {
            Pair pair0 = (Pair)function10.invoke(object0);
            map0.put(pair0.getFirst(), pair0.getSecond());
        }
        return map0;
    }

    @NotNull
    public static final Map associateBy(@NotNull Sequence sequence0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Map map0 = new LinkedHashMap();
        for(Object object0: sequence0) {
            map0.put(function10.invoke(object0), object0);
        }
        return map0;
    }

    @NotNull
    public static final Map associateBy(@NotNull Sequence sequence0, @NotNull Function1 function10, @NotNull Function1 function11) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Intrinsics.checkNotNullParameter(function11, "valueTransform");
        Map map0 = new LinkedHashMap();
        for(Object object0: sequence0) {
            map0.put(function10.invoke(object0), function11.invoke(object0));
        }
        return map0;
    }

    @NotNull
    public static final Map associateByTo(@NotNull Sequence sequence0, @NotNull Map map0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        for(Object object0: sequence0) {
            map0.put(function10.invoke(object0), object0);
        }
        return map0;
    }

    @NotNull
    public static final Map associateByTo(@NotNull Sequence sequence0, @NotNull Map map0, @NotNull Function1 function10, @NotNull Function1 function11) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Intrinsics.checkNotNullParameter(function11, "valueTransform");
        for(Object object0: sequence0) {
            map0.put(function10.invoke(object0), function11.invoke(object0));
        }
        return map0;
    }

    @NotNull
    public static final Map associateTo(@NotNull Sequence sequence0, @NotNull Map map0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Intrinsics.checkNotNullParameter(function10, "transform");
        for(Object object0: sequence0) {
            Pair pair0 = (Pair)function10.invoke(object0);
            map0.put(pair0.getFirst(), pair0.getSecond());
        }
        return map0;
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final Map associateWith(@NotNull Sequence sequence0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "valueSelector");
        Map map0 = new LinkedHashMap();
        for(Object object0: sequence0) {
            map0.put(object0, function10.invoke(object0));
        }
        return map0;
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final Map associateWithTo(@NotNull Sequence sequence0, @NotNull Map map0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Intrinsics.checkNotNullParameter(function10, "valueSelector");
        for(Object object0: sequence0) {
            map0.put(object0, function10.invoke(object0));
        }
        return map0;
    }

    @JvmName(name = "averageOfByte")
    public static final double averageOfByte(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        double f = 0.0;
        int v = 0;
        for(Object object0: sequence0) {
            f += (double)((Number)object0).byteValue();
            ++v;
            if(v < 0) {
                CollectionsKt__CollectionsKt.throwCountOverflow();
            }
        }
        return v == 0 ? NaN : f / ((double)v);
    }

    @JvmName(name = "averageOfDouble")
    public static final double averageOfDouble(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        double f = 0.0;
        int v = 0;
        for(Object object0: sequence0) {
            f += ((Number)object0).doubleValue();
            ++v;
            if(v < 0) {
                CollectionsKt__CollectionsKt.throwCountOverflow();
            }
        }
        return v == 0 ? NaN : f / ((double)v);
    }

    @JvmName(name = "averageOfFloat")
    public static final double averageOfFloat(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        double f = 0.0;
        int v = 0;
        for(Object object0: sequence0) {
            f += (double)((Number)object0).floatValue();
            ++v;
            if(v < 0) {
                CollectionsKt__CollectionsKt.throwCountOverflow();
            }
        }
        return v == 0 ? NaN : f / ((double)v);
    }

    @JvmName(name = "averageOfInt")
    public static final double averageOfInt(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        double f = 0.0;
        int v = 0;
        for(Object object0: sequence0) {
            f += (double)((Number)object0).intValue();
            ++v;
            if(v < 0) {
                CollectionsKt__CollectionsKt.throwCountOverflow();
            }
        }
        return v == 0 ? NaN : f / ((double)v);
    }

    @JvmName(name = "averageOfLong")
    public static final double averageOfLong(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        double f = 0.0;
        int v = 0;
        for(Object object0: sequence0) {
            f += (double)((Number)object0).longValue();
            ++v;
            if(v < 0) {
                CollectionsKt__CollectionsKt.throwCountOverflow();
            }
        }
        return v == 0 ? NaN : f / ((double)v);
    }

    @JvmName(name = "averageOfShort")
    public static final double averageOfShort(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        double f = 0.0;
        int v = 0;
        for(Object object0: sequence0) {
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
    public static final Sequence chunked(@NotNull Sequence sequence0, int v) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        return SequencesKt___SequencesKt.windowed(sequence0, v, v, true);
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final Sequence chunked(@NotNull Sequence sequence0, int v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "transform");
        return SequencesKt___SequencesKt.windowed(sequence0, v, v, true, function10);
    }

    public static boolean contains(@NotNull Sequence sequence0, Object object0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        return SequencesKt___SequencesKt.indexOf(sequence0, object0) >= 0;
    }

    public static int count(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        int v = 0;
        Iterator iterator0 = sequence0.iterator();
        while(iterator0.hasNext()) {
            iterator0.next();
            ++v;
            if(v < 0) {
                CollectionsKt__CollectionsKt.throwCountOverflow();
            }
        }
        return v;
    }

    public static final int count(@NotNull Sequence sequence0, @NotNull Function1 function10) {
        int v = 0;
        Iterator iterator0 = a.o(sequence0, "<this>", function10, "predicate");
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
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
    public static final Sequence distinct(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        return SequencesKt___SequencesKt.distinctBy(sequence0, g.A);
    }

    @NotNull
    public static final Sequence distinctBy(@NotNull Sequence sequence0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        return new DistinctSequence(sequence0, function10);
    }

    @NotNull
    public static Sequence drop(@NotNull Sequence sequence0, int v) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        if(v != 0) {
            return sequence0 instanceof DropTakeSequence ? ((DropTakeSequence)sequence0).drop(v) : new DropSequence(sequence0, v);
        }
        return sequence0;
    }

    @NotNull
    public static final Sequence dropWhile(@NotNull Sequence sequence0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        return new DropWhileSequence(sequence0, function10);
    }

    public static Object elementAt(@NotNull Sequence sequence0, int v) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        return SequencesKt___SequencesKt.elementAtOrElse(sequence0, v, new v6(v, 7));
    }

    public static final Object elementAtOrElse(@NotNull Sequence sequence0, int v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "defaultValue");
        if(v < 0) {
            return function10.invoke(v);
        }
        int v1 = 0;
        for(Object object0: sequence0) {
            if(v == v1) {
                return object0;
            }
            ++v1;
        }
        return function10.invoke(v);
    }

    @Nullable
    public static final Object elementAtOrNull(@NotNull Sequence sequence0, int v) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        if(v < 0) {
            return null;
        }
        int v1 = 0;
        for(Object object0: sequence0) {
            if(v == v1) {
                return object0;
            }
            ++v1;
        }
        return null;
    }

    @NotNull
    public static Sequence filter(@NotNull Sequence sequence0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        return new FilteringSequence(sequence0, true, function10);
    }

    @NotNull
    public static final Sequence filterIndexed(@NotNull Sequence sequence0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(function20, "predicate");
        return new TransformingSequence(new FilteringSequence(new IndexingSequence(sequence0), true, new k1(function20, 2)), g.B);
    }

    @NotNull
    public static final Collection filterIndexedTo(@NotNull Sequence sequence0, @NotNull Collection collection0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function20, "predicate");
        int v = 0;
        for(Object object0: sequence0) {
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

    public static final Sequence filterIsInstance(Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.needClassReification();
        Sequence sequence1 = SequencesKt___SequencesKt.filter(sequence0, kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance.1.INSTANCE);
        Intrinsics.checkNotNull(sequence1, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        return sequence1;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "R", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 0xB0)
        @SourceDebugExtension({"SMAP\n_Sequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt$filterIsInstance$1\n*L\n1#1,3112:1\n*E\n"})
        public final class kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance.1 extends Lambda implements Function1 {
            public static final kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance.1 INSTANCE;

            static {
                kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance.1.INSTANCE = new kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance.1();
            }

            public kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance.1() {
                super(1);
            }

            @NotNull
            public final Boolean invoke(@Nullable Object object0) {
                Intrinsics.reifiedOperationMarker(3, "R");
                return Boolean.valueOf(Objects.nonNull(object0));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(object0);
            }
        }

    }

    public static final Collection filterIsInstanceTo(Sequence sequence0, Collection collection0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        for(Object object0: sequence0) {
            Intrinsics.reifiedOperationMarker(3, "R");
            if(object0 != null) {
                collection0.add(object0);
            }
        }
        return collection0;
    }

    @NotNull
    public static Sequence filterNot(@NotNull Sequence sequence0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        return new FilteringSequence(sequence0, false, function10);
    }

    @NotNull
    public static Sequence filterNotNull(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Sequence sequence1 = SequencesKt___SequencesKt.filterNot(sequence0, g.C);
        Intrinsics.checkNotNull(sequence1, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return sequence1;
    }

    @NotNull
    public static final Collection filterNotNullTo(@NotNull Sequence sequence0, @NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        for(Object object0: sequence0) {
            if(object0 != null) {
                collection0.add(object0);
            }
        }
        return collection0;
    }

    @NotNull
    public static final Collection filterNotTo(@NotNull Sequence sequence0, @NotNull Collection collection0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(Object object0: sequence0) {
            if(!((Boolean)function10.invoke(object0)).booleanValue()) {
                collection0.add(object0);
            }
        }
        return collection0;
    }

    @NotNull
    public static final Collection filterTo(@NotNull Sequence sequence0, @NotNull Collection collection0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(Object object0: sequence0) {
            if(((Boolean)function10.invoke(object0)).booleanValue()) {
                collection0.add(object0);
            }
        }
        return collection0;
    }

    public static final Object first(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Iterator iterator0 = sequence0.iterator();
        if(!iterator0.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        return iterator0.next();
    }

    public static final Object first(@NotNull Sequence sequence0, @NotNull Function1 function10) {
        Iterator iterator0 = a.o(sequence0, "<this>", function10, "predicate");
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            if(((Boolean)function10.invoke(object0)).booleanValue()) {
                return object0;
            }
            if(false) {
                break;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    @Nullable
    public static Object firstOrNull(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Iterator iterator0 = sequence0.iterator();
        return !iterator0.hasNext() ? null : iterator0.next();
    }

    @Nullable
    public static final Object firstOrNull(@NotNull Sequence sequence0, @NotNull Function1 function10) {
        Iterator iterator0 = a.o(sequence0, "<this>", function10, "predicate");
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

    @NotNull
    public static Sequence flatMap(@NotNull Sequence sequence0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "transform");
        return new FlatteningSequence(sequence0, function10, l.a);
    }

    @OverloadResolutionByLambdaReturnType
    @SinceKotlin(version = "1.4")
    @JvmName(name = "flatMapIndexedIterable")
    @NotNull
    public static final Sequence flatMapIndexedIterable(@NotNull Sequence sequence0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(function20, "transform");
        return SequencesKt__SequencesKt.flatMapIndexed(sequence0, function20, m.a);
    }

    @OverloadResolutionByLambdaReturnType
    @SinceKotlin(version = "1.4")
    @JvmName(name = "flatMapIndexedSequence")
    @NotNull
    public static final Sequence flatMapIndexedSequence(@NotNull Sequence sequence0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(function20, "transform");
        return SequencesKt__SequencesKt.flatMapIndexed(sequence0, function20, n.a);
    }

    @OverloadResolutionByLambdaReturnType
    @SinceKotlin(version = "1.4")
    @JvmName(name = "flatMapIterable")
    @NotNull
    public static Sequence flatMapIterable(@NotNull Sequence sequence0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "transform");
        return new FlatteningSequence(sequence0, function10, k.a);
    }

    @OverloadResolutionByLambdaReturnType
    @SinceKotlin(version = "1.4")
    @JvmName(name = "flatMapIterableTo")
    @NotNull
    public static final Collection flatMapIterableTo(@NotNull Sequence sequence0, @NotNull Collection collection0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function10, "transform");
        for(Object object0: sequence0) {
            o.addAll(collection0, ((Iterable)function10.invoke(object0)));
        }
        return collection0;
    }

    @NotNull
    public static final Collection flatMapTo(@NotNull Sequence sequence0, @NotNull Collection collection0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function10, "transform");
        for(Object object0: sequence0) {
            o.addAll(collection0, ((Sequence)function10.invoke(object0)));
        }
        return collection0;
    }

    public static final Object fold(@NotNull Sequence sequence0, Object object0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        for(Object object1: sequence0) {
            object0 = function20.invoke(object0, object1);
        }
        return object0;
    }

    public static final Object foldIndexed(@NotNull Sequence sequence0, Object object0, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        int v = 0;
        for(Object object1: sequence0) {
            if(v < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            object0 = function30.invoke(v, object0, object1);
            ++v;
        }
        return object0;
    }

    public static final void forEach(@NotNull Sequence sequence0, @NotNull Function1 function10) {
        Iterator iterator0 = a.o(sequence0, "<this>", function10, "action");
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            function10.invoke(object0);
        }
    }

    public static final void forEachIndexed(@NotNull Sequence sequence0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(function20, "action");
        int v = 0;
        for(Object object0: sequence0) {
            if(v < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            function20.invoke(v, object0);
            ++v;
        }
    }

    @NotNull
    public static final Map groupBy(@NotNull Sequence sequence0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Map map0 = new LinkedHashMap();
        for(Object object0: sequence0) {
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
    public static final Map groupBy(@NotNull Sequence sequence0, @NotNull Function1 function10, @NotNull Function1 function11) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Intrinsics.checkNotNullParameter(function11, "valueTransform");
        Map map0 = new LinkedHashMap();
        for(Object object0: sequence0) {
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
    public static final Map groupByTo(@NotNull Sequence sequence0, @NotNull Map map0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        for(Object object0: sequence0) {
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
    public static final Map groupByTo(@NotNull Sequence sequence0, @NotNull Map map0, @NotNull Function1 function10, @NotNull Function1 function11) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Intrinsics.checkNotNullParameter(function11, "valueTransform");
        for(Object object0: sequence0) {
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
    public static final Grouping groupingBy(@NotNull Sequence sequence0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        return new Grouping() {
            @Override  // kotlin.collections.Grouping
            public Object keyOf(Object object0) {
                return function10.invoke(object0);
            }

            @Override  // kotlin.collections.Grouping
            @NotNull
            public Iterator sourceIterator() {
                return sequence0.iterator();
            }
        };
    }

    public static final int indexOf(@NotNull Sequence sequence0, Object object0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        int v = 0;
        for(Object object1: sequence0) {
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

    public static final int indexOfFirst(@NotNull Sequence sequence0, @NotNull Function1 function10) {
        Iterator iterator0 = a.o(sequence0, "<this>", function10, "predicate");
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

    public static final int indexOfLast(@NotNull Sequence sequence0, @NotNull Function1 function10) {
        int v = -1;
        Iterator iterator0 = a.o(sequence0, "<this>", function10, "predicate");
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

    @NotNull
    public static final Appendable joinTo(@NotNull Sequence sequence0, @NotNull Appendable appendable0, @NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, @NotNull CharSequence charSequence2, int v, @NotNull CharSequence charSequence3, @Nullable Function1 function10) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(appendable0, "buffer");
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        Intrinsics.checkNotNullParameter(charSequence2, "postfix");
        Intrinsics.checkNotNullParameter(charSequence3, "truncated");
        appendable0.append(charSequence1);
        int v1 = 0;
        for(Object object0: sequence0) {
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

    public static Appendable joinTo$default(Sequence sequence0, Appendable appendable0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function1 function10, int v1, Object object0) {
        CharSequence charSequence4 = (v1 & 2) == 0 ? charSequence0 : ", ";
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (v1 & 4) == 0 ? charSequence1 : "";
        if((v1 & 8) == 0) {
            charSequence5 = charSequence2;
        }
        int v2 = (v1 & 16) == 0 ? v : -1;
        if((v1 & 0x20) != 0) {
            return (v1 & 0x40) == 0 ? SequencesKt___SequencesKt.joinTo(sequence0, appendable0, charSequence4, charSequence6, charSequence5, v2, "...", function10) : SequencesKt___SequencesKt.joinTo(sequence0, appendable0, charSequence4, charSequence6, charSequence5, v2, "...", null);
        }
        return (v1 & 0x40) == 0 ? SequencesKt___SequencesKt.joinTo(sequence0, appendable0, charSequence4, charSequence6, charSequence5, v2, charSequence3, function10) : SequencesKt___SequencesKt.joinTo(sequence0, appendable0, charSequence4, charSequence6, charSequence5, v2, charSequence3, null);
    }

    @NotNull
    public static final String joinToString(@NotNull Sequence sequence0, @NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, @NotNull CharSequence charSequence2, int v, @NotNull CharSequence charSequence3, @Nullable Function1 function10) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        Intrinsics.checkNotNullParameter(charSequence2, "postfix");
        Intrinsics.checkNotNullParameter(charSequence3, "truncated");
        String s = ((StringBuilder)SequencesKt___SequencesKt.joinTo(sequence0, new StringBuilder(), charSequence0, charSequence1, charSequence2, v, charSequence3, function10)).toString();
        Intrinsics.checkNotNullExpressionValue(s, "toString(...)");
        return s;
    }

    public static String joinToString$default(Sequence sequence0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function1 function10, int v1, Object object0) {
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
        return SequencesKt___SequencesKt.joinToString(sequence0, charSequence0, charSequence5, charSequence4, v, charSequence3, function10);
    }

    public static Object last(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Iterator iterator0 = sequence0.iterator();
        if(!iterator0.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object object0;
        for(object0 = iterator0.next(); iterator0.hasNext(); object0 = iterator0.next()) {
        }
        return object0;
    }

    public static final Object last(@NotNull Sequence sequence0, @NotNull Function1 function10) {
        Object object0 = null;
        boolean z = false;
        Iterator iterator0 = a.o(sequence0, "<this>", function10, "predicate");
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            if(((Boolean)function10.invoke(object1)).booleanValue()) {
                z = true;
                object0 = object1;
            }
        }
        if(!z) {
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
        return object0;
    }

    public static final int lastIndexOf(@NotNull Sequence sequence0, Object object0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        int v = -1;
        int v1 = 0;
        for(Object object1: sequence0) {
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

    @Nullable
    public static final Object lastOrNull(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Iterator iterator0 = sequence0.iterator();
        if(!iterator0.hasNext()) {
            return null;
        }
        Object object0;
        for(object0 = iterator0.next(); iterator0.hasNext(); object0 = iterator0.next()) {
        }
        return object0;
    }

    @Nullable
    public static final Object lastOrNull(@NotNull Sequence sequence0, @NotNull Function1 function10) {
        Object object0 = null;
        Iterator iterator0 = a.o(sequence0, "<this>", function10, "predicate");
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            if(((Boolean)function10.invoke(object1)).booleanValue()) {
                object0 = object1;
            }
        }
        return object0;
    }

    @NotNull
    public static Sequence map(@NotNull Sequence sequence0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "transform");
        return new TransformingSequence(sequence0, function10);
    }

    @NotNull
    public static final Sequence mapIndexed(@NotNull Sequence sequence0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(function20, "transform");
        return new TransformingIndexedSequence(sequence0, function20);
    }

    @NotNull
    public static final Sequence mapIndexedNotNull(@NotNull Sequence sequence0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(function20, "transform");
        return SequencesKt___SequencesKt.filterNotNull(new TransformingIndexedSequence(sequence0, function20));
    }

    @NotNull
    public static final Collection mapIndexedNotNullTo(@NotNull Sequence sequence0, @NotNull Collection collection0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function20, "transform");
        int v = 0;
        for(Object object0: sequence0) {
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
    public static final Collection mapIndexedTo(@NotNull Sequence sequence0, @NotNull Collection collection0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function20, "transform");
        int v = 0;
        for(Object object0: sequence0) {
            if(v < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            collection0.add(function20.invoke(v, object0));
            ++v;
        }
        return collection0;
    }

    @NotNull
    public static Sequence mapNotNull(@NotNull Sequence sequence0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "transform");
        return SequencesKt___SequencesKt.filterNotNull(new TransformingSequence(sequence0, function10));
    }

    @NotNull
    public static final Collection mapNotNullTo(@NotNull Sequence sequence0, @NotNull Collection collection0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function10, "transform");
        for(Object object0: sequence0) {
            Object object1 = function10.invoke(object0);
            if(object1 != null) {
                collection0.add(object1);
            }
        }
        return collection0;
    }

    @NotNull
    public static final Collection mapTo(@NotNull Sequence sequence0, @NotNull Collection collection0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function10, "transform");
        for(Object object0: sequence0) {
            collection0.add(function10.invoke(object0));
        }
        return collection0;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Object maxByOrNull(@NotNull Sequence sequence0, @NotNull Function1 function10) {
        Iterator iterator0 = a.o(sequence0, "<this>", function10, "selector");
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
    public static final Object maxByOrThrow(@NotNull Sequence sequence0, @NotNull Function1 function10) {
        Iterator iterator0 = a.o(sequence0, "<this>", function10, "selector");
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
    public static final Comparable maxOrNull(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Iterator iterator0 = sequence0.iterator();
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
    public static final Double maxOrNull(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Iterator iterator0 = sequence0.iterator();
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
    public static final Float maxOrNull(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Iterator iterator0 = sequence0.iterator();
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
    public static final double maxOrThrow(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Iterator iterator0 = sequence0.iterator();
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
    public static final float maxOrThrow(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Iterator iterator0 = sequence0.iterator();
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
    public static final Comparable maxOrThrow(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Iterator iterator0 = sequence0.iterator();
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
    public static final Object maxWithOrNull(@NotNull Sequence sequence0, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        Iterator iterator0 = sequence0.iterator();
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
    public static final Object maxWithOrThrow(@NotNull Sequence sequence0, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        Iterator iterator0 = sequence0.iterator();
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
    public static final Object minByOrNull(@NotNull Sequence sequence0, @NotNull Function1 function10) {
        Iterator iterator0 = a.o(sequence0, "<this>", function10, "selector");
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
    public static final Object minByOrThrow(@NotNull Sequence sequence0, @NotNull Function1 function10) {
        Iterator iterator0 = a.o(sequence0, "<this>", function10, "selector");
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
    public static final Comparable minOrNull(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Iterator iterator0 = sequence0.iterator();
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
    public static final Double minOrNull(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Iterator iterator0 = sequence0.iterator();
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
    public static final Float minOrNull(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Iterator iterator0 = sequence0.iterator();
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
    public static final double minOrThrow(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Iterator iterator0 = sequence0.iterator();
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
    public static final float minOrThrow(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Iterator iterator0 = sequence0.iterator();
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
    public static final Comparable minOrThrow(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Iterator iterator0 = sequence0.iterator();
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
    public static final Object minWithOrNull(@NotNull Sequence sequence0, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        Iterator iterator0 = sequence0.iterator();
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
    public static final Object minWithOrThrow(@NotNull Sequence sequence0, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        Iterator iterator0 = sequence0.iterator();
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
    public static final Sequence minus(@NotNull Sequence sequence0, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "elements");
        return new Sequence() {
            public final Iterable a;
            public final Sequence b;

            {
                Iterable iterable0 = iterable0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                Sequence sequence0 = sequence0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.a = iterable0;
                this.b = sequence0;
            }

            @Override  // kotlin.sequences.Sequence
            @NotNull
            public Iterator iterator() {
                Collection collection0 = o.convertToListIfNotCollection(this.a);
                return collection0.isEmpty() ? this.b.iterator() : SequencesKt___SequencesKt.filterNot(this.b, new androidx.fragment.app.l(collection0, 5)).iterator();
            }
        };
    }

    @NotNull
    public static final Sequence minus(@NotNull Sequence sequence0, Object object0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        return new Sequence() {
            public final Sequence a;
            public final Object b;

            {
                Sequence sequence0 = sequence0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                Object object0 = object0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.a = sequence0;
                this.b = object0;
            }

            @Override  // kotlin.sequences.Sequence
            @NotNull
            public Iterator iterator() {
                kf.o o0 = new kf.o(new BooleanRef(), this.b);
                return SequencesKt___SequencesKt.filter(this.a, o0).iterator();
            }
        };
    }

    @NotNull
    public static final Sequence minus(@NotNull Sequence sequence0, @NotNull Sequence sequence1) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(sequence1, "elements");
        return new Sequence() {
            public final Sequence a;
            public final Sequence b;

            {
                Sequence sequence0 = sequence1;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                Sequence sequence1 = sequence0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.a = sequence0;
                this.b = sequence1;
            }

            @Override  // kotlin.sequences.Sequence
            @NotNull
            public Iterator iterator() {
                List list0 = SequencesKt___SequencesKt.toList(this.a);
                return list0.isEmpty() ? this.b.iterator() : SequencesKt___SequencesKt.filterNot(this.b, new h8(list0, 3)).iterator();
            }
        };
    }

    @NotNull
    public static final Sequence minus(@NotNull Sequence sequence0, @NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(arr_object, "elements");
        return arr_object.length == 0 ? sequence0 : new Sequence() {
            public final Sequence a;
            public final Object[] b;

            {
                Sequence sequence0 = sequence0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                Object[] arr_object = arr_object;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.a = sequence0;
                this.b = arr_object;
            }

            @Override  // kotlin.sequences.Sequence
            @NotNull
            public Iterator iterator() {
                c c0 = new c(this.b, 20);
                return SequencesKt___SequencesKt.filterNot(this.a, c0).iterator();
            }
        };
    }

    public static final boolean none(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        return !sequence0.iterator().hasNext();
    }

    public static final boolean none(@NotNull Sequence sequence0, @NotNull Function1 function10) {
        Iterator iterator0 = a.o(sequence0, "<this>", function10, "predicate");
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
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
    public static final Sequence onEach(@NotNull Sequence sequence0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "action");
        return SequencesKt___SequencesKt.map(sequence0, new ti(function10, 10));
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final Sequence onEachIndexed(@NotNull Sequence sequence0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(function20, "action");
        return SequencesKt___SequencesKt.mapIndexed(sequence0, new ni(function20, 5));
    }

    @NotNull
    public static final Pair partition(@NotNull Sequence sequence0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        for(Object object0: sequence0) {
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
    public static Sequence plus(@NotNull Sequence sequence0, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "elements");
        return SequencesKt__SequencesKt.flatten(SequencesKt__SequencesKt.sequenceOf(new Sequence[]{sequence0, CollectionsKt___CollectionsKt.asSequence(iterable0)}));
    }

    @NotNull
    public static Sequence plus(@NotNull Sequence sequence0, Object object0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        return SequencesKt__SequencesKt.flatten(SequencesKt__SequencesKt.sequenceOf(new Sequence[]{sequence0, SequencesKt__SequencesKt.sequenceOf(new Object[]{object0})}));
    }

    @NotNull
    public static final Sequence plus(@NotNull Sequence sequence0, @NotNull Sequence sequence1) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(sequence1, "elements");
        return SequencesKt__SequencesKt.flatten(SequencesKt__SequencesKt.sequenceOf(new Sequence[]{sequence0, sequence1}));
    }

    @NotNull
    public static final Sequence plus(@NotNull Sequence sequence0, @NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(arr_object, "elements");
        return SequencesKt___SequencesKt.plus(sequence0, ArraysKt___ArraysJvmKt.asList(arr_object));
    }

    public static final Object reduce(@NotNull Sequence sequence0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        Iterator iterator0 = sequence0.iterator();
        if(!iterator0.hasNext()) {
            throw new UnsupportedOperationException("Empty sequence can\'t be reduced.");
        }
        Object object0;
        for(object0 = iterator0.next(); iterator0.hasNext(); object0 = function20.invoke(object0, object1)) {
            Object object1 = iterator0.next();
        }
        return object0;
    }

    public static final Object reduceIndexed(@NotNull Sequence sequence0, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        Iterator iterator0 = sequence0.iterator();
        if(!iterator0.hasNext()) {
            throw new UnsupportedOperationException("Empty sequence can\'t be reduced.");
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
    public static final Object reduceIndexedOrNull(@NotNull Sequence sequence0, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        Iterator iterator0 = sequence0.iterator();
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
    public static final Object reduceOrNull(@NotNull Sequence sequence0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        Iterator iterator0 = sequence0.iterator();
        if(!iterator0.hasNext()) {
            return null;
        }
        Object object0;
        for(object0 = iterator0.next(); iterator0.hasNext(); object0 = function20.invoke(object0, object1)) {
            Object object1 = iterator0.next();
        }
        return object0;
    }

    @NotNull
    public static final Sequence requireNoNulls(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        return SequencesKt___SequencesKt.map(sequence0, new c(sequence0, 21));
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final Sequence runningFold(@NotNull Sequence sequence0, Object object0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        return SequencesKt__SequenceBuilderKt.sequence(new p(object0, sequence0, function20, null));
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final Sequence runningFoldIndexed(@NotNull Sequence sequence0, Object object0, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        return SequencesKt__SequenceBuilderKt.sequence(new q(object0, sequence0, function30, null));
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static final Sequence runningReduce(@NotNull Sequence sequence0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        return SequencesKt__SequenceBuilderKt.sequence(new r(sequence0, function20, null));
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final Sequence runningReduceIndexed(@NotNull Sequence sequence0, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        return SequencesKt__SequenceBuilderKt.sequence(new s(sequence0, function30, null));
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static final Sequence scan(@NotNull Sequence sequence0, Object object0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        return SequencesKt___SequencesKt.runningFold(sequence0, object0, function20);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static final Sequence scanIndexed(@NotNull Sequence sequence0, Object object0, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        return SequencesKt___SequencesKt.runningFoldIndexed(sequence0, object0, function30);
    }

    public static final Object single(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Iterator iterator0 = sequence0.iterator();
        if(!iterator0.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object object0 = iterator0.next();
        if(iterator0.hasNext()) {
            throw new IllegalArgumentException("Sequence has more than one element.");
        }
        return object0;
    }

    public static final Object single(@NotNull Sequence sequence0, @NotNull Function1 function10) {
        Object object0 = null;
        boolean z = false;
        Iterator iterator0 = a.o(sequence0, "<this>", function10, "predicate");
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            if(((Boolean)function10.invoke(object1)).booleanValue()) {
                if(z) {
                    throw new IllegalArgumentException("Sequence contains more than one matching element.");
                }
                z = true;
                object0 = object1;
            }
        }
        if(!z) {
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
        return object0;
    }

    @Nullable
    public static final Object singleOrNull(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Iterator iterator0 = sequence0.iterator();
        if(!iterator0.hasNext()) {
            return null;
        }
        Object object0 = iterator0.next();
        return iterator0.hasNext() ? null : object0;
    }

    @Nullable
    public static final Object singleOrNull(@NotNull Sequence sequence0, @NotNull Function1 function10) {
        boolean z = false;
        Object object0 = null;
        Iterator iterator0 = a.o(sequence0, "<this>", function10, "predicate");
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

    @NotNull
    public static final Sequence sorted(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        return new Sequence() {
            public final Sequence a;

            {
                Sequence sequence0 = sequence0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.a = sequence0;
            }

            @Override  // kotlin.sequences.Sequence
            @NotNull
            public Iterator iterator() {
                List list0 = SequencesKt___SequencesKt.toMutableList(this.a);
                kotlin.collections.n.sort(list0);
                return list0.iterator();
            }
        };
    }

    @NotNull
    public static final Sequence sortedBy(@NotNull Sequence sequence0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        return SequencesKt___SequencesKt.sortedWith(sequence0, new ComparisonsKt__ComparisonsKt.compareBy.2(function10));
    }

    @NotNull
    public static final Sequence sortedByDescending(@NotNull Sequence sequence0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        return SequencesKt___SequencesKt.sortedWith(sequence0, new ComparisonsKt__ComparisonsKt.compareByDescending.1(function10));
    }

    @NotNull
    public static final Sequence sortedDescending(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        return SequencesKt___SequencesKt.sortedWith(sequence0, pd.c.reverseOrder());
    }

    @NotNull
    public static Sequence sortedWith(@NotNull Sequence sequence0, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        return new Sequence() {
            public final Sequence a;
            public final Comparator b;

            {
                Sequence sequence0 = sequence0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                Comparator comparator0 = comparator0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.a = sequence0;
                this.b = comparator0;
            }

            @Override  // kotlin.sequences.Sequence
            @NotNull
            public Iterator iterator() {
                List list0 = SequencesKt___SequencesKt.toMutableList(this.a);
                kotlin.collections.n.sortWith(list0, this.b);
                return list0.iterator();
            }
        };
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final int sumBy(@NotNull Sequence sequence0, @NotNull Function1 function10) {
        int v = 0;
        Iterator iterator0 = a.o(sequence0, "<this>", function10, "selector");
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            v += ((Number)function10.invoke(object0)).intValue();
        }
        return v;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final double sumByDouble(@NotNull Sequence sequence0, @NotNull Function1 function10) {
        double f = 0.0;
        Iterator iterator0 = a.o(sequence0, "<this>", function10, "selector");
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            f += ((Number)function10.invoke(object0)).doubleValue();
        }
        return f;
    }

    @JvmName(name = "sumOfByte")
    public static final int sumOfByte(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        int v = 0;
        for(Object object0: sequence0) {
            v += ((Number)object0).byteValue();
        }
        return v;
    }

    @JvmName(name = "sumOfDouble")
    public static final double sumOfDouble(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        double f = 0.0;
        for(Object object0: sequence0) {
            f += ((Number)object0).doubleValue();
        }
        return f;
    }

    @JvmName(name = "sumOfFloat")
    public static final float sumOfFloat(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        float f = 0.0f;
        for(Object object0: sequence0) {
            f += ((Number)object0).floatValue();
        }
        return f;
    }

    @JvmName(name = "sumOfInt")
    public static final int sumOfInt(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        int v = 0;
        for(Object object0: sequence0) {
            v += ((Number)object0).intValue();
        }
        return v;
    }

    @JvmName(name = "sumOfLong")
    public static final long sumOfLong(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        long v = 0L;
        for(Object object0: sequence0) {
            v += ((Number)object0).longValue();
        }
        return v;
    }

    @JvmName(name = "sumOfShort")
    public static final int sumOfShort(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        int v = 0;
        for(Object object0: sequence0) {
            v += ((Number)object0).shortValue();
        }
        return v;
    }

    @NotNull
    public static Sequence take(@NotNull Sequence sequence0, int v) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        if(v == 0) {
            return SequencesKt__SequencesKt.emptySequence();
        }
        return sequence0 instanceof DropTakeSequence ? ((DropTakeSequence)sequence0).take(v) : new TakeSequence(sequence0, v);
    }

    @NotNull
    public static Sequence takeWhile(@NotNull Sequence sequence0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        return new TakeWhileSequence(sequence0, function10);
    }

    @NotNull
    public static final Collection toCollection(@NotNull Sequence sequence0, @NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        for(Object object0: sequence0) {
            collection0.add(object0);
        }
        return collection0;
    }

    @NotNull
    public static final HashSet toHashSet(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        return (HashSet)SequencesKt___SequencesKt.toCollection(sequence0, new HashSet());
    }

    @NotNull
    public static List toList(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Iterator iterator0 = sequence0.iterator();
        if(!iterator0.hasNext()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        Object object0 = iterator0.next();
        if(!iterator0.hasNext()) {
            return kotlin.collections.k.listOf(object0);
        }
        List list0 = new ArrayList();
        ((ArrayList)list0).add(object0);
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            ((ArrayList)list0).add(object1);
        }
        return list0;
    }

    @NotNull
    public static List toMutableList(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        return (List)SequencesKt___SequencesKt.toCollection(sequence0, new ArrayList());
    }

    @NotNull
    public static final Set toMutableSet(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Set set0 = new LinkedHashSet();
        for(Object object0: sequence0) {
            ((AbstractCollection)set0).add(object0);
        }
        return set0;
    }

    @NotNull
    public static final Set toSet(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Iterator iterator0 = sequence0.iterator();
        if(!iterator0.hasNext()) {
            return f0.emptySet();
        }
        Object object0 = iterator0.next();
        if(!iterator0.hasNext()) {
            return e0.setOf(object0);
        }
        Set set0 = new LinkedHashSet();
        ((AbstractCollection)set0).add(object0);
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            ((AbstractCollection)set0).add(object1);
        }
        return set0;
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final Sequence windowed(@NotNull Sequence sequence0, int v, int v1, boolean z) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        return SlidingWindowKt.windowedSequence(sequence0, v, v1, z, false);
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final Sequence windowed(@NotNull Sequence sequence0, int v, int v1, boolean z, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "transform");
        return SequencesKt___SequencesKt.map(SlidingWindowKt.windowedSequence(sequence0, v, v1, z, true), function10);
    }

    public static Sequence windowed$default(Sequence sequence0, int v, int v1, boolean z, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v1 = 1;
        }
        if((v2 & 4) != 0) {
            z = false;
        }
        return SequencesKt___SequencesKt.windowed(sequence0, v, v1, z);
    }

    public static Sequence windowed$default(Sequence sequence0, int v, int v1, boolean z, Function1 function10, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v1 = 1;
        }
        if((v2 & 4) != 0) {
            z = false;
        }
        return SequencesKt___SequencesKt.windowed(sequence0, v, v1, z, function10);
    }

    @NotNull
    public static final Sequence withIndex(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        return new IndexingSequence(sequence0);
    }

    @NotNull
    public static final Sequence zip(@NotNull Sequence sequence0, @NotNull Sequence sequence1) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(sequence1, "other");
        return new MergingSequence(sequence0, sequence1, t.x);
    }

    @NotNull
    public static final Sequence zip(@NotNull Sequence sequence0, @NotNull Sequence sequence1, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(sequence1, "other");
        Intrinsics.checkNotNullParameter(function20, "transform");
        return new MergingSequence(sequence0, sequence1, function20);
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final Sequence zipWithNext(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        return SequencesKt___SequencesKt.zipWithNext(sequence0, t.y);
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final Sequence zipWithNext(@NotNull Sequence sequence0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(function20, "transform");
        return SequencesKt__SequenceBuilderKt.sequence(new u(sequence0, function20, null));
    }
}

