package androidx.compose.ui.geometry;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Immutable
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000B\n\u0002\b\u0017\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\b\u0087@\u0018\u0000 92\u00020\u0001:\u00019B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001A\u00020\u0006H\u0087\n\u00A2\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000B\u001A\u00020\u0006H\u0087\n\u00A2\u0006\u0004\b\n\u0010\bJ\'\u0010\u0010\u001A\u00020\u00002\b\b\u0002\u0010\f\u001A\u00020\u00062\b\b\u0002\u0010\r\u001A\u00020\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0014\u001A\u00020\u0011H\u0007\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u000F\u0010\u0016\u001A\u00020\u0006H\u0007\u00A2\u0006\u0004\b\u0015\u0010\bJ\u000F\u0010\u0018\u001A\u00020\u0006H\u0007\u00A2\u0006\u0004\b\u0017\u0010\bJ\u0016\u0010\u001A\u001A\u00020\u0000H\u0087\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u0019\u0010\u0005J\u001B\u0010\u001E\u001A\u00020\u00002\u0006\u0010\u001B\u001A\u00020\u0000H\u0087\u0002\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u001B\u0010 \u001A\u00020\u00002\u0006\u0010\u001B\u001A\u00020\u0000H\u0087\u0002\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u001F\u0010\u001DJ\u001E\u0010$\u001A\u00020\u00002\u0006\u0010!\u001A\u00020\u0006H\u0087\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\"\u0010#J\u001E\u0010&\u001A\u00020\u00002\u0006\u0010!\u001A\u00020\u0006H\u0087\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b%\u0010#J\u001E\u0010(\u001A\u00020\u00002\u0006\u0010!\u001A\u00020\u0006H\u0087\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\'\u0010#J\u000F\u0010,\u001A\u00020)H\u0016\u00A2\u0006\u0004\b*\u0010+J\u0010\u00100\u001A\u00020-H\u00D6\u0001\u00A2\u0006\u0004\b.\u0010/J\u001A\u00103\u001A\u00020\u00112\b\u0010\u001B\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b1\u00102R\u001A\u0010\f\u001A\u00020\u00068FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b5\u00106\u001A\u0004\b4\u0010\bR\u001A\u0010\r\u001A\u00020\u00068FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b8\u00106\u001A\u0004\b7\u0010\b\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u000B\n\u0002\b!\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006:"}, d2 = {"Landroidx/compose/ui/geometry/Offset;", "", "", "packedValue", "constructor-impl", "(J)J", "", "component1-impl", "(J)F", "component1", "component2-impl", "component2", "x", "y", "copy-dBAh8RU", "(JFF)J", "copy", "", "isValid-impl", "(J)Z", "isValid", "getDistance-impl", "getDistance", "getDistanceSquared-impl", "getDistanceSquared", "unaryMinus-F1C5BW0", "unaryMinus", "other", "minus-MK-Hz9U", "(JJ)J", "minus", "plus-MK-Hz9U", "plus", "operand", "times-tuRUvjQ", "(JF)J", "times", "div-tuRUvjQ", "div", "rem-tuRUvjQ", "rem", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "", "hashCode-impl", "(J)I", "hashCode", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "getX-impl", "getX$annotations", "()V", "getY-impl", "getY$annotations", "Companion", "ui-geometry_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@JvmInline
@SourceDebugExtension({"SMAP\nOffset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,311:1\n72#2:312\n86#2:314\n63#2,3:316\n72#2:319\n86#2:321\n72#2:322\n86#2:324\n72#2:326\n86#2:328\n72#2:330\n86#2:332\n63#2,3:334\n72#2:337\n86#2:339\n63#2,3:341\n72#2:344\n86#2:346\n63#2,3:348\n72#2:351\n86#2:353\n63#2,3:355\n72#2:358\n86#2:360\n63#2,3:362\n22#3:313\n22#3:315\n22#3:320\n22#3:323\n22#3:325\n22#3:327\n22#3:329\n22#3:331\n22#3:333\n22#3:338\n22#3:340\n22#3:345\n22#3:347\n22#3:352\n22#3:354\n22#3:359\n22#3:361\n*S KotlinDebug\n*F\n+ 1 Offset.kt\nandroidx/compose/ui/geometry/Offset\n*L\n64#1:312\n67#1:314\n80#1:316,3\n79#1:319\n79#1:321\n129#1:322\n130#1:324\n141#1:326\n142#1:328\n170#1:330\n171#1:332\n169#1:334,3\n187#1:337\n188#1:339\n186#1:341,3\n204#1:344\n205#1:346\n203#1:348,3\n221#1:351\n222#1:353\n220#1:355,3\n238#1:358\n239#1:360\n237#1:362,3\n64#1:313\n67#1:315\n79#1:320\n129#1:323\n130#1:325\n141#1:327\n142#1:329\n170#1:331\n171#1:333\n187#1:338\n188#1:340\n204#1:345\n205#1:347\n221#1:352\n222#1:354\n238#1:359\n239#1:361\n*E\n"})
public final class Offset {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001R&\u0010\u0003\u001A\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001A\u0004\b\u0005\u0010\u0006R&\u0010\t\u001A\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u0012\u0004\b\u000B\u0010\b\u001A\u0004\b\n\u0010\u0006R&\u0010\f\u001A\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u0012\u0004\b\u000E\u0010\b\u001A\u0004\b\r\u0010\u0006\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u000F"}, d2 = {"Landroidx/compose/ui/geometry/Offset$Companion;", "", "Landroidx/compose/ui/geometry/Offset;", "Zero", "J", "getZero-F1C5BW0", "()J", "getZero-F1C5BW0$annotations", "()V", "Infinite", "getInfinite-F1C5BW0", "getInfinite-F1C5BW0$annotations", "Unspecified", "getUnspecified-F1C5BW0", "getUnspecified-F1C5BW0$annotations", "ui-geometry_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        // 去混淆评级： 低(20)
        public final long getInfinite-F1C5BW0() [...] // 潜在的解密器

