package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Immutable
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\n\b\u0081@\u0018\u0000  2\u00020\u0001:\u0001 B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\t\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u001A\u0010\u0012\u001A\u00020\u000F2\b\u0010\u000E\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016R\u001A\u0010\u001C\u001A\u00020\u00178FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u0018\u0010\u0019R\u001A\u0010\u001F\u001A\u00020\u00178FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001E\u0010\u001B\u001A\u0004\b\u001D\u0010\u0019\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006!"}, d2 = {"Landroidx/compose/material3/SliderRange;", "", "", "packedValue", "constructor-impl", "(J)J", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "", "hashCode-impl", "(J)I", "hashCode", "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "a", "J", "getPackedValue", "()J", "", "getStart-impl", "(J)F", "getStart$annotations", "()V", "start", "getEndInclusive-impl", "getEndInclusive$annotations", "endInclusive", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@JvmInline
@SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderRange\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,2263:1\n1#2:2264\n72#3:2265\n86#3:2267\n22#4:2266\n22#4:2268\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderRange\n*L\n2195#1:2265\n2204#1:2267\n2195#1:2266\n2204#1:2268\n*E\n"})
public final class SliderRange {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R&\u0010\u0003\u001A\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001A\u0004\b\u0005\u0010\u0006\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Landroidx/compose/material3/SliderRange$Companion;", "", "Landroidx/compose/material3/SliderRange;", "Unspecified", "J", "getUnspecified-FYbKRX4", "()J", "getUnspecified-FYbKRX4$annotations", "()V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final long getUnspecified-FYbKRX4() [...] // 潜在的解密器

        @Stable
        public static void getUnspecified-FYbKRX4$annotations() {
        }
    }

    @NotNull
    public static final Companion Companion;
    public final long a;
    public static final long b;

    static {
        SliderRange.Companion = new Companion(null);
        SliderRange.b = SliderKt.SliderRange(NaNf, NaNf);
    }

    public SliderRange(long v) {
        this.a = v;
    }

    public static final SliderRange box-impl(long v) {
        return new SliderRange(v);
    }

    public static long constructor-impl(long v) [...] // Inlined contents

    @Override
    public boolean equals(Object object0) {
        return SliderRange.equals-impl(this.a, object0);
    }

    public static boolean equals-impl(long v, Object object0) {
        return object0 instanceof SliderRange ? v == ((SliderRange)object0).unbox-impl() : false;
    }

    public static final boolean equals-impl0(long v, long v1) {
        return v == v1;
    }

    @Stable
    public static void getEndInclusive$annotations() {
    }

    public static final float getEndInclusive-impl(long v) {
        if(v == SliderRange.b) {
            throw new IllegalStateException("SliderRange is unspecified");
        }
        return Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL)));
    }

    public final long getPackedValue() {
        return this.a;
    }

    @Stable
    public static void getStart$annotations() {
    }

    public static final float getStart-impl(long v) {
        if(v == SliderRange.b) {
            throw new IllegalStateException("SliderRange is unspecified");
        }
        return Float.intBitsToFloat(((int)(v >> 0x20)));
    }

    @Override
    public int hashCode() {
        return SliderRange.hashCode-impl(this.a);
    }

    public static int hashCode-impl(long v) {
        return Long.hashCode(v);
    }

    @Override
    @NotNull
    public String toString() {
        return SliderRange.toString-impl(this.a);
    }

    // 去混淆评级： 低(20)
    @NotNull
    public static String toString-impl(long v) {
        return SliderKt.isSpecified-If1S1O4(v) ? SliderRange.getStart-impl(v) + ".." + SliderRange.getEndInclusive-impl(v) : "FloatRange.Unspecified";
    }

    public final long unbox-impl() {
        return this.a;
    }
}

