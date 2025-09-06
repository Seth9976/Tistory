package kotlin.collections.unsigned;

import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.UnsignedKt;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import od.a;
import org.jetbrains.annotations.NotNull;

public abstract class UArraysKt___UArraysJvmKt {
    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final List asList--ajY-9A(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$asList");
        return new RandomAccess() {
            @Override  // kotlin.collections.AbstractCollection
            public final boolean contains(Object object0) {
                return object0 instanceof UInt ? this.contains-WZ4Q5Ns(((UInt)object0).unbox-impl()) : false;
            }

            public boolean contains-WZ4Q5Ns(int v) {
                return UIntArray.contains-WZ4Q5Ns(arr_v, v);
            }

            @Override  // kotlin.collections.AbstractList
            public Object get(int v) {
                return UInt.box-impl(this.get-pVg5ArA(v));
            }

            public int get-pVg5ArA(int v) {
                return UIntArray.get-pVg5ArA(arr_v, v);
            }

            @Override  // kotlin.collections.AbstractList
            public int getSize() {
                return UIntArray.getSize-impl(arr_v);
            }

            @Override  // kotlin.collections.AbstractList
            public final int indexOf(Object object0) {
                return object0 instanceof UInt ? this.indexOf-WZ4Q5Ns(((UInt)object0).unbox-impl()) : -1;
            }

            public int indexOf-WZ4Q5Ns(int v) {
                return ArraysKt___ArraysKt.indexOf(arr_v, v);
            }

            @Override  // kotlin.collections.AbstractCollection
            public boolean isEmpty() {
                return UIntArray.isEmpty-impl(arr_v);
            }

            @Override  // kotlin.collections.AbstractList
            public final int lastIndexOf(Object object0) {
                return object0 instanceof UInt ? this.lastIndexOf-WZ4Q5Ns(((UInt)object0).unbox-impl()) : -1;
            }

            public int lastIndexOf-WZ4Q5Ns(int v) {
                return ArraysKt___ArraysKt.lastIndexOf(arr_v, v);
            }
        };
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final List asList-GBYM_sE(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "$this$asList");
        return new RandomAccess() {
            @Override  // kotlin.collections.AbstractCollection
            public final boolean contains(Object object0) {
                return object0 instanceof UByte ? this.contains-7apg3OU(((UByte)object0).unbox-impl()) : false;
            }

            public boolean contains-7apg3OU(byte b) {
                return UByteArray.contains-7apg3OU(arr_b, b);
            }

            @Override  // kotlin.collections.AbstractList
            public Object get(int v) {
                return UByte.box-impl(this.get-w2LRezQ(v));
            }

            public byte get-w2LRezQ(int v) {
                return UByteArray.get-w2LRezQ(arr_b, v);
            }

            @Override  // kotlin.collections.AbstractList
            public int getSize() {
                return UByteArray.getSize-impl(arr_b);
            }

            @Override  // kotlin.collections.AbstractList
            public final int indexOf(Object object0) {
                return object0 instanceof UByte ? this.indexOf-7apg3OU(((UByte)object0).unbox-impl()) : -1;
            }

            public int indexOf-7apg3OU(byte b) {
                return ArraysKt___ArraysKt.indexOf(arr_b, b);
            }

            @Override  // kotlin.collections.AbstractCollection
            public boolean isEmpty() {
                return UByteArray.isEmpty-impl(arr_b);
            }

            @Override  // kotlin.collections.AbstractList
            public final int lastIndexOf(Object object0) {
                return object0 instanceof UByte ? this.lastIndexOf-7apg3OU(((UByte)object0).unbox-impl()) : -1;
            }

            public int lastIndexOf-7apg3OU(byte b) {
                return ArraysKt___ArraysKt.lastIndexOf(arr_b, b);
            }
        };
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final List asList-QwZRm1k(@NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$asList");
        return new RandomAccess() {
            @Override  // kotlin.collections.AbstractCollection
            public final boolean contains(Object object0) {
                return object0 instanceof ULong ? this.contains-VKZWuLQ(((ULong)object0).unbox-impl()) : false;
            }

            public boolean contains-VKZWuLQ(long v) {
                return ULongArray.contains-VKZWuLQ(arr_v, v);
            }

            @Override  // kotlin.collections.AbstractList
            public Object get(int v) {
                return ULong.box-impl(this.get-s-VKNKU(v));
            }

            public long get-s-VKNKU(int v) {
                return ULongArray.get-s-VKNKU(arr_v, v);
            }

            @Override  // kotlin.collections.AbstractList
            public int getSize() {
                return ULongArray.getSize-impl(arr_v);
            }

            @Override  // kotlin.collections.AbstractList
            public final int indexOf(Object object0) {
                return object0 instanceof ULong ? this.indexOf-VKZWuLQ(((ULong)object0).unbox-impl()) : -1;
            }

            public int indexOf-VKZWuLQ(long v) {
                return ArraysKt___ArraysKt.indexOf(arr_v, v);
            }

            @Override  // kotlin.collections.AbstractCollection
            public boolean isEmpty() {
                return ULongArray.isEmpty-impl(arr_v);
            }

            @Override  // kotlin.collections.AbstractList
            public final int lastIndexOf(Object object0) {
                return object0 instanceof ULong ? this.lastIndexOf-VKZWuLQ(((ULong)object0).unbox-impl()) : -1;
            }

            public int lastIndexOf-VKZWuLQ(long v) {
                return ArraysKt___ArraysKt.lastIndexOf(arr_v, v);
            }
        };
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final List asList-rL5Bavg(@NotNull short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$asList");
        return new RandomAccess() {
            @Override  // kotlin.collections.AbstractCollection
            public final boolean contains(Object object0) {
                return object0 instanceof UShort ? this.contains-xj2QHRw(((UShort)object0).unbox-impl()) : false;
            }

            public boolean contains-xj2QHRw(short v) {
                return UShortArray.contains-xj2QHRw(arr_v, v);
            }

            @Override  // kotlin.collections.AbstractList
            public Object get(int v) {
                return UShort.box-impl(this.get-Mh2AYeg(v));
            }

            public short get-Mh2AYeg(int v) {
                return UShortArray.get-Mh2AYeg(arr_v, v);
            }

            @Override  // kotlin.collections.AbstractList
            public int getSize() {
                return UShortArray.getSize-impl(arr_v);
            }

            @Override  // kotlin.collections.AbstractList
            public final int indexOf(Object object0) {
                return object0 instanceof UShort ? this.indexOf-xj2QHRw(((UShort)object0).unbox-impl()) : -1;
            }

            public int indexOf-xj2QHRw(short v) {
                return ArraysKt___ArraysKt.indexOf(arr_v, v);
            }

            @Override  // kotlin.collections.AbstractCollection
            public boolean isEmpty() {
                return UShortArray.isEmpty-impl(arr_v);
            }

            @Override  // kotlin.collections.AbstractList
            public final int lastIndexOf(Object object0) {
                return object0 instanceof UShort ? this.lastIndexOf-xj2QHRw(((UShort)object0).unbox-impl()) : -1;
            }

            public int lastIndexOf-xj2QHRw(short v) {
                return ArraysKt___ArraysKt.lastIndexOf(arr_v, v);
            }
        };
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    public static final int binarySearch-2fe2U9s(@NotNull int[] arr_v, int v, int v1, int v2) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$binarySearch");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(v1, v2, UIntArray.getSize-impl(arr_v));
        int v3 = v2 - 1;
        while(v1 <= v3) {
            int v4 = v1 + v3 >>> 1;
            int v5 = UnsignedKt.uintCompare(arr_v[v4], v);
            if(v5 < 0) {
                v1 = v4 + 1;
                continue;
            }
            if(v5 > 0) {
                v3 = v4 - 1;
                continue;
            }
            return v4;
        }
        return -(v1 + 1);
    }

    public static int binarySearch-2fe2U9s$default(int[] arr_v, int v, int v1, int v2, int v3, Object object0) {
        if((v3 & 2) != 0) {
            v1 = 0;
        }
        if((v3 & 4) != 0) {
            v2 = UIntArray.getSize-impl(arr_v);
        }
        return UArraysKt___UArraysJvmKt.binarySearch-2fe2U9s(arr_v, v, v1, v2);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    public static final int binarySearch-EtDCXyQ(@NotNull short[] arr_v, short v, int v1, int v2) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$binarySearch");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(v1, v2, UShortArray.getSize-impl(arr_v));
        int v3 = v2 - 1;
        while(v1 <= v3) {
            int v4 = v1 + v3 >>> 1;
            int v5 = UnsignedKt.uintCompare(arr_v[v4], v & 0xFFFF);
            if(v5 < 0) {
                v1 = v4 + 1;
                continue;
            }
            if(v5 > 0) {
                v3 = v4 - 1;
                continue;
            }
            return v4;
        }
        return -(v1 + 1);
    }

    public static int binarySearch-EtDCXyQ$default(short[] arr_v, short v, int v1, int v2, int v3, Object object0) {
        if((v3 & 2) != 0) {
            v1 = 0;
        }
        if((v3 & 4) != 0) {
            v2 = UShortArray.getSize-impl(arr_v);
        }
        return UArraysKt___UArraysJvmKt.binarySearch-EtDCXyQ(arr_v, v, v1, v2);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    public static final int binarySearch-K6DWlUc(@NotNull long[] arr_v, long v, int v1, int v2) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$binarySearch");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(v1, v2, ULongArray.getSize-impl(arr_v));
        int v3 = v2 - 1;
        while(v1 <= v3) {
            int v4 = v1 + v3 >>> 1;
            int v5 = UnsignedKt.ulongCompare(arr_v[v4], v);
            if(v5 < 0) {
                v1 = v4 + 1;
                continue;
            }
            if(v5 > 0) {
                v3 = v4 - 1;
                continue;
            }
            return v4;
        }
        return -(v1 + 1);
    }

    public static int binarySearch-K6DWlUc$default(long[] arr_v, long v, int v1, int v2, int v3, Object object0) {
        if((v3 & 2) != 0) {
            v1 = 0;
        }
        if((v3 & 4) != 0) {
            v2 = ULongArray.getSize-impl(arr_v);
        }
        return UArraysKt___UArraysJvmKt.binarySearch-K6DWlUc(arr_v, v, v1, v2);
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    public static final int binarySearch-WpHrYlw(@NotNull byte[] arr_b, byte b, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_b, "$this$binarySearch");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(v, v1, UByteArray.getSize-impl(arr_b));
        int v2 = v1 - 1;
        while(v <= v2) {
            int v3 = v + v2 >>> 1;
            int v4 = UnsignedKt.uintCompare(arr_b[v3], b & 0xFF);
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

    public static int binarySearch-WpHrYlw$default(byte[] arr_b, byte b, int v, int v1, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v = 0;
        }
        if((v2 & 4) != 0) {
            v1 = UByteArray.getSize-impl(arr_b);
        }
        return UArraysKt___UArraysJvmKt.binarySearch-WpHrYlw(arr_b, b, v, v1);
    }

    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    public static final UInt max--ajY-9A(int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$max");
        return a.maxOrNull--ajY-9A(arr_v);
    }

    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    public static final UByte max-GBYM_sE(byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "$this$max");
        return a.maxOrNull-GBYM_sE(arr_b);
    }

    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    public static final ULong max-QwZRm1k(long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$max");
        return a.maxOrNull-QwZRm1k(arr_v);
    }

    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    public static final UShort max-rL5Bavg(short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$max");
        return a.maxOrNull-rL5Bavg(arr_v);
    }

    @Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    public static final UByte maxWith-XMRcp5o(byte[] arr_b, Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_b, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        return a.maxWithOrNull-XMRcp5o(arr_b, comparator0);
    }

    @Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    public static final UInt maxWith-YmdZ_VM(int[] arr_v, Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        return a.maxWithOrNull-YmdZ_VM(arr_v, comparator0);
    }

    @Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    public static final UShort maxWith-eOHTfZs(short[] arr_v, Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        return a.maxWithOrNull-eOHTfZs(arr_v, comparator0);
    }

    @Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    public static final ULong maxWith-zrEWJaI(long[] arr_v, Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        return a.maxWithOrNull-zrEWJaI(arr_v, comparator0);
    }

    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    public static final UInt min--ajY-9A(int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$min");
        return a.minOrNull--ajY-9A(arr_v);
    }

    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    public static final UByte min-GBYM_sE(byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "$this$min");
        return a.minOrNull-GBYM_sE(arr_b);
    }

    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    public static final ULong min-QwZRm1k(long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$min");
        return a.minOrNull-QwZRm1k(arr_v);
    }

    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    public static final UShort min-rL5Bavg(short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$min");
        return a.minOrNull-rL5Bavg(arr_v);
    }

    @Deprecated(message = "Use minWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    public static final UByte minWith-XMRcp5o(byte[] arr_b, Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_b, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        return a.minWithOrNull-XMRcp5o(arr_b, comparator0);
    }

    @Deprecated(message = "Use minWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    public static final UInt minWith-YmdZ_VM(int[] arr_v, Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        return a.minWithOrNull-YmdZ_VM(arr_v, comparator0);
    }

    @Deprecated(message = "Use minWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    public static final UShort minWith-eOHTfZs(short[] arr_v, Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        return a.minWithOrNull-eOHTfZs(arr_v, comparator0);
    }

    @Deprecated(message = "Use minWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    public static final ULong minWith-zrEWJaI(long[] arr_v, Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        return a.minWithOrNull-zrEWJaI(arr_v, comparator0);
    }
}

