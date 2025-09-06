package androidx.compose.ui.geometry;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Immutable
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000B\n\u0002\b\t\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0017\b\u0087@\u0018\u0000 52\u00020\u0001:\u00015B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001A\u00020\u0006H\u0087\n¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000B\u001A\u00020\u0006H\u0087\n¢\u0006\u0004\b\n\u0010\bJ\'\u0010\u0010\u001A\u00020\u00002\b\b\u0002\u0010\f\u001A\u00020\u00062\b\b\u0002\u0010\r\u001A\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0014\u001A\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001E\u0010\u0018\u001A\u00020\u00002\u0006\u0010\u0015\u001A\u00020\u0006H\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001E\u0010\u001A\u001A\u00020\u00002\u0006\u0010\u0015\u001A\u00020\u0006H\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u0017J\u000F\u0010\u001E\u001A\u00020\u001BH\u0016¢\u0006\u0004\b\u001C\u0010\u001DJ\u0010\u0010\"\u001A\u00020\u001FHÖ\u0001¢\u0006\u0004\b \u0010!J\u001A\u0010&\u001A\u00020\u00112\b\u0010#\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001A\u0010\u0003\u001A\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\'\u0010(\u0012\u0004\b)\u0010*R\u001A\u0010\f\u001A\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b,\u0010*\u001A\u0004\b+\u0010\bR\u001A\u0010\r\u001A\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b.\u0010*\u001A\u0004\b-\u0010\bR\u001A\u00101\u001A\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b0\u0010*\u001A\u0004\b/\u0010\bR\u001A\u00104\u001A\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b3\u0010*\u001A\u0004\b2\u0010\b\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u000B\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u00066"}, d2 = {"Landroidx/compose/ui/geometry/Size;", "", "", "packedValue", "constructor-impl", "(J)J", "", "component1-impl", "(J)F", "component1", "component2-impl", "component2", "width", "height", "copy-xjbvk4A", "(JFF)J", "copy", "", "isEmpty-impl", "(J)Z", "isEmpty", "operand", "times-7Ah8Wj8", "(JF)J", "times", "div-7Ah8Wj8", "div", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "", "hashCode-impl", "(J)I", "hashCode", "other", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "a", "J", "getPackedValue$annotations", "()V", "getWidth-impl", "getWidth$annotations", "getHeight-impl", "getHeight$annotations", "getMinDimension-impl", "getMinDimension$annotations", "minDimension", "getMaxDimension-impl", "getMaxDimension$annotations", "maxDimension", "Companion", "ui-geometry_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@JvmInline
@SourceDebugExtension({"SMAP\nSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,285:1\n72#2:286\n86#2:288\n63#2,3:290\n72#2:293\n86#2:295\n72#2:296\n86#2:298\n63#2,3:300\n72#2:303\n86#2:305\n63#2,3:307\n79#2:310\n93#2:312\n79#2:313\n93#2:315\n22#3:287\n22#3:289\n22#3:294\n22#3:297\n22#3:299\n22#3:304\n22#3:306\n22#3:311\n22#3:314\n198#4:316\n*S KotlinDebug\n*F\n+ 1 Size.kt\nandroidx/compose/ui/geometry/Size\n*L\n51#1:286\n61#1:288\n77#1:290,3\n76#1:293\n76#1:295\n133#1:296\n134#1:298\n132#1:300,3\n153#1:303\n154#1:305\n152#1:307,3\n168#1:310\n168#1:312\n180#1:313\n180#1:315\n51#1:287\n61#1:289\n76#1:294\n133#1:297\n134#1:299\n153#1:304\n154#1:306\n168#1:311\n180#1:314\n184#1:316\n*E\n"})
public final class Size {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001R&\u0010\u0003\u001A\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001A\u0004\b\u0005\u0010\u0006R&\u0010\t\u001A\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u0012\u0004\b\u000B\u0010\b\u001A\u0004\b\n\u0010\u0006\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\f"}, d2 = {"Landroidx/compose/ui/geometry/Size$Companion;", "", "Landroidx/compose/ui/geometry/Size;", "Zero", "J", "getZero-NH-jbRc", "()J", "getZero-NH-jbRc$annotations", "()V", "Unspecified", "getUnspecified-NH-jbRc", "getUnspecified-NH-jbRc$annotations", "ui-geometry_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        // 去混淆评级： 低(20)
        public final long getUnspecified-NH-jbRc() [...] // 潜在的解密器

        @Stable
        public static void getUnspecified-NH-jbRc$annotations() {
        }

        // 去混淆评级： 低(20)
        public final long getZero-NH-jbRc() [...] // 潜在的解密器

