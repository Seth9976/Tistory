package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.Immutable;
import i1.c;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;
import org.jetbrains.annotations.NotNull;
import wb.a;

@Immutable
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u001C\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0002\b\n\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000E\n\u0002\b\u0004\b\u0001\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%J\u0015\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\u000B\u001A\u00020\u00002\u0006\u0010\n\u001A\u00020\u0000¢\u0006\u0004\b\u000B\u0010\fJ\u0015\u0010\r\u001A\u00020\u00002\u0006\u0010\n\u001A\u00020\u0000¢\u0006\u0004\b\r\u0010\fJ\u0015\u0010\u000E\u001A\u00020\u00002\u0006\u0010\n\u001A\u00020\u0000¢\u0006\u0004\b\u000E\u0010\fJ\u0016\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u00020\u000FH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011JA\u0010\u0018\u001A\u00020\u00002\u0006\u0010\u0012\u001A\u00020\u00002\'\u0010\u0017\u001A#\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0013H\u0086\b¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001D\u001A\u00020\u001B2\u0012\u0010\u001C\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001B0\u001AH\u0086\b¢\u0006\u0004\b\u001D\u0010\u001EJ\u0015\u0010 \u001A\u00020\u00022\u0006\u0010\u001F\u001A\u00020\u0002¢\u0006\u0004\b \u0010!J\u000F\u0010#\u001A\u00020\"H\u0016¢\u0006\u0004\b#\u0010$¨\u0006&"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "", "", "bit", "", "get", "(I)Z", "set", "(I)Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "clear", "bits", "andNot", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "and", "or", "", "iterator", "()Ljava/util/Iterator;", "initial", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "acc", "operation", "fastFold", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;Lkotlin/jvm/functions/Function2;)Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "Lkotlin/Function1;", "", "block", "fastForEach", "(Lkotlin/jvm/functions/Function1;)V", "default", "lowest", "(I)I", "", "toString", "()Ljava/lang/String;", "Companion", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSnapshotIdSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotIdSet.kt\nandroidx/compose/runtime/snapshots/SnapshotIdSet\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,382:1\n317#1,28:385\n317#1,28:413\n317#1,28:441\n317#1,28:469\n317#1,28:497\n325#1,20:525\n13600#2,2:383\n1549#3:545\n1620#3,3:546\n*S KotlinDebug\n*F\n+ 1 SnapshotIdSet.kt\nandroidx/compose/runtime/snapshots/SnapshotIdSet\n*L\n236#1:385,28\n257#1:413,28\n261#1:441,28\n283#1:469,28\n286#1:497,28\n318#1:525,20\n107#1:383,2\n354#1:545\n354#1:546,3\n*E\n"})
public final class SnapshotIdSet implements Iterable, KMappedMarker {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotIdSet$Companion;", "", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "EMPTY", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "getEMPTY", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final SnapshotIdSet getEMPTY() {
            return SnapshotIdSet.e;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final long a;
    public final long b;
    public final int c;
    public final int[] d;
    public static final SnapshotIdSet e;

    static {
        SnapshotIdSet.Companion = new Companion(null);
        SnapshotIdSet.e = new SnapshotIdSet(0L, 0L, 0, null);
    }

