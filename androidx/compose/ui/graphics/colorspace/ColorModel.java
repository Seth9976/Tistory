package androidx.compose.ui.graphics.colorspace;

import androidx.annotation.IntRange;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Immutable
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\t\b\u0087@\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\t\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u001A\u0010\u0012\u001A\u00020\u000F2\b\u0010\u000E\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001A\u0010\u0016\u001A\u00020\n8GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0013\u0010\f\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/ColorModel;", "", "", "packedValue", "constructor-impl", "(J)J", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "", "hashCode-impl", "(J)I", "hashCode", "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "getComponentCount-impl", "getComponentCount$annotations", "()V", "componentCount", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@JvmInline
@SourceDebugExtension({"SMAP\nColorModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorModel.kt\nandroidx/compose/ui/graphics/colorspace/ColorModel\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,91:1\n107#2:92\n100#2:93\n100#2:94\n100#2:95\n100#2:96\n*S KotlinDebug\n*F\n+ 1 ColorModel.kt\nandroidx/compose/ui/graphics/colorspace/ColorModel\n*L\n49#1:92\n58#1:93\n65#1:94\n72#1:95\n80#1:96\n*E\n"})
public final class ColorModel {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000B\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001D\u0010\u0003\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u001D\u0010\u0007\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001A\u0004\b\b\u0010\u0006R\u001D\u0010\t\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0004\u001A\u0004\b\n\u0010\u0006R\u001D\u0010\u000B\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000B\u0010\u0004\u001A\u0004\b\f\u0010\u0006\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/ColorModel$Companion;", "", "Landroidx/compose/ui/graphics/colorspace/ColorModel;", "Rgb", "J", "getRgb-xdoWZVw", "()J", "Xyz", "getXyz-xdoWZVw", "Lab", "getLab-xdoWZVw", "Cmyk", "getCmyk-xdoWZVw", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        // 去混淆评级： 低(20)
        public final long getCmyk-xdoWZVw() {
            return 0x400000003L;
        }

        // 去混淆评级： 低(20)
        public final long getLab-xdoWZVw() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final long getRgb-xdoWZVw() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final long getXyz-xdoWZVw() [...] // 潜在的解密器
    }

    @NotNull
    public static final Companion Companion;
    public final long a;
    public static final long b;
    public static final long c;
    public static final long d;
    public static final long e;

    static {
        ColorModel.Companion = new Companion(null);
        ColorModel.b = 0x300000000L;
        ColorModel.c = 0x300000001L;
        ColorModel.d = 0x300000002L;
        ColorModel.e = 0x400000003L;
    }

    public ColorModel(long v) {
        this.a = v;
    }

    public static final long access$getCmyk$cp() [...] // 潜在的解密器

    public static final long access$getLab$cp() [...] // 潜在的解密器

    public static final long access$getRgb$cp() [...] // 潜在的解密器

    public static final long access$getXyz$cp() [...] // 潜在的解密器

    public static final ColorModel box-impl(long v) {
        return new ColorModel(v);
    }

    public static long constructor-impl(long v) [...] // Inlined contents

    @Override
    public boolean equals(Object object0) {
        return ColorModel.equals-impl(this.a, object0);
    }

    public static boolean equals-impl(long v, Object object0) {
        return object0 instanceof ColorModel ? v == ((ColorModel)object0).unbox-impl() : false;
    }

    public static final boolean equals-impl0(long v, long v1) {
        return v == v1;
    }

    @Stable
    public static void getComponentCount$annotations() {
    }

    @IntRange(from = 1L, to = 4L)
    public static final int getComponentCount-impl(long v) {
        return (int)(v >> 0x20);
    }

    @Override
    public int hashCode() {
        return ColorModel.hashCode-impl(this.a);
    }

    public static int hashCode-impl(long v) {
        return Long.hashCode(v);
    }

    @Override
    @NotNull
    public String toString() {
        return ColorModel.toString-impl(this.a);
    }

    @NotNull
    public static String toString-impl(long v) {
        if(ColorModel.equals-impl0(v, ColorModel.b)) {
            return "Rgb";
        }
        if(ColorModel.equals-impl0(v, ColorModel.c)) {
            return "Xyz";
        }
        if(ColorModel.equals-impl0(v, ColorModel.d)) {
            return "Lab";
        }
        return ColorModel.equals-impl0(v, ColorModel.e) ? "Cmyk" : "Unknown";
    }

    public final long unbox-impl() {
        return this.a;
    }
}

