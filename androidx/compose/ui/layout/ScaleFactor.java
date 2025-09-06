package androidx.compose.ui.layout;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.internal.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Immutable
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\r\b\u0087@\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001A\u00020\u0006H\u0087\n¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000B\u001A\u00020\u0006H\u0087\n¢\u0006\u0004\b\n\u0010\bJ\'\u0010\u0010\u001A\u00020\u00002\b\b\u0002\u0010\f\u001A\u00020\u00062\b\b\u0002\u0010\r\u001A\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001E\u0010\u0014\u001A\u00020\u00002\u0006\u0010\u0011\u001A\u00020\u0006H\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001E\u0010\u0016\u001A\u00020\u00002\u0006\u0010\u0011\u001A\u00020\u0006H\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0013J\u000F\u0010\u001A\u001A\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001E\u001A\u00020\u001BHÖ\u0001¢\u0006\u0004\b\u001C\u0010\u001DJ\u001A\u0010#\u001A\u00020 2\b\u0010\u001F\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001A\u0010\u0003\u001A\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b$\u0010%\u0012\u0004\b&\u0010\'R\u001A\u0010\f\u001A\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b)\u0010\'\u001A\u0004\b(\u0010\bR\u001A\u0010\r\u001A\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010\'\u001A\u0004\b*\u0010\b\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u000B\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u0006-"}, d2 = {"Landroidx/compose/ui/layout/ScaleFactor;", "", "", "packedValue", "constructor-impl", "(J)J", "", "component1-impl", "(J)F", "component1", "component2-impl", "component2", "scaleX", "scaleY", "copy-8GGzs04", "(JFF)J", "copy", "operand", "times-44nBxM0", "(JF)J", "times", "div-44nBxM0", "div", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "", "hashCode-impl", "(J)I", "hashCode", "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "a", "J", "getPackedValue$annotations", "()V", "getScaleX-impl", "getScaleX$annotations", "getScaleY-impl", "getScaleY$annotations", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@JvmInline
@SourceDebugExtension({"SMAP\nScaleFactor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactor\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,199:1\n42#2,7:200\n42#2,7:209\n72#3:207\n86#3:216\n22#4:208\n22#4:217\n*S KotlinDebug\n*F\n+ 1 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactor\n*L\n49#1:200,7\n63#1:209,7\n52#1:207\n66#1:216\n52#1:208\n66#1:217\n*E\n"})
public final class ScaleFactor {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R&\u0010\u0003\u001A\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001A\u0004\b\u0005\u0010\u0006\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Landroidx/compose/ui/layout/ScaleFactor$Companion;", "", "Landroidx/compose/ui/layout/ScaleFactor;", "Unspecified", "J", "getUnspecified-_hLwfpc", "()J", "getUnspecified-_hLwfpc$annotations", "()V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        // 去混淆评级： 低(20)
        public final long getUnspecified-_hLwfpc() [...] // 潜在的解密器

        @Stable
        public static void getUnspecified-_hLwfpc$annotations() {
        }
    }

    @NotNull
    public static final Companion Companion;
    public final long a;
    public static final long b;

    static {
        ScaleFactor.Companion = new Companion(null);
        ScaleFactor.b = 0x7FC000007FC00000L;
    }

    public ScaleFactor(long v) {
        this.a = v;
    }

    public static final long access$getUnspecified$cp() [...] // 潜在的解密器

    public static final ScaleFactor box-impl(long v) {
        return new ScaleFactor(v);
    }

    @Stable
    public static final float component1-impl(long v) {
        return ScaleFactor.getScaleX-impl(v);
    }

    @Stable
    public static final float component2-impl(long v) {
        return ScaleFactor.getScaleY-impl(v);
    }

    public static long constructor-impl(long v) [...] // Inlined contents

    public static final long copy-8GGzs04(long v, float f, float f1) {
        return ScaleFactorKt.ScaleFactor(f, f1);
    }

    public static long copy-8GGzs04$default(long v, float f, float f1, int v1, Object object0) {
        if((v1 & 1) != 0) {
            f = ScaleFactor.getScaleX-impl(v);
        }
        if((v1 & 2) != 0) {
            f1 = ScaleFactor.getScaleY-impl(v);
        }
        return ScaleFactor.copy-8GGzs04(v, f, f1);
    }

    @Stable
    public static final long div-44nBxM0(long v, float f) {
        return ScaleFactorKt.ScaleFactor(ScaleFactor.getScaleX-impl(v) / f, ScaleFactor.getScaleY-impl(v) / f);
    }

    @Override
    public boolean equals(Object object0) {
        return ScaleFactor.equals-impl(this.a, object0);
    }

    public static boolean equals-impl(long v, Object object0) {
        return object0 instanceof ScaleFactor ? v == ((ScaleFactor)object0).unbox-impl() : false;
    }

    public static final boolean equals-impl0(long v, long v1) {
        return v == v1;
    }

    @PublishedApi
    public static void getPackedValue$annotations() {
    }

    @Stable
    public static void getScaleX$annotations() {
    }

    public static final float getScaleX-impl(long v) {
        if(v == ScaleFactor.b) {
            InlineClassHelperKt.throwIllegalStateException("ScaleFactor is unspecified");
        }
        return Float.intBitsToFloat(((int)(v >> 0x20)));
    }

    @Stable
    public static void getScaleY$annotations() {
    }

    public static final float getScaleY-impl(long v) {
        if(v == 0x7FC000007FC00000L) {
            InlineClassHelperKt.throwIllegalStateException("ScaleFactor is unspecified");
        }
        return Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL)));
    }

    @Override
    public int hashCode() {
        return ScaleFactor.hashCode-impl(this.a);
    }

    public static int hashCode-impl(long v) {
        return Long.hashCode(v);
    }

    @Stable
    public static final long times-44nBxM0(long v, float f) {
        return ScaleFactorKt.ScaleFactor(ScaleFactor.getScaleX-impl(v) * f, ScaleFactor.getScaleY-impl(v) * f);
    }

    @Override
    @NotNull
    public String toString() {
        return ScaleFactor.toString-impl(this.a);
    }

    @NotNull
    public static String toString-impl(long v) {
        return "ScaleFactor(" + ScaleFactorKt.access$roundToTenths(ScaleFactor.getScaleX-impl(v)) + ", " + ScaleFactorKt.access$roundToTenths(ScaleFactor.getScaleY-impl(v)) + ')';
    }

    public final long unbox-impl() {
        return this.a;
    }
}