    public SnapshotIdSet(long v, long v1, int v2, int[] arr_v) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = arr_v;
    }

    @NotNull
    public final SnapshotIdSet and(@NotNull SnapshotIdSet snapshotIdSet0) {
        SnapshotIdSet snapshotIdSet3;
        SnapshotIdSet snapshotIdSet1 = SnapshotIdSet.e;
        if(Intrinsics.areEqual(snapshotIdSet0, snapshotIdSet1)) {
            return snapshotIdSet1;
        }
        if(Intrinsics.areEqual(this, snapshotIdSet1)) {
            return snapshotIdSet1;
        }
        int v = this.c;
        if(snapshotIdSet0.c == v) {
            int[] arr_v = this.d;
            if(snapshotIdSet0.d == arr_v) {
                return (this.a & snapshotIdSet0.a) != 0L || (this.b & snapshotIdSet0.b) != 0L || arr_v != null ? new SnapshotIdSet(this.a & snapshotIdSet0.a, this.b & snapshotIdSet0.b, v, arr_v) : snapshotIdSet1;
            }
        }
        SnapshotIdSet snapshotIdSet2 = snapshotIdSet1;
        int v1 = 0;
        if(this.d == null) {
            int[] arr_v1 = this.d;
            if(arr_v1 != null) {
                for(int v2 = 0; v2 < arr_v1.length; ++v2) {
                    int v3 = arr_v1[v2];
                    if(snapshotIdSet0.get(v3)) {
                        snapshotIdSet2 = snapshotIdSet2.set(v3);
                    }
                }
            }
            snapshotIdSet3 = snapshotIdSet2;
            if(this.b != 0L) {
                for(int v4 = 0; v4 < 0x40; ++v4) {
                    if((this.b & 1L << v4) != 0L) {
                        int v5 = this.c + v4;
                        if(snapshotIdSet0.get(v5)) {
                            snapshotIdSet3 = snapshotIdSet3.set(v5);
                        }
                    }
                }
            }
            if(this.a != 0L) {
                while(v1 < 0x40) {
                    if((this.a & 1L << v1) != 0L) {
                        int v6 = this.c + (v1 + 0x40);
                        if(snapshotIdSet0.get(v6)) {
                            snapshotIdSet3 = snapshotIdSet3.set(v6);
                        }
                    }
                    ++v1;
                }
                return snapshotIdSet3;
            }
        }
        else {
            int[] arr_v2 = snapshotIdSet0.d;
            if(arr_v2 != null) {
                for(int v7 = 0; v7 < arr_v2.length; ++v7) {
                    int v8 = arr_v2[v7];
                    if(this.get(v8)) {
                        snapshotIdSet2 = snapshotIdSet2.set(v8);
                    }
                }
            }
            snapshotIdSet3 = snapshotIdSet2;
            if(snapshotIdSet0.b != 0L) {
                for(int v9 = 0; v9 < 0x40; ++v9) {
                    if((snapshotIdSet0.b & 1L << v9) != 0L) {
                        int v10 = snapshotIdSet0.c + v9;
                        if(this.get(v10)) {
                            snapshotIdSet3 = snapshotIdSet3.set(v10);
                        }
                    }
                }
            }
            if(snapshotIdSet0.a != 0L) {
                while(v1 < 0x40) {
                    if((snapshotIdSet0.a & 1L << v1) != 0L) {
                        int v11 = snapshotIdSet0.c + (v1 + 0x40);
                        if(this.get(v11)) {
                            snapshotIdSet3 = snapshotIdSet3.set(v11);
                        }
                    }
                    ++v1;
                }
            }
        }
        return snapshotIdSet3;
    }

    @NotNull
    public final SnapshotIdSet andNot(@NotNull SnapshotIdSet snapshotIdSet0) {
        SnapshotIdSet snapshotIdSet2;
        SnapshotIdSet snapshotIdSet1 = SnapshotIdSet.e;
        if(snapshotIdSet0 == snapshotIdSet1) {
            return this;
        }
        if(this == snapshotIdSet1) {
            return snapshotIdSet1;
        }
        int v = this.c;
        if(snapshotIdSet0.c == v) {
            int[] arr_v = this.d;
            if(snapshotIdSet0.d == arr_v) {
                return new SnapshotIdSet(this.a & ~snapshotIdSet0.a, ~snapshotIdSet0.b & this.b, v, arr_v);
            }
        }
        int[] arr_v1 = snapshotIdSet0.d;
        if(arr_v1 == null) {
            snapshotIdSet2 = this;
        }
        else {
            snapshotIdSet2 = this;
            for(int v2 = 0; v2 < arr_v1.length; ++v2) {
                snapshotIdSet2 = snapshotIdSet2.clear(arr_v1[v2]);
            }
        }
        if(Long.compare(snapshotIdSet0.b, 0L) != 0) {
            for(int v3 = 0; v3 < 0x40; ++v3) {
                if((snapshotIdSet0.b & 1L << v3) != 0L) {
                    snapshotIdSet2 = snapshotIdSet2.clear(snapshotIdSet0.c + v3);
                }
            }
        }
        if(snapshotIdSet0.a != 0L) {
            for(int v1 = 0; v1 < 0x40; ++v1) {
                if((snapshotIdSet0.a & 1L << v1) != 0L) {
                    snapshotIdSet2 = snapshotIdSet2.clear(snapshotIdSet0.c + (v1 + 0x40));
                }
            }
        }
        return snapshotIdSet2;
    }

    @NotNull
    public final SnapshotIdSet clear(int v) {
        int v1 = this.c;
        int v2 = v - v1;
        if(v2 >= 0 && v2 < 0x40) {
            return (this.b & 1L << v2) == 0L ? this : new SnapshotIdSet(this.a, this.b & ~(1L << v2), v1, this.d);
        }
        if(v2 >= 0x40 && v2 < 0x80) {
            long v3 = 1L << v2 - 0x40;
            return (this.a & v3) == 0L ? this : new SnapshotIdSet(this.a & ~v3, this.b, v1, this.d);
        }
        if(v2 < 0) {
            int[] arr_v = this.d;
            if(arr_v != null) {
                int v4 = SnapshotIdSetKt.binarySearch(arr_v, v);
                if(v4 >= 0) {
                    int v5 = arr_v.length - 1;
                    if(v5 == 0) {
                        return new SnapshotIdSet(this.a, this.b, this.c, null);
                    }
                    int[] arr_v1 = new int[v5];
                    if(v4 > 0) {
                        ArraysKt___ArraysJvmKt.copyInto(arr_v, arr_v1, 0, 0, v4);
                    }
                    if(v4 < v5) {
                        ArraysKt___ArraysJvmKt.copyInto(arr_v, arr_v1, v4, v4 + 1, arr_v.length);
                    }
                    return new SnapshotIdSet(this.a, this.b, this.c, arr_v1);
                }
            }
        }
        return this;
    }

    @NotNull
    public final SnapshotIdSet fastFold(@NotNull SnapshotIdSet snapshotIdSet0, @NotNull Function2 function20) {
        int[] arr_v = this.d;
        if(arr_v != null) {
            for(int v1 = 0; v1 < arr_v.length; ++v1) {
                snapshotIdSet0 = function20.invoke(snapshotIdSet0, ((int)arr_v[v1]));
            }
        }
        if(Long.compare(this.b, 0L) != 0) {
            for(int v2 = 0; v2 < 0x40; ++v2) {
                if((this.b & 1L << v2) != 0L) {
                    snapshotIdSet0 = function20.invoke(snapshotIdSet0, ((int)(this.c + v2)));
                }
            }
        }
        if(this.a != 0L) {
            for(int v = 0; v < 0x40; ++v) {
                if((this.a & 1L << v) != 0L) {
                    snapshotIdSet0 = function20.invoke(snapshotIdSet0, ((int)(this.c + (v + 0x40))));
                }
            }
        }
        return snapshotIdSet0;
    }

    public final void fastForEach(@NotNull Function1 function10) {
        int[] arr_v = this.d;
        if(arr_v != null) {
            for(int v1 = 0; v1 < arr_v.length; ++v1) {
                function10.invoke(((int)arr_v[v1]));
            }
        }
        if(Long.compare(this.b, 0L) != 0) {
            for(int v2 = 0; v2 < 0x40; ++v2) {
                if((this.b & 1L << v2) != 0L) {
                    function10.invoke(((int)(this.c + v2)));
                }
            }
        }
        if(this.a != 0L) {
            for(int v = 0; v < 0x40; ++v) {
                if((this.a & 1L << v) != 0L) {
                    function10.invoke(((int)(this.c + (v + 0x40))));
                }
            }
        }
    }

    public final boolean get(int v) {
        int v1 = v - this.c;
        if(v1 >= 0 && v1 < 0x40) {
            return (1L << v1 & this.b) != 0L;
        }
        if(v1 >= 0x40 && v1 < 0x80) {
            return (1L << v1 - 0x40 & this.a) != 0L;
        }
        return v1 <= 0 ? this.d != null && SnapshotIdSetKt.binarySearch(this.d, v) >= 0 : false;
    }

    @Override
    @NotNull
    public Iterator iterator() {
        return SequencesKt__SequenceBuilderKt.sequence(new c(this, null)).iterator();
    }

    public final int lowest(int v) {
        int[] arr_v = this.d;
        if(arr_v != null) {
            return arr_v[0];
        }
        long v1 = this.b;
        int v2 = this.c;
        if(Long.compare(v1, 0L) != 0) {
            return Long.numberOfTrailingZeros(v1) + v2;
        }
        return this.a == 0L ? v : Long.numberOfTrailingZeros(this.a) + (v2 + 0x40);
    }

    @NotNull
    public final SnapshotIdSet or(@NotNull SnapshotIdSet snapshotIdSet0) {
        SnapshotIdSet snapshotIdSet2;
        SnapshotIdSet snapshotIdSet1 = SnapshotIdSet.e;
        if(snapshotIdSet0 == snapshotIdSet1) {
            return this;
        }
        if(this == snapshotIdSet1) {
            return snapshotIdSet0;
        }
        int v = this.c;
        if(snapshotIdSet0.c == v) {
            int[] arr_v = this.d;
            if(snapshotIdSet0.d == arr_v) {
                return new SnapshotIdSet(this.a | snapshotIdSet0.a, this.b | snapshotIdSet0.b, v, arr_v);
            }
        }
        int v1 = 0;
        if(this.d == null) {
            int[] arr_v1 = this.d;
            if(arr_v1 != null) {
                for(int v2 = 0; v2 < arr_v1.length; ++v2) {
                    snapshotIdSet0 = snapshotIdSet0.set(arr_v1[v2]);
                }
            }
            if(this.b != 0L) {
                for(int v3 = 0; v3 < 0x40; ++v3) {
                    if((this.b & 1L << v3) != 0L) {
                        snapshotIdSet0 = snapshotIdSet0.set(this.c + v3);
                    }
                }
            }
            if(this.a != 0L) {
                while(v1 < 0x40) {
                    if((this.a & 1L << v1) != 0L) {
                        snapshotIdSet0 = snapshotIdSet0.set(this.c + (v1 + 0x40));
                    }
                    ++v1;
                }
            }
            return snapshotIdSet0;
        }
        int[] arr_v2 = snapshotIdSet0.d;
        if(arr_v2 == null) {
            snapshotIdSet2 = this;
        }
        else {
            snapshotIdSet2 = this;
            for(int v4 = 0; v4 < arr_v2.length; ++v4) {
                snapshotIdSet2 = snapshotIdSet2.set(arr_v2[v4]);
            }
        }
        if(snapshotIdSet0.b != 0L) {
            for(int v5 = 0; v5 < 0x40; ++v5) {
                if((snapshotIdSet0.b & 1L << v5) != 0L) {
                    snapshotIdSet2 = snapshotIdSet2.set(snapshotIdSet0.c + v5);
                }
            }
        }
        if(snapshotIdSet0.a != 0L) {
            while(v1 < 0x40) {
                if((snapshotIdSet0.a & 1L << v1) != 0L) {
                    snapshotIdSet2 = snapshotIdSet2.set(snapshotIdSet0.c + (v1 + 0x40));
                }
                ++v1;
            }
        }
        return snapshotIdSet2;
    }

    @NotNull
    public final SnapshotIdSet set(int v) {
        long v12;
        int v11;
        int v1 = this.c;
        int v2 = v - v1;
        long v3 = this.b;
        if(v2 >= 0 && v2 < 0x40) {
            return (v3 & 1L << v2) == 0L ? new SnapshotIdSet(this.a, v3 | 1L << v2, v1, this.d) : this;
        }
        long v4 = this.a;
        if(v2 >= 0x40 && v2 < 0x80) {
            long v5 = 1L << v2 - 0x40;
            return (v4 & v5) == 0L ? new SnapshotIdSet(v4 | v5, this.b, v1, this.d) : this;
        }
        int[] arr_v = this.d;
        if(v2 < 0x80) {
            if(arr_v == null) {
                return new SnapshotIdSet(this.a, this.b, v1, new int[]{v});
            }
            int v13 = SnapshotIdSetKt.binarySearch(arr_v, v);
            if(v13 < 0) {
                int[] arr_v2 = new int[arr_v.length + 1];
                ArraysKt___ArraysJvmKt.copyInto(arr_v, arr_v2, 0, 0, -(v13 + 1));
                ArraysKt___ArraysJvmKt.copyInto(arr_v, arr_v2, -v13, -(v13 + 1), arr_v.length);
                arr_v2[-(v13 + 1)] = v;
                return new SnapshotIdSet(this.a, this.b, this.c, arr_v2);
            }
        }
        else if(!this.get(v)) {
            int v6 = (v + 1) / 0x40 * 0x40;
            int v7 = this.c;
            ArrayList arrayList0 = null;
            long v8;
            for(v8 = v4; true; v8 = 0L) {
                if(v7 >= v6) {
                    v12 = v3;
                    v11 = v7;
                    break;
                }
                if(v3 != 0L) {
                    if(arrayList0 == null) {
                        arrayList0 = new ArrayList();
                        if(arr_v != null) {
                            for(int v9 = 0; v9 < arr_v.length; ++v9) {
                                arrayList0.add(((int)arr_v[v9]));
                            }
                        }
                    }
                    for(int v10 = 0; v10 < 0x40; ++v10) {
                        if((1L << v10 & v3) != 0L) {
                            arrayList0.add(((int)(v10 + v7)));
                        }
                    }
                }
                if(v8 == 0L) {
                    v11 = v6;
                    v12 = 0L;
                    break;
                }
                v7 += 0x40;
                v3 = v8;
            }
            if(arrayList0 != null) {
                int[] arr_v1 = CollectionsKt___CollectionsKt.toIntArray(arrayList0);
                return arr_v1 == null ? new SnapshotIdSet(v8, v12, v11, arr_v).set(v) : new SnapshotIdSet(v8, v12, v11, arr_v1).set(v);
            }
            return new SnapshotIdSet(v8, v12, v11, arr_v).set(v);
        }
        return this;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(super.toString());
        stringBuilder0.append(" [");
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(this, 10));
        for(Object object0: this) {
            arrayList0.add(String.valueOf(((Number)object0).intValue()));
        }
        return a.b(']', ListUtilsKt.fastJoinToString$default(arrayList0, null, null, null, 0, null, null, 0x3F, null), stringBuilder0);
    }
}