        @Stable
        public static void getInfinite-F1C5BW0$annotations() {
        }

        // 去混淆评级： 低(20)
        public final long getUnspecified-F1C5BW0() [...] // 潜在的解密器

        @Stable
        public static void getUnspecified-F1C5BW0$annotations() {
        }

        // 去混淆评级： 低(20)
        public final long getZero-F1C5BW0() [...] // 潜在的解密器

        @Stable
        public static void getZero-F1C5BW0$annotations() {
        }
    }

    @NotNull
    public static final Companion Companion;
    public final long a;
    public static final long b;
    public static final long c;
    public static final long d;

    static {
        Offset.Companion = new Companion(null);
        Offset.b = 0L;
        Offset.c = 0x7F8000007F800000L;
        Offset.d = 0x7FC000007FC00000L;
    }

    public Offset(long v) {
        this.a = v;
    }

    public static final long access$getInfinite$cp() [...] // 潜在的解密器

    public static final long access$getUnspecified$cp() [...] // 潜在的解密器

    public static final long access$getZero$cp() [...] // 潜在的解密器

    public static final Offset box-impl(long v) {
        return new Offset(v);
    }

    @Stable
    public static final float component1-impl(long v) {
        return Offset.getX-impl(v);
    }

    @Stable
    public static final float component2-impl(long v) {
        return Offset.getY-impl(v);
    }

    public static long constructor-impl(long v) [...] // Inlined contents

    public static final long copy-dBAh8RU(long v, float f, float f1) {
        return ((long)Float.floatToRawIntBits(f)) << 0x20 | ((long)Float.floatToRawIntBits(f1)) & 0xFFFFFFFFL;
    }

    public static long copy-dBAh8RU$default(long v, float f, float f1, int v1, Object object0) {
        if((v1 & 1) != 0) {
            f = Float.intBitsToFloat(((int)(v >> 0x20)));
        }
        if((v1 & 2) != 0) {
            f1 = Float.intBitsToFloat(((int)(0xFFFFFFFFL & v)));
        }
        return Offset.copy-dBAh8RU(v, f, f1);
    }

    @Stable
    public static final long div-tuRUvjQ(long v, float f) {
        return Offset.constructor-impl(((long)Float.floatToRawIntBits(Float.intBitsToFloat(((int)(v >> 0x20))) / f)) << 0x20 | ((long)Float.floatToRawIntBits(Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL))) / f)) & 0xFFFFFFFFL);
    }

    @Override
    public boolean equals(Object object0) {
        return Offset.equals-impl(this.a, object0);
    }

    public static boolean equals-impl(long v, Object object0) {
        return object0 instanceof Offset ? v == ((Offset)object0).unbox-impl() : false;
    }

    public static final boolean equals-impl0(long v, long v1) {
        return v == v1;
    }

    @Stable
    public static final float getDistance-impl(long v) {
        float f = Float.intBitsToFloat(((int)(v >> 0x20)));
        float f1 = Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL)));
        return (float)Math.sqrt(f1 * f1 + f * f);
    }

    @Stable
    public static final float getDistanceSquared-impl(long v) {
        float f = Float.intBitsToFloat(((int)(v >> 0x20)));
        float f1 = Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL)));
        return f1 * f1 + f * f;
    }

    @Stable
    public static void getX$annotations() {
    }

    public static final float getX-impl(long v) {
        return Float.intBitsToFloat(((int)(v >> 0x20)));
    }

    @Stable
    public static void getY$annotations() {
    }

    public static final float getY-impl(long v) {
        return Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL)));
    }

    @Override
    public int hashCode() {
        return Offset.hashCode-impl(this.a);
    }

    public static int hashCode-impl(long v) {
        return Long.hashCode(v);
    }

    @Stable
    public static final boolean isValid-impl(long v) [...] // Inlined contents

    @Stable
    public static final long minus-MK-Hz9U(long v, long v1) {
        return ((long)Float.floatToRawIntBits(Float.intBitsToFloat(((int)(v >> 0x20))) - Float.intBitsToFloat(((int)(v1 >> 0x20))))) << 0x20 | ((long)Float.floatToRawIntBits(Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL))) - Float.intBitsToFloat(((int)(v1 & 0xFFFFFFFFL))))) & 0xFFFFFFFFL;
    }

    @Stable
    public static final long plus-MK-Hz9U(long v, long v1) {
        return Offset.constructor-impl(((long)Float.floatToRawIntBits(Float.intBitsToFloat(((int)(v1 & 0xFFFFFFFFL))) + Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL))))) & 0xFFFFFFFFL | ((long)Float.floatToRawIntBits(Float.intBitsToFloat(((int)(v1 >> 0x20))) + Float.intBitsToFloat(((int)(v >> 0x20))))) << 0x20);
    }

    @Stable
    public static final long rem-tuRUvjQ(long v, float f) {
        return Offset.constructor-impl(((long)Float.floatToRawIntBits(Float.intBitsToFloat(((int)(v >> 0x20))) % f)) << 0x20 | ((long)Float.floatToRawIntBits(Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL))) % f)) & 0xFFFFFFFFL);
    }

    @Stable
    public static final long times-tuRUvjQ(long v, float f) {
        return ((long)Float.floatToRawIntBits(Float.intBitsToFloat(((int)(v >> 0x20))) * f)) << 0x20 | ((long)Float.floatToRawIntBits(Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL))) * f)) & 0xFFFFFFFFL;
    }

    @Override
    @NotNull
    public String toString() {
        return Offset.toString-impl(this.a);
    }

    // 去混淆评级： 低(20)
    @NotNull
    public static String toString-impl(long v) {
        return OffsetKt.isSpecified-k-4lQ0M(v) ? "Offset(" + GeometryUtilsKt.toStringAsFixed(Offset.getX-impl(v), 1) + ", " + GeometryUtilsKt.toStringAsFixed(Offset.getY-impl(v), 1) + ')' : "Offset.Unspecified";
    }

    @Stable
    public static final long unaryMinus-F1C5BW0(long v) {
        return v ^ 0x8000000080000000L;
    }

    public final long unbox-impl() {
        return this.a;
    }
}

