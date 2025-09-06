package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaceKt;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.Rgb;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Immutable
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0014\b\u0087@\u0018\u0000 ;2\u00020\u0001:\u0001;B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0004\u0010\u0005J\u001B\u0010\n\u001A\u00020\u00002\u0006\u0010\u0007\u001A\u00020\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000E\u001A\u00020\u000BH\u0087\n\u00A2\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0010\u001A\u00020\u000BH\u0087\n\u00A2\u0006\u0004\b\u000F\u0010\rJ\u0010\u0010\u0012\u001A\u00020\u000BH\u0087\n\u00A2\u0006\u0004\b\u0011\u0010\rJ\u0010\u0010\u0014\u001A\u00020\u000BH\u0087\n\u00A2\u0006\u0004\b\u0013\u0010\rJ\u0010\u0010\u0017\u001A\u00020\u0006H\u0087\n\u00A2\u0006\u0004\b\u0015\u0010\u0016J=\u0010\u001E\u001A\u00020\u00002\b\b\u0002\u0010\u0018\u001A\u00020\u000B2\b\b\u0002\u0010\u0019\u001A\u00020\u000B2\b\b\u0002\u0010\u001A\u001A\u00020\u000B2\b\b\u0002\u0010\u001B\u001A\u00020\u000BH\u0007\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u000F\u0010\"\u001A\u00020\u001FH\u0016\u00A2\u0006\u0004\b \u0010!J\u0010\u0010&\u001A\u00020#H\u00D6\u0001\u00A2\u0006\u0004\b$\u0010%J\u001A\u0010+\u001A\u00020(2\b\u0010\'\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b)\u0010*R\u001D\u0010\u0003\u001A\u00020\u00028\u0006\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\b,\u0010-\u001A\u0004\b.\u0010/R\u001A\u0010\u0007\u001A\u00020\u00068FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b1\u00102\u001A\u0004\b0\u0010\u0016R\u001A\u0010\u0019\u001A\u00020\u000B8FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b4\u00102\u001A\u0004\b3\u0010\rR\u001A\u0010\u001A\u001A\u00020\u000B8FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b6\u00102\u001A\u0004\b5\u0010\rR\u001A\u0010\u001B\u001A\u00020\u000B8FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b8\u00102\u001A\u0004\b7\u0010\rR\u001A\u0010\u0018\u001A\u00020\u000B8FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b:\u00102\u001A\u0004\b9\u0010\r\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u000B\n\u0002\b!\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006<"}, d2 = {"Landroidx/compose/ui/graphics/Color;", "", "Lkotlin/ULong;", "value", "constructor-impl", "(J)J", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "colorSpace", "convert-vNxB06k", "(JLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "convert", "", "component1-impl", "(J)F", "component1", "component2-impl", "component2", "component3-impl", "component3", "component4-impl", "component4", "component5-impl", "(J)Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "component5", "alpha", "red", "green", "blue", "copy-wmQWz5c", "(JFFFF)J", "copy", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "", "hashCode-impl", "(J)I", "hashCode", "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "a", "J", "getValue-s-VKNKU", "()J", "getColorSpace-impl", "getColorSpace$annotations", "()V", "getRed-impl", "getRed$annotations", "getGreen-impl", "getGreen$annotations", "getBlue-impl", "getBlue$annotations", "getAlpha-impl", "getAlpha$annotations", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@JvmInline
@SourceDebugExtension({"SMAP\nColor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/Color\n+ 2 ColorSpaces.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpaces\n+ 3 Float16.kt\nandroidx/compose/ui/graphics/Float16Kt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,723:1\n322#2:724\n649#3,12:725\n661#3,17:738\n649#3,12:755\n661#3,17:768\n649#3,12:785\n661#3,17:798\n22#4:737\n22#4:767\n22#4:797\n*S KotlinDebug\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/Color\n*L\n128#1:724\n164#1:725,12\n164#1:738,17\n186#1:755,12\n186#1:768,17\n208#1:785,12\n208#1:798,17\n164#1:737\n186#1:767\n208#1:797\n*E\n"})
public final class Color {
    @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b1\b\u0086\u0003\u0018\u00002\u00020\u0001J?\u0010\f\u001A\u00020\t2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\b\u001A\u00020\u0007\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\n\u0010\u000BJ?\u0010\u000F\u001A\u00020\t2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u00022\u0006\u0010\r\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\b\u001A\u00020\u0007\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u000E\u0010\u000BR&\u0010\u0010\u001A\u00020\t8\u0006X\u0087\u0004\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0012\u0010\u0013R&\u0010\u0016\u001A\u00020\t8\u0006X\u0087\u0004\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u0012\u0004\b\u0018\u0010\u0015\u001A\u0004\b\u0017\u0010\u0013R&\u0010\u0019\u001A\u00020\t8\u0006X\u0087\u0004\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0012\n\u0004\b\u0019\u0010\u0011\u0012\u0004\b\u001B\u0010\u0015\u001A\u0004\b\u001A\u0010\u0013R&\u0010\u001C\u001A\u00020\t8\u0006X\u0087\u0004\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0012\n\u0004\b\u001C\u0010\u0011\u0012\u0004\b\u001E\u0010\u0015\u001A\u0004\b\u001D\u0010\u0013R&\u0010\u001F\u001A\u00020\t8\u0006X\u0087\u0004\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0012\n\u0004\b\u001F\u0010\u0011\u0012\u0004\b!\u0010\u0015\u001A\u0004\b \u0010\u0013R&\u0010\"\u001A\u00020\t8\u0006X\u0087\u0004\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0012\n\u0004\b\"\u0010\u0011\u0012\u0004\b$\u0010\u0015\u001A\u0004\b#\u0010\u0013R&\u0010%\u001A\u00020\t8\u0006X\u0087\u0004\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0012\n\u0004\b%\u0010\u0011\u0012\u0004\b\'\u0010\u0015\u001A\u0004\b&\u0010\u0013R&\u0010(\u001A\u00020\t8\u0006X\u0087\u0004\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0012\n\u0004\b(\u0010\u0011\u0012\u0004\b*\u0010\u0015\u001A\u0004\b)\u0010\u0013R&\u0010+\u001A\u00020\t8\u0006X\u0087\u0004\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0012\n\u0004\b+\u0010\u0011\u0012\u0004\b-\u0010\u0015\u001A\u0004\b,\u0010\u0013R&\u0010.\u001A\u00020\t8\u0006X\u0087\u0004\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0012\n\u0004\b.\u0010\u0011\u0012\u0004\b0\u0010\u0015\u001A\u0004\b/\u0010\u0013R&\u00101\u001A\u00020\t8\u0006X\u0087\u0004\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0012\n\u0004\b1\u0010\u0011\u0012\u0004\b3\u0010\u0015\u001A\u0004\b2\u0010\u0013R&\u00104\u001A\u00020\t8\u0006X\u0087\u0004\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0012\n\u0004\b4\u0010\u0011\u0012\u0004\b6\u0010\u0015\u001A\u0004\b5\u0010\u0013R&\u00107\u001A\u00020\t8\u0006X\u0087\u0004\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0012\n\u0004\b7\u0010\u0011\u0012\u0004\b9\u0010\u0015\u001A\u0004\b8\u0010\u0013\u0082\u0002\u000B\n\u0002\b!\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006:"}, d2 = {"Landroidx/compose/ui/graphics/Color$Companion;", "", "", "hue", "saturation", "value", "alpha", "Landroidx/compose/ui/graphics/colorspace/Rgb;", "colorSpace", "Landroidx/compose/ui/graphics/Color;", "hsv-JlNiLsg", "(FFFFLandroidx/compose/ui/graphics/colorspace/Rgb;)J", "hsv", "lightness", "hsl-JlNiLsg", "hsl", "Black", "J", "getBlack-0d7_KjU", "()J", "getBlack-0d7_KjU$annotations", "()V", "DarkGray", "getDarkGray-0d7_KjU", "getDarkGray-0d7_KjU$annotations", "Gray", "getGray-0d7_KjU", "getGray-0d7_KjU$annotations", "LightGray", "getLightGray-0d7_KjU", "getLightGray-0d7_KjU$annotations", "White", "getWhite-0d7_KjU", "getWhite-0d7_KjU$annotations", "Red", "getRed-0d7_KjU", "getRed-0d7_KjU$annotations", "Green", "getGreen-0d7_KjU", "getGreen-0d7_KjU$annotations", "Blue", "getBlue-0d7_KjU", "getBlue-0d7_KjU$annotations", "Yellow", "getYellow-0d7_KjU", "getYellow-0d7_KjU$annotations", "Cyan", "getCyan-0d7_KjU", "getCyan-0d7_KjU$annotations", "Magenta", "getMagenta-0d7_KjU", "getMagenta-0d7_KjU$annotations", "Transparent", "getTransparent-0d7_KjU", "getTransparent-0d7_KjU$annotations", "Unspecified", "getUnspecified-0d7_KjU", "getUnspecified-0d7_KjU$annotations", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nColor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/Color$Companion\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/graphics/InlineClassHelperKt\n*L\n1#1,723:1\n33#2,7:724\n33#2,7:731\n*S KotlinDebug\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/Color$Companion\n*L\n349#1:724,7\n384#1:731,7\n*E\n"})
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public static float a(float f, float f1, float f2, int v) {
            float f3 = (f / 30.0f + ((float)v)) % 12.0f;
            return f2 - Math.max(-1.0f, Math.min(f3 - 3.0f, Math.min(9.0f - f3, 1.0f))) * (Math.min(f2, 1.0f - f2) * f1);
        }

        public static float b(float f, float f1, float f2, int v) {
            float f3 = (f / 60.0f + ((float)v)) % 6.0f;
            return f2 - Math.max(0.0f, Math.min(f3, Math.min(4.0f - f3, 1.0f))) * (f1 * f2);
        }

        // 去混淆评级： 低(20)
        public final long getBlack-0d7_KjU() [...] // 潜在的解密器

        @Stable
        public static void getBlack-0d7_KjU$annotations() {
        }

        // 去混淆评级： 低(20)
        public final long getBlue-0d7_KjU() [...] // 潜在的解密器

        @Stable
        public static void getBlue-0d7_KjU$annotations() {
        }

        public final long getCyan-0d7_KjU() {
            return Color.k;
        }

        @Stable
        public static void getCyan-0d7_KjU$annotations() {
        }

        public final long getDarkGray-0d7_KjU() {
            return Color.c;
        }

        @Stable
        public static void getDarkGray-0d7_KjU$annotations() {
        }

        // 去混淆评级： 低(20)
        public final long getGray-0d7_KjU() [...] // 潜在的解密器

        @Stable
        public static void getGray-0d7_KjU$annotations() {
        }

        public final long getGreen-0d7_KjU() {
            return Color.h;
        }

        @Stable
        public static void getGreen-0d7_KjU$annotations() {
        }

        public final long getLightGray-0d7_KjU() [...] // 潜在的解密器

        @Stable
        public static void getLightGray-0d7_KjU$annotations() {
        }

        public final long getMagenta-0d7_KjU() {
            return Color.l;
        }

        @Stable
        public static void getMagenta-0d7_KjU$annotations() {
        }

        public final long getRed-0d7_KjU() [...] // 潜在的解密器

        @Stable
        public static void getRed-0d7_KjU$annotations() {
        }

        public final long getTransparent-0d7_KjU() [...] // 潜在的解密器

        @Stable
        public static void getTransparent-0d7_KjU$annotations() {
        }

        public final long getUnspecified-0d7_KjU() [...] // 潜在的解密器

        @Stable
        public static void getUnspecified-0d7_KjU$annotations() {
        }

        public final long getWhite-0d7_KjU() [...] // 潜在的解密器

        @Stable
        public static void getWhite-0d7_KjU$annotations() {
        }

        public final long getYellow-0d7_KjU() {
            return Color.j;
        }

        @Stable
        public static void getYellow-0d7_KjU$annotations() {
        }

        public final long hsl-JlNiLsg(float f, float f1, float f2, float f3, @NotNull Rgb rgb0) {
            if(0.0f > f || f > 360.0f || 0.0f > f1 || f1 > 1.0f || 0.0f > f2 || f2 > 1.0f) {
                InlineClassHelperKt.throwIllegalArgumentException(("HSL (" + f + ", " + f1 + ", " + f2 + ") must be in range (0..360, 0..1, 0..1)"));
            }
            return ColorKt.Color(Companion.a(f, f1, f2, 0), Companion.a(f, f1, f2, 8), Companion.a(f, f1, f2, 4), f3, rgb0);
        }

        public static long hsl-JlNiLsg$default(Companion color$Companion0, float f, float f1, float f2, float f3, Rgb rgb0, int v, Object object0) {
            if((v & 8) != 0) {
                f3 = 1.0f;
            }
            if((v & 16) != 0) {
                rgb0 = ColorSpaces.INSTANCE.getSrgb();
            }
            return color$Companion0.hsl-JlNiLsg(f, f1, f2, f3, rgb0);
        }

        public final long hsv-JlNiLsg(float f, float f1, float f2, float f3, @NotNull Rgb rgb0) {
            if(0.0f > f || f > 360.0f || 0.0f > f1 || f1 > 1.0f || 0.0f > f2 || f2 > 1.0f) {
                InlineClassHelperKt.throwIllegalArgumentException(("HSV (" + f + ", " + f1 + ", " + f2 + ") must be in range (0..360, 0..1, 0..1)"));
            }
            return ColorKt.Color(Companion.b(f, f1, f2, 5), Companion.b(f, f1, f2, 3), Companion.b(f, f1, f2, 1), f3, rgb0);
        }

        public static long hsv-JlNiLsg$default(Companion color$Companion0, float f, float f1, float f2, float f3, Rgb rgb0, int v, Object object0) {
            if((v & 8) != 0) {
                f3 = 1.0f;
            }
            if((v & 16) != 0) {
                rgb0 = ColorSpaces.INSTANCE.getSrgb();
            }
            return color$Companion0.hsv-JlNiLsg(f, f1, f2, f3, rgb0);
        }
    }

    @NotNull
    public static final Companion Companion;
    public final long a;
    public static final long b;
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;
    public static final long h;
    public static final long i;
    public static final long j;
    public static final long k;
    public static final long l;
    public static final long m;
    public static final long n;

    static {
        Color.Companion = new Companion(null);
        Color.b = 0xFF00000000000000L;
        Color.c = 0xFF44444400000000L;
        Color.d = 0xFF88888800000000L;
        Color.e = 0xFFCCCCCC00000000L;
        Color.f = 0xFFFFFFFF00000000L;
        Color.g = 0xFFFF000000000000L;
        Color.h = 0xFF00FF0000000000L;
        Color.i = 0xFF0000FF00000000L;
        Color.j = 0xFFFFFF0000000000L;
        Color.k = 0xFF00FFFF00000000L;
        Color.l = 0xFFFF00FF00000000L;
        Color.m = 0L;
        Color.n = ColorKt.Color(0.0f, 0.0f, 0.0f, 0.0f, ColorSpaces.INSTANCE.getUnspecified$ui_graphics_release());
    }

    public Color(long v) {
        this.a = v;
    }

    public static final long access$getBlack$cp() [...] // 潜在的解密器

    public static final long access$getBlue$cp() [...] // 潜在的解密器

    public static final long access$getGray$cp() [...] // 潜在的解密器

    public static final long access$getTransparent$cp() {
        return 0L;
    }

    public static final long access$getUnspecified$cp() {
        return 0L;
    }

    public static final long access$getWhite$cp() {
        return 0xFFFFFFFF00000000L;
    }

    public static final Color box-impl(long v) {
        return new Color(v);
    }

    @Stable
    public static final float component1-impl(long v) {
        return Color.getRed-impl(v);
    }

    @Stable
    public static final float component2-impl(long v) {
        return Color.getGreen-impl(v);
    }

    @Stable
    public static final float component3-impl(long v) {
        return Color.getBlue-impl(v);
    }

    @Stable
    public static final float component4-impl(long v) {
        return Color.getAlpha-impl(v);
    }

    @Stable
    @NotNull
    public static final ColorSpace component5-impl(long v) {
        return Color.getColorSpace-impl(v);
    }

    public static long constructor-impl(long v) [...] // Inlined contents

    public static final long convert-vNxB06k(long v, @NotNull ColorSpace colorSpace0) {
        return ColorSpaceKt.connect-YBCOT_4$default(Color.getColorSpace-impl(v), colorSpace0, 0, 2, null).transformToColor-l2rxGTc$ui_graphics_release(v);
    }

    @Stable
    public static final long copy-wmQWz5c(long v, float f, float f1, float f2, float f3) {
        return ColorKt.Color(f1, f2, f3, f, Color.getColorSpace-impl(v));
    }

    public static long copy-wmQWz5c$default(long v, float f, float f1, float f2, float f3, int v1, Object object0) {
        if((v1 & 1) != 0) {
            f = Color.getAlpha-impl(v);
        }
        if((v1 & 2) != 0) {
            f1 = Color.getRed-impl(v);
        }
        if((v1 & 4) != 0) {
            f2 = Color.getGreen-impl(v);
        }
        if((v1 & 8) != 0) {
            f3 = Color.getBlue-impl(v);
        }
        return Color.copy-wmQWz5c(v, f, f1, f2, f3);
    }

    @Override
    public boolean equals(Object object0) {
        return Color.equals-impl(this.a, object0);
    }

    public static boolean equals-impl(long v, Object object0) {
        return object0 instanceof Color ? v == ((Color)object0).unbox-impl() : false;
    }

    public static final boolean equals-impl0(long v, long v1) {
        return ULong.equals-impl0(v, v1);
    }

    @Stable
    public static void getAlpha$annotations() {
    }

    public static final float getAlpha-impl(long v) {
        return (0x3FL & v) == 0L ? ((float)(((double)((v >>> 56 & 0xFFL) >>> 11)) * 2048.0 + ((double)(v >>> 56 & 0xFFL)))) / 255.0f : ((float)(((double)((v >>> 6 & 0x3FFL) >>> 11)) * 2048.0 + ((double)(v >>> 6 & 0x3FFL)))) / 1023.0f;
    }

    @Stable
    public static void getBlue$annotations() {
    }

    public static final float getBlue-impl(long v) {
        if((0x3FL & v) == 0L) {
            return ((float)(((double)((v >>> 0x20 & 0xFFL) >>> 11)) * 2048.0 + ((double)(v >>> 0x20 & 0xFFL)))) / 255.0f;
        }
        int v1 = (short)(((int)(v >>> 16 & 0xFFFFL)));
        int v2 = (0xFFFF & v1) >>> 10 & 0x1F;
        if(v2 == 0) {
            if((v1 & 0x3FF) != 0) {
                float f = Float.intBitsToFloat((v1 & 0x3FF) + 0x3F000000) - 0.5f;
                return (0x8000 & v1) == 0 ? f : -f;
            }
            return Float.intBitsToFloat((0x8000 & v1) << 16);
        }
        int v3 = (v1 & 0x3FF) << 13;
        if(v2 == 0x1F) {
            if(v3 != 0) {
                v3 |= 0x400000;
            }
            return Float.intBitsToFloat(0x7F800000 | (0x8000 & v1) << 16 | v3);
        }
        return Float.intBitsToFloat(v2 + 0x70 << 23 | (0x8000 & v1) << 16 | v3);
    }

    @Stable
    public static void getColorSpace$annotations() {
    }

    @NotNull
    public static final ColorSpace getColorSpace-impl(long v) {
        return ColorSpaces.INSTANCE.getColorSpacesArray$ui_graphics_release()[((int)(v & 0x3FL))];
    }

    @Stable
    public static void getGreen$annotations() {
    }

    public static final float getGreen-impl(long v) {
        if((0x3FL & v) == 0L) {
            return ((float)(((double)((v >>> 40 & 0xFFL) >>> 11)) * 2048.0 + ((double)(v >>> 40 & 0xFFL)))) / 255.0f;
        }
        int v1 = (short)(((int)(v >>> 0x20 & 0xFFFFL)));
        int v2 = (0xFFFF & v1) >>> 10 & 0x1F;
        if(v2 == 0) {
            if((v1 & 0x3FF) != 0) {
                float f = Float.intBitsToFloat((v1 & 0x3FF) + 0x3F000000) - 0.5f;
                return (0x8000 & v1) == 0 ? f : -f;
            }
            return Float.intBitsToFloat((0x8000 & v1) << 16);
        }
        int v3 = (v1 & 0x3FF) << 13;
        if(v2 == 0x1F) {
            if(v3 != 0) {
                v3 |= 0x400000;
            }
            return Float.intBitsToFloat(0x7F800000 | (0x8000 & v1) << 16 | v3);
        }
        return Float.intBitsToFloat(v2 + 0x70 << 23 | (0x8000 & v1) << 16 | v3);
    }

    @Stable
    public static void getRed$annotations() {
    }

    public static final float getRed-impl(long v) {
        if(Long.compare(0x3FL & v, 0L) == 0) {
            return ((float)(((double)((v >>> 0x30 & 0xFFL) >>> 11)) * 2048.0 + ((double)(v >>> 0x30 & 0xFFL)))) / 255.0f;
        }
        int v1 = (short)(((int)(v >>> 0x30 & 0xFFFFL)));
        int v2 = (0xFFFF & v1) >>> 10 & 0x1F;
        if(v2 == 0) {
            if((v1 & 0x3FF) != 0) {
                float f = Float.intBitsToFloat((v1 & 0x3FF) + 0x3F000000) - 0.5f;
                return (0x8000 & v1) == 0 ? f : -f;
            }
            return Float.intBitsToFloat((0x8000 & v1) << 16);
        }
        int v3 = (v1 & 0x3FF) << 13;
        if(v2 == 0x1F) {
            if(v3 != 0) {
                v3 |= 0x400000;
            }
            return Float.intBitsToFloat(0x7F800000 | (0x8000 & v1) << 16 | v3);
        }
        return Float.intBitsToFloat(v2 + 0x70 << 23 | (0x8000 & v1) << 16 | v3);
    }

    public final long getValue-s-VKNKU() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return Color.hashCode-impl(this.a);
    }

    public static int hashCode-impl(long v) {
        return ULong.hashCode-impl(v);
    }

    @Override
    @NotNull
    public String toString() {
        return Color.toString-impl(this.a);
    }

    @NotNull
    public static String toString-impl(long v) {
        return "Color(" + Color.getRed-impl(v) + ", " + Color.getGreen-impl(v) + ", " + Color.getBlue-impl(v) + ", " + Color.getAlpha-impl(v) + ", " + Color.getColorSpace-impl(v).getName() + ')';
    }

    public final long unbox-impl() {
        return this.a;
    }
}

