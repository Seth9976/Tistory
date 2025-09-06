package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.b;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u000F\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000E\n\u0002\b\u0015\n\u0002\u0010\u000B\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u000E\b\u0081@\u0018\u0000 T2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001TB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0004\u0010\u0007B\u000F\u0012\u0006\u0010\t\u001A\u00020\b\u00A2\u0006\u0004\b\u0004\u0010\nJ\r\u0010\u000E\u001A\u00020\u000B\u00A2\u0006\u0004\b\f\u0010\rJ\r\u0010\u0010\u001A\u00020\b\u00A2\u0006\u0004\b\u000F\u0010\nJ\r\u0010\u0014\u001A\u00020\u0011\u00A2\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0018\u001A\u00020\u0015\u00A2\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u001B\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\r\u0010\u001E\u001A\u00020\u0006\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\r\u0010 \u001A\u00020\u0011\u00A2\u0006\u0004\b\u001F\u0010\u0013J\r\u0010\"\u001A\u00020\u0011\u00A2\u0006\u0004\b!\u0010\u0013J\u000F\u0010&\u001A\u00020#H\u0016\u00A2\u0006\u0004\b$\u0010%J\u001B\u0010*\u001A\u00020\u00112\u0006\u0010\'\u001A\u00020\u0000H\u0096\u0002\u00F8\u0001\u0000\u00A2\u0006\u0004\b(\u0010)J\u0018\u0010.\u001A\u00020\u00002\u0006\u0010+\u001A\u00020\u0000\u00F8\u0001\u0000\u00A2\u0006\u0004\b,\u0010-J\u0013\u00100\u001A\u00020\u0000\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b/\u0010\nJ\u0013\u00102\u001A\u00020\u0000\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b1\u0010\nJ\u0013\u00104\u001A\u00020\u0000\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b3\u0010\nJ\u0013\u00106\u001A\u00020\u0000\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b5\u0010\nJ\u0013\u00108\u001A\u00020\u0000\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b7\u0010\nJ\r\u0010<\u001A\u000209\u00A2\u0006\u0004\b:\u0010;J\r\u0010>\u001A\u000209\u00A2\u0006\u0004\b=\u0010;J\r\u0010@\u001A\u000209\u00A2\u0006\u0004\b?\u0010;J\r\u0010B\u001A\u000209\u00A2\u0006\u0004\bA\u0010;J\r\u0010D\u001A\u00020#\u00A2\u0006\u0004\bC\u0010%J\u0010\u0010F\u001A\u00020\u0011H\u00D6\u0001\u00A2\u0006\u0004\bE\u0010\u0013J\u001A\u0010J\u001A\u0002092\b\u0010\'\u001A\u0004\u0018\u00010GH\u00D6\u0003\u00A2\u0006\u0004\bH\u0010IR\u0017\u0010\t\u001A\u00020\b8\u0006\u00A2\u0006\f\n\u0004\bK\u0010L\u001A\u0004\bM\u0010NR\u0017\u0010+\u001A\u00020\u00008F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\bO\u0010\nR\u0011\u0010Q\u001A\u00020\u00118F\u00A2\u0006\u0006\u001A\u0004\bP\u0010\u0013R\u0011\u0010S\u001A\u00020\u00118F\u00A2\u0006\u0006\u001A\u0004\bR\u0010\u0013\u0088\u0001\t\u0092\u0001\u00020\b\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006U"}, d2 = {"Landroidx/compose/ui/graphics/Float16;", "", "", "value", "constructor-impl", "(F)S", "", "(D)S", "", "halfValue", "(S)S", "", "toByte-impl", "(S)B", "toByte", "toShort-impl", "toShort", "", "toInt-impl", "(S)I", "toInt", "", "toLong-impl", "(S)J", "toLong", "toFloat-impl", "(S)F", "toFloat", "toDouble-impl", "(S)D", "toDouble", "toBits-impl", "toBits", "toRawBits-impl", "toRawBits", "", "toString-impl", "(S)Ljava/lang/String;", "toString", "other", "compareTo-41bOqos", "(SS)I", "compareTo", "sign", "withSign-qCeQghg", "(SS)S", "withSign", "absoluteValue-slo4al4", "absoluteValue", "round-slo4al4", "round", "ceil-slo4al4", "ceil", "floor-slo4al4", "floor", "trunc-slo4al4", "trunc", "", "isNaN-impl", "(S)Z", "isNaN", "isInfinite-impl", "isInfinite", "isFinite-impl", "isFinite", "isNormalized-impl", "isNormalized", "toHexString-impl", "toHexString", "hashCode-impl", "hashCode", "", "equals-impl", "(SLjava/lang/Object;)Z", "equals", "a", "S", "getHalfValue", "()S", "getSign-slo4al4", "getExponent-impl", "exponent", "getSignificand-impl", "significand", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@JvmInline
@SourceDebugExtension({"SMAP\nFloat16.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Float16.kt\nandroidx/compose/ui/graphics/Float16\n+ 2 Float16.kt\nandroidx/compose/ui/graphics/Float16Kt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,716:1\n604#2,38:717\n649#2,12:755\n661#2,17:768\n591#2,4:785\n22#3:767\n*S KotlinDebug\n*F\n+ 1 Float16.kt\nandroidx/compose/ui/graphics/Float16\n*L\n97#1:717,38\n150#1:755,12\n150#1:768,17\n216#1:785,4\n150#1:767\n*E\n"})
public final class Float16 implements Comparable {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001D\u0010\u0003\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u001D\u0010\u0007\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001A\u0004\b\b\u0010\u0006R\u001D\u0010\t\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0004\u001A\u0004\b\n\u0010\u0006R\u001D\u0010\u000B\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000B\u0010\u0004\u001A\u0004\b\f\u0010\u0006R\u001D\u0010\r\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u0004\u001A\u0004\b\u000E\u0010\u0006R\u001D\u0010\u000F\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000F\u0010\u0004\u001A\u0004\b\u0010\u0010\u0006R\u001D\u0010\u0011\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001A\u0004\b\u0012\u0010\u0006R\u001D\u0010\u0013\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001A\u0004\b\u0014\u0010\u0006R\u001D\u0010\u0015\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0015\u0010\u0004\u001A\u0004\b\u0016\u0010\u0006R\u001D\u0010\u0017\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001A\u0004\b\u0018\u0010\u0006R\u0014\u0010\u001A\u001A\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001A\u0010\u001BR\u0014\u0010\u001C\u001A\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001C\u0010\u001BR\u0014\u0010\u001D\u001A\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001D\u0010\u001B\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u001E"}, d2 = {"Landroidx/compose/ui/graphics/Float16$Companion;", "", "Landroidx/compose/ui/graphics/Float16;", "Epsilon", "S", "getEpsilon-slo4al4", "()S", "LowestValue", "getLowestValue-slo4al4", "MaxValue", "getMaxValue-slo4al4", "MinNormal", "getMinNormal-slo4al4", "MinValue", "getMinValue-slo4al4", "NaN", "getNaN-slo4al4", "NegativeInfinity", "getNegativeInfinity-slo4al4", "NegativeZero", "getNegativeZero-slo4al4", "PositiveInfinity", "getPositiveInfinity-slo4al4", "PositiveZero", "getPositiveZero-slo4al4", "", "MaxExponent", "I", "MinExponent", "Size", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        // 去混淆评级： 低(20)
        public final short getEpsilon-slo4al4() {
            return 0x1400;
        }

        // 去混淆评级： 低(20)
        public final short getLowestValue-slo4al4() {
            return 0xFFFFFBFF;
        }

        // 去混淆评级： 低(20)
        public final short getMaxValue-slo4al4() {
            return 0x7BFF;
        }

        // 去混淆评级： 低(20)
        public final short getMinNormal-slo4al4() {
            return 0x400;
        }

        // 去混淆评级： 低(20)
        public final short getMinValue-slo4al4() {
            return 1;
        }

        // 去混淆评级： 低(20)
        public final short getNaN-slo4al4() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final short getNegativeInfinity-slo4al4() {
            return 0xFFFFFC00;
        }

        // 去混淆评级： 低(20)
        public final short getNegativeZero-slo4al4() {
            return 0xFFFF8000;
        }

        // 去混淆评级： 低(20)
        public final short getPositiveInfinity-slo4al4() {
            return 0x7C00;
        }

        // 去混淆评级： 低(20)
        public final short getPositiveZero-slo4al4() {
            return 0;
        }
    }

    @NotNull
    public static final Companion Companion = null;
    public static final int MaxExponent = 15;
    public static final int MinExponent = -14;
    public static final int Size = 16;
    public final short a;
    public static final short b;
    public static final short c;
    public static final short d;
    public static final short e;
    public static final short f;
    public static final short g;
    public static final short h;
    public static final short i;
    public static final short j;
    public static final short k;

    static {
        Float16.Companion = new Companion(null);
        Float16.b = 0x1400;
        Float16.c = (short)0xFBFF;
        Float16.d = 0x7BFF;
        Float16.e = 0x400;
        Float16.f = 1;
        Float16.g = 0x7E00;
        Float16.h = (short)0xFC00;
        Float16.i = (short)0x8000;
        Float16.j = 0x7C00;
        Float16.k = 0;
    }

    public Float16(short v) {
        this.a = v;
    }

    public static final short absoluteValue-slo4al4(short v) {
        return (short)(v & 0x7FFF);
    }

    public static final short access$getEpsilon$cp() [...] // 潜在的解密器

    public static final short access$getLowestValue$cp() [...] // 潜在的解密器

    public static final short access$getMaxValue$cp() [...] // 潜在的解密器

    public static final short access$getMinNormal$cp() [...] // 潜在的解密器

    public static final short access$getMinValue$cp() [...] // 潜在的解密器

    public static final short access$getNaN$cp() [...] // 潜在的解密器

    public static final short access$getNegativeInfinity$cp() [...] // 潜在的解密器

    public static final short access$getNegativeZero$cp() [...] // 潜在的解密器

    public static final short access$getPositiveInfinity$cp() [...] // 潜在的解密器

    public static final short access$getPositiveZero$cp() [...] // 潜在的解密器

    public static final Float16 box-impl(short v) {
        return new Float16(v);
    }

    public static final short ceil-slo4al4(short v) {
        int v1 = 0xFFFF & v;
        int v2 = 1;
        if((v & 0x7FFF) < 0x3C00) {
            if((v & 0x7FFF) == 0) {
                v2 = 0;
            }
            return (short)(-(~(v1 >> 15) & v2) & 0x3C00 | v & 0x8000);
        }
        if((v & 0x7FFF) < 0x6400) {
            int v3 = (1 << 25 - ((v & 0x7FFF) >> 10)) - 1;
            v1 = v1 + ((v1 >> 15) - 1 & v3) & ~v3;
        }
        return (short)v1;
    }

    @Override
    public int compareTo(Object object0) {
        return this.compareTo-41bOqos(((Float16)object0).unbox-impl());
    }

    public static int compareTo-41bOqos(short v, short v1) {
        if(Float16.isNaN-impl(v)) {
            return !Float16.isNaN-impl(v1);
        }
        if(Float16.isNaN-impl(v1)) {
            return -1;
        }
        int v2 = (v & 0x8000) == 0 ? v & 0xFFFF : 0x8000 - (v & 0xFFFF);
        return (v1 & 0x8000) == 0 ? Intrinsics.compare(v2, v1 & 0xFFFF) : Intrinsics.compare(v2, 0x8000 - (v1 & 0xFFFF));
    }

    public int compareTo-41bOqos(short v) {
        return Float16.compareTo-41bOqos(this.a, v);
    }

    public static short constructor-impl(double f) {
        return Float16.constructor-impl(((float)f));
    }

    public static short constructor-impl(float f) [...] // 潜在的解密器

    public static short constructor-impl(short v) [...] // Inlined contents

    @Override
    public boolean equals(Object object0) {
        return Float16.equals-impl(this.a, object0);
    }

    public static boolean equals-impl(short v, Object object0) {
        return object0 instanceof Float16 ? v == ((Float16)object0).unbox-impl() : false;
    }

    public static final boolean equals-impl0(short v, short v1) {
        return v == v1;
    }

    public static final short floor-slo4al4(short v) {
        int v1 = 0xFFFF;
        int v2 = v & 0xFFFF;
        if((v & 0x7FFF) < 0x3C00) {
            if(v2 <= 0x8000) {
                v1 = 0;
            }
            return (short)(v & 0x8000 | v1 & 0x3C00);
        }
        if((v & 0x7FFF) < 0x6400) {
            int v3 = (1 << 25 - ((v & 0x7FFF) >> 10)) - 1;
            v2 = v2 + (-(v2 >> 15) & v3) & ~v3;
        }
        return (short)v2;
    }

    public static final int getExponent-impl(short v) {
        return (v >>> 10 & 0x1F) - 15;
    }

    public final short getHalfValue() {
        return this.a;
    }

    public static final short getSign-slo4al4(short v) {
        if(Float16.isNaN-impl(v)) {
            return Float16.g;
        }
        if(Float16.compareTo-41bOqos(v, Float16.i) < 0) {
            return (short)0xBC00;
        }
        return Float16.compareTo-41bOqos(v, Float16.k) <= 0 ? v : 0x3C00;
    }

    public static final int getSignificand-impl(short v) {
        return v & 0x3FF;
    }

    @Override
    public int hashCode() {
        return Float16.hashCode-impl(this.a);
    }

    public static int hashCode-impl(short v) {
        return Short.hashCode(v);
    }

    public static final boolean isFinite-impl(short v) {
        return (v & 0x7FFF) != 0x7C00;
    }

    public static final boolean isInfinite-impl(short v) {
        return (v & 0x7FFF) == 0x7C00;
    }

    public static final boolean isNaN-impl(short v) {
        return (v & 0x7FFF) > 0x7C00;
    }

    public static final boolean isNormalized-impl(short v) {
        return (v & 0x7C00) != 0 && (v & 0x7C00) != 0x7C00;
    }

    public static final short round-slo4al4(short v) {
        int v1 = 0xFFFF;
        int v2 = v & 0xFFFF;
        if((v & 0x7FFF) < 0x3C00) {
            if((v & 0x7FFF) < 0x3800) {
                v1 = 0;
            }
            return (short)(v & 0x8000 | v1 & 0x3C00);
        }
        if((v & 0x7FFF) < 0x6400) {
            int v3 = (v & 0x7FFF) >> 10;
            v2 = v2 + (1 << 24 - v3) & ~((1 << 25 - v3) - 1);
        }
        return (short)v2;
    }

    public static final int toBits-impl(short v) {
        return Float16.isNaN-impl(v) ? Float16.g : v & 0xFFFF;
    }

    public static final byte toByte-impl(short v) {
        return (byte)(((int)Float16.toFloat-impl(v)));
    }

    public static final double toDouble-impl(short v) {
        return (double)Float16.toFloat-impl(v);
    }

    public static final float toFloat-impl(short v) {
        int v1 = (0xFFFF & v) >>> 10 & 0x1F;
        if(v1 == 0) {
            if((v & 0x3FF) != 0) {
                float f = Float.intBitsToFloat((v & 0x3FF) + 0x3F000000) - 0.5f;
                return (0x8000 & v) == 0 ? f : -f;
            }
            return Float.intBitsToFloat((0x8000 & v) << 16);
        }
        int v2 = (v & 0x3FF) << 13;
        if(v1 == 0x1F) {
            if(v2 != 0) {
                v2 |= 0x400000;
            }
            return Float.intBitsToFloat(0x7F800000 | (0x8000 & v) << 16 | v2);
        }
        return Float.intBitsToFloat(v1 + 0x70 << 23 | (0x8000 & v) << 16 | v2);
    }

    @NotNull
    public static final String toHexString-impl(short v) {
        StringBuilder stringBuilder0 = new StringBuilder();
        int v1 = (0xFFFF & v) >>> 15;
        int v2 = (0xFFFF & v) >>> 10 & 0x1F;
        if(v2 == 0x1F) {
            if((v & 0x3FF) == 0) {
                if(v1 != 0) {
                    stringBuilder0.append('-');
                }
                stringBuilder0.append("Infinity");
                return stringBuilder0.toString();
            }
            stringBuilder0.append("NaN");
            return stringBuilder0.toString();
        }
        if(v1 == 1) {
            stringBuilder0.append('-');
        }
        if(v2 == 0) {
            if((v & 0x3FF) == 0) {
                stringBuilder0.append("0x0.0p0");
                return stringBuilder0.toString();
            }
            stringBuilder0.append("0x0.");
            String s = Integer.toString(v & 0x3FF, b.checkRadix(16));
            Intrinsics.checkNotNullExpressionValue(s, "toString(this, checkRadix(radix))");
            stringBuilder0.append(new Regex("0{2,}$").replaceFirst(s, ""));
            stringBuilder0.append("p-14");
            return stringBuilder0.toString();
        }
        stringBuilder0.append("0x1.");
        String s1 = Integer.toString(v & 0x3FF, b.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(s1, "toString(this, checkRadix(radix))");
        stringBuilder0.append(new Regex("0{2,}$").replaceFirst(s1, ""));
        stringBuilder0.append('p');
        stringBuilder0.append(String.valueOf(v2 - 15));
        return stringBuilder0.toString();
    }

    public static final int toInt-impl(short v) {
        return (int)Float16.toFloat-impl(v);
    }

    public static final long toLong-impl(short v) {
        return (long)Float16.toFloat-impl(v);
    }

    public static final int toRawBits-impl(short v) {
        return v & 0xFFFF;
    }

    public static final short toShort-impl(short v) {
        return (short)(((int)Float16.toFloat-impl(v)));
    }

    @Override
    @NotNull
    public String toString() {
        return Float16.toString-impl(this.a);
    }

    @NotNull
    public static String toString-impl(short v) {
        return String.valueOf(Float16.toFloat-impl(v));
    }

    public static final short trunc-slo4al4(short v) {
        int v1 = 0xFFFF & v;
        if((v & 0x7FFF) < 0x3C00) {
            return (short)(0x8000 & v);
        }
        if((v & 0x7FFF) < 0x6400) {
            v1 &= ~((1 << 25 - ((v & 0x7FFF) >> 10)) - 1);
        }
        return (short)v1;
    }

    public final short unbox-impl() {
        return this.a;
    }

    public static final short withSign-qCeQghg(short v, short v1) {
        return (short)(v & 0x7FFF | v1 & 0x8000);
    }
}

