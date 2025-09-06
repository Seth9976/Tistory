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
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0018\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\r\b\u0087@\u0018\u0000 32\u00020\u0001:\u00013B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001A\u00020\u0006H\u0087\n¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000B\u001A\u00020\u0006H\u0087\n¢\u0006\u0004\b\n\u0010\bJ\'\u0010\u0010\u001A\u00020\u00002\b\b\u0002\u0010\f\u001A\u00020\u00062\b\b\u0002\u0010\r\u001A\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u0016\u0010\u0012\u001A\u00020\u0000H\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0005J\u001B\u0010\u0016\u001A\u00020\u00002\u0006\u0010\u0013\u001A\u00020\u0000H\u0087\u0002ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001B\u0010\u0018\u001A\u00020\u00002\u0006\u0010\u0013\u001A\u00020\u0000H\u0087\u0002ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0015J\u001E\u0010\u001C\u001A\u00020\u00002\u0006\u0010\u0019\u001A\u00020\u0006H\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001A\u0010\u001BJ\u001E\u0010\u001E\u001A\u00020\u00002\u0006\u0010\u0019\u001A\u00020\u0006H\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001D\u0010\u001BJ\u000F\u0010\"\u001A\u00020\u001FH\u0016¢\u0006\u0004\b \u0010!J\u0010\u0010&\u001A\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001A\u0010*\u001A\u00020\'2\b\u0010\u0013\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001A\u0010\u0003\u001A\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b+\u0010,\u0012\u0004\b-\u0010.R\u001A\u0010\f\u001A\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b0\u0010.\u001A\u0004\b/\u0010\bR\u001A\u0010\r\u001A\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b2\u0010.\u001A\u0004\b1\u0010\b\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u000B\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u00064"}, d2 = {"Landroidx/compose/ui/geometry/CornerRadius;", "", "", "packedValue", "constructor-impl", "(J)J", "", "component1-impl", "(J)F", "component1", "component2-impl", "component2", "x", "y", "copy-OHQCggk", "(JFF)J", "copy", "unaryMinus-kKHJgLs", "unaryMinus", "other", "minus-vF7b-mM", "(JJ)J", "minus", "plus-vF7b-mM", "plus", "operand", "times-Bz7bX_o", "(JF)J", "times", "div-Bz7bX_o", "div", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "", "hashCode-impl", "(J)I", "hashCode", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "a", "J", "getPackedValue$annotations", "()V", "getX-impl", "getX$annotations", "getY-impl", "getY$annotations", "Companion", "ui-geometry_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@JvmInline
@SourceDebugExtension({"SMAP\nCornerRadius.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadius\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,164:1\n72#2:165\n86#2:167\n22#3:166\n22#3:168\n*S KotlinDebug\n*F\n+ 1 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadius\n*L\n49#1:165\n53#1:167\n49#1:166\n53#1:168\n*E\n"})
public final class CornerRadius {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R&\u0010\u0003\u001A\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001A\u0004\b\u0005\u0010\u0006\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Landroidx/compose/ui/geometry/CornerRadius$Companion;", "", "Landroidx/compose/ui/geometry/CornerRadius;", "Zero", "J", "getZero-kKHJgLs", "()J", "getZero-kKHJgLs$annotations", "()V", "ui-geometry_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        // 去混淆评级： 低(20)
        public final long getZero-kKHJgLs() [...] // 潜在的解密器

        @Stable
        public static void getZero-kKHJgLs$annotations() {
        }
    }

    @NotNull
    public static final Companion Companion;
    public final long a;
    public static final long b;

    static {
        CornerRadius.Companion = new Companion(null);
        CornerRadius.b = 0L;
    }

    public CornerRadius(long v) {
        this.a = v;
    }

    public static final long access$getZero$cp() [...] // 潜在的解密器

    public static final CornerRadius box-impl(long v) {
        return new CornerRadius(v);
    }

    @Stable
    public static final float component1-impl(long v) {
        return CornerRadius.getX-impl(v);
    }

    @Stable
    public static final float component2-impl(long v) {
        return CornerRadius.getY-impl(v);
    }

    public static long constructor-impl(long v) [...] // Inlined contents

    public static final long copy-OHQCggk(long v, float f, float f1) {
        return CornerRadiusKt.CornerRadius(f, f1);
    }

    public static long copy-OHQCggk$default(long v, float f, float f1, int v1, Object object0) {
        if((v1 & 1) != 0) {
            f = CornerRadius.getX-impl(v);
        }
        if((v1 & 2) != 0) {
            f1 = CornerRadius.getY-impl(v);
        }
        return CornerRadius.copy-OHQCggk(v, f, f1);
    }

    @Stable
    public static final long div-Bz7bX_o(long v, float f) {
        return CornerRadiusKt.CornerRadius(CornerRadius.getX-impl(v) / f, CornerRadius.getY-impl(v) / f);
    }

    @Override
    public boolean equals(Object object0) {
        return CornerRadius.equals-impl(this.a, object0);
    }

    public static boolean equals-impl(long v, Object object0) {
        return object0 instanceof CornerRadius ? v == ((CornerRadius)object0).unbox-impl() : false;
    }

    public static final boolean equals-impl0(long v, long v1) {
        return v == v1;
    }

    @PublishedApi
    public static void getPackedValue$annotations() {
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
        return CornerRadius.hashCode-impl(this.a);
    }

    public static int hashCode-impl(long v) {
        return Long.hashCode(v);
    }

    @Stable
    public static final long minus-vF7b-mM(long v, long v1) {
        return CornerRadiusKt.CornerRadius(CornerRadius.getX-impl(v) - CornerRadius.getX-impl(v1), CornerRadius.getY-impl(v) - CornerRadius.getY-impl(v1));
    }

    @Stable
    public static final long plus-vF7b-mM(long v, long v1) {
        return CornerRadiusKt.CornerRadius(CornerRadius.getX-impl(v1) + CornerRadius.getX-impl(v), CornerRadius.getY-impl(v1) + CornerRadius.getY-impl(v));
    }

    @Stable
    public static final long times-Bz7bX_o(long v, float f) {
        return CornerRadiusKt.CornerRadius(CornerRadius.getX-impl(v) * f, CornerRadius.getY-impl(v) * f);
    }

    @Override
    @NotNull
    public String toString() {
        return CornerRadius.toString-impl(this.a);
    }

    @NotNull
    public static String toString-impl(long v) {
        return Float.compare(CornerRadius.getX-impl(v), CornerRadius.getY-impl(v)) == 0 ? "CornerRadius.circular(" + GeometryUtilsKt.toStringAsFixed(CornerRadius.getX-impl(v), 1) + ')' : "CornerRadius.elliptical(" + GeometryUtilsKt.toStringAsFixed(CornerRadius.getX-impl(v), 1) + ", " + GeometryUtilsKt.toStringAsFixed(CornerRadius.getY-impl(v), 1) + ')';
    }

    @Stable
    public static final long unaryMinus-kKHJgLs(long v) {
        return CornerRadiusKt.CornerRadius(-CornerRadius.getX-impl(v), -CornerRadius.getY-impl(v));
    }

    public final long unbox-impl() {
        return this.a;
    }
}

