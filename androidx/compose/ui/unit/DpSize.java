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
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\r\b\u0087@\u0018\u0000 22\u00020\u0001:\u00012B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000B\u001A\u00020\u00002\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\b\u001A\u00020\u0006\u00F8\u0001\u0000\u00A2\u0006\u0004\b\t\u0010\nJ\u001B\u0010\u000F\u001A\u00020\u00002\u0006\u0010\f\u001A\u00020\u0000H\u0087\u0002\u00F8\u0001\u0000\u00A2\u0006\u0004\b\r\u0010\u000EJ\u001B\u0010\u0011\u001A\u00020\u00002\u0006\u0010\f\u001A\u00020\u0000H\u0087\u0002\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0010\u0010\u000EJ\u0016\u0010\u0014\u001A\u00020\u0006H\u0087\n\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0016\u001A\u00020\u0006H\u0087\n\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0015\u0010\u0013J\u001E\u0010\u001A\u001A\u00020\u00002\u0006\u0010\f\u001A\u00020\u0017H\u0087\u0002\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u001E\u0010\u001A\u001A\u00020\u00002\u0006\u0010\f\u001A\u00020\u001BH\u0087\u0002\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0018\u0010\u001CJ\u001E\u0010\u001E\u001A\u00020\u00002\u0006\u0010\f\u001A\u00020\u0017H\u0087\u0002\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001D\u0010\u0019J\u001E\u0010\u001E\u001A\u00020\u00002\u0006\u0010\f\u001A\u00020\u001BH\u0087\u0002\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001D\u0010\u001CJ\u000F\u0010\"\u001A\u00020\u001FH\u0017\u00A2\u0006\u0004\b \u0010!J\u0010\u0010%\u001A\u00020\u0017H\u00D6\u0001\u00A2\u0006\u0004\b#\u0010$J\u001A\u0010)\u001A\u00020&2\b\u0010\f\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b\'\u0010(R\u001A\u0010\u0003\u001A\u00020\u00028\u0000X\u0081\u0004\u00A2\u0006\f\n\u0004\b*\u0010+\u0012\u0004\b,\u0010-R \u0010\u0007\u001A\u00020\u00068FX\u0087\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\u0012\u0004\b/\u0010-\u001A\u0004\b.\u0010\u0013R \u0010\b\u001A\u00020\u00068FX\u0087\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\u0012\u0004\b1\u0010-\u001A\u0004\b0\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u00063"}, d2 = {"Landroidx/compose/ui/unit/DpSize;", "", "", "packedValue", "constructor-impl", "(J)J", "Landroidx/compose/ui/unit/Dp;", "width", "height", "copy-DwJknco", "(JFF)J", "copy", "other", "minus-e_xh8Ic", "(JJ)J", "minus", "plus-e_xh8Ic", "plus", "component1-D9Ej5fM", "(J)F", "component1", "component2-D9Ej5fM", "component2", "", "times-Gh9hcWk", "(JI)J", "times", "", "(JF)J", "div-Gh9hcWk", "div", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "hashCode-impl", "(J)I", "hashCode", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "a", "J", "getPackedValue$annotations", "()V", "getWidth-D9Ej5fM", "getWidth-D9Ej5fM$annotations", "getHeight-D9Ej5fM", "getHeight-D9Ej5fM$annotations", "Companion", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@JvmInline
@SourceDebugExtension({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpSize\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,576:1\n72#2:577\n86#2:580\n63#2,3:583\n63#2,3:588\n63#2,3:593\n63#2,3:598\n63#2,3:603\n63#2,3:608\n63#2,3:613\n22#3:578\n22#3:581\n168#4:579\n168#4:582\n482#4:616\n56#5:586\n56#5:587\n50#5:591\n50#5:592\n86#5:596\n86#5:597\n83#5:601\n83#5:602\n71#5:606\n71#5:607\n68#5:611\n68#5:612\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpSize\n*L\n376#1:577\n382#1:580\n389#1:583,3\n398#1:588,3\n410#1:593,3\n424#1:598,3\n432#1:603,3\n440#1:608,3\n448#1:613,3\n376#1:578\n382#1:581\n376#1:579\n382#1:582\n456#1:616\n399#1:586\n400#1:587\n411#1:591\n412#1:592\n425#1:596\n426#1:597\n433#1:601\n434#1:602\n441#1:606\n442#1:607\n449#1:611\n450#1:612\n*E\n"})
public final class DpSize {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001D\u0010\u0003\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u001D\u0010\u0007\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001A\u0004\b\b\u0010\u0006\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Landroidx/compose/ui/unit/DpSize$Companion;", "", "Landroidx/compose/ui/unit/DpSize;", "Zero", "J", "getZero-MYxV2XQ", "()J", "Unspecified", "getUnspecified-MYxV2XQ", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        // 去混淆评级： 低(20)
        public final long getUnspecified-MYxV2XQ() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final long getZero-MYxV2XQ() [...] // 潜在的解密器
    }

    @NotNull
    public static final Companion Companion;
    public final long a;
    public static final long b;
    public static final long c;

    static {
        DpSize.Companion = new Companion(null);
        DpSize.b = 0L;
        DpSize.c = 0x7FC000007FC00000L;
    }

    public DpSize(long v) {
        this.a = v;
    }

    public static final long access$getUnspecified$cp() [...] // 潜在的解密器

    public static final long access$getZero$cp() [...] // 潜在的解密器

    public static final DpSize box-impl(long v) {
        return new DpSize(v);
    }

    @Stable
    public static final float component1-D9Ej5fM(long v) {
        return DpSize.getWidth-D9Ej5fM(v);
    }

    @Stable
    public static final float component2-D9Ej5fM(long v) {
        return DpSize.getHeight-D9Ej5fM(v);
    }

    public static long constructor-impl(long v) [...] // Inlined contents

    public static final long copy-DwJknco(long v, float f, float f1) {
        return ((long)Float.floatToRawIntBits(f)) << 0x20 | ((long)Float.floatToRawIntBits(f1)) & 0xFFFFFFFFL;
    }

    public static long copy-DwJknco$default(long v, float f, float f1, int v1, Object object0) {
        if((v1 & 1) != 0) {
            f = DpSize.getWidth-D9Ej5fM(v);
        }
        if((v1 & 2) != 0) {
            f1 = DpSize.getHeight-D9Ej5fM(v);
        }
        return DpSize.copy-DwJknco(v, f, f1);
    }

    @Stable
    public static final long div-Gh9hcWk(long v, float f) {
        return DpSize.constructor-impl(((long)Float.floatToRawIntBits(Dp.constructor-impl(DpSize.getWidth-D9Ej5fM(v) / f))) << 0x20 | ((long)Float.floatToRawIntBits(Dp.constructor-impl(DpSize.getHeight-D9Ej5fM(v) / f))) & 0xFFFFFFFFL);
    }

    @Stable
    public static final long div-Gh9hcWk(long v, int v1) {
        return DpSize.constructor-impl(((long)Float.floatToRawIntBits(Dp.constructor-impl(DpSize.getWidth-D9Ej5fM(v) / ((float)v1)))) << 0x20 | ((long)Float.floatToRawIntBits(Dp.constructor-impl(DpSize.getHeight-D9Ej5fM(v) / ((float)v1)))) & 0xFFFFFFFFL);
    }

    @Override
    public boolean equals(Object object0) {
        return DpSize.equals-impl(this.a, object0);
    }

    public static boolean equals-impl(long v, Object object0) {
        return object0 instanceof DpSize ? v == ((DpSize)object0).unbox-impl() : false;
    }

    public static final boolean equals-impl0(long v, long v1) {
        return v == v1;
    }

    public static final float getHeight-D9Ej5fM(long v) [...] // 潜在的解密器

    @Stable
    public static void getHeight-D9Ej5fM$annotations() {
    }

    @PublishedApi
    public static void getPackedValue$annotations() {
    }

    public static final float getWidth-D9Ej5fM(long v) [...] // 潜在的解密器

    @Stable
    public static void getWidth-D9Ej5fM$annotations() {
    }

    @Override
    public int hashCode() {
        return DpSize.hashCode-impl(this.a);
    }

    public static int hashCode-impl(long v) {
        return Long.hashCode(v);
    }

    @Stable
    public static final long minus-e_xh8Ic(long v, long v1) {
        return ((long)Float.floatToRawIntBits(DpSize.getWidth-D9Ej5fM(v) - DpSize.getWidth-D9Ej5fM(v1))) << 0x20 | 0xFFFFFFFFL & ((long)Float.floatToRawIntBits(DpSize.getHeight-D9Ej5fM(v) - DpSize.getHeight-D9Ej5fM(v1)));
    }

    @Stable
    public static final long plus-e_xh8Ic(long v, long v1) {
        return ((long)Float.floatToRawIntBits(DpSize.getWidth-D9Ej5fM(v1) + DpSize.getWidth-D9Ej5fM(v))) << 0x20 | 0xFFFFFFFFL & ((long)Float.floatToRawIntBits(DpSize.getHeight-D9Ej5fM(v1) + DpSize.getHeight-D9Ej5fM(v)));
    }

    @Stable
    public static final long times-Gh9hcWk(long v, float f) {
        return ((long)Float.floatToRawIntBits(DpSize.getWidth-D9Ej5fM(v) * f)) << 0x20 | ((long)Float.floatToRawIntBits(DpSize.getHeight-D9Ej5fM(v) * f)) & 0xFFFFFFFFL;
    }

    @Stable
    public static final long times-Gh9hcWk(long v, int v1) {
        return ((long)Float.floatToRawIntBits(DpSize.getWidth-D9Ej5fM(v) * ((float)v1))) << 0x20 | ((long)Float.floatToRawIntBits(DpSize.getHeight-D9Ej5fM(v) * ((float)v1))) & 0xFFFFFFFFL;
    }

    @Override
    @Stable
    @NotNull
    public String toString() {
        return DpSize.toString-impl(this.a);
    }

    @Stable
    @NotNull
    public static String toString-impl(long v) {
        return v == 0x7FC000007FC00000L ? "DpSize.Unspecified" : Dp.toString-impl(DpSize.getWidth-D9Ej5fM(v)) + " x " + Dp.toString-impl(DpSize.getHeight-D9Ej5fM(v));
    }

    public final long unbox-impl() {
        return this.a;
    }
}

