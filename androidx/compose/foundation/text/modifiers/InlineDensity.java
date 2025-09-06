package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\b\n\u0002\u0010\t\n\u0000\b\u0081@\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0007¢\u0006\u0004\b\u0005\u0010\bJ\u000F\u0010\f\u001A\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\u0010\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0015\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0003\u001A\u00020\u00028F¢\u0006\u0006\u001A\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001A\u00020\u00028F¢\u0006\u0006\u001A\u0004\b\u0018\u0010\u0017\u0088\u0001\u001A\u0092\u0001\u00020\u001B¨\u0006\u001C"}, d2 = {"Landroidx/compose/foundation/text/modifiers/InlineDensity;", "", "", "density", "fontScale", "constructor-impl", "(FF)J", "Landroidx/compose/ui/unit/Density;", "(Landroidx/compose/ui/unit/Density;)J", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "", "hashCode-impl", "(J)I", "hashCode", "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "getDensity-impl", "(J)F", "getFontScale-impl", "Companion", "packedValue", "", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@JvmInline
@SourceDebugExtension({"SMAP\nInlineDensity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InlineDensity.kt\nandroidx/compose/foundation/text/modifiers/InlineDensity\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,50:1\n63#2,3:51\n72#2:54\n86#2:56\n22#3:55\n22#3:57\n*S KotlinDebug\n*F\n+ 1 InlineDensity.kt\nandroidx/compose/foundation/text/modifiers/InlineDensity\n*L\n32#1:51,3\n37#1:54\n40#1:56\n37#1:55\n40#1:57\n*E\n"})
public final class InlineDensity {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001D\u0010\u0003\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/text/modifiers/InlineDensity$Companion;", "", "Landroidx/compose/foundation/text/modifiers/InlineDensity;", "Unspecified", "J", "getUnspecified-L26CHvs", "()J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        // 去混淆评级： 低(20)
        public final long getUnspecified-L26CHvs() [...] // 潜在的解密器
    }

    @NotNull
    public static final Companion Companion;
    public final long a;
    public static final long b;

    static {
        InlineDensity.Companion = new Companion(null);
        InlineDensity.b = 0x7FC000007FC00000L;
    }

    public InlineDensity(long v) {
        this.a = v;
    }

    public static final long access$getUnspecified$cp() [...] // 潜在的解密器

    public static final InlineDensity box-impl(long v) {
        return new InlineDensity(v);
    }

    public static long constructor-impl(float f, float f1) [...] // 潜在的解密器

    public static long constructor-impl(@NotNull Density density0) {
        return InlineDensity.constructor-impl(density0.getDensity(), density0.getFontScale());
    }

    @Override
    public boolean equals(Object object0) {
        return InlineDensity.equals-impl(this.a, object0);
    }

    public static boolean equals-impl(long v, Object object0) {
        return object0 instanceof InlineDensity ? v == ((InlineDensity)object0).unbox-impl() : false;
    }

    public static final boolean equals-impl0(long v, long v1) {
        return v == v1;
    }

    public static final float getDensity-impl(long v) {
        return Float.intBitsToFloat(((int)(v >> 0x20)));
    }

    public static final float getFontScale-impl(long v) {
        return Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL)));
    }

    @Override
    public int hashCode() {
        return InlineDensity.hashCode-impl(this.a);
    }

    public static int hashCode-impl(long v) {
        return Long.hashCode(v);
    }

    @Override
    @NotNull
    public String toString() {
        return InlineDensity.toString-impl(this.a);
    }

    @NotNull
    public static String toString-impl(long v) {
        return "InlineDensity(density=" + InlineDensity.getDensity-impl(v) + ", fontScale=" + InlineDensity.getFontScale-impl(v) + ')';
    }

    public final long unbox-impl() {
        return this.a;
    }
}

