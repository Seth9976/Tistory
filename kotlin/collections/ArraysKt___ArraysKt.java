package kotlin.collections;

import androidx.room.a;
import j2.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
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
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.ArrayIteratorsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.text.i;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class ArraysKt___ArraysKt extends ArraysKt___ArraysJvmKt {
    public static final boolean all(@NotNull byte[] arr_b, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_b.length; ++v) {
            if(!((Boolean)function10.invoke(((byte)arr_b[v]))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean all(@NotNull char[] arr_c, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_c.length; ++v) {
            if(!((Boolean)function10.invoke(Character.valueOf(arr_c[v]))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean all(@NotNull double[] arr_f, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_f.length; ++v) {
            if(!((Boolean)function10.invoke(((double)arr_f[v]))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean all(@NotNull float[] arr_f, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_f.length; ++v) {
            if(!((Boolean)function10.invoke(((float)arr_f[v]))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean all(@NotNull int[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_v.length; ++v) {
            if(!((Boolean)function10.invoke(((int)arr_v[v]))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean all(@NotNull long[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_v.length; ++v) {
            if(!((Boolean)function10.invoke(((long)arr_v[v]))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean all(@NotNull Object[] arr_object, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_object.length; ++v) {
            if(!((Boolean)function10.invoke(arr_object[v])).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean all(@NotNull short[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_v.length; ++v) {
            if(!((Boolean)function10.invoke(((short)arr_v[v]))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean all(@NotNull boolean[] arr_z, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_z.length; ++v) {
            if(!((Boolean)function10.invoke(Boolean.valueOf(arr_z[v]))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean any(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        return arr_b.length == 0 ? 0 : 1;
    }

    public static final boolean any(@NotNull byte[] arr_b, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_b.length; ++v) {
            if(((Boolean)function10.invoke(((byte)arr_b[v]))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean any(@NotNull char[] arr_c) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        return arr_c.length == 0 ? 0 : 1;
    }

    public static final boolean any(@NotNull char[] arr_c, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_c.length; ++v) {
            if(((Boolean)function10.invoke(Character.valueOf(arr_c[v]))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean any(@NotNull double[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        return arr_f.length == 0 ? 0 : 1;
    }

    public static final boolean any(@NotNull double[] arr_f, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_f.length; ++v) {
            if(((Boolean)function10.invoke(((double)arr_f[v]))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean any(@NotNull float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        return arr_f.length == 0 ? 0 : 1;
    }

    public static final boolean any(@NotNull float[] arr_f, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_f.length; ++v) {
            if(((Boolean)function10.invoke(((float)arr_f[v]))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean any(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        return arr_v.length == 0 ? 0 : 1;
    }

    public static final boolean any(@NotNull int[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_v.length; ++v) {
            if(((Boolean)function10.invoke(((int)arr_v[v]))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean any(@NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        return arr_v.length == 0 ? 0 : 1;
    }

    public static final boolean any(@NotNull long[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_v.length; ++v) {
            if(((Boolean)function10.invoke(((long)arr_v[v]))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean any(@NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        return arr_object.length == 0 ? 0 : 1;
    }

    public static final boolean any(@NotNull Object[] arr_object, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_object.length; ++v) {
            if(((Boolean)function10.invoke(arr_object[v])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean any(@NotNull short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        return arr_v.length == 0 ? 0 : 1;
    }

    public static final boolean any(@NotNull short[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_v.length; ++v) {
            if(((Boolean)function10.invoke(((short)arr_v[v]))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean any(@NotNull boolean[] arr_z) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        return arr_z.length == 0 ? 0 : 1;
    }

    public static final boolean any(@NotNull boolean[] arr_z, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_z.length; ++v) {
            if(((Boolean)function10.invoke(Boolean.valueOf(arr_z[v]))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static Iterable asIterable(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        return arr_b.length == 0 ? CollectionsKt__CollectionsKt.emptyList() : new Object() {
            @Override
            @NotNull
            public Iterator iterator() {
                return ArrayIteratorsKt.iterator(arr_b);
            }
        };
    }

    @NotNull
    public static Iterable asIterable(@NotNull char[] arr_c) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        return arr_c.length == 0 ? CollectionsKt__CollectionsKt.emptyList() : new Object() {
            @Override
            @NotNull
            public Iterator iterator() {
                return ArrayIteratorsKt.iterator(arr_c);
            }
        };
    }

    @NotNull
    public static Iterable asIterable(@NotNull double[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        return arr_f.length == 0 ? CollectionsKt__CollectionsKt.emptyList() : new Object() {
            @Override
            @NotNull
            public Iterator iterator() {
                return ArrayIteratorsKt.iterator(arr_f);
            }
        };
    }

    @NotNull
    public static Iterable asIterable(@NotNull float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        return arr_f.length == 0 ? CollectionsKt__CollectionsKt.emptyList() : new Object() {
            @Override
            @NotNull
            public Iterator iterator() {
                return ArrayIteratorsKt.iterator(arr_f);
            }
        };
    }

    @NotNull
    public static Iterable asIterable(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        return arr_v.length == 0 ? CollectionsKt__CollectionsKt.emptyList() : new Object() {
            @Override
            @NotNull
            public Iterator iterator() {
                return ArrayIteratorsKt.iterator(arr_v);
            }
        };
    }

    @NotNull
    public static Iterable asIterable(@NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        return arr_v.length == 0 ? CollectionsKt__CollectionsKt.emptyList() : new Object() {
            @Override
            @NotNull
            public Iterator iterator() {
                return ArrayIteratorsKt.iterator(arr_v);
            }
        };
    }

    @NotNull
    public static Iterable asIterable(@NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        return arr_object.length == 0 ? CollectionsKt__CollectionsKt.emptyList() : new Object() {
            @Override
            @NotNull
            public Iterator iterator() {
                return ArrayIteratorKt.iterator(arr_object);
            }
        };
    }

    @NotNull
    public static Iterable asIterable(@NotNull short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        return arr_v.length == 0 ? CollectionsKt__CollectionsKt.emptyList() : new Object() {
            @Override
            @NotNull
            public Iterator iterator() {
                return ArrayIteratorsKt.iterator(arr_v);
            }
        };
    }

    @NotNull
    public static Iterable asIterable(@NotNull boolean[] arr_z) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        return arr_z.length == 0 ? CollectionsKt__CollectionsKt.emptyList() : new Object() {
            @Override
            @NotNull
            public Iterator iterator() {
                return ArrayIteratorsKt.iterator(arr_z);
            }
        };
    }

    @NotNull
    public static final Sequence asSequence(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        return arr_b.length == 0 ? SequencesKt__SequencesKt.emptySequence() : new Sequence() {
            @Override  // kotlin.sequences.Sequence
            @NotNull
            public Iterator iterator() {
                return ArrayIteratorsKt.iterator(arr_b);
            }
        };
    }

    @NotNull
    public static final Sequence asSequence(@NotNull char[] arr_c) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        return arr_c.length == 0 ? SequencesKt__SequencesKt.emptySequence() : new Sequence() {
            @Override  // kotlin.sequences.Sequence
            @NotNull
            public Iterator iterator() {
                return ArrayIteratorsKt.iterator(arr_c);
            }
        };
    }

    @NotNull
    public static final Sequence asSequence(@NotNull double[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        return arr_f.length == 0 ? SequencesKt__SequencesKt.emptySequence() : new Sequence() {
            @Override  // kotlin.sequences.Sequence
            @NotNull
            public Iterator iterator() {
                return ArrayIteratorsKt.iterator(arr_f);
            }
        };
    }

    @NotNull
    public static final Sequence asSequence(@NotNull float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        return arr_f.length == 0 ? SequencesKt__SequencesKt.emptySequence() : new Sequence() {
            @Override  // kotlin.sequences.Sequence
            @NotNull
            public Iterator iterator() {
                return ArrayIteratorsKt.iterator(arr_f);
            }
        };
    }

    @NotNull
    public static final Sequence asSequence(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        return arr_v.length == 0 ? SequencesKt__SequencesKt.emptySequence() : new Sequence() {
            @Override  // kotlin.sequences.Sequence
            @NotNull
            public Iterator iterator() {
                return ArrayIteratorsKt.iterator(arr_v);
            }
        };
    }

    @NotNull
    public static final Sequence asSequence(@NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        return arr_v.length == 0 ? SequencesKt__SequencesKt.emptySequence() : new Sequence() {
            @Override  // kotlin.sequences.Sequence
            @NotNull
            public Iterator iterator() {
                return ArrayIteratorsKt.iterator(arr_v);
            }
        };
    }

    @NotNull
    public static Sequence asSequence(@NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        return arr_object.length == 0 ? SequencesKt__SequencesKt.emptySequence() : new Sequence() {
            @Override  // kotlin.sequences.Sequence
            @NotNull
            public Iterator iterator() {
                return ArrayIteratorKt.iterator(arr_object);
            }
        };
    }

    @NotNull
    public static final Sequence asSequence(@NotNull short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        return arr_v.length == 0 ? SequencesKt__SequencesKt.emptySequence() : new Sequence() {
            @Override  // kotlin.sequences.Sequence
            @NotNull
            public Iterator iterator() {
                return ArrayIteratorsKt.iterator(arr_v);
            }
        };
    }

    @NotNull
    public static final Sequence asSequence(@NotNull boolean[] arr_z) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        return arr_z.length == 0 ? SequencesKt__SequencesKt.emptySequence() : new Sequence() {
            @Override  // kotlin.sequences.Sequence
            @NotNull
            public Iterator iterator() {
                return ArrayIteratorsKt.iterator(arr_z);
            }
        };
    }

    @NotNull
    public static final Map associate(@NotNull byte[] arr_b, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(function10, "transform");
        Map map0 = new LinkedHashMap(c.coerceAtLeast(w.mapCapacity(arr_b.length), 16));
        for(int v = 0; v < arr_b.length; ++v) {
            Pair pair0 = (Pair)function10.invoke(((byte)arr_b[v]));
            map0.put(pair0.getFirst(), pair0.getSecond());
        }
        return map0;
    }

    @NotNull
    public static final Map associate(@NotNull char[] arr_c, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(function10, "transform");
        Map map0 = new LinkedHashMap(c.coerceAtLeast(w.mapCapacity(arr_c.length), 16));
        for(int v = 0; v < arr_c.length; ++v) {
            Pair pair0 = (Pair)function10.invoke(Character.valueOf(arr_c[v]));
            map0.put(pair0.getFirst(), pair0.getSecond());
        }
        return map0;
    }

    @NotNull
    public static final Map associate(@NotNull double[] arr_f, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "transform");
        Map map0 = new LinkedHashMap(c.coerceAtLeast(w.mapCapacity(arr_f.length), 16));
        for(int v = 0; v < arr_f.length; ++v) {
            Pair pair0 = (Pair)function10.invoke(((double)arr_f[v]));
            map0.put(pair0.getFirst(), pair0.getSecond());
        }
        return map0;
    }

    @NotNull
    public static final Map associate(@NotNull float[] arr_f, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "transform");
        Map map0 = new LinkedHashMap(c.coerceAtLeast(w.mapCapacity(arr_f.length), 16));
        for(int v = 0; v < arr_f.length; ++v) {
            Pair pair0 = (Pair)function10.invoke(((float)arr_f[v]));
            map0.put(pair0.getFirst(), pair0.getSecond());
        }
        return map0;
    }

    @NotNull
    public static final Map associate(@NotNull int[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "transform");
        Map map0 = new LinkedHashMap(c.coerceAtLeast(w.mapCapacity(arr_v.length), 16));
        for(int v = 0; v < arr_v.length; ++v) {
            Pair pair0 = (Pair)function10.invoke(((int)arr_v[v]));
            map0.put(pair0.getFirst(), pair0.getSecond());
        }
        return map0;
    }

    @NotNull
    public static final Map associate(@NotNull long[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "transform");
        Map map0 = new LinkedHashMap(c.coerceAtLeast(w.mapCapacity(arr_v.length), 16));
        for(int v = 0; v < arr_v.length; ++v) {
            Pair pair0 = (Pair)function10.invoke(((long)arr_v[v]));
            map0.put(pair0.getFirst(), pair0.getSecond());
        }
        return map0;
    }

    @NotNull
    public static final Map associate(@NotNull Object[] arr_object, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(function10, "transform");
        Map map0 = new LinkedHashMap(c.coerceAtLeast(w.mapCapacity(arr_object.length), 16));
        for(int v = 0; v < arr_object.length; ++v) {
            Pair pair0 = (Pair)function10.invoke(arr_object[v]);
            map0.put(pair0.getFirst(), pair0.getSecond());
        }
        return map0;
    }

    @NotNull
    public static final Map associate(@NotNull short[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "transform");
        Map map0 = new LinkedHashMap(c.coerceAtLeast(w.mapCapacity(arr_v.length), 16));
        for(int v = 0; v < arr_v.length; ++v) {
            Pair pair0 = (Pair)function10.invoke(((short)arr_v[v]));
            map0.put(pair0.getFirst(), pair0.getSecond());
        }
        return map0;
    }

    @NotNull
    public static final Map associate(@NotNull boolean[] arr_z, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(function10, "transform");
        Map map0 = new LinkedHashMap(c.coerceAtLeast(w.mapCapacity(arr_z.length), 16));
        for(int v = 0; v < arr_z.length; ++v) {
            Pair pair0 = (Pair)function10.invoke(Boolean.valueOf(arr_z[v]));
            map0.put(pair0.getFirst(), pair0.getSecond());
        }
        return map0;
    }

    @NotNull
    public static final Map associateBy(@NotNull byte[] arr_b, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Map map0 = new LinkedHashMap(c.coerceAtLeast(w.mapCapacity(arr_b.length), 16));
        for(int v = 0; v < arr_b.length; ++v) {
            int v1 = arr_b[v];
            map0.put(function10.invoke(((byte)v1)), ((byte)v1));
        }
        return map0;
    }

    @NotNull
    public static final Map associateBy(@NotNull byte[] arr_b, @NotNull Function1 function10, @NotNull Function1 function11) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Intrinsics.checkNotNullParameter(function11, "valueTransform");
        Map map0 = new LinkedHashMap(c.coerceAtLeast(w.mapCapacity(arr_b.length), 16));
        for(int v = 0; v < arr_b.length; ++v) {
            int v1 = arr_b[v];
            map0.put(function10.invoke(((byte)v1)), function11.invoke(((byte)v1)));
        }
        return map0;
    }

    @NotNull
    public static final Map associateBy(@NotNull char[] arr_c, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Map map0 = new LinkedHashMap(c.coerceAtLeast(w.mapCapacity(arr_c.length), 16));
        for(int v = 0; v < arr_c.length; ++v) {
            int v1 = arr_c[v];
            map0.put(function10.invoke(Character.valueOf(((char)v1))), Character.valueOf(((char)v1)));
        }
        return map0;
    }

    @NotNull
    public static final Map associateBy(@NotNull char[] arr_c, @NotNull Function1 function10, @NotNull Function1 function11) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Intrinsics.checkNotNullParameter(function11, "valueTransform");
        Map map0 = new LinkedHashMap(c.coerceAtLeast(w.mapCapacity(arr_c.length), 16));
        for(int v = 0; v < arr_c.length; ++v) {
            int v1 = arr_c[v];
            map0.put(function10.invoke(Character.valueOf(((char)v1))), function11.invoke(Character.valueOf(((char)v1))));
        }
        return map0;
    }

    @NotNull
    public static final Map associateBy(@NotNull double[] arr_f, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Map map0 = new LinkedHashMap(c.coerceAtLeast(w.mapCapacity(arr_f.length), 16));
        for(int v = 0; v < arr_f.length; ++v) {
            double f = arr_f[v];
            map0.put(function10.invoke(f), f);
        }
        return map0;
    }

    @NotNull
    public static final Map associateBy(@NotNull double[] arr_f, @NotNull Function1 function10, @NotNull Function1 function11) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Intrinsics.checkNotNullParameter(function11, "valueTransform");
        Map map0 = new LinkedHashMap(c.coerceAtLeast(w.mapCapacity(arr_f.length), 16));
        for(int v = 0; v < arr_f.length; ++v) {
            double f = arr_f[v];
            map0.put(function10.invoke(f), function11.invoke(f));
        }
        return map0;
    }

    @NotNull
    public static final Map associateBy(@NotNull float[] arr_f, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Map map0 = new LinkedHashMap(c.coerceAtLeast(w.mapCapacity(arr_f.length), 16));
        for(int v = 0; v < arr_f.length; ++v) {
            float f = arr_f[v];
            map0.put(function10.invoke(f), f);
        }
        return map0;
    }

    @NotNull
    public static final Map associateBy(@NotNull float[] arr_f, @NotNull Function1 function10, @NotNull Function1 function11) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Intrinsics.checkNotNullParameter(function11, "valueTransform");
        Map map0 = new LinkedHashMap(c.coerceAtLeast(w.mapCapacity(arr_f.length), 16));
        for(int v = 0; v < arr_f.length; ++v) {
            float f = arr_f[v];
            map0.put(function10.invoke(f), function11.invoke(f));
        }
        return map0;
    }

    @NotNull
    public static final Map associateBy(@NotNull int[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Map map0 = new LinkedHashMap(c.coerceAtLeast(w.mapCapacity(arr_v.length), 16));
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            map0.put(function10.invoke(v1), v1);
        }
        return map0;
    }

    @NotNull
    public static final Map associateBy(@NotNull int[] arr_v, @NotNull Function1 function10, @NotNull Function1 function11) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Intrinsics.checkNotNullParameter(function11, "valueTransform");
        Map map0 = new LinkedHashMap(c.coerceAtLeast(w.mapCapacity(arr_v.length), 16));
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            map0.put(function10.invoke(v1), function11.invoke(v1));
        }
        return map0;
    }

    @NotNull
    public static final Map associateBy(@NotNull long[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Map map0 = new LinkedHashMap(c.coerceAtLeast(w.mapCapacity(arr_v.length), 16));
        for(int v = 0; v < arr_v.length; ++v) {
            long v1 = arr_v[v];
            map0.put(function10.invoke(v1), v1);
        }
        return map0;
    }

    @NotNull
    public static final Map associateBy(@NotNull long[] arr_v, @NotNull Function1 function10, @NotNull Function1 function11) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Intrinsics.checkNotNullParameter(function11, "valueTransform");
        Map map0 = new LinkedHashMap(c.coerceAtLeast(w.mapCapacity(arr_v.length), 16));
        for(int v = 0; v < arr_v.length; ++v) {
            long v1 = arr_v[v];
            map0.put(function10.invoke(v1), function11.invoke(v1));
        }
        return map0;
    }

    @NotNull
    public static final Map associateBy(@NotNull Object[] arr_object, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Map map0 = new LinkedHashMap(c.coerceAtLeast(w.mapCapacity(arr_object.length), 16));
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            map0.put(function10.invoke(object0), object0);
        }
        return map0;
    }

    @NotNull
    public static final Map associateBy(@NotNull Object[] arr_object, @NotNull Function1 function10, @NotNull Function1 function11) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Intrinsics.checkNotNullParameter(function11, "valueTransform");
        Map map0 = new LinkedHashMap(c.coerceAtLeast(w.mapCapacity(arr_object.length), 16));
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            map0.put(function10.invoke(object0), function11.invoke(object0));
        }
        return map0;
    }

    @NotNull
    public static final Map associateBy(@NotNull short[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Map map0 = new LinkedHashMap(c.coerceAtLeast(w.mapCapacity(arr_v.length), 16));
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            map0.put(function10.invoke(((short)v1)), ((short)v1));
        }
        return map0;
    }

    @NotNull
    public static final Map associateBy(@NotNull short[] arr_v, @NotNull Function1 function10, @NotNull Function1 function11) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Intrinsics.checkNotNullParameter(function11, "valueTransform");
        Map map0 = new LinkedHashMap(c.coerceAtLeast(w.mapCapacity(arr_v.length), 16));
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            map0.put(function10.invoke(((short)v1)), function11.invoke(((short)v1)));
        }
        return map0;
    }

    @NotNull
    public static final Map associateBy(@NotNull boolean[] arr_z, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Map map0 = new LinkedHashMap(c.coerceAtLeast(w.mapCapacity(arr_z.length), 16));
        for(int v = 0; v < arr_z.length; ++v) {
            boolean z = arr_z[v];
            map0.put(function10.invoke(Boolean.valueOf(z)), Boolean.valueOf(z));
        }
        return map0;
    }

    @NotNull
    public static final Map associateBy(@NotNull boolean[] arr_z, @NotNull Function1 function10, @NotNull Function1 function11) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Intrinsics.checkNotNullParameter(function11, "valueTransform");
        Map map0 = new LinkedHashMap(c.coerceAtLeast(w.mapCapacity(arr_z.length), 16));
        for(int v = 0; v < arr_z.length; ++v) {
            boolean z = arr_z[v];
            map0.put(function10.invoke(Boolean.valueOf(z)), function11.invoke(Boolean.valueOf(z)));
        }
        return map0;
    }

    @NotNull
    public static final Map associateByTo(@NotNull byte[] arr_b, @NotNull Map map0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        for(int v = 0; v < arr_b.length; ++v) {
            int v1 = arr_b[v];
            map0.put(function10.invoke(((byte)v1)), ((byte)v1));
        }
        return map0;
    }

    @NotNull
    public static final Map associateByTo(@NotNull byte[] arr_b, @NotNull Map map0, @NotNull Function1 function10, @NotNull Function1 function11) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Intrinsics.checkNotNullParameter(function11, "valueTransform");
        for(int v = 0; v < arr_b.length; ++v) {
            int v1 = arr_b[v];
            map0.put(function10.invoke(((byte)v1)), function11.invoke(((byte)v1)));
        }
        return map0;
    }

    @NotNull
    public static final Map associateByTo(@NotNull char[] arr_c, @NotNull Map map0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        for(int v = 0; v < arr_c.length; ++v) {
            int v1 = arr_c[v];
            map0.put(function10.invoke(Character.valueOf(((char)v1))), Character.valueOf(((char)v1)));
        }
        return map0;
    }

    @NotNull
    public static final Map associateByTo(@NotNull char[] arr_c, @NotNull Map map0, @NotNull Function1 function10, @NotNull Function1 function11) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Intrinsics.checkNotNullParameter(function11, "valueTransform");
        for(int v = 0; v < arr_c.length; ++v) {
            int v1 = arr_c[v];
            map0.put(function10.invoke(Character.valueOf(((char)v1))), function11.invoke(Character.valueOf(((char)v1))));
        }
        return map0;
    }

    @NotNull
    public static final Map associateByTo(@NotNull double[] arr_f, @NotNull Map map0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        for(int v = 0; v < arr_f.length; ++v) {
            double f = arr_f[v];
            map0.put(function10.invoke(f), f);
        }
        return map0;
    }

    @NotNull
    public static final Map associateByTo(@NotNull double[] arr_f, @NotNull Map map0, @NotNull Function1 function10, @NotNull Function1 function11) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Intrinsics.checkNotNullParameter(function11, "valueTransform");
        for(int v = 0; v < arr_f.length; ++v) {
            double f = arr_f[v];
            map0.put(function10.invoke(f), function11.invoke(f));
        }
        return map0;
    }

    @NotNull
    public static final Map associateByTo(@NotNull float[] arr_f, @NotNull Map map0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        for(int v = 0; v < arr_f.length; ++v) {
            float f = arr_f[v];
            map0.put(function10.invoke(f), f);
        }
        return map0;
    }

    @NotNull
    public static final Map associateByTo(@NotNull float[] arr_f, @NotNull Map map0, @NotNull Function1 function10, @NotNull Function1 function11) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Intrinsics.checkNotNullParameter(function11, "valueTransform");
        for(int v = 0; v < arr_f.length; ++v) {
            float f = arr_f[v];
            map0.put(function10.invoke(f), function11.invoke(f));
        }
        return map0;
    }

    @NotNull
    public static final Map associateByTo(@NotNull int[] arr_v, @NotNull Map map0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            map0.put(function10.invoke(v1), v1);
        }
        return map0;
    }

    @NotNull
    public static final Map associateByTo(@NotNull int[] arr_v, @NotNull Map map0, @NotNull Function1 function10, @NotNull Function1 function11) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Intrinsics.checkNotNullParameter(function11, "valueTransform");
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            map0.put(function10.invoke(v1), function11.invoke(v1));
        }
        return map0;
    }

    @NotNull
    public static final Map associateByTo(@NotNull long[] arr_v, @NotNull Map map0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        for(int v = 0; v < arr_v.length; ++v) {
            long v1 = arr_v[v];
            map0.put(function10.invoke(v1), v1);
        }
        return map0;
    }

    @NotNull
    public static final Map associateByTo(@NotNull long[] arr_v, @NotNull Map map0, @NotNull Function1 function10, @NotNull Function1 function11) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Intrinsics.checkNotNullParameter(function11, "valueTransform");
        for(int v = 0; v < arr_v.length; ++v) {
            long v1 = arr_v[v];
            map0.put(function10.invoke(v1), function11.invoke(v1));
        }
        return map0;
    }

    @NotNull
    public static final Map associateByTo(@NotNull Object[] arr_object, @NotNull Map map0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            map0.put(function10.invoke(object0), object0);
        }
        return map0;
    }

    @NotNull
    public static final Map associateByTo(@NotNull Object[] arr_object, @NotNull Map map0, @NotNull Function1 function10, @NotNull Function1 function11) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Intrinsics.checkNotNullParameter(function11, "valueTransform");
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            map0.put(function10.invoke(object0), function11.invoke(object0));
        }
        return map0;
    }

    @NotNull
    public static final Map associateByTo(@NotNull short[] arr_v, @NotNull Map map0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            map0.put(function10.invoke(((short)v1)), ((short)v1));
        }
        return map0;
    }

    @NotNull
    public static final Map associateByTo(@NotNull short[] arr_v, @NotNull Map map0, @NotNull Function1 function10, @NotNull Function1 function11) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Intrinsics.checkNotNullParameter(function11, "valueTransform");
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            map0.put(function10.invoke(((short)v1)), function11.invoke(((short)v1)));
        }
        return map0;
    }

    @NotNull
    public static final Map associateByTo(@NotNull boolean[] arr_z, @NotNull Map map0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        for(int v = 0; v < arr_z.length; ++v) {
            boolean z = arr_z[v];
            map0.put(function10.invoke(Boolean.valueOf(z)), Boolean.valueOf(z));
        }
        return map0;
    }

    @NotNull
    public static final Map associateByTo(@NotNull boolean[] arr_z, @NotNull Map map0, @NotNull Function1 function10, @NotNull Function1 function11) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Intrinsics.checkNotNullParameter(function11, "valueTransform");
        for(int v = 0; v < arr_z.length; ++v) {
            boolean z = arr_z[v];
            map0.put(function10.invoke(Boolean.valueOf(z)), function11.invoke(Boolean.valueOf(z)));
        }
        return map0;
    }

    @NotNull
    public static final Map associateTo(@NotNull byte[] arr_b, @NotNull Map map0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Intrinsics.checkNotNullParameter(function10, "transform");
        for(int v = 0; v < arr_b.length; ++v) {
            Pair pair0 = (Pair)function10.invoke(((byte)arr_b[v]));
            map0.put(pair0.getFirst(), pair0.getSecond());
        }
        return map0;
    }

    @NotNull
    public static final Map associateTo(@NotNull char[] arr_c, @NotNull Map map0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Intrinsics.checkNotNullParameter(function10, "transform");
        for(int v = 0; v < arr_c.length; ++v) {
            Pair pair0 = (Pair)function10.invoke(Character.valueOf(arr_c[v]));
            map0.put(pair0.getFirst(), pair0.getSecond());
        }
        return map0;
    }

    @NotNull
    public static final Map associateTo(@NotNull double[] arr_f, @NotNull Map map0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Intrinsics.checkNotNullParameter(function10, "transform");
        for(int v = 0; v < arr_f.length; ++v) {
            Pair pair0 = (Pair)function10.invoke(((double)arr_f[v]));
            map0.put(pair0.getFirst(), pair0.getSecond());
        }
        return map0;
    }

    @NotNull
    public static final Map associateTo(@NotNull float[] arr_f, @NotNull Map map0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Intrinsics.checkNotNullParameter(function10, "transform");
        for(int v = 0; v < arr_f.length; ++v) {
            Pair pair0 = (Pair)function10.invoke(((float)arr_f[v]));
            map0.put(pair0.getFirst(), pair0.getSecond());
        }
        return map0;
    }

    @NotNull
    public static final Map associateTo(@NotNull int[] arr_v, @NotNull Map map0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Intrinsics.checkNotNullParameter(function10, "transform");
        for(int v = 0; v < arr_v.length; ++v) {
            Pair pair0 = (Pair)function10.invoke(((int)arr_v[v]));
            map0.put(pair0.getFirst(), pair0.getSecond());
        }
        return map0;
    }

    @NotNull
    public static final Map associateTo(@NotNull long[] arr_v, @NotNull Map map0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Intrinsics.checkNotNullParameter(function10, "transform");
        for(int v = 0; v < arr_v.length; ++v) {
            Pair pair0 = (Pair)function10.invoke(((long)arr_v[v]));
            map0.put(pair0.getFirst(), pair0.getSecond());
        }
        return map0;
    }

    @NotNull
    public static final Map associateTo(@NotNull Object[] arr_object, @NotNull Map map0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Intrinsics.checkNotNullParameter(function10, "transform");
        for(int v = 0; v < arr_object.length; ++v) {
            Pair pair0 = (Pair)function10.invoke(arr_object[v]);
            map0.put(pair0.getFirst(), pair0.getSecond());
        }
        return map0;
    }

    @NotNull
    public static final Map associateTo(@NotNull short[] arr_v, @NotNull Map map0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Intrinsics.checkNotNullParameter(function10, "transform");
        for(int v = 0; v < arr_v.length; ++v) {
            Pair pair0 = (Pair)function10.invoke(((short)arr_v[v]));
            map0.put(pair0.getFirst(), pair0.getSecond());
        }
        return map0;
    }

    @NotNull
    public static final Map associateTo(@NotNull boolean[] arr_z, @NotNull Map map0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Intrinsics.checkNotNullParameter(function10, "transform");
        for(int v = 0; v < arr_z.length; ++v) {
            Pair pair0 = (Pair)function10.invoke(Boolean.valueOf(arr_z[v]));
            map0.put(pair0.getFirst(), pair0.getSecond());
        }
        return map0;
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final Map associateWith(@NotNull Object[] arr_object, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(function10, "valueSelector");
        Map map0 = new LinkedHashMap(c.coerceAtLeast(w.mapCapacity(arr_object.length), 16));
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            map0.put(object0, function10.invoke(object0));
        }
        return map0;
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final Map associateWithTo(@NotNull Object[] arr_object, @NotNull Map map0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Intrinsics.checkNotNullParameter(function10, "valueSelector");
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            map0.put(object0, function10.invoke(object0));
        }
        return map0;
    }

    public static final double average(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        double f = 0.0;
        int v1 = 0;
        for(int v = 0; v < arr_b.length; ++v) {
            f += (double)arr_b[v];
            ++v1;
        }
        return v1 == 0 ? NaN : f / ((double)v1);
    }

    public static final double average(@NotNull double[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        double f = 0.0;
        int v1 = 0;
        for(int v = 0; v < arr_f.length; ++v) {
            f += arr_f[v];
            ++v1;
        }
        return v1 == 0 ? NaN : f / ((double)v1);
    }

    public static final double average(@NotNull float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        double f = 0.0;
        int v1 = 0;
        for(int v = 0; v < arr_f.length; ++v) {
            f += (double)arr_f[v];
            ++v1;
        }
        return v1 == 0 ? NaN : f / ((double)v1);
    }

    public static final double average(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        double f = 0.0;
        int v1 = 0;
        for(int v = 0; v < arr_v.length; ++v) {
            f += (double)arr_v[v];
            ++v1;
        }
        return v1 == 0 ? NaN : f / ((double)v1);
    }

    public static final double average(@NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        double f = 0.0;
        int v1 = 0;
        for(int v = 0; v < arr_v.length; ++v) {
            f += (double)arr_v[v];
            ++v1;
        }
        return v1 == 0 ? NaN : f / ((double)v1);
    }

    public static final double average(@NotNull short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        double f = 0.0;
        int v1 = 0;
        for(int v = 0; v < arr_v.length; ++v) {
            f += (double)arr_v[v];
            ++v1;
        }
        return v1 == 0 ? NaN : f / ((double)v1);
    }

    @JvmName(name = "averageOfByte")
    public static final double averageOfByte(@NotNull Byte[] arr_byte) {
        Intrinsics.checkNotNullParameter(arr_byte, "<this>");
        double f = 0.0;
        int v1 = 0;
        for(int v = 0; v < arr_byte.length; ++v) {
            f += (double)(((byte)arr_byte[v]));
            ++v1;
        }
        return v1 == 0 ? NaN : f / ((double)v1);
    }

    @JvmName(name = "averageOfDouble")
    public static final double averageOfDouble(@NotNull Double[] arr_double) {
        Intrinsics.checkNotNullParameter(arr_double, "<this>");
        double f = 0.0;
        int v1 = 0;
        for(int v = 0; v < arr_double.length; ++v) {
            f += (double)arr_double[v];
            ++v1;
        }
        return v1 == 0 ? NaN : f / ((double)v1);
    }

    @JvmName(name = "averageOfFloat")
    public static final double averageOfFloat(@NotNull Float[] arr_float) {
        Intrinsics.checkNotNullParameter(arr_float, "<this>");
        double f = 0.0;
        int v1 = 0;
        for(int v = 0; v < arr_float.length; ++v) {
            f += (double)(((float)arr_float[v]));
            ++v1;
        }
        return v1 == 0 ? NaN : f / ((double)v1);
    }

    @JvmName(name = "averageOfInt")
    public static final double averageOfInt(@NotNull Integer[] arr_integer) {
        Intrinsics.checkNotNullParameter(arr_integer, "<this>");
        double f = 0.0;
        int v1 = 0;
        for(int v = 0; v < arr_integer.length; ++v) {
            f += (double)(((int)arr_integer[v]));
            ++v1;
        }
        return v1 == 0 ? NaN : f / ((double)v1);
    }

    @JvmName(name = "averageOfLong")
    public static final double averageOfLong(@NotNull Long[] arr_long) {
        Intrinsics.checkNotNullParameter(arr_long, "<this>");
        double f = 0.0;
        int v1 = 0;
        for(int v = 0; v < arr_long.length; ++v) {
            f += (double)(((long)arr_long[v]));
            ++v1;
        }
        return v1 == 0 ? NaN : f / ((double)v1);
    }

    @JvmName(name = "averageOfShort")
    public static final double averageOfShort(@NotNull Short[] arr_short) {
        Intrinsics.checkNotNullParameter(arr_short, "<this>");
        double f = 0.0;
        int v1 = 0;
        for(int v = 0; v < arr_short.length; ++v) {
            f += (double)(((short)arr_short[v]));
            ++v1;
        }
        return v1 == 0 ? NaN : f / ((double)v1);
    }

    public static boolean contains(@NotNull byte[] arr_b, byte b) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        return ArraysKt___ArraysKt.indexOf(arr_b, b) >= 0;
    }

    public static boolean contains(@NotNull char[] arr_c, char c) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        return ArraysKt___ArraysKt.indexOf(arr_c, c) >= 0;
    }

    @Deprecated(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use \'any { it == element }\' instead to continue using this behavior, or \'.asList().contains(element: T)\' to get the same search behavior as in a list.", replaceWith = @ReplaceWith(expression = "any { it == element }", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    public static final boolean contains(double[] arr_f, double f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        for(int v = 0; v < arr_f.length; ++v) {
            if(arr_f[v] == f) {
                return true;
            }
        }
        return false;
    }

    @Deprecated(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use \'any { it == element }\' instead to continue using this behavior, or \'.asList().contains(element: T)\' to get the same search behavior as in a list.", replaceWith = @ReplaceWith(expression = "any { it == element }", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    public static final boolean contains(float[] arr_f, float f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        for(int v = 0; v < arr_f.length; ++v) {
            if(arr_f[v] == f) {
                return true;
            }
        }
        return false;
    }

    public static boolean contains(@NotNull int[] arr_v, int v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        return ArraysKt___ArraysKt.indexOf(arr_v, v) >= 0;
    }

    public static boolean contains(@NotNull long[] arr_v, long v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        return ArraysKt___ArraysKt.indexOf(arr_v, v) >= 0;
    }

    public static boolean contains(@NotNull Object[] arr_object, Object object0) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        return ArraysKt___ArraysKt.indexOf(arr_object, object0) >= 0;
    }

    public static boolean contains(@NotNull short[] arr_v, short v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        return ArraysKt___ArraysKt.indexOf(arr_v, v) >= 0;
    }

    public static final boolean contains(@NotNull boolean[] arr_z, boolean z) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        return ArraysKt___ArraysKt.indexOf(arr_z, z) >= 0;
    }

    public static final int count(@NotNull byte[] arr_b, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v1 = 0;
        for(int v = 0; v < arr_b.length; ++v) {
            if(((Boolean)function10.invoke(((byte)arr_b[v]))).booleanValue()) {
                ++v1;
            }
        }
        return v1;
    }

    public static final int count(@NotNull char[] arr_c, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v1 = 0;
        for(int v = 0; v < arr_c.length; ++v) {
            if(((Boolean)function10.invoke(Character.valueOf(arr_c[v]))).booleanValue()) {
                ++v1;
            }
        }
        return v1;
    }

    public static final int count(@NotNull double[] arr_f, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v1 = 0;
        for(int v = 0; v < arr_f.length; ++v) {
            if(((Boolean)function10.invoke(((double)arr_f[v]))).booleanValue()) {
                ++v1;
            }
        }
        return v1;
    }

    public static final int count(@NotNull float[] arr_f, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v1 = 0;
        for(int v = 0; v < arr_f.length; ++v) {
            if(((Boolean)function10.invoke(((float)arr_f[v]))).booleanValue()) {
                ++v1;
            }
        }
        return v1;
    }

    public static final int count(@NotNull int[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v1 = 0;
        for(int v = 0; v < arr_v.length; ++v) {
            if(((Boolean)function10.invoke(((int)arr_v[v]))).booleanValue()) {
                ++v1;
            }
        }
        return v1;
    }

    public static final int count(@NotNull long[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v1 = 0;
        for(int v = 0; v < arr_v.length; ++v) {
            if(((Boolean)function10.invoke(((long)arr_v[v]))).booleanValue()) {
                ++v1;
            }
        }
        return v1;
    }

    public static final int count(@NotNull Object[] arr_object, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v1 = 0;
        for(int v = 0; v < arr_object.length; ++v) {
            if(((Boolean)function10.invoke(arr_object[v])).booleanValue()) {
                ++v1;
            }
        }
        return v1;
    }

    public static final int count(@NotNull short[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v1 = 0;
        for(int v = 0; v < arr_v.length; ++v) {
            if(((Boolean)function10.invoke(((short)arr_v[v]))).booleanValue()) {
                ++v1;
            }
        }
        return v1;
    }

    public static final int count(@NotNull boolean[] arr_z, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v1 = 0;
        for(int v = 0; v < arr_z.length; ++v) {
            if(((Boolean)function10.invoke(Boolean.valueOf(arr_z[v]))).booleanValue()) {
                ++v1;
            }
        }
        return v1;
    }

    @NotNull
    public static final List distinct(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        return CollectionsKt___CollectionsKt.toList(ArraysKt___ArraysKt.toMutableSet(arr_b));
    }

    @NotNull
    public static final List distinct(@NotNull char[] arr_c) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        return CollectionsKt___CollectionsKt.toList(ArraysKt___ArraysKt.toMutableSet(arr_c));
    }

    @NotNull
    public static final List distinct(@NotNull double[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        return CollectionsKt___CollectionsKt.toList(ArraysKt___ArraysKt.toMutableSet(arr_f));
    }

    @NotNull
    public static final List distinct(@NotNull float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        return CollectionsKt___CollectionsKt.toList(ArraysKt___ArraysKt.toMutableSet(arr_f));
    }

    @NotNull
    public static List distinct(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        return CollectionsKt___CollectionsKt.toList(ArraysKt___ArraysKt.toMutableSet(arr_v));
    }

    @NotNull
    public static final List distinct(@NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        return CollectionsKt___CollectionsKt.toList(ArraysKt___ArraysKt.toMutableSet(arr_v));
    }

    @NotNull
    public static final List distinct(@NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        return CollectionsKt___CollectionsKt.toList(ArraysKt___ArraysKt.toMutableSet(arr_object));
    }

    @NotNull
    public static final List distinct(@NotNull short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        return CollectionsKt___CollectionsKt.toList(ArraysKt___ArraysKt.toMutableSet(arr_v));
    }

    @NotNull
    public static final List distinct(@NotNull boolean[] arr_z) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        return CollectionsKt___CollectionsKt.toList(ArraysKt___ArraysKt.toMutableSet(arr_z));
    }

    @NotNull
    public static final List distinctBy(@NotNull byte[] arr_b, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        HashSet hashSet0 = new HashSet();
        List list0 = new ArrayList();
        for(int v = 0; v < arr_b.length; ++v) {
            int v1 = arr_b[v];
            if(hashSet0.add(function10.invoke(((byte)v1)))) {
                ((ArrayList)list0).add(((byte)v1));
            }
        }
        return list0;
    }

    @NotNull
    public static final List distinctBy(@NotNull char[] arr_c, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        HashSet hashSet0 = new HashSet();
        List list0 = new ArrayList();
        for(int v = 0; v < arr_c.length; ++v) {
            int v1 = arr_c[v];
            if(hashSet0.add(function10.invoke(Character.valueOf(((char)v1))))) {
                ((ArrayList)list0).add(Character.valueOf(((char)v1)));
            }
        }
        return list0;
    }

    @NotNull
    public static final List distinctBy(@NotNull double[] arr_f, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        HashSet hashSet0 = new HashSet();
        List list0 = new ArrayList();
        for(int v = 0; v < arr_f.length; ++v) {
            double f = arr_f[v];
            if(hashSet0.add(function10.invoke(f))) {
                ((ArrayList)list0).add(f);
            }
        }
        return list0;
    }

    @NotNull
    public static final List distinctBy(@NotNull float[] arr_f, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        HashSet hashSet0 = new HashSet();
        List list0 = new ArrayList();
        for(int v = 0; v < arr_f.length; ++v) {
            float f = arr_f[v];
            if(hashSet0.add(function10.invoke(f))) {
                ((ArrayList)list0).add(f);
            }
        }
        return list0;
    }

    @NotNull
    public static final List distinctBy(@NotNull int[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        HashSet hashSet0 = new HashSet();
        List list0 = new ArrayList();
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            if(hashSet0.add(function10.invoke(v1))) {
                ((ArrayList)list0).add(v1);
            }
        }
        return list0;
    }

    @NotNull
    public static final List distinctBy(@NotNull long[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        HashSet hashSet0 = new HashSet();
        List list0 = new ArrayList();
        for(int v = 0; v < arr_v.length; ++v) {
            long v1 = arr_v[v];
            if(hashSet0.add(function10.invoke(v1))) {
                ((ArrayList)list0).add(v1);
            }
        }
        return list0;
    }

    @NotNull
    public static final List distinctBy(@NotNull Object[] arr_object, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        HashSet hashSet0 = new HashSet();
        List list0 = new ArrayList();
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            if(hashSet0.add(function10.invoke(object0))) {
                ((ArrayList)list0).add(object0);
            }
        }
        return list0;
    }

    @NotNull
    public static final List distinctBy(@NotNull short[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        HashSet hashSet0 = new HashSet();
        List list0 = new ArrayList();
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            if(hashSet0.add(function10.invoke(((short)v1)))) {
                ((ArrayList)list0).add(((short)v1));
            }
        }
        return list0;
    }

    @NotNull
    public static final List distinctBy(@NotNull boolean[] arr_z, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        HashSet hashSet0 = new HashSet();
        List list0 = new ArrayList();
        for(int v = 0; v < arr_z.length; ++v) {
            boolean z = arr_z[v];
            if(hashSet0.add(function10.invoke(Boolean.valueOf(z)))) {
                ((ArrayList)list0).add(Boolean.valueOf(z));
            }
        }
        return list0;
    }

    @NotNull
    public static final List drop(@NotNull byte[] arr_b, int v) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        return ArraysKt___ArraysKt.takeLast(arr_b, c.coerceAtLeast(arr_b.length - v, 0));
    }

    @NotNull
    public static final List drop(@NotNull char[] arr_c, int v) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        return ArraysKt___ArraysKt.takeLast(arr_c, c.coerceAtLeast(arr_c.length - v, 0));
    }

    @NotNull
    public static final List drop(@NotNull double[] arr_f, int v) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        return ArraysKt___ArraysKt.takeLast(arr_f, c.coerceAtLeast(arr_f.length - v, 0));
    }

    @NotNull
    public static final List drop(@NotNull float[] arr_f, int v) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        return ArraysKt___ArraysKt.takeLast(arr_f, c.coerceAtLeast(arr_f.length - v, 0));
    }

    @NotNull
    public static final List drop(@NotNull int[] arr_v, int v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        return ArraysKt___ArraysKt.takeLast(arr_v, c.coerceAtLeast(arr_v.length - v, 0));
    }

    @NotNull
    public static final List drop(@NotNull long[] arr_v, int v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        return ArraysKt___ArraysKt.takeLast(arr_v, c.coerceAtLeast(arr_v.length - v, 0));
    }

    @NotNull
    public static List drop(@NotNull Object[] arr_object, int v) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        return ArraysKt___ArraysKt.takeLast(arr_object, c.coerceAtLeast(arr_object.length - v, 0));
    }

    @NotNull
    public static final List drop(@NotNull short[] arr_v, int v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        return ArraysKt___ArraysKt.takeLast(arr_v, c.coerceAtLeast(arr_v.length - v, 0));
    }

    @NotNull
    public static final List drop(@NotNull boolean[] arr_z, int v) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(q.m(v, "Requested element count ", " is less than zero.").toString());
        }
        return ArraysKt___ArraysKt.takeLast(arr_z, c.coerceAtLeast(arr_z.length - v, 0));
    }

    @NotNull
    public static final List dropLast(@NotNull byte[] arr_b, int v) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        return ArraysKt___ArraysKt.take(arr_b, c.coerceAtLeast(arr_b.length - v, 0));
    }

    @NotNull
    public static final List dropLast(@NotNull char[] arr_c, int v) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(q.m(v, "Requested element count ", " is less than zero.").toString());
        }
        return ArraysKt___ArraysKt.take(arr_c, c.coerceAtLeast(arr_c.length - v, 0));
    }

    @NotNull
    public static final List dropLast(@NotNull double[] arr_f, int v) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(q.m(v, "Requested element count ", " is less than zero.").toString());
        }
        return ArraysKt___ArraysKt.take(arr_f, c.coerceAtLeast(arr_f.length - v, 0));
    }

    @NotNull
    public static final List dropLast(@NotNull float[] arr_f, int v) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        return ArraysKt___ArraysKt.take(arr_f, c.coerceAtLeast(arr_f.length - v, 0));
    }

    @NotNull
    public static final List dropLast(@NotNull int[] arr_v, int v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(q.m(v, "Requested element count ", " is less than zero.").toString());
        }
        return ArraysKt___ArraysKt.take(arr_v, c.coerceAtLeast(arr_v.length - v, 0));
    }

    @NotNull
    public static final List dropLast(@NotNull long[] arr_v, int v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        return ArraysKt___ArraysKt.take(arr_v, c.coerceAtLeast(arr_v.length - v, 0));
    }

    @NotNull
    public static final List dropLast(@NotNull Object[] arr_object, int v) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        return ArraysKt___ArraysKt.take(arr_object, c.coerceAtLeast(arr_object.length - v, 0));
    }

    @NotNull
    public static final List dropLast(@NotNull short[] arr_v, int v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        return ArraysKt___ArraysKt.take(arr_v, c.coerceAtLeast(arr_v.length - v, 0));
    }

    @NotNull
    public static final List dropLast(@NotNull boolean[] arr_z, int v) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(q.m(v, "Requested element count ", " is less than zero.").toString());
        }
        return ArraysKt___ArraysKt.take(arr_z, c.coerceAtLeast(arr_z.length - v, 0));
    }

    @NotNull
    public static final List dropLastWhile(@NotNull byte[] arr_b, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = ArraysKt___ArraysKt.getLastIndex(arr_b); -1 < v; --v) {
            if(!((Boolean)function10.invoke(((byte)arr_b[v]))).booleanValue()) {
                return ArraysKt___ArraysKt.take(arr_b, v + 1);
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @NotNull
    public static final List dropLastWhile(@NotNull char[] arr_c, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = ArraysKt___ArraysKt.getLastIndex(arr_c); -1 < v; --v) {
            if(!((Boolean)function10.invoke(Character.valueOf(arr_c[v]))).booleanValue()) {
                return ArraysKt___ArraysKt.take(arr_c, v + 1);
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @NotNull
    public static final List dropLastWhile(@NotNull double[] arr_f, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = ArraysKt___ArraysKt.getLastIndex(arr_f); -1 < v; --v) {
            if(!((Boolean)function10.invoke(((double)arr_f[v]))).booleanValue()) {
                return ArraysKt___ArraysKt.take(arr_f, v + 1);
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @NotNull
    public static final List dropLastWhile(@NotNull float[] arr_f, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = ArraysKt___ArraysKt.getLastIndex(arr_f); -1 < v; --v) {
            if(!((Boolean)function10.invoke(((float)arr_f[v]))).booleanValue()) {
                return ArraysKt___ArraysKt.take(arr_f, v + 1);
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @NotNull
    public static final List dropLastWhile(@NotNull int[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = ArraysKt___ArraysKt.getLastIndex(arr_v); -1 < v; --v) {
            if(!((Boolean)function10.invoke(((int)arr_v[v]))).booleanValue()) {
                return ArraysKt___ArraysKt.take(arr_v, v + 1);
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @NotNull
    public static final List dropLastWhile(@NotNull long[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = ArraysKt___ArraysKt.getLastIndex(arr_v); -1 < v; --v) {
            if(!((Boolean)function10.invoke(((long)arr_v[v]))).booleanValue()) {
                return ArraysKt___ArraysKt.take(arr_v, v + 1);
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @NotNull
    public static final List dropLastWhile(@NotNull Object[] arr_object, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = ArraysKt___ArraysKt.getLastIndex(arr_object); -1 < v; --v) {
            if(!((Boolean)function10.invoke(arr_object[v])).booleanValue()) {
                return ArraysKt___ArraysKt.take(arr_object, v + 1);
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @NotNull
    public static final List dropLastWhile(@NotNull short[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = ArraysKt___ArraysKt.getLastIndex(arr_v); -1 < v; --v) {
            if(!((Boolean)function10.invoke(((short)arr_v[v]))).booleanValue()) {
                return ArraysKt___ArraysKt.take(arr_v, v + 1);
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @NotNull
    public static final List dropLastWhile(@NotNull boolean[] arr_z, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = ArraysKt___ArraysKt.getLastIndex(arr_z); -1 < v; --v) {
            if(!((Boolean)function10.invoke(Boolean.valueOf(arr_z[v]))).booleanValue()) {
                return ArraysKt___ArraysKt.take(arr_z, v + 1);
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @NotNull
    public static final List dropWhile(@NotNull byte[] arr_b, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        List list0 = new ArrayList();
        boolean z = false;
        for(int v = 0; v < arr_b.length; ++v) {
            int v1 = arr_b[v];
            if(z) {
                ((ArrayList)list0).add(((byte)v1));
            }
            else if(!((Boolean)function10.invoke(((byte)v1))).booleanValue()) {
                ((ArrayList)list0).add(((byte)v1));
                z = true;
            }
        }
        return list0;
    }

    @NotNull
    public static final List dropWhile(@NotNull char[] arr_c, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        List list0 = new ArrayList();
        boolean z = false;
        for(int v = 0; v < arr_c.length; ++v) {
            int v1 = arr_c[v];
            if(z) {
                ((ArrayList)list0).add(Character.valueOf(((char)v1)));
            }
            else if(!((Boolean)function10.invoke(Character.valueOf(((char)v1)))).booleanValue()) {
                ((ArrayList)list0).add(Character.valueOf(((char)v1)));
                z = true;
            }
        }
        return list0;
    }

    @NotNull
    public static final List dropWhile(@NotNull double[] arr_f, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        List list0 = new ArrayList();
        boolean z = false;
        for(int v = 0; v < arr_f.length; ++v) {
            double f = arr_f[v];
            if(z) {
                ((ArrayList)list0).add(f);
            }
            else if(!((Boolean)function10.invoke(f)).booleanValue()) {
                ((ArrayList)list0).add(f);
                z = true;
            }
        }
        return list0;
    }

    @NotNull
    public static final List dropWhile(@NotNull float[] arr_f, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        List list0 = new ArrayList();
        boolean z = false;
        for(int v = 0; v < arr_f.length; ++v) {
            float f = arr_f[v];
            if(z) {
                ((ArrayList)list0).add(f);
            }
            else if(!((Boolean)function10.invoke(f)).booleanValue()) {
                ((ArrayList)list0).add(f);
                z = true;
            }
        }
        return list0;
    }

    @NotNull
    public static final List dropWhile(@NotNull int[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        List list0 = new ArrayList();
        boolean z = false;
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            if(z) {
                ((ArrayList)list0).add(v1);
            }
            else if(!((Boolean)function10.invoke(v1)).booleanValue()) {
                ((ArrayList)list0).add(v1);
                z = true;
            }
        }
        return list0;
    }

    @NotNull
    public static final List dropWhile(@NotNull long[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        List list0 = new ArrayList();
        boolean z = false;
        for(int v = 0; v < arr_v.length; ++v) {
            long v1 = arr_v[v];
            if(z) {
                ((ArrayList)list0).add(v1);
            }
            else if(!((Boolean)function10.invoke(v1)).booleanValue()) {
                ((ArrayList)list0).add(v1);
                z = true;
            }
        }
        return list0;
    }

    @NotNull
    public static final List dropWhile(@NotNull Object[] arr_object, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        List list0 = new ArrayList();
        boolean z = false;
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
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

    @NotNull
    public static final List dropWhile(@NotNull short[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        List list0 = new ArrayList();
        boolean z = false;
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            if(z) {
                ((ArrayList)list0).add(((short)v1));
            }
            else if(!((Boolean)function10.invoke(((short)v1))).booleanValue()) {
                ((ArrayList)list0).add(((short)v1));
                z = true;
            }
        }
        return list0;
    }

    @NotNull
    public static final List dropWhile(@NotNull boolean[] arr_z, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        List list0 = new ArrayList();
        boolean z = false;
        for(int v = 0; v < arr_z.length; ++v) {
            boolean z1 = arr_z[v];
            if(z) {
                ((ArrayList)list0).add(Boolean.valueOf(z1));
            }
            else if(!((Boolean)function10.invoke(Boolean.valueOf(z1))).booleanValue()) {
                ((ArrayList)list0).add(Boolean.valueOf(z1));
                z = true;
            }
        }
        return list0;
    }

    @NotNull
    public static final List filter(@NotNull byte[] arr_b, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_b.length; ++v) {
            int v1 = arr_b[v];
            if(((Boolean)function10.invoke(((byte)v1))).booleanValue()) {
                list0.add(((byte)v1));
            }
        }
        return list0;
    }

    @NotNull
    public static final List filter(@NotNull char[] arr_c, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_c.length; ++v) {
            int v1 = arr_c[v];
            if(((Boolean)function10.invoke(Character.valueOf(((char)v1)))).booleanValue()) {
                list0.add(Character.valueOf(((char)v1)));
            }
        }
        return list0;
    }

    @NotNull
    public static final List filter(@NotNull double[] arr_f, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_f.length; ++v) {
            double f = arr_f[v];
            if(((Boolean)function10.invoke(f)).booleanValue()) {
                list0.add(f);
            }
        }
        return list0;
    }

    @NotNull
    public static final List filter(@NotNull float[] arr_f, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_f.length; ++v) {
            float f = arr_f[v];
            if(((Boolean)function10.invoke(f)).booleanValue()) {
                list0.add(f);
            }
        }
        return list0;
    }

    @NotNull
    public static final List filter(@NotNull int[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            if(((Boolean)function10.invoke(v1)).booleanValue()) {
                list0.add(v1);
            }
        }
        return list0;
    }

    @NotNull
    public static final List filter(@NotNull long[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_v.length; ++v) {
            long v1 = arr_v[v];
            if(((Boolean)function10.invoke(v1)).booleanValue()) {
                list0.add(v1);
            }
        }
        return list0;
    }

    @NotNull
    public static final List filter(@NotNull Object[] arr_object, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            if(((Boolean)function10.invoke(object0)).booleanValue()) {
                list0.add(object0);
            }
        }
        return list0;
    }

    @NotNull
    public static final List filter(@NotNull short[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            if(((Boolean)function10.invoke(((short)v1))).booleanValue()) {
                list0.add(((short)v1));
            }
        }
        return list0;
    }

    @NotNull
    public static final List filter(@NotNull boolean[] arr_z, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_z.length; ++v) {
            boolean z = arr_z[v];
            if(((Boolean)function10.invoke(Boolean.valueOf(z))).booleanValue()) {
                list0.add(Boolean.valueOf(z));
            }
        }
        return list0;
    }

    @NotNull
    public static final List filterIndexed(@NotNull byte[] arr_b, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(function20, "predicate");
        List list0 = new ArrayList();
        int v = 0;
        for(int v1 = 0; v < arr_b.length; ++v1) {
            int v2 = arr_b[v];
            if(((Boolean)function20.invoke(v1, ((byte)v2))).booleanValue()) {
                list0.add(((byte)v2));
            }
            ++v;
        }
        return list0;
    }

    @NotNull
    public static final List filterIndexed(@NotNull char[] arr_c, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(function20, "predicate");
        List list0 = new ArrayList();
        int v = 0;
        for(int v1 = 0; v < arr_c.length; ++v1) {
            int v2 = arr_c[v];
            if(((Boolean)function20.invoke(v1, Character.valueOf(((char)v2)))).booleanValue()) {
                list0.add(Character.valueOf(((char)v2)));
            }
            ++v;
        }
        return list0;
    }

    @NotNull
    public static final List filterIndexed(@NotNull double[] arr_f, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function20, "predicate");
        List list0 = new ArrayList();
        int v = 0;
        for(int v1 = 0; v < arr_f.length; ++v1) {
            double f = arr_f[v];
            if(((Boolean)function20.invoke(v1, f)).booleanValue()) {
                list0.add(f);
            }
            ++v;
        }
        return list0;
    }

    @NotNull
    public static final List filterIndexed(@NotNull float[] arr_f, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function20, "predicate");
        List list0 = new ArrayList();
        int v = 0;
        for(int v1 = 0; v < arr_f.length; ++v1) {
            float f = arr_f[v];
            if(((Boolean)function20.invoke(v1, f)).booleanValue()) {
                list0.add(f);
            }
            ++v;
        }
        return list0;
    }

    @NotNull
    public static final List filterIndexed(@NotNull int[] arr_v, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function20, "predicate");
        List list0 = new ArrayList();
        int v = 0;
        for(int v1 = 0; v < arr_v.length; ++v1) {
            int v2 = arr_v[v];
            if(((Boolean)function20.invoke(v1, v2)).booleanValue()) {
                list0.add(v2);
            }
            ++v;
        }
        return list0;
    }

    @NotNull
    public static final List filterIndexed(@NotNull long[] arr_v, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function20, "predicate");
        List list0 = new ArrayList();
        int v = 0;
        for(int v1 = 0; v < arr_v.length; ++v1) {
            long v2 = arr_v[v];
            if(((Boolean)function20.invoke(v1, v2)).booleanValue()) {
                list0.add(v2);
            }
            ++v;
        }
        return list0;
    }

    @NotNull
    public static final List filterIndexed(@NotNull Object[] arr_object, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(function20, "predicate");
        List list0 = new ArrayList();
        int v = 0;
        for(int v1 = 0; v < arr_object.length; ++v1) {
            Object object0 = arr_object[v];
            if(((Boolean)function20.invoke(v1, object0)).booleanValue()) {
                list0.add(object0);
            }
            ++v;
        }
        return list0;
    }

    @NotNull
    public static final List filterIndexed(@NotNull short[] arr_v, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function20, "predicate");
        List list0 = new ArrayList();
        int v = 0;
        for(int v1 = 0; v < arr_v.length; ++v1) {
            int v2 = arr_v[v];
            if(((Boolean)function20.invoke(v1, ((short)v2))).booleanValue()) {
                list0.add(((short)v2));
            }
            ++v;
        }
        return list0;
    }

    @NotNull
    public static final List filterIndexed(@NotNull boolean[] arr_z, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(function20, "predicate");
        List list0 = new ArrayList();
        int v = 0;
        for(int v1 = 0; v < arr_z.length; ++v1) {
            boolean z = arr_z[v];
            if(((Boolean)function20.invoke(v1, Boolean.valueOf(z))).booleanValue()) {
                list0.add(Boolean.valueOf(z));
            }
            ++v;
        }
        return list0;
    }

    @NotNull
    public static final Collection filterIndexedTo(@NotNull byte[] arr_b, @NotNull Collection collection0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function20, "predicate");
        int v = 0;
        for(int v1 = 0; v < arr_b.length; ++v1) {
            int v2 = arr_b[v];
            if(((Boolean)function20.invoke(v1, ((byte)v2))).booleanValue()) {
                collection0.add(((byte)v2));
            }
            ++v;
        }
        return collection0;
    }

    @NotNull
    public static final Collection filterIndexedTo(@NotNull char[] arr_c, @NotNull Collection collection0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function20, "predicate");
        int v = 0;
        for(int v1 = 0; v < arr_c.length; ++v1) {
            int v2 = arr_c[v];
            if(((Boolean)function20.invoke(v1, Character.valueOf(((char)v2)))).booleanValue()) {
                collection0.add(Character.valueOf(((char)v2)));
            }
            ++v;
        }
        return collection0;
    }

    @NotNull
    public static final Collection filterIndexedTo(@NotNull double[] arr_f, @NotNull Collection collection0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function20, "predicate");
        int v = 0;
        for(int v1 = 0; v < arr_f.length; ++v1) {
            double f = arr_f[v];
            if(((Boolean)function20.invoke(v1, f)).booleanValue()) {
                collection0.add(f);
            }
            ++v;
        }
        return collection0;
    }

    @NotNull
    public static final Collection filterIndexedTo(@NotNull float[] arr_f, @NotNull Collection collection0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function20, "predicate");
        int v = 0;
        for(int v1 = 0; v < arr_f.length; ++v1) {
            float f = arr_f[v];
            if(((Boolean)function20.invoke(v1, f)).booleanValue()) {
                collection0.add(f);
            }
            ++v;
        }
        return collection0;
    }

    @NotNull
    public static final Collection filterIndexedTo(@NotNull int[] arr_v, @NotNull Collection collection0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function20, "predicate");
        int v = 0;
        for(int v1 = 0; v < arr_v.length; ++v1) {
            int v2 = arr_v[v];
            if(((Boolean)function20.invoke(v1, v2)).booleanValue()) {
                collection0.add(v2);
            }
            ++v;
        }
        return collection0;
    }

    @NotNull
    public static final Collection filterIndexedTo(@NotNull long[] arr_v, @NotNull Collection collection0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function20, "predicate");
        int v = 0;
        for(int v1 = 0; v < arr_v.length; ++v1) {
            long v2 = arr_v[v];
            if(((Boolean)function20.invoke(v1, v2)).booleanValue()) {
                collection0.add(v2);
            }
            ++v;
        }
        return collection0;
    }

    @NotNull
    public static final Collection filterIndexedTo(@NotNull Object[] arr_object, @NotNull Collection collection0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function20, "predicate");
        int v = 0;
        for(int v1 = 0; v < arr_object.length; ++v1) {
            Object object0 = arr_object[v];
            if(((Boolean)function20.invoke(v1, object0)).booleanValue()) {
                collection0.add(object0);
            }
            ++v;
        }
        return collection0;
    }

    @NotNull
    public static final Collection filterIndexedTo(@NotNull short[] arr_v, @NotNull Collection collection0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function20, "predicate");
        int v = 0;
        for(int v1 = 0; v < arr_v.length; ++v1) {
            int v2 = arr_v[v];
            if(((Boolean)function20.invoke(v1, ((short)v2))).booleanValue()) {
                collection0.add(((short)v2));
            }
            ++v;
        }
        return collection0;
    }

    @NotNull
    public static final Collection filterIndexedTo(@NotNull boolean[] arr_z, @NotNull Collection collection0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function20, "predicate");
        int v = 0;
        for(int v1 = 0; v < arr_z.length; ++v1) {
            boolean z = arr_z[v];
            if(((Boolean)function20.invoke(v1, Boolean.valueOf(z))).booleanValue()) {
                collection0.add(Boolean.valueOf(z));
            }
            ++v;
        }
        return collection0;
    }

    public static final List filterIsInstance(Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            Intrinsics.reifiedOperationMarker(3, "R");
            if(object0 != null) {
                list0.add(object0);
            }
        }
        return list0;
    }

    public static final Collection filterIsInstanceTo(Object[] arr_object, Collection collection0) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            Intrinsics.reifiedOperationMarker(3, "R");
            if(object0 != null) {
                collection0.add(object0);
            }
        }
        return collection0;
    }

    @NotNull
    public static final List filterNot(@NotNull byte[] arr_b, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_b.length; ++v) {
            int v1 = arr_b[v];
            if(!((Boolean)function10.invoke(((byte)v1))).booleanValue()) {
                list0.add(((byte)v1));
            }
        }
        return list0;
    }

    @NotNull
    public static final List filterNot(@NotNull char[] arr_c, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_c.length; ++v) {
            int v1 = arr_c[v];
            if(!((Boolean)function10.invoke(Character.valueOf(((char)v1)))).booleanValue()) {
                list0.add(Character.valueOf(((char)v1)));
            }
        }
        return list0;
    }

    @NotNull
    public static final List filterNot(@NotNull double[] arr_f, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_f.length; ++v) {
            double f = arr_f[v];
            if(!((Boolean)function10.invoke(f)).booleanValue()) {
                list0.add(f);
            }
        }
        return list0;
    }

    @NotNull
    public static final List filterNot(@NotNull float[] arr_f, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_f.length; ++v) {
            float f = arr_f[v];
            if(!((Boolean)function10.invoke(f)).booleanValue()) {
                list0.add(f);
            }
        }
        return list0;
    }

    @NotNull
    public static final List filterNot(@NotNull int[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            if(!((Boolean)function10.invoke(v1)).booleanValue()) {
                list0.add(v1);
            }
        }
        return list0;
    }

    @NotNull
    public static final List filterNot(@NotNull long[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_v.length; ++v) {
            long v1 = arr_v[v];
            if(!((Boolean)function10.invoke(v1)).booleanValue()) {
                list0.add(v1);
            }
        }
        return list0;
    }

    @NotNull
    public static final List filterNot(@NotNull Object[] arr_object, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            if(!((Boolean)function10.invoke(object0)).booleanValue()) {
                list0.add(object0);
            }
        }
        return list0;
    }

    @NotNull
    public static final List filterNot(@NotNull short[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            if(!((Boolean)function10.invoke(((short)v1))).booleanValue()) {
                list0.add(((short)v1));
            }
        }
        return list0;
    }

    @NotNull
    public static final List filterNot(@NotNull boolean[] arr_z, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_z.length; ++v) {
            boolean z = arr_z[v];
            if(!((Boolean)function10.invoke(Boolean.valueOf(z))).booleanValue()) {
                list0.add(Boolean.valueOf(z));
            }
        }
        return list0;
    }

    @NotNull
    public static List filterNotNull(@NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        return (List)ArraysKt___ArraysKt.filterNotNullTo(arr_object, new ArrayList());
    }

    @NotNull
    public static final Collection filterNotNullTo(@NotNull Object[] arr_object, @NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            if(object0 != null) {
                collection0.add(object0);
            }
        }
        return collection0;
    }

    @NotNull
    public static final Collection filterNotTo(@NotNull byte[] arr_b, @NotNull Collection collection0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_b.length; ++v) {
            int v1 = arr_b[v];
            if(!((Boolean)function10.invoke(((byte)v1))).booleanValue()) {
                collection0.add(((byte)v1));
            }
        }
        return collection0;
    }

    @NotNull
    public static final Collection filterNotTo(@NotNull char[] arr_c, @NotNull Collection collection0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_c.length; ++v) {
            int v1 = arr_c[v];
            if(!((Boolean)function10.invoke(Character.valueOf(((char)v1)))).booleanValue()) {
                collection0.add(Character.valueOf(((char)v1)));
            }
        }
        return collection0;
    }

    @NotNull
    public static final Collection filterNotTo(@NotNull double[] arr_f, @NotNull Collection collection0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_f.length; ++v) {
            double f = arr_f[v];
            if(!((Boolean)function10.invoke(f)).booleanValue()) {
                collection0.add(f);
            }
        }
        return collection0;
    }

    @NotNull
    public static final Collection filterNotTo(@NotNull float[] arr_f, @NotNull Collection collection0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_f.length; ++v) {
            float f = arr_f[v];
            if(!((Boolean)function10.invoke(f)).booleanValue()) {
                collection0.add(f);
            }
        }
        return collection0;
    }

    @NotNull
    public static final Collection filterNotTo(@NotNull int[] arr_v, @NotNull Collection collection0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            if(!((Boolean)function10.invoke(v1)).booleanValue()) {
                collection0.add(v1);
            }
        }
        return collection0;
    }

    @NotNull
    public static final Collection filterNotTo(@NotNull long[] arr_v, @NotNull Collection collection0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_v.length; ++v) {
            long v1 = arr_v[v];
            if(!((Boolean)function10.invoke(v1)).booleanValue()) {
                collection0.add(v1);
            }
        }
        return collection0;
    }

    @NotNull
    public static final Collection filterNotTo(@NotNull Object[] arr_object, @NotNull Collection collection0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            if(!((Boolean)function10.invoke(object0)).booleanValue()) {
                collection0.add(object0);
            }
        }
        return collection0;
    }

    @NotNull
    public static final Collection filterNotTo(@NotNull short[] arr_v, @NotNull Collection collection0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            if(!((Boolean)function10.invoke(((short)v1))).booleanValue()) {
                collection0.add(((short)v1));
            }
        }
        return collection0;
    }

    @NotNull
    public static final Collection filterNotTo(@NotNull boolean[] arr_z, @NotNull Collection collection0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_z.length; ++v) {
            boolean z = arr_z[v];
            if(!((Boolean)function10.invoke(Boolean.valueOf(z))).booleanValue()) {
                collection0.add(Boolean.valueOf(z));
            }
        }
        return collection0;
    }

    @NotNull
    public static final Collection filterTo(@NotNull byte[] arr_b, @NotNull Collection collection0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_b.length; ++v) {
            int v1 = arr_b[v];
            if(((Boolean)function10.invoke(((byte)v1))).booleanValue()) {
                collection0.add(((byte)v1));
            }
        }
        return collection0;
    }

    @NotNull
    public static final Collection filterTo(@NotNull char[] arr_c, @NotNull Collection collection0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_c.length; ++v) {
            int v1 = arr_c[v];
            if(((Boolean)function10.invoke(Character.valueOf(((char)v1)))).booleanValue()) {
                collection0.add(Character.valueOf(((char)v1)));
            }
        }
        return collection0;
    }

    @NotNull
    public static final Collection filterTo(@NotNull double[] arr_f, @NotNull Collection collection0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_f.length; ++v) {
            double f = arr_f[v];
            if(((Boolean)function10.invoke(f)).booleanValue()) {
                collection0.add(f);
            }
        }
        return collection0;
    }

    @NotNull
    public static final Collection filterTo(@NotNull float[] arr_f, @NotNull Collection collection0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_f.length; ++v) {
            float f = arr_f[v];
            if(((Boolean)function10.invoke(f)).booleanValue()) {
                collection0.add(f);
            }
        }
        return collection0;
    }

    @NotNull
    public static final Collection filterTo(@NotNull int[] arr_v, @NotNull Collection collection0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            if(((Boolean)function10.invoke(v1)).booleanValue()) {
                collection0.add(v1);
            }
        }
        return collection0;
    }

    @NotNull
    public static final Collection filterTo(@NotNull long[] arr_v, @NotNull Collection collection0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_v.length; ++v) {
            long v1 = arr_v[v];
            if(((Boolean)function10.invoke(v1)).booleanValue()) {
                collection0.add(v1);
            }
        }
        return collection0;
    }

    @NotNull
    public static final Collection filterTo(@NotNull Object[] arr_object, @NotNull Collection collection0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            if(((Boolean)function10.invoke(object0)).booleanValue()) {
                collection0.add(object0);
            }
        }
        return collection0;
    }

    @NotNull
    public static final Collection filterTo(@NotNull short[] arr_v, @NotNull Collection collection0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            if(((Boolean)function10.invoke(((short)v1))).booleanValue()) {
                collection0.add(((short)v1));
            }
        }
        return collection0;
    }

    @NotNull
    public static final Collection filterTo(@NotNull boolean[] arr_z, @NotNull Collection collection0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_z.length; ++v) {
            boolean z = arr_z[v];
            if(((Boolean)function10.invoke(Boolean.valueOf(z))).booleanValue()) {
                collection0.add(Boolean.valueOf(z));
            }
        }
        return collection0;
    }

    public static final byte first(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        if(arr_b.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return arr_b[0];
    }

    public static final byte first(@NotNull byte[] arr_b, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_b.length; ++v) {
            byte b = arr_b[v];
            if(((Boolean)function10.invoke(b)).booleanValue()) {
                return b;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final char first(@NotNull char[] arr_c) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        if(arr_c.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return arr_c[0];
    }

    public static final char first(@NotNull char[] arr_c, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_c.length; ++v) {
            char c = arr_c[v];
            if(((Boolean)function10.invoke(Character.valueOf(c))).booleanValue()) {
                return c;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final double first(@NotNull double[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        if(arr_f.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return arr_f[0];
    }

    public static final double first(@NotNull double[] arr_f, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_f.length; ++v) {
            double f = arr_f[v];
            if(((Boolean)function10.invoke(f)).booleanValue()) {
                return f;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final float first(@NotNull float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        if(arr_f.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return arr_f[0];
    }

    public static final float first(@NotNull float[] arr_f, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_f.length; ++v) {
            float f = arr_f[v];
            if(((Boolean)function10.invoke(f)).booleanValue()) {
                return f;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static int first(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        if(arr_v.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return arr_v[0];
    }

    public static final int first(@NotNull int[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            if(((Boolean)function10.invoke(v1)).booleanValue()) {
                return v1;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final long first(@NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        if(arr_v.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return arr_v[0];
    }

    public static final long first(@NotNull long[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_v.length; ++v) {
            long v1 = arr_v[v];
            if(((Boolean)function10.invoke(v1)).booleanValue()) {
                return v1;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static Object first(@NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        if(arr_object.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return arr_object[0];
    }

    public static final Object first(@NotNull Object[] arr_object, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            if(((Boolean)function10.invoke(object0)).booleanValue()) {
                return object0;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final short first(@NotNull short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        if(arr_v.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return arr_v[0];
    }

    public static final short first(@NotNull short[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_v.length; ++v) {
            short v1 = arr_v[v];
            if(((Boolean)function10.invoke(v1)).booleanValue()) {
                return v1;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final boolean first(@NotNull boolean[] arr_z) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        if(arr_z.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return arr_z[0];
    }

    public static final boolean first(@NotNull boolean[] arr_z, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_z.length; ++v) {
            boolean z = arr_z[v];
            if(((Boolean)function10.invoke(Boolean.valueOf(z))).booleanValue()) {
                return z;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Nullable
    public static final Boolean firstOrNull(@NotNull boolean[] arr_z) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        return arr_z.length == 0 ? null : Boolean.valueOf(arr_z[0]);
    }

    @Nullable
    public static final Boolean firstOrNull(@NotNull boolean[] arr_z, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_z.length; ++v) {
            boolean z = arr_z[v];
            if(((Boolean)function10.invoke(Boolean.valueOf(z))).booleanValue()) {
                return Boolean.valueOf(z);
            }
        }
        return null;
    }

    @Nullable
    public static final Byte firstOrNull(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        return arr_b.length == 0 ? null : ((byte)arr_b[0]);
    }

    @Nullable
    public static final Byte firstOrNull(@NotNull byte[] arr_b, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_b.length; ++v) {
            int v1 = arr_b[v];
            if(((Boolean)function10.invoke(((byte)v1))).booleanValue()) {
                return (byte)v1;
            }
        }
        return null;
    }

    @Nullable
    public static final Character firstOrNull(@NotNull char[] arr_c) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        return arr_c.length == 0 ? null : Character.valueOf(arr_c[0]);
    }

    @Nullable
    public static final Character firstOrNull(@NotNull char[] arr_c, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_c.length; ++v) {
            int v1 = arr_c[v];
            if(((Boolean)function10.invoke(Character.valueOf(((char)v1)))).booleanValue()) {
                return Character.valueOf(((char)v1));
            }
        }
        return null;
    }

    @Nullable
    public static final Double firstOrNull(@NotNull double[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        return arr_f.length == 0 ? null : ((double)arr_f[0]);
    }

    @Nullable
    public static final Double firstOrNull(@NotNull double[] arr_f, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_f.length; ++v) {
            double f = arr_f[v];
            if(((Boolean)function10.invoke(f)).booleanValue()) {
                return f;
            }
        }
        return null;
    }

    @Nullable
    public static final Float firstOrNull(@NotNull float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        return arr_f.length == 0 ? null : ((float)arr_f[0]);
    }

    @Nullable
    public static final Float firstOrNull(@NotNull float[] arr_f, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_f.length; ++v) {
            float f = arr_f[v];
            if(((Boolean)function10.invoke(f)).booleanValue()) {
                return f;
            }
        }
        return null;
    }

    @Nullable
    public static final Integer firstOrNull(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        return arr_v.length == 0 ? null : ((int)arr_v[0]);
    }

    @Nullable
    public static final Integer firstOrNull(@NotNull int[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            if(((Boolean)function10.invoke(v1)).booleanValue()) {
                return v1;
            }
        }
        return null;
    }

    @Nullable
    public static final Long firstOrNull(@NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        return arr_v.length == 0 ? null : ((long)arr_v[0]);
    }

    @Nullable
    public static final Long firstOrNull(@NotNull long[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_v.length; ++v) {
            long v1 = arr_v[v];
            if(((Boolean)function10.invoke(v1)).booleanValue()) {
                return v1;
            }
        }
        return null;
    }

    @Nullable
    public static Object firstOrNull(@NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        return arr_object.length == 0 ? null : arr_object[0];
    }

    @Nullable
    public static final Object firstOrNull(@NotNull Object[] arr_object, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            if(((Boolean)function10.invoke(object0)).booleanValue()) {
                return object0;
            }
        }
        return null;
    }

    @Nullable
    public static final Short firstOrNull(@NotNull short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        return arr_v.length == 0 ? null : ((short)arr_v[0]);
    }

    @Nullable
    public static final Short firstOrNull(@NotNull short[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            if(((Boolean)function10.invoke(((short)v1))).booleanValue()) {
                return (short)v1;
            }
        }
        return null;
    }

    @NotNull
    public static final List flatMap(@NotNull byte[] arr_b, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(function10, "transform");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_b.length; ++v) {
            o.addAll(list0, ((Iterable)function10.invoke(((byte)arr_b[v]))));
        }
        return list0;
    }

    @NotNull
    public static final List flatMap(@NotNull char[] arr_c, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(function10, "transform");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_c.length; ++v) {
            o.addAll(list0, ((Iterable)function10.invoke(Character.valueOf(arr_c[v]))));
        }
        return list0;
    }

    @NotNull
    public static final List flatMap(@NotNull double[] arr_f, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "transform");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_f.length; ++v) {
            o.addAll(list0, ((Iterable)function10.invoke(((double)arr_f[v]))));
        }
        return list0;
    }

    @NotNull
    public static final List flatMap(@NotNull float[] arr_f, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "transform");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_f.length; ++v) {
            o.addAll(list0, ((Iterable)function10.invoke(((float)arr_f[v]))));
        }
        return list0;
    }

    @NotNull
    public static final List flatMap(@NotNull int[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "transform");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_v.length; ++v) {
            o.addAll(list0, ((Iterable)function10.invoke(((int)arr_v[v]))));
        }
        return list0;
    }

    @NotNull
    public static final List flatMap(@NotNull long[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "transform");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_v.length; ++v) {
            o.addAll(list0, ((Iterable)function10.invoke(((long)arr_v[v]))));
        }
        return list0;
    }

    @NotNull
    public static final List flatMap(@NotNull Object[] arr_object, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(function10, "transform");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_object.length; ++v) {
            o.addAll(list0, ((Iterable)function10.invoke(arr_object[v])));
        }
        return list0;
    }

    @NotNull
    public static final List flatMap(@NotNull short[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "transform");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_v.length; ++v) {
            o.addAll(list0, ((Iterable)function10.invoke(((short)arr_v[v]))));
        }
        return list0;
    }

    @NotNull
    public static final List flatMap(@NotNull boolean[] arr_z, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(function10, "transform");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_z.length; ++v) {
            o.addAll(list0, ((Iterable)function10.invoke(Boolean.valueOf(arr_z[v]))));
        }
        return list0;
    }

    @OverloadResolutionByLambdaReturnType
    @SinceKotlin(version = "1.4")
    @JvmName(name = "flatMapSequence")
    @NotNull
    public static final List flatMapSequence(@NotNull Object[] arr_object, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(function10, "transform");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_object.length; ++v) {
            o.addAll(list0, ((Sequence)function10.invoke(arr_object[v])));
        }
        return list0;
    }

    @OverloadResolutionByLambdaReturnType
    @SinceKotlin(version = "1.4")
    @JvmName(name = "flatMapSequenceTo")
    @NotNull
    public static final Collection flatMapSequenceTo(@NotNull Object[] arr_object, @NotNull Collection collection0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function10, "transform");
        for(int v = 0; v < arr_object.length; ++v) {
            o.addAll(collection0, ((Sequence)function10.invoke(arr_object[v])));
        }
        return collection0;
    }

    @NotNull
    public static final Collection flatMapTo(@NotNull byte[] arr_b, @NotNull Collection collection0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function10, "transform");
        for(int v = 0; v < arr_b.length; ++v) {
            o.addAll(collection0, ((Iterable)function10.invoke(((byte)arr_b[v]))));
        }
        return collection0;
    }

    @NotNull
    public static final Collection flatMapTo(@NotNull char[] arr_c, @NotNull Collection collection0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function10, "transform");
        for(int v = 0; v < arr_c.length; ++v) {
            o.addAll(collection0, ((Iterable)function10.invoke(Character.valueOf(arr_c[v]))));
        }
        return collection0;
    }

    @NotNull
    public static final Collection flatMapTo(@NotNull double[] arr_f, @NotNull Collection collection0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function10, "transform");
        for(int v = 0; v < arr_f.length; ++v) {
            o.addAll(collection0, ((Iterable)function10.invoke(((double)arr_f[v]))));
        }
        return collection0;
    }

    @NotNull
    public static final Collection flatMapTo(@NotNull float[] arr_f, @NotNull Collection collection0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function10, "transform");
        for(int v = 0; v < arr_f.length; ++v) {
            o.addAll(collection0, ((Iterable)function10.invoke(((float)arr_f[v]))));
        }
        return collection0;
    }

    @NotNull
    public static final Collection flatMapTo(@NotNull int[] arr_v, @NotNull Collection collection0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function10, "transform");
        for(int v = 0; v < arr_v.length; ++v) {
            o.addAll(collection0, ((Iterable)function10.invoke(((int)arr_v[v]))));
        }
        return collection0;
    }

    @NotNull
    public static final Collection flatMapTo(@NotNull long[] arr_v, @NotNull Collection collection0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function10, "transform");
        for(int v = 0; v < arr_v.length; ++v) {
            o.addAll(collection0, ((Iterable)function10.invoke(((long)arr_v[v]))));
        }
        return collection0;
    }

    @NotNull
    public static final Collection flatMapTo(@NotNull Object[] arr_object, @NotNull Collection collection0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function10, "transform");
        for(int v = 0; v < arr_object.length; ++v) {
            o.addAll(collection0, ((Iterable)function10.invoke(arr_object[v])));
        }
        return collection0;
    }

    @NotNull
    public static final Collection flatMapTo(@NotNull short[] arr_v, @NotNull Collection collection0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function10, "transform");
        for(int v = 0; v < arr_v.length; ++v) {
            o.addAll(collection0, ((Iterable)function10.invoke(((short)arr_v[v]))));
        }
        return collection0;
    }

    @NotNull
    public static final Collection flatMapTo(@NotNull boolean[] arr_z, @NotNull Collection collection0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function10, "transform");
        for(int v = 0; v < arr_z.length; ++v) {
            o.addAll(collection0, ((Iterable)function10.invoke(Boolean.valueOf(arr_z[v]))));
        }
        return collection0;
    }

    public static final Object fold(@NotNull byte[] arr_b, Object object0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        for(int v = 0; v < arr_b.length; ++v) {
            object0 = function20.invoke(object0, ((byte)arr_b[v]));
        }
        return object0;
    }

    public static final Object fold(@NotNull char[] arr_c, Object object0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        for(int v = 0; v < arr_c.length; ++v) {
            object0 = function20.invoke(object0, Character.valueOf(arr_c[v]));
        }
        return object0;
    }

    public static final Object fold(@NotNull double[] arr_f, Object object0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        for(int v = 0; v < arr_f.length; ++v) {
            object0 = function20.invoke(object0, ((double)arr_f[v]));
        }
        return object0;
    }

    public static final Object fold(@NotNull float[] arr_f, Object object0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        for(int v = 0; v < arr_f.length; ++v) {
            object0 = function20.invoke(object0, ((float)arr_f[v]));
        }
        return object0;
    }

    public static final Object fold(@NotNull int[] arr_v, Object object0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        for(int v = 0; v < arr_v.length; ++v) {
            object0 = function20.invoke(object0, ((int)arr_v[v]));
        }
        return object0;
    }

    public static final Object fold(@NotNull long[] arr_v, Object object0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        for(int v = 0; v < arr_v.length; ++v) {
            object0 = function20.invoke(object0, ((long)arr_v[v]));
        }
        return object0;
    }

    public static final Object fold(@NotNull Object[] arr_object, Object object0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        for(int v = 0; v < arr_object.length; ++v) {
            object0 = function20.invoke(object0, arr_object[v]);
        }
        return object0;
    }

    public static final Object fold(@NotNull short[] arr_v, Object object0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        for(int v = 0; v < arr_v.length; ++v) {
            object0 = function20.invoke(object0, ((short)arr_v[v]));
        }
        return object0;
    }

    public static final Object fold(@NotNull boolean[] arr_z, Object object0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        for(int v = 0; v < arr_z.length; ++v) {
            object0 = function20.invoke(object0, Boolean.valueOf(arr_z[v]));
        }
        return object0;
    }

    public static final Object foldIndexed(@NotNull byte[] arr_b, Object object0, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        int v = 0;
        for(int v1 = 0; v < arr_b.length; ++v1) {
            object0 = function30.invoke(v1, object0, ((byte)arr_b[v]));
            ++v;
        }
        return object0;
    }

    public static final Object foldIndexed(@NotNull char[] arr_c, Object object0, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        int v = 0;
        for(int v1 = 0; v < arr_c.length; ++v1) {
            object0 = function30.invoke(v1, object0, Character.valueOf(arr_c[v]));
            ++v;
        }
        return object0;
    }

    public static final Object foldIndexed(@NotNull double[] arr_f, Object object0, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        int v = 0;
        for(int v1 = 0; v < arr_f.length; ++v1) {
            object0 = function30.invoke(v1, object0, ((double)arr_f[v]));
            ++v;
        }
        return object0;
    }

    public static final Object foldIndexed(@NotNull float[] arr_f, Object object0, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        int v = 0;
        for(int v1 = 0; v < arr_f.length; ++v1) {
            object0 = function30.invoke(v1, object0, ((float)arr_f[v]));
            ++v;
        }
        return object0;
    }

    public static final Object foldIndexed(@NotNull int[] arr_v, Object object0, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        int v = 0;
        for(int v1 = 0; v < arr_v.length; ++v1) {
            object0 = function30.invoke(v1, object0, ((int)arr_v[v]));
            ++v;
        }
        return object0;
    }

    public static final Object foldIndexed(@NotNull long[] arr_v, Object object0, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        int v = 0;
        for(int v1 = 0; v < arr_v.length; ++v1) {
            object0 = function30.invoke(v1, object0, ((long)arr_v[v]));
            ++v;
        }
        return object0;
    }

    public static final Object foldIndexed(@NotNull Object[] arr_object, Object object0, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        int v = 0;
        for(int v1 = 0; v < arr_object.length; ++v1) {
            object0 = function30.invoke(v1, object0, arr_object[v]);
            ++v;
        }
        return object0;
    }

    public static final Object foldIndexed(@NotNull short[] arr_v, Object object0, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        int v = 0;
        for(int v1 = 0; v < arr_v.length; ++v1) {
            object0 = function30.invoke(v1, object0, ((short)arr_v[v]));
            ++v;
        }
        return object0;
    }

    public static final Object foldIndexed(@NotNull boolean[] arr_z, Object object0, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        int v = 0;
        for(int v1 = 0; v < arr_z.length; ++v1) {
            object0 = function30.invoke(v1, object0, Boolean.valueOf(arr_z[v]));
            ++v;
        }
        return object0;
    }

    public static final Object foldRight(@NotNull byte[] arr_b, Object object0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        for(int v = ArraysKt___ArraysKt.getLastIndex(arr_b); v >= 0; --v) {
            object0 = function20.invoke(((byte)arr_b[v]), object0);
        }
        return object0;
    }

    public static final Object foldRight(@NotNull char[] arr_c, Object object0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        for(int v = ArraysKt___ArraysKt.getLastIndex(arr_c); v >= 0; --v) {
            object0 = function20.invoke(Character.valueOf(arr_c[v]), object0);
        }
        return object0;
    }

    public static final Object foldRight(@NotNull double[] arr_f, Object object0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        for(int v = ArraysKt___ArraysKt.getLastIndex(arr_f); v >= 0; --v) {
            object0 = function20.invoke(((double)arr_f[v]), object0);
        }
        return object0;
    }

    public static final Object foldRight(@NotNull float[] arr_f, Object object0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        for(int v = ArraysKt___ArraysKt.getLastIndex(arr_f); v >= 0; --v) {
            object0 = function20.invoke(((float)arr_f[v]), object0);
        }
        return object0;
    }

    public static final Object foldRight(@NotNull int[] arr_v, Object object0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        for(int v = ArraysKt___ArraysKt.getLastIndex(arr_v); v >= 0; --v) {
            object0 = function20.invoke(((int)arr_v[v]), object0);
        }
        return object0;
    }

    public static final Object foldRight(@NotNull long[] arr_v, Object object0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        for(int v = ArraysKt___ArraysKt.getLastIndex(arr_v); v >= 0; --v) {
            object0 = function20.invoke(((long)arr_v[v]), object0);
        }
        return object0;
    }

    public static final Object foldRight(@NotNull Object[] arr_object, Object object0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        for(int v = ArraysKt___ArraysKt.getLastIndex(arr_object); v >= 0; --v) {
            object0 = function20.invoke(arr_object[v], object0);
        }
        return object0;
    }

    public static final Object foldRight(@NotNull short[] arr_v, Object object0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        for(int v = ArraysKt___ArraysKt.getLastIndex(arr_v); v >= 0; --v) {
            object0 = function20.invoke(((short)arr_v[v]), object0);
        }
        return object0;
    }

    public static final Object foldRight(@NotNull boolean[] arr_z, Object object0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        for(int v = ArraysKt___ArraysKt.getLastIndex(arr_z); v >= 0; --v) {
            object0 = function20.invoke(Boolean.valueOf(arr_z[v]), object0);
        }
        return object0;
    }

    public static final Object foldRightIndexed(@NotNull byte[] arr_b, Object object0, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        for(int v = ArraysKt___ArraysKt.getLastIndex(arr_b); v >= 0; --v) {
            object0 = function30.invoke(v, ((byte)arr_b[v]), object0);
        }
        return object0;
    }

    public static final Object foldRightIndexed(@NotNull char[] arr_c, Object object0, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        for(int v = ArraysKt___ArraysKt.getLastIndex(arr_c); v >= 0; --v) {
            object0 = function30.invoke(v, Character.valueOf(arr_c[v]), object0);
        }
        return object0;
    }

    public static final Object foldRightIndexed(@NotNull double[] arr_f, Object object0, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        for(int v = ArraysKt___ArraysKt.getLastIndex(arr_f); v >= 0; --v) {
            object0 = function30.invoke(v, ((double)arr_f[v]), object0);
        }
        return object0;
    }

    public static final Object foldRightIndexed(@NotNull float[] arr_f, Object object0, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        for(int v = ArraysKt___ArraysKt.getLastIndex(arr_f); v >= 0; --v) {
            object0 = function30.invoke(v, ((float)arr_f[v]), object0);
        }
        return object0;
    }

    public static final Object foldRightIndexed(@NotNull int[] arr_v, Object object0, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        for(int v = ArraysKt___ArraysKt.getLastIndex(arr_v); v >= 0; --v) {
            object0 = function30.invoke(v, ((int)arr_v[v]), object0);
        }
        return object0;
    }

    public static final Object foldRightIndexed(@NotNull long[] arr_v, Object object0, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        for(int v = ArraysKt___ArraysKt.getLastIndex(arr_v); v >= 0; --v) {
            object0 = function30.invoke(v, ((long)arr_v[v]), object0);
        }
        return object0;
    }

    public static final Object foldRightIndexed(@NotNull Object[] arr_object, Object object0, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        for(int v = ArraysKt___ArraysKt.getLastIndex(arr_object); v >= 0; --v) {
            object0 = function30.invoke(v, arr_object[v], object0);
        }
        return object0;
    }

    public static final Object foldRightIndexed(@NotNull short[] arr_v, Object object0, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        for(int v = ArraysKt___ArraysKt.getLastIndex(arr_v); v >= 0; --v) {
            object0 = function30.invoke(v, ((short)arr_v[v]), object0);
        }
        return object0;
    }

    public static final Object foldRightIndexed(@NotNull boolean[] arr_z, Object object0, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        for(int v = ArraysKt___ArraysKt.getLastIndex(arr_z); v >= 0; --v) {
            object0 = function30.invoke(v, Boolean.valueOf(arr_z[v]), object0);
        }
        return object0;
    }

    public static final void forEach(@NotNull byte[] arr_b, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(function10, "action");
        for(int v = 0; v < arr_b.length; ++v) {
            function10.invoke(((byte)arr_b[v]));
        }
    }

    public static final void forEach(@NotNull char[] arr_c, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(function10, "action");
        for(int v = 0; v < arr_c.length; ++v) {
            function10.invoke(Character.valueOf(arr_c[v]));
        }
    }

    public static final void forEach(@NotNull double[] arr_f, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "action");
        for(int v = 0; v < arr_f.length; ++v) {
            function10.invoke(((double)arr_f[v]));
        }
    }

    public static final void forEach(@NotNull float[] arr_f, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "action");
        for(int v = 0; v < arr_f.length; ++v) {
            function10.invoke(((float)arr_f[v]));
        }
    }

    public static final void forEach(@NotNull int[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "action");
        for(int v = 0; v < arr_v.length; ++v) {
            function10.invoke(((int)arr_v[v]));
        }
    }

    public static final void forEach(@NotNull long[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "action");
        for(int v = 0; v < arr_v.length; ++v) {
            function10.invoke(((long)arr_v[v]));
        }
    }

    public static final void forEach(@NotNull Object[] arr_object, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(function10, "action");
        for(int v = 0; v < arr_object.length; ++v) {
            function10.invoke(arr_object[v]);
        }
    }

    public static final void forEach(@NotNull short[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "action");
        for(int v = 0; v < arr_v.length; ++v) {
            function10.invoke(((short)arr_v[v]));
        }
    }

    public static final void forEach(@NotNull boolean[] arr_z, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(function10, "action");
        for(int v = 0; v < arr_z.length; ++v) {
            function10.invoke(Boolean.valueOf(arr_z[v]));
        }
    }

    public static final void forEachIndexed(@NotNull byte[] arr_b, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(function20, "action");
        int v = 0;
        for(int v1 = 0; v < arr_b.length; ++v1) {
            function20.invoke(v1, ((byte)arr_b[v]));
            ++v;
        }
    }

    public static final void forEachIndexed(@NotNull char[] arr_c, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(function20, "action");
        int v = 0;
        for(int v1 = 0; v < arr_c.length; ++v1) {
            function20.invoke(v1, Character.valueOf(arr_c[v]));
            ++v;
        }
    }

    public static final void forEachIndexed(@NotNull double[] arr_f, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function20, "action");
        int v = 0;
        for(int v1 = 0; v < arr_f.length; ++v1) {
            function20.invoke(v1, ((double)arr_f[v]));
            ++v;
        }
    }

    public static final void forEachIndexed(@NotNull float[] arr_f, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function20, "action");
        int v = 0;
        for(int v1 = 0; v < arr_f.length; ++v1) {
            function20.invoke(v1, ((float)arr_f[v]));
            ++v;
        }
    }

    public static final void forEachIndexed(@NotNull int[] arr_v, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function20, "action");
        int v = 0;
        for(int v1 = 0; v < arr_v.length; ++v1) {
            function20.invoke(v1, ((int)arr_v[v]));
            ++v;
        }
    }

    public static final void forEachIndexed(@NotNull long[] arr_v, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function20, "action");
        int v = 0;
        for(int v1 = 0; v < arr_v.length; ++v1) {
            function20.invoke(v1, ((long)arr_v[v]));
            ++v;
        }
    }

    public static final void forEachIndexed(@NotNull Object[] arr_object, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(function20, "action");
        int v = 0;
        for(int v1 = 0; v < arr_object.length; ++v1) {
            function20.invoke(v1, arr_object[v]);
            ++v;
        }
    }

    public static final void forEachIndexed(@NotNull short[] arr_v, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function20, "action");
        int v = 0;
        for(int v1 = 0; v < arr_v.length; ++v1) {
            function20.invoke(v1, ((short)arr_v[v]));
            ++v;
        }
    }

    public static final void forEachIndexed(@NotNull boolean[] arr_z, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(function20, "action");
        int v = 0;
        for(int v1 = 0; v < arr_z.length; ++v1) {
            function20.invoke(v1, Boolean.valueOf(arr_z[v]));
            ++v;
        }
    }

    @NotNull
    public static IntRange getIndices(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        return new IntRange(0, ArraysKt___ArraysKt.getLastIndex(arr_b));
    }

    @NotNull
    public static final IntRange getIndices(@NotNull char[] arr_c) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        return new IntRange(0, ArraysKt___ArraysKt.getLastIndex(arr_c));
    }

    @NotNull
    public static final IntRange getIndices(@NotNull double[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        return new IntRange(0, ArraysKt___ArraysKt.getLastIndex(arr_f));
    }

    @NotNull
    public static final IntRange getIndices(@NotNull float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        return new IntRange(0, ArraysKt___ArraysKt.getLastIndex(arr_f));
    }

    @NotNull
    public static IntRange getIndices(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        return new IntRange(0, ArraysKt___ArraysKt.getLastIndex(arr_v));
    }

    @NotNull
    public static IntRange getIndices(@NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        return new IntRange(0, ArraysKt___ArraysKt.getLastIndex(arr_v));
    }

    @NotNull
    public static IntRange getIndices(@NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        return new IntRange(0, ArraysKt___ArraysKt.getLastIndex(arr_object));
    }

    @NotNull
    public static IntRange getIndices(@NotNull short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        return new IntRange(0, ArraysKt___ArraysKt.getLastIndex(arr_v));
    }

    @NotNull
    public static final IntRange getIndices(@NotNull boolean[] arr_z) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        return new IntRange(0, ArraysKt___ArraysKt.getLastIndex(arr_z));
    }

    public static int getLastIndex(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        return arr_b.length - 1;
    }

    public static final int getLastIndex(@NotNull char[] arr_c) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        return arr_c.length - 1;
    }

    public static final int getLastIndex(@NotNull double[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        return arr_f.length - 1;
    }

    public static int getLastIndex(@NotNull float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        return arr_f.length - 1;
    }

    public static int getLastIndex(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        return arr_v.length - 1;
    }

    public static int getLastIndex(@NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        return arr_v.length - 1;
    }

    public static int getLastIndex(@NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        return arr_object.length - 1;
    }

    public static int getLastIndex(@NotNull short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        return arr_v.length - 1;
    }

    public static final int getLastIndex(@NotNull boolean[] arr_z) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        return arr_z.length - 1;
    }

    @Nullable
    public static final Boolean getOrNull(@NotNull boolean[] arr_z, int v) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        return v < 0 || v > ArraysKt___ArraysKt.getLastIndex(arr_z) ? null : Boolean.valueOf(arr_z[v]);
    }

    @Nullable
    public static final Byte getOrNull(@NotNull byte[] arr_b, int v) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        return v < 0 || v > ArraysKt___ArraysKt.getLastIndex(arr_b) ? null : ((byte)arr_b[v]);
    }

    @Nullable
    public static final Character getOrNull(@NotNull char[] arr_c, int v) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        return v < 0 || v > ArraysKt___ArraysKt.getLastIndex(arr_c) ? null : Character.valueOf(arr_c[v]);
    }

    @Nullable
    public static final Double getOrNull(@NotNull double[] arr_f, int v) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        return v < 0 || v > ArraysKt___ArraysKt.getLastIndex(arr_f) ? null : ((double)arr_f[v]);
    }

    @Nullable
    public static final Float getOrNull(@NotNull float[] arr_f, int v) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        return v < 0 || v > ArraysKt___ArraysKt.getLastIndex(arr_f) ? null : ((float)arr_f[v]);
    }

    @Nullable
    public static Integer getOrNull(@NotNull int[] arr_v, int v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        return v < 0 || v > ArraysKt___ArraysKt.getLastIndex(arr_v) ? null : ((int)arr_v[v]);
    }

    @Nullable
    public static final Long getOrNull(@NotNull long[] arr_v, int v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        return v < 0 || v > ArraysKt___ArraysKt.getLastIndex(arr_v) ? null : ((long)arr_v[v]);
    }

    @Nullable
    public static Object getOrNull(@NotNull Object[] arr_object, int v) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        return v < 0 || v > ArraysKt___ArraysKt.getLastIndex(arr_object) ? null : arr_object[v];
    }

    @Nullable
    public static final Short getOrNull(@NotNull short[] arr_v, int v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        return v < 0 || v > ArraysKt___ArraysKt.getLastIndex(arr_v) ? null : ((short)arr_v[v]);
    }

    @NotNull
    public static final Map groupBy(@NotNull byte[] arr_b, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Map map0 = new LinkedHashMap();
        for(int v = 0; v < arr_b.length; ++v) {
            int v1 = arr_b[v];
            Object object0 = function10.invoke(((byte)v1));
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = a.m(((LinkedHashMap)map0), object0);
            }
            arrayList0.add(((byte)v1));
        }
        return map0;
    }

    @NotNull
    public static final Map groupBy(@NotNull byte[] arr_b, @NotNull Function1 function10, @NotNull Function1 function11) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Intrinsics.checkNotNullParameter(function11, "valueTransform");
        Map map0 = new LinkedHashMap();
        for(int v = 0; v < arr_b.length; ++v) {
            int v1 = arr_b[v];
            Object object0 = function10.invoke(((byte)v1));
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = a.m(((LinkedHashMap)map0), object0);
            }
            arrayList0.add(function11.invoke(((byte)v1)));
        }
        return map0;
    }

    @NotNull
    public static final Map groupBy(@NotNull char[] arr_c, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Map map0 = new LinkedHashMap();
        for(int v = 0; v < arr_c.length; ++v) {
            int v1 = arr_c[v];
            Object object0 = function10.invoke(Character.valueOf(((char)v1)));
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = a.m(((LinkedHashMap)map0), object0);
            }
            arrayList0.add(Character.valueOf(((char)v1)));
        }
        return map0;
    }

    @NotNull
    public static final Map groupBy(@NotNull char[] arr_c, @NotNull Function1 function10, @NotNull Function1 function11) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Intrinsics.checkNotNullParameter(function11, "valueTransform");
        Map map0 = new LinkedHashMap();
        for(int v = 0; v < arr_c.length; ++v) {
            int v1 = arr_c[v];
            Object object0 = function10.invoke(Character.valueOf(((char)v1)));
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = a.m(((LinkedHashMap)map0), object0);
            }
            arrayList0.add(function11.invoke(Character.valueOf(((char)v1))));
        }
        return map0;
    }

    @NotNull
    public static final Map groupBy(@NotNull double[] arr_f, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Map map0 = new LinkedHashMap();
        for(int v = 0; v < arr_f.length; ++v) {
            double f = arr_f[v];
            Object object0 = function10.invoke(f);
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = a.m(((LinkedHashMap)map0), object0);
            }
            arrayList0.add(f);
        }
        return map0;
    }

    @NotNull
    public static final Map groupBy(@NotNull double[] arr_f, @NotNull Function1 function10, @NotNull Function1 function11) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Intrinsics.checkNotNullParameter(function11, "valueTransform");
        Map map0 = new LinkedHashMap();
        for(int v = 0; v < arr_f.length; ++v) {
            double f = arr_f[v];
            Object object0 = function10.invoke(f);
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = a.m(((LinkedHashMap)map0), object0);
            }
            arrayList0.add(function11.invoke(f));
        }
        return map0;
    }

    @NotNull
    public static final Map groupBy(@NotNull float[] arr_f, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Map map0 = new LinkedHashMap();
        for(int v = 0; v < arr_f.length; ++v) {
            float f = arr_f[v];
            Object object0 = function10.invoke(f);
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = a.m(((LinkedHashMap)map0), object0);
            }
            arrayList0.add(f);
        }
        return map0;
    }

    @NotNull
    public static final Map groupBy(@NotNull float[] arr_f, @NotNull Function1 function10, @NotNull Function1 function11) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Intrinsics.checkNotNullParameter(function11, "valueTransform");
        Map map0 = new LinkedHashMap();
        for(int v = 0; v < arr_f.length; ++v) {
            float f = arr_f[v];
            Object object0 = function10.invoke(f);
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = a.m(((LinkedHashMap)map0), object0);
            }
            arrayList0.add(function11.invoke(f));
        }
        return map0;
    }

    @NotNull
    public static final Map groupBy(@NotNull int[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Map map0 = new LinkedHashMap();
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            Object object0 = function10.invoke(v1);
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = a.m(((LinkedHashMap)map0), object0);
            }
            arrayList0.add(v1);
        }
        return map0;
    }

    @NotNull
    public static final Map groupBy(@NotNull int[] arr_v, @NotNull Function1 function10, @NotNull Function1 function11) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Intrinsics.checkNotNullParameter(function11, "valueTransform");
        Map map0 = new LinkedHashMap();
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            Object object0 = function10.invoke(v1);
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = a.m(((LinkedHashMap)map0), object0);
            }
            arrayList0.add(function11.invoke(v1));
        }
        return map0;
    }

    @NotNull
    public static final Map groupBy(@NotNull long[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Map map0 = new LinkedHashMap();
        for(int v = 0; v < arr_v.length; ++v) {
            long v1 = arr_v[v];
            Object object0 = function10.invoke(v1);
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = a.m(((LinkedHashMap)map0), object0);
            }
            arrayList0.add(v1);
        }
        return map0;
    }

    @NotNull
    public static final Map groupBy(@NotNull long[] arr_v, @NotNull Function1 function10, @NotNull Function1 function11) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Intrinsics.checkNotNullParameter(function11, "valueTransform");
        Map map0 = new LinkedHashMap();
        for(int v = 0; v < arr_v.length; ++v) {
            long v1 = arr_v[v];
            Object object0 = function10.invoke(v1);
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = a.m(((LinkedHashMap)map0), object0);
            }
            arrayList0.add(function11.invoke(v1));
        }
        return map0;
    }

    @NotNull
    public static final Map groupBy(@NotNull Object[] arr_object, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Map map0 = new LinkedHashMap();
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
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
    public static final Map groupBy(@NotNull Object[] arr_object, @NotNull Function1 function10, @NotNull Function1 function11) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Intrinsics.checkNotNullParameter(function11, "valueTransform");
        Map map0 = new LinkedHashMap();
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
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
    public static final Map groupBy(@NotNull short[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Map map0 = new LinkedHashMap();
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            Object object0 = function10.invoke(((short)v1));
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = a.m(((LinkedHashMap)map0), object0);
            }
            arrayList0.add(((short)v1));
        }
        return map0;
    }

    @NotNull
    public static final Map groupBy(@NotNull short[] arr_v, @NotNull Function1 function10, @NotNull Function1 function11) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Intrinsics.checkNotNullParameter(function11, "valueTransform");
        Map map0 = new LinkedHashMap();
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            Object object0 = function10.invoke(((short)v1));
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = a.m(((LinkedHashMap)map0), object0);
            }
            arrayList0.add(function11.invoke(((short)v1)));
        }
        return map0;
    }

    @NotNull
    public static final Map groupBy(@NotNull boolean[] arr_z, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Map map0 = new LinkedHashMap();
        for(int v = 0; v < arr_z.length; ++v) {
            boolean z = arr_z[v];
            Object object0 = function10.invoke(Boolean.valueOf(z));
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = a.m(((LinkedHashMap)map0), object0);
            }
            arrayList0.add(Boolean.valueOf(z));
        }
        return map0;
    }

    @NotNull
    public static final Map groupBy(@NotNull boolean[] arr_z, @NotNull Function1 function10, @NotNull Function1 function11) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Intrinsics.checkNotNullParameter(function11, "valueTransform");
        Map map0 = new LinkedHashMap();
        for(int v = 0; v < arr_z.length; ++v) {
            boolean z = arr_z[v];
            Object object0 = function10.invoke(Boolean.valueOf(z));
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = a.m(((LinkedHashMap)map0), object0);
            }
            arrayList0.add(function11.invoke(Boolean.valueOf(z)));
        }
        return map0;
    }

    @NotNull
    public static final Map groupByTo(@NotNull byte[] arr_b, @NotNull Map map0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        for(int v = 0; v < arr_b.length; ++v) {
            int v1 = arr_b[v];
            Object object0 = function10.invoke(((byte)v1));
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = wb.a.g(map0, object0);
            }
            arrayList0.add(((byte)v1));
        }
        return map0;
    }

    @NotNull
    public static final Map groupByTo(@NotNull byte[] arr_b, @NotNull Map map0, @NotNull Function1 function10, @NotNull Function1 function11) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Intrinsics.checkNotNullParameter(function11, "valueTransform");
        for(int v = 0; v < arr_b.length; ++v) {
            int v1 = arr_b[v];
            Object object0 = function10.invoke(((byte)v1));
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = wb.a.g(map0, object0);
            }
            arrayList0.add(function11.invoke(((byte)v1)));
        }
        return map0;
    }

    @NotNull
    public static final Map groupByTo(@NotNull char[] arr_c, @NotNull Map map0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        for(int v = 0; v < arr_c.length; ++v) {
            int v1 = arr_c[v];
            Object object0 = function10.invoke(Character.valueOf(((char)v1)));
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = wb.a.g(map0, object0);
            }
            arrayList0.add(Character.valueOf(((char)v1)));
        }
        return map0;
    }

    @NotNull
    public static final Map groupByTo(@NotNull char[] arr_c, @NotNull Map map0, @NotNull Function1 function10, @NotNull Function1 function11) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Intrinsics.checkNotNullParameter(function11, "valueTransform");
        for(int v = 0; v < arr_c.length; ++v) {
            int v1 = arr_c[v];
            Object object0 = function10.invoke(Character.valueOf(((char)v1)));
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = wb.a.g(map0, object0);
            }
            arrayList0.add(function11.invoke(Character.valueOf(((char)v1))));
        }
        return map0;
    }

    @NotNull
    public static final Map groupByTo(@NotNull double[] arr_f, @NotNull Map map0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        for(int v = 0; v < arr_f.length; ++v) {
            double f = arr_f[v];
            Object object0 = function10.invoke(f);
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = wb.a.g(map0, object0);
            }
            arrayList0.add(f);
        }
        return map0;
    }

    @NotNull
    public static final Map groupByTo(@NotNull double[] arr_f, @NotNull Map map0, @NotNull Function1 function10, @NotNull Function1 function11) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Intrinsics.checkNotNullParameter(function11, "valueTransform");
        for(int v = 0; v < arr_f.length; ++v) {
            double f = arr_f[v];
            Object object0 = function10.invoke(f);
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = wb.a.g(map0, object0);
            }
            arrayList0.add(function11.invoke(f));
        }
        return map0;
    }

    @NotNull
    public static final Map groupByTo(@NotNull float[] arr_f, @NotNull Map map0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        for(int v = 0; v < arr_f.length; ++v) {
            float f = arr_f[v];
            Object object0 = function10.invoke(f);
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = wb.a.g(map0, object0);
            }
            arrayList0.add(f);
        }
        return map0;
    }

    @NotNull
    public static final Map groupByTo(@NotNull float[] arr_f, @NotNull Map map0, @NotNull Function1 function10, @NotNull Function1 function11) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Intrinsics.checkNotNullParameter(function11, "valueTransform");
        for(int v = 0; v < arr_f.length; ++v) {
            float f = arr_f[v];
            Object object0 = function10.invoke(f);
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = wb.a.g(map0, object0);
            }
            arrayList0.add(function11.invoke(f));
        }
        return map0;
    }

    @NotNull
    public static final Map groupByTo(@NotNull int[] arr_v, @NotNull Map map0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            Object object0 = function10.invoke(v1);
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = wb.a.g(map0, object0);
            }
            arrayList0.add(v1);
        }
        return map0;
    }

    @NotNull
    public static final Map groupByTo(@NotNull int[] arr_v, @NotNull Map map0, @NotNull Function1 function10, @NotNull Function1 function11) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Intrinsics.checkNotNullParameter(function11, "valueTransform");
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            Object object0 = function10.invoke(v1);
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = wb.a.g(map0, object0);
            }
            arrayList0.add(function11.invoke(v1));
        }
        return map0;
    }

    @NotNull
    public static final Map groupByTo(@NotNull long[] arr_v, @NotNull Map map0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        for(int v = 0; v < arr_v.length; ++v) {
            long v1 = arr_v[v];
            Object object0 = function10.invoke(v1);
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = wb.a.g(map0, object0);
            }
            arrayList0.add(v1);
        }
        return map0;
    }

    @NotNull
    public static final Map groupByTo(@NotNull long[] arr_v, @NotNull Map map0, @NotNull Function1 function10, @NotNull Function1 function11) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Intrinsics.checkNotNullParameter(function11, "valueTransform");
        for(int v = 0; v < arr_v.length; ++v) {
            long v1 = arr_v[v];
            Object object0 = function10.invoke(v1);
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = wb.a.g(map0, object0);
            }
            arrayList0.add(function11.invoke(v1));
        }
        return map0;
    }

    @NotNull
    public static final Map groupByTo(@NotNull Object[] arr_object, @NotNull Map map0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
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
    public static final Map groupByTo(@NotNull Object[] arr_object, @NotNull Map map0, @NotNull Function1 function10, @NotNull Function1 function11) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Intrinsics.checkNotNullParameter(function11, "valueTransform");
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            Object object1 = function10.invoke(object0);
            ArrayList arrayList0 = map0.get(object1);
            if(arrayList0 == null) {
                arrayList0 = wb.a.g(map0, object1);
            }
            arrayList0.add(function11.invoke(object0));
        }
        return map0;
    }

    @NotNull
    public static final Map groupByTo(@NotNull short[] arr_v, @NotNull Map map0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            Object object0 = function10.invoke(((short)v1));
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = wb.a.g(map0, object0);
            }
            arrayList0.add(((short)v1));
        }
        return map0;
    }

    @NotNull
    public static final Map groupByTo(@NotNull short[] arr_v, @NotNull Map map0, @NotNull Function1 function10, @NotNull Function1 function11) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Intrinsics.checkNotNullParameter(function11, "valueTransform");
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            Object object0 = function10.invoke(((short)v1));
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = wb.a.g(map0, object0);
            }
            arrayList0.add(function11.invoke(((short)v1)));
        }
        return map0;
    }

    @NotNull
    public static final Map groupByTo(@NotNull boolean[] arr_z, @NotNull Map map0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        for(int v = 0; v < arr_z.length; ++v) {
            boolean z = arr_z[v];
            Object object0 = function10.invoke(Boolean.valueOf(z));
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = wb.a.g(map0, object0);
            }
            arrayList0.add(Boolean.valueOf(z));
        }
        return map0;
    }

    @NotNull
    public static final Map groupByTo(@NotNull boolean[] arr_z, @NotNull Map map0, @NotNull Function1 function10, @NotNull Function1 function11) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Intrinsics.checkNotNullParameter(function11, "valueTransform");
        for(int v = 0; v < arr_z.length; ++v) {
            boolean z = arr_z[v];
            Object object0 = function10.invoke(Boolean.valueOf(z));
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = wb.a.g(map0, object0);
            }
            arrayList0.add(function11.invoke(Boolean.valueOf(z)));
        }
        return map0;
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final Grouping groupingBy(@NotNull Object[] arr_object, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        return new Grouping() {
            @Override  // kotlin.collections.Grouping
            public Object keyOf(Object object0) {
                return function10.invoke(object0);
            }

            @Override  // kotlin.collections.Grouping
            @NotNull
            public Iterator sourceIterator() {
                return ArrayIteratorKt.iterator(arr_object);
            }
        };
    }

    public static int indexOf(@NotNull byte[] arr_b, byte b) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        for(int v = 0; v < arr_b.length; ++v) {
            if(b == arr_b[v]) {
                return v;
            }
        }
        return -1;
    }

    public static final int indexOf(@NotNull char[] arr_c, char c) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        for(int v = 0; v < arr_c.length; ++v) {
            if(c == arr_c[v]) {
                return v;
            }
        }
        return -1;
    }

    @Deprecated(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use \'indexOfFirst { it == element }\' instead to continue using this behavior, or \'.asList().indexOf(element: T)\' to get the same search behavior as in a list.", replaceWith = @ReplaceWith(expression = "indexOfFirst { it == element }", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    public static final int indexOf(double[] arr_f, double f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        for(int v = 0; v < arr_f.length; ++v) {
            if(f == arr_f[v]) {
                return v;
            }
        }
        return -1;
    }

    @Deprecated(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use \'indexOfFirst { it == element }\' instead to continue using this behavior, or \'.asList().indexOf(element: T)\' to get the same search behavior as in a list.", replaceWith = @ReplaceWith(expression = "indexOfFirst { it == element }", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    public static final int indexOf(float[] arr_f, float f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        for(int v = 0; v < arr_f.length; ++v) {
            if(f == arr_f[v]) {
                return v;
            }
        }
        return -1;
    }

    public static int indexOf(@NotNull int[] arr_v, int v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            if(v == arr_v[v1]) {
                return v1;
            }
        }
        return -1;
    }

    public static int indexOf(@NotNull long[] arr_v, long v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            if(v == arr_v[v1]) {
                return v1;
            }
        }
        return -1;
    }

    public static int indexOf(@NotNull Object[] arr_object, Object object0) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        int v = 0;
        if(object0 == null) {
            while(v < arr_object.length) {
                if(arr_object[v] == null) {
                    return v;
                }
                ++v;
            }
            return -1;
        }
        while(v < arr_object.length) {
            if(Intrinsics.areEqual(object0, arr_object[v])) {
                return v;
            }
            ++v;
        }
        return -1;
    }

    public static int indexOf(@NotNull short[] arr_v, short v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            if(v == arr_v[v1]) {
                return v1;
            }
        }
        return -1;
    }

    public static final int indexOf(@NotNull boolean[] arr_z, boolean z) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        for(int v = 0; v < arr_z.length; ++v) {
            if(z == arr_z[v]) {
                return v;
            }
        }
        return -1;
    }

    public static final int indexOfFirst(@NotNull byte[] arr_b, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_b.length; ++v) {
            if(((Boolean)function10.invoke(((byte)arr_b[v]))).booleanValue()) {
                return v;
            }
        }
        return -1;
    }

    public static final int indexOfFirst(@NotNull char[] arr_c, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_c.length; ++v) {
            if(((Boolean)function10.invoke(Character.valueOf(arr_c[v]))).booleanValue()) {
                return v;
            }
        }
        return -1;
    }

    public static final int indexOfFirst(@NotNull double[] arr_f, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_f.length; ++v) {
            if(((Boolean)function10.invoke(((double)arr_f[v]))).booleanValue()) {
                return v;
            }
        }
        return -1;
    }

    public static final int indexOfFirst(@NotNull float[] arr_f, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_f.length; ++v) {
            if(((Boolean)function10.invoke(((float)arr_f[v]))).booleanValue()) {
                return v;
            }
        }
        return -1;
    }

    public static final int indexOfFirst(@NotNull int[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_v.length; ++v) {
            if(((Boolean)function10.invoke(((int)arr_v[v]))).booleanValue()) {
                return v;
            }
        }
        return -1;
    }

    public static final int indexOfFirst(@NotNull long[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_v.length; ++v) {
            if(((Boolean)function10.invoke(((long)arr_v[v]))).booleanValue()) {
                return v;
            }
        }
        return -1;
    }

    public static final int indexOfFirst(@NotNull Object[] arr_object, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_object.length; ++v) {
            if(((Boolean)function10.invoke(arr_object[v])).booleanValue()) {
                return v;
            }
        }
        return -1;
    }

    public static final int indexOfFirst(@NotNull short[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_v.length; ++v) {
            if(((Boolean)function10.invoke(((short)arr_v[v]))).booleanValue()) {
                return v;
            }
        }
        return -1;
    }

    public static final int indexOfFirst(@NotNull boolean[] arr_z, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_z.length; ++v) {
            if(((Boolean)function10.invoke(Boolean.valueOf(arr_z[v]))).booleanValue()) {
                return v;
            }
        }
        return -1;
    }

    public static final int indexOfLast(@NotNull byte[] arr_b, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v = arr_b.length - 1;
        if(v >= 0) {
            while(true) {
                if(((Boolean)function10.invoke(((byte)arr_b[v]))).booleanValue()) {
                    return v;
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        return -1;
    }

    public static final int indexOfLast(@NotNull char[] arr_c, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v = arr_c.length - 1;
        if(v >= 0) {
            while(true) {
                if(((Boolean)function10.invoke(Character.valueOf(arr_c[v]))).booleanValue()) {
                    return v;
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        return -1;
    }

    public static final int indexOfLast(@NotNull double[] arr_f, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v = arr_f.length - 1;
        if(v >= 0) {
            while(true) {
                if(((Boolean)function10.invoke(((double)arr_f[v]))).booleanValue()) {
                    return v;
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        return -1;
    }

    public static final int indexOfLast(@NotNull float[] arr_f, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v = arr_f.length - 1;
        if(v >= 0) {
            while(true) {
                if(((Boolean)function10.invoke(((float)arr_f[v]))).booleanValue()) {
                    return v;
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        return -1;
    }

    public static final int indexOfLast(@NotNull int[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v = arr_v.length - 1;
        if(v >= 0) {
            while(true) {
                if(((Boolean)function10.invoke(((int)arr_v[v]))).booleanValue()) {
                    return v;
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        return -1;
    }

    public static final int indexOfLast(@NotNull long[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v = arr_v.length - 1;
        if(v >= 0) {
            while(true) {
                if(((Boolean)function10.invoke(((long)arr_v[v]))).booleanValue()) {
                    return v;
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        return -1;
    }

    public static final int indexOfLast(@NotNull Object[] arr_object, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v = arr_object.length - 1;
        if(v >= 0) {
            while(true) {
                if(((Boolean)function10.invoke(arr_object[v])).booleanValue()) {
                    return v;
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        return -1;
    }

    public static final int indexOfLast(@NotNull short[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v = arr_v.length - 1;
        if(v >= 0) {
            while(true) {
                if(((Boolean)function10.invoke(((short)arr_v[v]))).booleanValue()) {
                    return v;
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        return -1;
    }

    public static final int indexOfLast(@NotNull boolean[] arr_z, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v = arr_z.length - 1;
        if(v >= 0) {
            while(true) {
                if(((Boolean)function10.invoke(Boolean.valueOf(arr_z[v]))).booleanValue()) {
                    return v;
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        return -1;
    }

    @NotNull
    public static final Set intersect(@NotNull byte[] arr_b, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "other");
        Set set0 = ArraysKt___ArraysKt.toMutableSet(arr_b);
        o.retainAll(set0, iterable0);
        return set0;
    }

    @NotNull
    public static final Set intersect(@NotNull char[] arr_c, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "other");
        Set set0 = ArraysKt___ArraysKt.toMutableSet(arr_c);
        o.retainAll(set0, iterable0);
        return set0;
    }

    @NotNull
    public static final Set intersect(@NotNull double[] arr_f, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "other");
        Set set0 = ArraysKt___ArraysKt.toMutableSet(arr_f);
        o.retainAll(set0, iterable0);
        return set0;
    }

    @NotNull
    public static final Set intersect(@NotNull float[] arr_f, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "other");
        Set set0 = ArraysKt___ArraysKt.toMutableSet(arr_f);
        o.retainAll(set0, iterable0);
        return set0;
    }

    @NotNull
    public static final Set intersect(@NotNull int[] arr_v, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "other");
        Set set0 = ArraysKt___ArraysKt.toMutableSet(arr_v);
        o.retainAll(set0, iterable0);
        return set0;
    }

    @NotNull
    public static final Set intersect(@NotNull long[] arr_v, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "other");
        Set set0 = ArraysKt___ArraysKt.toMutableSet(arr_v);
        o.retainAll(set0, iterable0);
        return set0;
    }

    @NotNull
    public static final Set intersect(@NotNull Object[] arr_object, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "other");
        Set set0 = ArraysKt___ArraysKt.toMutableSet(arr_object);
        o.retainAll(set0, iterable0);
        return set0;
    }

    @NotNull
    public static final Set intersect(@NotNull short[] arr_v, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "other");
        Set set0 = ArraysKt___ArraysKt.toMutableSet(arr_v);
        o.retainAll(set0, iterable0);
        return set0;
    }

    @NotNull
    public static final Set intersect(@NotNull boolean[] arr_z, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "other");
        Set set0 = ArraysKt___ArraysKt.toMutableSet(arr_z);
        o.retainAll(set0, iterable0);
        return set0;
    }

    @NotNull
    public static final Appendable joinTo(@NotNull byte[] arr_b, @NotNull Appendable appendable0, @NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, @NotNull CharSequence charSequence2, int v, @NotNull CharSequence charSequence3, @Nullable Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(appendable0, "buffer");
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        Intrinsics.checkNotNullParameter(charSequence2, "postfix");
        Intrinsics.checkNotNullParameter(charSequence3, "truncated");
        appendable0.append(charSequence1);
        int v2 = 0;
        for(int v1 = 0; v1 < arr_b.length; ++v1) {
            int v3 = arr_b[v1];
            ++v2;
            if(v2 > 1) {
                appendable0.append(charSequence0);
            }
            if(v >= 0 && v2 > v) {
                break;
            }
            if(function10 == null) {
                appendable0.append(String.valueOf(v3));
            }
            else {
                appendable0.append(((CharSequence)function10.invoke(((byte)v3))));
            }
        }
        if(v >= 0 && v2 > v) {
            appendable0.append(charSequence3);
        }
        appendable0.append(charSequence2);
        return appendable0;
    }

    @NotNull
    public static final Appendable joinTo(@NotNull char[] arr_c, @NotNull Appendable appendable0, @NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, @NotNull CharSequence charSequence2, int v, @NotNull CharSequence charSequence3, @Nullable Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(appendable0, "buffer");
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        Intrinsics.checkNotNullParameter(charSequence2, "postfix");
        Intrinsics.checkNotNullParameter(charSequence3, "truncated");
        appendable0.append(charSequence1);
        int v2 = 0;
        for(int v1 = 0; v1 < arr_c.length; ++v1) {
            int v3 = arr_c[v1];
            ++v2;
            if(v2 > 1) {
                appendable0.append(charSequence0);
            }
            if(v >= 0 && v2 > v) {
                break;
            }
            if(function10 == null) {
                appendable0.append(((char)v3));
            }
            else {
                appendable0.append(((CharSequence)function10.invoke(Character.valueOf(((char)v3)))));
            }
        }
        if(v >= 0 && v2 > v) {
            appendable0.append(charSequence3);
        }
        appendable0.append(charSequence2);
        return appendable0;
    }

    @NotNull
    public static final Appendable joinTo(@NotNull double[] arr_f, @NotNull Appendable appendable0, @NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, @NotNull CharSequence charSequence2, int v, @NotNull CharSequence charSequence3, @Nullable Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(appendable0, "buffer");
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        Intrinsics.checkNotNullParameter(charSequence2, "postfix");
        Intrinsics.checkNotNullParameter(charSequence3, "truncated");
        appendable0.append(charSequence1);
        int v2 = 0;
        for(int v1 = 0; v1 < arr_f.length; ++v1) {
            double f = arr_f[v1];
            ++v2;
            if(v2 > 1) {
                appendable0.append(charSequence0);
            }
            if(v >= 0 && v2 > v) {
                break;
            }
            if(function10 == null) {
                appendable0.append(String.valueOf(f));
            }
            else {
                appendable0.append(((CharSequence)function10.invoke(f)));
            }
        }
        if(v >= 0 && v2 > v) {
            appendable0.append(charSequence3);
        }
        appendable0.append(charSequence2);
        return appendable0;
    }

    @NotNull
    public static final Appendable joinTo(@NotNull float[] arr_f, @NotNull Appendable appendable0, @NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, @NotNull CharSequence charSequence2, int v, @NotNull CharSequence charSequence3, @Nullable Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(appendable0, "buffer");
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        Intrinsics.checkNotNullParameter(charSequence2, "postfix");
        Intrinsics.checkNotNullParameter(charSequence3, "truncated");
        appendable0.append(charSequence1);
        int v2 = 0;
        for(int v1 = 0; v1 < arr_f.length; ++v1) {
            float f = arr_f[v1];
            ++v2;
            if(v2 > 1) {
                appendable0.append(charSequence0);
            }
            if(v >= 0 && v2 > v) {
                break;
            }
            if(function10 == null) {
                appendable0.append(String.valueOf(f));
            }
            else {
                appendable0.append(((CharSequence)function10.invoke(f)));
            }
        }
        if(v >= 0 && v2 > v) {
            appendable0.append(charSequence3);
        }
        appendable0.append(charSequence2);
        return appendable0;
    }

    @NotNull
    public static final Appendable joinTo(@NotNull int[] arr_v, @NotNull Appendable appendable0, @NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, @NotNull CharSequence charSequence2, int v, @NotNull CharSequence charSequence3, @Nullable Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(appendable0, "buffer");
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        Intrinsics.checkNotNullParameter(charSequence2, "postfix");
        Intrinsics.checkNotNullParameter(charSequence3, "truncated");
        appendable0.append(charSequence1);
        int v2 = 0;
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            int v3 = arr_v[v1];
            ++v2;
            if(v2 > 1) {
                appendable0.append(charSequence0);
            }
            if(v >= 0 && v2 > v) {
                break;
            }
            if(function10 == null) {
                appendable0.append(String.valueOf(v3));
            }
            else {
                appendable0.append(((CharSequence)function10.invoke(v3)));
            }
        }
        if(v >= 0 && v2 > v) {
            appendable0.append(charSequence3);
        }
        appendable0.append(charSequence2);
        return appendable0;
    }

    @NotNull
    public static final Appendable joinTo(@NotNull long[] arr_v, @NotNull Appendable appendable0, @NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, @NotNull CharSequence charSequence2, int v, @NotNull CharSequence charSequence3, @Nullable Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(appendable0, "buffer");
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        Intrinsics.checkNotNullParameter(charSequence2, "postfix");
        Intrinsics.checkNotNullParameter(charSequence3, "truncated");
        appendable0.append(charSequence1);
        int v2 = 0;
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            long v3 = arr_v[v1];
            ++v2;
            if(v2 > 1) {
                appendable0.append(charSequence0);
            }
            if(v >= 0 && v2 > v) {
                break;
            }
            if(function10 == null) {
                appendable0.append(String.valueOf(v3));
            }
            else {
                appendable0.append(((CharSequence)function10.invoke(v3)));
            }
        }
        if(v >= 0 && v2 > v) {
            appendable0.append(charSequence3);
        }
        appendable0.append(charSequence2);
        return appendable0;
    }

    @NotNull
    public static final Appendable joinTo(@NotNull Object[] arr_object, @NotNull Appendable appendable0, @NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, @NotNull CharSequence charSequence2, int v, @NotNull CharSequence charSequence3, @Nullable Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(appendable0, "buffer");
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        Intrinsics.checkNotNullParameter(charSequence2, "postfix");
        Intrinsics.checkNotNullParameter(charSequence3, "truncated");
        appendable0.append(charSequence1);
        int v2 = 0;
        for(int v1 = 0; v1 < arr_object.length; ++v1) {
            Object object0 = arr_object[v1];
            ++v2;
            if(v2 > 1) {
                appendable0.append(charSequence0);
            }
            if(v >= 0 && v2 > v) {
                break;
            }
            i.appendElement(appendable0, object0, function10);
        }
        if(v >= 0 && v2 > v) {
            appendable0.append(charSequence3);
        }
        appendable0.append(charSequence2);
        return appendable0;
    }

    @NotNull
    public static final Appendable joinTo(@NotNull short[] arr_v, @NotNull Appendable appendable0, @NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, @NotNull CharSequence charSequence2, int v, @NotNull CharSequence charSequence3, @Nullable Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(appendable0, "buffer");
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        Intrinsics.checkNotNullParameter(charSequence2, "postfix");
        Intrinsics.checkNotNullParameter(charSequence3, "truncated");
        appendable0.append(charSequence1);
        int v2 = 0;
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            int v3 = arr_v[v1];
            ++v2;
            if(v2 > 1) {
                appendable0.append(charSequence0);
            }
            if(v >= 0 && v2 > v) {
                break;
            }
            if(function10 == null) {
                appendable0.append(String.valueOf(v3));
            }
            else {
                appendable0.append(((CharSequence)function10.invoke(((short)v3))));
            }
        }
        if(v >= 0 && v2 > v) {
            appendable0.append(charSequence3);
        }
        appendable0.append(charSequence2);
        return appendable0;
    }

    @NotNull
    public static final Appendable joinTo(@NotNull boolean[] arr_z, @NotNull Appendable appendable0, @NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, @NotNull CharSequence charSequence2, int v, @NotNull CharSequence charSequence3, @Nullable Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(appendable0, "buffer");
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        Intrinsics.checkNotNullParameter(charSequence2, "postfix");
        Intrinsics.checkNotNullParameter(charSequence3, "truncated");
        appendable0.append(charSequence1);
        int v2 = 0;
        for(int v1 = 0; v1 < arr_z.length; ++v1) {
            boolean z = arr_z[v1];
            ++v2;
            if(v2 > 1) {
                appendable0.append(charSequence0);
            }
            if(v >= 0 && v2 > v) {
                break;
            }
            if(function10 == null) {
                appendable0.append(String.valueOf(z));
            }
            else {
                appendable0.append(((CharSequence)function10.invoke(Boolean.valueOf(z))));
            }
        }
        if(v >= 0 && v2 > v) {
            appendable0.append(charSequence3);
        }
        appendable0.append(charSequence2);
        return appendable0;
    }

    public static Appendable joinTo$default(byte[] arr_b, Appendable appendable0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function1 function10, int v1, Object object0) {
        CharSequence charSequence4 = (v1 & 2) == 0 ? charSequence0 : ", ";
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (v1 & 4) == 0 ? charSequence1 : "";
        if((v1 & 8) == 0) {
            charSequence5 = charSequence2;
        }
        int v2 = (v1 & 16) == 0 ? v : -1;
        if((v1 & 0x20) != 0) {
            return (v1 & 0x40) == 0 ? ArraysKt___ArraysKt.joinTo(arr_b, appendable0, charSequence4, charSequence6, charSequence5, v2, "...", function10) : ArraysKt___ArraysKt.joinTo(arr_b, appendable0, charSequence4, charSequence6, charSequence5, v2, "...", null);
        }
        return (v1 & 0x40) == 0 ? ArraysKt___ArraysKt.joinTo(arr_b, appendable0, charSequence4, charSequence6, charSequence5, v2, charSequence3, function10) : ArraysKt___ArraysKt.joinTo(arr_b, appendable0, charSequence4, charSequence6, charSequence5, v2, charSequence3, null);
    }

    public static Appendable joinTo$default(char[] arr_c, Appendable appendable0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function1 function10, int v1, Object object0) {
        CharSequence charSequence4 = (v1 & 2) == 0 ? charSequence0 : ", ";
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (v1 & 4) == 0 ? charSequence1 : "";
        if((v1 & 8) == 0) {
            charSequence5 = charSequence2;
        }
        int v2 = (v1 & 16) == 0 ? v : -1;
        if((v1 & 0x20) != 0) {
            return (v1 & 0x40) == 0 ? ArraysKt___ArraysKt.joinTo(arr_c, appendable0, charSequence4, charSequence6, charSequence5, v2, "...", function10) : ArraysKt___ArraysKt.joinTo(arr_c, appendable0, charSequence4, charSequence6, charSequence5, v2, "...", null);
        }
        return (v1 & 0x40) == 0 ? ArraysKt___ArraysKt.joinTo(arr_c, appendable0, charSequence4, charSequence6, charSequence5, v2, charSequence3, function10) : ArraysKt___ArraysKt.joinTo(arr_c, appendable0, charSequence4, charSequence6, charSequence5, v2, charSequence3, null);
    }

    public static Appendable joinTo$default(double[] arr_f, Appendable appendable0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function1 function10, int v1, Object object0) {
        CharSequence charSequence4 = (v1 & 2) == 0 ? charSequence0 : ", ";
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (v1 & 4) == 0 ? charSequence1 : "";
        if((v1 & 8) == 0) {
            charSequence5 = charSequence2;
        }
        int v2 = (v1 & 16) == 0 ? v : -1;
        if((v1 & 0x20) != 0) {
            return (v1 & 0x40) == 0 ? ArraysKt___ArraysKt.joinTo(arr_f, appendable0, charSequence4, charSequence6, charSequence5, v2, "...", function10) : ArraysKt___ArraysKt.joinTo(arr_f, appendable0, charSequence4, charSequence6, charSequence5, v2, "...", null);
        }
        return (v1 & 0x40) == 0 ? ArraysKt___ArraysKt.joinTo(arr_f, appendable0, charSequence4, charSequence6, charSequence5, v2, charSequence3, function10) : ArraysKt___ArraysKt.joinTo(arr_f, appendable0, charSequence4, charSequence6, charSequence5, v2, charSequence3, null);
    }

    public static Appendable joinTo$default(float[] arr_f, Appendable appendable0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function1 function10, int v1, Object object0) {
        CharSequence charSequence4 = (v1 & 2) == 0 ? charSequence0 : ", ";
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (v1 & 4) == 0 ? charSequence1 : "";
        if((v1 & 8) == 0) {
            charSequence5 = charSequence2;
        }
        int v2 = (v1 & 16) == 0 ? v : -1;
        if((v1 & 0x20) != 0) {
            return (v1 & 0x40) == 0 ? ArraysKt___ArraysKt.joinTo(arr_f, appendable0, charSequence4, charSequence6, charSequence5, v2, "...", function10) : ArraysKt___ArraysKt.joinTo(arr_f, appendable0, charSequence4, charSequence6, charSequence5, v2, "...", null);
        }
        return (v1 & 0x40) == 0 ? ArraysKt___ArraysKt.joinTo(arr_f, appendable0, charSequence4, charSequence6, charSequence5, v2, charSequence3, function10) : ArraysKt___ArraysKt.joinTo(arr_f, appendable0, charSequence4, charSequence6, charSequence5, v2, charSequence3, null);
    }

    public static Appendable joinTo$default(int[] arr_v, Appendable appendable0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function1 function10, int v1, Object object0) {
        CharSequence charSequence4 = (v1 & 2) == 0 ? charSequence0 : ", ";
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (v1 & 4) == 0 ? charSequence1 : "";
        if((v1 & 8) == 0) {
            charSequence5 = charSequence2;
        }
        int v2 = (v1 & 16) == 0 ? v : -1;
        if((v1 & 0x20) != 0) {
            return (v1 & 0x40) == 0 ? ArraysKt___ArraysKt.joinTo(arr_v, appendable0, charSequence4, charSequence6, charSequence5, v2, "...", function10) : ArraysKt___ArraysKt.joinTo(arr_v, appendable0, charSequence4, charSequence6, charSequence5, v2, "...", null);
        }
        return (v1 & 0x40) == 0 ? ArraysKt___ArraysKt.joinTo(arr_v, appendable0, charSequence4, charSequence6, charSequence5, v2, charSequence3, function10) : ArraysKt___ArraysKt.joinTo(arr_v, appendable0, charSequence4, charSequence6, charSequence5, v2, charSequence3, null);
    }

    public static Appendable joinTo$default(long[] arr_v, Appendable appendable0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function1 function10, int v1, Object object0) {
        CharSequence charSequence4 = (v1 & 2) == 0 ? charSequence0 : ", ";
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (v1 & 4) == 0 ? charSequence1 : "";
        if((v1 & 8) == 0) {
            charSequence5 = charSequence2;
        }
        int v2 = (v1 & 16) == 0 ? v : -1;
        if((v1 & 0x20) != 0) {
            return (v1 & 0x40) == 0 ? ArraysKt___ArraysKt.joinTo(arr_v, appendable0, charSequence4, charSequence6, charSequence5, v2, "...", function10) : ArraysKt___ArraysKt.joinTo(arr_v, appendable0, charSequence4, charSequence6, charSequence5, v2, "...", null);
        }
        return (v1 & 0x40) == 0 ? ArraysKt___ArraysKt.joinTo(arr_v, appendable0, charSequence4, charSequence6, charSequence5, v2, charSequence3, function10) : ArraysKt___ArraysKt.joinTo(arr_v, appendable0, charSequence4, charSequence6, charSequence5, v2, charSequence3, null);
    }

    public static Appendable joinTo$default(Object[] arr_object, Appendable appendable0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function1 function10, int v1, Object object0) {
        CharSequence charSequence4 = (v1 & 2) == 0 ? charSequence0 : ", ";
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (v1 & 4) == 0 ? charSequence1 : "";
        if((v1 & 8) == 0) {
            charSequence5 = charSequence2;
        }
        int v2 = (v1 & 16) == 0 ? v : -1;
        if((v1 & 0x20) != 0) {
            return (v1 & 0x40) == 0 ? ArraysKt___ArraysKt.joinTo(arr_object, appendable0, charSequence4, charSequence6, charSequence5, v2, "...", function10) : ArraysKt___ArraysKt.joinTo(arr_object, appendable0, charSequence4, charSequence6, charSequence5, v2, "...", null);
        }
        return (v1 & 0x40) == 0 ? ArraysKt___ArraysKt.joinTo(arr_object, appendable0, charSequence4, charSequence6, charSequence5, v2, charSequence3, function10) : ArraysKt___ArraysKt.joinTo(arr_object, appendable0, charSequence4, charSequence6, charSequence5, v2, charSequence3, null);
    }

    public static Appendable joinTo$default(short[] arr_v, Appendable appendable0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function1 function10, int v1, Object object0) {
        CharSequence charSequence4 = (v1 & 2) == 0 ? charSequence0 : ", ";
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (v1 & 4) == 0 ? charSequence1 : "";
        if((v1 & 8) == 0) {
            charSequence5 = charSequence2;
        }
        int v2 = (v1 & 16) == 0 ? v : -1;
        if((v1 & 0x20) != 0) {
            return (v1 & 0x40) == 0 ? ArraysKt___ArraysKt.joinTo(arr_v, appendable0, charSequence4, charSequence6, charSequence5, v2, "...", function10) : ArraysKt___ArraysKt.joinTo(arr_v, appendable0, charSequence4, charSequence6, charSequence5, v2, "...", null);
        }
        return (v1 & 0x40) == 0 ? ArraysKt___ArraysKt.joinTo(arr_v, appendable0, charSequence4, charSequence6, charSequence5, v2, charSequence3, function10) : ArraysKt___ArraysKt.joinTo(arr_v, appendable0, charSequence4, charSequence6, charSequence5, v2, charSequence3, null);
    }

    public static Appendable joinTo$default(boolean[] arr_z, Appendable appendable0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function1 function10, int v1, Object object0) {
        CharSequence charSequence4 = (v1 & 2) == 0 ? charSequence0 : ", ";
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (v1 & 4) == 0 ? charSequence1 : "";
        if((v1 & 8) == 0) {
            charSequence5 = charSequence2;
        }
        int v2 = (v1 & 16) == 0 ? v : -1;
        if((v1 & 0x20) != 0) {
            return (v1 & 0x40) == 0 ? ArraysKt___ArraysKt.joinTo(arr_z, appendable0, charSequence4, charSequence6, charSequence5, v2, "...", function10) : ArraysKt___ArraysKt.joinTo(arr_z, appendable0, charSequence4, charSequence6, charSequence5, v2, "...", null);
        }
        return (v1 & 0x40) == 0 ? ArraysKt___ArraysKt.joinTo(arr_z, appendable0, charSequence4, charSequence6, charSequence5, v2, charSequence3, function10) : ArraysKt___ArraysKt.joinTo(arr_z, appendable0, charSequence4, charSequence6, charSequence5, v2, charSequence3, null);
    }

    @NotNull
    public static final String joinToString(@NotNull byte[] arr_b, @NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, @NotNull CharSequence charSequence2, int v, @NotNull CharSequence charSequence3, @Nullable Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        Intrinsics.checkNotNullParameter(charSequence2, "postfix");
        Intrinsics.checkNotNullParameter(charSequence3, "truncated");
        String s = ((StringBuilder)ArraysKt___ArraysKt.joinTo(arr_b, new StringBuilder(), charSequence0, charSequence1, charSequence2, v, charSequence3, function10)).toString();
        Intrinsics.checkNotNullExpressionValue(s, "toString(...)");
        return s;
    }

    @NotNull
    public static final String joinToString(@NotNull char[] arr_c, @NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, @NotNull CharSequence charSequence2, int v, @NotNull CharSequence charSequence3, @Nullable Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        Intrinsics.checkNotNullParameter(charSequence2, "postfix");
        Intrinsics.checkNotNullParameter(charSequence3, "truncated");
        String s = ((StringBuilder)ArraysKt___ArraysKt.joinTo(arr_c, new StringBuilder(), charSequence0, charSequence1, charSequence2, v, charSequence3, function10)).toString();
        Intrinsics.checkNotNullExpressionValue(s, "toString(...)");
        return s;
    }

    @NotNull
    public static final String joinToString(@NotNull double[] arr_f, @NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, @NotNull CharSequence charSequence2, int v, @NotNull CharSequence charSequence3, @Nullable Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        Intrinsics.checkNotNullParameter(charSequence2, "postfix");
        Intrinsics.checkNotNullParameter(charSequence3, "truncated");
        String s = ((StringBuilder)ArraysKt___ArraysKt.joinTo(arr_f, new StringBuilder(), charSequence0, charSequence1, charSequence2, v, charSequence3, function10)).toString();
        Intrinsics.checkNotNullExpressionValue(s, "toString(...)");
        return s;
    }

    @NotNull
    public static final String joinToString(@NotNull float[] arr_f, @NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, @NotNull CharSequence charSequence2, int v, @NotNull CharSequence charSequence3, @Nullable Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        Intrinsics.checkNotNullParameter(charSequence2, "postfix");
        Intrinsics.checkNotNullParameter(charSequence3, "truncated");
        String s = ((StringBuilder)ArraysKt___ArraysKt.joinTo(arr_f, new StringBuilder(), charSequence0, charSequence1, charSequence2, v, charSequence3, function10)).toString();
        Intrinsics.checkNotNullExpressionValue(s, "toString(...)");
        return s;
    }

    @NotNull
    public static final String joinToString(@NotNull int[] arr_v, @NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, @NotNull CharSequence charSequence2, int v, @NotNull CharSequence charSequence3, @Nullable Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        Intrinsics.checkNotNullParameter(charSequence2, "postfix");
        Intrinsics.checkNotNullParameter(charSequence3, "truncated");
        String s = ((StringBuilder)ArraysKt___ArraysKt.joinTo(arr_v, new StringBuilder(), charSequence0, charSequence1, charSequence2, v, charSequence3, function10)).toString();
        Intrinsics.checkNotNullExpressionValue(s, "toString(...)");
        return s;
    }

    @NotNull
    public static final String joinToString(@NotNull long[] arr_v, @NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, @NotNull CharSequence charSequence2, int v, @NotNull CharSequence charSequence3, @Nullable Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        Intrinsics.checkNotNullParameter(charSequence2, "postfix");
        Intrinsics.checkNotNullParameter(charSequence3, "truncated");
        String s = ((StringBuilder)ArraysKt___ArraysKt.joinTo(arr_v, new StringBuilder(), charSequence0, charSequence1, charSequence2, v, charSequence3, function10)).toString();
        Intrinsics.checkNotNullExpressionValue(s, "toString(...)");
        return s;
    }

    @NotNull
    public static final String joinToString(@NotNull Object[] arr_object, @NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, @NotNull CharSequence charSequence2, int v, @NotNull CharSequence charSequence3, @Nullable Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        Intrinsics.checkNotNullParameter(charSequence2, "postfix");
        Intrinsics.checkNotNullParameter(charSequence3, "truncated");
        String s = ((StringBuilder)ArraysKt___ArraysKt.joinTo(arr_object, new StringBuilder(), charSequence0, charSequence1, charSequence2, v, charSequence3, function10)).toString();
        Intrinsics.checkNotNullExpressionValue(s, "toString(...)");
        return s;
    }

    @NotNull
    public static final String joinToString(@NotNull short[] arr_v, @NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, @NotNull CharSequence charSequence2, int v, @NotNull CharSequence charSequence3, @Nullable Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        Intrinsics.checkNotNullParameter(charSequence2, "postfix");
        Intrinsics.checkNotNullParameter(charSequence3, "truncated");
        String s = ((StringBuilder)ArraysKt___ArraysKt.joinTo(arr_v, new StringBuilder(), charSequence0, charSequence1, charSequence2, v, charSequence3, function10)).toString();
        Intrinsics.checkNotNullExpressionValue(s, "toString(...)");
        return s;
    }

    @NotNull
    public static final String joinToString(@NotNull boolean[] arr_z, @NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, @NotNull CharSequence charSequence2, int v, @NotNull CharSequence charSequence3, @Nullable Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        Intrinsics.checkNotNullParameter(charSequence2, "postfix");
        Intrinsics.checkNotNullParameter(charSequence3, "truncated");
        String s = ((StringBuilder)ArraysKt___ArraysKt.joinTo(arr_z, new StringBuilder(), charSequence0, charSequence1, charSequence2, v, charSequence3, function10)).toString();
        Intrinsics.checkNotNullExpressionValue(s, "toString(...)");
        return s;
    }

    public static String joinToString$default(byte[] arr_b, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function1 function10, int v1, Object object0) {
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
        return ArraysKt___ArraysKt.joinToString(arr_b, charSequence0, charSequence5, charSequence4, v, charSequence3, function10);
    }

    public static String joinToString$default(char[] arr_c, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function1 function10, int v1, Object object0) {
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
        return ArraysKt___ArraysKt.joinToString(arr_c, charSequence0, charSequence5, charSequence4, v, charSequence3, function10);
    }

    public static String joinToString$default(double[] arr_f, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function1 function10, int v1, Object object0) {
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
        return ArraysKt___ArraysKt.joinToString(arr_f, charSequence0, charSequence5, charSequence4, v, charSequence3, function10);
    }

    public static String joinToString$default(float[] arr_f, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function1 function10, int v1, Object object0) {
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
        return ArraysKt___ArraysKt.joinToString(arr_f, charSequence0, charSequence5, charSequence4, v, charSequence3, function10);
    }

    public static String joinToString$default(int[] arr_v, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function1 function10, int v1, Object object0) {
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
        return ArraysKt___ArraysKt.joinToString(arr_v, charSequence0, charSequence5, charSequence4, v, charSequence3, function10);
    }

    public static String joinToString$default(long[] arr_v, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function1 function10, int v1, Object object0) {
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
        return ArraysKt___ArraysKt.joinToString(arr_v, charSequence0, charSequence5, charSequence4, v, charSequence3, function10);
    }

    public static String joinToString$default(Object[] arr_object, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function1 function10, int v1, Object object0) {
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
        return ArraysKt___ArraysKt.joinToString(arr_object, charSequence0, charSequence5, charSequence4, v, charSequence3, function10);
    }

    public static String joinToString$default(short[] arr_v, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function1 function10, int v1, Object object0) {
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
        return ArraysKt___ArraysKt.joinToString(arr_v, charSequence0, charSequence5, charSequence4, v, charSequence3, function10);
    }

    public static String joinToString$default(boolean[] arr_z, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function1 function10, int v1, Object object0) {
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
        return ArraysKt___ArraysKt.joinToString(arr_z, charSequence0, charSequence5, charSequence4, v, charSequence3, function10);
    }

    public static final byte last(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        if(arr_b.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return arr_b[ArraysKt___ArraysKt.getLastIndex(arr_b)];
    }

    public static final byte last(@NotNull byte[] arr_b, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v = arr_b.length - 1;
        if(v >= 0) {
            while(true) {
                byte b = arr_b[v];
                if(((Boolean)function10.invoke(b)).booleanValue()) {
                    return b;
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final char last(@NotNull char[] arr_c) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        if(arr_c.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return arr_c[ArraysKt___ArraysKt.getLastIndex(arr_c)];
    }

    public static final char last(@NotNull char[] arr_c, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v = arr_c.length - 1;
        if(v >= 0) {
            while(true) {
                char c = arr_c[v];
                if(((Boolean)function10.invoke(Character.valueOf(c))).booleanValue()) {
                    return c;
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final double last(@NotNull double[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        if(arr_f.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return arr_f[ArraysKt___ArraysKt.getLastIndex(arr_f)];
    }

    public static final double last(@NotNull double[] arr_f, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v = arr_f.length - 1;
        if(v >= 0) {
            while(true) {
                double f = arr_f[v];
                if(((Boolean)function10.invoke(f)).booleanValue()) {
                    return f;
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final float last(@NotNull float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        if(arr_f.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return arr_f[ArraysKt___ArraysKt.getLastIndex(arr_f)];
    }

    public static final float last(@NotNull float[] arr_f, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v = arr_f.length - 1;
        if(v >= 0) {
            while(true) {
                float f = arr_f[v];
                if(((Boolean)function10.invoke(f)).booleanValue()) {
                    return f;
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final int last(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        if(arr_v.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return arr_v[ArraysKt___ArraysKt.getLastIndex(arr_v)];
    }

    public static final int last(@NotNull int[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v = arr_v.length - 1;
        if(v >= 0) {
            while(true) {
                int v1 = arr_v[v];
                if(((Boolean)function10.invoke(v1)).booleanValue()) {
                    return v1;
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final long last(@NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        if(arr_v.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return arr_v[ArraysKt___ArraysKt.getLastIndex(arr_v)];
    }

    public static final long last(@NotNull long[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v = arr_v.length - 1;
        if(v >= 0) {
            while(true) {
                long v1 = arr_v[v];
                if(((Boolean)function10.invoke(v1)).booleanValue()) {
                    return v1;
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static Object last(@NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        if(arr_object.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return arr_object[ArraysKt___ArraysKt.getLastIndex(arr_object)];
    }

    public static final Object last(@NotNull Object[] arr_object, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v = arr_object.length - 1;
        if(v >= 0) {
            while(true) {
                Object object0 = arr_object[v];
                if(((Boolean)function10.invoke(object0)).booleanValue()) {
                    return object0;
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final short last(@NotNull short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        if(arr_v.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return arr_v[ArraysKt___ArraysKt.getLastIndex(arr_v)];
    }

    public static final short last(@NotNull short[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v = arr_v.length - 1;
        if(v >= 0) {
            while(true) {
                short v1 = arr_v[v];
                if(((Boolean)function10.invoke(v1)).booleanValue()) {
                    return v1;
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final boolean last(@NotNull boolean[] arr_z) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        if(arr_z.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return arr_z[ArraysKt___ArraysKt.getLastIndex(arr_z)];
    }

    public static final boolean last(@NotNull boolean[] arr_z, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v = arr_z.length - 1;
        if(v >= 0) {
            while(true) {
                boolean z = arr_z[v];
                if(((Boolean)function10.invoke(Boolean.valueOf(z))).booleanValue()) {
                    return z;
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static int lastIndexOf(@NotNull byte[] arr_b, byte b) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        int v = arr_b.length - 1;
        if(v >= 0) {
            while(true) {
                if(b == arr_b[v]) {
                    return v;
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        return -1;
    }

    public static final int lastIndexOf(@NotNull char[] arr_c, char c) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        int v = arr_c.length - 1;
        if(v >= 0) {
            while(true) {
                if(c == arr_c[v]) {
                    return v;
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        return -1;
    }

    @Deprecated(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use \'indexOfLast { it == element }\' instead to continue using this behavior, or \'.asList().lastIndexOf(element: T)\' to get the same search behavior as in a list.", replaceWith = @ReplaceWith(expression = "indexOfLast { it == element }", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    public static final int lastIndexOf(double[] arr_f, double f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        int v = arr_f.length - 1;
        if(v >= 0) {
            while(true) {
                if(f == arr_f[v]) {
                    return v;
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        return -1;
    }

    @Deprecated(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use \'indexOfLast { it == element }\' instead to continue using this behavior, or \'.asList().lastIndexOf(element: T)\' to get the same search behavior as in a list.", replaceWith = @ReplaceWith(expression = "indexOfLast { it == element }", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    public static final int lastIndexOf(float[] arr_f, float f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        int v = arr_f.length - 1;
        if(v >= 0) {
            while(true) {
                if(f == arr_f[v]) {
                    return v;
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        return -1;
    }

    public static int lastIndexOf(@NotNull int[] arr_v, int v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        int v1 = arr_v.length - 1;
        if(v1 >= 0) {
            while(true) {
                if(v == arr_v[v1]) {
                    return v1;
                }
                if(v1 - 1 < 0) {
                    break;
                }
                --v1;
            }
        }
        return -1;
    }

    public static int lastIndexOf(@NotNull long[] arr_v, long v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        int v1 = arr_v.length - 1;
        if(v1 >= 0) {
            while(true) {
                if(v == arr_v[v1]) {
                    return v1;
                }
                if(v1 - 1 < 0) {
                    break;
                }
                --v1;
            }
        }
        return -1;
    }

    public static int lastIndexOf(@NotNull Object[] arr_object, Object object0) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        if(object0 == null) {
            int v = arr_object.length - 1;
            if(v >= 0) {
                while(true) {
                    if(arr_object[v] == null) {
                        return v;
                    }
                    if(v - 1 < 0) {
                        break;
                    }
                    --v;
                }
            }
        }
        else {
            int v1 = arr_object.length - 1;
            if(v1 >= 0) {
                while(true) {
                    if(Intrinsics.areEqual(object0, arr_object[v1])) {
                        return v1;
                    }
                    if(v1 - 1 < 0) {
                        break;
                    }
                    --v1;
                }
            }
        }
        return -1;
    }

    public static int lastIndexOf(@NotNull short[] arr_v, short v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        int v1 = arr_v.length - 1;
        if(v1 >= 0) {
            while(true) {
                if(v == arr_v[v1]) {
                    return v1;
                }
                if(v1 - 1 < 0) {
                    break;
                }
                --v1;
            }
        }
        return -1;
    }

    public static final int lastIndexOf(@NotNull boolean[] arr_z, boolean z) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        int v = arr_z.length - 1;
        if(v >= 0) {
            while(true) {
                if(z == arr_z[v]) {
                    return v;
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        return -1;
    }

    @Nullable
    public static final Boolean lastOrNull(@NotNull boolean[] arr_z) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        return arr_z.length == 0 ? null : Boolean.valueOf(arr_z[arr_z.length - 1]);
    }

    @Nullable
    public static final Boolean lastOrNull(@NotNull boolean[] arr_z, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v = arr_z.length - 1;
        if(v >= 0) {
            while(true) {
                boolean z = arr_z[v];
                if(((Boolean)function10.invoke(Boolean.valueOf(z))).booleanValue()) {
                    return Boolean.valueOf(z);
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        return null;
    }

    @Nullable
    public static final Byte lastOrNull(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        return arr_b.length == 0 ? null : ((byte)arr_b[arr_b.length - 1]);
    }

    @Nullable
    public static final Byte lastOrNull(@NotNull byte[] arr_b, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v = arr_b.length - 1;
        if(v >= 0) {
            while(true) {
                int v1 = arr_b[v];
                if(((Boolean)function10.invoke(((byte)v1))).booleanValue()) {
                    return (byte)v1;
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        return null;
    }

    @Nullable
    public static final Character lastOrNull(@NotNull char[] arr_c) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        return arr_c.length == 0 ? null : Character.valueOf(arr_c[arr_c.length - 1]);
    }

    @Nullable
    public static final Character lastOrNull(@NotNull char[] arr_c, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v = arr_c.length - 1;
        if(v >= 0) {
            while(true) {
                int v1 = arr_c[v];
                if(((Boolean)function10.invoke(Character.valueOf(((char)v1)))).booleanValue()) {
                    return Character.valueOf(((char)v1));
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        return null;
    }

    @Nullable
    public static final Double lastOrNull(@NotNull double[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        return arr_f.length == 0 ? null : ((double)arr_f[arr_f.length - 1]);
    }

    @Nullable
    public static final Double lastOrNull(@NotNull double[] arr_f, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v = arr_f.length - 1;
        if(v >= 0) {
            while(true) {
                double f = arr_f[v];
                if(((Boolean)function10.invoke(f)).booleanValue()) {
                    return f;
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        return null;
    }

    @Nullable
    public static final Float lastOrNull(@NotNull float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        return arr_f.length == 0 ? null : ((float)arr_f[arr_f.length - 1]);
    }

    @Nullable
    public static final Float lastOrNull(@NotNull float[] arr_f, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v = arr_f.length - 1;
        if(v >= 0) {
            while(true) {
                float f = arr_f[v];
                if(((Boolean)function10.invoke(f)).booleanValue()) {
                    return f;
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        return null;
    }

    @Nullable
    public static final Integer lastOrNull(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        return arr_v.length == 0 ? null : ((int)arr_v[arr_v.length - 1]);
    }

    @Nullable
    public static final Integer lastOrNull(@NotNull int[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v = arr_v.length - 1;
        if(v >= 0) {
            while(true) {
                int v1 = arr_v[v];
                if(((Boolean)function10.invoke(v1)).booleanValue()) {
                    return v1;
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        return null;
    }

    @Nullable
    public static final Long lastOrNull(@NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        return arr_v.length == 0 ? null : ((long)arr_v[arr_v.length - 1]);
    }

    @Nullable
    public static final Long lastOrNull(@NotNull long[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v = arr_v.length - 1;
        if(v >= 0) {
            while(true) {
                long v1 = arr_v[v];
                if(((Boolean)function10.invoke(v1)).booleanValue()) {
                    return v1;
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        return null;
    }

    @Nullable
    public static Object lastOrNull(@NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        return arr_object.length == 0 ? null : arr_object[arr_object.length - 1];
    }

    @Nullable
    public static final Object lastOrNull(@NotNull Object[] arr_object, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v = arr_object.length - 1;
        if(v >= 0) {
            while(true) {
                Object object0 = arr_object[v];
                if(((Boolean)function10.invoke(object0)).booleanValue()) {
                    return object0;
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        return null;
    }

    @Nullable
    public static final Short lastOrNull(@NotNull short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        return arr_v.length == 0 ? null : ((short)arr_v[arr_v.length - 1]);
    }

    @Nullable
    public static final Short lastOrNull(@NotNull short[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v = arr_v.length - 1;
        if(v >= 0) {
            while(true) {
                int v1 = arr_v[v];
                if(((Boolean)function10.invoke(((short)v1))).booleanValue()) {
                    return (short)v1;
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        return null;
    }

    @NotNull
    public static final List map(@NotNull byte[] arr_b, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(function10, "transform");
        List list0 = new ArrayList(arr_b.length);
        for(int v = 0; v < arr_b.length; ++v) {
            list0.add(function10.invoke(((byte)arr_b[v])));
        }
        return list0;
    }

    @NotNull
    public static final List map(@NotNull char[] arr_c, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(function10, "transform");
        List list0 = new ArrayList(arr_c.length);
        for(int v = 0; v < arr_c.length; ++v) {
            list0.add(function10.invoke(Character.valueOf(arr_c[v])));
        }
        return list0;
    }

    @NotNull
    public static final List map(@NotNull double[] arr_f, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "transform");
        List list0 = new ArrayList(arr_f.length);
        for(int v = 0; v < arr_f.length; ++v) {
            list0.add(function10.invoke(((double)arr_f[v])));
        }
        return list0;
    }

    @NotNull
    public static final List map(@NotNull float[] arr_f, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "transform");
        List list0 = new ArrayList(arr_f.length);
        for(int v = 0; v < arr_f.length; ++v) {
            list0.add(function10.invoke(((float)arr_f[v])));
        }
        return list0;
    }

    @NotNull
    public static final List map(@NotNull int[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "transform");
        List list0 = new ArrayList(arr_v.length);
        for(int v = 0; v < arr_v.length; ++v) {
            list0.add(function10.invoke(((int)arr_v[v])));
        }
        return list0;
    }

    @NotNull
    public static final List map(@NotNull long[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "transform");
        List list0 = new ArrayList(arr_v.length);
        for(int v = 0; v < arr_v.length; ++v) {
            list0.add(function10.invoke(((long)arr_v[v])));
        }
        return list0;
    }

    @NotNull
    public static List map(@NotNull Object[] arr_object, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(function10, "transform");
        List list0 = new ArrayList(arr_object.length);
        for(int v = 0; v < arr_object.length; ++v) {
            list0.add(function10.invoke(arr_object[v]));
        }
        return list0;
    }

    @NotNull
    public static final List map(@NotNull short[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "transform");
        List list0 = new ArrayList(arr_v.length);
        for(int v = 0; v < arr_v.length; ++v) {
            list0.add(function10.invoke(((short)arr_v[v])));
        }
        return list0;
    }

    @NotNull
    public static final List map(@NotNull boolean[] arr_z, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(function10, "transform");
        List list0 = new ArrayList(arr_z.length);
        for(int v = 0; v < arr_z.length; ++v) {
            list0.add(function10.invoke(Boolean.valueOf(arr_z[v])));
        }
        return list0;
    }

    @NotNull
    public static final List mapIndexed(@NotNull byte[] arr_b, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(function20, "transform");
        List list0 = new ArrayList(arr_b.length);
        int v = 0;
        for(int v1 = 0; v < arr_b.length; ++v1) {
            list0.add(function20.invoke(v1, ((byte)arr_b[v])));
            ++v;
        }
        return list0;
    }

    @NotNull
    public static final List mapIndexed(@NotNull char[] arr_c, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(function20, "transform");
        List list0 = new ArrayList(arr_c.length);
        int v = 0;
        for(int v1 = 0; v < arr_c.length; ++v1) {
            list0.add(function20.invoke(v1, Character.valueOf(arr_c[v])));
            ++v;
        }
        return list0;
    }

    @NotNull
    public static final List mapIndexed(@NotNull double[] arr_f, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function20, "transform");
        List list0 = new ArrayList(arr_f.length);
        int v = 0;
        for(int v1 = 0; v < arr_f.length; ++v1) {
            list0.add(function20.invoke(v1, ((double)arr_f[v])));
            ++v;
        }
        return list0;
    }

    @NotNull
    public static final List mapIndexed(@NotNull float[] arr_f, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function20, "transform");
        List list0 = new ArrayList(arr_f.length);
        int v = 0;
        for(int v1 = 0; v < arr_f.length; ++v1) {
            list0.add(function20.invoke(v1, ((float)arr_f[v])));
            ++v;
        }
        return list0;
    }

    @NotNull
    public static final List mapIndexed(@NotNull int[] arr_v, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function20, "transform");
        List list0 = new ArrayList(arr_v.length);
        int v = 0;
        for(int v1 = 0; v < arr_v.length; ++v1) {
            list0.add(function20.invoke(v1, ((int)arr_v[v])));
            ++v;
        }
        return list0;
    }

    @NotNull
    public static final List mapIndexed(@NotNull long[] arr_v, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function20, "transform");
        List list0 = new ArrayList(arr_v.length);
        int v = 0;
        for(int v1 = 0; v < arr_v.length; ++v1) {
            list0.add(function20.invoke(v1, ((long)arr_v[v])));
            ++v;
        }
        return list0;
    }

    @NotNull
    public static final List mapIndexed(@NotNull Object[] arr_object, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(function20, "transform");
        List list0 = new ArrayList(arr_object.length);
        int v = 0;
        for(int v1 = 0; v < arr_object.length; ++v1) {
            list0.add(function20.invoke(v1, arr_object[v]));
            ++v;
        }
        return list0;
    }

    @NotNull
    public static final List mapIndexed(@NotNull short[] arr_v, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function20, "transform");
        List list0 = new ArrayList(arr_v.length);
        int v = 0;
        for(int v1 = 0; v < arr_v.length; ++v1) {
            list0.add(function20.invoke(v1, ((short)arr_v[v])));
            ++v;
        }
        return list0;
    }

    @NotNull
    public static final List mapIndexed(@NotNull boolean[] arr_z, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(function20, "transform");
        List list0 = new ArrayList(arr_z.length);
        int v = 0;
        for(int v1 = 0; v < arr_z.length; ++v1) {
            list0.add(function20.invoke(v1, Boolean.valueOf(arr_z[v])));
            ++v;
        }
        return list0;
    }

    @NotNull
    public static final List mapIndexedNotNull(@NotNull Object[] arr_object, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(function20, "transform");
        List list0 = new ArrayList();
        int v = 0;
        for(int v1 = 0; v < arr_object.length; ++v1) {
            Object object0 = function20.invoke(v1, arr_object[v]);
            if(object0 != null) {
                list0.add(object0);
            }
            ++v;
        }
        return list0;
    }

    @NotNull
    public static final Collection mapIndexedNotNullTo(@NotNull Object[] arr_object, @NotNull Collection collection0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function20, "transform");
        int v = 0;
        for(int v1 = 0; v < arr_object.length; ++v1) {
            Object object0 = function20.invoke(v1, arr_object[v]);
            if(object0 != null) {
                collection0.add(object0);
            }
            ++v;
        }
        return collection0;
    }

    @NotNull
    public static final Collection mapIndexedTo(@NotNull byte[] arr_b, @NotNull Collection collection0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function20, "transform");
        int v = 0;
        for(int v1 = 0; v < arr_b.length; ++v1) {
            collection0.add(function20.invoke(v1, ((byte)arr_b[v])));
            ++v;
        }
        return collection0;
    }

    @NotNull
    public static final Collection mapIndexedTo(@NotNull char[] arr_c, @NotNull Collection collection0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function20, "transform");
        int v = 0;
        for(int v1 = 0; v < arr_c.length; ++v1) {
            collection0.add(function20.invoke(v1, Character.valueOf(arr_c[v])));
            ++v;
        }
        return collection0;
    }

    @NotNull
    public static final Collection mapIndexedTo(@NotNull double[] arr_f, @NotNull Collection collection0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function20, "transform");
        int v = 0;
        for(int v1 = 0; v < arr_f.length; ++v1) {
            collection0.add(function20.invoke(v1, ((double)arr_f[v])));
            ++v;
        }
        return collection0;
    }

    @NotNull
    public static final Collection mapIndexedTo(@NotNull float[] arr_f, @NotNull Collection collection0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function20, "transform");
        int v = 0;
        for(int v1 = 0; v < arr_f.length; ++v1) {
            collection0.add(function20.invoke(v1, ((float)arr_f[v])));
            ++v;
        }
        return collection0;
    }

    @NotNull
    public static final Collection mapIndexedTo(@NotNull int[] arr_v, @NotNull Collection collection0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function20, "transform");
        int v = 0;
        for(int v1 = 0; v < arr_v.length; ++v1) {
            collection0.add(function20.invoke(v1, ((int)arr_v[v])));
            ++v;
        }
        return collection0;
    }

    @NotNull
    public static final Collection mapIndexedTo(@NotNull long[] arr_v, @NotNull Collection collection0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function20, "transform");
        int v = 0;
        for(int v1 = 0; v < arr_v.length; ++v1) {
            collection0.add(function20.invoke(v1, ((long)arr_v[v])));
            ++v;
        }
        return collection0;
    }

    @NotNull
    public static final Collection mapIndexedTo(@NotNull Object[] arr_object, @NotNull Collection collection0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function20, "transform");
        int v = 0;
        for(int v1 = 0; v < arr_object.length; ++v1) {
            collection0.add(function20.invoke(v1, arr_object[v]));
            ++v;
        }
        return collection0;
    }

    @NotNull
    public static final Collection mapIndexedTo(@NotNull short[] arr_v, @NotNull Collection collection0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function20, "transform");
        int v = 0;
        for(int v1 = 0; v < arr_v.length; ++v1) {
            collection0.add(function20.invoke(v1, ((short)arr_v[v])));
            ++v;
        }
        return collection0;
    }

    @NotNull
    public static final Collection mapIndexedTo(@NotNull boolean[] arr_z, @NotNull Collection collection0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function20, "transform");
        int v = 0;
        for(int v1 = 0; v < arr_z.length; ++v1) {
            collection0.add(function20.invoke(v1, Boolean.valueOf(arr_z[v])));
            ++v;
        }
        return collection0;
    }

    @NotNull
    public static final List mapNotNull(@NotNull Object[] arr_object, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(function10, "transform");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = function10.invoke(arr_object[v]);
            if(object0 != null) {
                list0.add(object0);
            }
        }
        return list0;
    }

    @NotNull
    public static final Collection mapNotNullTo(@NotNull Object[] arr_object, @NotNull Collection collection0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function10, "transform");
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = function10.invoke(arr_object[v]);
            if(object0 != null) {
                collection0.add(object0);
            }
        }
        return collection0;
    }

    @NotNull
    public static final Collection mapTo(@NotNull byte[] arr_b, @NotNull Collection collection0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function10, "transform");
        for(int v = 0; v < arr_b.length; ++v) {
            collection0.add(function10.invoke(((byte)arr_b[v])));
        }
        return collection0;
    }

    @NotNull
    public static final Collection mapTo(@NotNull char[] arr_c, @NotNull Collection collection0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function10, "transform");
        for(int v = 0; v < arr_c.length; ++v) {
            collection0.add(function10.invoke(Character.valueOf(arr_c[v])));
        }
        return collection0;
    }

    @NotNull
    public static final Collection mapTo(@NotNull double[] arr_f, @NotNull Collection collection0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function10, "transform");
        for(int v = 0; v < arr_f.length; ++v) {
            collection0.add(function10.invoke(((double)arr_f[v])));
        }
        return collection0;
    }

    @NotNull
    public static final Collection mapTo(@NotNull float[] arr_f, @NotNull Collection collection0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function10, "transform");
        for(int v = 0; v < arr_f.length; ++v) {
            collection0.add(function10.invoke(((float)arr_f[v])));
        }
        return collection0;
    }

    @NotNull
    public static final Collection mapTo(@NotNull int[] arr_v, @NotNull Collection collection0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function10, "transform");
        for(int v = 0; v < arr_v.length; ++v) {
            collection0.add(function10.invoke(((int)arr_v[v])));
        }
        return collection0;
    }

    @NotNull
    public static final Collection mapTo(@NotNull long[] arr_v, @NotNull Collection collection0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function10, "transform");
        for(int v = 0; v < arr_v.length; ++v) {
            collection0.add(function10.invoke(((long)arr_v[v])));
        }
        return collection0;
    }

    @NotNull
    public static final Collection mapTo(@NotNull Object[] arr_object, @NotNull Collection collection0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function10, "transform");
        for(int v = 0; v < arr_object.length; ++v) {
            collection0.add(function10.invoke(arr_object[v]));
        }
        return collection0;
    }

    @NotNull
    public static final Collection mapTo(@NotNull short[] arr_v, @NotNull Collection collection0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function10, "transform");
        for(int v = 0; v < arr_v.length; ++v) {
            collection0.add(function10.invoke(((short)arr_v[v])));
        }
        return collection0;
    }

    @NotNull
    public static final Collection mapTo(@NotNull boolean[] arr_z, @NotNull Collection collection0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function10, "transform");
        for(int v = 0; v < arr_z.length; ++v) {
            collection0.add(function10.invoke(Boolean.valueOf(arr_z[v])));
        }
        return collection0;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Boolean maxByOrNull(@NotNull boolean[] arr_z, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        if(arr_z.length == 0) {
            return null;
        }
        boolean z = arr_z[0];
        int v = ArraysKt___ArraysKt.getLastIndex(arr_z);
        if(v == 0) {
            return Boolean.valueOf(z);
        }
        Comparable comparable0 = (Comparable)function10.invoke(Boolean.valueOf(z));
        IntIterator intIterator0 = r0.a.t(1, v);
        while(intIterator0.hasNext()) {
            boolean z1 = arr_z[intIterator0.nextInt()];
            Comparable comparable1 = (Comparable)function10.invoke(Boolean.valueOf(z1));
            if(comparable0.compareTo(comparable1) < 0) {
                z = z1;
                comparable0 = comparable1;
            }
        }
        return Boolean.valueOf(z);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Byte maxByOrNull(@NotNull byte[] arr_b, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        if(arr_b.length == 0) {
            return null;
        }
        int v = arr_b[0];
        int v1 = ArraysKt___ArraysKt.getLastIndex(arr_b);
        if(v1 == 0) {
            return (byte)v;
        }
        Comparable comparable0 = (Comparable)function10.invoke(((byte)v));
        IntIterator intIterator0 = r0.a.t(1, v1);
        while(intIterator0.hasNext()) {
            int v2 = arr_b[intIterator0.nextInt()];
            Comparable comparable1 = (Comparable)function10.invoke(((byte)v2));
            if(comparable0.compareTo(comparable1) < 0) {
                v = v2;
                comparable0 = comparable1;
            }
        }
        return (byte)v;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character maxByOrNull(@NotNull char[] arr_c, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        if(arr_c.length == 0) {
            return null;
        }
        int v = arr_c[0];
        int v1 = ArraysKt___ArraysKt.getLastIndex(arr_c);
        if(v1 == 0) {
            return Character.valueOf(((char)v));
        }
        Comparable comparable0 = (Comparable)function10.invoke(Character.valueOf(((char)v)));
        IntIterator intIterator0 = r0.a.t(1, v1);
        while(intIterator0.hasNext()) {
            int v2 = arr_c[intIterator0.nextInt()];
            Comparable comparable1 = (Comparable)function10.invoke(Character.valueOf(((char)v2)));
            if(comparable0.compareTo(comparable1) < 0) {
                v = v2;
                comparable0 = comparable1;
            }
        }
        return Character.valueOf(((char)v));
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Double maxByOrNull(@NotNull double[] arr_f, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        if(arr_f.length == 0) {
            return null;
        }
        double f = arr_f[0];
        int v = ArraysKt___ArraysKt.getLastIndex(arr_f);
        if(v == 0) {
            return f;
        }
        Comparable comparable0 = (Comparable)function10.invoke(f);
        IntIterator intIterator0 = r0.a.t(1, v);
        while(intIterator0.hasNext()) {
            double f1 = arr_f[intIterator0.nextInt()];
            Comparable comparable1 = (Comparable)function10.invoke(f1);
            if(comparable0.compareTo(comparable1) < 0) {
                f = f1;
                comparable0 = comparable1;
            }
        }
        return f;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Float maxByOrNull(@NotNull float[] arr_f, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        if(arr_f.length == 0) {
            return null;
        }
        float f = arr_f[0];
        int v = ArraysKt___ArraysKt.getLastIndex(arr_f);
        if(v == 0) {
            return f;
        }
        Comparable comparable0 = (Comparable)function10.invoke(f);
        IntIterator intIterator0 = r0.a.t(1, v);
        while(intIterator0.hasNext()) {
            float f1 = arr_f[intIterator0.nextInt()];
            Comparable comparable1 = (Comparable)function10.invoke(f1);
            if(comparable0.compareTo(comparable1) < 0) {
                f = f1;
                comparable0 = comparable1;
            }
        }
        return f;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Integer maxByOrNull(@NotNull int[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        if(arr_v.length == 0) {
            return null;
        }
        int v = arr_v[0];
        int v1 = ArraysKt___ArraysKt.getLastIndex(arr_v);
        if(v1 == 0) {
            return v;
        }
        Comparable comparable0 = (Comparable)function10.invoke(v);
        IntIterator intIterator0 = r0.a.t(1, v1);
        while(intIterator0.hasNext()) {
            int v2 = arr_v[intIterator0.nextInt()];
            Comparable comparable1 = (Comparable)function10.invoke(v2);
            if(comparable0.compareTo(comparable1) < 0) {
                v = v2;
                comparable0 = comparable1;
            }
        }
        return v;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Long maxByOrNull(@NotNull long[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        if(arr_v.length == 0) {
            return null;
        }
        long v = arr_v[0];
        int v1 = ArraysKt___ArraysKt.getLastIndex(arr_v);
        if(v1 == 0) {
            return v;
        }
        Comparable comparable0 = (Comparable)function10.invoke(v);
        IntIterator intIterator0 = r0.a.t(1, v1);
        while(intIterator0.hasNext()) {
            long v2 = arr_v[intIterator0.nextInt()];
            Comparable comparable1 = (Comparable)function10.invoke(v2);
            if(comparable0.compareTo(comparable1) < 0) {
                v = v2;
                comparable0 = comparable1;
            }
        }
        return v;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Object maxByOrNull(@NotNull Object[] arr_object, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        if(arr_object.length == 0) {
            return null;
        }
        Object object0 = arr_object[0];
        int v = ArraysKt___ArraysKt.getLastIndex(arr_object);
        if(v == 0) {
            return object0;
        }
        Comparable comparable0 = (Comparable)function10.invoke(object0);
        IntIterator intIterator0 = r0.a.t(1, v);
        while(intIterator0.hasNext()) {
            Object object1 = arr_object[intIterator0.nextInt()];
            Comparable comparable1 = (Comparable)function10.invoke(object1);
            if(comparable0.compareTo(comparable1) < 0) {
                object0 = object1;
                comparable0 = comparable1;
            }
        }
        return object0;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Short maxByOrNull(@NotNull short[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        if(arr_v.length == 0) {
            return null;
        }
        int v = arr_v[0];
        int v1 = ArraysKt___ArraysKt.getLastIndex(arr_v);
        if(v1 == 0) {
            return (short)v;
        }
        Comparable comparable0 = (Comparable)function10.invoke(((short)v));
        IntIterator intIterator0 = r0.a.t(1, v1);
        while(intIterator0.hasNext()) {
            int v2 = arr_v[intIterator0.nextInt()];
            Comparable comparable1 = (Comparable)function10.invoke(((short)v2));
            if(comparable0.compareTo(comparable1) < 0) {
                v = v2;
                comparable0 = comparable1;
            }
        }
        return (short)v;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxByOrThrow")
    public static final byte maxByOrThrow(@NotNull byte[] arr_b, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        if(arr_b.length == 0) {
            throw new NoSuchElementException();
        }
        byte b = arr_b[0];
        int v = ArraysKt___ArraysKt.getLastIndex(arr_b);
        if(v == 0) {
            return b;
        }
        Comparable comparable0 = (Comparable)function10.invoke(b);
        IntIterator intIterator0 = r0.a.t(1, v);
        while(intIterator0.hasNext()) {
            byte b1 = arr_b[intIterator0.nextInt()];
            Comparable comparable1 = (Comparable)function10.invoke(b1);
            if(comparable0.compareTo(comparable1) < 0) {
                b = b1;
                comparable0 = comparable1;
            }
        }
        return b;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxByOrThrow")
    public static final char maxByOrThrow(@NotNull char[] arr_c, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        if(arr_c.length == 0) {
            throw new NoSuchElementException();
        }
        char c = arr_c[0];
        int v = ArraysKt___ArraysKt.getLastIndex(arr_c);
        if(v == 0) {
            return c;
        }
        Comparable comparable0 = (Comparable)function10.invoke(Character.valueOf(c));
        IntIterator intIterator0 = r0.a.t(1, v);
        while(intIterator0.hasNext()) {
            char c1 = arr_c[intIterator0.nextInt()];
            Comparable comparable1 = (Comparable)function10.invoke(Character.valueOf(c1));
            if(comparable0.compareTo(comparable1) < 0) {
                c = c1;
                comparable0 = comparable1;
            }
        }
        return c;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxByOrThrow")
    public static final double maxByOrThrow(@NotNull double[] arr_f, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        if(arr_f.length == 0) {
            throw new NoSuchElementException();
        }
        double f = arr_f[0];
        int v = ArraysKt___ArraysKt.getLastIndex(arr_f);
        if(v == 0) {
            return f;
        }
        Comparable comparable0 = (Comparable)function10.invoke(f);
        IntIterator intIterator0 = r0.a.t(1, v);
        while(intIterator0.hasNext()) {
            double f1 = arr_f[intIterator0.nextInt()];
            Comparable comparable1 = (Comparable)function10.invoke(f1);
            if(comparable0.compareTo(comparable1) < 0) {
                f = f1;
                comparable0 = comparable1;
            }
        }
        return f;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxByOrThrow")
    public static final float maxByOrThrow(@NotNull float[] arr_f, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        if(arr_f.length == 0) {
            throw new NoSuchElementException();
        }
        float f = arr_f[0];
        int v = ArraysKt___ArraysKt.getLastIndex(arr_f);
        if(v == 0) {
            return f;
        }
        Comparable comparable0 = (Comparable)function10.invoke(f);
        IntIterator intIterator0 = r0.a.t(1, v);
        while(intIterator0.hasNext()) {
            float f1 = arr_f[intIterator0.nextInt()];
            Comparable comparable1 = (Comparable)function10.invoke(f1);
            if(comparable0.compareTo(comparable1) < 0) {
                f = f1;
                comparable0 = comparable1;
            }
        }
        return f;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxByOrThrow")
    public static final int maxByOrThrow(@NotNull int[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        if(arr_v.length == 0) {
            throw new NoSuchElementException();
        }
        int v = arr_v[0];
        int v1 = ArraysKt___ArraysKt.getLastIndex(arr_v);
        if(v1 == 0) {
            return v;
        }
        Comparable comparable0 = (Comparable)function10.invoke(v);
        IntIterator intIterator0 = r0.a.t(1, v1);
        while(intIterator0.hasNext()) {
            int v2 = arr_v[intIterator0.nextInt()];
            Comparable comparable1 = (Comparable)function10.invoke(v2);
            if(comparable0.compareTo(comparable1) < 0) {
                v = v2;
                comparable0 = comparable1;
            }
        }
        return v;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxByOrThrow")
    public static final long maxByOrThrow(@NotNull long[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        if(arr_v.length == 0) {
            throw new NoSuchElementException();
        }
        long v = arr_v[0];
        int v1 = ArraysKt___ArraysKt.getLastIndex(arr_v);
        if(v1 == 0) {
            return v;
        }
        Comparable comparable0 = (Comparable)function10.invoke(v);
        IntIterator intIterator0 = r0.a.t(1, v1);
        while(intIterator0.hasNext()) {
            long v2 = arr_v[intIterator0.nextInt()];
            Comparable comparable1 = (Comparable)function10.invoke(v2);
            if(comparable0.compareTo(comparable1) < 0) {
                v = v2;
                comparable0 = comparable1;
            }
        }
        return v;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxByOrThrow")
    public static final Object maxByOrThrow(@NotNull Object[] arr_object, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        if(arr_object.length == 0) {
            throw new NoSuchElementException();
        }
        Object object0 = arr_object[0];
        int v = ArraysKt___ArraysKt.getLastIndex(arr_object);
        if(v == 0) {
            return object0;
        }
        Comparable comparable0 = (Comparable)function10.invoke(object0);
        IntIterator intIterator0 = r0.a.t(1, v);
        while(intIterator0.hasNext()) {
            Object object1 = arr_object[intIterator0.nextInt()];
            Comparable comparable1 = (Comparable)function10.invoke(object1);
            if(comparable0.compareTo(comparable1) < 0) {
                object0 = object1;
                comparable0 = comparable1;
            }
        }
        return object0;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxByOrThrow")
    public static final short maxByOrThrow(@NotNull short[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        if(arr_v.length == 0) {
            throw new NoSuchElementException();
        }
        short v = arr_v[0];
        int v1 = ArraysKt___ArraysKt.getLastIndex(arr_v);
        if(v1 == 0) {
            return v;
        }
        Comparable comparable0 = (Comparable)function10.invoke(v);
        IntIterator intIterator0 = r0.a.t(1, v1);
        while(intIterator0.hasNext()) {
            short v2 = arr_v[intIterator0.nextInt()];
            Comparable comparable1 = (Comparable)function10.invoke(v2);
            if(comparable0.compareTo(comparable1) < 0) {
                v = v2;
                comparable0 = comparable1;
            }
        }
        return v;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxByOrThrow")
    public static final boolean maxByOrThrow(@NotNull boolean[] arr_z, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        if(arr_z.length == 0) {
            throw new NoSuchElementException();
        }
        boolean z = arr_z[0];
        int v = ArraysKt___ArraysKt.getLastIndex(arr_z);
        if(v == 0) {
            return z;
        }
        Comparable comparable0 = (Comparable)function10.invoke(Boolean.valueOf(z));
        IntIterator intIterator0 = r0.a.t(1, v);
        while(intIterator0.hasNext()) {
            boolean z1 = arr_z[intIterator0.nextInt()];
            Comparable comparable1 = (Comparable)function10.invoke(Boolean.valueOf(z1));
            if(comparable0.compareTo(comparable1) < 0) {
                z = z1;
                comparable0 = comparable1;
            }
        }
        return z;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Byte maxOrNull(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        if(arr_b.length == 0) {
            return null;
        }
        int v = arr_b[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_b)).iterator();
        while(intIterator0.hasNext()) {
            int v1 = arr_b[intIterator0.nextInt()];
            if(v < v1) {
                v = v1;
            }
        }
        return (byte)v;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character maxOrNull(@NotNull char[] arr_c) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        if(arr_c.length == 0) {
            return null;
        }
        int v = arr_c[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_c)).iterator();
        while(intIterator0.hasNext()) {
            int v1 = arr_c[intIterator0.nextInt()];
            if(Intrinsics.compare(v, v1) < 0) {
                v = v1;
            }
        }
        return Character.valueOf(((char)v));
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Comparable maxOrNull(@NotNull Comparable[] arr_comparable) {
        Intrinsics.checkNotNullParameter(arr_comparable, "<this>");
        if(arr_comparable.length == 0) {
            return null;
        }
        Comparable comparable0 = arr_comparable[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_comparable)).iterator();
        while(intIterator0.hasNext()) {
            Comparable comparable1 = arr_comparable[intIterator0.nextInt()];
            if(comparable0.compareTo(comparable1) < 0) {
                comparable0 = comparable1;
            }
        }
        return comparable0;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Double maxOrNull(@NotNull double[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        if(arr_f.length == 0) {
            return null;
        }
        double f = arr_f[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_f)).iterator();
        while(intIterator0.hasNext()) {
            f = Math.max(f, arr_f[intIterator0.nextInt()]);
        }
        return f;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Double maxOrNull(@NotNull Double[] arr_double) {
        Intrinsics.checkNotNullParameter(arr_double, "<this>");
        if(arr_double.length == 0) {
            return null;
        }
        double f = (double)arr_double[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_double)).iterator();
        while(intIterator0.hasNext()) {
            f = Math.max(f, ((double)arr_double[intIterator0.nextInt()]));
        }
        return f;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Float maxOrNull(@NotNull float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        if(arr_f.length == 0) {
            return null;
        }
        float f = arr_f[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_f)).iterator();
        while(intIterator0.hasNext()) {
            f = Math.max(f, arr_f[intIterator0.nextInt()]);
        }
        return f;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Float maxOrNull(@NotNull Float[] arr_float) {
        Intrinsics.checkNotNullParameter(arr_float, "<this>");
        if(arr_float.length == 0) {
            return null;
        }
        float f = (float)arr_float[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_float)).iterator();
        while(intIterator0.hasNext()) {
            f = Math.max(f, ((float)arr_float[intIterator0.nextInt()]));
        }
        return f;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static Integer maxOrNull(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        if(arr_v.length == 0) {
            return null;
        }
        int v = arr_v[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_v)).iterator();
        while(intIterator0.hasNext()) {
            int v1 = arr_v[intIterator0.nextInt()];
            if(v < v1) {
                v = v1;
            }
        }
        return v;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Long maxOrNull(@NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        if(arr_v.length == 0) {
            return null;
        }
        long v = arr_v[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_v)).iterator();
        while(intIterator0.hasNext()) {
            long v1 = arr_v[intIterator0.nextInt()];
            if(v < v1) {
                v = v1;
            }
        }
        return v;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Short maxOrNull(@NotNull short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        if(arr_v.length == 0) {
            return null;
        }
        int v = arr_v[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_v)).iterator();
        while(intIterator0.hasNext()) {
            int v1 = arr_v[intIterator0.nextInt()];
            if(v < v1) {
                v = v1;
            }
        }
        return (short)v;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxOrThrow")
    public static final byte maxOrThrow(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        if(arr_b.length == 0) {
            throw new NoSuchElementException();
        }
        byte b = arr_b[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_b)).iterator();
        while(intIterator0.hasNext()) {
            byte b1 = arr_b[intIterator0.nextInt()];
            if(b < b1) {
                b = b1;
            }
        }
        return b;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxOrThrow")
    public static final char maxOrThrow(@NotNull char[] arr_c) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        if(arr_c.length == 0) {
            throw new NoSuchElementException();
        }
        char c = arr_c[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_c)).iterator();
        while(intIterator0.hasNext()) {
            char c1 = arr_c[intIterator0.nextInt()];
            if(Intrinsics.compare(c, c1) < 0) {
                c = c1;
            }
        }
        return c;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxOrThrow")
    public static final double maxOrThrow(@NotNull double[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        if(arr_f.length == 0) {
            throw new NoSuchElementException();
        }
        double f = arr_f[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_f)).iterator();
        while(intIterator0.hasNext()) {
            f = Math.max(f, arr_f[intIterator0.nextInt()]);
        }
        return f;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxOrThrow")
    public static final double maxOrThrow(@NotNull Double[] arr_double) {
        Intrinsics.checkNotNullParameter(arr_double, "<this>");
        if(arr_double.length == 0) {
            throw new NoSuchElementException();
        }
        double f = (double)arr_double[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_double)).iterator();
        while(intIterator0.hasNext()) {
            f = Math.max(f, ((double)arr_double[intIterator0.nextInt()]));
        }
        return f;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxOrThrow")
    public static final float maxOrThrow(@NotNull float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        if(arr_f.length == 0) {
            throw new NoSuchElementException();
        }
        float f = arr_f[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_f)).iterator();
        while(intIterator0.hasNext()) {
            f = Math.max(f, arr_f[intIterator0.nextInt()]);
        }
        return f;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxOrThrow")
    public static final float maxOrThrow(@NotNull Float[] arr_float) {
        Intrinsics.checkNotNullParameter(arr_float, "<this>");
        if(arr_float.length == 0) {
            throw new NoSuchElementException();
        }
        float f = (float)arr_float[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_float)).iterator();
        while(intIterator0.hasNext()) {
            f = Math.max(f, ((float)arr_float[intIterator0.nextInt()]));
        }
        return f;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxOrThrow")
    public static int maxOrThrow(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        if(arr_v.length == 0) {
            throw new NoSuchElementException();
        }
        int v = arr_v[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_v)).iterator();
        while(intIterator0.hasNext()) {
            int v1 = arr_v[intIterator0.nextInt()];
            if(v < v1) {
                v = v1;
            }
        }
        return v;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxOrThrow")
    public static final long maxOrThrow(@NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        if(arr_v.length == 0) {
            throw new NoSuchElementException();
        }
        long v = arr_v[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_v)).iterator();
        while(intIterator0.hasNext()) {
            long v1 = arr_v[intIterator0.nextInt()];
            if(v < v1) {
                v = v1;
            }
        }
        return v;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxOrThrow")
    @NotNull
    public static final Comparable maxOrThrow(@NotNull Comparable[] arr_comparable) {
        Intrinsics.checkNotNullParameter(arr_comparable, "<this>");
        if(arr_comparable.length == 0) {
            throw new NoSuchElementException();
        }
        Comparable comparable0 = arr_comparable[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_comparable)).iterator();
        while(intIterator0.hasNext()) {
            Comparable comparable1 = arr_comparable[intIterator0.nextInt()];
            if(comparable0.compareTo(comparable1) < 0) {
                comparable0 = comparable1;
            }
        }
        return comparable0;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxOrThrow")
    public static final short maxOrThrow(@NotNull short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        if(arr_v.length == 0) {
            throw new NoSuchElementException();
        }
        short v = arr_v[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_v)).iterator();
        while(intIterator0.hasNext()) {
            short v1 = arr_v[intIterator0.nextInt()];
            if(v < v1) {
                v = v1;
            }
        }
        return v;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Boolean maxWithOrNull(@NotNull boolean[] arr_z, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        if(arr_z.length == 0) {
            return null;
        }
        boolean z = arr_z[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_z)).iterator();
        while(intIterator0.hasNext()) {
            boolean z1 = arr_z[intIterator0.nextInt()];
            if(comparator0.compare(Boolean.valueOf(z), Boolean.valueOf(z1)) < 0) {
                z = z1;
            }
        }
        return Boolean.valueOf(z);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Byte maxWithOrNull(@NotNull byte[] arr_b, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        if(arr_b.length == 0) {
            return null;
        }
        int v = arr_b[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_b)).iterator();
        while(intIterator0.hasNext()) {
            int v1 = arr_b[intIterator0.nextInt()];
            if(comparator0.compare(((byte)v), ((byte)v1)) < 0) {
                v = v1;
            }
        }
        return (byte)v;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character maxWithOrNull(@NotNull char[] arr_c, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        if(arr_c.length == 0) {
            return null;
        }
        int v = arr_c[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_c)).iterator();
        while(intIterator0.hasNext()) {
            int v1 = arr_c[intIterator0.nextInt()];
            if(comparator0.compare(Character.valueOf(((char)v)), Character.valueOf(((char)v1))) < 0) {
                v = v1;
            }
        }
        return Character.valueOf(((char)v));
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Double maxWithOrNull(@NotNull double[] arr_f, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        if(arr_f.length == 0) {
            return null;
        }
        double f = arr_f[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_f)).iterator();
        while(intIterator0.hasNext()) {
            double f1 = arr_f[intIterator0.nextInt()];
            if(comparator0.compare(f, f1) < 0) {
                f = f1;
            }
        }
        return f;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Float maxWithOrNull(@NotNull float[] arr_f, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        if(arr_f.length == 0) {
            return null;
        }
        float f = arr_f[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_f)).iterator();
        while(intIterator0.hasNext()) {
            float f1 = arr_f[intIterator0.nextInt()];
            if(comparator0.compare(f, f1) < 0) {
                f = f1;
            }
        }
        return f;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Integer maxWithOrNull(@NotNull int[] arr_v, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        if(arr_v.length == 0) {
            return null;
        }
        int v = arr_v[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_v)).iterator();
        while(intIterator0.hasNext()) {
            int v1 = arr_v[intIterator0.nextInt()];
            if(comparator0.compare(v, v1) < 0) {
                v = v1;
            }
        }
        return v;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Long maxWithOrNull(@NotNull long[] arr_v, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        if(arr_v.length == 0) {
            return null;
        }
        long v = arr_v[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_v)).iterator();
        while(intIterator0.hasNext()) {
            long v1 = arr_v[intIterator0.nextInt()];
            if(comparator0.compare(v, v1) < 0) {
                v = v1;
            }
        }
        return v;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Object maxWithOrNull(@NotNull Object[] arr_object, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        if(arr_object.length == 0) {
            return null;
        }
        Object object0 = arr_object[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_object)).iterator();
        while(intIterator0.hasNext()) {
            Object object1 = arr_object[intIterator0.nextInt()];
            if(comparator0.compare(object0, object1) < 0) {
                object0 = object1;
            }
        }
        return object0;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Short maxWithOrNull(@NotNull short[] arr_v, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        if(arr_v.length == 0) {
            return null;
        }
        int v = arr_v[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_v)).iterator();
        while(intIterator0.hasNext()) {
            int v1 = arr_v[intIterator0.nextInt()];
            if(comparator0.compare(((short)v), ((short)v1)) < 0) {
                v = v1;
            }
        }
        return (short)v;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxWithOrThrow")
    public static final byte maxWithOrThrow(@NotNull byte[] arr_b, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        if(arr_b.length == 0) {
            throw new NoSuchElementException();
        }
        byte b = arr_b[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_b)).iterator();
        while(intIterator0.hasNext()) {
            byte b1 = arr_b[intIterator0.nextInt()];
            if(comparator0.compare(b, b1) < 0) {
                b = b1;
            }
        }
        return b;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxWithOrThrow")
    public static final char maxWithOrThrow(@NotNull char[] arr_c, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        if(arr_c.length == 0) {
            throw new NoSuchElementException();
        }
        char c = arr_c[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_c)).iterator();
        while(intIterator0.hasNext()) {
            char c1 = arr_c[intIterator0.nextInt()];
            if(comparator0.compare(Character.valueOf(c), Character.valueOf(c1)) < 0) {
                c = c1;
            }
        }
        return c;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxWithOrThrow")
    public static final double maxWithOrThrow(@NotNull double[] arr_f, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        if(arr_f.length == 0) {
            throw new NoSuchElementException();
        }
        double f = arr_f[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_f)).iterator();
        while(intIterator0.hasNext()) {
            double f1 = arr_f[intIterator0.nextInt()];
            if(comparator0.compare(f, f1) < 0) {
                f = f1;
            }
        }
        return f;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxWithOrThrow")
    public static final float maxWithOrThrow(@NotNull float[] arr_f, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        if(arr_f.length == 0) {
            throw new NoSuchElementException();
        }
        float f = arr_f[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_f)).iterator();
        while(intIterator0.hasNext()) {
            float f1 = arr_f[intIterator0.nextInt()];
            if(comparator0.compare(f, f1) < 0) {
                f = f1;
            }
        }
        return f;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxWithOrThrow")
    public static final int maxWithOrThrow(@NotNull int[] arr_v, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        if(arr_v.length == 0) {
            throw new NoSuchElementException();
        }
        int v = arr_v[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_v)).iterator();
        while(intIterator0.hasNext()) {
            int v1 = arr_v[intIterator0.nextInt()];
            if(comparator0.compare(v, v1) < 0) {
                v = v1;
            }
        }
        return v;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxWithOrThrow")
    public static final long maxWithOrThrow(@NotNull long[] arr_v, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        if(arr_v.length == 0) {
            throw new NoSuchElementException();
        }
        long v = arr_v[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_v)).iterator();
        while(intIterator0.hasNext()) {
            long v1 = arr_v[intIterator0.nextInt()];
            if(comparator0.compare(v, v1) < 0) {
                v = v1;
            }
        }
        return v;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxWithOrThrow")
    public static final Object maxWithOrThrow(@NotNull Object[] arr_object, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        if(arr_object.length == 0) {
            throw new NoSuchElementException();
        }
        Object object0 = arr_object[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_object)).iterator();
        while(intIterator0.hasNext()) {
            Object object1 = arr_object[intIterator0.nextInt()];
            if(comparator0.compare(object0, object1) < 0) {
                object0 = object1;
            }
        }
        return object0;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxWithOrThrow")
    public static final short maxWithOrThrow(@NotNull short[] arr_v, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        if(arr_v.length == 0) {
            throw new NoSuchElementException();
        }
        short v = arr_v[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_v)).iterator();
        while(intIterator0.hasNext()) {
            short v1 = arr_v[intIterator0.nextInt()];
            if(comparator0.compare(v, v1) < 0) {
                v = v1;
            }
        }
        return v;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxWithOrThrow")
    public static final boolean maxWithOrThrow(@NotNull boolean[] arr_z, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        if(arr_z.length == 0) {
            throw new NoSuchElementException();
        }
        boolean z = arr_z[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_z)).iterator();
        while(intIterator0.hasNext()) {
            boolean z1 = arr_z[intIterator0.nextInt()];
            if(comparator0.compare(Boolean.valueOf(z), Boolean.valueOf(z1)) < 0) {
                z = z1;
            }
        }
        return z;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Boolean minByOrNull(@NotNull boolean[] arr_z, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        if(arr_z.length == 0) {
            return null;
        }
        boolean z = arr_z[0];
        int v = ArraysKt___ArraysKt.getLastIndex(arr_z);
        if(v == 0) {
            return Boolean.valueOf(z);
        }
        Comparable comparable0 = (Comparable)function10.invoke(Boolean.valueOf(z));
        IntIterator intIterator0 = r0.a.t(1, v);
        while(intIterator0.hasNext()) {
            boolean z1 = arr_z[intIterator0.nextInt()];
            Comparable comparable1 = (Comparable)function10.invoke(Boolean.valueOf(z1));
            if(comparable0.compareTo(comparable1) > 0) {
                z = z1;
                comparable0 = comparable1;
            }
        }
        return Boolean.valueOf(z);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Byte minByOrNull(@NotNull byte[] arr_b, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        if(arr_b.length == 0) {
            return null;
        }
        int v = arr_b[0];
        int v1 = ArraysKt___ArraysKt.getLastIndex(arr_b);
        if(v1 == 0) {
            return (byte)v;
        }
        Comparable comparable0 = (Comparable)function10.invoke(((byte)v));
        IntIterator intIterator0 = r0.a.t(1, v1);
        while(intIterator0.hasNext()) {
            int v2 = arr_b[intIterator0.nextInt()];
            Comparable comparable1 = (Comparable)function10.invoke(((byte)v2));
            if(comparable0.compareTo(comparable1) > 0) {
                v = v2;
                comparable0 = comparable1;
            }
        }
        return (byte)v;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character minByOrNull(@NotNull char[] arr_c, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        if(arr_c.length == 0) {
            return null;
        }
        int v = arr_c[0];
        int v1 = ArraysKt___ArraysKt.getLastIndex(arr_c);
        if(v1 == 0) {
            return Character.valueOf(((char)v));
        }
        Comparable comparable0 = (Comparable)function10.invoke(Character.valueOf(((char)v)));
        IntIterator intIterator0 = r0.a.t(1, v1);
        while(intIterator0.hasNext()) {
            int v2 = arr_c[intIterator0.nextInt()];
            Comparable comparable1 = (Comparable)function10.invoke(Character.valueOf(((char)v2)));
            if(comparable0.compareTo(comparable1) > 0) {
                v = v2;
                comparable0 = comparable1;
            }
        }
        return Character.valueOf(((char)v));
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Double minByOrNull(@NotNull double[] arr_f, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        if(arr_f.length == 0) {
            return null;
        }
        double f = arr_f[0];
        int v = ArraysKt___ArraysKt.getLastIndex(arr_f);
        if(v == 0) {
            return f;
        }
        Comparable comparable0 = (Comparable)function10.invoke(f);
        IntIterator intIterator0 = r0.a.t(1, v);
        while(intIterator0.hasNext()) {
            double f1 = arr_f[intIterator0.nextInt()];
            Comparable comparable1 = (Comparable)function10.invoke(f1);
            if(comparable0.compareTo(comparable1) > 0) {
                f = f1;
                comparable0 = comparable1;
            }
        }
        return f;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Float minByOrNull(@NotNull float[] arr_f, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        if(arr_f.length == 0) {
            return null;
        }
        float f = arr_f[0];
        int v = ArraysKt___ArraysKt.getLastIndex(arr_f);
        if(v == 0) {
            return f;
        }
        Comparable comparable0 = (Comparable)function10.invoke(f);
        IntIterator intIterator0 = r0.a.t(1, v);
        while(intIterator0.hasNext()) {
            float f1 = arr_f[intIterator0.nextInt()];
            Comparable comparable1 = (Comparable)function10.invoke(f1);
            if(comparable0.compareTo(comparable1) > 0) {
                f = f1;
                comparable0 = comparable1;
            }
        }
        return f;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Integer minByOrNull(@NotNull int[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        if(arr_v.length == 0) {
            return null;
        }
        int v = arr_v[0];
        int v1 = ArraysKt___ArraysKt.getLastIndex(arr_v);
        if(v1 == 0) {
            return v;
        }
        Comparable comparable0 = (Comparable)function10.invoke(v);
        IntIterator intIterator0 = r0.a.t(1, v1);
        while(intIterator0.hasNext()) {
            int v2 = arr_v[intIterator0.nextInt()];
            Comparable comparable1 = (Comparable)function10.invoke(v2);
            if(comparable0.compareTo(comparable1) > 0) {
                v = v2;
                comparable0 = comparable1;
            }
        }
        return v;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Long minByOrNull(@NotNull long[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        if(arr_v.length == 0) {
            return null;
        }
        long v = arr_v[0];
        int v1 = ArraysKt___ArraysKt.getLastIndex(arr_v);
        if(v1 == 0) {
            return v;
        }
        Comparable comparable0 = (Comparable)function10.invoke(v);
        IntIterator intIterator0 = r0.a.t(1, v1);
        while(intIterator0.hasNext()) {
            long v2 = arr_v[intIterator0.nextInt()];
            Comparable comparable1 = (Comparable)function10.invoke(v2);
            if(comparable0.compareTo(comparable1) > 0) {
                v = v2;
                comparable0 = comparable1;
            }
        }
        return v;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Object minByOrNull(@NotNull Object[] arr_object, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        if(arr_object.length == 0) {
            return null;
        }
        Object object0 = arr_object[0];
        int v = ArraysKt___ArraysKt.getLastIndex(arr_object);
        if(v == 0) {
            return object0;
        }
        Comparable comparable0 = (Comparable)function10.invoke(object0);
        IntIterator intIterator0 = r0.a.t(1, v);
        while(intIterator0.hasNext()) {
            Object object1 = arr_object[intIterator0.nextInt()];
            Comparable comparable1 = (Comparable)function10.invoke(object1);
            if(comparable0.compareTo(comparable1) > 0) {
                object0 = object1;
                comparable0 = comparable1;
            }
        }
        return object0;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Short minByOrNull(@NotNull short[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        if(arr_v.length == 0) {
            return null;
        }
        int v = arr_v[0];
        int v1 = ArraysKt___ArraysKt.getLastIndex(arr_v);
        if(v1 == 0) {
            return (short)v;
        }
        Comparable comparable0 = (Comparable)function10.invoke(((short)v));
        IntIterator intIterator0 = r0.a.t(1, v1);
        while(intIterator0.hasNext()) {
            int v2 = arr_v[intIterator0.nextInt()];
            Comparable comparable1 = (Comparable)function10.invoke(((short)v2));
            if(comparable0.compareTo(comparable1) > 0) {
                v = v2;
                comparable0 = comparable1;
            }
        }
        return (short)v;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minByOrThrow")
    public static final byte minByOrThrow(@NotNull byte[] arr_b, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        if(arr_b.length == 0) {
            throw new NoSuchElementException();
        }
        byte b = arr_b[0];
        int v = ArraysKt___ArraysKt.getLastIndex(arr_b);
        if(v == 0) {
            return b;
        }
        Comparable comparable0 = (Comparable)function10.invoke(b);
        IntIterator intIterator0 = r0.a.t(1, v);
        while(intIterator0.hasNext()) {
            byte b1 = arr_b[intIterator0.nextInt()];
            Comparable comparable1 = (Comparable)function10.invoke(b1);
            if(comparable0.compareTo(comparable1) > 0) {
                b = b1;
                comparable0 = comparable1;
            }
        }
        return b;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minByOrThrow")
    public static final char minByOrThrow(@NotNull char[] arr_c, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        if(arr_c.length == 0) {
            throw new NoSuchElementException();
        }
        char c = arr_c[0];
        int v = ArraysKt___ArraysKt.getLastIndex(arr_c);
        if(v == 0) {
            return c;
        }
        Comparable comparable0 = (Comparable)function10.invoke(Character.valueOf(c));
        IntIterator intIterator0 = r0.a.t(1, v);
        while(intIterator0.hasNext()) {
            char c1 = arr_c[intIterator0.nextInt()];
            Comparable comparable1 = (Comparable)function10.invoke(Character.valueOf(c1));
            if(comparable0.compareTo(comparable1) > 0) {
                c = c1;
                comparable0 = comparable1;
            }
        }
        return c;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minByOrThrow")
    public static final double minByOrThrow(@NotNull double[] arr_f, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        if(arr_f.length == 0) {
            throw new NoSuchElementException();
        }
        double f = arr_f[0];
        int v = ArraysKt___ArraysKt.getLastIndex(arr_f);
        if(v == 0) {
            return f;
        }
        Comparable comparable0 = (Comparable)function10.invoke(f);
        IntIterator intIterator0 = r0.a.t(1, v);
        while(intIterator0.hasNext()) {
            double f1 = arr_f[intIterator0.nextInt()];
            Comparable comparable1 = (Comparable)function10.invoke(f1);
            if(comparable0.compareTo(comparable1) > 0) {
                f = f1;
                comparable0 = comparable1;
            }
        }
        return f;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minByOrThrow")
    public static final float minByOrThrow(@NotNull float[] arr_f, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        if(arr_f.length == 0) {
            throw new NoSuchElementException();
        }
        float f = arr_f[0];
        int v = ArraysKt___ArraysKt.getLastIndex(arr_f);
        if(v == 0) {
            return f;
        }
        Comparable comparable0 = (Comparable)function10.invoke(f);
        IntIterator intIterator0 = r0.a.t(1, v);
        while(intIterator0.hasNext()) {
            float f1 = arr_f[intIterator0.nextInt()];
            Comparable comparable1 = (Comparable)function10.invoke(f1);
            if(comparable0.compareTo(comparable1) > 0) {
                f = f1;
                comparable0 = comparable1;
            }
        }
        return f;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minByOrThrow")
    public static final int minByOrThrow(@NotNull int[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        if(arr_v.length == 0) {
            throw new NoSuchElementException();
        }
        int v = arr_v[0];
        int v1 = ArraysKt___ArraysKt.getLastIndex(arr_v);
        if(v1 == 0) {
            return v;
        }
        Comparable comparable0 = (Comparable)function10.invoke(v);
        IntIterator intIterator0 = r0.a.t(1, v1);
        while(intIterator0.hasNext()) {
            int v2 = arr_v[intIterator0.nextInt()];
            Comparable comparable1 = (Comparable)function10.invoke(v2);
            if(comparable0.compareTo(comparable1) > 0) {
                v = v2;
                comparable0 = comparable1;
            }
        }
        return v;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minByOrThrow")
    public static final long minByOrThrow(@NotNull long[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        if(arr_v.length == 0) {
            throw new NoSuchElementException();
        }
        long v = arr_v[0];
        int v1 = ArraysKt___ArraysKt.getLastIndex(arr_v);
        if(v1 == 0) {
            return v;
        }
        Comparable comparable0 = (Comparable)function10.invoke(v);
        IntIterator intIterator0 = r0.a.t(1, v1);
        while(intIterator0.hasNext()) {
            long v2 = arr_v[intIterator0.nextInt()];
            Comparable comparable1 = (Comparable)function10.invoke(v2);
            if(comparable0.compareTo(comparable1) > 0) {
                v = v2;
                comparable0 = comparable1;
            }
        }
        return v;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minByOrThrow")
    public static final Object minByOrThrow(@NotNull Object[] arr_object, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        if(arr_object.length == 0) {
            throw new NoSuchElementException();
        }
        Object object0 = arr_object[0];
        int v = ArraysKt___ArraysKt.getLastIndex(arr_object);
        if(v == 0) {
            return object0;
        }
        Comparable comparable0 = (Comparable)function10.invoke(object0);
        IntIterator intIterator0 = r0.a.t(1, v);
        while(intIterator0.hasNext()) {
            Object object1 = arr_object[intIterator0.nextInt()];
            Comparable comparable1 = (Comparable)function10.invoke(object1);
            if(comparable0.compareTo(comparable1) > 0) {
                object0 = object1;
                comparable0 = comparable1;
            }
        }
        return object0;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minByOrThrow")
    public static final short minByOrThrow(@NotNull short[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        if(arr_v.length == 0) {
            throw new NoSuchElementException();
        }
        short v = arr_v[0];
        int v1 = ArraysKt___ArraysKt.getLastIndex(arr_v);
        if(v1 == 0) {
            return v;
        }
        Comparable comparable0 = (Comparable)function10.invoke(v);
        IntIterator intIterator0 = r0.a.t(1, v1);
        while(intIterator0.hasNext()) {
            short v2 = arr_v[intIterator0.nextInt()];
            Comparable comparable1 = (Comparable)function10.invoke(v2);
            if(comparable0.compareTo(comparable1) > 0) {
                v = v2;
                comparable0 = comparable1;
            }
        }
        return v;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minByOrThrow")
    public static final boolean minByOrThrow(@NotNull boolean[] arr_z, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        if(arr_z.length == 0) {
            throw new NoSuchElementException();
        }
        boolean z = arr_z[0];
        int v = ArraysKt___ArraysKt.getLastIndex(arr_z);
        if(v == 0) {
            return z;
        }
        Comparable comparable0 = (Comparable)function10.invoke(Boolean.valueOf(z));
        IntIterator intIterator0 = r0.a.t(1, v);
        while(intIterator0.hasNext()) {
            boolean z1 = arr_z[intIterator0.nextInt()];
            Comparable comparable1 = (Comparable)function10.invoke(Boolean.valueOf(z1));
            if(comparable0.compareTo(comparable1) > 0) {
                z = z1;
                comparable0 = comparable1;
            }
        }
        return z;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Byte minOrNull(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        if(arr_b.length == 0) {
            return null;
        }
        int v = arr_b[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_b)).iterator();
        while(intIterator0.hasNext()) {
            int v1 = arr_b[intIterator0.nextInt()];
            if(v > v1) {
                v = v1;
            }
        }
        return (byte)v;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character minOrNull(@NotNull char[] arr_c) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        if(arr_c.length == 0) {
            return null;
        }
        int v = arr_c[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_c)).iterator();
        while(intIterator0.hasNext()) {
            int v1 = arr_c[intIterator0.nextInt()];
            if(Intrinsics.compare(v, v1) > 0) {
                v = v1;
            }
        }
        return Character.valueOf(((char)v));
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Comparable minOrNull(@NotNull Comparable[] arr_comparable) {
        Intrinsics.checkNotNullParameter(arr_comparable, "<this>");
        if(arr_comparable.length == 0) {
            return null;
        }
        Comparable comparable0 = arr_comparable[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_comparable)).iterator();
        while(intIterator0.hasNext()) {
            Comparable comparable1 = arr_comparable[intIterator0.nextInt()];
            if(comparable0.compareTo(comparable1) > 0) {
                comparable0 = comparable1;
            }
        }
        return comparable0;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Double minOrNull(@NotNull double[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        if(arr_f.length == 0) {
            return null;
        }
        double f = arr_f[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_f)).iterator();
        while(intIterator0.hasNext()) {
            f = Math.min(f, arr_f[intIterator0.nextInt()]);
        }
        return f;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Double minOrNull(@NotNull Double[] arr_double) {
        Intrinsics.checkNotNullParameter(arr_double, "<this>");
        if(arr_double.length == 0) {
            return null;
        }
        double f = (double)arr_double[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_double)).iterator();
        while(intIterator0.hasNext()) {
            f = Math.min(f, ((double)arr_double[intIterator0.nextInt()]));
        }
        return f;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Float minOrNull(@NotNull float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        if(arr_f.length == 0) {
            return null;
        }
        float f = arr_f[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_f)).iterator();
        while(intIterator0.hasNext()) {
            f = Math.min(f, arr_f[intIterator0.nextInt()]);
        }
        return f;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Float minOrNull(@NotNull Float[] arr_float) {
        Intrinsics.checkNotNullParameter(arr_float, "<this>");
        if(arr_float.length == 0) {
            return null;
        }
        float f = (float)arr_float[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_float)).iterator();
        while(intIterator0.hasNext()) {
            f = Math.min(f, ((float)arr_float[intIterator0.nextInt()]));
        }
        return f;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static Integer minOrNull(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        if(arr_v.length == 0) {
            return null;
        }
        int v = arr_v[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_v)).iterator();
        while(intIterator0.hasNext()) {
            int v1 = arr_v[intIterator0.nextInt()];
            if(v > v1) {
                v = v1;
            }
        }
        return v;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Long minOrNull(@NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        if(arr_v.length == 0) {
            return null;
        }
        long v = arr_v[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_v)).iterator();
        while(intIterator0.hasNext()) {
            long v1 = arr_v[intIterator0.nextInt()];
            if(v > v1) {
                v = v1;
            }
        }
        return v;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Short minOrNull(@NotNull short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        if(arr_v.length == 0) {
            return null;
        }
        int v = arr_v[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_v)).iterator();
        while(intIterator0.hasNext()) {
            int v1 = arr_v[intIterator0.nextInt()];
            if(v > v1) {
                v = v1;
            }
        }
        return (short)v;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minOrThrow")
    public static final byte minOrThrow(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        if(arr_b.length == 0) {
            throw new NoSuchElementException();
        }
        byte b = arr_b[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_b)).iterator();
        while(intIterator0.hasNext()) {
            byte b1 = arr_b[intIterator0.nextInt()];
            if(b > b1) {
                b = b1;
            }
        }
        return b;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minOrThrow")
    public static final char minOrThrow(@NotNull char[] arr_c) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        if(arr_c.length == 0) {
            throw new NoSuchElementException();
        }
        char c = arr_c[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_c)).iterator();
        while(intIterator0.hasNext()) {
            char c1 = arr_c[intIterator0.nextInt()];
            if(Intrinsics.compare(c, c1) > 0) {
                c = c1;
            }
        }
        return c;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minOrThrow")
    public static final double minOrThrow(@NotNull double[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        if(arr_f.length == 0) {
            throw new NoSuchElementException();
        }
        double f = arr_f[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_f)).iterator();
        while(intIterator0.hasNext()) {
            f = Math.min(f, arr_f[intIterator0.nextInt()]);
        }
        return f;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minOrThrow")
    public static final double minOrThrow(@NotNull Double[] arr_double) {
        Intrinsics.checkNotNullParameter(arr_double, "<this>");
        if(arr_double.length == 0) {
            throw new NoSuchElementException();
        }
        double f = (double)arr_double[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_double)).iterator();
        while(intIterator0.hasNext()) {
            f = Math.min(f, ((double)arr_double[intIterator0.nextInt()]));
        }
        return f;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minOrThrow")
    public static final float minOrThrow(@NotNull float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        if(arr_f.length == 0) {
            throw new NoSuchElementException();
        }
        float f = arr_f[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_f)).iterator();
        while(intIterator0.hasNext()) {
            f = Math.min(f, arr_f[intIterator0.nextInt()]);
        }
        return f;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minOrThrow")
    public static final float minOrThrow(@NotNull Float[] arr_float) {
        Intrinsics.checkNotNullParameter(arr_float, "<this>");
        if(arr_float.length == 0) {
            throw new NoSuchElementException();
        }
        float f = (float)arr_float[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_float)).iterator();
        while(intIterator0.hasNext()) {
            f = Math.min(f, ((float)arr_float[intIterator0.nextInt()]));
        }
        return f;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minOrThrow")
    public static int minOrThrow(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        if(arr_v.length == 0) {
            throw new NoSuchElementException();
        }
        int v = arr_v[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_v)).iterator();
        while(intIterator0.hasNext()) {
            int v1 = arr_v[intIterator0.nextInt()];
            if(v > v1) {
                v = v1;
            }
        }
        return v;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minOrThrow")
    public static final long minOrThrow(@NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        if(arr_v.length == 0) {
            throw new NoSuchElementException();
        }
        long v = arr_v[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_v)).iterator();
        while(intIterator0.hasNext()) {
            long v1 = arr_v[intIterator0.nextInt()];
            if(v > v1) {
                v = v1;
            }
        }
        return v;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minOrThrow")
    @NotNull
    public static final Comparable minOrThrow(@NotNull Comparable[] arr_comparable) {
        Intrinsics.checkNotNullParameter(arr_comparable, "<this>");
        if(arr_comparable.length == 0) {
            throw new NoSuchElementException();
        }
        Comparable comparable0 = arr_comparable[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_comparable)).iterator();
        while(intIterator0.hasNext()) {
            Comparable comparable1 = arr_comparable[intIterator0.nextInt()];
            if(comparable0.compareTo(comparable1) > 0) {
                comparable0 = comparable1;
            }
        }
        return comparable0;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minOrThrow")
    public static final short minOrThrow(@NotNull short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        if(arr_v.length == 0) {
            throw new NoSuchElementException();
        }
        short v = arr_v[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_v)).iterator();
        while(intIterator0.hasNext()) {
            short v1 = arr_v[intIterator0.nextInt()];
            if(v > v1) {
                v = v1;
            }
        }
        return v;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Boolean minWithOrNull(@NotNull boolean[] arr_z, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        if(arr_z.length == 0) {
            return null;
        }
        boolean z = arr_z[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_z)).iterator();
        while(intIterator0.hasNext()) {
            boolean z1 = arr_z[intIterator0.nextInt()];
            if(comparator0.compare(Boolean.valueOf(z), Boolean.valueOf(z1)) > 0) {
                z = z1;
            }
        }
        return Boolean.valueOf(z);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Byte minWithOrNull(@NotNull byte[] arr_b, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        if(arr_b.length == 0) {
            return null;
        }
        int v = arr_b[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_b)).iterator();
        while(intIterator0.hasNext()) {
            int v1 = arr_b[intIterator0.nextInt()];
            if(comparator0.compare(((byte)v), ((byte)v1)) > 0) {
                v = v1;
            }
        }
        return (byte)v;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character minWithOrNull(@NotNull char[] arr_c, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        if(arr_c.length == 0) {
            return null;
        }
        int v = arr_c[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_c)).iterator();
        while(intIterator0.hasNext()) {
            int v1 = arr_c[intIterator0.nextInt()];
            if(comparator0.compare(Character.valueOf(((char)v)), Character.valueOf(((char)v1))) > 0) {
                v = v1;
            }
        }
        return Character.valueOf(((char)v));
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Double minWithOrNull(@NotNull double[] arr_f, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        if(arr_f.length == 0) {
            return null;
        }
        double f = arr_f[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_f)).iterator();
        while(intIterator0.hasNext()) {
            double f1 = arr_f[intIterator0.nextInt()];
            if(comparator0.compare(f, f1) > 0) {
                f = f1;
            }
        }
        return f;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Float minWithOrNull(@NotNull float[] arr_f, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        if(arr_f.length == 0) {
            return null;
        }
        float f = arr_f[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_f)).iterator();
        while(intIterator0.hasNext()) {
            float f1 = arr_f[intIterator0.nextInt()];
            if(comparator0.compare(f, f1) > 0) {
                f = f1;
            }
        }
        return f;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Integer minWithOrNull(@NotNull int[] arr_v, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        if(arr_v.length == 0) {
            return null;
        }
        int v = arr_v[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_v)).iterator();
        while(intIterator0.hasNext()) {
            int v1 = arr_v[intIterator0.nextInt()];
            if(comparator0.compare(v, v1) > 0) {
                v = v1;
            }
        }
        return v;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Long minWithOrNull(@NotNull long[] arr_v, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        if(arr_v.length == 0) {
            return null;
        }
        long v = arr_v[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_v)).iterator();
        while(intIterator0.hasNext()) {
            long v1 = arr_v[intIterator0.nextInt()];
            if(comparator0.compare(v, v1) > 0) {
                v = v1;
            }
        }
        return v;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Object minWithOrNull(@NotNull Object[] arr_object, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        if(arr_object.length == 0) {
            return null;
        }
        Object object0 = arr_object[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_object)).iterator();
        while(intIterator0.hasNext()) {
            Object object1 = arr_object[intIterator0.nextInt()];
            if(comparator0.compare(object0, object1) > 0) {
                object0 = object1;
            }
        }
        return object0;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Short minWithOrNull(@NotNull short[] arr_v, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        if(arr_v.length == 0) {
            return null;
        }
        int v = arr_v[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_v)).iterator();
        while(intIterator0.hasNext()) {
            int v1 = arr_v[intIterator0.nextInt()];
            if(comparator0.compare(((short)v), ((short)v1)) > 0) {
                v = v1;
            }
        }
        return (short)v;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minWithOrThrow")
    public static final byte minWithOrThrow(@NotNull byte[] arr_b, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        if(arr_b.length == 0) {
            throw new NoSuchElementException();
        }
        byte b = arr_b[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_b)).iterator();
        while(intIterator0.hasNext()) {
            byte b1 = arr_b[intIterator0.nextInt()];
            if(comparator0.compare(b, b1) > 0) {
                b = b1;
            }
        }
        return b;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minWithOrThrow")
    public static final char minWithOrThrow(@NotNull char[] arr_c, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        if(arr_c.length == 0) {
            throw new NoSuchElementException();
        }
        char c = arr_c[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_c)).iterator();
        while(intIterator0.hasNext()) {
            char c1 = arr_c[intIterator0.nextInt()];
            if(comparator0.compare(Character.valueOf(c), Character.valueOf(c1)) > 0) {
                c = c1;
            }
        }
        return c;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minWithOrThrow")
    public static final double minWithOrThrow(@NotNull double[] arr_f, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        if(arr_f.length == 0) {
            throw new NoSuchElementException();
        }
        double f = arr_f[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_f)).iterator();
        while(intIterator0.hasNext()) {
            double f1 = arr_f[intIterator0.nextInt()];
            if(comparator0.compare(f, f1) > 0) {
                f = f1;
            }
        }
        return f;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minWithOrThrow")
    public static final float minWithOrThrow(@NotNull float[] arr_f, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        if(arr_f.length == 0) {
            throw new NoSuchElementException();
        }
        float f = arr_f[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_f)).iterator();
        while(intIterator0.hasNext()) {
            float f1 = arr_f[intIterator0.nextInt()];
            if(comparator0.compare(f, f1) > 0) {
                f = f1;
            }
        }
        return f;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minWithOrThrow")
    public static final int minWithOrThrow(@NotNull int[] arr_v, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        if(arr_v.length == 0) {
            throw new NoSuchElementException();
        }
        int v = arr_v[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_v)).iterator();
        while(intIterator0.hasNext()) {
            int v1 = arr_v[intIterator0.nextInt()];
            if(comparator0.compare(v, v1) > 0) {
                v = v1;
            }
        }
        return v;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minWithOrThrow")
    public static final long minWithOrThrow(@NotNull long[] arr_v, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        if(arr_v.length == 0) {
            throw new NoSuchElementException();
        }
        long v = arr_v[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_v)).iterator();
        while(intIterator0.hasNext()) {
            long v1 = arr_v[intIterator0.nextInt()];
            if(comparator0.compare(v, v1) > 0) {
                v = v1;
            }
        }
        return v;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minWithOrThrow")
    public static final Object minWithOrThrow(@NotNull Object[] arr_object, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        if(arr_object.length == 0) {
            throw new NoSuchElementException();
        }
        Object object0 = arr_object[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_object)).iterator();
        while(intIterator0.hasNext()) {
            Object object1 = arr_object[intIterator0.nextInt()];
            if(comparator0.compare(object0, object1) > 0) {
                object0 = object1;
            }
        }
        return object0;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minWithOrThrow")
    public static final short minWithOrThrow(@NotNull short[] arr_v, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        if(arr_v.length == 0) {
            throw new NoSuchElementException();
        }
        short v = arr_v[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_v)).iterator();
        while(intIterator0.hasNext()) {
            short v1 = arr_v[intIterator0.nextInt()];
            if(comparator0.compare(v, v1) > 0) {
                v = v1;
            }
        }
        return v;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minWithOrThrow")
    public static final boolean minWithOrThrow(@NotNull boolean[] arr_z, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        if(arr_z.length == 0) {
            throw new NoSuchElementException();
        }
        boolean z = arr_z[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_z)).iterator();
        while(intIterator0.hasNext()) {
            boolean z1 = arr_z[intIterator0.nextInt()];
            if(comparator0.compare(Boolean.valueOf(z), Boolean.valueOf(z1)) > 0) {
                z = z1;
            }
        }
        return z;
    }

    public static final boolean none(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        return arr_b.length == 0;
    }

    public static final boolean none(@NotNull byte[] arr_b, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_b.length; ++v) {
            if(((Boolean)function10.invoke(((byte)arr_b[v]))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean none(@NotNull char[] arr_c) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        return arr_c.length == 0;
    }

    public static final boolean none(@NotNull char[] arr_c, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_c.length; ++v) {
            if(((Boolean)function10.invoke(Character.valueOf(arr_c[v]))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean none(@NotNull double[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        return arr_f.length == 0;
    }

    public static final boolean none(@NotNull double[] arr_f, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_f.length; ++v) {
            if(((Boolean)function10.invoke(((double)arr_f[v]))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean none(@NotNull float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        return arr_f.length == 0;
    }

    public static final boolean none(@NotNull float[] arr_f, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_f.length; ++v) {
            if(((Boolean)function10.invoke(((float)arr_f[v]))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean none(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        return arr_v.length == 0;
    }

    public static final boolean none(@NotNull int[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_v.length; ++v) {
            if(((Boolean)function10.invoke(((int)arr_v[v]))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean none(@NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        return arr_v.length == 0;
    }

    public static final boolean none(@NotNull long[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_v.length; ++v) {
            if(((Boolean)function10.invoke(((long)arr_v[v]))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean none(@NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        return arr_object.length == 0;
    }

    public static final boolean none(@NotNull Object[] arr_object, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_object.length; ++v) {
            if(((Boolean)function10.invoke(arr_object[v])).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean none(@NotNull short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        return arr_v.length == 0;
    }

    public static final boolean none(@NotNull short[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_v.length; ++v) {
            if(((Boolean)function10.invoke(((short)arr_v[v]))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean none(@NotNull boolean[] arr_z) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        return arr_z.length == 0;
    }

    public static final boolean none(@NotNull boolean[] arr_z, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < arr_z.length; ++v) {
            if(((Boolean)function10.invoke(Boolean.valueOf(arr_z[v]))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final Pair partition(@NotNull byte[] arr_b, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        for(int v = 0; v < arr_b.length; ++v) {
            int v1 = arr_b[v];
            if(((Boolean)function10.invoke(((byte)v1))).booleanValue()) {
                arrayList0.add(((byte)v1));
            }
            else {
                arrayList1.add(((byte)v1));
            }
        }
        return new Pair(arrayList0, arrayList1);
    }

    @NotNull
    public static final Pair partition(@NotNull char[] arr_c, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        for(int v = 0; v < arr_c.length; ++v) {
            int v1 = arr_c[v];
            if(((Boolean)function10.invoke(Character.valueOf(((char)v1)))).booleanValue()) {
                arrayList0.add(Character.valueOf(((char)v1)));
            }
            else {
                arrayList1.add(Character.valueOf(((char)v1)));
            }
        }
        return new Pair(arrayList0, arrayList1);
    }

    @NotNull
    public static final Pair partition(@NotNull double[] arr_f, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        for(int v = 0; v < arr_f.length; ++v) {
            double f = arr_f[v];
            if(((Boolean)function10.invoke(f)).booleanValue()) {
                arrayList0.add(f);
            }
            else {
                arrayList1.add(f);
            }
        }
        return new Pair(arrayList0, arrayList1);
    }

    @NotNull
    public static final Pair partition(@NotNull float[] arr_f, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        for(int v = 0; v < arr_f.length; ++v) {
            float f = arr_f[v];
            if(((Boolean)function10.invoke(f)).booleanValue()) {
                arrayList0.add(f);
            }
            else {
                arrayList1.add(f);
            }
        }
        return new Pair(arrayList0, arrayList1);
    }

    @NotNull
    public static final Pair partition(@NotNull int[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            if(((Boolean)function10.invoke(v1)).booleanValue()) {
                arrayList0.add(v1);
            }
            else {
                arrayList1.add(v1);
            }
        }
        return new Pair(arrayList0, arrayList1);
    }

    @NotNull
    public static final Pair partition(@NotNull long[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        for(int v = 0; v < arr_v.length; ++v) {
            long v1 = arr_v[v];
            if(((Boolean)function10.invoke(v1)).booleanValue()) {
                arrayList0.add(v1);
            }
            else {
                arrayList1.add(v1);
            }
        }
        return new Pair(arrayList0, arrayList1);
    }

    @NotNull
    public static final Pair partition(@NotNull Object[] arr_object, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
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
    public static final Pair partition(@NotNull short[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            if(((Boolean)function10.invoke(((short)v1))).booleanValue()) {
                arrayList0.add(((short)v1));
            }
            else {
                arrayList1.add(((short)v1));
            }
        }
        return new Pair(arrayList0, arrayList1);
    }

    @NotNull
    public static final Pair partition(@NotNull boolean[] arr_z, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        for(int v = 0; v < arr_z.length; ++v) {
            boolean z = arr_z[v];
            if(((Boolean)function10.invoke(Boolean.valueOf(z))).booleanValue()) {
                arrayList0.add(Boolean.valueOf(z));
            }
            else {
                arrayList1.add(Boolean.valueOf(z));
            }
        }
        return new Pair(arrayList0, arrayList1);
    }

    @SinceKotlin(version = "1.3")
    public static final byte random(@NotNull byte[] arr_b, @NotNull Random random0) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(random0, "random");
        if(arr_b.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return arr_b[random0.nextInt(arr_b.length)];
    }

    @SinceKotlin(version = "1.3")
    public static final char random(@NotNull char[] arr_c, @NotNull Random random0) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(random0, "random");
        if(arr_c.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return arr_c[random0.nextInt(arr_c.length)];
    }

    @SinceKotlin(version = "1.3")
    public static final double random(@NotNull double[] arr_f, @NotNull Random random0) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(random0, "random");
        if(arr_f.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return arr_f[random0.nextInt(arr_f.length)];
    }

    @SinceKotlin(version = "1.3")
    public static final float random(@NotNull float[] arr_f, @NotNull Random random0) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(random0, "random");
        if(arr_f.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return arr_f[random0.nextInt(arr_f.length)];
    }

    @SinceKotlin(version = "1.3")
    public static final int random(@NotNull int[] arr_v, @NotNull Random random0) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(random0, "random");
        if(arr_v.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return arr_v[random0.nextInt(arr_v.length)];
    }

    @SinceKotlin(version = "1.3")
    public static final long random(@NotNull long[] arr_v, @NotNull Random random0) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(random0, "random");
        if(arr_v.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return arr_v[random0.nextInt(arr_v.length)];
    }

    @SinceKotlin(version = "1.3")
    public static final Object random(@NotNull Object[] arr_object, @NotNull Random random0) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(random0, "random");
        if(arr_object.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return arr_object[random0.nextInt(arr_object.length)];
    }

    @SinceKotlin(version = "1.3")
    public static final short random(@NotNull short[] arr_v, @NotNull Random random0) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(random0, "random");
        if(arr_v.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return arr_v[random0.nextInt(arr_v.length)];
    }

    @SinceKotlin(version = "1.3")
    public static final boolean random(@NotNull boolean[] arr_z, @NotNull Random random0) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(random0, "random");
        if(arr_z.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return arr_z[random0.nextInt(arr_z.length)];
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Boolean randomOrNull(@NotNull boolean[] arr_z, @NotNull Random random0) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(random0, "random");
        return arr_z.length == 0 ? null : Boolean.valueOf(arr_z[random0.nextInt(arr_z.length)]);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Byte randomOrNull(@NotNull byte[] arr_b, @NotNull Random random0) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(random0, "random");
        return arr_b.length == 0 ? null : ((byte)arr_b[random0.nextInt(arr_b.length)]);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Character randomOrNull(@NotNull char[] arr_c, @NotNull Random random0) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(random0, "random");
        return arr_c.length == 0 ? null : Character.valueOf(arr_c[random0.nextInt(arr_c.length)]);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Double randomOrNull(@NotNull double[] arr_f, @NotNull Random random0) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(random0, "random");
        return arr_f.length == 0 ? null : ((double)arr_f[random0.nextInt(arr_f.length)]);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Float randomOrNull(@NotNull float[] arr_f, @NotNull Random random0) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(random0, "random");
        return arr_f.length == 0 ? null : ((float)arr_f[random0.nextInt(arr_f.length)]);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Integer randomOrNull(@NotNull int[] arr_v, @NotNull Random random0) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(random0, "random");
        return arr_v.length == 0 ? null : ((int)arr_v[random0.nextInt(arr_v.length)]);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Long randomOrNull(@NotNull long[] arr_v, @NotNull Random random0) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(random0, "random");
        return arr_v.length == 0 ? null : ((long)arr_v[random0.nextInt(arr_v.length)]);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Object randomOrNull(@NotNull Object[] arr_object, @NotNull Random random0) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(random0, "random");
        return arr_object.length == 0 ? null : arr_object[random0.nextInt(arr_object.length)];
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Short randomOrNull(@NotNull short[] arr_v, @NotNull Random random0) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(random0, "random");
        return arr_v.length == 0 ? null : ((short)arr_v[random0.nextInt(arr_v.length)]);
    }

    public static final byte reduce(@NotNull byte[] arr_b, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        if(arr_b.length == 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        byte b = arr_b[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_b)).iterator();
        while(intIterator0.hasNext()) {
            b = ((Number)function20.invoke(b, ((byte)arr_b[intIterator0.nextInt()]))).byteValue();
        }
        return b;
    }

    public static final char reduce(@NotNull char[] arr_c, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        if(arr_c.length == 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        char c = arr_c[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_c)).iterator();
        while(intIterator0.hasNext()) {
            c = ((Character)function20.invoke(Character.valueOf(c), Character.valueOf(arr_c[intIterator0.nextInt()]))).charValue();
        }
        return c;
    }

    public static final double reduce(@NotNull double[] arr_f, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        if(arr_f.length == 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        double f = arr_f[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_f)).iterator();
        while(intIterator0.hasNext()) {
            f = ((Number)function20.invoke(f, ((double)arr_f[intIterator0.nextInt()]))).doubleValue();
        }
        return f;
    }

    public static final float reduce(@NotNull float[] arr_f, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        if(arr_f.length == 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        float f = arr_f[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_f)).iterator();
        while(intIterator0.hasNext()) {
            f = ((Number)function20.invoke(f, ((float)arr_f[intIterator0.nextInt()]))).floatValue();
        }
        return f;
    }

    public static final int reduce(@NotNull int[] arr_v, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        if(arr_v.length == 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        int v = arr_v[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_v)).iterator();
        while(intIterator0.hasNext()) {
            v = ((Number)function20.invoke(v, ((int)arr_v[intIterator0.nextInt()]))).intValue();
        }
        return v;
    }

    public static final long reduce(@NotNull long[] arr_v, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        if(arr_v.length == 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        long v = arr_v[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_v)).iterator();
        while(intIterator0.hasNext()) {
            v = ((Number)function20.invoke(v, ((long)arr_v[intIterator0.nextInt()]))).longValue();
        }
        return v;
    }

    public static final Object reduce(@NotNull Object[] arr_object, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        if(arr_object.length == 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        Object object0 = arr_object[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_object)).iterator();
        while(intIterator0.hasNext()) {
            object0 = function20.invoke(object0, arr_object[intIterator0.nextInt()]);
        }
        return object0;
    }

    public static final short reduce(@NotNull short[] arr_v, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        if(arr_v.length == 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        short v = arr_v[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_v)).iterator();
        while(intIterator0.hasNext()) {
            v = ((Number)function20.invoke(v, ((short)arr_v[intIterator0.nextInt()]))).shortValue();
        }
        return v;
    }

    public static final boolean reduce(@NotNull boolean[] arr_z, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        if(arr_z.length == 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        boolean z = arr_z[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_z)).iterator();
        while(intIterator0.hasNext()) {
            z = ((Boolean)function20.invoke(Boolean.valueOf(z), Boolean.valueOf(arr_z[intIterator0.nextInt()]))).booleanValue();
        }
        return z;
    }

    public static final byte reduceIndexed(@NotNull byte[] arr_b, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        if(arr_b.length == 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        byte b = arr_b[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_b)).iterator();
        while(intIterator0.hasNext()) {
            int v = intIterator0.nextInt();
            b = ((Number)function30.invoke(v, b, ((byte)arr_b[v]))).byteValue();
        }
        return b;
    }

    public static final char reduceIndexed(@NotNull char[] arr_c, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        if(arr_c.length == 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        char c = arr_c[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_c)).iterator();
        while(intIterator0.hasNext()) {
            int v = intIterator0.nextInt();
            c = ((Character)function30.invoke(v, Character.valueOf(c), Character.valueOf(arr_c[v]))).charValue();
        }
        return c;
    }

    public static final double reduceIndexed(@NotNull double[] arr_f, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        if(arr_f.length == 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        double f = arr_f[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_f)).iterator();
        while(intIterator0.hasNext()) {
            int v = intIterator0.nextInt();
            f = ((Number)function30.invoke(v, f, ((double)arr_f[v]))).doubleValue();
        }
        return f;
    }

    public static final float reduceIndexed(@NotNull float[] arr_f, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        if(arr_f.length == 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        float f = arr_f[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_f)).iterator();
        while(intIterator0.hasNext()) {
            int v = intIterator0.nextInt();
            f = ((Number)function30.invoke(v, f, ((float)arr_f[v]))).floatValue();
        }
        return f;
    }

    public static final int reduceIndexed(@NotNull int[] arr_v, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        if(arr_v.length == 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        int v = arr_v[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_v)).iterator();
        while(intIterator0.hasNext()) {
            int v1 = intIterator0.nextInt();
            v = ((Number)function30.invoke(v1, v, ((int)arr_v[v1]))).intValue();
        }
        return v;
    }

    public static final long reduceIndexed(@NotNull long[] arr_v, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        if(arr_v.length == 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        long v = arr_v[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_v)).iterator();
        while(intIterator0.hasNext()) {
            int v1 = intIterator0.nextInt();
            v = ((Number)function30.invoke(v1, v, ((long)arr_v[v1]))).longValue();
        }
        return v;
    }

    public static final Object reduceIndexed(@NotNull Object[] arr_object, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        if(arr_object.length == 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        Object object0 = arr_object[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_object)).iterator();
        while(intIterator0.hasNext()) {
            int v = intIterator0.nextInt();
            object0 = function30.invoke(v, object0, arr_object[v]);
        }
        return object0;
    }

    public static final short reduceIndexed(@NotNull short[] arr_v, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        if(arr_v.length == 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        short v = arr_v[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_v)).iterator();
        while(intIterator0.hasNext()) {
            int v1 = intIterator0.nextInt();
            v = ((Number)function30.invoke(v1, v, ((short)arr_v[v1]))).shortValue();
        }
        return v;
    }

    public static final boolean reduceIndexed(@NotNull boolean[] arr_z, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        if(arr_z.length == 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        boolean z = arr_z[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_z)).iterator();
        while(intIterator0.hasNext()) {
            int v = intIterator0.nextInt();
            z = ((Boolean)function30.invoke(v, Boolean.valueOf(z), Boolean.valueOf(arr_z[v]))).booleanValue();
        }
        return z;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Boolean reduceIndexedOrNull(@NotNull boolean[] arr_z, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        if(arr_z.length == 0) {
            return null;
        }
        boolean z = arr_z[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_z)).iterator();
        while(intIterator0.hasNext()) {
            int v = intIterator0.nextInt();
            z = ((Boolean)function30.invoke(v, Boolean.valueOf(z), Boolean.valueOf(arr_z[v]))).booleanValue();
        }
        return Boolean.valueOf(z);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Byte reduceIndexedOrNull(@NotNull byte[] arr_b, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        if(arr_b.length == 0) {
            return null;
        }
        int v = arr_b[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_b)).iterator();
        while(intIterator0.hasNext()) {
            int v1 = intIterator0.nextInt();
            v = ((Number)function30.invoke(v1, ((byte)v), ((byte)arr_b[v1]))).byteValue();
        }
        return (byte)v;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character reduceIndexedOrNull(@NotNull char[] arr_c, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        if(arr_c.length == 0) {
            return null;
        }
        int v = arr_c[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_c)).iterator();
        while(intIterator0.hasNext()) {
            int v1 = intIterator0.nextInt();
            v = ((Character)function30.invoke(v1, Character.valueOf(((char)v)), Character.valueOf(arr_c[v1]))).charValue();
        }
        return Character.valueOf(((char)v));
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Double reduceIndexedOrNull(@NotNull double[] arr_f, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        if(arr_f.length == 0) {
            return null;
        }
        double f = arr_f[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_f)).iterator();
        while(intIterator0.hasNext()) {
            int v = intIterator0.nextInt();
            f = ((Number)function30.invoke(v, f, ((double)arr_f[v]))).doubleValue();
        }
        return f;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Float reduceIndexedOrNull(@NotNull float[] arr_f, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        if(arr_f.length == 0) {
            return null;
        }
        float f = arr_f[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_f)).iterator();
        while(intIterator0.hasNext()) {
            int v = intIterator0.nextInt();
            f = ((Number)function30.invoke(v, f, ((float)arr_f[v]))).floatValue();
        }
        return f;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Integer reduceIndexedOrNull(@NotNull int[] arr_v, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        if(arr_v.length == 0) {
            return null;
        }
        int v = arr_v[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_v)).iterator();
        while(intIterator0.hasNext()) {
            int v1 = intIterator0.nextInt();
            v = ((Number)function30.invoke(v1, v, ((int)arr_v[v1]))).intValue();
        }
        return v;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Long reduceIndexedOrNull(@NotNull long[] arr_v, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        if(arr_v.length == 0) {
            return null;
        }
        long v = arr_v[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_v)).iterator();
        while(intIterator0.hasNext()) {
            int v1 = intIterator0.nextInt();
            v = ((Number)function30.invoke(v1, v, ((long)arr_v[v1]))).longValue();
        }
        return v;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Object reduceIndexedOrNull(@NotNull Object[] arr_object, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        if(arr_object.length == 0) {
            return null;
        }
        Object object0 = arr_object[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_object)).iterator();
        while(intIterator0.hasNext()) {
            int v = intIterator0.nextInt();
            object0 = function30.invoke(v, object0, arr_object[v]);
        }
        return object0;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Short reduceIndexedOrNull(@NotNull short[] arr_v, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        if(arr_v.length == 0) {
            return null;
        }
        int v = arr_v[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_v)).iterator();
        while(intIterator0.hasNext()) {
            int v1 = intIterator0.nextInt();
            v = ((Number)function30.invoke(v1, ((short)v), ((short)arr_v[v1]))).shortValue();
        }
        return (short)v;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Boolean reduceOrNull(@NotNull boolean[] arr_z, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        if(arr_z.length == 0) {
            return null;
        }
        boolean z = arr_z[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_z)).iterator();
        while(intIterator0.hasNext()) {
            z = ((Boolean)function20.invoke(Boolean.valueOf(z), Boolean.valueOf(arr_z[intIterator0.nextInt()]))).booleanValue();
        }
        return Boolean.valueOf(z);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Byte reduceOrNull(@NotNull byte[] arr_b, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        if(arr_b.length == 0) {
            return null;
        }
        int v = arr_b[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_b)).iterator();
        while(intIterator0.hasNext()) {
            v = ((Number)function20.invoke(((byte)v), ((byte)arr_b[intIterator0.nextInt()]))).byteValue();
        }
        return (byte)v;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Character reduceOrNull(@NotNull char[] arr_c, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        if(arr_c.length == 0) {
            return null;
        }
        int v = arr_c[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_c)).iterator();
        while(intIterator0.hasNext()) {
            v = ((Character)function20.invoke(Character.valueOf(((char)v)), Character.valueOf(arr_c[intIterator0.nextInt()]))).charValue();
        }
        return Character.valueOf(((char)v));
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Double reduceOrNull(@NotNull double[] arr_f, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        if(arr_f.length == 0) {
            return null;
        }
        double f = arr_f[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_f)).iterator();
        while(intIterator0.hasNext()) {
            f = ((Number)function20.invoke(f, ((double)arr_f[intIterator0.nextInt()]))).doubleValue();
        }
        return f;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Float reduceOrNull(@NotNull float[] arr_f, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        if(arr_f.length == 0) {
            return null;
        }
        float f = arr_f[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_f)).iterator();
        while(intIterator0.hasNext()) {
            f = ((Number)function20.invoke(f, ((float)arr_f[intIterator0.nextInt()]))).floatValue();
        }
        return f;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Integer reduceOrNull(@NotNull int[] arr_v, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        if(arr_v.length == 0) {
            return null;
        }
        int v = arr_v[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_v)).iterator();
        while(intIterator0.hasNext()) {
            v = ((Number)function20.invoke(v, ((int)arr_v[intIterator0.nextInt()]))).intValue();
        }
        return v;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Long reduceOrNull(@NotNull long[] arr_v, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        if(arr_v.length == 0) {
            return null;
        }
        long v = arr_v[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_v)).iterator();
        while(intIterator0.hasNext()) {
            v = ((Number)function20.invoke(v, ((long)arr_v[intIterator0.nextInt()]))).longValue();
        }
        return v;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Object reduceOrNull(@NotNull Object[] arr_object, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        if(arr_object.length == 0) {
            return null;
        }
        Object object0 = arr_object[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_object)).iterator();
        while(intIterator0.hasNext()) {
            object0 = function20.invoke(object0, arr_object[intIterator0.nextInt()]);
        }
        return object0;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Short reduceOrNull(@NotNull short[] arr_v, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        if(arr_v.length == 0) {
            return null;
        }
        int v = arr_v[0];
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_v)).iterator();
        while(intIterator0.hasNext()) {
            v = ((Number)function20.invoke(((short)v), ((short)arr_v[intIterator0.nextInt()]))).shortValue();
        }
        return (short)v;
    }

    public static final byte reduceRight(@NotNull byte[] arr_b, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        int v = ArraysKt___ArraysKt.getLastIndex(arr_b);
        if(v < 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        int v1 = v - 1;
        byte b = arr_b[v];
        while(v1 >= 0) {
            b = ((Number)function20.invoke(((byte)arr_b[v1]), b)).byteValue();
            --v1;
        }
        return b;
    }

    public static final char reduceRight(@NotNull char[] arr_c, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        int v = ArraysKt___ArraysKt.getLastIndex(arr_c);
        if(v < 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        int v1 = v - 1;
        char c = arr_c[v];
        while(v1 >= 0) {
            c = ((Character)function20.invoke(Character.valueOf(arr_c[v1]), Character.valueOf(c))).charValue();
            --v1;
        }
        return c;
    }

    public static final double reduceRight(@NotNull double[] arr_f, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        int v = ArraysKt___ArraysKt.getLastIndex(arr_f);
        if(v < 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        int v1 = v - 1;
        double f = arr_f[v];
        while(v1 >= 0) {
            f = ((Number)function20.invoke(((double)arr_f[v1]), f)).doubleValue();
            --v1;
        }
        return f;
    }

    public static final float reduceRight(@NotNull float[] arr_f, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        int v = ArraysKt___ArraysKt.getLastIndex(arr_f);
        if(v < 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        int v1 = v - 1;
        float f = arr_f[v];
        while(v1 >= 0) {
            f = ((Number)function20.invoke(((float)arr_f[v1]), f)).floatValue();
            --v1;
        }
        return f;
    }

    public static final int reduceRight(@NotNull int[] arr_v, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        int v = ArraysKt___ArraysKt.getLastIndex(arr_v);
        if(v < 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        int v1 = v - 1;
        int v2 = arr_v[v];
        while(v1 >= 0) {
            v2 = ((Number)function20.invoke(((int)arr_v[v1]), v2)).intValue();
            --v1;
        }
        return v2;
    }

    public static final long reduceRight(@NotNull long[] arr_v, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        int v = ArraysKt___ArraysKt.getLastIndex(arr_v);
        if(v < 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        int v1 = v - 1;
        long v2 = arr_v[v];
        while(v1 >= 0) {
            v2 = ((Number)function20.invoke(((long)arr_v[v1]), v2)).longValue();
            --v1;
        }
        return v2;
    }

    public static final Object reduceRight(@NotNull Object[] arr_object, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        int v = ArraysKt___ArraysKt.getLastIndex(arr_object);
        if(v < 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        int v1 = v - 1;
        Object object0 = arr_object[v];
        while(v1 >= 0) {
            object0 = function20.invoke(arr_object[v1], object0);
            --v1;
        }
        return object0;
    }

    public static final short reduceRight(@NotNull short[] arr_v, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        int v = ArraysKt___ArraysKt.getLastIndex(arr_v);
        if(v < 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        int v1 = v - 1;
        short v2 = arr_v[v];
        while(v1 >= 0) {
            v2 = ((Number)function20.invoke(((short)arr_v[v1]), v2)).shortValue();
            --v1;
        }
        return v2;
    }

    public static final boolean reduceRight(@NotNull boolean[] arr_z, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        int v = ArraysKt___ArraysKt.getLastIndex(arr_z);
        if(v < 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        int v1 = v - 1;
        boolean z = arr_z[v];
        while(v1 >= 0) {
            z = ((Boolean)function20.invoke(Boolean.valueOf(arr_z[v1]), Boolean.valueOf(z))).booleanValue();
            --v1;
        }
        return z;
    }

    public static final byte reduceRightIndexed(@NotNull byte[] arr_b, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        int v = ArraysKt___ArraysKt.getLastIndex(arr_b);
        if(v < 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        int v1 = v - 1;
        byte b = arr_b[v];
        while(v1 >= 0) {
            b = ((Number)function30.invoke(v1, ((byte)arr_b[v1]), b)).byteValue();
            --v1;
        }
        return b;
    }

    public static final char reduceRightIndexed(@NotNull char[] arr_c, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        int v = ArraysKt___ArraysKt.getLastIndex(arr_c);
        if(v < 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        int v1 = v - 1;
        char c = arr_c[v];
        while(v1 >= 0) {
            c = ((Character)function30.invoke(v1, Character.valueOf(arr_c[v1]), Character.valueOf(c))).charValue();
            --v1;
        }
        return c;
    }

    public static final double reduceRightIndexed(@NotNull double[] arr_f, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        int v = ArraysKt___ArraysKt.getLastIndex(arr_f);
        if(v < 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        int v1 = v - 1;
        double f = arr_f[v];
        while(v1 >= 0) {
            f = ((Number)function30.invoke(v1, ((double)arr_f[v1]), f)).doubleValue();
            --v1;
        }
        return f;
    }

    public static final float reduceRightIndexed(@NotNull float[] arr_f, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        int v = ArraysKt___ArraysKt.getLastIndex(arr_f);
        if(v < 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        int v1 = v - 1;
        float f = arr_f[v];
        while(v1 >= 0) {
            f = ((Number)function30.invoke(v1, ((float)arr_f[v1]), f)).floatValue();
            --v1;
        }
        return f;
    }

    public static final int reduceRightIndexed(@NotNull int[] arr_v, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        int v = ArraysKt___ArraysKt.getLastIndex(arr_v);
        if(v < 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        int v1 = v - 1;
        int v2 = arr_v[v];
        while(v1 >= 0) {
            v2 = ((Number)function30.invoke(v1, ((int)arr_v[v1]), v2)).intValue();
            --v1;
        }
        return v2;
    }

    public static final long reduceRightIndexed(@NotNull long[] arr_v, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        int v = ArraysKt___ArraysKt.getLastIndex(arr_v);
        if(v < 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        int v1 = v - 1;
        long v2 = arr_v[v];
        while(v1 >= 0) {
            v2 = ((Number)function30.invoke(v1, ((long)arr_v[v1]), v2)).longValue();
            --v1;
        }
        return v2;
    }

    public static final Object reduceRightIndexed(@NotNull Object[] arr_object, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        int v = ArraysKt___ArraysKt.getLastIndex(arr_object);
        if(v < 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        int v1 = v - 1;
        Object object0 = arr_object[v];
        while(v1 >= 0) {
            object0 = function30.invoke(v1, arr_object[v1], object0);
            --v1;
        }
        return object0;
    }

    public static final short reduceRightIndexed(@NotNull short[] arr_v, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        int v = ArraysKt___ArraysKt.getLastIndex(arr_v);
        if(v < 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        int v1 = v - 1;
        short v2 = arr_v[v];
        while(v1 >= 0) {
            v2 = ((Number)function30.invoke(v1, ((short)arr_v[v1]), v2)).shortValue();
            --v1;
        }
        return v2;
    }

    public static final boolean reduceRightIndexed(@NotNull boolean[] arr_z, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        int v = ArraysKt___ArraysKt.getLastIndex(arr_z);
        if(v < 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        int v1 = v - 1;
        boolean z = arr_z[v];
        while(v1 >= 0) {
            z = ((Boolean)function30.invoke(v1, Boolean.valueOf(arr_z[v1]), Boolean.valueOf(z))).booleanValue();
            --v1;
        }
        return z;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Boolean reduceRightIndexedOrNull(@NotNull boolean[] arr_z, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        int v = ArraysKt___ArraysKt.getLastIndex(arr_z);
        if(v < 0) {
            return null;
        }
        int v1 = v - 1;
        boolean z = arr_z[v];
        while(v1 >= 0) {
            z = ((Boolean)function30.invoke(v1, Boolean.valueOf(arr_z[v1]), Boolean.valueOf(z))).booleanValue();
            --v1;
        }
        return Boolean.valueOf(z);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Byte reduceRightIndexedOrNull(@NotNull byte[] arr_b, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        int v = ArraysKt___ArraysKt.getLastIndex(arr_b);
        if(v < 0) {
            return null;
        }
        int v1 = v - 1;
        int v2 = arr_b[v];
        while(v1 >= 0) {
            v2 = ((Number)function30.invoke(v1, ((byte)arr_b[v1]), ((byte)v2))).byteValue();
            --v1;
        }
        return (byte)v2;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character reduceRightIndexedOrNull(@NotNull char[] arr_c, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        int v = ArraysKt___ArraysKt.getLastIndex(arr_c);
        if(v < 0) {
            return null;
        }
        int v1 = v - 1;
        int v2 = arr_c[v];
        while(v1 >= 0) {
            v2 = ((Character)function30.invoke(v1, Character.valueOf(arr_c[v1]), Character.valueOf(((char)v2)))).charValue();
            --v1;
        }
        return Character.valueOf(((char)v2));
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Double reduceRightIndexedOrNull(@NotNull double[] arr_f, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        int v = ArraysKt___ArraysKt.getLastIndex(arr_f);
        if(v < 0) {
            return null;
        }
        int v1 = v - 1;
        double f = arr_f[v];
        while(v1 >= 0) {
            f = ((Number)function30.invoke(v1, ((double)arr_f[v1]), f)).doubleValue();
            --v1;
        }
        return f;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Float reduceRightIndexedOrNull(@NotNull float[] arr_f, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        int v = ArraysKt___ArraysKt.getLastIndex(arr_f);
        if(v < 0) {
            return null;
        }
        int v1 = v - 1;
        float f = arr_f[v];
        while(v1 >= 0) {
            f = ((Number)function30.invoke(v1, ((float)arr_f[v1]), f)).floatValue();
            --v1;
        }
        return f;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Integer reduceRightIndexedOrNull(@NotNull int[] arr_v, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        int v = ArraysKt___ArraysKt.getLastIndex(arr_v);
        if(v < 0) {
            return null;
        }
        int v1 = v - 1;
        int v2 = arr_v[v];
        while(v1 >= 0) {
            v2 = ((Number)function30.invoke(v1, ((int)arr_v[v1]), v2)).intValue();
            --v1;
        }
        return v2;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Long reduceRightIndexedOrNull(@NotNull long[] arr_v, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        int v = ArraysKt___ArraysKt.getLastIndex(arr_v);
        if(v < 0) {
            return null;
        }
        int v1 = v - 1;
        long v2 = arr_v[v];
        while(v1 >= 0) {
            v2 = ((Number)function30.invoke(v1, ((long)arr_v[v1]), v2)).longValue();
            --v1;
        }
        return v2;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Object reduceRightIndexedOrNull(@NotNull Object[] arr_object, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        int v = ArraysKt___ArraysKt.getLastIndex(arr_object);
        if(v < 0) {
            return null;
        }
        int v1 = v - 1;
        Object object0 = arr_object[v];
        while(v1 >= 0) {
            object0 = function30.invoke(v1, arr_object[v1], object0);
            --v1;
        }
        return object0;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Short reduceRightIndexedOrNull(@NotNull short[] arr_v, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        int v = ArraysKt___ArraysKt.getLastIndex(arr_v);
        if(v < 0) {
            return null;
        }
        int v1 = v - 1;
        int v2 = arr_v[v];
        while(v1 >= 0) {
            v2 = ((Number)function30.invoke(v1, ((short)arr_v[v1]), ((short)v2))).shortValue();
            --v1;
        }
        return (short)v2;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Boolean reduceRightOrNull(@NotNull boolean[] arr_z, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        int v = ArraysKt___ArraysKt.getLastIndex(arr_z);
        if(v < 0) {
            return null;
        }
        int v1 = v - 1;
        boolean z = arr_z[v];
        while(v1 >= 0) {
            z = ((Boolean)function20.invoke(Boolean.valueOf(arr_z[v1]), Boolean.valueOf(z))).booleanValue();
            --v1;
        }
        return Boolean.valueOf(z);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Byte reduceRightOrNull(@NotNull byte[] arr_b, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        int v = ArraysKt___ArraysKt.getLastIndex(arr_b);
        if(v < 0) {
            return null;
        }
        int v1 = v - 1;
        int v2 = arr_b[v];
        while(v1 >= 0) {
            v2 = ((Number)function20.invoke(((byte)arr_b[v1]), ((byte)v2))).byteValue();
            --v1;
        }
        return (byte)v2;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Character reduceRightOrNull(@NotNull char[] arr_c, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        int v = ArraysKt___ArraysKt.getLastIndex(arr_c);
        if(v < 0) {
            return null;
        }
        int v1 = v - 1;
        int v2 = arr_c[v];
        while(v1 >= 0) {
            v2 = ((Character)function20.invoke(Character.valueOf(arr_c[v1]), Character.valueOf(((char)v2)))).charValue();
            --v1;
        }
        return Character.valueOf(((char)v2));
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Double reduceRightOrNull(@NotNull double[] arr_f, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        int v = ArraysKt___ArraysKt.getLastIndex(arr_f);
        if(v < 0) {
            return null;
        }
        int v1 = v - 1;
        double f = arr_f[v];
        while(v1 >= 0) {
            f = ((Number)function20.invoke(((double)arr_f[v1]), f)).doubleValue();
            --v1;
        }
        return f;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Float reduceRightOrNull(@NotNull float[] arr_f, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        int v = ArraysKt___ArraysKt.getLastIndex(arr_f);
        if(v < 0) {
            return null;
        }
        int v1 = v - 1;
        float f = arr_f[v];
        while(v1 >= 0) {
            f = ((Number)function20.invoke(((float)arr_f[v1]), f)).floatValue();
            --v1;
        }
        return f;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Integer reduceRightOrNull(@NotNull int[] arr_v, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        int v = ArraysKt___ArraysKt.getLastIndex(arr_v);
        if(v < 0) {
            return null;
        }
        int v1 = v - 1;
        int v2 = arr_v[v];
        while(v1 >= 0) {
            v2 = ((Number)function20.invoke(((int)arr_v[v1]), v2)).intValue();
            --v1;
        }
        return v2;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Long reduceRightOrNull(@NotNull long[] arr_v, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        int v = ArraysKt___ArraysKt.getLastIndex(arr_v);
        if(v < 0) {
            return null;
        }
        int v1 = v - 1;
        long v2 = arr_v[v];
        while(v1 >= 0) {
            v2 = ((Number)function20.invoke(((long)arr_v[v1]), v2)).longValue();
            --v1;
        }
        return v2;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Object reduceRightOrNull(@NotNull Object[] arr_object, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        int v = ArraysKt___ArraysKt.getLastIndex(arr_object);
        if(v < 0) {
            return null;
        }
        int v1 = v - 1;
        Object object0 = arr_object[v];
        while(v1 >= 0) {
            object0 = function20.invoke(arr_object[v1], object0);
            --v1;
        }
        return object0;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Short reduceRightOrNull(@NotNull short[] arr_v, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        int v = ArraysKt___ArraysKt.getLastIndex(arr_v);
        if(v < 0) {
            return null;
        }
        int v1 = v - 1;
        int v2 = arr_v[v];
        while(v1 >= 0) {
            v2 = ((Number)function20.invoke(((short)arr_v[v1]), ((short)v2))).shortValue();
            --v1;
        }
        return (short)v2;
    }

    @NotNull
    public static final Object[] requireNoNulls(@NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        for(int v = 0; v < arr_object.length; ++v) {
            if(arr_object[v] == null) {
                throw new IllegalArgumentException("null element found in " + arr_object + '.');
            }
        }
        return arr_object;
    }

    public static void reverse(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        int v = arr_b.length / 2 - 1;
        if(v < 0) {
            return;
        }
        int v1 = ArraysKt___ArraysKt.getLastIndex(arr_b);
        IntIterator intIterator0 = r0.a.t(0, v);
        while(intIterator0.hasNext()) {
            int v2 = intIterator0.nextInt();
            byte b = arr_b[v2];
            arr_b[v2] = arr_b[v1];
            arr_b[v1] = b;
            --v1;
        }
    }

    @SinceKotlin(version = "1.4")
    public static void reverse(@NotNull byte[] arr_b, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(v, v1, arr_b.length);
        int v2 = (v + v1) / 2;
        if(v == v2) {
            return;
        }
        int v3 = v1 - 1;
        while(v < v2) {
            byte b = arr_b[v];
            arr_b[v] = arr_b[v3];
            arr_b[v3] = b;
            --v3;
            ++v;
        }
    }

    public static final void reverse(@NotNull char[] arr_c) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        int v = arr_c.length / 2 - 1;
        if(v < 0) {
            return;
        }
        int v1 = ArraysKt___ArraysKt.getLastIndex(arr_c);
        IntIterator intIterator0 = r0.a.t(0, v);
        while(intIterator0.hasNext()) {
            int v2 = intIterator0.nextInt();
            char c = arr_c[v2];
            arr_c[v2] = arr_c[v1];
            arr_c[v1] = c;
            --v1;
        }
    }

    @SinceKotlin(version = "1.4")
    public static final void reverse(@NotNull char[] arr_c, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(v, v1, arr_c.length);
        int v2 = (v + v1) / 2;
        if(v == v2) {
            return;
        }
        int v3 = v1 - 1;
        while(v < v2) {
            char c = arr_c[v];
            arr_c[v] = arr_c[v3];
            arr_c[v3] = c;
            --v3;
            ++v;
        }
    }

    public static final void reverse(@NotNull double[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        int v = arr_f.length / 2 - 1;
        if(v < 0) {
            return;
        }
        int v1 = ArraysKt___ArraysKt.getLastIndex(arr_f);
        IntIterator intIterator0 = r0.a.t(0, v);
        while(intIterator0.hasNext()) {
            int v2 = intIterator0.nextInt();
            double f = arr_f[v2];
            arr_f[v2] = arr_f[v1];
            arr_f[v1] = f;
            --v1;
        }
    }

    @SinceKotlin(version = "1.4")
    public static final void reverse(@NotNull double[] arr_f, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(v, v1, arr_f.length);
        int v2 = (v + v1) / 2;
        if(v == v2) {
            return;
        }
        int v3 = v1 - 1;
        while(v < v2) {
            double f = arr_f[v];
            arr_f[v] = arr_f[v3];
            arr_f[v3] = f;
            --v3;
            ++v;
        }
    }

    public static final void reverse(@NotNull float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        int v = arr_f.length / 2 - 1;
        if(v < 0) {
            return;
        }
        int v1 = ArraysKt___ArraysKt.getLastIndex(arr_f);
        IntIterator intIterator0 = r0.a.t(0, v);
        while(intIterator0.hasNext()) {
            int v2 = intIterator0.nextInt();
            float f = arr_f[v2];
            arr_f[v2] = arr_f[v1];
            arr_f[v1] = f;
            --v1;
        }
    }

    @SinceKotlin(version = "1.4")
    public static final void reverse(@NotNull float[] arr_f, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(v, v1, arr_f.length);
        int v2 = (v + v1) / 2;
        if(v == v2) {
            return;
        }
        int v3 = v1 - 1;
        while(v < v2) {
            float f = arr_f[v];
            arr_f[v] = arr_f[v3];
            arr_f[v3] = f;
            --v3;
            ++v;
        }
    }

    public static void reverse(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        int v = arr_v.length / 2 - 1;
        if(v < 0) {
            return;
        }
        int v1 = ArraysKt___ArraysKt.getLastIndex(arr_v);
        IntIterator intIterator0 = r0.a.t(0, v);
        while(intIterator0.hasNext()) {
            int v2 = intIterator0.nextInt();
            int v3 = arr_v[v2];
            arr_v[v2] = arr_v[v1];
            arr_v[v1] = v3;
            --v1;
        }
    }

    @SinceKotlin(version = "1.4")
    public static void reverse(@NotNull int[] arr_v, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(v, v1, arr_v.length);
        int v2 = (v + v1) / 2;
        if(v == v2) {
            return;
        }
        int v3 = v1 - 1;
        while(v < v2) {
            int v4 = arr_v[v];
            arr_v[v] = arr_v[v3];
            arr_v[v3] = v4;
            --v3;
            ++v;
        }
    }

    public static void reverse(@NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        int v = arr_v.length / 2 - 1;
        if(v < 0) {
            return;
        }
        int v1 = ArraysKt___ArraysKt.getLastIndex(arr_v);
        IntIterator intIterator0 = r0.a.t(0, v);
        while(intIterator0.hasNext()) {
            int v2 = intIterator0.nextInt();
            long v3 = arr_v[v2];
            arr_v[v2] = arr_v[v1];
            arr_v[v1] = v3;
            --v1;
        }
    }

    @SinceKotlin(version = "1.4")
    public static void reverse(@NotNull long[] arr_v, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(v, v1, arr_v.length);
        int v2 = (v + v1) / 2;
        if(v == v2) {
            return;
        }
        int v3 = v1 - 1;
        while(v < v2) {
            long v4 = arr_v[v];
            arr_v[v] = arr_v[v3];
            arr_v[v3] = v4;
            --v3;
            ++v;
        }
    }

    public static final void reverse(@NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        int v = arr_object.length / 2 - 1;
        if(v < 0) {
            return;
        }
        int v1 = ArraysKt___ArraysKt.getLastIndex(arr_object);
        IntIterator intIterator0 = r0.a.t(0, v);
        while(intIterator0.hasNext()) {
            int v2 = intIterator0.nextInt();
            Object object0 = arr_object[v2];
            arr_object[v2] = arr_object[v1];
            arr_object[v1] = object0;
            --v1;
        }
    }

    @SinceKotlin(version = "1.4")
    public static final void reverse(@NotNull Object[] arr_object, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(v, v1, arr_object.length);
        int v2 = (v + v1) / 2;
        if(v == v2) {
            return;
        }
        int v3 = v1 - 1;
        while(v < v2) {
            Object object0 = arr_object[v];
            arr_object[v] = arr_object[v3];
            arr_object[v3] = object0;
            --v3;
            ++v;
        }
    }

    public static void reverse(@NotNull short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        int v = arr_v.length / 2 - 1;
        if(v < 0) {
            return;
        }
        int v1 = ArraysKt___ArraysKt.getLastIndex(arr_v);
        IntIterator intIterator0 = r0.a.t(0, v);
        while(intIterator0.hasNext()) {
            int v2 = intIterator0.nextInt();
            short v3 = arr_v[v2];
            arr_v[v2] = arr_v[v1];
            arr_v[v1] = v3;
            --v1;
        }
    }

    @SinceKotlin(version = "1.4")
    public static void reverse(@NotNull short[] arr_v, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(v, v1, arr_v.length);
        int v2 = (v + v1) / 2;
        if(v == v2) {
            return;
        }
        int v3 = v1 - 1;
        while(v < v2) {
            short v4 = arr_v[v];
            arr_v[v] = arr_v[v3];
            arr_v[v3] = v4;
            --v3;
            ++v;
        }
    }

    public static final void reverse(@NotNull boolean[] arr_z) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        int v = arr_z.length / 2 - 1;
        if(v < 0) {
            return;
        }
        int v1 = ArraysKt___ArraysKt.getLastIndex(arr_z);
        IntIterator intIterator0 = r0.a.t(0, v);
        while(intIterator0.hasNext()) {
            int v2 = intIterator0.nextInt();
            boolean z = arr_z[v2];
            arr_z[v2] = arr_z[v1];
            arr_z[v1] = z;
            --v1;
        }
    }

    @SinceKotlin(version = "1.4")
    public static final void reverse(@NotNull boolean[] arr_z, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(v, v1, arr_z.length);
        int v2 = (v + v1) / 2;
        if(v == v2) {
            return;
        }
        int v3 = v1 - 1;
        while(v < v2) {
            boolean z = arr_z[v];
            arr_z[v] = arr_z[v3];
            arr_z[v3] = z;
            --v3;
            ++v;
        }
    }

    @NotNull
    public static final List reversed(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        if(arr_b.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List list0 = ArraysKt___ArraysKt.toMutableList(arr_b);
        kotlin.collections.q.reverse(list0);
        return list0;
    }

    @NotNull
    public static final List reversed(@NotNull char[] arr_c) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        if(arr_c.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List list0 = ArraysKt___ArraysKt.toMutableList(arr_c);
        kotlin.collections.q.reverse(list0);
        return list0;
    }

    @NotNull
    public static final List reversed(@NotNull double[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        if(arr_f.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List list0 = ArraysKt___ArraysKt.toMutableList(arr_f);
        kotlin.collections.q.reverse(list0);
        return list0;
    }

    @NotNull
    public static final List reversed(@NotNull float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        if(arr_f.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List list0 = ArraysKt___ArraysKt.toMutableList(arr_f);
        kotlin.collections.q.reverse(list0);
        return list0;
    }

    @NotNull
    public static final List reversed(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        if(arr_v.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List list0 = ArraysKt___ArraysKt.toMutableList(arr_v);
        kotlin.collections.q.reverse(list0);
        return list0;
    }

    @NotNull
    public static final List reversed(@NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        if(arr_v.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List list0 = ArraysKt___ArraysKt.toMutableList(arr_v);
        kotlin.collections.q.reverse(list0);
        return list0;
    }

    @NotNull
    public static List reversed(@NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        if(arr_object.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List list0 = ArraysKt___ArraysKt.toMutableList(arr_object);
        kotlin.collections.q.reverse(list0);
        return list0;
    }

    @NotNull
    public static final List reversed(@NotNull short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        if(arr_v.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List list0 = ArraysKt___ArraysKt.toMutableList(arr_v);
        kotlin.collections.q.reverse(list0);
        return list0;
    }

    @NotNull
    public static final List reversed(@NotNull boolean[] arr_z) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        if(arr_z.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List list0 = ArraysKt___ArraysKt.toMutableList(arr_z);
        kotlin.collections.q.reverse(list0);
        return list0;
    }

    @NotNull
    public static final byte[] reversedArray(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        if(arr_b.length == 0) {
            return arr_b;
        }
        byte[] arr_b1 = new byte[arr_b.length];
        int v = ArraysKt___ArraysKt.getLastIndex(arr_b);
        IntIterator intIterator0 = r0.a.t(0, v);
        while(intIterator0.hasNext()) {
            int v1 = intIterator0.nextInt();
            arr_b1[v - v1] = arr_b[v1];
        }
        return arr_b1;
    }

    @NotNull
    public static final char[] reversedArray(@NotNull char[] arr_c) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        if(arr_c.length == 0) {
            return arr_c;
        }
        char[] arr_c1 = new char[arr_c.length];
        int v = ArraysKt___ArraysKt.getLastIndex(arr_c);
        IntIterator intIterator0 = r0.a.t(0, v);
        while(intIterator0.hasNext()) {
            int v1 = intIterator0.nextInt();
            arr_c1[v - v1] = arr_c[v1];
        }
        return arr_c1;
    }

    @NotNull
    public static final double[] reversedArray(@NotNull double[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        if(arr_f.length == 0) {
            return arr_f;
        }
        double[] arr_f1 = new double[arr_f.length];
        int v = ArraysKt___ArraysKt.getLastIndex(arr_f);
        IntIterator intIterator0 = r0.a.t(0, v);
        while(intIterator0.hasNext()) {
            int v1 = intIterator0.nextInt();
            arr_f1[v - v1] = arr_f[v1];
        }
        return arr_f1;
    }

    @NotNull
    public static final float[] reversedArray(@NotNull float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        if(arr_f.length == 0) {
            return arr_f;
        }
        float[] arr_f1 = new float[arr_f.length];
        int v = ArraysKt___ArraysKt.getLastIndex(arr_f);
        IntIterator intIterator0 = r0.a.t(0, v);
        while(intIterator0.hasNext()) {
            int v1 = intIterator0.nextInt();
            arr_f1[v - v1] = arr_f[v1];
        }
        return arr_f1;
    }

    @NotNull
    public static final int[] reversedArray(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        if(arr_v.length == 0) {
            return arr_v;
        }
        int[] arr_v1 = new int[arr_v.length];
        int v = ArraysKt___ArraysKt.getLastIndex(arr_v);
        IntIterator intIterator0 = r0.a.t(0, v);
        while(intIterator0.hasNext()) {
            int v1 = intIterator0.nextInt();
            arr_v1[v - v1] = arr_v[v1];
        }
        return arr_v1;
    }

    @NotNull
    public static final long[] reversedArray(@NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        if(arr_v.length == 0) {
            return arr_v;
        }
        long[] arr_v1 = new long[arr_v.length];
        int v = ArraysKt___ArraysKt.getLastIndex(arr_v);
        IntIterator intIterator0 = r0.a.t(0, v);
        while(intIterator0.hasNext()) {
            int v1 = intIterator0.nextInt();
            arr_v1[v - v1] = arr_v[v1];
        }
        return arr_v1;
    }

    @NotNull
    public static final Object[] reversedArray(@NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        if(arr_object.length == 0) {
            return arr_object;
        }
        Object[] arr_object1 = e.arrayOfNulls(arr_object, arr_object.length);
        int v = ArraysKt___ArraysKt.getLastIndex(arr_object);
        IntIterator intIterator0 = r0.a.t(0, v);
        while(intIterator0.hasNext()) {
            int v1 = intIterator0.nextInt();
            arr_object1[v - v1] = arr_object[v1];
        }
        return arr_object1;
    }

    @NotNull
    public static final short[] reversedArray(@NotNull short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        if(arr_v.length == 0) {
            return arr_v;
        }
        short[] arr_v1 = new short[arr_v.length];
        int v = ArraysKt___ArraysKt.getLastIndex(arr_v);
        IntIterator intIterator0 = r0.a.t(0, v);
        while(intIterator0.hasNext()) {
            int v1 = intIterator0.nextInt();
            arr_v1[v - v1] = arr_v[v1];
        }
        return arr_v1;
    }

    @NotNull
    public static final boolean[] reversedArray(@NotNull boolean[] arr_z) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        if(arr_z.length == 0) {
            return arr_z;
        }
        boolean[] arr_z1 = new boolean[arr_z.length];
        int v = ArraysKt___ArraysKt.getLastIndex(arr_z);
        IntIterator intIterator0 = r0.a.t(0, v);
        while(intIterator0.hasNext()) {
            int v1 = intIterator0.nextInt();
            arr_z1[v - v1] = arr_z[v1];
        }
        return arr_z1;
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final List runningFold(@NotNull Object[] arr_object, Object object0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        if(arr_object.length == 0) {
            return k.listOf(object0);
        }
        List list0 = new ArrayList(arr_object.length + 1);
        ((ArrayList)list0).add(object0);
        for(int v = 0; v < arr_object.length; ++v) {
            object0 = function20.invoke(object0, arr_object[v]);
            ((ArrayList)list0).add(object0);
        }
        return list0;
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final List runningFoldIndexed(@NotNull Object[] arr_object, Object object0, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        if(arr_object.length == 0) {
            return k.listOf(object0);
        }
        List list0 = new ArrayList(arr_object.length + 1);
        ((ArrayList)list0).add(object0);
        for(int v = 0; v < arr_object.length; ++v) {
            object0 = function30.invoke(v, object0, arr_object[v]);
            ((ArrayList)list0).add(object0);
        }
        return list0;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static final List runningReduce(@NotNull Object[] arr_object, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        if(arr_object.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        Object object0 = arr_object[0];
        List list0 = new ArrayList(arr_object.length);
        ((ArrayList)list0).add(object0);
        for(int v = 1; v < arr_object.length; ++v) {
            object0 = function20.invoke(object0, arr_object[v]);
            ((ArrayList)list0).add(object0);
        }
        return list0;
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final List runningReduceIndexed(@NotNull Object[] arr_object, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        if(arr_object.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        Object object0 = arr_object[0];
        List list0 = new ArrayList(arr_object.length);
        ((ArrayList)list0).add(object0);
        for(int v = 1; v < arr_object.length; ++v) {
            object0 = function30.invoke(v, object0, arr_object[v]);
            ((ArrayList)list0).add(object0);
        }
        return list0;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static final List scan(@NotNull Object[] arr_object, Object object0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        if(arr_object.length == 0) {
            return k.listOf(object0);
        }
        ArrayList arrayList0 = new ArrayList(arr_object.length + 1);
        arrayList0.add(object0);
        for(int v = 0; v < arr_object.length; ++v) {
            object0 = function20.invoke(object0, arr_object[v]);
            arrayList0.add(object0);
        }
        return arrayList0;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static final List scanIndexed(@NotNull Object[] arr_object, Object object0, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        if(arr_object.length == 0) {
            return k.listOf(object0);
        }
        ArrayList arrayList0 = new ArrayList(arr_object.length + 1);
        arrayList0.add(object0);
        for(int v = 0; v < arr_object.length; ++v) {
            object0 = function30.invoke(v, object0, arr_object[v]);
            arrayList0.add(object0);
        }
        return arrayList0;
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        ArraysKt___ArraysKt.shuffle(arr_b, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(@NotNull byte[] arr_b, @NotNull Random random0) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(random0, "random");
        for(int v = ArraysKt___ArraysKt.getLastIndex(arr_b); v > 0; --v) {
            int v1 = random0.nextInt(v + 1);
            byte b = arr_b[v];
            arr_b[v] = arr_b[v1];
            arr_b[v1] = b;
        }
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(@NotNull char[] arr_c) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        ArraysKt___ArraysKt.shuffle(arr_c, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(@NotNull char[] arr_c, @NotNull Random random0) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(random0, "random");
        for(int v = ArraysKt___ArraysKt.getLastIndex(arr_c); v > 0; --v) {
            int v1 = random0.nextInt(v + 1);
            char c = arr_c[v];
            arr_c[v] = arr_c[v1];
            arr_c[v1] = c;
        }
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(@NotNull double[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        ArraysKt___ArraysKt.shuffle(arr_f, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(@NotNull double[] arr_f, @NotNull Random random0) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(random0, "random");
        for(int v = ArraysKt___ArraysKt.getLastIndex(arr_f); v > 0; --v) {
            int v1 = random0.nextInt(v + 1);
            double f = arr_f[v];
            arr_f[v] = arr_f[v1];
            arr_f[v1] = f;
        }
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(@NotNull float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        ArraysKt___ArraysKt.shuffle(arr_f, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(@NotNull float[] arr_f, @NotNull Random random0) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(random0, "random");
        for(int v = ArraysKt___ArraysKt.getLastIndex(arr_f); v > 0; --v) {
            int v1 = random0.nextInt(v + 1);
            float f = arr_f[v];
            arr_f[v] = arr_f[v1];
            arr_f[v1] = f;
        }
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        ArraysKt___ArraysKt.shuffle(arr_v, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(@NotNull int[] arr_v, @NotNull Random random0) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(random0, "random");
        for(int v = ArraysKt___ArraysKt.getLastIndex(arr_v); v > 0; --v) {
            int v1 = random0.nextInt(v + 1);
            int v2 = arr_v[v];
            arr_v[v] = arr_v[v1];
            arr_v[v1] = v2;
        }
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(@NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        ArraysKt___ArraysKt.shuffle(arr_v, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(@NotNull long[] arr_v, @NotNull Random random0) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(random0, "random");
        for(int v = ArraysKt___ArraysKt.getLastIndex(arr_v); v > 0; --v) {
            int v1 = random0.nextInt(v + 1);
            long v2 = arr_v[v];
            arr_v[v] = arr_v[v1];
            arr_v[v1] = v2;
        }
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(@NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        ArraysKt___ArraysKt.shuffle(arr_object, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(@NotNull Object[] arr_object, @NotNull Random random0) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(random0, "random");
        for(int v = ArraysKt___ArraysKt.getLastIndex(arr_object); v > 0; --v) {
            int v1 = random0.nextInt(v + 1);
            Object object0 = arr_object[v];
            arr_object[v] = arr_object[v1];
            arr_object[v1] = object0;
        }
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(@NotNull short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        ArraysKt___ArraysKt.shuffle(arr_v, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(@NotNull short[] arr_v, @NotNull Random random0) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(random0, "random");
        for(int v = ArraysKt___ArraysKt.getLastIndex(arr_v); v > 0; --v) {
            int v1 = random0.nextInt(v + 1);
            short v2 = arr_v[v];
            arr_v[v] = arr_v[v1];
            arr_v[v1] = v2;
        }
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(@NotNull boolean[] arr_z) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        ArraysKt___ArraysKt.shuffle(arr_z, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(@NotNull boolean[] arr_z, @NotNull Random random0) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(random0, "random");
        for(int v = ArraysKt___ArraysKt.getLastIndex(arr_z); v > 0; --v) {
            int v1 = random0.nextInt(v + 1);
            boolean z = arr_z[v];
            arr_z[v] = arr_z[v1];
            arr_z[v1] = z;
        }
    }

    public static final byte single(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        switch(arr_b.length) {
            case 0: {
                throw new NoSuchElementException("Array is empty.");
            }
            case 1: {
                return arr_b[0];
            }
            default: {
                throw new IllegalArgumentException("Array has more than one element.");
            }
        }
    }

    public static final byte single(@NotNull byte[] arr_b, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        Byte byte0 = null;
        boolean z = false;
        for(int v = 0; v < arr_b.length; ++v) {
            int v1 = arr_b[v];
            if(((Boolean)function10.invoke(((byte)v1))).booleanValue()) {
                if(z) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                byte0 = (byte)v1;
                z = true;
                continue;
            }
        }
        if(!z) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        Intrinsics.checkNotNull(byte0, "null cannot be cast to non-null type kotlin.Byte");
        return (byte)byte0;
    }

    public static char single(@NotNull char[] arr_c) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        switch(arr_c.length) {
            case 0: {
                throw new NoSuchElementException("Array is empty.");
            }
            case 1: {
                return arr_c[0];
            }
            default: {
                throw new IllegalArgumentException("Array has more than one element.");
            }
        }
    }

    public static final char single(@NotNull char[] arr_c, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        Character character0 = null;
        boolean z = false;
        for(int v = 0; v < arr_c.length; ++v) {
            int v1 = arr_c[v];
            if(((Boolean)function10.invoke(Character.valueOf(((char)v1)))).booleanValue()) {
                if(z) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                character0 = Character.valueOf(((char)v1));
                z = true;
                continue;
            }
        }
        if(!z) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        Intrinsics.checkNotNull(character0, "null cannot be cast to non-null type kotlin.Char");
        return character0.charValue();
    }

    public static final double single(@NotNull double[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        switch(arr_f.length) {
            case 0: {
                throw new NoSuchElementException("Array is empty.");
            }
            case 1: {
                return arr_f[0];
            }
            default: {
                throw new IllegalArgumentException("Array has more than one element.");
            }
        }
    }

    public static final double single(@NotNull double[] arr_f, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        Double double0 = null;
        boolean z = false;
        for(int v = 0; v < arr_f.length; ++v) {
            double f = arr_f[v];
            if(((Boolean)function10.invoke(f)).booleanValue()) {
                if(z) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                double0 = f;
                z = true;
                continue;
            }
        }
        if(!z) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        Intrinsics.checkNotNull(double0, "null cannot be cast to non-null type kotlin.Double");
        return (double)double0;
    }

    public static final float single(@NotNull float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        switch(arr_f.length) {
            case 0: {
                throw new NoSuchElementException("Array is empty.");
            }
            case 1: {
                return arr_f[0];
            }
            default: {
                throw new IllegalArgumentException("Array has more than one element.");
            }
        }
    }

    public static final float single(@NotNull float[] arr_f, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        Float float0 = null;
        boolean z = false;
        for(int v = 0; v < arr_f.length; ++v) {
            float f = arr_f[v];
            if(((Boolean)function10.invoke(f)).booleanValue()) {
                if(z) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                float0 = f;
                z = true;
                continue;
            }
        }
        if(!z) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        Intrinsics.checkNotNull(float0, "null cannot be cast to non-null type kotlin.Float");
        return (float)float0;
    }

    public static final int single(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        switch(arr_v.length) {
            case 0: {
                throw new NoSuchElementException("Array is empty.");
            }
            case 1: {
                return arr_v[0];
            }
            default: {
                throw new IllegalArgumentException("Array has more than one element.");
            }
        }
    }

    public static final int single(@NotNull int[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        Integer integer0 = null;
        boolean z = false;
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            if(((Boolean)function10.invoke(v1)).booleanValue()) {
                if(z) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                integer0 = v1;
                z = true;
                continue;
            }
        }
        if(!z) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        Intrinsics.checkNotNull(integer0, "null cannot be cast to non-null type kotlin.Int");
        return (int)integer0;
    }

    public static final long single(@NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        switch(arr_v.length) {
            case 0: {
                throw new NoSuchElementException("Array is empty.");
            }
            case 1: {
                return arr_v[0];
            }
            default: {
                throw new IllegalArgumentException("Array has more than one element.");
            }
        }
    }

    public static final long single(@NotNull long[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        Long long0 = null;
        boolean z = false;
        for(int v = 0; v < arr_v.length; ++v) {
            long v1 = arr_v[v];
            if(((Boolean)function10.invoke(v1)).booleanValue()) {
                if(z) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                long0 = v1;
                z = true;
                continue;
            }
        }
        if(!z) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        Intrinsics.checkNotNull(long0, "null cannot be cast to non-null type kotlin.Long");
        return (long)long0;
    }

    public static Object single(@NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        switch(arr_object.length) {
            case 0: {
                throw new NoSuchElementException("Array is empty.");
            }
            case 1: {
                return arr_object[0];
            }
            default: {
                throw new IllegalArgumentException("Array has more than one element.");
            }
        }
    }

    public static final Object single(@NotNull Object[] arr_object, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        Object object0 = null;
        boolean z = false;
        for(int v = 0; v < arr_object.length; ++v) {
            Object object1 = arr_object[v];
            if(((Boolean)function10.invoke(object1)).booleanValue()) {
                if(z) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                z = true;
                object0 = object1;
                continue;
            }
        }
        if(!z) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        return object0;
    }

    public static final short single(@NotNull short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        switch(arr_v.length) {
            case 0: {
                throw new NoSuchElementException("Array is empty.");
            }
            case 1: {
                return arr_v[0];
            }
            default: {
                throw new IllegalArgumentException("Array has more than one element.");
            }
        }
    }

    public static final short single(@NotNull short[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        Short short0 = null;
        boolean z = false;
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            if(((Boolean)function10.invoke(((short)v1))).booleanValue()) {
                if(z) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                short0 = (short)v1;
                z = true;
                continue;
            }
        }
        if(!z) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        Intrinsics.checkNotNull(short0, "null cannot be cast to non-null type kotlin.Short");
        return (short)short0;
    }

    public static final boolean single(@NotNull boolean[] arr_z) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        switch(arr_z.length) {
            case 0: {
                throw new NoSuchElementException("Array is empty.");
            }
            case 1: {
                return arr_z[0];
            }
            default: {
                throw new IllegalArgumentException("Array has more than one element.");
            }
        }
    }

    public static final boolean single(@NotNull boolean[] arr_z, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        Boolean boolean0 = null;
        boolean z = false;
        for(int v = 0; v < arr_z.length; ++v) {
            boolean z1 = arr_z[v];
            if(((Boolean)function10.invoke(Boolean.valueOf(z1))).booleanValue()) {
                if(z) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                boolean0 = Boolean.valueOf(z1);
                z = true;
                continue;
            }
        }
        if(!z) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        Intrinsics.checkNotNull(boolean0, "null cannot be cast to non-null type kotlin.Boolean");
        return boolean0.booleanValue();
    }

    @Nullable
    public static final Boolean singleOrNull(@NotNull boolean[] arr_z) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        return arr_z.length == 1 ? Boolean.valueOf(arr_z[0]) : null;
    }

    @Nullable
    public static final Boolean singleOrNull(@NotNull boolean[] arr_z, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        Boolean boolean0 = null;
        boolean z = false;
        for(int v = 0; v < arr_z.length; ++v) {
            boolean z1 = arr_z[v];
            if(((Boolean)function10.invoke(Boolean.valueOf(z1))).booleanValue()) {
                if(z) {
                    return null;
                }
                boolean0 = Boolean.valueOf(z1);
                z = true;
            }
        }
        return z ? boolean0 : null;
    }

    @Nullable
    public static final Byte singleOrNull(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        return arr_b.length == 1 ? ((byte)arr_b[0]) : null;
    }

    @Nullable
    public static final Byte singleOrNull(@NotNull byte[] arr_b, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        Byte byte0 = null;
        boolean z = false;
        for(int v = 0; v < arr_b.length; ++v) {
            int v1 = arr_b[v];
            if(((Boolean)function10.invoke(((byte)v1))).booleanValue()) {
                if(z) {
                    return null;
                }
                byte0 = (byte)v1;
                z = true;
            }
        }
        return z ? byte0 : null;
    }

    @Nullable
    public static final Character singleOrNull(@NotNull char[] arr_c) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        return arr_c.length == 1 ? Character.valueOf(arr_c[0]) : null;
    }

    @Nullable
    public static final Character singleOrNull(@NotNull char[] arr_c, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        Character character0 = null;
        boolean z = false;
        for(int v = 0; v < arr_c.length; ++v) {
            int v1 = arr_c[v];
            if(((Boolean)function10.invoke(Character.valueOf(((char)v1)))).booleanValue()) {
                if(z) {
                    return null;
                }
                character0 = Character.valueOf(((char)v1));
                z = true;
            }
        }
        return z ? character0 : null;
    }

    @Nullable
    public static final Double singleOrNull(@NotNull double[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        return arr_f.length == 1 ? ((double)arr_f[0]) : null;
    }

    @Nullable
    public static final Double singleOrNull(@NotNull double[] arr_f, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        Double double0 = null;
        boolean z = false;
        for(int v = 0; v < arr_f.length; ++v) {
            double f = arr_f[v];
            if(((Boolean)function10.invoke(f)).booleanValue()) {
                if(z) {
                    return null;
                }
                double0 = f;
                z = true;
            }
        }
        return z ? double0 : null;
    }

    @Nullable
    public static final Float singleOrNull(@NotNull float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        return arr_f.length == 1 ? ((float)arr_f[0]) : null;
    }

    @Nullable
    public static final Float singleOrNull(@NotNull float[] arr_f, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        Float float0 = null;
        boolean z = false;
        for(int v = 0; v < arr_f.length; ++v) {
            float f = arr_f[v];
            if(((Boolean)function10.invoke(f)).booleanValue()) {
                if(z) {
                    return null;
                }
                float0 = f;
                z = true;
            }
        }
        return z ? float0 : null;
    }

    @Nullable
    public static final Integer singleOrNull(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        return arr_v.length == 1 ? ((int)arr_v[0]) : null;
    }

    @Nullable
    public static final Integer singleOrNull(@NotNull int[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        Integer integer0 = null;
        boolean z = false;
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            if(((Boolean)function10.invoke(v1)).booleanValue()) {
                if(z) {
                    return null;
                }
                integer0 = v1;
                z = true;
            }
        }
        return z ? integer0 : null;
    }

    @Nullable
    public static final Long singleOrNull(@NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        return arr_v.length == 1 ? ((long)arr_v[0]) : null;
    }

    @Nullable
    public static final Long singleOrNull(@NotNull long[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        Long long0 = null;
        boolean z = false;
        for(int v = 0; v < arr_v.length; ++v) {
            long v1 = arr_v[v];
            if(((Boolean)function10.invoke(v1)).booleanValue()) {
                if(z) {
                    return null;
                }
                long0 = v1;
                z = true;
            }
        }
        return z ? long0 : null;
    }

    @Nullable
    public static Object singleOrNull(@NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        return arr_object.length == 1 ? arr_object[0] : null;
    }

    @Nullable
    public static final Object singleOrNull(@NotNull Object[] arr_object, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        Object object0 = null;
        boolean z = false;
        for(int v = 0; v < arr_object.length; ++v) {
            Object object1 = arr_object[v];
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
    public static final Short singleOrNull(@NotNull short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        return arr_v.length == 1 ? ((short)arr_v[0]) : null;
    }

    @Nullable
    public static final Short singleOrNull(@NotNull short[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        Short short0 = null;
        boolean z = false;
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            if(((Boolean)function10.invoke(((short)v1))).booleanValue()) {
                if(z) {
                    return null;
                }
                short0 = (short)v1;
                z = true;
            }
        }
        return z ? short0 : null;
    }

    @NotNull
    public static final List slice(@NotNull byte[] arr_b, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "indices");
        int v = l.collectionSizeOrDefault(iterable0, 10);
        if(v == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List list0 = new ArrayList(v);
        for(Object object0: iterable0) {
            ((ArrayList)list0).add(((byte)arr_b[((Number)object0).intValue()]));
        }
        return list0;
    }

    @NotNull
    public static final List slice(@NotNull byte[] arr_b, @NotNull IntRange intRange0) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(intRange0, "indices");
        return intRange0.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : ArraysKt___ArraysJvmKt.asList(ArraysKt___ArraysJvmKt.copyOfRange(arr_b, ((int)intRange0.getStart()), ((int)intRange0.getEndInclusive()) + 1));
    }

    @NotNull
    public static final List slice(@NotNull char[] arr_c, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "indices");
        int v = l.collectionSizeOrDefault(iterable0, 10);
        if(v == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List list0 = new ArrayList(v);
        for(Object object0: iterable0) {
            ((ArrayList)list0).add(Character.valueOf(arr_c[((Number)object0).intValue()]));
        }
        return list0;
    }

    @NotNull
    public static final List slice(@NotNull char[] arr_c, @NotNull IntRange intRange0) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(intRange0, "indices");
        return intRange0.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : ArraysKt___ArraysJvmKt.asList(ArraysKt___ArraysJvmKt.copyOfRange(arr_c, ((int)intRange0.getStart()), ((int)intRange0.getEndInclusive()) + 1));
    }

    @NotNull
    public static final List slice(@NotNull double[] arr_f, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "indices");
        int v = l.collectionSizeOrDefault(iterable0, 10);
        if(v == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List list0 = new ArrayList(v);
        for(Object object0: iterable0) {
            ((ArrayList)list0).add(((double)arr_f[((Number)object0).intValue()]));
        }
        return list0;
    }

    @NotNull
    public static final List slice(@NotNull double[] arr_f, @NotNull IntRange intRange0) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(intRange0, "indices");
        return intRange0.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : ArraysKt___ArraysJvmKt.asList(ArraysKt___ArraysJvmKt.copyOfRange(arr_f, ((int)intRange0.getStart()), ((int)intRange0.getEndInclusive()) + 1));
    }

    @NotNull
    public static final List slice(@NotNull float[] arr_f, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "indices");
        int v = l.collectionSizeOrDefault(iterable0, 10);
        if(v == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List list0 = new ArrayList(v);
        for(Object object0: iterable0) {
            ((ArrayList)list0).add(((float)arr_f[((Number)object0).intValue()]));
        }
        return list0;
    }

    @NotNull
    public static final List slice(@NotNull float[] arr_f, @NotNull IntRange intRange0) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(intRange0, "indices");
        return intRange0.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : ArraysKt___ArraysJvmKt.asList(ArraysKt___ArraysJvmKt.copyOfRange(arr_f, ((int)intRange0.getStart()), ((int)intRange0.getEndInclusive()) + 1));
    }

    @NotNull
    public static final List slice(@NotNull int[] arr_v, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "indices");
        int v = l.collectionSizeOrDefault(iterable0, 10);
        if(v == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List list0 = new ArrayList(v);
        for(Object object0: iterable0) {
            ((ArrayList)list0).add(((int)arr_v[((Number)object0).intValue()]));
        }
        return list0;
    }

    @NotNull
    public static final List slice(@NotNull int[] arr_v, @NotNull IntRange intRange0) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(intRange0, "indices");
        return intRange0.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : ArraysKt___ArraysJvmKt.asList(ArraysKt___ArraysJvmKt.copyOfRange(arr_v, ((int)intRange0.getStart()), ((int)intRange0.getEndInclusive()) + 1));
    }

    @NotNull
    public static final List slice(@NotNull long[] arr_v, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "indices");
        int v = l.collectionSizeOrDefault(iterable0, 10);
        if(v == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List list0 = new ArrayList(v);
        for(Object object0: iterable0) {
            ((ArrayList)list0).add(((long)arr_v[((Number)object0).intValue()]));
        }
        return list0;
    }

    @NotNull
    public static final List slice(@NotNull long[] arr_v, @NotNull IntRange intRange0) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(intRange0, "indices");
        return intRange0.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : ArraysKt___ArraysJvmKt.asList(ArraysKt___ArraysJvmKt.copyOfRange(arr_v, ((int)intRange0.getStart()), ((int)intRange0.getEndInclusive()) + 1));
    }

    @NotNull
    public static final List slice(@NotNull Object[] arr_object, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "indices");
        int v = l.collectionSizeOrDefault(iterable0, 10);
        if(v == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List list0 = new ArrayList(v);
        for(Object object0: iterable0) {
            ((ArrayList)list0).add(arr_object[((Number)object0).intValue()]);
        }
        return list0;
    }

    @NotNull
    public static List slice(@NotNull Object[] arr_object, @NotNull IntRange intRange0) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(intRange0, "indices");
        return intRange0.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : ArraysKt___ArraysJvmKt.asList(ArraysKt___ArraysJvmKt.copyOfRange(arr_object, ((int)intRange0.getStart()), ((int)intRange0.getEndInclusive()) + 1));
    }

    @NotNull
    public static final List slice(@NotNull short[] arr_v, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "indices");
        int v = l.collectionSizeOrDefault(iterable0, 10);
        if(v == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List list0 = new ArrayList(v);
        for(Object object0: iterable0) {
            ((ArrayList)list0).add(((short)arr_v[((Number)object0).intValue()]));
        }
        return list0;
    }

    @NotNull
    public static final List slice(@NotNull short[] arr_v, @NotNull IntRange intRange0) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(intRange0, "indices");
        return intRange0.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : ArraysKt___ArraysJvmKt.asList(ArraysKt___ArraysJvmKt.copyOfRange(arr_v, ((int)intRange0.getStart()), ((int)intRange0.getEndInclusive()) + 1));
    }

    @NotNull
    public static final List slice(@NotNull boolean[] arr_z, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "indices");
        int v = l.collectionSizeOrDefault(iterable0, 10);
        if(v == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List list0 = new ArrayList(v);
        for(Object object0: iterable0) {
            ((ArrayList)list0).add(Boolean.valueOf(arr_z[((Number)object0).intValue()]));
        }
        return list0;
    }

    @NotNull
    public static final List slice(@NotNull boolean[] arr_z, @NotNull IntRange intRange0) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(intRange0, "indices");
        return intRange0.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : ArraysKt___ArraysJvmKt.asList(ArraysKt___ArraysJvmKt.copyOfRange(arr_z, ((int)intRange0.getStart()), ((int)intRange0.getEndInclusive()) + 1));
    }

    @NotNull
    public static byte[] sliceArray(@NotNull byte[] arr_b, @NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "indices");
        byte[] arr_b1 = new byte[collection0.size()];
        int v = 0;
        for(Object object0: collection0) {
            arr_b1[v] = arr_b[((Number)object0).intValue()];
            ++v;
        }
        return arr_b1;
    }

    @NotNull
    public static byte[] sliceArray(@NotNull byte[] arr_b, @NotNull IntRange intRange0) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(intRange0, "indices");
        return intRange0.isEmpty() ? new byte[0] : ArraysKt___ArraysJvmKt.copyOfRange(arr_b, ((int)intRange0.getStart()), ((int)intRange0.getEndInclusive()) + 1);
    }

    @NotNull
    public static final char[] sliceArray(@NotNull char[] arr_c, @NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "indices");
        char[] arr_c1 = new char[collection0.size()];
        int v = 0;
        for(Object object0: collection0) {
            arr_c1[v] = arr_c[((Number)object0).intValue()];
            ++v;
        }
        return arr_c1;
    }

    @NotNull
    public static final char[] sliceArray(@NotNull char[] arr_c, @NotNull IntRange intRange0) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(intRange0, "indices");
        return intRange0.isEmpty() ? new char[0] : ArraysKt___ArraysJvmKt.copyOfRange(arr_c, ((int)intRange0.getStart()), ((int)intRange0.getEndInclusive()) + 1);
    }

    @NotNull
    public static final double[] sliceArray(@NotNull double[] arr_f, @NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "indices");
        double[] arr_f1 = new double[collection0.size()];
        int v = 0;
        for(Object object0: collection0) {
            arr_f1[v] = arr_f[((Number)object0).intValue()];
            ++v;
        }
        return arr_f1;
    }

    @NotNull
    public static final double[] sliceArray(@NotNull double[] arr_f, @NotNull IntRange intRange0) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(intRange0, "indices");
        return intRange0.isEmpty() ? new double[0] : ArraysKt___ArraysJvmKt.copyOfRange(arr_f, ((int)intRange0.getStart()), ((int)intRange0.getEndInclusive()) + 1);
    }

    @NotNull
    public static final float[] sliceArray(@NotNull float[] arr_f, @NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "indices");
        float[] arr_f1 = new float[collection0.size()];
        int v = 0;
        for(Object object0: collection0) {
            arr_f1[v] = arr_f[((Number)object0).intValue()];
            ++v;
        }
        return arr_f1;
    }

    @NotNull
    public static final float[] sliceArray(@NotNull float[] arr_f, @NotNull IntRange intRange0) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(intRange0, "indices");
        return intRange0.isEmpty() ? new float[0] : ArraysKt___ArraysJvmKt.copyOfRange(arr_f, ((int)intRange0.getStart()), ((int)intRange0.getEndInclusive()) + 1);
    }

    @NotNull
    public static int[] sliceArray(@NotNull int[] arr_v, @NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "indices");
        int[] arr_v1 = new int[collection0.size()];
        int v = 0;
        for(Object object0: collection0) {
            arr_v1[v] = arr_v[((Number)object0).intValue()];
            ++v;
        }
        return arr_v1;
    }

    @NotNull
    public static int[] sliceArray(@NotNull int[] arr_v, @NotNull IntRange intRange0) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(intRange0, "indices");
        return intRange0.isEmpty() ? new int[0] : ArraysKt___ArraysJvmKt.copyOfRange(arr_v, ((int)intRange0.getStart()), ((int)intRange0.getEndInclusive()) + 1);
    }

    @NotNull
    public static long[] sliceArray(@NotNull long[] arr_v, @NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "indices");
        long[] arr_v1 = new long[collection0.size()];
        int v = 0;
        for(Object object0: collection0) {
            arr_v1[v] = arr_v[((Number)object0).intValue()];
            ++v;
        }
        return arr_v1;
    }

    @NotNull
    public static long[] sliceArray(@NotNull long[] arr_v, @NotNull IntRange intRange0) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(intRange0, "indices");
        return intRange0.isEmpty() ? new long[0] : ArraysKt___ArraysJvmKt.copyOfRange(arr_v, ((int)intRange0.getStart()), ((int)intRange0.getEndInclusive()) + 1);
    }

    @NotNull
    public static final Object[] sliceArray(@NotNull Object[] arr_object, @NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "indices");
        Object[] arr_object1 = e.arrayOfNulls(arr_object, collection0.size());
        int v = 0;
        for(Object object0: collection0) {
            arr_object1[v] = arr_object[((Number)object0).intValue()];
            ++v;
        }
        return arr_object1;
    }

    @NotNull
    public static final Object[] sliceArray(@NotNull Object[] arr_object, @NotNull IntRange intRange0) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(intRange0, "indices");
        return intRange0.isEmpty() ? ArraysKt___ArraysJvmKt.copyOfRange(arr_object, 0, 0) : ArraysKt___ArraysJvmKt.copyOfRange(arr_object, ((int)intRange0.getStart()), ((int)intRange0.getEndInclusive()) + 1);
    }

    @NotNull
    public static short[] sliceArray(@NotNull short[] arr_v, @NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "indices");
        short[] arr_v1 = new short[collection0.size()];
        int v = 0;
        for(Object object0: collection0) {
            arr_v1[v] = arr_v[((Number)object0).intValue()];
            ++v;
        }
        return arr_v1;
    }

    @NotNull
    public static short[] sliceArray(@NotNull short[] arr_v, @NotNull IntRange intRange0) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(intRange0, "indices");
        return intRange0.isEmpty() ? new short[0] : ArraysKt___ArraysJvmKt.copyOfRange(arr_v, ((int)intRange0.getStart()), ((int)intRange0.getEndInclusive()) + 1);
    }

    @NotNull
    public static final boolean[] sliceArray(@NotNull boolean[] arr_z, @NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "indices");
        boolean[] arr_z1 = new boolean[collection0.size()];
        int v = 0;
        for(Object object0: collection0) {
            arr_z1[v] = arr_z[((Number)object0).intValue()];
            ++v;
        }
        return arr_z1;
    }

    @NotNull
    public static final boolean[] sliceArray(@NotNull boolean[] arr_z, @NotNull IntRange intRange0) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(intRange0, "indices");
        return intRange0.isEmpty() ? new boolean[0] : ArraysKt___ArraysJvmKt.copyOfRange(arr_z, ((int)intRange0.getStart()), ((int)intRange0.getEndInclusive()) + 1);
    }

    public static final void sortBy(@NotNull Object[] arr_object, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        if(arr_object.length > 1) {
            ArraysKt___ArraysJvmKt.sortWith(arr_object, new ComparisonsKt__ComparisonsKt.compareBy.2(function10));
        }
    }

    public static final void sortByDescending(@NotNull Object[] arr_object, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        if(arr_object.length > 1) {
            ArraysKt___ArraysJvmKt.sortWith(arr_object, new ComparisonsKt__ComparisonsKt.compareByDescending.1(function10));
        }
    }

    public static final void sortDescending(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        if(arr_b.length > 1) {
            ArraysKt___ArraysJvmKt.sort(arr_b);
            ArraysKt___ArraysKt.reverse(arr_b);
        }
    }

    @SinceKotlin(version = "1.4")
    public static final void sortDescending(@NotNull byte[] arr_b, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        ArraysKt___ArraysJvmKt.sort(arr_b, v, v1);
        ArraysKt___ArraysKt.reverse(arr_b, v, v1);
    }

    public static final void sortDescending(@NotNull char[] arr_c) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        if(arr_c.length > 1) {
            ArraysKt___ArraysJvmKt.sort(arr_c);
            ArraysKt___ArraysKt.reverse(arr_c);
        }
    }

    @SinceKotlin(version = "1.4")
    public static final void sortDescending(@NotNull char[] arr_c, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        ArraysKt___ArraysJvmKt.sort(arr_c, v, v1);
        ArraysKt___ArraysKt.reverse(arr_c, v, v1);
    }

    public static final void sortDescending(@NotNull double[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        if(arr_f.length > 1) {
            ArraysKt___ArraysJvmKt.sort(arr_f);
            ArraysKt___ArraysKt.reverse(arr_f);
        }
    }

    @SinceKotlin(version = "1.4")
    public static final void sortDescending(@NotNull double[] arr_f, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        ArraysKt___ArraysJvmKt.sort(arr_f, v, v1);
        ArraysKt___ArraysKt.reverse(arr_f, v, v1);
    }

    public static final void sortDescending(@NotNull float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        if(arr_f.length > 1) {
            ArraysKt___ArraysJvmKt.sort(arr_f);
            ArraysKt___ArraysKt.reverse(arr_f);
        }
    }

    @SinceKotlin(version = "1.4")
    public static void sortDescending(@NotNull float[] arr_f, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        ArraysKt___ArraysJvmKt.sort(arr_f, v, v1);
        ArraysKt___ArraysKt.reverse(arr_f, v, v1);
    }

    public static final void sortDescending(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        if(arr_v.length > 1) {
            ArraysKt___ArraysJvmKt.sort(arr_v);
            ArraysKt___ArraysKt.reverse(arr_v);
        }
    }

    @SinceKotlin(version = "1.4")
    public static void sortDescending(@NotNull int[] arr_v, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        ArraysKt___ArraysJvmKt.sort(arr_v, v, v1);
        ArraysKt___ArraysKt.reverse(arr_v, v, v1);
    }

    public static final void sortDescending(@NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        if(arr_v.length > 1) {
            ArraysKt___ArraysJvmKt.sort(arr_v);
            ArraysKt___ArraysKt.reverse(arr_v);
        }
    }

    @SinceKotlin(version = "1.4")
    public static void sortDescending(@NotNull long[] arr_v, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        ArraysKt___ArraysJvmKt.sort(arr_v, v, v1);
        ArraysKt___ArraysKt.reverse(arr_v, v, v1);
    }

    public static final void sortDescending(@NotNull Comparable[] arr_comparable) {
        Intrinsics.checkNotNullParameter(arr_comparable, "<this>");
        ArraysKt___ArraysJvmKt.sortWith(arr_comparable, pd.c.reverseOrder());
    }

    @SinceKotlin(version = "1.4")
    public static final void sortDescending(@NotNull Comparable[] arr_comparable, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_comparable, "<this>");
        ArraysKt___ArraysJvmKt.sortWith(arr_comparable, pd.c.reverseOrder(), v, v1);
    }

    public static final void sortDescending(@NotNull short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        if(arr_v.length > 1) {
            ArraysKt___ArraysJvmKt.sort(arr_v);
            ArraysKt___ArraysKt.reverse(arr_v);
        }
    }

    @SinceKotlin(version = "1.4")
    public static final void sortDescending(@NotNull short[] arr_v, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        ArraysKt___ArraysJvmKt.sort(arr_v, v, v1);
        ArraysKt___ArraysKt.reverse(arr_v, v, v1);
    }

    @NotNull
    public static final List sorted(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Byte[] arr_byte = ArraysKt___ArraysJvmKt.toTypedArray(arr_b);
        ArraysKt___ArraysJvmKt.sort(arr_byte);
        return ArraysKt___ArraysJvmKt.asList(arr_byte);
    }

    @NotNull
    public static final List sorted(@NotNull char[] arr_c) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Character[] arr_character = ArraysKt___ArraysJvmKt.toTypedArray(arr_c);
        ArraysKt___ArraysJvmKt.sort(arr_character);
        return ArraysKt___ArraysJvmKt.asList(arr_character);
    }

    @NotNull
    public static final List sorted(@NotNull double[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Double[] arr_double = ArraysKt___ArraysJvmKt.toTypedArray(arr_f);
        ArraysKt___ArraysJvmKt.sort(arr_double);
        return ArraysKt___ArraysJvmKt.asList(arr_double);
    }

    @NotNull
    public static final List sorted(@NotNull float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Float[] arr_float = ArraysKt___ArraysJvmKt.toTypedArray(arr_f);
        ArraysKt___ArraysJvmKt.sort(arr_float);
        return ArraysKt___ArraysJvmKt.asList(arr_float);
    }

    @NotNull
    public static final List sorted(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Integer[] arr_integer = ArraysKt___ArraysJvmKt.toTypedArray(arr_v);
        ArraysKt___ArraysJvmKt.sort(arr_integer);
        return ArraysKt___ArraysJvmKt.asList(arr_integer);
    }

    @NotNull
    public static final List sorted(@NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Long[] arr_long = ArraysKt___ArraysJvmKt.toTypedArray(arr_v);
        ArraysKt___ArraysJvmKt.sort(arr_long);
        return ArraysKt___ArraysJvmKt.asList(arr_long);
    }

    @NotNull
    public static final List sorted(@NotNull Comparable[] arr_comparable) {
        Intrinsics.checkNotNullParameter(arr_comparable, "<this>");
        return ArraysKt___ArraysJvmKt.asList(ArraysKt___ArraysKt.sortedArray(arr_comparable));
    }

    @NotNull
    public static final List sorted(@NotNull short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Short[] arr_short = ArraysKt___ArraysJvmKt.toTypedArray(arr_v);
        ArraysKt___ArraysJvmKt.sort(arr_short);
        return ArraysKt___ArraysJvmKt.asList(arr_short);
    }

    @NotNull
    public static final byte[] sortedArray(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        if(arr_b.length == 0) {
            return arr_b;
        }
        byte[] arr_b1 = Arrays.copyOf(arr_b, arr_b.length);
        Intrinsics.checkNotNullExpressionValue(arr_b1, "copyOf(...)");
        ArraysKt___ArraysJvmKt.sort(arr_b1);
        return arr_b1;
    }

    @NotNull
    public static final char[] sortedArray(@NotNull char[] arr_c) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        if(arr_c.length == 0) {
            return arr_c;
        }
        char[] arr_c1 = Arrays.copyOf(arr_c, arr_c.length);
        Intrinsics.checkNotNullExpressionValue(arr_c1, "copyOf(...)");
        ArraysKt___ArraysJvmKt.sort(arr_c1);
        return arr_c1;
    }

    @NotNull
    public static final double[] sortedArray(@NotNull double[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        if(arr_f.length == 0) {
            return arr_f;
        }
        double[] arr_f1 = Arrays.copyOf(arr_f, arr_f.length);
        Intrinsics.checkNotNullExpressionValue(arr_f1, "copyOf(...)");
        ArraysKt___ArraysJvmKt.sort(arr_f1);
        return arr_f1;
    }

    @NotNull
    public static final float[] sortedArray(@NotNull float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        if(arr_f.length == 0) {
            return arr_f;
        }
        float[] arr_f1 = Arrays.copyOf(arr_f, arr_f.length);
        Intrinsics.checkNotNullExpressionValue(arr_f1, "copyOf(...)");
        ArraysKt___ArraysJvmKt.sort(arr_f1);
        return arr_f1;
    }

    @NotNull
    public static final int[] sortedArray(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        if(arr_v.length == 0) {
            return arr_v;
        }
        int[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
        Intrinsics.checkNotNullExpressionValue(arr_v1, "copyOf(...)");
        ArraysKt___ArraysJvmKt.sort(arr_v1);
        return arr_v1;
    }

    @NotNull
    public static final long[] sortedArray(@NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        if(arr_v.length == 0) {
            return arr_v;
        }
        long[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
        Intrinsics.checkNotNullExpressionValue(arr_v1, "copyOf(...)");
        ArraysKt___ArraysJvmKt.sort(arr_v1);
        return arr_v1;
    }

    @NotNull
    public static final Comparable[] sortedArray(@NotNull Comparable[] arr_comparable) {
        Intrinsics.checkNotNullParameter(arr_comparable, "<this>");
        if(arr_comparable.length == 0) {
            return arr_comparable;
        }
        Object[] arr_object = Arrays.copyOf(arr_comparable, arr_comparable.length);
        Intrinsics.checkNotNullExpressionValue(arr_object, "copyOf(...)");
        ArraysKt___ArraysJvmKt.sort(((Comparable[])arr_object));
        return (Comparable[])arr_object;
    }

    @NotNull
    public static final short[] sortedArray(@NotNull short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        if(arr_v.length == 0) {
            return arr_v;
        }
        short[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
        Intrinsics.checkNotNullExpressionValue(arr_v1, "copyOf(...)");
        ArraysKt___ArraysJvmKt.sort(arr_v1);
        return arr_v1;
    }

    @NotNull
    public static final byte[] sortedArrayDescending(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        if(arr_b.length == 0) {
            return arr_b;
        }
        byte[] arr_b1 = Arrays.copyOf(arr_b, arr_b.length);
        Intrinsics.checkNotNullExpressionValue(arr_b1, "copyOf(...)");
        ArraysKt___ArraysKt.sortDescending(arr_b1);
        return arr_b1;
    }

    @NotNull
    public static final char[] sortedArrayDescending(@NotNull char[] arr_c) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        if(arr_c.length == 0) {
            return arr_c;
        }
        char[] arr_c1 = Arrays.copyOf(arr_c, arr_c.length);
        Intrinsics.checkNotNullExpressionValue(arr_c1, "copyOf(...)");
        ArraysKt___ArraysKt.sortDescending(arr_c1);
        return arr_c1;
    }

    @NotNull
    public static final double[] sortedArrayDescending(@NotNull double[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        if(arr_f.length == 0) {
            return arr_f;
        }
        double[] arr_f1 = Arrays.copyOf(arr_f, arr_f.length);
        Intrinsics.checkNotNullExpressionValue(arr_f1, "copyOf(...)");
        ArraysKt___ArraysKt.sortDescending(arr_f1);
        return arr_f1;
    }

    @NotNull
    public static final float[] sortedArrayDescending(@NotNull float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        if(arr_f.length == 0) {
            return arr_f;
        }
        float[] arr_f1 = Arrays.copyOf(arr_f, arr_f.length);
        Intrinsics.checkNotNullExpressionValue(arr_f1, "copyOf(...)");
        ArraysKt___ArraysKt.sortDescending(arr_f1);
        return arr_f1;
    }

    @NotNull
    public static final int[] sortedArrayDescending(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        if(arr_v.length == 0) {
            return arr_v;
        }
        int[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
        Intrinsics.checkNotNullExpressionValue(arr_v1, "copyOf(...)");
        ArraysKt___ArraysKt.sortDescending(arr_v1);
        return arr_v1;
    }

    @NotNull
    public static final long[] sortedArrayDescending(@NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        if(arr_v.length == 0) {
            return arr_v;
        }
        long[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
        Intrinsics.checkNotNullExpressionValue(arr_v1, "copyOf(...)");
        ArraysKt___ArraysKt.sortDescending(arr_v1);
        return arr_v1;
    }

    @NotNull
    public static final Comparable[] sortedArrayDescending(@NotNull Comparable[] arr_comparable) {
        Intrinsics.checkNotNullParameter(arr_comparable, "<this>");
        if(arr_comparable.length == 0) {
            return arr_comparable;
        }
        Object[] arr_object = Arrays.copyOf(arr_comparable, arr_comparable.length);
        Intrinsics.checkNotNullExpressionValue(arr_object, "copyOf(...)");
        ArraysKt___ArraysJvmKt.sortWith(((Comparable[])arr_object), pd.c.reverseOrder());
        return (Comparable[])arr_object;
    }

    @NotNull
    public static final short[] sortedArrayDescending(@NotNull short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        if(arr_v.length == 0) {
            return arr_v;
        }
        short[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
        Intrinsics.checkNotNullExpressionValue(arr_v1, "copyOf(...)");
        ArraysKt___ArraysKt.sortDescending(arr_v1);
        return arr_v1;
    }

    @NotNull
    public static final Object[] sortedArrayWith(@NotNull Object[] arr_object, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        if(arr_object.length == 0) {
            return arr_object;
        }
        Object[] arr_object1 = Arrays.copyOf(arr_object, arr_object.length);
        Intrinsics.checkNotNullExpressionValue(arr_object1, "copyOf(...)");
        ArraysKt___ArraysJvmKt.sortWith(arr_object1, comparator0);
        return arr_object1;
    }

    @NotNull
    public static final List sortedBy(@NotNull byte[] arr_b, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        return ArraysKt___ArraysKt.sortedWith(arr_b, new ComparisonsKt__ComparisonsKt.compareBy.2(function10));
    }

    @NotNull
    public static final List sortedBy(@NotNull char[] arr_c, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        return ArraysKt___ArraysKt.sortedWith(arr_c, new ComparisonsKt__ComparisonsKt.compareBy.2(function10));
    }

    @NotNull
    public static final List sortedBy(@NotNull double[] arr_f, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        return ArraysKt___ArraysKt.sortedWith(arr_f, new ComparisonsKt__ComparisonsKt.compareBy.2(function10));
    }

    @NotNull
    public static final List sortedBy(@NotNull float[] arr_f, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        return ArraysKt___ArraysKt.sortedWith(arr_f, new ComparisonsKt__ComparisonsKt.compareBy.2(function10));
    }

    @NotNull
    public static final List sortedBy(@NotNull int[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        return ArraysKt___ArraysKt.sortedWith(arr_v, new ComparisonsKt__ComparisonsKt.compareBy.2(function10));
    }

    @NotNull
    public static final List sortedBy(@NotNull long[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        return ArraysKt___ArraysKt.sortedWith(arr_v, new ComparisonsKt__ComparisonsKt.compareBy.2(function10));
    }

    @NotNull
    public static final List sortedBy(@NotNull Object[] arr_object, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        return ArraysKt___ArraysKt.sortedWith(arr_object, new ComparisonsKt__ComparisonsKt.compareBy.2(function10));
    }

    @NotNull
    public static final List sortedBy(@NotNull short[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        return ArraysKt___ArraysKt.sortedWith(arr_v, new ComparisonsKt__ComparisonsKt.compareBy.2(function10));
    }

    @NotNull
    public static final List sortedBy(@NotNull boolean[] arr_z, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        return ArraysKt___ArraysKt.sortedWith(arr_z, new ComparisonsKt__ComparisonsKt.compareBy.2(function10));
    }

    @NotNull
    public static final List sortedByDescending(@NotNull byte[] arr_b, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        return ArraysKt___ArraysKt.sortedWith(arr_b, new ComparisonsKt__ComparisonsKt.compareByDescending.1(function10));
    }

    @NotNull
    public static final List sortedByDescending(@NotNull char[] arr_c, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        return ArraysKt___ArraysKt.sortedWith(arr_c, new ComparisonsKt__ComparisonsKt.compareByDescending.1(function10));
    }

    @NotNull
    public static final List sortedByDescending(@NotNull double[] arr_f, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        return ArraysKt___ArraysKt.sortedWith(arr_f, new ComparisonsKt__ComparisonsKt.compareByDescending.1(function10));
    }

    @NotNull
    public static final List sortedByDescending(@NotNull float[] arr_f, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        return ArraysKt___ArraysKt.sortedWith(arr_f, new ComparisonsKt__ComparisonsKt.compareByDescending.1(function10));
    }

    @NotNull
    public static final List sortedByDescending(@NotNull int[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        return ArraysKt___ArraysKt.sortedWith(arr_v, new ComparisonsKt__ComparisonsKt.compareByDescending.1(function10));
    }

    @NotNull
    public static final List sortedByDescending(@NotNull long[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        return ArraysKt___ArraysKt.sortedWith(arr_v, new ComparisonsKt__ComparisonsKt.compareByDescending.1(function10));
    }

    @NotNull
    public static final List sortedByDescending(@NotNull Object[] arr_object, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        return ArraysKt___ArraysKt.sortedWith(arr_object, new ComparisonsKt__ComparisonsKt.compareByDescending.1(function10));
    }

    @NotNull
    public static final List sortedByDescending(@NotNull short[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        return ArraysKt___ArraysKt.sortedWith(arr_v, new ComparisonsKt__ComparisonsKt.compareByDescending.1(function10));
    }

    @NotNull
    public static final List sortedByDescending(@NotNull boolean[] arr_z, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        return ArraysKt___ArraysKt.sortedWith(arr_z, new ComparisonsKt__ComparisonsKt.compareByDescending.1(function10));
    }

    @NotNull
    public static final List sortedDescending(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        byte[] arr_b1 = Arrays.copyOf(arr_b, arr_b.length);
        Intrinsics.checkNotNullExpressionValue(arr_b1, "copyOf(...)");
        ArraysKt___ArraysJvmKt.sort(arr_b1);
        return ArraysKt___ArraysKt.reversed(arr_b1);
    }

    @NotNull
    public static final List sortedDescending(@NotNull char[] arr_c) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        char[] arr_c1 = Arrays.copyOf(arr_c, arr_c.length);
        Intrinsics.checkNotNullExpressionValue(arr_c1, "copyOf(...)");
        ArraysKt___ArraysJvmKt.sort(arr_c1);
        return ArraysKt___ArraysKt.reversed(arr_c1);
    }

    @NotNull
    public static final List sortedDescending(@NotNull double[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        double[] arr_f1 = Arrays.copyOf(arr_f, arr_f.length);
        Intrinsics.checkNotNullExpressionValue(arr_f1, "copyOf(...)");
        ArraysKt___ArraysJvmKt.sort(arr_f1);
        return ArraysKt___ArraysKt.reversed(arr_f1);
    }

    @NotNull
    public static final List sortedDescending(@NotNull float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        float[] arr_f1 = Arrays.copyOf(arr_f, arr_f.length);
        Intrinsics.checkNotNullExpressionValue(arr_f1, "copyOf(...)");
        ArraysKt___ArraysJvmKt.sort(arr_f1);
        return ArraysKt___ArraysKt.reversed(arr_f1);
    }

    @NotNull
    public static final List sortedDescending(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        int[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
        Intrinsics.checkNotNullExpressionValue(arr_v1, "copyOf(...)");
        ArraysKt___ArraysJvmKt.sort(arr_v1);
        return ArraysKt___ArraysKt.reversed(arr_v1);
    }

    @NotNull
    public static final List sortedDescending(@NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        long[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
        Intrinsics.checkNotNullExpressionValue(arr_v1, "copyOf(...)");
        ArraysKt___ArraysJvmKt.sort(arr_v1);
        return ArraysKt___ArraysKt.reversed(arr_v1);
    }

    @NotNull
    public static final List sortedDescending(@NotNull Comparable[] arr_comparable) {
        Intrinsics.checkNotNullParameter(arr_comparable, "<this>");
        return ArraysKt___ArraysKt.sortedWith(arr_comparable, pd.c.reverseOrder());
    }

    @NotNull
    public static final List sortedDescending(@NotNull short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        short[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
        Intrinsics.checkNotNullExpressionValue(arr_v1, "copyOf(...)");
        ArraysKt___ArraysJvmKt.sort(arr_v1);
        return ArraysKt___ArraysKt.reversed(arr_v1);
    }

    @NotNull
    public static final List sortedWith(@NotNull byte[] arr_b, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        Byte[] arr_byte = ArraysKt___ArraysJvmKt.toTypedArray(arr_b);
        ArraysKt___ArraysJvmKt.sortWith(arr_byte, comparator0);
        return ArraysKt___ArraysJvmKt.asList(arr_byte);
    }

    @NotNull
    public static final List sortedWith(@NotNull char[] arr_c, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        Character[] arr_character = ArraysKt___ArraysJvmKt.toTypedArray(arr_c);
        ArraysKt___ArraysJvmKt.sortWith(arr_character, comparator0);
        return ArraysKt___ArraysJvmKt.asList(arr_character);
    }

    @NotNull
    public static final List sortedWith(@NotNull double[] arr_f, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        Double[] arr_double = ArraysKt___ArraysJvmKt.toTypedArray(arr_f);
        ArraysKt___ArraysJvmKt.sortWith(arr_double, comparator0);
        return ArraysKt___ArraysJvmKt.asList(arr_double);
    }

    @NotNull
    public static final List sortedWith(@NotNull float[] arr_f, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        Float[] arr_float = ArraysKt___ArraysJvmKt.toTypedArray(arr_f);
        ArraysKt___ArraysJvmKt.sortWith(arr_float, comparator0);
        return ArraysKt___ArraysJvmKt.asList(arr_float);
    }

    @NotNull
    public static final List sortedWith(@NotNull int[] arr_v, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        Integer[] arr_integer = ArraysKt___ArraysJvmKt.toTypedArray(arr_v);
        ArraysKt___ArraysJvmKt.sortWith(arr_integer, comparator0);
        return ArraysKt___ArraysJvmKt.asList(arr_integer);
    }

    @NotNull
    public static final List sortedWith(@NotNull long[] arr_v, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        Long[] arr_long = ArraysKt___ArraysJvmKt.toTypedArray(arr_v);
        ArraysKt___ArraysJvmKt.sortWith(arr_long, comparator0);
        return ArraysKt___ArraysJvmKt.asList(arr_long);
    }

    @NotNull
    public static List sortedWith(@NotNull Object[] arr_object, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        return ArraysKt___ArraysJvmKt.asList(ArraysKt___ArraysKt.sortedArrayWith(arr_object, comparator0));
    }

    @NotNull
    public static final List sortedWith(@NotNull short[] arr_v, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        Short[] arr_short = ArraysKt___ArraysJvmKt.toTypedArray(arr_v);
        ArraysKt___ArraysJvmKt.sortWith(arr_short, comparator0);
        return ArraysKt___ArraysJvmKt.asList(arr_short);
    }

    @NotNull
    public static final List sortedWith(@NotNull boolean[] arr_z, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        Boolean[] arr_boolean = ArraysKt___ArraysJvmKt.toTypedArray(arr_z);
        ArraysKt___ArraysJvmKt.sortWith(arr_boolean, comparator0);
        return ArraysKt___ArraysJvmKt.asList(arr_boolean);
    }

    @NotNull
    public static final Set subtract(@NotNull byte[] arr_b, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "other");
        Set set0 = ArraysKt___ArraysKt.toMutableSet(arr_b);
        o.removeAll(set0, iterable0);
        return set0;
    }

    @NotNull
    public static final Set subtract(@NotNull char[] arr_c, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "other");
        Set set0 = ArraysKt___ArraysKt.toMutableSet(arr_c);
        o.removeAll(set0, iterable0);
        return set0;
    }

    @NotNull
    public static final Set subtract(@NotNull double[] arr_f, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "other");
        Set set0 = ArraysKt___ArraysKt.toMutableSet(arr_f);
        o.removeAll(set0, iterable0);
        return set0;
    }

    @NotNull
    public static final Set subtract(@NotNull float[] arr_f, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "other");
        Set set0 = ArraysKt___ArraysKt.toMutableSet(arr_f);
        o.removeAll(set0, iterable0);
        return set0;
    }

    @NotNull
    public static final Set subtract(@NotNull int[] arr_v, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "other");
        Set set0 = ArraysKt___ArraysKt.toMutableSet(arr_v);
        o.removeAll(set0, iterable0);
        return set0;
    }

    @NotNull
    public static final Set subtract(@NotNull long[] arr_v, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "other");
        Set set0 = ArraysKt___ArraysKt.toMutableSet(arr_v);
        o.removeAll(set0, iterable0);
        return set0;
    }

    @NotNull
    public static final Set subtract(@NotNull Object[] arr_object, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "other");
        Set set0 = ArraysKt___ArraysKt.toMutableSet(arr_object);
        o.removeAll(set0, iterable0);
        return set0;
    }

    @NotNull
    public static final Set subtract(@NotNull short[] arr_v, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "other");
        Set set0 = ArraysKt___ArraysKt.toMutableSet(arr_v);
        o.removeAll(set0, iterable0);
        return set0;
    }

    @NotNull
    public static final Set subtract(@NotNull boolean[] arr_z, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "other");
        Set set0 = ArraysKt___ArraysKt.toMutableSet(arr_z);
        o.removeAll(set0, iterable0);
        return set0;
    }

    public static final double sum(@NotNull double[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        double f = 0.0;
        for(int v = 0; v < arr_f.length; ++v) {
            f += arr_f[v];
        }
        return f;
    }

    public static final float sum(@NotNull float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        float f = 0.0f;
        for(int v = 0; v < arr_f.length; ++v) {
            f += arr_f[v];
        }
        return f;
    }

    public static final int sum(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        int v1 = 0;
        for(int v = 0; v < arr_b.length; ++v) {
            v1 += arr_b[v];
        }
        return v1;
    }

    public static int sum(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        int v1 = 0;
        for(int v = 0; v < arr_v.length; ++v) {
            v1 += arr_v[v];
        }
        return v1;
    }

    public static final int sum(@NotNull short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        int v1 = 0;
        for(int v = 0; v < arr_v.length; ++v) {
            v1 += arr_v[v];
        }
        return v1;
    }

    public static final long sum(@NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        long v = 0L;
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            v += arr_v[v1];
        }
        return v;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final int sumBy(@NotNull byte[] arr_b, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        int v1 = 0;
        for(int v = 0; v < arr_b.length; ++v) {
            v1 += ((Number)function10.invoke(((byte)arr_b[v]))).intValue();
        }
        return v1;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final int sumBy(@NotNull char[] arr_c, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        int v1 = 0;
        for(int v = 0; v < arr_c.length; ++v) {
            v1 += ((Number)function10.invoke(Character.valueOf(arr_c[v]))).intValue();
        }
        return v1;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final int sumBy(@NotNull double[] arr_f, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        int v1 = 0;
        for(int v = 0; v < arr_f.length; ++v) {
            v1 += ((Number)function10.invoke(((double)arr_f[v]))).intValue();
        }
        return v1;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final int sumBy(@NotNull float[] arr_f, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        int v1 = 0;
        for(int v = 0; v < arr_f.length; ++v) {
            v1 += ((Number)function10.invoke(((float)arr_f[v]))).intValue();
        }
        return v1;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final int sumBy(@NotNull int[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        int v1 = 0;
        for(int v = 0; v < arr_v.length; ++v) {
            v1 += ((Number)function10.invoke(((int)arr_v[v]))).intValue();
        }
        return v1;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final int sumBy(@NotNull long[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        int v1 = 0;
        for(int v = 0; v < arr_v.length; ++v) {
            v1 += ((Number)function10.invoke(((long)arr_v[v]))).intValue();
        }
        return v1;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final int sumBy(@NotNull Object[] arr_object, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        int v1 = 0;
        for(int v = 0; v < arr_object.length; ++v) {
            v1 += ((Number)function10.invoke(arr_object[v])).intValue();
        }
        return v1;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final int sumBy(@NotNull short[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        int v1 = 0;
        for(int v = 0; v < arr_v.length; ++v) {
            v1 += ((Number)function10.invoke(((short)arr_v[v]))).intValue();
        }
        return v1;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final int sumBy(@NotNull boolean[] arr_z, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        int v1 = 0;
        for(int v = 0; v < arr_z.length; ++v) {
            v1 += ((Number)function10.invoke(Boolean.valueOf(arr_z[v]))).intValue();
        }
        return v1;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final double sumByDouble(@NotNull byte[] arr_b, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        double f = 0.0;
        for(int v = 0; v < arr_b.length; ++v) {
            f += ((Number)function10.invoke(((byte)arr_b[v]))).doubleValue();
        }
        return f;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final double sumByDouble(@NotNull char[] arr_c, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        double f = 0.0;
        for(int v = 0; v < arr_c.length; ++v) {
            f += ((Number)function10.invoke(Character.valueOf(arr_c[v]))).doubleValue();
        }
        return f;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final double sumByDouble(@NotNull double[] arr_f, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        double f = 0.0;
        for(int v = 0; v < arr_f.length; ++v) {
            f += ((Number)function10.invoke(((double)arr_f[v]))).doubleValue();
        }
        return f;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final double sumByDouble(@NotNull float[] arr_f, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        double f = 0.0;
        for(int v = 0; v < arr_f.length; ++v) {
            f += ((Number)function10.invoke(((float)arr_f[v]))).doubleValue();
        }
        return f;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final double sumByDouble(@NotNull int[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        double f = 0.0;
        for(int v = 0; v < arr_v.length; ++v) {
            f += ((Number)function10.invoke(((int)arr_v[v]))).doubleValue();
        }
        return f;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final double sumByDouble(@NotNull long[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        double f = 0.0;
        for(int v = 0; v < arr_v.length; ++v) {
            f += ((Number)function10.invoke(((long)arr_v[v]))).doubleValue();
        }
        return f;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final double sumByDouble(@NotNull Object[] arr_object, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        double f = 0.0;
        for(int v = 0; v < arr_object.length; ++v) {
            f += ((Number)function10.invoke(arr_object[v])).doubleValue();
        }
        return f;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final double sumByDouble(@NotNull short[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        double f = 0.0;
        for(int v = 0; v < arr_v.length; ++v) {
            f += ((Number)function10.invoke(((short)arr_v[v]))).doubleValue();
        }
        return f;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final double sumByDouble(@NotNull boolean[] arr_z, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        double f = 0.0;
        for(int v = 0; v < arr_z.length; ++v) {
            f += ((Number)function10.invoke(Boolean.valueOf(arr_z[v]))).doubleValue();
        }
        return f;
    }

    @JvmName(name = "sumOfByte")
    public static final int sumOfByte(@NotNull Byte[] arr_byte) {
        Intrinsics.checkNotNullParameter(arr_byte, "<this>");
        int v1 = 0;
        for(int v = 0; v < arr_byte.length; ++v) {
            v1 += (byte)arr_byte[v];
        }
        return v1;
    }

    @JvmName(name = "sumOfDouble")
    public static final double sumOfDouble(@NotNull Double[] arr_double) {
        Intrinsics.checkNotNullParameter(arr_double, "<this>");
        double f = 0.0;
        for(int v = 0; v < arr_double.length; ++v) {
            f += (double)arr_double[v];
        }
        return f;
    }

    @JvmName(name = "sumOfFloat")
    public static final float sumOfFloat(@NotNull Float[] arr_float) {
        Intrinsics.checkNotNullParameter(arr_float, "<this>");
        float f = 0.0f;
        for(int v = 0; v < arr_float.length; ++v) {
            f += (float)arr_float[v];
        }
        return f;
    }

    @JvmName(name = "sumOfInt")
    public static final int sumOfInt(@NotNull Integer[] arr_integer) {
        Intrinsics.checkNotNullParameter(arr_integer, "<this>");
        int v1 = 0;
        for(int v = 0; v < arr_integer.length; ++v) {
            v1 += (int)arr_integer[v];
        }
        return v1;
    }

    @JvmName(name = "sumOfLong")
    public static final long sumOfLong(@NotNull Long[] arr_long) {
        Intrinsics.checkNotNullParameter(arr_long, "<this>");
        long v = 0L;
        for(int v1 = 0; v1 < arr_long.length; ++v1) {
            v += (long)arr_long[v1];
        }
        return v;
    }

    @JvmName(name = "sumOfShort")
    public static final int sumOfShort(@NotNull Short[] arr_short) {
        Intrinsics.checkNotNullParameter(arr_short, "<this>");
        int v1 = 0;
        for(int v = 0; v < arr_short.length; ++v) {
            v1 += (short)arr_short[v];
        }
        return v1;
    }

    @NotNull
    public static final List take(@NotNull byte[] arr_b, int v) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        if(v == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if(v >= arr_b.length) {
            return ArraysKt___ArraysKt.toList(arr_b);
        }
        if(v == 1) {
            return k.listOf(((byte)arr_b[0]));
        }
        List list0 = new ArrayList(v);
        int v2 = 0;
        for(int v1 = 0; v1 < arr_b.length; ++v1) {
            ((ArrayList)list0).add(((byte)arr_b[v1]));
            ++v2;
            if(v2 == v) {
                break;
            }
        }
        return list0;
    }

    @NotNull
    public static final List take(@NotNull char[] arr_c, int v) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        if(v == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if(v >= arr_c.length) {
            return ArraysKt___ArraysKt.toList(arr_c);
        }
        if(v == 1) {
            return k.listOf(Character.valueOf(arr_c[0]));
        }
        List list0 = new ArrayList(v);
        int v2 = 0;
        for(int v1 = 0; v1 < arr_c.length; ++v1) {
            ((ArrayList)list0).add(Character.valueOf(arr_c[v1]));
            ++v2;
            if(v2 == v) {
                break;
            }
        }
        return list0;
    }

    @NotNull
    public static final List take(@NotNull double[] arr_f, int v) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(q.m(v, "Requested element count ", " is less than zero.").toString());
        }
        if(v == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if(v >= arr_f.length) {
            return ArraysKt___ArraysKt.toList(arr_f);
        }
        if(v == 1) {
            return k.listOf(((double)arr_f[0]));
        }
        List list0 = new ArrayList(v);
        int v2 = 0;
        for(int v1 = 0; v1 < arr_f.length; ++v1) {
            ((ArrayList)list0).add(((double)arr_f[v1]));
            ++v2;
            if(v2 == v) {
                break;
            }
        }
        return list0;
    }

    @NotNull
    public static final List take(@NotNull float[] arr_f, int v) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        if(v == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if(v >= arr_f.length) {
            return ArraysKt___ArraysKt.toList(arr_f);
        }
        if(v == 1) {
            return k.listOf(((float)arr_f[0]));
        }
        List list0 = new ArrayList(v);
        int v2 = 0;
        for(int v1 = 0; v1 < arr_f.length; ++v1) {
            ((ArrayList)list0).add(((float)arr_f[v1]));
            ++v2;
            if(v2 == v) {
                break;
            }
        }
        return list0;
    }

    @NotNull
    public static final List take(@NotNull int[] arr_v, int v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(q.m(v, "Requested element count ", " is less than zero.").toString());
        }
        if(v == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if(v >= arr_v.length) {
            return ArraysKt___ArraysKt.toList(arr_v);
        }
        if(v == 1) {
            return k.listOf(((int)arr_v[0]));
        }
        List list0 = new ArrayList(v);
        int v2 = 0;
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            ((ArrayList)list0).add(((int)arr_v[v1]));
            ++v2;
            if(v2 == v) {
                break;
            }
        }
        return list0;
    }

    @NotNull
    public static final List take(@NotNull long[] arr_v, int v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        if(v == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if(v >= arr_v.length) {
            return ArraysKt___ArraysKt.toList(arr_v);
        }
        if(v == 1) {
            return k.listOf(((long)arr_v[0]));
        }
        List list0 = new ArrayList(v);
        int v2 = 0;
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            ((ArrayList)list0).add(((long)arr_v[v1]));
            ++v2;
            if(v2 == v) {
                break;
            }
        }
        return list0;
    }

    @NotNull
    public static final List take(@NotNull Object[] arr_object, int v) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(q.m(v, "Requested element count ", " is less than zero.").toString());
        }
        if(v == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if(v >= arr_object.length) {
            return ArraysKt___ArraysKt.toList(arr_object);
        }
        if(v == 1) {
            return k.listOf(arr_object[0]);
        }
        List list0 = new ArrayList(v);
        int v2 = 0;
        for(int v1 = 0; v1 < arr_object.length; ++v1) {
            ((ArrayList)list0).add(arr_object[v1]);
            ++v2;
            if(v2 == v) {
                break;
            }
        }
        return list0;
    }

    @NotNull
    public static final List take(@NotNull short[] arr_v, int v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        if(v == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if(v >= arr_v.length) {
            return ArraysKt___ArraysKt.toList(arr_v);
        }
        if(v == 1) {
            return k.listOf(((short)arr_v[0]));
        }
        List list0 = new ArrayList(v);
        int v2 = 0;
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            ((ArrayList)list0).add(((short)arr_v[v1]));
            ++v2;
            if(v2 == v) {
                break;
            }
        }
        return list0;
    }

    @NotNull
    public static final List take(@NotNull boolean[] arr_z, int v) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        if(v == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if(v >= arr_z.length) {
            return ArraysKt___ArraysKt.toList(arr_z);
        }
        if(v == 1) {
            return k.listOf(Boolean.valueOf(arr_z[0]));
        }
        List list0 = new ArrayList(v);
        int v2 = 0;
        for(int v1 = 0; v1 < arr_z.length; ++v1) {
            ((ArrayList)list0).add(Boolean.valueOf(arr_z[v1]));
            ++v2;
            if(v2 == v) {
                break;
            }
        }
        return list0;
    }

    @NotNull
    public static final List takeLast(@NotNull byte[] arr_b, int v) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        if(v == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if(v >= arr_b.length) {
            return ArraysKt___ArraysKt.toList(arr_b);
        }
        if(v == 1) {
            return k.listOf(((byte)arr_b[arr_b.length - 1]));
        }
        List list0 = new ArrayList(v);
        for(int v1 = arr_b.length - v; v1 < arr_b.length; ++v1) {
            ((ArrayList)list0).add(((byte)arr_b[v1]));
        }
        return list0;
    }

    @NotNull
    public static final List takeLast(@NotNull char[] arr_c, int v) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(q.m(v, "Requested element count ", " is less than zero.").toString());
        }
        if(v == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if(v >= arr_c.length) {
            return ArraysKt___ArraysKt.toList(arr_c);
        }
        if(v == 1) {
            return k.listOf(Character.valueOf(arr_c[arr_c.length - 1]));
        }
        List list0 = new ArrayList(v);
        for(int v1 = arr_c.length - v; v1 < arr_c.length; ++v1) {
            ((ArrayList)list0).add(Character.valueOf(arr_c[v1]));
        }
        return list0;
    }

    @NotNull
    public static final List takeLast(@NotNull double[] arr_f, int v) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        if(v == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if(v >= arr_f.length) {
            return ArraysKt___ArraysKt.toList(arr_f);
        }
        if(v == 1) {
            return k.listOf(((double)arr_f[arr_f.length - 1]));
        }
        List list0 = new ArrayList(v);
        for(int v1 = arr_f.length - v; v1 < arr_f.length; ++v1) {
            ((ArrayList)list0).add(((double)arr_f[v1]));
        }
        return list0;
    }

    @NotNull
    public static final List takeLast(@NotNull float[] arr_f, int v) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        if(v == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if(v >= arr_f.length) {
            return ArraysKt___ArraysKt.toList(arr_f);
        }
        if(v == 1) {
            return k.listOf(((float)arr_f[arr_f.length - 1]));
        }
        List list0 = new ArrayList(v);
        for(int v1 = arr_f.length - v; v1 < arr_f.length; ++v1) {
            ((ArrayList)list0).add(((float)arr_f[v1]));
        }
        return list0;
    }

    @NotNull
    public static final List takeLast(@NotNull int[] arr_v, int v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        if(v == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if(v >= arr_v.length) {
            return ArraysKt___ArraysKt.toList(arr_v);
        }
        if(v == 1) {
            return k.listOf(((int)arr_v[arr_v.length - 1]));
        }
        List list0 = new ArrayList(v);
        for(int v1 = arr_v.length - v; v1 < arr_v.length; ++v1) {
            ((ArrayList)list0).add(((int)arr_v[v1]));
        }
        return list0;
    }

    @NotNull
    public static final List takeLast(@NotNull long[] arr_v, int v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        if(v == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if(v >= arr_v.length) {
            return ArraysKt___ArraysKt.toList(arr_v);
        }
        if(v == 1) {
            return k.listOf(((long)arr_v[arr_v.length - 1]));
        }
        List list0 = new ArrayList(v);
        for(int v1 = arr_v.length - v; v1 < arr_v.length; ++v1) {
            ((ArrayList)list0).add(((long)arr_v[v1]));
        }
        return list0;
    }

    @NotNull
    public static final List takeLast(@NotNull Object[] arr_object, int v) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        if(v == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if(v >= arr_object.length) {
            return ArraysKt___ArraysKt.toList(arr_object);
        }
        if(v == 1) {
            return k.listOf(arr_object[arr_object.length - 1]);
        }
        List list0 = new ArrayList(v);
        for(int v1 = arr_object.length - v; v1 < arr_object.length; ++v1) {
            ((ArrayList)list0).add(arr_object[v1]);
        }
        return list0;
    }

    @NotNull
    public static final List takeLast(@NotNull short[] arr_v, int v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        if(v == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if(v >= arr_v.length) {
            return ArraysKt___ArraysKt.toList(arr_v);
        }
        if(v == 1) {
            return k.listOf(((short)arr_v[arr_v.length - 1]));
        }
        List list0 = new ArrayList(v);
        for(int v1 = arr_v.length - v; v1 < arr_v.length; ++v1) {
            ((ArrayList)list0).add(((short)arr_v[v1]));
        }
        return list0;
    }

    @NotNull
    public static final List takeLast(@NotNull boolean[] arr_z, int v) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        if(v == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if(v >= arr_z.length) {
            return ArraysKt___ArraysKt.toList(arr_z);
        }
        if(v == 1) {
            return k.listOf(Boolean.valueOf(arr_z[arr_z.length - 1]));
        }
        List list0 = new ArrayList(v);
        for(int v1 = arr_z.length - v; v1 < arr_z.length; ++v1) {
            ((ArrayList)list0).add(Boolean.valueOf(arr_z[v1]));
        }
        return list0;
    }

    @NotNull
    public static final List takeLastWhile(@NotNull byte[] arr_b, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = ArraysKt___ArraysKt.getLastIndex(arr_b); -1 < v; --v) {
            if(!((Boolean)function10.invoke(((byte)arr_b[v]))).booleanValue()) {
                return ArraysKt___ArraysKt.drop(arr_b, v + 1);
            }
        }
        return ArraysKt___ArraysKt.toList(arr_b);
    }

    @NotNull
    public static final List takeLastWhile(@NotNull char[] arr_c, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = ArraysKt___ArraysKt.getLastIndex(arr_c); -1 < v; --v) {
            if(!((Boolean)function10.invoke(Character.valueOf(arr_c[v]))).booleanValue()) {
                return ArraysKt___ArraysKt.drop(arr_c, v + 1);
            }
        }
        return ArraysKt___ArraysKt.toList(arr_c);
    }

    @NotNull
    public static final List takeLastWhile(@NotNull double[] arr_f, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = ArraysKt___ArraysKt.getLastIndex(arr_f); -1 < v; --v) {
            if(!((Boolean)function10.invoke(((double)arr_f[v]))).booleanValue()) {
                return ArraysKt___ArraysKt.drop(arr_f, v + 1);
            }
        }
        return ArraysKt___ArraysKt.toList(arr_f);
    }

    @NotNull
    public static final List takeLastWhile(@NotNull float[] arr_f, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = ArraysKt___ArraysKt.getLastIndex(arr_f); -1 < v; --v) {
            if(!((Boolean)function10.invoke(((float)arr_f[v]))).booleanValue()) {
                return ArraysKt___ArraysKt.drop(arr_f, v + 1);
            }
        }
        return ArraysKt___ArraysKt.toList(arr_f);
    }

    @NotNull
    public static final List takeLastWhile(@NotNull int[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = ArraysKt___ArraysKt.getLastIndex(arr_v); -1 < v; --v) {
            if(!((Boolean)function10.invoke(((int)arr_v[v]))).booleanValue()) {
                return ArraysKt___ArraysKt.drop(arr_v, v + 1);
            }
        }
        return ArraysKt___ArraysKt.toList(arr_v);
    }

    @NotNull
    public static final List takeLastWhile(@NotNull long[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = ArraysKt___ArraysKt.getLastIndex(arr_v); -1 < v; --v) {
            if(!((Boolean)function10.invoke(((long)arr_v[v]))).booleanValue()) {
                return ArraysKt___ArraysKt.drop(arr_v, v + 1);
            }
        }
        return ArraysKt___ArraysKt.toList(arr_v);
    }

    @NotNull
    public static final List takeLastWhile(@NotNull Object[] arr_object, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = ArraysKt___ArraysKt.getLastIndex(arr_object); -1 < v; --v) {
            if(!((Boolean)function10.invoke(arr_object[v])).booleanValue()) {
                return ArraysKt___ArraysKt.drop(arr_object, v + 1);
            }
        }
        return ArraysKt___ArraysKt.toList(arr_object);
    }

    @NotNull
    public static final List takeLastWhile(@NotNull short[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = ArraysKt___ArraysKt.getLastIndex(arr_v); -1 < v; --v) {
            if(!((Boolean)function10.invoke(((short)arr_v[v]))).booleanValue()) {
                return ArraysKt___ArraysKt.drop(arr_v, v + 1);
            }
        }
        return ArraysKt___ArraysKt.toList(arr_v);
    }

    @NotNull
    public static final List takeLastWhile(@NotNull boolean[] arr_z, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = ArraysKt___ArraysKt.getLastIndex(arr_z); -1 < v; --v) {
            if(!((Boolean)function10.invoke(Boolean.valueOf(arr_z[v]))).booleanValue()) {
                return ArraysKt___ArraysKt.drop(arr_z, v + 1);
            }
        }
        return ArraysKt___ArraysKt.toList(arr_z);
    }

    @NotNull
    public static final List takeWhile(@NotNull byte[] arr_b, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_b.length; ++v) {
            int v1 = arr_b[v];
            if(!((Boolean)function10.invoke(((byte)v1))).booleanValue()) {
                break;
            }
            ((ArrayList)list0).add(((byte)v1));
        }
        return list0;
    }

    @NotNull
    public static final List takeWhile(@NotNull char[] arr_c, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_c.length; ++v) {
            int v1 = arr_c[v];
            if(!((Boolean)function10.invoke(Character.valueOf(((char)v1)))).booleanValue()) {
                break;
            }
            ((ArrayList)list0).add(Character.valueOf(((char)v1)));
        }
        return list0;
    }

    @NotNull
    public static final List takeWhile(@NotNull double[] arr_f, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_f.length; ++v) {
            double f = arr_f[v];
            if(!((Boolean)function10.invoke(f)).booleanValue()) {
                break;
            }
            ((ArrayList)list0).add(f);
        }
        return list0;
    }

    @NotNull
    public static final List takeWhile(@NotNull float[] arr_f, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_f.length; ++v) {
            float f = arr_f[v];
            if(!((Boolean)function10.invoke(f)).booleanValue()) {
                break;
            }
            ((ArrayList)list0).add(f);
        }
        return list0;
    }

    @NotNull
    public static final List takeWhile(@NotNull int[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            if(!((Boolean)function10.invoke(v1)).booleanValue()) {
                break;
            }
            ((ArrayList)list0).add(v1);
        }
        return list0;
    }

    @NotNull
    public static final List takeWhile(@NotNull long[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_v.length; ++v) {
            long v1 = arr_v[v];
            if(!((Boolean)function10.invoke(v1)).booleanValue()) {
                break;
            }
            ((ArrayList)list0).add(v1);
        }
        return list0;
    }

    @NotNull
    public static final List takeWhile(@NotNull Object[] arr_object, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            if(!((Boolean)function10.invoke(object0)).booleanValue()) {
                break;
            }
            ((ArrayList)list0).add(object0);
        }
        return list0;
    }

    @NotNull
    public static final List takeWhile(@NotNull short[] arr_v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            if(!((Boolean)function10.invoke(((short)v1))).booleanValue()) {
                break;
            }
            ((ArrayList)list0).add(((short)v1));
        }
        return list0;
    }

    @NotNull
    public static final List takeWhile(@NotNull boolean[] arr_z, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_z.length; ++v) {
            boolean z = arr_z[v];
            if(!((Boolean)function10.invoke(Boolean.valueOf(z))).booleanValue()) {
                break;
            }
            ((ArrayList)list0).add(Boolean.valueOf(z));
        }
        return list0;
    }

    @NotNull
    public static final boolean[] toBooleanArray(@NotNull Boolean[] arr_boolean) {
        Intrinsics.checkNotNullParameter(arr_boolean, "<this>");
        boolean[] arr_z = new boolean[arr_boolean.length];
        for(int v = 0; v < arr_boolean.length; ++v) {
            arr_z[v] = arr_boolean[v].booleanValue();
        }
        return arr_z;
    }

    @NotNull
    public static final byte[] toByteArray(@NotNull Byte[] arr_byte) {
        Intrinsics.checkNotNullParameter(arr_byte, "<this>");
        byte[] arr_b = new byte[arr_byte.length];
        for(int v = 0; v < arr_byte.length; ++v) {
            arr_b[v] = (byte)arr_byte[v];
        }
        return arr_b;
    }

    @NotNull
    public static final char[] toCharArray(@NotNull Character[] arr_character) {
        Intrinsics.checkNotNullParameter(arr_character, "<this>");
        char[] arr_c = new char[arr_character.length];
        for(int v = 0; v < arr_character.length; ++v) {
            arr_c[v] = arr_character[v].charValue();
        }
        return arr_c;
    }

    @NotNull
    public static final Collection toCollection(@NotNull byte[] arr_b, @NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        for(int v = 0; v < arr_b.length; ++v) {
            collection0.add(((byte)arr_b[v]));
        }
        return collection0;
    }

    @NotNull
    public static final Collection toCollection(@NotNull char[] arr_c, @NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        for(int v = 0; v < arr_c.length; ++v) {
            collection0.add(Character.valueOf(arr_c[v]));
        }
        return collection0;
    }

    @NotNull
    public static final Collection toCollection(@NotNull double[] arr_f, @NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        for(int v = 0; v < arr_f.length; ++v) {
            collection0.add(((double)arr_f[v]));
        }
        return collection0;
    }

    @NotNull
    public static final Collection toCollection(@NotNull float[] arr_f, @NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        for(int v = 0; v < arr_f.length; ++v) {
            collection0.add(((float)arr_f[v]));
        }
        return collection0;
    }

    @NotNull
    public static final Collection toCollection(@NotNull int[] arr_v, @NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        for(int v = 0; v < arr_v.length; ++v) {
            collection0.add(((int)arr_v[v]));
        }
        return collection0;
    }

    @NotNull
    public static final Collection toCollection(@NotNull long[] arr_v, @NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        for(int v = 0; v < arr_v.length; ++v) {
            collection0.add(((long)arr_v[v]));
        }
        return collection0;
    }

    @NotNull
    public static final Collection toCollection(@NotNull Object[] arr_object, @NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        for(int v = 0; v < arr_object.length; ++v) {
            collection0.add(arr_object[v]);
        }
        return collection0;
    }

    @NotNull
    public static final Collection toCollection(@NotNull short[] arr_v, @NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        for(int v = 0; v < arr_v.length; ++v) {
            collection0.add(((short)arr_v[v]));
        }
        return collection0;
    }

    @NotNull
    public static final Collection toCollection(@NotNull boolean[] arr_z, @NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        for(int v = 0; v < arr_z.length; ++v) {
            collection0.add(Boolean.valueOf(arr_z[v]));
        }
        return collection0;
    }

    @NotNull
    public static final double[] toDoubleArray(@NotNull Double[] arr_double) {
        Intrinsics.checkNotNullParameter(arr_double, "<this>");
        double[] arr_f = new double[arr_double.length];
        for(int v = 0; v < arr_double.length; ++v) {
            arr_f[v] = (double)arr_double[v];
        }
        return arr_f;
    }

    @NotNull
    public static final float[] toFloatArray(@NotNull Float[] arr_float) {
        Intrinsics.checkNotNullParameter(arr_float, "<this>");
        float[] arr_f = new float[arr_float.length];
        for(int v = 0; v < arr_float.length; ++v) {
            arr_f[v] = (float)arr_float[v];
        }
        return arr_f;
    }

    @NotNull
    public static final HashSet toHashSet(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        return (HashSet)ArraysKt___ArraysKt.toCollection(arr_b, new HashSet(w.mapCapacity(arr_b.length)));
    }

    @NotNull
    public static final HashSet toHashSet(@NotNull char[] arr_c) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        return (HashSet)ArraysKt___ArraysKt.toCollection(arr_c, new HashSet(w.mapCapacity(c.coerceAtMost(arr_c.length, 0x80))));
    }

    @NotNull
    public static final HashSet toHashSet(@NotNull double[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        return (HashSet)ArraysKt___ArraysKt.toCollection(arr_f, new HashSet(w.mapCapacity(arr_f.length)));
    }

    @NotNull
    public static final HashSet toHashSet(@NotNull float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        return (HashSet)ArraysKt___ArraysKt.toCollection(arr_f, new HashSet(w.mapCapacity(arr_f.length)));
    }

    @NotNull
    public static final HashSet toHashSet(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        return (HashSet)ArraysKt___ArraysKt.toCollection(arr_v, new HashSet(w.mapCapacity(arr_v.length)));
    }

    @NotNull
    public static final HashSet toHashSet(@NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        return (HashSet)ArraysKt___ArraysKt.toCollection(arr_v, new HashSet(w.mapCapacity(arr_v.length)));
    }

    @NotNull
    public static final HashSet toHashSet(@NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        return (HashSet)ArraysKt___ArraysKt.toCollection(arr_object, new HashSet(w.mapCapacity(arr_object.length)));
    }

    @NotNull
    public static final HashSet toHashSet(@NotNull short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        return (HashSet)ArraysKt___ArraysKt.toCollection(arr_v, new HashSet(w.mapCapacity(arr_v.length)));
    }

    @NotNull
    public static final HashSet toHashSet(@NotNull boolean[] arr_z) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        return (HashSet)ArraysKt___ArraysKt.toCollection(arr_z, new HashSet(w.mapCapacity(arr_z.length)));
    }

    @NotNull
    public static final int[] toIntArray(@NotNull Integer[] arr_integer) {
        Intrinsics.checkNotNullParameter(arr_integer, "<this>");
        int[] arr_v = new int[arr_integer.length];
        for(int v = 0; v < arr_integer.length; ++v) {
            arr_v[v] = (int)arr_integer[v];
        }
        return arr_v;
    }

    @NotNull
    public static List toList(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        switch(arr_b.length) {
            case 0: {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            case 1: {
                return k.listOf(((byte)arr_b[0]));
            }
            default: {
                return ArraysKt___ArraysKt.toMutableList(arr_b);
            }
        }
    }

    @NotNull
    public static List toList(@NotNull char[] arr_c) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        switch(arr_c.length) {
            case 0: {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            case 1: {
                return k.listOf(Character.valueOf(arr_c[0]));
            }
            default: {
                return ArraysKt___ArraysKt.toMutableList(arr_c);
            }
        }
    }

    @NotNull
    public static List toList(@NotNull double[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        switch(arr_f.length) {
            case 0: {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            case 1: {
                return k.listOf(((double)arr_f[0]));
            }
            default: {
                return ArraysKt___ArraysKt.toMutableList(arr_f);
            }
        }
    }

    @NotNull
    public static List toList(@NotNull float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        switch(arr_f.length) {
            case 0: {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            case 1: {
                return k.listOf(((float)arr_f[0]));
            }
            default: {
                return ArraysKt___ArraysKt.toMutableList(arr_f);
            }
        }
    }

    @NotNull
    public static List toList(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        switch(arr_v.length) {
            case 0: {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            case 1: {
                return k.listOf(((int)arr_v[0]));
            }
            default: {
                return ArraysKt___ArraysKt.toMutableList(arr_v);
            }
        }
    }

    @NotNull
    public static List toList(@NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        switch(arr_v.length) {
            case 0: {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            case 1: {
                return k.listOf(((long)arr_v[0]));
            }
            default: {
                return ArraysKt___ArraysKt.toMutableList(arr_v);
            }
        }
    }

    @NotNull
    public static List toList(@NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        switch(arr_object.length) {
            case 0: {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            case 1: {
                return k.listOf(arr_object[0]);
            }
            default: {
                return ArraysKt___ArraysKt.toMutableList(arr_object);
            }
        }
    }

    @NotNull
    public static List toList(@NotNull short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        switch(arr_v.length) {
            case 0: {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            case 1: {
                return k.listOf(((short)arr_v[0]));
            }
            default: {
                return ArraysKt___ArraysKt.toMutableList(arr_v);
            }
        }
    }

    @NotNull
    public static List toList(@NotNull boolean[] arr_z) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        switch(arr_z.length) {
            case 0: {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            case 1: {
                return k.listOf(Boolean.valueOf(arr_z[0]));
            }
            default: {
                return ArraysKt___ArraysKt.toMutableList(arr_z);
            }
        }
    }

    @NotNull
    public static final long[] toLongArray(@NotNull Long[] arr_long) {
        Intrinsics.checkNotNullParameter(arr_long, "<this>");
        long[] arr_v = new long[arr_long.length];
        for(int v = 0; v < arr_long.length; ++v) {
            arr_v[v] = (long)arr_long[v];
        }
        return arr_v;
    }

    @NotNull
    public static final List toMutableList(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        List list0 = new ArrayList(arr_b.length);
        for(int v = 0; v < arr_b.length; ++v) {
            ((ArrayList)list0).add(((byte)arr_b[v]));
        }
        return list0;
    }

    @NotNull
    public static final List toMutableList(@NotNull char[] arr_c) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        List list0 = new ArrayList(arr_c.length);
        for(int v = 0; v < arr_c.length; ++v) {
            ((ArrayList)list0).add(Character.valueOf(arr_c[v]));
        }
        return list0;
    }

    @NotNull
    public static final List toMutableList(@NotNull double[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        List list0 = new ArrayList(arr_f.length);
        for(int v = 0; v < arr_f.length; ++v) {
            ((ArrayList)list0).add(((double)arr_f[v]));
        }
        return list0;
    }

    @NotNull
    public static final List toMutableList(@NotNull float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        List list0 = new ArrayList(arr_f.length);
        for(int v = 0; v < arr_f.length; ++v) {
            ((ArrayList)list0).add(((float)arr_f[v]));
        }
        return list0;
    }

    @NotNull
    public static List toMutableList(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        List list0 = new ArrayList(arr_v.length);
        for(int v = 0; v < arr_v.length; ++v) {
            ((ArrayList)list0).add(((int)arr_v[v]));
        }
        return list0;
    }

    @NotNull
    public static final List toMutableList(@NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        List list0 = new ArrayList(arr_v.length);
        for(int v = 0; v < arr_v.length; ++v) {
            ((ArrayList)list0).add(((long)arr_v[v]));
        }
        return list0;
    }

    @NotNull
    public static List toMutableList(@NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        return new ArrayList(CollectionsKt__CollectionsKt.asCollection(arr_object));
    }

    @NotNull
    public static final List toMutableList(@NotNull short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        List list0 = new ArrayList(arr_v.length);
        for(int v = 0; v < arr_v.length; ++v) {
            ((ArrayList)list0).add(((short)arr_v[v]));
        }
        return list0;
    }

    @NotNull
    public static final List toMutableList(@NotNull boolean[] arr_z) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        List list0 = new ArrayList(arr_z.length);
        for(int v = 0; v < arr_z.length; ++v) {
            ((ArrayList)list0).add(Boolean.valueOf(arr_z[v]));
        }
        return list0;
    }

    @NotNull
    public static final Set toMutableSet(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        return (Set)ArraysKt___ArraysKt.toCollection(arr_b, new LinkedHashSet(w.mapCapacity(arr_b.length)));
    }

    @NotNull
    public static final Set toMutableSet(@NotNull char[] arr_c) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        return (Set)ArraysKt___ArraysKt.toCollection(arr_c, new LinkedHashSet(w.mapCapacity(c.coerceAtMost(arr_c.length, 0x80))));
    }

    @NotNull
    public static final Set toMutableSet(@NotNull double[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        return (Set)ArraysKt___ArraysKt.toCollection(arr_f, new LinkedHashSet(w.mapCapacity(arr_f.length)));
    }

    @NotNull
    public static final Set toMutableSet(@NotNull float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        return (Set)ArraysKt___ArraysKt.toCollection(arr_f, new LinkedHashSet(w.mapCapacity(arr_f.length)));
    }

    @NotNull
    public static final Set toMutableSet(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        return (Set)ArraysKt___ArraysKt.toCollection(arr_v, new LinkedHashSet(w.mapCapacity(arr_v.length)));
    }

    @NotNull
    public static final Set toMutableSet(@NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        return (Set)ArraysKt___ArraysKt.toCollection(arr_v, new LinkedHashSet(w.mapCapacity(arr_v.length)));
    }

    @NotNull
    public static final Set toMutableSet(@NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        return (Set)ArraysKt___ArraysKt.toCollection(arr_object, new LinkedHashSet(w.mapCapacity(arr_object.length)));
    }

    @NotNull
    public static final Set toMutableSet(@NotNull short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        return (Set)ArraysKt___ArraysKt.toCollection(arr_v, new LinkedHashSet(w.mapCapacity(arr_v.length)));
    }

    @NotNull
    public static final Set toMutableSet(@NotNull boolean[] arr_z) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        return (Set)ArraysKt___ArraysKt.toCollection(arr_z, new LinkedHashSet(w.mapCapacity(arr_z.length)));
    }

    @NotNull
    public static final Set toSet(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        switch(arr_b.length) {
            case 0: {
                return f0.emptySet();
            }
            case 1: {
                return e0.setOf(((byte)arr_b[0]));
            }
            default: {
                return (Set)ArraysKt___ArraysKt.toCollection(arr_b, new LinkedHashSet(w.mapCapacity(arr_b.length)));
            }
        }
    }

    @NotNull
    public static final Set toSet(@NotNull char[] arr_c) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        switch(arr_c.length) {
            case 0: {
                return f0.emptySet();
            }
            case 1: {
                return e0.setOf(Character.valueOf(arr_c[0]));
            }
            default: {
                return (Set)ArraysKt___ArraysKt.toCollection(arr_c, new LinkedHashSet(w.mapCapacity(c.coerceAtMost(arr_c.length, 0x80))));
            }
        }
    }

    @NotNull
    public static final Set toSet(@NotNull double[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        switch(arr_f.length) {
            case 0: {
                return f0.emptySet();
            }
            case 1: {
                return e0.setOf(((double)arr_f[0]));
            }
            default: {
                return (Set)ArraysKt___ArraysKt.toCollection(arr_f, new LinkedHashSet(w.mapCapacity(arr_f.length)));
            }
        }
    }

    @NotNull
    public static final Set toSet(@NotNull float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        switch(arr_f.length) {
            case 0: {
                return f0.emptySet();
            }
            case 1: {
                return e0.setOf(((float)arr_f[0]));
            }
            default: {
                return (Set)ArraysKt___ArraysKt.toCollection(arr_f, new LinkedHashSet(w.mapCapacity(arr_f.length)));
            }
        }
    }

    @NotNull
    public static final Set toSet(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        switch(arr_v.length) {
            case 0: {
                return f0.emptySet();
            }
            case 1: {
                return e0.setOf(((int)arr_v[0]));
            }
            default: {
                return (Set)ArraysKt___ArraysKt.toCollection(arr_v, new LinkedHashSet(w.mapCapacity(arr_v.length)));
            }
        }
    }

    @NotNull
    public static final Set toSet(@NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        switch(arr_v.length) {
            case 0: {
                return f0.emptySet();
            }
            case 1: {
                return e0.setOf(((long)arr_v[0]));
            }
            default: {
                return (Set)ArraysKt___ArraysKt.toCollection(arr_v, new LinkedHashSet(w.mapCapacity(arr_v.length)));
            }
        }
    }

    @NotNull
    public static Set toSet(@NotNull Object[] arr_object) [...] // Inlined contents

    @NotNull
    public static final Set toSet(@NotNull short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        switch(arr_v.length) {
            case 0: {
                return f0.emptySet();
            }
            case 1: {
                return e0.setOf(((short)arr_v[0]));
            }
            default: {
                return (Set)ArraysKt___ArraysKt.toCollection(arr_v, new LinkedHashSet(w.mapCapacity(arr_v.length)));
            }
        }
    }

    @NotNull
    public static final Set toSet(@NotNull boolean[] arr_z) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        switch(arr_z.length) {
            case 0: {
                return f0.emptySet();
            }
            case 1: {
                return e0.setOf(Boolean.valueOf(arr_z[0]));
            }
            default: {
                return (Set)ArraysKt___ArraysKt.toCollection(arr_z, new LinkedHashSet(w.mapCapacity(arr_z.length)));
            }
        }
    }

    @NotNull
    public static final short[] toShortArray(@NotNull Short[] arr_short) {
        Intrinsics.checkNotNullParameter(arr_short, "<this>");
        short[] arr_v = new short[arr_short.length];
        for(int v = 0; v < arr_short.length; ++v) {
            arr_v[v] = (short)arr_short[v];
        }
        return arr_v;
    }

    @NotNull
    public static final Set union(@NotNull byte[] arr_b, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "other");
        Set set0 = ArraysKt___ArraysKt.toMutableSet(arr_b);
        o.addAll(set0, iterable0);
        return set0;
    }

    @NotNull
    public static final Set union(@NotNull char[] arr_c, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "other");
        Set set0 = ArraysKt___ArraysKt.toMutableSet(arr_c);
        o.addAll(set0, iterable0);
        return set0;
    }

    @NotNull
    public static final Set union(@NotNull double[] arr_f, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "other");
        Set set0 = ArraysKt___ArraysKt.toMutableSet(arr_f);
        o.addAll(set0, iterable0);
        return set0;
    }

    @NotNull
    public static final Set union(@NotNull float[] arr_f, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "other");
        Set set0 = ArraysKt___ArraysKt.toMutableSet(arr_f);
        o.addAll(set0, iterable0);
        return set0;
    }

    @NotNull
    public static final Set union(@NotNull int[] arr_v, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "other");
        Set set0 = ArraysKt___ArraysKt.toMutableSet(arr_v);
        o.addAll(set0, iterable0);
        return set0;
    }

    @NotNull
    public static final Set union(@NotNull long[] arr_v, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "other");
        Set set0 = ArraysKt___ArraysKt.toMutableSet(arr_v);
        o.addAll(set0, iterable0);
        return set0;
    }

    @NotNull
    public static final Set union(@NotNull Object[] arr_object, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "other");
        Set set0 = ArraysKt___ArraysKt.toMutableSet(arr_object);
        o.addAll(set0, iterable0);
        return set0;
    }

    @NotNull
    public static final Set union(@NotNull short[] arr_v, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "other");
        Set set0 = ArraysKt___ArraysKt.toMutableSet(arr_v);
        o.addAll(set0, iterable0);
        return set0;
    }

    @NotNull
    public static final Set union(@NotNull boolean[] arr_z, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "other");
        Set set0 = ArraysKt___ArraysKt.toMutableSet(arr_z);
        o.addAll(set0, iterable0);
        return set0;
    }

    @NotNull
    public static final Iterable withIndex(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        return new IndexingIterable(new g(arr_b, 0));
    }

    @NotNull
    public static final Iterable withIndex(@NotNull char[] arr_c) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        return new IndexingIterable(new j(arr_c, 11));
    }

    @NotNull
    public static final Iterable withIndex(@NotNull double[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        return new IndexingIterable(new j(arr_f, 9));
    }

    @NotNull
    public static final Iterable withIndex(@NotNull float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        return new IndexingIterable(new j(arr_f, 8));
    }

    @NotNull
    public static final Iterable withIndex(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        return new IndexingIterable(new kotlin.collections.i(0, arr_v));
    }

    @NotNull
    public static final Iterable withIndex(@NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        return new IndexingIterable(new kotlin.collections.j(arr_v, 0));
    }

    @NotNull
    public static Iterable withIndex(@NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        return new IndexingIterable(new j(arr_object, 7));
    }

    @NotNull
    public static final Iterable withIndex(@NotNull short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        return new IndexingIterable(new h(arr_v, 0));
    }

    @NotNull
    public static final Iterable withIndex(@NotNull boolean[] arr_z) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        return new IndexingIterable(new j(arr_z, 10));
    }

    @NotNull
    public static final List zip(@NotNull byte[] arr_b, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "other");
        List list0 = new ArrayList(Math.min(l.collectionSizeOrDefault(iterable0, 10), arr_b.length));
        int v = 0;
        for(Object object0: iterable0) {
            if(v >= arr_b.length) {
                break;
            }
            ((ArrayList)list0).add(TuplesKt.to(((byte)arr_b[v]), object0));
            ++v;
        }
        return list0;
    }

    @NotNull
    public static final List zip(@NotNull byte[] arr_b, @NotNull Iterable iterable0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "other");
        Intrinsics.checkNotNullParameter(function20, "transform");
        List list0 = new ArrayList(Math.min(l.collectionSizeOrDefault(iterable0, 10), arr_b.length));
        int v = 0;
        for(Object object0: iterable0) {
            if(v >= arr_b.length) {
                break;
            }
            ((ArrayList)list0).add(function20.invoke(((byte)arr_b[v]), object0));
            ++v;
        }
        return list0;
    }

    @NotNull
    public static final List zip(@NotNull byte[] arr_b, @NotNull byte[] arr_b1) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(arr_b1, "other");
        int v = Math.min(arr_b.length, arr_b1.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(TuplesKt.to(((byte)arr_b[v1]), ((byte)arr_b1[v1])));
        }
        return list0;
    }

    @NotNull
    public static final List zip(@NotNull byte[] arr_b, @NotNull byte[] arr_b1, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(arr_b1, "other");
        Intrinsics.checkNotNullParameter(function20, "transform");
        int v = Math.min(arr_b.length, arr_b1.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(function20.invoke(((byte)arr_b[v1]), ((byte)arr_b1[v1])));
        }
        return list0;
    }

    @NotNull
    public static final List zip(@NotNull byte[] arr_b, @NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(arr_object, "other");
        int v = Math.min(arr_b.length, arr_object.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(TuplesKt.to(((byte)arr_b[v1]), arr_object[v1]));
        }
        return list0;
    }

    @NotNull
    public static final List zip(@NotNull byte[] arr_b, @NotNull Object[] arr_object, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(arr_object, "other");
        Intrinsics.checkNotNullParameter(function20, "transform");
        int v = Math.min(arr_b.length, arr_object.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(function20.invoke(((byte)arr_b[v1]), arr_object[v1]));
        }
        return list0;
    }

    @NotNull
    public static final List zip(@NotNull char[] arr_c, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "other");
        List list0 = new ArrayList(Math.min(l.collectionSizeOrDefault(iterable0, 10), arr_c.length));
        int v = 0;
        for(Object object0: iterable0) {
            if(v >= arr_c.length) {
                break;
            }
            ((ArrayList)list0).add(TuplesKt.to(Character.valueOf(arr_c[v]), object0));
            ++v;
        }
        return list0;
    }

    @NotNull
    public static final List zip(@NotNull char[] arr_c, @NotNull Iterable iterable0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "other");
        Intrinsics.checkNotNullParameter(function20, "transform");
        List list0 = new ArrayList(Math.min(l.collectionSizeOrDefault(iterable0, 10), arr_c.length));
        int v = 0;
        for(Object object0: iterable0) {
            if(v >= arr_c.length) {
                break;
            }
            ((ArrayList)list0).add(function20.invoke(Character.valueOf(arr_c[v]), object0));
            ++v;
        }
        return list0;
    }

    @NotNull
    public static final List zip(@NotNull char[] arr_c, @NotNull char[] arr_c1) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(arr_c1, "other");
        int v = Math.min(arr_c.length, arr_c1.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(TuplesKt.to(Character.valueOf(arr_c[v1]), Character.valueOf(arr_c1[v1])));
        }
        return list0;
    }

    @NotNull
    public static final List zip(@NotNull char[] arr_c, @NotNull char[] arr_c1, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(arr_c1, "other");
        Intrinsics.checkNotNullParameter(function20, "transform");
        int v = Math.min(arr_c.length, arr_c1.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(function20.invoke(Character.valueOf(arr_c[v1]), Character.valueOf(arr_c1[v1])));
        }
        return list0;
    }

    @NotNull
    public static final List zip(@NotNull char[] arr_c, @NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(arr_object, "other");
        int v = Math.min(arr_c.length, arr_object.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(TuplesKt.to(Character.valueOf(arr_c[v1]), arr_object[v1]));
        }
        return list0;
    }

    @NotNull
    public static final List zip(@NotNull char[] arr_c, @NotNull Object[] arr_object, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(arr_object, "other");
        Intrinsics.checkNotNullParameter(function20, "transform");
        int v = Math.min(arr_c.length, arr_object.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(function20.invoke(Character.valueOf(arr_c[v1]), arr_object[v1]));
        }
        return list0;
    }

    @NotNull
    public static final List zip(@NotNull double[] arr_f, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "other");
        List list0 = new ArrayList(Math.min(l.collectionSizeOrDefault(iterable0, 10), arr_f.length));
        int v = 0;
        for(Object object0: iterable0) {
            if(v >= arr_f.length) {
                break;
            }
            ((ArrayList)list0).add(TuplesKt.to(((double)arr_f[v]), object0));
            ++v;
        }
        return list0;
    }

    @NotNull
    public static final List zip(@NotNull double[] arr_f, @NotNull Iterable iterable0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "other");
        Intrinsics.checkNotNullParameter(function20, "transform");
        List list0 = new ArrayList(Math.min(l.collectionSizeOrDefault(iterable0, 10), arr_f.length));
        int v = 0;
        for(Object object0: iterable0) {
            if(v >= arr_f.length) {
                break;
            }
            ((ArrayList)list0).add(function20.invoke(((double)arr_f[v]), object0));
            ++v;
        }
        return list0;
    }

    @NotNull
    public static final List zip(@NotNull double[] arr_f, @NotNull double[] arr_f1) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(arr_f1, "other");
        int v = Math.min(arr_f.length, arr_f1.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(TuplesKt.to(((double)arr_f[v1]), ((double)arr_f1[v1])));
        }
        return list0;
    }

    @NotNull
    public static final List zip(@NotNull double[] arr_f, @NotNull double[] arr_f1, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(arr_f1, "other");
        Intrinsics.checkNotNullParameter(function20, "transform");
        int v = Math.min(arr_f.length, arr_f1.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(function20.invoke(((double)arr_f[v1]), ((double)arr_f1[v1])));
        }
        return list0;
    }

    @NotNull
    public static final List zip(@NotNull double[] arr_f, @NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(arr_object, "other");
        int v = Math.min(arr_f.length, arr_object.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(TuplesKt.to(((double)arr_f[v1]), arr_object[v1]));
        }
        return list0;
    }

    @NotNull
    public static final List zip(@NotNull double[] arr_f, @NotNull Object[] arr_object, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(arr_object, "other");
        Intrinsics.checkNotNullParameter(function20, "transform");
        int v = Math.min(arr_f.length, arr_object.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(function20.invoke(((double)arr_f[v1]), arr_object[v1]));
        }
        return list0;
    }

    @NotNull
    public static final List zip(@NotNull float[] arr_f, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "other");
        List list0 = new ArrayList(Math.min(l.collectionSizeOrDefault(iterable0, 10), arr_f.length));
        int v = 0;
        for(Object object0: iterable0) {
            if(v >= arr_f.length) {
                break;
            }
            ((ArrayList)list0).add(TuplesKt.to(((float)arr_f[v]), object0));
            ++v;
        }
        return list0;
    }

    @NotNull
    public static final List zip(@NotNull float[] arr_f, @NotNull Iterable iterable0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "other");
        Intrinsics.checkNotNullParameter(function20, "transform");
        List list0 = new ArrayList(Math.min(l.collectionSizeOrDefault(iterable0, 10), arr_f.length));
        int v = 0;
        for(Object object0: iterable0) {
            if(v >= arr_f.length) {
                break;
            }
            ((ArrayList)list0).add(function20.invoke(((float)arr_f[v]), object0));
            ++v;
        }
        return list0;
    }

    @NotNull
    public static final List zip(@NotNull float[] arr_f, @NotNull float[] arr_f1) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(arr_f1, "other");
        int v = Math.min(arr_f.length, arr_f1.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(TuplesKt.to(((float)arr_f[v1]), ((float)arr_f1[v1])));
        }
        return list0;
    }

    @NotNull
    public static final List zip(@NotNull float[] arr_f, @NotNull float[] arr_f1, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(arr_f1, "other");
        Intrinsics.checkNotNullParameter(function20, "transform");
        int v = Math.min(arr_f.length, arr_f1.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(function20.invoke(((float)arr_f[v1]), ((float)arr_f1[v1])));
        }
        return list0;
    }

    @NotNull
    public static final List zip(@NotNull float[] arr_f, @NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(arr_object, "other");
        int v = Math.min(arr_f.length, arr_object.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(TuplesKt.to(((float)arr_f[v1]), arr_object[v1]));
        }
        return list0;
    }

    @NotNull
    public static final List zip(@NotNull float[] arr_f, @NotNull Object[] arr_object, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(arr_object, "other");
        Intrinsics.checkNotNullParameter(function20, "transform");
        int v = Math.min(arr_f.length, arr_object.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(function20.invoke(((float)arr_f[v1]), arr_object[v1]));
        }
        return list0;
    }

    @NotNull
    public static final List zip(@NotNull int[] arr_v, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "other");
        List list0 = new ArrayList(Math.min(l.collectionSizeOrDefault(iterable0, 10), arr_v.length));
        int v = 0;
        for(Object object0: iterable0) {
            if(v >= arr_v.length) {
                break;
            }
            ((ArrayList)list0).add(TuplesKt.to(((int)arr_v[v]), object0));
            ++v;
        }
        return list0;
    }

    @NotNull
    public static final List zip(@NotNull int[] arr_v, @NotNull Iterable iterable0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "other");
        Intrinsics.checkNotNullParameter(function20, "transform");
        List list0 = new ArrayList(Math.min(l.collectionSizeOrDefault(iterable0, 10), arr_v.length));
        int v = 0;
        for(Object object0: iterable0) {
            if(v >= arr_v.length) {
                break;
            }
            ((ArrayList)list0).add(function20.invoke(((int)arr_v[v]), object0));
            ++v;
        }
        return list0;
    }

    @NotNull
    public static final List zip(@NotNull int[] arr_v, @NotNull int[] arr_v1) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(arr_v1, "other");
        int v = Math.min(arr_v.length, arr_v1.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(TuplesKt.to(((int)arr_v[v1]), ((int)arr_v1[v1])));
        }
        return list0;
    }

    @NotNull
    public static final List zip(@NotNull int[] arr_v, @NotNull int[] arr_v1, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(arr_v1, "other");
        Intrinsics.checkNotNullParameter(function20, "transform");
        int v = Math.min(arr_v.length, arr_v1.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(function20.invoke(((int)arr_v[v1]), ((int)arr_v1[v1])));
        }
        return list0;
    }

    @NotNull
    public static final List zip(@NotNull int[] arr_v, @NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(arr_object, "other");
        int v = Math.min(arr_v.length, arr_object.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(TuplesKt.to(((int)arr_v[v1]), arr_object[v1]));
        }
        return list0;
    }

    @NotNull
    public static final List zip(@NotNull int[] arr_v, @NotNull Object[] arr_object, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(arr_object, "other");
        Intrinsics.checkNotNullParameter(function20, "transform");
        int v = Math.min(arr_v.length, arr_object.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(function20.invoke(((int)arr_v[v1]), arr_object[v1]));
        }
        return list0;
    }

    @NotNull
    public static final List zip(@NotNull long[] arr_v, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "other");
        List list0 = new ArrayList(Math.min(l.collectionSizeOrDefault(iterable0, 10), arr_v.length));
        int v = 0;
        for(Object object0: iterable0) {
            if(v >= arr_v.length) {
                break;
            }
            ((ArrayList)list0).add(TuplesKt.to(((long)arr_v[v]), object0));
            ++v;
        }
        return list0;
    }

    @NotNull
    public static final List zip(@NotNull long[] arr_v, @NotNull Iterable iterable0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "other");
        Intrinsics.checkNotNullParameter(function20, "transform");
        List list0 = new ArrayList(Math.min(l.collectionSizeOrDefault(iterable0, 10), arr_v.length));
        int v = 0;
        for(Object object0: iterable0) {
            if(v >= arr_v.length) {
                break;
            }
            ((ArrayList)list0).add(function20.invoke(((long)arr_v[v]), object0));
            ++v;
        }
        return list0;
    }

    @NotNull
    public static final List zip(@NotNull long[] arr_v, @NotNull long[] arr_v1) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(arr_v1, "other");
        int v = Math.min(arr_v.length, arr_v1.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(TuplesKt.to(((long)arr_v[v1]), ((long)arr_v1[v1])));
        }
        return list0;
    }

    @NotNull
    public static final List zip(@NotNull long[] arr_v, @NotNull long[] arr_v1, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(arr_v1, "other");
        Intrinsics.checkNotNullParameter(function20, "transform");
        int v = Math.min(arr_v.length, arr_v1.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(function20.invoke(((long)arr_v[v1]), ((long)arr_v1[v1])));
        }
        return list0;
    }

    @NotNull
    public static final List zip(@NotNull long[] arr_v, @NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(arr_object, "other");
        int v = Math.min(arr_v.length, arr_object.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(TuplesKt.to(((long)arr_v[v1]), arr_object[v1]));
        }
        return list0;
    }

    @NotNull
    public static final List zip(@NotNull long[] arr_v, @NotNull Object[] arr_object, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(arr_object, "other");
        Intrinsics.checkNotNullParameter(function20, "transform");
        int v = Math.min(arr_v.length, arr_object.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(function20.invoke(((long)arr_v[v1]), arr_object[v1]));
        }
        return list0;
    }

    @NotNull
    public static final List zip(@NotNull Object[] arr_object, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "other");
        List list0 = new ArrayList(Math.min(l.collectionSizeOrDefault(iterable0, 10), arr_object.length));
        int v = 0;
        for(Object object0: iterable0) {
            if(v >= arr_object.length) {
                break;
            }
            ((ArrayList)list0).add(TuplesKt.to(arr_object[v], object0));
            ++v;
        }
        return list0;
    }

    @NotNull
    public static final List zip(@NotNull Object[] arr_object, @NotNull Iterable iterable0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "other");
        Intrinsics.checkNotNullParameter(function20, "transform");
        List list0 = new ArrayList(Math.min(l.collectionSizeOrDefault(iterable0, 10), arr_object.length));
        int v = 0;
        for(Object object0: iterable0) {
            if(v >= arr_object.length) {
                break;
            }
            ((ArrayList)list0).add(function20.invoke(arr_object[v], object0));
            ++v;
        }
        return list0;
    }

    @NotNull
    public static List zip(@NotNull Object[] arr_object, @NotNull Object[] arr_object1) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(arr_object1, "other");
        int v = Math.min(arr_object.length, arr_object1.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(TuplesKt.to(arr_object[v1], arr_object1[v1]));
        }
        return list0;
    }

    @NotNull
    public static final List zip(@NotNull Object[] arr_object, @NotNull Object[] arr_object1, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(arr_object1, "other");
        Intrinsics.checkNotNullParameter(function20, "transform");
        int v = Math.min(arr_object.length, arr_object1.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(function20.invoke(arr_object[v1], arr_object1[v1]));
        }
        return list0;
    }

    @NotNull
    public static final List zip(@NotNull short[] arr_v, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "other");
        List list0 = new ArrayList(Math.min(l.collectionSizeOrDefault(iterable0, 10), arr_v.length));
        int v = 0;
        for(Object object0: iterable0) {
            if(v >= arr_v.length) {
                break;
            }
            ((ArrayList)list0).add(TuplesKt.to(((short)arr_v[v]), object0));
            ++v;
        }
        return list0;
    }

    @NotNull
    public static final List zip(@NotNull short[] arr_v, @NotNull Iterable iterable0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "other");
        Intrinsics.checkNotNullParameter(function20, "transform");
        List list0 = new ArrayList(Math.min(l.collectionSizeOrDefault(iterable0, 10), arr_v.length));
        int v = 0;
        for(Object object0: iterable0) {
            if(v >= arr_v.length) {
                break;
            }
            ((ArrayList)list0).add(function20.invoke(((short)arr_v[v]), object0));
            ++v;
        }
        return list0;
    }

    @NotNull
    public static final List zip(@NotNull short[] arr_v, @NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(arr_object, "other");
        int v = Math.min(arr_v.length, arr_object.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(TuplesKt.to(((short)arr_v[v1]), arr_object[v1]));
        }
        return list0;
    }

    @NotNull
    public static final List zip(@NotNull short[] arr_v, @NotNull Object[] arr_object, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(arr_object, "other");
        Intrinsics.checkNotNullParameter(function20, "transform");
        int v = Math.min(arr_v.length, arr_object.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(function20.invoke(((short)arr_v[v1]), arr_object[v1]));
        }
        return list0;
    }

    @NotNull
    public static final List zip(@NotNull short[] arr_v, @NotNull short[] arr_v1) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(arr_v1, "other");
        int v = Math.min(arr_v.length, arr_v1.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(TuplesKt.to(((short)arr_v[v1]), ((short)arr_v1[v1])));
        }
        return list0;
    }

    @NotNull
    public static final List zip(@NotNull short[] arr_v, @NotNull short[] arr_v1, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(arr_v1, "other");
        Intrinsics.checkNotNullParameter(function20, "transform");
        int v = Math.min(arr_v.length, arr_v1.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(function20.invoke(((short)arr_v[v1]), ((short)arr_v1[v1])));
        }
        return list0;
    }

    @NotNull
    public static final List zip(@NotNull boolean[] arr_z, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "other");
        List list0 = new ArrayList(Math.min(l.collectionSizeOrDefault(iterable0, 10), arr_z.length));
        int v = 0;
        for(Object object0: iterable0) {
            if(v >= arr_z.length) {
                break;
            }
            ((ArrayList)list0).add(TuplesKt.to(Boolean.valueOf(arr_z[v]), object0));
            ++v;
        }
        return list0;
    }

    @NotNull
    public static final List zip(@NotNull boolean[] arr_z, @NotNull Iterable iterable0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "other");
        Intrinsics.checkNotNullParameter(function20, "transform");
        List list0 = new ArrayList(Math.min(l.collectionSizeOrDefault(iterable0, 10), arr_z.length));
        int v = 0;
        for(Object object0: iterable0) {
            if(v >= arr_z.length) {
                break;
            }
            ((ArrayList)list0).add(function20.invoke(Boolean.valueOf(arr_z[v]), object0));
            ++v;
        }
        return list0;
    }

    @NotNull
    public static final List zip(@NotNull boolean[] arr_z, @NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(arr_object, "other");
        int v = Math.min(arr_z.length, arr_object.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(TuplesKt.to(Boolean.valueOf(arr_z[v1]), arr_object[v1]));
        }
        return list0;
    }

    @NotNull
    public static final List zip(@NotNull boolean[] arr_z, @NotNull Object[] arr_object, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(arr_object, "other");
        Intrinsics.checkNotNullParameter(function20, "transform");
        int v = Math.min(arr_z.length, arr_object.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(function20.invoke(Boolean.valueOf(arr_z[v1]), arr_object[v1]));
        }
        return list0;
    }

    @NotNull
    public static final List zip(@NotNull boolean[] arr_z, @NotNull boolean[] arr_z1) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(arr_z1, "other");
        int v = Math.min(arr_z.length, arr_z1.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(TuplesKt.to(Boolean.valueOf(arr_z[v1]), Boolean.valueOf(arr_z1[v1])));
        }
        return list0;
    }

    @NotNull
    public static final List zip(@NotNull boolean[] arr_z, @NotNull boolean[] arr_z1, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(arr_z1, "other");
        Intrinsics.checkNotNullParameter(function20, "transform");
        int v = Math.min(arr_z.length, arr_z1.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(function20.invoke(Boolean.valueOf(arr_z[v1]), Boolean.valueOf(arr_z1[v1])));
        }
        return list0;
    }
}

