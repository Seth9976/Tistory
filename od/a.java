package od;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.ExperimentalStdlibApi;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.SinceKotlin;
import kotlin.TuplesKt;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.WasExperimental;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IndexingIterable;
import kotlin.collections.IntIterator;
import kotlin.collections.UArraySortingKt;
import kotlin.collections.g;
import kotlin.collections.h;
import kotlin.collections.i;
import kotlin.collections.j;
import kotlin.collections.k;
import kotlin.collections.l;
import kotlin.collections.unsigned.UArraysKt___UArraysJvmKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class a extends UArraysKt___UArraysJvmKt {
    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    public static boolean contentEquals-FGO6Aew(@Nullable short[] arr_v, @Nullable short[] arr_v1) {
        if(arr_v == null) {
            arr_v = null;
        }
        if(arr_v1 == null) {
            arr_v1 = null;
        }
        return Arrays.equals(arr_v, arr_v1);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    public static boolean contentEquals-KJPZfPQ(@Nullable int[] arr_v, @Nullable int[] arr_v1) {
        if(arr_v == null) {
            arr_v = null;
        }
        if(arr_v1 == null) {
            arr_v1 = null;
        }
        return Arrays.equals(arr_v, arr_v1);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    public static boolean contentEquals-kV0jMPg(@Nullable byte[] arr_b, @Nullable byte[] arr_b1) {
        if(arr_b == null) {
            arr_b = null;
        }
        if(arr_b1 == null) {
            arr_b1 = null;
        }
        return Arrays.equals(arr_b, arr_b1);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    public static boolean contentEquals-lec5QzE(@Nullable long[] arr_v, @Nullable long[] arr_v1) {
        if(arr_v == null) {
            arr_v = null;
        }
        if(arr_v1 == null) {
            arr_v1 = null;
        }
        return Arrays.equals(arr_v, arr_v1);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    public static final int contentHashCode-2csIQuQ(@Nullable byte[] arr_b) {
        if(arr_b == null) {
            arr_b = null;
        }
        return Arrays.hashCode(arr_b);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    public static final int contentHashCode-XUkPCBk(@Nullable int[] arr_v) {
        if(arr_v == null) {
            arr_v = null;
        }
        return Arrays.hashCode(arr_v);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    public static final int contentHashCode-d-6D3K8(@Nullable short[] arr_v) {
        if(arr_v == null) {
            arr_v = null;
        }
        return Arrays.hashCode(arr_v);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    public static final int contentHashCode-uLth9ew(@Nullable long[] arr_v) {
        if(arr_v == null) {
            arr_v = null;
        }
        return Arrays.hashCode(arr_v);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    @NotNull
    public static String contentToString-2csIQuQ(@Nullable byte[] arr_b) {
        if(arr_b != null) {
            String s = CollectionsKt___CollectionsKt.joinToString$default(UByteArray.box-impl(arr_b), ", ", "[", "]", 0, null, null, 56, null);
            return s == null ? "null" : s;
        }
        return "null";
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    @NotNull
    public static String contentToString-XUkPCBk(@Nullable int[] arr_v) {
        if(arr_v != null) {
            String s = CollectionsKt___CollectionsKt.joinToString$default(UIntArray.box-impl(arr_v), ", ", "[", "]", 0, null, null, 56, null);
            return s == null ? "null" : s;
        }
        return "null";
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    @NotNull
    public static String contentToString-d-6D3K8(@Nullable short[] arr_v) {
        if(arr_v != null) {
            String s = CollectionsKt___CollectionsKt.joinToString$default(UShortArray.box-impl(arr_v), ", ", "[", "]", 0, null, null, 56, null);
            return s == null ? "null" : s;
        }
        return "null";
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    @NotNull
    public static String contentToString-uLth9ew(@Nullable long[] arr_v) {
        if(arr_v != null) {
            String s = CollectionsKt___CollectionsKt.joinToString$default(ULongArray.box-impl(arr_v), ", ", "[", "]", 0, null, null, 56, null);
            return s == null ? "null" : s;
        }
        return "null";
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final List drop-PpDY95g(@NotNull byte[] arr_b, int v) {
        Intrinsics.checkNotNullParameter(arr_b, "$this$drop");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        return a.takeLast-PpDY95g(arr_b, c.coerceAtLeast(UByteArray.getSize-impl(arr_b) - v, 0));
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final List drop-nggk6HY(@NotNull short[] arr_v, int v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$drop");
        if(v < 0) {
            throw new IllegalArgumentException(q.m(v, "Requested element count ", " is less than zero.").toString());
        }
        return a.takeLast-nggk6HY(arr_v, c.coerceAtLeast(UShortArray.getSize-impl(arr_v) - v, 0));
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final List drop-qFRl0hI(@NotNull int[] arr_v, int v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$drop");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        return a.takeLast-qFRl0hI(arr_v, c.coerceAtLeast(UIntArray.getSize-impl(arr_v) - v, 0));
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final List drop-r7IrZao(@NotNull long[] arr_v, int v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$drop");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        return a.takeLast-r7IrZao(arr_v, c.coerceAtLeast(ULongArray.getSize-impl(arr_v) - v, 0));
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final List dropLast-PpDY95g(@NotNull byte[] arr_b, int v) {
        Intrinsics.checkNotNullParameter(arr_b, "$this$dropLast");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        return a.take-PpDY95g(arr_b, c.coerceAtLeast(UByteArray.getSize-impl(arr_b) - v, 0));
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final List dropLast-nggk6HY(@NotNull short[] arr_v, int v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$dropLast");
        if(v < 0) {
            throw new IllegalArgumentException(q.m(v, "Requested element count ", " is less than zero.").toString());
        }
        return a.take-nggk6HY(arr_v, c.coerceAtLeast(UShortArray.getSize-impl(arr_v) - v, 0));
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final List dropLast-qFRl0hI(@NotNull int[] arr_v, int v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$dropLast");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        return a.take-qFRl0hI(arr_v, c.coerceAtLeast(UIntArray.getSize-impl(arr_v) - v, 0));
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final List dropLast-r7IrZao(@NotNull long[] arr_v, int v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$dropLast");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        return a.take-r7IrZao(arr_v, c.coerceAtLeast(ULongArray.getSize-impl(arr_v) - v, 0));
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    public static final void fill-2fe2U9s(@NotNull int[] arr_v, int v, int v1, int v2) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$fill");
        ArraysKt___ArraysJvmKt.fill(arr_v, v, v1, v2);
    }

    public static void fill-2fe2U9s$default(int[] arr_v, int v, int v1, int v2, int v3, Object object0) {
        if((v3 & 2) != 0) {
            v1 = 0;
        }
        if((v3 & 4) != 0) {
            v2 = UIntArray.getSize-impl(arr_v);
        }
        a.fill-2fe2U9s(arr_v, v, v1, v2);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    public static final void fill-EtDCXyQ(@NotNull short[] arr_v, short v, int v1, int v2) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$fill");
        ArraysKt___ArraysJvmKt.fill(arr_v, v, v1, v2);
    }

    public static void fill-EtDCXyQ$default(short[] arr_v, short v, int v1, int v2, int v3, Object object0) {
        if((v3 & 2) != 0) {
            v1 = 0;
        }
        if((v3 & 4) != 0) {
            v2 = UShortArray.getSize-impl(arr_v);
        }
        a.fill-EtDCXyQ(arr_v, v, v1, v2);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    public static final void fill-K6DWlUc(@NotNull long[] arr_v, long v, int v1, int v2) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$fill");
        ArraysKt___ArraysJvmKt.fill(arr_v, v, v1, v2);
    }

    public static void fill-K6DWlUc$default(long[] arr_v, long v, int v1, int v2, int v3, Object object0) {
        if((v3 & 2) != 0) {
            v1 = 0;
        }
        if((v3 & 4) != 0) {
            v2 = ULongArray.getSize-impl(arr_v);
        }
        a.fill-K6DWlUc(arr_v, v, v1, v2);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    public static final void fill-WpHrYlw(@NotNull byte[] arr_b, byte b, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_b, "$this$fill");
        ArraysKt___ArraysJvmKt.fill(arr_b, b, v, v1);
    }

    public static void fill-WpHrYlw$default(byte[] arr_b, byte b, int v, int v1, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v = 0;
        }
        if((v2 & 4) != 0) {
            v1 = UByteArray.getSize-impl(arr_b);
        }
        a.fill-WpHrYlw(arr_b, b, v, v1);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @Nullable
    public static final UInt firstOrNull--ajY-9A(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$firstOrNull");
        return UIntArray.isEmpty-impl(arr_v) ? null : UInt.box-impl(UIntArray.get-pVg5ArA(arr_v, 0));
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @Nullable
    public static final UByte firstOrNull-GBYM_sE(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "$this$firstOrNull");
        return UByteArray.isEmpty-impl(arr_b) ? null : UByte.box-impl(UByteArray.get-w2LRezQ(arr_b, 0));
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @Nullable
    public static final ULong firstOrNull-QwZRm1k(@NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$firstOrNull");
        return ULongArray.isEmpty-impl(arr_v) ? null : ULong.box-impl(ULongArray.get-s-VKNKU(arr_v, 0));
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @Nullable
    public static final UShort firstOrNull-rL5Bavg(@NotNull short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$firstOrNull");
        return UShortArray.isEmpty-impl(arr_v) ? null : UShort.box-impl(UShortArray.get-Mh2AYeg(arr_v, 0));
    }

    @NotNull
    public static final IntRange getIndices--ajY-9A(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$indices");
        return ArraysKt___ArraysKt.getIndices(arr_v);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    public static void getIndices--ajY-9A$annotations(int[] arr_v) {
    }

    @NotNull
    public static final IntRange getIndices-GBYM_sE(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "$this$indices");
        return ArraysKt___ArraysKt.getIndices(arr_b);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    public static void getIndices-GBYM_sE$annotations(byte[] arr_b) {
    }

    @NotNull
    public static final IntRange getIndices-QwZRm1k(@NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$indices");
        return ArraysKt___ArraysKt.getIndices(arr_v);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    public static void getIndices-QwZRm1k$annotations(long[] arr_v) {
    }

    @NotNull
    public static final IntRange getIndices-rL5Bavg(@NotNull short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$indices");
        return ArraysKt___ArraysKt.getIndices(arr_v);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    public static void getIndices-rL5Bavg$annotations(short[] arr_v) {
    }

    public static final int getLastIndex--ajY-9A(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$lastIndex");
        return ArraysKt___ArraysKt.getLastIndex(arr_v);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    public static void getLastIndex--ajY-9A$annotations(int[] arr_v) {
    }

    public static final int getLastIndex-GBYM_sE(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "$this$lastIndex");
        return ArraysKt___ArraysKt.getLastIndex(arr_b);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    public static void getLastIndex-GBYM_sE$annotations(byte[] arr_b) {
    }

    public static final int getLastIndex-QwZRm1k(@NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$lastIndex");
        return ArraysKt___ArraysKt.getLastIndex(arr_v);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    public static void getLastIndex-QwZRm1k$annotations(long[] arr_v) {
    }

    public static final int getLastIndex-rL5Bavg(@NotNull short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$lastIndex");
        return ArraysKt___ArraysKt.getLastIndex(arr_v);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    public static void getLastIndex-rL5Bavg$annotations(short[] arr_v) {
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @Nullable
    public static final UByte getOrNull-PpDY95g(@NotNull byte[] arr_b, int v) {
        Intrinsics.checkNotNullParameter(arr_b, "$this$getOrNull");
        return v < 0 || v > ArraysKt___ArraysKt.getLastIndex(arr_b) ? null : UByte.box-impl(UByteArray.get-w2LRezQ(arr_b, v));
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @Nullable
    public static final UShort getOrNull-nggk6HY(@NotNull short[] arr_v, int v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$getOrNull");
        return v < 0 || v > ArraysKt___ArraysKt.getLastIndex(arr_v) ? null : UShort.box-impl(UShortArray.get-Mh2AYeg(arr_v, v));
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @Nullable
    public static final UInt getOrNull-qFRl0hI(@NotNull int[] arr_v, int v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$getOrNull");
        return v < 0 || v > ArraysKt___ArraysKt.getLastIndex(arr_v) ? null : UInt.box-impl(UIntArray.get-pVg5ArA(arr_v, v));
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @Nullable
    public static final ULong getOrNull-r7IrZao(@NotNull long[] arr_v, int v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$getOrNull");
        return v < 0 || v > ArraysKt___ArraysKt.getLastIndex(arr_v) ? null : ULong.box-impl(ULongArray.get-s-VKNKU(arr_v, v));
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @Nullable
    public static final UInt lastOrNull--ajY-9A(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$lastOrNull");
        return UIntArray.isEmpty-impl(arr_v) ? null : UInt.box-impl(UIntArray.get-pVg5ArA(arr_v, UIntArray.getSize-impl(arr_v) - 1));
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @Nullable
    public static final UByte lastOrNull-GBYM_sE(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "$this$lastOrNull");
        return UByteArray.isEmpty-impl(arr_b) ? null : UByte.box-impl(UByteArray.get-w2LRezQ(arr_b, UByteArray.getSize-impl(arr_b) - 1));
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @Nullable
    public static final ULong lastOrNull-QwZRm1k(@NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$lastOrNull");
        return ULongArray.isEmpty-impl(arr_v) ? null : ULong.box-impl(ULongArray.get-s-VKNKU(arr_v, ULongArray.getSize-impl(arr_v) - 1));
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @Nullable
    public static final UShort lastOrNull-rL5Bavg(@NotNull short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$lastOrNull");
        return UShortArray.isEmpty-impl(arr_v) ? null : UShort.box-impl(UShortArray.get-Mh2AYeg(arr_v, UShortArray.getSize-impl(arr_v) - 1));
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final UInt maxOrNull--ajY-9A(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$maxOrNull");
        if(UIntArray.isEmpty-impl(arr_v)) {
            return null;
        }
        int v = UIntArray.get-pVg5ArA(arr_v, 0);
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_v)).iterator();
        while(intIterator0.hasNext()) {
            int v1 = UIntArray.get-pVg5ArA(arr_v, intIterator0.nextInt());
            if(Integer.compareUnsigned(v, v1) < 0) {
                v = v1;
            }
        }
        return UInt.box-impl(v);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final UByte maxOrNull-GBYM_sE(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "$this$maxOrNull");
        if(UByteArray.isEmpty-impl(arr_b)) {
            return null;
        }
        int v = UByteArray.get-w2LRezQ(arr_b, 0);
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_b)).iterator();
        while(intIterator0.hasNext()) {
            int v1 = UByteArray.get-w2LRezQ(arr_b, intIterator0.nextInt());
            if(Intrinsics.compare(v & 0xFF, v1 & 0xFF) < 0) {
                v = v1;
            }
        }
        return UByte.box-impl(((byte)v));
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final ULong maxOrNull-QwZRm1k(@NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$maxOrNull");
        if(ULongArray.isEmpty-impl(arr_v)) {
            return null;
        }
        long v = ULongArray.get-s-VKNKU(arr_v, 0);
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_v)).iterator();
        while(intIterator0.hasNext()) {
            long v1 = ULongArray.get-s-VKNKU(arr_v, intIterator0.nextInt());
            if(Long.compareUnsigned(v, v1) < 0) {
                v = v1;
            }
        }
        return ULong.box-impl(v);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final UShort maxOrNull-rL5Bavg(@NotNull short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$maxOrNull");
        if(UShortArray.isEmpty-impl(arr_v)) {
            return null;
        }
        int v = UShortArray.get-Mh2AYeg(arr_v, 0);
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_v)).iterator();
        while(intIterator0.hasNext()) {
            int v1 = UShortArray.get-Mh2AYeg(arr_v, intIterator0.nextInt());
            if(Intrinsics.compare(v & 0xFFFF, 0xFFFF & v1) < 0) {
                v = v1;
            }
        }
        return UShort.box-impl(((short)v));
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxOrThrow-U")
    public static final byte maxOrThrow-U(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "$this$max");
        if(UByteArray.isEmpty-impl(arr_b)) {
            throw new NoSuchElementException();
        }
        byte b = UByteArray.get-w2LRezQ(arr_b, 0);
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_b)).iterator();
        while(intIterator0.hasNext()) {
            byte b1 = UByteArray.get-w2LRezQ(arr_b, intIterator0.nextInt());
            if(Intrinsics.compare(b & 0xFF, b1 & 0xFF) < 0) {
                b = b1;
            }
        }
        return b;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxOrThrow-U")
    public static final int maxOrThrow-U(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$max");
        if(UIntArray.isEmpty-impl(arr_v)) {
            throw new NoSuchElementException();
        }
        int v = UIntArray.get-pVg5ArA(arr_v, 0);
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_v)).iterator();
        while(intIterator0.hasNext()) {
            int v1 = UIntArray.get-pVg5ArA(arr_v, intIterator0.nextInt());
            if(Integer.compareUnsigned(v, v1) < 0) {
                v = v1;
            }
        }
        return v;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxOrThrow-U")
    public static final long maxOrThrow-U(@NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$max");
        if(ULongArray.isEmpty-impl(arr_v)) {
            throw new NoSuchElementException();
        }
        long v = ULongArray.get-s-VKNKU(arr_v, 0);
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_v)).iterator();
        while(intIterator0.hasNext()) {
            long v1 = ULongArray.get-s-VKNKU(arr_v, intIterator0.nextInt());
            if(Long.compareUnsigned(v, v1) < 0) {
                v = v1;
            }
        }
        return v;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxOrThrow-U")
    public static final short maxOrThrow-U(@NotNull short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$max");
        if(UShortArray.isEmpty-impl(arr_v)) {
            throw new NoSuchElementException();
        }
        short v = UShortArray.get-Mh2AYeg(arr_v, 0);
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_v)).iterator();
        while(intIterator0.hasNext()) {
            short v1 = UShortArray.get-Mh2AYeg(arr_v, intIterator0.nextInt());
            if(Intrinsics.compare(v & 0xFFFF, 0xFFFF & v1) < 0) {
                v = v1;
            }
        }
        return v;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final UByte maxWithOrNull-XMRcp5o(@NotNull byte[] arr_b, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_b, "$this$maxWithOrNull");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        if(UByteArray.isEmpty-impl(arr_b)) {
            return null;
        }
        int v = UByteArray.get-w2LRezQ(arr_b, 0);
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_b)).iterator();
        while(intIterator0.hasNext()) {
            int v1 = UByteArray.get-w2LRezQ(arr_b, intIterator0.nextInt());
            if(comparator0.compare(UByte.box-impl(((byte)v)), UByte.box-impl(((byte)v1))) < 0) {
                v = v1;
            }
        }
        return UByte.box-impl(((byte)v));
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final UInt maxWithOrNull-YmdZ_VM(@NotNull int[] arr_v, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$maxWithOrNull");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        if(UIntArray.isEmpty-impl(arr_v)) {
            return null;
        }
        int v = UIntArray.get-pVg5ArA(arr_v, 0);
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_v)).iterator();
        while(intIterator0.hasNext()) {
            int v1 = UIntArray.get-pVg5ArA(arr_v, intIterator0.nextInt());
            if(comparator0.compare(UInt.box-impl(v), UInt.box-impl(v1)) < 0) {
                v = v1;
            }
        }
        return UInt.box-impl(v);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final UShort maxWithOrNull-eOHTfZs(@NotNull short[] arr_v, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$maxWithOrNull");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        if(UShortArray.isEmpty-impl(arr_v)) {
            return null;
        }
        int v = UShortArray.get-Mh2AYeg(arr_v, 0);
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_v)).iterator();
        while(intIterator0.hasNext()) {
            int v1 = UShortArray.get-Mh2AYeg(arr_v, intIterator0.nextInt());
            if(comparator0.compare(UShort.box-impl(((short)v)), UShort.box-impl(((short)v1))) < 0) {
                v = v1;
            }
        }
        return UShort.box-impl(((short)v));
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final ULong maxWithOrNull-zrEWJaI(@NotNull long[] arr_v, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$maxWithOrNull");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        if(ULongArray.isEmpty-impl(arr_v)) {
            return null;
        }
        long v = ULongArray.get-s-VKNKU(arr_v, 0);
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_v)).iterator();
        while(intIterator0.hasNext()) {
            long v1 = ULongArray.get-s-VKNKU(arr_v, intIterator0.nextInt());
            if(comparator0.compare(ULong.box-impl(v), ULong.box-impl(v1)) < 0) {
                v = v1;
            }
        }
        return ULong.box-impl(v);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxWithOrThrow-U")
    public static final byte maxWithOrThrow-U(@NotNull byte[] arr_b, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_b, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        if(UByteArray.isEmpty-impl(arr_b)) {
            throw new NoSuchElementException();
        }
        byte b = UByteArray.get-w2LRezQ(arr_b, 0);
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_b)).iterator();
        while(intIterator0.hasNext()) {
            byte b1 = UByteArray.get-w2LRezQ(arr_b, intIterator0.nextInt());
            if(comparator0.compare(UByte.box-impl(b), UByte.box-impl(b1)) < 0) {
                b = b1;
            }
        }
        return b;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxWithOrThrow-U")
    public static final int maxWithOrThrow-U(@NotNull int[] arr_v, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        if(UIntArray.isEmpty-impl(arr_v)) {
            throw new NoSuchElementException();
        }
        int v = UIntArray.get-pVg5ArA(arr_v, 0);
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_v)).iterator();
        while(intIterator0.hasNext()) {
            int v1 = UIntArray.get-pVg5ArA(arr_v, intIterator0.nextInt());
            if(comparator0.compare(UInt.box-impl(v), UInt.box-impl(v1)) < 0) {
                v = v1;
            }
        }
        return v;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxWithOrThrow-U")
    public static final long maxWithOrThrow-U(@NotNull long[] arr_v, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        if(ULongArray.isEmpty-impl(arr_v)) {
            throw new NoSuchElementException();
        }
        long v = ULongArray.get-s-VKNKU(arr_v, 0);
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_v)).iterator();
        while(intIterator0.hasNext()) {
            long v1 = ULongArray.get-s-VKNKU(arr_v, intIterator0.nextInt());
            if(comparator0.compare(ULong.box-impl(v), ULong.box-impl(v1)) < 0) {
                v = v1;
            }
        }
        return v;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxWithOrThrow-U")
    public static final short maxWithOrThrow-U(@NotNull short[] arr_v, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        if(UShortArray.isEmpty-impl(arr_v)) {
            throw new NoSuchElementException();
        }
        short v = UShortArray.get-Mh2AYeg(arr_v, 0);
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_v)).iterator();
        while(intIterator0.hasNext()) {
            short v1 = UShortArray.get-Mh2AYeg(arr_v, intIterator0.nextInt());
            if(comparator0.compare(UShort.box-impl(v), UShort.box-impl(v1)) < 0) {
                v = v1;
            }
        }
        return v;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final UInt minOrNull--ajY-9A(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$minOrNull");
        if(UIntArray.isEmpty-impl(arr_v)) {
            return null;
        }
        int v = UIntArray.get-pVg5ArA(arr_v, 0);
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_v)).iterator();
        while(intIterator0.hasNext()) {
            int v1 = UIntArray.get-pVg5ArA(arr_v, intIterator0.nextInt());
            if(Integer.compareUnsigned(v, v1) > 0) {
                v = v1;
            }
        }
        return UInt.box-impl(v);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final UByte minOrNull-GBYM_sE(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "$this$minOrNull");
        if(UByteArray.isEmpty-impl(arr_b)) {
            return null;
        }
        int v = UByteArray.get-w2LRezQ(arr_b, 0);
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_b)).iterator();
        while(intIterator0.hasNext()) {
            int v1 = UByteArray.get-w2LRezQ(arr_b, intIterator0.nextInt());
            if(Intrinsics.compare(v & 0xFF, v1 & 0xFF) > 0) {
                v = v1;
            }
        }
        return UByte.box-impl(((byte)v));
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final ULong minOrNull-QwZRm1k(@NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$minOrNull");
        if(ULongArray.isEmpty-impl(arr_v)) {
            return null;
        }
        long v = ULongArray.get-s-VKNKU(arr_v, 0);
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_v)).iterator();
        while(intIterator0.hasNext()) {
            long v1 = ULongArray.get-s-VKNKU(arr_v, intIterator0.nextInt());
            if(Long.compareUnsigned(v, v1) > 0) {
                v = v1;
            }
        }
        return ULong.box-impl(v);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final UShort minOrNull-rL5Bavg(@NotNull short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$minOrNull");
        if(UShortArray.isEmpty-impl(arr_v)) {
            return null;
        }
        int v = UShortArray.get-Mh2AYeg(arr_v, 0);
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_v)).iterator();
        while(intIterator0.hasNext()) {
            int v1 = UShortArray.get-Mh2AYeg(arr_v, intIterator0.nextInt());
            if(Intrinsics.compare(v & 0xFFFF, 0xFFFF & v1) > 0) {
                v = v1;
            }
        }
        return UShort.box-impl(((short)v));
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minOrThrow-U")
    public static final byte minOrThrow-U(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "$this$min");
        if(UByteArray.isEmpty-impl(arr_b)) {
            throw new NoSuchElementException();
        }
        byte b = UByteArray.get-w2LRezQ(arr_b, 0);
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_b)).iterator();
        while(intIterator0.hasNext()) {
            byte b1 = UByteArray.get-w2LRezQ(arr_b, intIterator0.nextInt());
            if(Intrinsics.compare(b & 0xFF, b1 & 0xFF) > 0) {
                b = b1;
            }
        }
        return b;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minOrThrow-U")
    public static final int minOrThrow-U(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$min");
        if(UIntArray.isEmpty-impl(arr_v)) {
            throw new NoSuchElementException();
        }
        int v = UIntArray.get-pVg5ArA(arr_v, 0);
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_v)).iterator();
        while(intIterator0.hasNext()) {
            int v1 = UIntArray.get-pVg5ArA(arr_v, intIterator0.nextInt());
            if(Integer.compareUnsigned(v, v1) > 0) {
                v = v1;
            }
        }
        return v;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minOrThrow-U")
    public static final long minOrThrow-U(@NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$min");
        if(ULongArray.isEmpty-impl(arr_v)) {
            throw new NoSuchElementException();
        }
        long v = ULongArray.get-s-VKNKU(arr_v, 0);
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_v)).iterator();
        while(intIterator0.hasNext()) {
            long v1 = ULongArray.get-s-VKNKU(arr_v, intIterator0.nextInt());
            if(Long.compareUnsigned(v, v1) > 0) {
                v = v1;
            }
        }
        return v;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minOrThrow-U")
    public static final short minOrThrow-U(@NotNull short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$min");
        if(UShortArray.isEmpty-impl(arr_v)) {
            throw new NoSuchElementException();
        }
        short v = UShortArray.get-Mh2AYeg(arr_v, 0);
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_v)).iterator();
        while(intIterator0.hasNext()) {
            short v1 = UShortArray.get-Mh2AYeg(arr_v, intIterator0.nextInt());
            if(Intrinsics.compare(v & 0xFFFF, 0xFFFF & v1) > 0) {
                v = v1;
            }
        }
        return v;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final UByte minWithOrNull-XMRcp5o(@NotNull byte[] arr_b, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_b, "$this$minWithOrNull");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        if(UByteArray.isEmpty-impl(arr_b)) {
            return null;
        }
        int v = UByteArray.get-w2LRezQ(arr_b, 0);
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_b)).iterator();
        while(intIterator0.hasNext()) {
            int v1 = UByteArray.get-w2LRezQ(arr_b, intIterator0.nextInt());
            if(comparator0.compare(UByte.box-impl(((byte)v)), UByte.box-impl(((byte)v1))) > 0) {
                v = v1;
            }
        }
        return UByte.box-impl(((byte)v));
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final UInt minWithOrNull-YmdZ_VM(@NotNull int[] arr_v, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$minWithOrNull");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        if(UIntArray.isEmpty-impl(arr_v)) {
            return null;
        }
        int v = UIntArray.get-pVg5ArA(arr_v, 0);
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_v)).iterator();
        while(intIterator0.hasNext()) {
            int v1 = UIntArray.get-pVg5ArA(arr_v, intIterator0.nextInt());
            if(comparator0.compare(UInt.box-impl(v), UInt.box-impl(v1)) > 0) {
                v = v1;
            }
        }
        return UInt.box-impl(v);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final UShort minWithOrNull-eOHTfZs(@NotNull short[] arr_v, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$minWithOrNull");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        if(UShortArray.isEmpty-impl(arr_v)) {
            return null;
        }
        int v = UShortArray.get-Mh2AYeg(arr_v, 0);
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_v)).iterator();
        while(intIterator0.hasNext()) {
            int v1 = UShortArray.get-Mh2AYeg(arr_v, intIterator0.nextInt());
            if(comparator0.compare(UShort.box-impl(((short)v)), UShort.box-impl(((short)v1))) > 0) {
                v = v1;
            }
        }
        return UShort.box-impl(((short)v));
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final ULong minWithOrNull-zrEWJaI(@NotNull long[] arr_v, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$minWithOrNull");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        if(ULongArray.isEmpty-impl(arr_v)) {
            return null;
        }
        long v = ULongArray.get-s-VKNKU(arr_v, 0);
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_v)).iterator();
        while(intIterator0.hasNext()) {
            long v1 = ULongArray.get-s-VKNKU(arr_v, intIterator0.nextInt());
            if(comparator0.compare(ULong.box-impl(v), ULong.box-impl(v1)) > 0) {
                v = v1;
            }
        }
        return ULong.box-impl(v);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minWithOrThrow-U")
    public static final byte minWithOrThrow-U(@NotNull byte[] arr_b, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_b, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        if(UByteArray.isEmpty-impl(arr_b)) {
            throw new NoSuchElementException();
        }
        byte b = UByteArray.get-w2LRezQ(arr_b, 0);
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_b)).iterator();
        while(intIterator0.hasNext()) {
            byte b1 = UByteArray.get-w2LRezQ(arr_b, intIterator0.nextInt());
            if(comparator0.compare(UByte.box-impl(b), UByte.box-impl(b1)) > 0) {
                b = b1;
            }
        }
        return b;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minWithOrThrow-U")
    public static final int minWithOrThrow-U(@NotNull int[] arr_v, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        if(UIntArray.isEmpty-impl(arr_v)) {
            throw new NoSuchElementException();
        }
        int v = UIntArray.get-pVg5ArA(arr_v, 0);
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_v)).iterator();
        while(intIterator0.hasNext()) {
            int v1 = UIntArray.get-pVg5ArA(arr_v, intIterator0.nextInt());
            if(comparator0.compare(UInt.box-impl(v), UInt.box-impl(v1)) > 0) {
                v = v1;
            }
        }
        return v;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minWithOrThrow-U")
    public static final long minWithOrThrow-U(@NotNull long[] arr_v, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        if(ULongArray.isEmpty-impl(arr_v)) {
            throw new NoSuchElementException();
        }
        long v = ULongArray.get-s-VKNKU(arr_v, 0);
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_v)).iterator();
        while(intIterator0.hasNext()) {
            long v1 = ULongArray.get-s-VKNKU(arr_v, intIterator0.nextInt());
            if(comparator0.compare(ULong.box-impl(v), ULong.box-impl(v1)) > 0) {
                v = v1;
            }
        }
        return v;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minWithOrThrow-U")
    public static final short minWithOrThrow-U(@NotNull short[] arr_v, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        if(UShortArray.isEmpty-impl(arr_v)) {
            throw new NoSuchElementException();
        }
        short v = UShortArray.get-Mh2AYeg(arr_v, 0);
        IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_v)).iterator();
        while(intIterator0.hasNext()) {
            short v1 = UShortArray.get-Mh2AYeg(arr_v, intIterator0.nextInt());
            if(comparator0.compare(UShort.box-impl(v), UShort.box-impl(v1)) > 0) {
                v = v1;
            }
        }
        return v;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final int[] plus-CFIt9YE(@NotNull int[] arr_v, @NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$plus");
        Intrinsics.checkNotNullParameter(collection0, "elements");
        int v = UIntArray.getSize-impl(arr_v);
        int[] arr_v1 = Arrays.copyOf(arr_v, collection0.size() + UIntArray.getSize-impl(arr_v));
        Intrinsics.checkNotNullExpressionValue(arr_v1, "copyOf(...)");
        for(Object object0: collection0) {
            arr_v1[v] = ((UInt)object0).unbox-impl();
            ++v;
        }
        return UIntArray.constructor-impl(arr_v1);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final long[] plus-kzHmqpY(@NotNull long[] arr_v, @NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$plus");
        Intrinsics.checkNotNullParameter(collection0, "elements");
        int v = ULongArray.getSize-impl(arr_v);
        long[] arr_v1 = Arrays.copyOf(arr_v, collection0.size() + ULongArray.getSize-impl(arr_v));
        Intrinsics.checkNotNullExpressionValue(arr_v1, "copyOf(...)");
        for(Object object0: collection0) {
            arr_v1[v] = ((ULong)object0).unbox-impl();
            ++v;
        }
        return ULongArray.constructor-impl(arr_v1);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final short[] plus-ojwP5H8(@NotNull short[] arr_v, @NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$plus");
        Intrinsics.checkNotNullParameter(collection0, "elements");
        int v = UShortArray.getSize-impl(arr_v);
        short[] arr_v1 = Arrays.copyOf(arr_v, collection0.size() + UShortArray.getSize-impl(arr_v));
        Intrinsics.checkNotNullExpressionValue(arr_v1, "copyOf(...)");
        for(Object object0: collection0) {
            arr_v1[v] = ((UShort)object0).unbox-impl();
            ++v;
        }
        return UShortArray.constructor-impl(arr_v1);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final byte[] plus-xo_DsdI(@NotNull byte[] arr_b, @NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(arr_b, "$this$plus");
        Intrinsics.checkNotNullParameter(collection0, "elements");
        int v = UByteArray.getSize-impl(arr_b);
        byte[] arr_b1 = Arrays.copyOf(arr_b, collection0.size() + UByteArray.getSize-impl(arr_b));
        Intrinsics.checkNotNullExpressionValue(arr_b1, "copyOf(...)");
        for(Object object0: collection0) {
            arr_b1[v] = ((UByte)object0).unbox-impl();
            ++v;
        }
        return UByteArray.constructor-impl(arr_b1);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    public static final int random-2D5oskM(@NotNull int[] arr_v, @NotNull Random random0) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$random");
        Intrinsics.checkNotNullParameter(random0, "random");
        if(UIntArray.isEmpty-impl(arr_v)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return UIntArray.get-pVg5ArA(arr_v, random0.nextInt(UIntArray.getSize-impl(arr_v)));
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    public static final long random-JzugnMA(@NotNull long[] arr_v, @NotNull Random random0) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$random");
        Intrinsics.checkNotNullParameter(random0, "random");
        if(ULongArray.isEmpty-impl(arr_v)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return ULongArray.get-s-VKNKU(arr_v, random0.nextInt(ULongArray.getSize-impl(arr_v)));
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    public static final byte random-oSF2wD8(@NotNull byte[] arr_b, @NotNull Random random0) {
        Intrinsics.checkNotNullParameter(arr_b, "$this$random");
        Intrinsics.checkNotNullParameter(random0, "random");
        if(UByteArray.isEmpty-impl(arr_b)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return UByteArray.get-w2LRezQ(arr_b, random0.nextInt(UByteArray.getSize-impl(arr_b)));
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    public static final short random-s5X_as8(@NotNull short[] arr_v, @NotNull Random random0) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$random");
        Intrinsics.checkNotNullParameter(random0, "random");
        if(UShortArray.isEmpty-impl(arr_v)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return UShortArray.get-Mh2AYeg(arr_v, random0.nextInt(UShortArray.getSize-impl(arr_v)));
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final UInt randomOrNull-2D5oskM(@NotNull int[] arr_v, @NotNull Random random0) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$randomOrNull");
        Intrinsics.checkNotNullParameter(random0, "random");
        return UIntArray.isEmpty-impl(arr_v) ? null : UInt.box-impl(UIntArray.get-pVg5ArA(arr_v, random0.nextInt(UIntArray.getSize-impl(arr_v))));
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final ULong randomOrNull-JzugnMA(@NotNull long[] arr_v, @NotNull Random random0) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$randomOrNull");
        Intrinsics.checkNotNullParameter(random0, "random");
        return ULongArray.isEmpty-impl(arr_v) ? null : ULong.box-impl(ULongArray.get-s-VKNKU(arr_v, random0.nextInt(ULongArray.getSize-impl(arr_v))));
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final UByte randomOrNull-oSF2wD8(@NotNull byte[] arr_b, @NotNull Random random0) {
        Intrinsics.checkNotNullParameter(arr_b, "$this$randomOrNull");
        Intrinsics.checkNotNullParameter(random0, "random");
        return UByteArray.isEmpty-impl(arr_b) ? null : UByte.box-impl(UByteArray.get-w2LRezQ(arr_b, random0.nextInt(UByteArray.getSize-impl(arr_b))));
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final UShort randomOrNull-s5X_as8(@NotNull short[] arr_v, @NotNull Random random0) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$randomOrNull");
        Intrinsics.checkNotNullParameter(random0, "random");
        return UShortArray.isEmpty-impl(arr_v) ? null : UShort.box-impl(UShortArray.get-Mh2AYeg(arr_v, random0.nextInt(UShortArray.getSize-impl(arr_v))));
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final List reversed--ajY-9A(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$reversed");
        if(UIntArray.isEmpty-impl(arr_v)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List list0 = CollectionsKt___CollectionsKt.toMutableList(UIntArray.box-impl(arr_v));
        kotlin.collections.q.reverse(list0);
        return list0;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final List reversed-GBYM_sE(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "$this$reversed");
        if(UByteArray.isEmpty-impl(arr_b)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List list0 = CollectionsKt___CollectionsKt.toMutableList(UByteArray.box-impl(arr_b));
        kotlin.collections.q.reverse(list0);
        return list0;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final List reversed-QwZRm1k(@NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$reversed");
        if(ULongArray.isEmpty-impl(arr_v)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List list0 = CollectionsKt___CollectionsKt.toMutableList(ULongArray.box-impl(arr_v));
        kotlin.collections.q.reverse(list0);
        return list0;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final List reversed-rL5Bavg(@NotNull short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$reversed");
        if(UShortArray.isEmpty-impl(arr_v)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List list0 = CollectionsKt___CollectionsKt.toMutableList(UShortArray.box-impl(arr_v));
        kotlin.collections.q.reverse(list0);
        return list0;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    public static final void shuffle--ajY-9A(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$shuffle");
        a.shuffle-2D5oskM(arr_v, Random.Default);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    public static final void shuffle-2D5oskM(@NotNull int[] arr_v, @NotNull Random random0) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$shuffle");
        Intrinsics.checkNotNullParameter(random0, "random");
        for(int v = ArraysKt___ArraysKt.getLastIndex(arr_v); v > 0; --v) {
            int v1 = random0.nextInt(v + 1);
            int v2 = UIntArray.get-pVg5ArA(arr_v, v);
            UIntArray.set-VXSXFK8(arr_v, v, UIntArray.get-pVg5ArA(arr_v, v1));
            UIntArray.set-VXSXFK8(arr_v, v1, v2);
        }
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    public static final void shuffle-GBYM_sE(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "$this$shuffle");
        a.shuffle-oSF2wD8(arr_b, Random.Default);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    public static final void shuffle-JzugnMA(@NotNull long[] arr_v, @NotNull Random random0) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$shuffle");
        Intrinsics.checkNotNullParameter(random0, "random");
        for(int v = ArraysKt___ArraysKt.getLastIndex(arr_v); v > 0; --v) {
            int v1 = random0.nextInt(v + 1);
            long v2 = ULongArray.get-s-VKNKU(arr_v, v);
            ULongArray.set-k8EXiF4(arr_v, v, ULongArray.get-s-VKNKU(arr_v, v1));
            ULongArray.set-k8EXiF4(arr_v, v1, v2);
        }
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    public static final void shuffle-QwZRm1k(@NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$shuffle");
        a.shuffle-JzugnMA(arr_v, Random.Default);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    public static final void shuffle-oSF2wD8(@NotNull byte[] arr_b, @NotNull Random random0) {
        Intrinsics.checkNotNullParameter(arr_b, "$this$shuffle");
        Intrinsics.checkNotNullParameter(random0, "random");
        for(int v = ArraysKt___ArraysKt.getLastIndex(arr_b); v > 0; --v) {
            int v1 = random0.nextInt(v + 1);
            int v2 = UByteArray.get-w2LRezQ(arr_b, v);
            UByteArray.set-VurrAj0(arr_b, v, UByteArray.get-w2LRezQ(arr_b, v1));
            UByteArray.set-VurrAj0(arr_b, v1, ((byte)v2));
        }
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    public static final void shuffle-rL5Bavg(@NotNull short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$shuffle");
        a.shuffle-s5X_as8(arr_v, Random.Default);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    public static final void shuffle-s5X_as8(@NotNull short[] arr_v, @NotNull Random random0) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$shuffle");
        Intrinsics.checkNotNullParameter(random0, "random");
        for(int v = ArraysKt___ArraysKt.getLastIndex(arr_v); v > 0; --v) {
            int v1 = random0.nextInt(v + 1);
            int v2 = UShortArray.get-Mh2AYeg(arr_v, v);
            UShortArray.set-01HTLdE(arr_v, v, UShortArray.get-Mh2AYeg(arr_v, v1));
            UShortArray.set-01HTLdE(arr_v, v1, ((short)v2));
        }
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @Nullable
    public static final UInt singleOrNull--ajY-9A(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$singleOrNull");
        return UIntArray.getSize-impl(arr_v) == 1 ? UInt.box-impl(UIntArray.get-pVg5ArA(arr_v, 0)) : null;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @Nullable
    public static final UByte singleOrNull-GBYM_sE(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "$this$singleOrNull");
        return UByteArray.getSize-impl(arr_b) == 1 ? UByte.box-impl(UByteArray.get-w2LRezQ(arr_b, 0)) : null;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @Nullable
    public static final ULong singleOrNull-QwZRm1k(@NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$singleOrNull");
        return ULongArray.getSize-impl(arr_v) == 1 ? ULong.box-impl(ULongArray.get-s-VKNKU(arr_v, 0)) : null;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @Nullable
    public static final UShort singleOrNull-rL5Bavg(@NotNull short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$singleOrNull");
        return UShortArray.getSize-impl(arr_v) == 1 ? UShort.box-impl(UShortArray.get-Mh2AYeg(arr_v, 0)) : null;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final List slice-F7u83W8(@NotNull long[] arr_v, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$slice");
        Intrinsics.checkNotNullParameter(iterable0, "indices");
        int v = l.collectionSizeOrDefault(iterable0, 10);
        if(v == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List list0 = new ArrayList(v);
        for(Object object0: iterable0) {
            ((ArrayList)list0).add(ULong.box-impl(ULongArray.get-s-VKNKU(arr_v, ((Number)object0).intValue())));
        }
        return list0;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final List slice-HwE9HBo(@NotNull int[] arr_v, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$slice");
        Intrinsics.checkNotNullParameter(iterable0, "indices");
        int v = l.collectionSizeOrDefault(iterable0, 10);
        if(v == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List list0 = new ArrayList(v);
        for(Object object0: iterable0) {
            ((ArrayList)list0).add(UInt.box-impl(UIntArray.get-pVg5ArA(arr_v, ((Number)object0).intValue())));
        }
        return list0;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final List slice-JGPC0-M(@NotNull short[] arr_v, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$slice");
        Intrinsics.checkNotNullParameter(iterable0, "indices");
        int v = l.collectionSizeOrDefault(iterable0, 10);
        if(v == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List list0 = new ArrayList(v);
        for(Object object0: iterable0) {
            ((ArrayList)list0).add(UShort.box-impl(UShortArray.get-Mh2AYeg(arr_v, ((Number)object0).intValue())));
        }
        return list0;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final List slice-JQknh5Q(@NotNull byte[] arr_b, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(arr_b, "$this$slice");
        Intrinsics.checkNotNullParameter(iterable0, "indices");
        int v = l.collectionSizeOrDefault(iterable0, 10);
        if(v == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List list0 = new ArrayList(v);
        for(Object object0: iterable0) {
            ((ArrayList)list0).add(UByte.box-impl(UByteArray.get-w2LRezQ(arr_b, ((Number)object0).intValue())));
        }
        return list0;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final List slice-Q6IL4kU(@NotNull short[] arr_v, @NotNull IntRange intRange0) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$slice");
        Intrinsics.checkNotNullParameter(intRange0, "indices");
        return intRange0.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : UArraysKt___UArraysJvmKt.asList-rL5Bavg(UShortArray.constructor-impl(ArraysKt___ArraysJvmKt.copyOfRange(arr_v, ((int)intRange0.getStart()), ((int)intRange0.getEndInclusive()) + 1)));
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final List slice-ZRhS8yI(@NotNull long[] arr_v, @NotNull IntRange intRange0) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$slice");
        Intrinsics.checkNotNullParameter(intRange0, "indices");
        return intRange0.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : UArraysKt___UArraysJvmKt.asList-QwZRm1k(ULongArray.constructor-impl(ArraysKt___ArraysJvmKt.copyOfRange(arr_v, ((int)intRange0.getStart()), ((int)intRange0.getEndInclusive()) + 1)));
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final List slice-c0bezYM(@NotNull byte[] arr_b, @NotNull IntRange intRange0) {
        Intrinsics.checkNotNullParameter(arr_b, "$this$slice");
        Intrinsics.checkNotNullParameter(intRange0, "indices");
        return intRange0.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : UArraysKt___UArraysJvmKt.asList-GBYM_sE(UByteArray.constructor-impl(ArraysKt___ArraysJvmKt.copyOfRange(arr_b, ((int)intRange0.getStart()), ((int)intRange0.getEndInclusive()) + 1)));
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final List slice-tAntMlw(@NotNull int[] arr_v, @NotNull IntRange intRange0) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$slice");
        Intrinsics.checkNotNullParameter(intRange0, "indices");
        return intRange0.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : UArraysKt___UArraysJvmKt.asList--ajY-9A(UIntArray.constructor-impl(ArraysKt___ArraysJvmKt.copyOfRange(arr_v, ((int)intRange0.getStart()), ((int)intRange0.getEndInclusive()) + 1)));
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final int[] sliceArray-CFIt9YE(@NotNull int[] arr_v, @NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(collection0, "indices");
        return UIntArray.constructor-impl(ArraysKt___ArraysKt.sliceArray(arr_v, collection0));
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final short[] sliceArray-Q6IL4kU(@NotNull short[] arr_v, @NotNull IntRange intRange0) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(intRange0, "indices");
        return UShortArray.constructor-impl(ArraysKt___ArraysKt.sliceArray(arr_v, intRange0));
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final long[] sliceArray-ZRhS8yI(@NotNull long[] arr_v, @NotNull IntRange intRange0) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(intRange0, "indices");
        return ULongArray.constructor-impl(ArraysKt___ArraysKt.sliceArray(arr_v, intRange0));
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final byte[] sliceArray-c0bezYM(@NotNull byte[] arr_b, @NotNull IntRange intRange0) {
        Intrinsics.checkNotNullParameter(arr_b, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(intRange0, "indices");
        return UByteArray.constructor-impl(ArraysKt___ArraysKt.sliceArray(arr_b, intRange0));
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final long[] sliceArray-kzHmqpY(@NotNull long[] arr_v, @NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(collection0, "indices");
        return ULongArray.constructor-impl(ArraysKt___ArraysKt.sliceArray(arr_v, collection0));
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final short[] sliceArray-ojwP5H8(@NotNull short[] arr_v, @NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(collection0, "indices");
        return UShortArray.constructor-impl(ArraysKt___ArraysKt.sliceArray(arr_v, collection0));
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final int[] sliceArray-tAntMlw(@NotNull int[] arr_v, @NotNull IntRange intRange0) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(intRange0, "indices");
        return UIntArray.constructor-impl(ArraysKt___ArraysKt.sliceArray(arr_v, intRange0));
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final byte[] sliceArray-xo_DsdI(@NotNull byte[] arr_b, @NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(arr_b, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(collection0, "indices");
        return UByteArray.constructor-impl(ArraysKt___ArraysKt.sliceArray(arr_b, collection0));
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    public static final void sort--ajY-9A(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$sort");
        if(UIntArray.getSize-impl(arr_v) > 1) {
            UArraySortingKt.sortArray-oBK06Vg(arr_v, 0, UIntArray.getSize-impl(arr_v));
        }
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    public static final void sort--nroSd4(@NotNull long[] arr_v, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$sort");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(v, v1, ULongArray.getSize-impl(arr_v));
        UArraySortingKt.sortArray--nroSd4(arr_v, v, v1);
    }

    public static void sort--nroSd4$default(long[] arr_v, int v, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = 0;
        }
        if((v2 & 2) != 0) {
            v1 = ULongArray.getSize-impl(arr_v);
        }
        a.sort--nroSd4(arr_v, v, v1);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    public static final void sort-4UcCI2c(@NotNull byte[] arr_b, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_b, "$this$sort");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(v, v1, UByteArray.getSize-impl(arr_b));
        UArraySortingKt.sortArray-4UcCI2c(arr_b, v, v1);
    }

    public static void sort-4UcCI2c$default(byte[] arr_b, int v, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = 0;
        }
        if((v2 & 2) != 0) {
            v1 = UByteArray.getSize-impl(arr_b);
        }
        a.sort-4UcCI2c(arr_b, v, v1);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    public static final void sort-Aa5vz7o(@NotNull short[] arr_v, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$sort");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(v, v1, UShortArray.getSize-impl(arr_v));
        UArraySortingKt.sortArray-Aa5vz7o(arr_v, v, v1);
    }

    public static void sort-Aa5vz7o$default(short[] arr_v, int v, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = 0;
        }
        if((v2 & 2) != 0) {
            v1 = UShortArray.getSize-impl(arr_v);
        }
        a.sort-Aa5vz7o(arr_v, v, v1);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    public static final void sort-GBYM_sE(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "$this$sort");
        if(UByteArray.getSize-impl(arr_b) > 1) {
            UArraySortingKt.sortArray-4UcCI2c(arr_b, 0, UByteArray.getSize-impl(arr_b));
        }
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    public static final void sort-QwZRm1k(@NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$sort");
        if(ULongArray.getSize-impl(arr_v) > 1) {
            UArraySortingKt.sortArray--nroSd4(arr_v, 0, ULongArray.getSize-impl(arr_v));
        }
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    public static final void sort-oBK06Vg(@NotNull int[] arr_v, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$sort");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(v, v1, UIntArray.getSize-impl(arr_v));
        UArraySortingKt.sortArray-oBK06Vg(arr_v, v, v1);
    }

    public static void sort-oBK06Vg$default(int[] arr_v, int v, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = 0;
        }
        if((v2 & 2) != 0) {
            v1 = UIntArray.getSize-impl(arr_v);
        }
        a.sort-oBK06Vg(arr_v, v, v1);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    public static final void sort-rL5Bavg(@NotNull short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$sort");
        if(UShortArray.getSize-impl(arr_v) > 1) {
            UArraySortingKt.sortArray-Aa5vz7o(arr_v, 0, UShortArray.getSize-impl(arr_v));
        }
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    public static final void sortDescending--ajY-9A(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$sortDescending");
        if(UIntArray.getSize-impl(arr_v) > 1) {
            a.sort--ajY-9A(arr_v);
            ArraysKt___ArraysKt.reverse(arr_v);
        }
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    public static final void sortDescending--nroSd4(@NotNull long[] arr_v, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$sortDescending");
        a.sort--nroSd4(arr_v, v, v1);
        ArraysKt___ArraysKt.reverse(arr_v, v, v1);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    public static final void sortDescending-4UcCI2c(@NotNull byte[] arr_b, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_b, "$this$sortDescending");
        a.sort-4UcCI2c(arr_b, v, v1);
        ArraysKt___ArraysKt.reverse(arr_b, v, v1);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    public static final void sortDescending-Aa5vz7o(@NotNull short[] arr_v, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$sortDescending");
        a.sort-Aa5vz7o(arr_v, v, v1);
        ArraysKt___ArraysKt.reverse(arr_v, v, v1);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    public static final void sortDescending-GBYM_sE(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "$this$sortDescending");
        if(UByteArray.getSize-impl(arr_b) > 1) {
            a.sort-GBYM_sE(arr_b);
            ArraysKt___ArraysKt.reverse(arr_b);
        }
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    public static final void sortDescending-QwZRm1k(@NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$sortDescending");
        if(ULongArray.getSize-impl(arr_v) > 1) {
            a.sort-QwZRm1k(arr_v);
            ArraysKt___ArraysKt.reverse(arr_v);
        }
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    public static final void sortDescending-oBK06Vg(@NotNull int[] arr_v, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$sortDescending");
        a.sort-oBK06Vg(arr_v, v, v1);
        ArraysKt___ArraysKt.reverse(arr_v, v, v1);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    public static final void sortDescending-rL5Bavg(@NotNull short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$sortDescending");
        if(UShortArray.getSize-impl(arr_v) > 1) {
            a.sort-rL5Bavg(arr_v);
            ArraysKt___ArraysKt.reverse(arr_v);
        }
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final List sorted--ajY-9A(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$sorted");
        int[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
        Intrinsics.checkNotNullExpressionValue(arr_v1, "copyOf(...)");
        int[] arr_v2 = UIntArray.constructor-impl(arr_v1);
        a.sort--ajY-9A(arr_v2);
        return UArraysKt___UArraysJvmKt.asList--ajY-9A(arr_v2);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final List sorted-GBYM_sE(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "$this$sorted");
        byte[] arr_b1 = Arrays.copyOf(arr_b, arr_b.length);
        Intrinsics.checkNotNullExpressionValue(arr_b1, "copyOf(...)");
        byte[] arr_b2 = UByteArray.constructor-impl(arr_b1);
        a.sort-GBYM_sE(arr_b2);
        return UArraysKt___UArraysJvmKt.asList-GBYM_sE(arr_b2);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final List sorted-QwZRm1k(@NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$sorted");
        long[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
        Intrinsics.checkNotNullExpressionValue(arr_v1, "copyOf(...)");
        long[] arr_v2 = ULongArray.constructor-impl(arr_v1);
        a.sort-QwZRm1k(arr_v2);
        return UArraysKt___UArraysJvmKt.asList-QwZRm1k(arr_v2);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final List sorted-rL5Bavg(@NotNull short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$sorted");
        short[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
        Intrinsics.checkNotNullExpressionValue(arr_v1, "copyOf(...)");
        short[] arr_v2 = UShortArray.constructor-impl(arr_v1);
        a.sort-rL5Bavg(arr_v2);
        return UArraysKt___UArraysJvmKt.asList-rL5Bavg(arr_v2);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final int[] sortedArray--ajY-9A(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$sortedArray");
        if(UIntArray.isEmpty-impl(arr_v)) {
            return arr_v;
        }
        int[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
        Intrinsics.checkNotNullExpressionValue(arr_v1, "copyOf(...)");
        int[] arr_v2 = UIntArray.constructor-impl(arr_v1);
        a.sort--ajY-9A(arr_v2);
        return arr_v2;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final byte[] sortedArray-GBYM_sE(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "$this$sortedArray");
        if(UByteArray.isEmpty-impl(arr_b)) {
            return arr_b;
        }
        byte[] arr_b1 = Arrays.copyOf(arr_b, arr_b.length);
        Intrinsics.checkNotNullExpressionValue(arr_b1, "copyOf(...)");
        byte[] arr_b2 = UByteArray.constructor-impl(arr_b1);
        a.sort-GBYM_sE(arr_b2);
        return arr_b2;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final long[] sortedArray-QwZRm1k(@NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$sortedArray");
        if(ULongArray.isEmpty-impl(arr_v)) {
            return arr_v;
        }
        long[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
        Intrinsics.checkNotNullExpressionValue(arr_v1, "copyOf(...)");
        long[] arr_v2 = ULongArray.constructor-impl(arr_v1);
        a.sort-QwZRm1k(arr_v2);
        return arr_v2;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final short[] sortedArray-rL5Bavg(@NotNull short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$sortedArray");
        if(UShortArray.isEmpty-impl(arr_v)) {
            return arr_v;
        }
        short[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
        Intrinsics.checkNotNullExpressionValue(arr_v1, "copyOf(...)");
        short[] arr_v2 = UShortArray.constructor-impl(arr_v1);
        a.sort-rL5Bavg(arr_v2);
        return arr_v2;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final int[] sortedArrayDescending--ajY-9A(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$sortedArrayDescending");
        if(UIntArray.isEmpty-impl(arr_v)) {
            return arr_v;
        }
        int[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
        Intrinsics.checkNotNullExpressionValue(arr_v1, "copyOf(...)");
        int[] arr_v2 = UIntArray.constructor-impl(arr_v1);
        a.sortDescending--ajY-9A(arr_v2);
        return arr_v2;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final byte[] sortedArrayDescending-GBYM_sE(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "$this$sortedArrayDescending");
        if(UByteArray.isEmpty-impl(arr_b)) {
            return arr_b;
        }
        byte[] arr_b1 = Arrays.copyOf(arr_b, arr_b.length);
        Intrinsics.checkNotNullExpressionValue(arr_b1, "copyOf(...)");
        byte[] arr_b2 = UByteArray.constructor-impl(arr_b1);
        a.sortDescending-GBYM_sE(arr_b2);
        return arr_b2;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final long[] sortedArrayDescending-QwZRm1k(@NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$sortedArrayDescending");
        if(ULongArray.isEmpty-impl(arr_v)) {
            return arr_v;
        }
        long[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
        Intrinsics.checkNotNullExpressionValue(arr_v1, "copyOf(...)");
        long[] arr_v2 = ULongArray.constructor-impl(arr_v1);
        a.sortDescending-QwZRm1k(arr_v2);
        return arr_v2;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final short[] sortedArrayDescending-rL5Bavg(@NotNull short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$sortedArrayDescending");
        if(UShortArray.isEmpty-impl(arr_v)) {
            return arr_v;
        }
        short[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
        Intrinsics.checkNotNullExpressionValue(arr_v1, "copyOf(...)");
        short[] arr_v2 = UShortArray.constructor-impl(arr_v1);
        a.sortDescending-rL5Bavg(arr_v2);
        return arr_v2;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final List sortedDescending--ajY-9A(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$sortedDescending");
        int[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
        Intrinsics.checkNotNullExpressionValue(arr_v1, "copyOf(...)");
        int[] arr_v2 = UIntArray.constructor-impl(arr_v1);
        a.sort--ajY-9A(arr_v2);
        return a.reversed--ajY-9A(arr_v2);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final List sortedDescending-GBYM_sE(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "$this$sortedDescending");
        byte[] arr_b1 = Arrays.copyOf(arr_b, arr_b.length);
        Intrinsics.checkNotNullExpressionValue(arr_b1, "copyOf(...)");
        byte[] arr_b2 = UByteArray.constructor-impl(arr_b1);
        a.sort-GBYM_sE(arr_b2);
        return a.reversed-GBYM_sE(arr_b2);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final List sortedDescending-QwZRm1k(@NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$sortedDescending");
        long[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
        Intrinsics.checkNotNullExpressionValue(arr_v1, "copyOf(...)");
        long[] arr_v2 = ULongArray.constructor-impl(arr_v1);
        a.sort-QwZRm1k(arr_v2);
        return a.reversed-QwZRm1k(arr_v2);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final List sortedDescending-rL5Bavg(@NotNull short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$sortedDescending");
        short[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
        Intrinsics.checkNotNullExpressionValue(arr_v1, "copyOf(...)");
        short[] arr_v2 = UShortArray.constructor-impl(arr_v1);
        a.sort-rL5Bavg(arr_v2);
        return a.reversed-rL5Bavg(arr_v2);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfUByte")
    public static final int sumOfUByte(@NotNull UByte[] arr_uByte) {
        Intrinsics.checkNotNullParameter(arr_uByte, "<this>");
        int v1 = 0;
        for(int v = 0; v < arr_uByte.length; ++v) {
            v1 = UInt.constructor-impl(UInt.constructor-impl(arr_uByte[v].unbox-impl() & 0xFF) + v1);
        }
        return v1;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfUInt")
    public static final int sumOfUInt(@NotNull UInt[] arr_uInt) {
        Intrinsics.checkNotNullParameter(arr_uInt, "<this>");
        int v1 = 0;
        for(int v = 0; v < arr_uInt.length; ++v) {
            v1 = UInt.constructor-impl(arr_uInt[v].unbox-impl() + v1);
        }
        return v1;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfULong")
    public static final long sumOfULong(@NotNull ULong[] arr_uLong) {
        Intrinsics.checkNotNullParameter(arr_uLong, "<this>");
        long v = 0L;
        for(int v1 = 0; v1 < arr_uLong.length; ++v1) {
            v = ULong.constructor-impl(arr_uLong[v1].unbox-impl() + v);
        }
        return v;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfUShort")
    public static final int sumOfUShort(@NotNull UShort[] arr_uShort) {
        Intrinsics.checkNotNullParameter(arr_uShort, "<this>");
        int v1 = 0;
        for(int v = 0; v < arr_uShort.length; ++v) {
            v1 = UInt.constructor-impl(UInt.constructor-impl(arr_uShort[v].unbox-impl() & 0xFFFF) + v1);
        }
        return v1;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final List take-PpDY95g(@NotNull byte[] arr_b, int v) {
        Intrinsics.checkNotNullParameter(arr_b, "$this$take");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        if(v == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if(v >= UByteArray.getSize-impl(arr_b)) {
            return CollectionsKt___CollectionsKt.toList(UByteArray.box-impl(arr_b));
        }
        if(v == 1) {
            return k.listOf(UByte.box-impl(UByteArray.get-w2LRezQ(arr_b, 0)));
        }
        List list0 = new ArrayList(v);
        int v2 = UByteArray.getSize-impl(arr_b);
        int v3 = 0;
        for(int v1 = 0; v1 < v2; ++v1) {
            ((ArrayList)list0).add(UByte.box-impl(UByteArray.get-w2LRezQ(arr_b, v1)));
            ++v3;
            if(v3 == v) {
                break;
            }
        }
        return list0;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final List take-nggk6HY(@NotNull short[] arr_v, int v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$take");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        if(v == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if(v >= UShortArray.getSize-impl(arr_v)) {
            return CollectionsKt___CollectionsKt.toList(UShortArray.box-impl(arr_v));
        }
        if(v == 1) {
            return k.listOf(UShort.box-impl(UShortArray.get-Mh2AYeg(arr_v, 0)));
        }
        List list0 = new ArrayList(v);
        int v2 = UShortArray.getSize-impl(arr_v);
        int v3 = 0;
        for(int v1 = 0; v1 < v2; ++v1) {
            ((ArrayList)list0).add(UShort.box-impl(UShortArray.get-Mh2AYeg(arr_v, v1)));
            ++v3;
            if(v3 == v) {
                break;
            }
        }
        return list0;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final List take-qFRl0hI(@NotNull int[] arr_v, int v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$take");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        if(v == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if(v >= UIntArray.getSize-impl(arr_v)) {
            return CollectionsKt___CollectionsKt.toList(UIntArray.box-impl(arr_v));
        }
        if(v == 1) {
            return k.listOf(UInt.box-impl(UIntArray.get-pVg5ArA(arr_v, 0)));
        }
        List list0 = new ArrayList(v);
        int v2 = UIntArray.getSize-impl(arr_v);
        int v3 = 0;
        for(int v1 = 0; v1 < v2; ++v1) {
            ((ArrayList)list0).add(UInt.box-impl(UIntArray.get-pVg5ArA(arr_v, v1)));
            ++v3;
            if(v3 == v) {
                break;
            }
        }
        return list0;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final List take-r7IrZao(@NotNull long[] arr_v, int v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$take");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        if(v == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if(v >= ULongArray.getSize-impl(arr_v)) {
            return CollectionsKt___CollectionsKt.toList(ULongArray.box-impl(arr_v));
        }
        if(v == 1) {
            return k.listOf(ULong.box-impl(ULongArray.get-s-VKNKU(arr_v, 0)));
        }
        List list0 = new ArrayList(v);
        int v2 = ULongArray.getSize-impl(arr_v);
        int v3 = 0;
        for(int v1 = 0; v1 < v2; ++v1) {
            ((ArrayList)list0).add(ULong.box-impl(ULongArray.get-s-VKNKU(arr_v, v1)));
            ++v3;
            if(v3 == v) {
                break;
            }
        }
        return list0;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final List takeLast-PpDY95g(@NotNull byte[] arr_b, int v) {
        Intrinsics.checkNotNullParameter(arr_b, "$this$takeLast");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        if(v == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int v1 = UByteArray.getSize-impl(arr_b);
        if(v >= v1) {
            return CollectionsKt___CollectionsKt.toList(UByteArray.box-impl(arr_b));
        }
        if(v == 1) {
            return k.listOf(UByte.box-impl(UByteArray.get-w2LRezQ(arr_b, v1 - 1)));
        }
        List list0 = new ArrayList(v);
        for(int v2 = v1 - v; v2 < v1; ++v2) {
            ((ArrayList)list0).add(UByte.box-impl(UByteArray.get-w2LRezQ(arr_b, v2)));
        }
        return list0;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final List takeLast-nggk6HY(@NotNull short[] arr_v, int v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$takeLast");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        if(v == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int v1 = UShortArray.getSize-impl(arr_v);
        if(v >= v1) {
            return CollectionsKt___CollectionsKt.toList(UShortArray.box-impl(arr_v));
        }
        if(v == 1) {
            return k.listOf(UShort.box-impl(UShortArray.get-Mh2AYeg(arr_v, v1 - 1)));
        }
        List list0 = new ArrayList(v);
        for(int v2 = v1 - v; v2 < v1; ++v2) {
            ((ArrayList)list0).add(UShort.box-impl(UShortArray.get-Mh2AYeg(arr_v, v2)));
        }
        return list0;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final List takeLast-qFRl0hI(@NotNull int[] arr_v, int v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$takeLast");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        if(v == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int v1 = UIntArray.getSize-impl(arr_v);
        if(v >= v1) {
            return CollectionsKt___CollectionsKt.toList(UIntArray.box-impl(arr_v));
        }
        if(v == 1) {
            return k.listOf(UInt.box-impl(UIntArray.get-pVg5ArA(arr_v, v1 - 1)));
        }
        List list0 = new ArrayList(v);
        for(int v2 = v1 - v; v2 < v1; ++v2) {
            ((ArrayList)list0).add(UInt.box-impl(UIntArray.get-pVg5ArA(arr_v, v2)));
        }
        return list0;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final List takeLast-r7IrZao(@NotNull long[] arr_v, int v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$takeLast");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        if(v == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int v1 = ULongArray.getSize-impl(arr_v);
        if(v >= v1) {
            return CollectionsKt___CollectionsKt.toList(ULongArray.box-impl(arr_v));
        }
        if(v == 1) {
            return k.listOf(ULong.box-impl(ULongArray.get-s-VKNKU(arr_v, v1 - 1)));
        }
        List list0 = new ArrayList(v);
        for(int v2 = v1 - v; v2 < v1; ++v2) {
            ((ArrayList)list0).add(ULong.box-impl(ULongArray.get-s-VKNKU(arr_v, v2)));
        }
        return list0;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final UInt[] toTypedArray--ajY-9A(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$toTypedArray");
        int v = UIntArray.getSize-impl(arr_v);
        UInt[] arr_uInt = new UInt[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_uInt[v1] = UInt.box-impl(UIntArray.get-pVg5ArA(arr_v, v1));
        }
        return arr_uInt;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final UByte[] toTypedArray-GBYM_sE(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "$this$toTypedArray");
        int v = UByteArray.getSize-impl(arr_b);
        UByte[] arr_uByte = new UByte[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_uByte[v1] = UByte.box-impl(UByteArray.get-w2LRezQ(arr_b, v1));
        }
        return arr_uByte;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final ULong[] toTypedArray-QwZRm1k(@NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$toTypedArray");
        int v = ULongArray.getSize-impl(arr_v);
        ULong[] arr_uLong = new ULong[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_uLong[v1] = ULong.box-impl(ULongArray.get-s-VKNKU(arr_v, v1));
        }
        return arr_uLong;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final UShort[] toTypedArray-rL5Bavg(@NotNull short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$toTypedArray");
        int v = UShortArray.getSize-impl(arr_v);
        UShort[] arr_uShort = new UShort[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_uShort[v1] = UShort.box-impl(UShortArray.get-Mh2AYeg(arr_v, v1));
        }
        return arr_uShort;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final byte[] toUByteArray(@NotNull UByte[] arr_uByte) {
        Intrinsics.checkNotNullParameter(arr_uByte, "<this>");
        byte[] arr_b = new byte[arr_uByte.length];
        for(int v = 0; v < arr_uByte.length; ++v) {
            arr_b[v] = arr_uByte[v].unbox-impl();
        }
        return UByteArray.constructor-impl(arr_b);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final int[] toUIntArray(@NotNull UInt[] arr_uInt) {
        Intrinsics.checkNotNullParameter(arr_uInt, "<this>");
        int[] arr_v = new int[arr_uInt.length];
        for(int v = 0; v < arr_uInt.length; ++v) {
            arr_v[v] = arr_uInt[v].unbox-impl();
        }
        return UIntArray.constructor-impl(arr_v);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final long[] toULongArray(@NotNull ULong[] arr_uLong) {
        Intrinsics.checkNotNullParameter(arr_uLong, "<this>");
        long[] arr_v = new long[arr_uLong.length];
        for(int v = 0; v < arr_uLong.length; ++v) {
            arr_v[v] = arr_uLong[v].unbox-impl();
        }
        return ULongArray.constructor-impl(arr_v);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final short[] toUShortArray(@NotNull UShort[] arr_uShort) {
        Intrinsics.checkNotNullParameter(arr_uShort, "<this>");
        short[] arr_v = new short[arr_uShort.length];
        for(int v = 0; v < arr_uShort.length; ++v) {
            arr_v[v] = arr_uShort[v].unbox-impl();
        }
        return UShortArray.constructor-impl(arr_v);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final Iterable withIndex--ajY-9A(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$withIndex");
        return new IndexingIterable(new i(1, arr_v));
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final Iterable withIndex-GBYM_sE(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "$this$withIndex");
        return new IndexingIterable(new g(arr_b, 1));
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final Iterable withIndex-QwZRm1k(@NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$withIndex");
        return new IndexingIterable(new j(arr_v, 1));
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final Iterable withIndex-rL5Bavg(@NotNull short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$withIndex");
        return new IndexingIterable(new h(arr_v, 1));
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final List zip-C-E_24M(@NotNull int[] arr_v, @NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$zip");
        Intrinsics.checkNotNullParameter(arr_object, "other");
        int v = Math.min(UIntArray.getSize-impl(arr_v), arr_object.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = UIntArray.get-pVg5ArA(arr_v, v1);
            Object object0 = arr_object[v1];
            ((ArrayList)list0).add(TuplesKt.to(UInt.box-impl(v2), object0));
        }
        return list0;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final List zip-F7u83W8(@NotNull long[] arr_v, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$zip");
        Intrinsics.checkNotNullParameter(iterable0, "other");
        int v = ULongArray.getSize-impl(arr_v);
        List list0 = new ArrayList(Math.min(l.collectionSizeOrDefault(iterable0, 10), v));
        int v1 = 0;
        for(Object object0: iterable0) {
            if(v1 >= v) {
                break;
            }
            ((ArrayList)list0).add(TuplesKt.to(ULong.box-impl(ULongArray.get-s-VKNKU(arr_v, v1)), object0));
            ++v1;
        }
        return list0;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final List zip-HwE9HBo(@NotNull int[] arr_v, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$zip");
        Intrinsics.checkNotNullParameter(iterable0, "other");
        int v = UIntArray.getSize-impl(arr_v);
        List list0 = new ArrayList(Math.min(l.collectionSizeOrDefault(iterable0, 10), v));
        int v1 = 0;
        for(Object object0: iterable0) {
            if(v1 >= v) {
                break;
            }
            ((ArrayList)list0).add(TuplesKt.to(UInt.box-impl(UIntArray.get-pVg5ArA(arr_v, v1)), object0));
            ++v1;
        }
        return list0;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final List zip-JGPC0-M(@NotNull short[] arr_v, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$zip");
        Intrinsics.checkNotNullParameter(iterable0, "other");
        int v = UShortArray.getSize-impl(arr_v);
        List list0 = new ArrayList(Math.min(l.collectionSizeOrDefault(iterable0, 10), v));
        int v1 = 0;
        for(Object object0: iterable0) {
            if(v1 >= v) {
                break;
            }
            ((ArrayList)list0).add(TuplesKt.to(UShort.box-impl(UShortArray.get-Mh2AYeg(arr_v, v1)), object0));
            ++v1;
        }
        return list0;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final List zip-JQknh5Q(@NotNull byte[] arr_b, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(arr_b, "$this$zip");
        Intrinsics.checkNotNullParameter(iterable0, "other");
        int v = UByteArray.getSize-impl(arr_b);
        List list0 = new ArrayList(Math.min(l.collectionSizeOrDefault(iterable0, 10), v));
        int v1 = 0;
        for(Object object0: iterable0) {
            if(v1 >= v) {
                break;
            }
            ((ArrayList)list0).add(TuplesKt.to(UByte.box-impl(UByteArray.get-w2LRezQ(arr_b, v1)), object0));
            ++v1;
        }
        return list0;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final List zip-ctEhBpI(@NotNull int[] arr_v, @NotNull int[] arr_v1) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$zip");
        Intrinsics.checkNotNullParameter(arr_v1, "other");
        int v = Math.min(UIntArray.getSize-impl(arr_v), UIntArray.getSize-impl(arr_v1));
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = UIntArray.get-pVg5ArA(arr_v, v1);
            int v3 = UIntArray.get-pVg5ArA(arr_v1, v1);
            ((ArrayList)list0).add(TuplesKt.to(UInt.box-impl(v2), UInt.box-impl(v3)));
        }
        return list0;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final List zip-f7H3mmw(@NotNull long[] arr_v, @NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$zip");
        Intrinsics.checkNotNullParameter(arr_object, "other");
        int v = Math.min(ULongArray.getSize-impl(arr_v), arr_object.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            long v2 = ULongArray.get-s-VKNKU(arr_v, v1);
            Object object0 = arr_object[v1];
            ((ArrayList)list0).add(TuplesKt.to(ULong.box-impl(v2), object0));
        }
        return list0;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final List zip-kdPth3s(@NotNull byte[] arr_b, @NotNull byte[] arr_b1) {
        Intrinsics.checkNotNullParameter(arr_b, "$this$zip");
        Intrinsics.checkNotNullParameter(arr_b1, "other");
        int v = Math.min(UByteArray.getSize-impl(arr_b), UByteArray.getSize-impl(arr_b1));
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = UByteArray.get-w2LRezQ(arr_b, v1);
            int v3 = UByteArray.get-w2LRezQ(arr_b1, v1);
            ((ArrayList)list0).add(TuplesKt.to(UByte.box-impl(((byte)v2)), UByte.box-impl(((byte)v3))));
        }
        return list0;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final List zip-mazbYpA(@NotNull short[] arr_v, @NotNull short[] arr_v1) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$zip");
        Intrinsics.checkNotNullParameter(arr_v1, "other");
        int v = Math.min(UShortArray.getSize-impl(arr_v), UShortArray.getSize-impl(arr_v1));
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = UShortArray.get-Mh2AYeg(arr_v, v1);
            int v3 = UShortArray.get-Mh2AYeg(arr_v1, v1);
            ((ArrayList)list0).add(TuplesKt.to(UShort.box-impl(((short)v2)), UShort.box-impl(((short)v3))));
        }
        return list0;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final List zip-nl983wc(@NotNull byte[] arr_b, @NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_b, "$this$zip");
        Intrinsics.checkNotNullParameter(arr_object, "other");
        int v = Math.min(UByteArray.getSize-impl(arr_b), arr_object.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = UByteArray.get-w2LRezQ(arr_b, v1);
            Object object0 = arr_object[v1];
            ((ArrayList)list0).add(TuplesKt.to(UByte.box-impl(((byte)v2)), object0));
        }
        return list0;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final List zip-uaTIQ5s(@NotNull short[] arr_v, @NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$zip");
        Intrinsics.checkNotNullParameter(arr_object, "other");
        int v = Math.min(UShortArray.getSize-impl(arr_v), arr_object.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = UShortArray.get-Mh2AYeg(arr_v, v1);
            Object object0 = arr_object[v1];
            ((ArrayList)list0).add(TuplesKt.to(UShort.box-impl(((short)v2)), object0));
        }
        return list0;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final List zip-us8wMrg(@NotNull long[] arr_v, @NotNull long[] arr_v1) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$zip");
        Intrinsics.checkNotNullParameter(arr_v1, "other");
        int v = Math.min(ULongArray.getSize-impl(arr_v), ULongArray.getSize-impl(arr_v1));
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            long v2 = ULongArray.get-s-VKNKU(arr_v, v1);
            long v3 = ULongArray.get-s-VKNKU(arr_v1, v1);
            ((ArrayList)list0).add(TuplesKt.to(ULong.box-impl(v2), ULong.box-impl(v3)));
        }
        return list0;
    }
}

