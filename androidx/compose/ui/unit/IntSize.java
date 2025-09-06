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
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000B\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u000F\b\u0087@\u0018\u0000 &2\u00020\u0001:\u0001&B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001A\u00020\u0006H\u0087\n¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000B\u001A\u00020\u0006H\u0087\n¢\u0006\u0004\b\n\u0010\bJ\u001E\u0010\u000F\u001A\u00020\u00002\u0006\u0010\f\u001A\u00020\u0006H\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u001E\u0010\u0011\u001A\u00020\u00002\u0006\u0010\f\u001A\u00020\u0006H\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u000EJ\u000F\u0010\u0015\u001A\u00020\u0012H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0017\u001A\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\bJ\u001A\u0010\u001B\u001A\u00020\u00182\b\u0010\f\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001AR\u001A\u0010\u0003\u001A\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u001C\u0010\u001D\u0012\u0004\b\u001E\u0010\u001FR\u001A\u0010\"\u001A\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b!\u0010\u001F\u001A\u0004\b \u0010\bR\u001A\u0010%\u001A\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b$\u0010\u001F\u001A\u0004\b#\u0010\b\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u000B\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u0006\'"}, d2 = {"Landroidx/compose/ui/unit/IntSize;", "", "", "packedValue", "constructor-impl", "(J)J", "", "component1-impl", "(J)I", "component1", "component2-impl", "component2", "other", "times-YEO4UFw", "(JI)J", "times", "div-YEO4UFw", "div", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "a", "J", "getPackedValue$annotations", "()V", "getWidth-impl", "getWidth$annotations", "width", "getHeight-impl", "getHeight$annotations", "height", "Companion", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@JvmInline
@SourceDebugExtension({"SMAP\nIntSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,146:1\n107#2:147\n114#2:148\n107#2:149\n114#2:150\n100#2:151\n107#2:152\n114#2:153\n100#2:154\n*S KotlinDebug\n*F\n+ 1 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n46#1:147\n53#1:148\n67#1:149\n68#1:150\n66#1:151\n78#1:152\n79#1:153\n77#1:154\n*E\n"})
public final class IntSize {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001D\u0010\u0003\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/unit/IntSize$Companion;", "", "Landroidx/compose/ui/unit/IntSize;", "Zero", "J", "getZero-YbymL2g", "()J", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        // 去混淆评级： 低(20)
        public final long getZero-YbymL2g() [...] // 潜在的解密器
    }

    @NotNull
    public static final Companion Companion;
    public final long a;
    public static final long b;

    static {
        IntSize.Companion = new Companion(null);
        IntSize.b = 0L;
    }

    public IntSize(long v) {
        this.a = v;
    }

    public static final long access$getZero$cp() [...] // 潜在的解密器

    public static final IntSize box-impl(long v) {
        return new IntSize(v);
    }

    @Stable
    public static final int component1-impl(long v) {
        return IntSize.getWidth-impl(v);
    }

    @Stable
    public static final int component2-impl(long v) {
        return IntSize.getHeight-impl(v);
    }

    public static long constructor-impl(long v) [...] // Inlined contents

    @Stable
    public static final long div-YEO4UFw(long v, int v1) {
        return IntSize.constructor-impl(((long)(((int)(v >> 0x20)) / v1)) << 0x20 | ((long)(((int)(v & 0xFFFFFFFFL)) / v1)) & 0xFFFFFFFFL);
    }

    @Override
    public boolean equals(Object object0) {
        return IntSize.equals-impl(this.a, object0);
    }

    public static boolean equals-impl(long v, Object object0) {
        return object0 instanceof IntSize ? v == ((IntSize)object0).unbox-impl() : false;
    }

    public static final boolean equals-impl0(long v, long v1) {
        return v == v1;
    }

    @Stable
    public static void getHeight$annotations() {
    }

    public static final int getHeight-impl(long v) [...] // 潜在的解密器

    @PublishedApi
    public static void getPackedValue$annotations() {
    }

    @Stable
    public static void getWidth$annotations() {
    }

    public static final int getWidth-impl(long v) [...] // 潜在的解密器

    @Override
    public int hashCode() {
        return IntSize.hashCode-impl(this.a);
    }

    public static int hashCode-impl(long v) {
        return Long.hashCode(v);
    }

    @Stable
    public static final long times-YEO4UFw(long v, int v1) {
        return ((long)(((int)(v >> 0x20)) * v1)) << 0x20 | ((long)(((int)(v & 0xFFFFFFFFL)) * v1)) & 0xFFFFFFFFL;
    }

    @Override
    @Stable
    @NotNull
    public String toString() {
        return IntSize.toString-impl(this.a);
    }

    @Stable
    @NotNull
    public static String toString-impl(long v) {
        return IntSize.getWidth-impl(v) + " x " + IntSize.getHeight-impl(v);
    }

    public final long unbox-impl() {
        return this.a;
    }
}

