package kotlin.text;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.UnsignedKt;
import kotlin.WasExperimental;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000E\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\u001A\u001B\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u0004H\u0007\u00A2\u0006\u0004\b\u0005\u0010\u0006\u001A\u001B\u0010\u0000\u001A\u00020\u0001*\u00020\u00072\u0006\u0010\u0003\u001A\u00020\u0004H\u0007\u00A2\u0006\u0004\b\b\u0010\t\u001A\u001B\u0010\u0000\u001A\u00020\u0001*\u00020\n2\u0006\u0010\u0003\u001A\u00020\u0004H\u0007\u00A2\u0006\u0004\b\u000B\u0010\f\u001A\u001B\u0010\u0000\u001A\u00020\u0001*\u00020\r2\u0006\u0010\u0003\u001A\u00020\u0004H\u0007\u00A2\u0006\u0004\b\u000E\u0010\u000F\u001A\u0011\u0010\u0010\u001A\u00020\u0002*\u00020\u0001H\u0007\u00A2\u0006\u0002\u0010\u0011\u001A\u0019\u0010\u0010\u001A\u00020\u0002*\u00020\u00012\u0006\u0010\u0003\u001A\u00020\u0004H\u0007\u00A2\u0006\u0002\u0010\u0012\u001A\u000E\u0010\u0013\u001A\u0004\u0018\u00010\u0002*\u00020\u0001H\u0007\u001A\u0016\u0010\u0013\u001A\u0004\u0018\u00010\u0002*\u00020\u00012\u0006\u0010\u0003\u001A\u00020\u0004H\u0007\u001A\u0011\u0010\u0014\u001A\u00020\u0007*\u00020\u0001H\u0007\u00A2\u0006\u0002\u0010\u0015\u001A\u0019\u0010\u0014\u001A\u00020\u0007*\u00020\u00012\u0006\u0010\u0003\u001A\u00020\u0004H\u0007\u00A2\u0006\u0002\u0010\u0016\u001A\u000E\u0010\u0017\u001A\u0004\u0018\u00010\u0007*\u00020\u0001H\u0007\u001A\u0016\u0010\u0017\u001A\u0004\u0018\u00010\u0007*\u00020\u00012\u0006\u0010\u0003\u001A\u00020\u0004H\u0007\u001A\u0011\u0010\u0018\u001A\u00020\n*\u00020\u0001H\u0007\u00A2\u0006\u0002\u0010\u0019\u001A\u0019\u0010\u0018\u001A\u00020\n*\u00020\u00012\u0006\u0010\u0003\u001A\u00020\u0004H\u0007\u00A2\u0006\u0002\u0010\u001A\u001A\u000E\u0010\u001B\u001A\u0004\u0018\u00010\n*\u00020\u0001H\u0007\u001A\u0016\u0010\u001B\u001A\u0004\u0018\u00010\n*\u00020\u00012\u0006\u0010\u0003\u001A\u00020\u0004H\u0007\u001A\u0011\u0010\u001C\u001A\u00020\r*\u00020\u0001H\u0007\u00A2\u0006\u0002\u0010\u001D\u001A\u0019\u0010\u001C\u001A\u00020\r*\u00020\u00012\u0006\u0010\u0003\u001A\u00020\u0004H\u0007\u00A2\u0006\u0002\u0010\u001E\u001A\u000E\u0010\u001F\u001A\u0004\u0018\u00010\r*\u00020\u0001H\u0007\u001A\u0016\u0010\u001F\u001A\u0004\u0018\u00010\r*\u00020\u00012\u0006\u0010\u0003\u001A\u00020\u0004H\u0007\u00A8\u0006 "}, d2 = {"toString", "", "Lkotlin/UByte;", "radix", "", "toString-LxnNnR4", "(BI)Ljava/lang/String;", "Lkotlin/UInt;", "toString-V7xB4Y4", "(II)Ljava/lang/String;", "Lkotlin/ULong;", "toString-JSWoG40", "(JI)Ljava/lang/String;", "Lkotlin/UShort;", "toString-olVBNx4", "(SI)Ljava/lang/String;", "toUByte", "(Ljava/lang/String;)B", "(Ljava/lang/String;I)B", "toUByteOrNull", "toUInt", "(Ljava/lang/String;)I", "(Ljava/lang/String;I)I", "toUIntOrNull", "toULong", "(Ljava/lang/String;)J", "(Ljava/lang/String;I)J", "toULongOrNull", "toUShort", "(Ljava/lang/String;)S", "(Ljava/lang/String;I)S", "toUShortOrNull", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@JvmName(name = "UStringsKt")
public final class UStringsKt {
    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @NotNull
    public static final String toString-JSWoG40(long v, int v1) {
        return UnsignedKt.ulongToString(v, b.checkRadix(v1));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @NotNull
    public static final String toString-LxnNnR4(byte b, int v) {
        String s = Integer.toString(b & 0xFF, b.checkRadix(v));
        Intrinsics.checkNotNullExpressionValue(s, "toString(...)");
        return s;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @NotNull
    public static final String toString-V7xB4Y4(int v, int v1) {
        String s = Long.toString(((long)v) & 0xFFFFFFFFL, b.checkRadix(v1));
        Intrinsics.checkNotNullExpressionValue(s, "toString(...)");
        return s;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @NotNull
    public static final String toString-olVBNx4(short v, int v1) {
        String s = Integer.toString(v & 0xFFFF, b.checkRadix(v1));
        Intrinsics.checkNotNullExpressionValue(s, "toString(...)");
        return s;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final byte toUByte(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        UByte uByte0 = UStringsKt.toUByteOrNull(s);
        if(uByte0 != null) {
            return uByte0.unbox-impl();
        }
        o.numberFormatError(s);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final byte toUByte(@NotNull String s, int v) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        UByte uByte0 = UStringsKt.toUByteOrNull(s, v);
        if(uByte0 != null) {
            return uByte0.unbox-impl();
        }
        o.numberFormatError(s);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @Nullable
    public static final UByte toUByteOrNull(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        return UStringsKt.toUByteOrNull(s, 10);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @Nullable
    public static final UByte toUByteOrNull(@NotNull String s, int v) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        UInt uInt0 = UStringsKt.toUIntOrNull(s, v);
        if(uInt0 != null) {
            int v1 = uInt0.unbox-impl();
            return Integer.compareUnsigned(v1, 0xFF) <= 0 ? UByte.box-impl(((byte)v1)) : null;
        }
        return null;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final int toUInt(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        UInt uInt0 = UStringsKt.toUIntOrNull(s);
        if(uInt0 != null) {
            return uInt0.unbox-impl();
        }
        o.numberFormatError(s);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final int toUInt(@NotNull String s, int v) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        UInt uInt0 = UStringsKt.toUIntOrNull(s, v);
        if(uInt0 != null) {
            return uInt0.unbox-impl();
        }
        o.numberFormatError(s);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @Nullable
    public static final UInt toUIntOrNull(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        return UStringsKt.toUIntOrNull(s, 10);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @Nullable
    public static final UInt toUIntOrNull(@NotNull String s, int v) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        b.checkRadix(v);
        int v1 = s.length();
        if(v1 == 0) {
            return null;
        }
        int v2 = 1;
        int v3 = 0;
        int v4 = s.charAt(0);
        if(Intrinsics.compare(v4, 0x30) >= 0) {
            v2 = 0;
        }
        else if(v1 == 1 || v4 != 43) {
            return null;
        }
        int v5 = 119304647;
        while(v2 < v1) {
            int v6 = b.digitOf(s.charAt(v2), v);
            if(v6 < 0) {
                return null;
            }
            if(Integer.compareUnsigned(v3, v5) > 0) {
                if(v5 == 119304647) {
                    v5 = Integer.divideUnsigned(-1, v);
                    if(Integer.compareUnsigned(v3, v5) > 0) {
                        return null;
                    }
                    goto label_22;
                }
                return null;
            }
        label_22:
            int v7 = v3 * v;
            int v8 = v6 + v7;
            if(Integer.compareUnsigned(v8, v7) < 0) {
                return null;
            }
            ++v2;
            v3 = v8;
        }
        return UInt.box-impl(v3);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final long toULong(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        ULong uLong0 = UStringsKt.toULongOrNull(s);
        if(uLong0 != null) {
            return uLong0.unbox-impl();
        }
        o.numberFormatError(s);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final long toULong(@NotNull String s, int v) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        ULong uLong0 = UStringsKt.toULongOrNull(s, v);
        if(uLong0 != null) {
            return uLong0.unbox-impl();
        }
        o.numberFormatError(s);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @Nullable
    public static final ULong toULongOrNull(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        return UStringsKt.toULongOrNull(s, 10);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @Nullable
    public static final ULong toULongOrNull(@NotNull String s, int v) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        b.checkRadix(v);
        int v1 = s.length();
        if(v1 == 0) {
            return null;
        }
        int v2 = 0;
        int v3 = s.charAt(0);
        if(Intrinsics.compare(v3, 0x30) < 0 && (v1 == 1 || v3 != 43)) {
            return null;
        }
        long v4 = 0L;
        long v5 = 512409557603043100L;
        while(v2 < v1) {
            int v6 = b.digitOf(s.charAt(v2), v);
            if(v6 < 0) {
                return null;
            }
            if(Long.compareUnsigned(v4, v5) > 0) {
                if(v5 == 512409557603043100L) {
                    v5 = Long.divideUnsigned(-1L, v);
                    if(Long.compareUnsigned(v4, v5) > 0) {
                        return null;
                    }
                    goto label_20;
                }
                return null;
            }
        label_20:
            long v7 = v4 * ((long)v);
            long v8 = (((long)v6) & 0xFFFFFFFFL) + v7;
            if(Long.compareUnsigned(v8, v7) < 0) {
                return null;
            }
            ++v2;
            v4 = v8;
        }
        return ULong.box-impl(v4);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final short toUShort(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        UShort uShort0 = UStringsKt.toUShortOrNull(s);
        if(uShort0 != null) {
            return uShort0.unbox-impl();
        }
        o.numberFormatError(s);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final short toUShort(@NotNull String s, int v) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        UShort uShort0 = UStringsKt.toUShortOrNull(s, v);
        if(uShort0 != null) {
            return uShort0.unbox-impl();
        }
        o.numberFormatError(s);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @Nullable
    public static final UShort toUShortOrNull(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        return UStringsKt.toUShortOrNull(s, 10);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @Nullable
    public static final UShort toUShortOrNull(@NotNull String s, int v) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        UInt uInt0 = UStringsKt.toUIntOrNull(s, v);
        if(uInt0 != null) {
            int v1 = uInt0.unbox-impl();
            return Integer.compareUnsigned(v1, 0xFFFF) <= 0 ? UShort.box-impl(((short)v1)) : null;
        }
        return null;
    }
}

