package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Immutable
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u000E\b\u0087@\u0018\u0000 \'2\u00020\u0001:\u0001\'B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000B\u001A\u00020\u00002\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\b\u001A\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001B\u0010\u000F\u001A\u00020\u00002\u0006\u0010\f\u001A\u00020\u0000H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000EJ\u001B\u0010\u0011\u001A\u00020\u00002\u0006\u0010\f\u001A\u00020\u0000H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000EJ\u000F\u0010\u0015\u001A\u00020\u0012H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0019\u001A\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001A\u0010\u001D\u001A\u00020\u001A2\b\u0010\f\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001B\u0010\u001CR\u001A\u0010\u0003\u001A\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u001E\u0010\u001F\u0012\u0004\b \u0010!R \u0010\u0007\u001A\u00020\u00068FX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b$\u0010!\u001A\u0004\b\"\u0010#R \u0010\b\u001A\u00020\u00068FX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b&\u0010!\u001A\u0004\b%\u0010#\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006("}, d2 = {"Landroidx/compose/ui/unit/DpOffset;", "", "", "packedValue", "constructor-impl", "(J)J", "Landroidx/compose/ui/unit/Dp;", "x", "y", "copy-tPigGR8", "(JFF)J", "copy", "other", "minus-CB-Mgk4", "(JJ)J", "minus", "plus-CB-Mgk4", "plus", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "", "hashCode-impl", "(J)I", "hashCode", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "a", "J", "getPackedValue$annotations", "()V", "getX-D9Ej5fM", "(J)F", "getX-D9Ej5fM$annotations", "getY-D9Ej5fM", "getY-D9Ej5fM$annotations", "Companion", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@JvmInline
@SourceDebugExtension({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpOffset\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,576:1\n72#2:577\n86#2:580\n63#2,3:583\n63#2,3:588\n63#2,3:593\n22#3:578\n22#3:581\n168#4:579\n168#4:582\n324#4:596\n56#5:586\n56#5:587\n50#5:591\n50#5:592\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpOffset\n*L\n260#1:577\n266#1:580\n272#1:583,3\n279#1:588,3\n290#1:593,3\n260#1:578\n266#1:581\n260#1:579\n266#1:582\n298#1:596\n280#1:586\n281#1:587\n291#1:591\n292#1:592\n*E\n"})
public final class DpOffset {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001D\u0010\u0003\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u001D\u0010\u0007\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001A\u0004\b\b\u0010\u0006\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Landroidx/compose/ui/unit/DpOffset$Companion;", "", "Landroidx/compose/ui/unit/DpOffset;", "Zero", "J", "getZero-RKDOV3M", "()J", "Unspecified", "getUnspecified-RKDOV3M", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        // 去混淆评级： 低(20)
        public final long getUnspecified-RKDOV3M() {
            return 0x7FC000007FC00000L;
        }

        // 去混淆评级： 低(20)
        public final long getZero-RKDOV3M() [...] // 潜在的解密器
    }

    @NotNull
    public static final Companion Companion;
    public final long a;
    public static final long b;
    public static final long c;

    static {
        DpOffset.Companion = new Companion(null);
        DpOffset.b = 0L;
        DpOffset.c = 0x7FC000007FC00000L;
    }

    public DpOffset(long v) {
        this.a = v;
    }

    public static final long access$getUnspecified$cp() [...] // 潜在的解密器

    public static final long access$getZero$cp() [...] // 潜在的解密器

    public static final DpOffset box-impl(long v) {
        return new DpOffset(v);
    }

    public static long constructor-impl(long v) [...] // Inlined contents

    public static final long copy-tPigGR8(long v, float f, float f1) {
        return ((long)Float.floatToRawIntBits(f)) << 0x20 | ((long)Float.floatToRawIntBits(f1)) & 0xFFFFFFFFL;
    }

    public static long copy-tPigGR8$default(long v, float f, float f1, int v1, Object object0) {
        if((v1 & 1) != 0) {
            f = DpOffset.getX-D9Ej5fM(v);
        }
        if((v1 & 2) != 0) {
            f1 = DpOffset.getY-D9Ej5fM(v);
        }
        return DpOffset.copy-tPigGR8(v, f, f1);
    }

    @Override
    public boolean equals(Object object0) {
        return DpOffset.equals-impl(this.a, object0);
    }

    public static boolean equals-impl(long v, Object object0) {
        return object0 instanceof DpOffset ? v == ((DpOffset)object0).unbox-impl() : false;
    }

    public static final boolean equals-impl0(long v, long v1) {
        return v == v1;
    }

    @PublishedApi
    public static void getPackedValue$annotations() {
    }

    public static final float getX-D9Ej5fM(long v) {
        return Float.intBitsToFloat(((int)(v >> 0x20)));
    }

    @Stable
    public static void getX-D9Ej5fM$annotations() {
    }

    public static final float getY-D9Ej5fM(long v) {
        return Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL)));
    }

    @Stable
    public static void getY-D9Ej5fM$annotations() {
    }

    @Override
    public int hashCode() {
        return DpOffset.hashCode-impl(this.a);
    }

    public static int hashCode-impl(long v) {
        return Long.hashCode(v);
    }

    @Stable
    public static final long minus-CB-Mgk4(long v, long v1) {
        return ((long)Float.floatToRawIntBits(DpOffset.getX-D9Ej5fM(v) - DpOffset.getX-D9Ej5fM(v1))) << 0x20 | 0xFFFFFFFFL & ((long)Float.floatToRawIntBits(DpOffset.getY-D9Ej5fM(v) - DpOffset.getY-D9Ej5fM(v1)));
    }

    @Stable
    public static final long plus-CB-Mgk4(long v, long v1) {
        return ((long)Float.floatToRawIntBits(DpOffset.getX-D9Ej5fM(v1) + DpOffset.getX-D9Ej5fM(v))) << 0x20 | 0xFFFFFFFFL & ((long)Float.floatToRawIntBits(DpOffset.getY-D9Ej5fM(v1) + DpOffset.getY-D9Ej5fM(v)));
    }

    @Override
    @Stable
    @NotNull
    public String toString() {
        return DpOffset.toString-impl(this.a);
    }

    @Stable
    @NotNull
    public static String toString-impl(long v) {
        return v == 0x7FC000007FC00000L ? "DpOffset.Unspecified" : "(" + Dp.toString-impl(DpOffset.getX-D9Ej5fM(v)) + ", " + Dp.toString-impl(DpOffset.getY-D9Ej5fM(v)) + ')';
    }

    public final long unbox-impl() {
        return this.a;
    }
}