        @Stable
        public static void getZero-NH-jbRc$annotations() {
        }
    }

    @NotNull
    public static final Companion Companion;
    public final long a;
    public static final long b;
    public static final long c;

    static {
        Size.Companion = new Companion(null);
        Size.b = 0L;
        Size.c = 0x7FC000007FC00000L;
    }

    public Size(long v) {
        this.a = v;
    }

    public static final long access$getUnspecified$cp() [...] // 潜在的解密器

    public static final long access$getZero$cp() [...] // 潜在的解密器

    public static final Size box-impl(long v) {
        return new Size(v);
    }

    @Stable
    public static final float component1-impl(long v) {
        return Size.getWidth-impl(v);
    }

    @Stable
    public static final float component2-impl(long v) {
        return Size.getHeight-impl(v);
    }

    public static long constructor-impl(long v) [...] // Inlined contents

    public static final long copy-xjbvk4A(long v, float f, float f1) {
        return ((long)Float.floatToRawIntBits(f)) << 0x20 | ((long)Float.floatToRawIntBits(f1)) & 0xFFFFFFFFL;
    }

    public static long copy-xjbvk4A$default(long v, float f, float f1, int v1, Object object0) {
        if((v1 & 1) != 0) {
            f = Float.intBitsToFloat(((int)(v >> 0x20)));
        }
        if((v1 & 2) != 0) {
            f1 = Float.intBitsToFloat(((int)(0xFFFFFFFFL & v)));
        }
        return Size.copy-xjbvk4A(v, f, f1);
    }

    @Stable
    public static final long div-7Ah8Wj8(long v, float f) {
        if(v == 0x7FC000007FC00000L) {
            InlineClassHelperKt.throwIllegalStateException("Size is unspecified");
        }
        return Size.constructor-impl(((long)Float.floatToRawIntBits(Float.intBitsToFloat(((int)(v >> 0x20))) / f)) << 0x20 | ((long)Float.floatToRawIntBits(Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL))) / f)) & 0xFFFFFFFFL);
    }

    @Override
    public boolean equals(Object object0) {
        return Size.equals-impl(this.a, object0);
    }

    public static boolean equals-impl(long v, Object object0) {
        return object0 instanceof Size ? v == ((Size)object0).unbox-impl() : false;
    }

    public static final boolean equals-impl0(long v, long v1) {
        return v == v1;
    }

    @Stable
    public static void getHeight$annotations() {
    }

    public static final float getHeight-impl(long v) {
        if(v == 0x7FC000007FC00000L) {
            InlineClassHelperKt.throwIllegalStateException("Size is unspecified");
        }
        return Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL)));
    }

    @Stable
    public static void getMaxDimension$annotations() {
    }

    public static final float getMaxDimension-impl(long v) {
        if(v == 0x7FC000007FC00000L) {
            InlineClassHelperKt.throwIllegalStateException("Size is unspecified");
        }
        return Math.max(Float.intBitsToFloat(((int)(v >> 0x20 & 0x7FFFFFFFL))), Float.intBitsToFloat(((int)(v & 0x7FFFFFFFL))));
    }

    @Stable
    public static void getMinDimension$annotations() {
    }

    public static final float getMinDimension-impl(long v) {
        if(v == 0x7FC000007FC00000L) {
            InlineClassHelperKt.throwIllegalStateException("Size is unspecified");
        }
        return Math.min(Float.intBitsToFloat(((int)(v >> 0x20 & 0x7FFFFFFFL))), Float.intBitsToFloat(((int)(v & 0x7FFFFFFFL))));
    }

    @PublishedApi
    public static void getPackedValue$annotations() {
    }

    @Stable
    public static void getWidth$annotations() {
    }

    public static final float getWidth-impl(long v) {
        if(v == 0x7FC000007FC00000L) {
            InlineClassHelperKt.throwIllegalStateException("Size is unspecified");
        }
        return Float.intBitsToFloat(((int)(v >> 0x20)));
    }

    @Override
    public int hashCode() {
        return Size.hashCode-impl(this.a);
    }

    public static int hashCode-impl(long v) {
        return Long.hashCode(v);
    }

    @Stable
    public static final boolean isEmpty-impl(long v) {
        if(v == 0x7FC000007FC00000L) {
            InlineClassHelperKt.throwIllegalStateException("Size is unspecified");
        }
        return true;
    }

    @Stable
    public static final long times-7Ah8Wj8(long v, float f) {
        if(v == 0x7FC000007FC00000L) {
            InlineClassHelperKt.throwIllegalStateException("Size is unspecified");
        }
        return ((long)Float.floatToRawIntBits(Float.intBitsToFloat(((int)(v >> 0x20))) * f)) << 0x20 | ((long)Float.floatToRawIntBits(Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL))) * f)) & 0xFFFFFFFFL;
    }

    @Override
    @NotNull
    public String toString() {
        return Size.toString-impl(this.a);
    }

    @NotNull
    public static String toString-impl(long v) {
        return v == 0x7FC000007FC00000L ? "Size.Unspecified" : "Size(" + GeometryUtilsKt.toStringAsFixed(Size.getWidth-impl(v), 1) + ", " + GeometryUtilsKt.toStringAsFixed(Size.getHeight-impl(v), 1) + ')';
    }

    public final long unbox-impl() {
        return this.a;
    }
}

